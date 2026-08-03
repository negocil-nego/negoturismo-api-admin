package com.negocil.negoturismo.admin.shared.security.dto.response;

import java.time.Instant;

public record TokenResponse(String token, Instant expiredAt) { }
