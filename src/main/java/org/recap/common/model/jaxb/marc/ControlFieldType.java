package org.recap.common.model.jaxb.marc;

import lombok.Data;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;


/**
 * MARC21 Fields 001-009
 * <p/>
 * <p>Java class for controlFieldType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="controlFieldType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;>controlDataType">
 *       &lt;attribute name="id" type="{}idDataType" />
 *       &lt;attribute name="tag" use="required" type="{}controltagDataType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "controlFieldType", propOrder = {
        "value"
})
public class ControlFieldType implements Serializable {

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
     * The Tag.
     */
    @XmlAttribute(name = "tag", required = true)
    protected String tag;

}
