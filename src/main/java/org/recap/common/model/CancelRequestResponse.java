package org.recap.common.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CancelRequestResponse {
    private String screenMessage;
    private boolean success;
}
