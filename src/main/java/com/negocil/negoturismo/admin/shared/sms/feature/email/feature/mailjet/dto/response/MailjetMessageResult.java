package com.negocil.negoturismo.admin.shared.sms.feature.email.feature.mailjet.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record MailjetMessageResult(
        @JsonProperty("Status") String status,
        @JsonProperty("To") List<MailjetRecipientResult> to
) {}
