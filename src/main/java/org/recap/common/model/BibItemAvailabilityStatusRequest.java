package org.recap.common.model;

import lombok.Data;

@Data
public class BibItemAvailabilityStatusRequest {
    private String bibliographicId;
    private String institutionId;
}