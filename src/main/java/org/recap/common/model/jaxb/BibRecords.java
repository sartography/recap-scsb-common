package org.recap.common.model.jaxb;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement
public class BibRecords implements Serializable {
    @XmlElement(name = "bibRecord")
    private List<BibRecord> bibRecords;
}
