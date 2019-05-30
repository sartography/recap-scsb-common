package org.recap.common.model.jaxb;

import lombok.Data;
import org.recap.common.model.jaxb.marc.ContentType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created by pvsubrah on 6/21/16.
 */
@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Bib implements Serializable {
    /**
     * The Content.
     */
    @XmlElement(required = true, nillable = true)
    protected ContentType content;
    /**
     * The Matching institution bib id.
     */
    @XmlElement
    protected List<MatchingInstitutionBibIdType> matchingInstitutionBibId;
    @XmlElement
    private String owningInstitutionId;
    @XmlElement
    private String owningInstitutionBibId;
}
