package org.recap.common.model.jaxb.marc;

import lombok.Data;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;


/**
 * <p>Java class for subfieldatafieldType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="subfieldatafieldType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;>subfieldDataType">
 *       &lt;attribute name="id" type="{}idDataType" />
 *       &lt;attribute name="code" use="required" type="{}subfieldcodeDataType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subfieldatafieldType", propOrder = {
        "value"
})
public class SubfieldatafieldType implements Serializable {

    /**
     * The Value.
     */
    @XmlValue
    protected String value;
    /**
     * The Id.
     */
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    /**
     * The Code.
     */
    @XmlAttribute(name = "code", required = true)
    protected String code;

}
