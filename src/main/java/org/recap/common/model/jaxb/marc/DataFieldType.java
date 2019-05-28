package org.recap.common.model.jaxb.marc;

import lombok.Data;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.util.List;


/**
 * MARC21 Variable Data Fields 010-999
 * <p/>
 * <p>Java class for dataFieldType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="dataFieldType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="subfield" type="{}subfieldatafieldType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{}idDataType" />
 *       &lt;attribute name="tag" use="required" type="{}tagDataType" />
 *       &lt;attribute name="ind1" use="required" type="{}indicatorDataType" />
 *       &lt;attribute name="ind2" use="required" type="{}indicatorDataType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataFieldType", propOrder = {
        "subfield"
})
public class DataFieldType implements Serializable {

    /**
     * The Subfield.
     */
    @XmlElement(required = true)
    protected List<SubfieldatafieldType> subfield;
    /**
     * The Id.
     */
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    /**
     * The Ind 1.
     */
    @XmlAttribute(name = "ind1", required = true)
    protected String ind1;
    /**
     * The Ind 2.
     */
    @XmlAttribute(name = "ind2", required = true)
    protected String ind2;
    /**
     * The Tag.
     */
    @XmlAttribute(name = "tag", required = true)
    protected String tag;

}
