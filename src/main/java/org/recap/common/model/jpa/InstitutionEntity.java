package org.recap.common.model.jpa;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "institution_t", schema = "recap")
public class InstitutionEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "INSTITUTION_ID")
    private Integer institutionId;

    @Column(name = "INSTITUTION_CODE")
    private String institutionCode;

    @Column(name = "INSTITUTION_NAME")
    private String institutionName;
}
