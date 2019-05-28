package org.recap.common.model.jaxb;

import lombok.Data;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.util.Map;

/**
 * Created by pvsubrah on 6/21/16.
 */
@Data
public class JAXBContextHandler {

    private static JAXBContextHandler jaxbContextHandler;

    private Map<String, JAXBContext> contextMap;

    private JAXBContextHandler() {
    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static JAXBContextHandler getInstance() {
        if (null == jaxbContextHandler) {
            jaxbContextHandler = new JAXBContextHandler();
        }

        return jaxbContextHandler;
    }

    /**
     * Gets jaxb context for class.
     *
     * @param cl the cl
     * @return the jaxb context for class
     * @throws JAXBException the jaxb exception
     */
    public JAXBContext getJAXBContextForClass(Class cl) throws JAXBException {
        if (getContextMap().containsKey(cl.getName())) {
            return getContextMap().get(cl.getName());
        } else {
            JAXBContext newInstance = JAXBContext.newInstance(cl);
            getContextMap().put(cl.getName(), newInstance);
        }

        return getContextMap().get(cl.getName());
    }

}
