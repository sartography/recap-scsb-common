package org.recap.common.model.jaxb.marc;

import lombok.Data;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;


/**
 * MARC21 Leader, 24 bytes
 * <p/>
 * <p>Java class for leaderFieldType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="leaderFieldType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;>leaderDataType">
 *       &lt;attribute name="id" type="{}idDataType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "leaderFieldType", propOrder = {
        "value"
})
public class LeaderFieldType implements Serializable {

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

}
