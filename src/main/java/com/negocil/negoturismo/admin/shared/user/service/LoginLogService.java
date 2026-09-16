package com.negocil.negoturismo.admin.shared.user.service;

import com.negocil.negoturismo.admin.shared.core.util.UserAgentParser;
import com.negocil.negoturismo.admin.shared.user.enums.LoginLogStatus;
import com.negocil.negoturismo.admin.shared.user.model.LoginLog;
import com.negocil.negoturismo.admin.shared.user.model.User;
import com.negocil.negoturismo.admin.shared.user.repository.LoginLogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class LoginLogService {
    private final LoginLogRepository repository;

    @Async("taskExecutor")
    @Transactional
    public void success(User user, String emailAttempted, String ipAddress, String userAgent) {
        save(LoginLogStatus.SUCCESS, user, emailAttempted, null, ipAddress, userAgent);
    }

    @Async("taskExecutor")
    @Transactional
    public void failed(String emailAttempted, String failureReason, String ipAddress, String userAgent) {
        save(LoginLogStatus.FAILED, null, emailAttempted, failureReason, ipAddress, userAgent);
    }

    @Async("taskExecutor")
    @Transactional
    public void blocked(User user, String emailAttempted, String ipAddress, String userAgent) {
        save(LoginLogStatus.BLOCKED, user, emailAttempted, "BLOCKED", ipAddress, userAgent);
    }

    private void save(LoginLogStatus status, User user, String emailAttempted, String failureReason,
                      String ipAddress, String userAgent) {
        var device = UserAgentParser.parse(userAgent);
        repository.save(LoginLog.builder()
                .user(user)
                .emailAttempted(emailAttempted)
                .status(status)
                .failureReason(failureReason)
                .ipAddress(ipAddress)
                .userAgent(userAgent)
                .deviceType(device.deviceType())
                .browser(device.browser())
                .operatingSystem(device.operatingSystem())
                .build());
    }
}
