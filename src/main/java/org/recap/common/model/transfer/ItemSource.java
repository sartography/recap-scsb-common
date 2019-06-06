package org.recap.common.model.transfer;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class ItemSource extends Source {
    private String owningInstitutionItemId;
}
