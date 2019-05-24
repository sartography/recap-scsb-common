package org.recap.common.spring;

import org.junit.Test;
import org.recap.BaseTestCase;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class PropertyValueProviderUT extends BaseTestCase{

    @Autowired
    PropertyValueProvider propertyValueProvider;

    @Test
    public void testGetProperty(){
        String key = propertyValueProvider.getProperty("key");
        assertNull(key);
    }

}