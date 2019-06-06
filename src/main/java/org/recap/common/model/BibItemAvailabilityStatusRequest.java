package org.recap.common.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BibItemAvailabilityStatusRequest {
    private String bibliographicId;
    private String institutionId;
}