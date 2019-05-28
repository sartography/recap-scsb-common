package org.recap.common.model.jaxb;

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created by pvsubrah on 6/21/16.
 */
@Data
@XmlRootElement
public class BibRecord implements Serializable {

    @XmlElement
    private Bib bib;
    @XmlElement
    private List<Holdings> holdings;

}
