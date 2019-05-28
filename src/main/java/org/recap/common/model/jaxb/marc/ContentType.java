package org.recap.common.model.jaxb.marc;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

/**
 * Created by SheikS on 6/22/2016.
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "content", propOrder = {
        "collection"
})

@XmlRootElement(name = "content")
public class ContentType implements Serializable {
    /**
     * The Collection.
     */
    @XmlElement(required = true, nillable = true)
    protected CollectionType collection;

}
