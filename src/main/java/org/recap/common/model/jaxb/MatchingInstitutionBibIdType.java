package org.recap.common.model.jaxb;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * <p>Java class for matchingInstitutionBibIdType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="matchingInstitutionBibIdType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "matchingInstitutionBibIdType", propOrder = {
        "value"
})
public class MatchingInstitutionBibIdType implements Serializable {

    /**
     * The Value.
     */
    @XmlValue
    protected String value;
    /**
     * The Source.
     */
    @XmlAttribute(name = "source")
    protected String source;

}
