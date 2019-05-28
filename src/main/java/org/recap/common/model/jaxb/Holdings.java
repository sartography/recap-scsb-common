package org.recap.common.model.jaxb;

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created by pvsubrah on 6/21/16.
 */
@Data
public class Holdings implements Serializable {
    @XmlElement
    private List<Holding> holding;

}
