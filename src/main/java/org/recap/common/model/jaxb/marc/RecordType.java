package org.recap.common.model.jaxb.marc;

import lombok.Data;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.util.List;


/**
 * <p>Java class for recordType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="recordType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="leader" type="{}leaderFieldType"/>
 *         &lt;element name="controlfield" type="{}controlFieldType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="datafield" type="{}dataFieldType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" type="{}recordTypeType" />
 *       &lt;attribute name="id" type="{}idDataType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recordType", propOrder = {
        "leader",
        "controlfield",
        "datafield"
})
public class RecordType implements Serializable {

    /**
     * The Leader.
     */
    protected LeaderFieldType leader;
    /**
     * The Controlfield.
     */
    protected List<ControlFieldType> controlfield;
    /**
     * The Datafield.
     */
    protected List<DataFieldType> datafield;
    /**
     * The Type.
     */
    @XmlAttribute(name = "type")
    protected RecordTypeType type;
    /**
     * The Id.
     */
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

}
