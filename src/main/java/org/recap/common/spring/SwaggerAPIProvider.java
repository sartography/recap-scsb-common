package org.recap.common.spring;

public class SwaggerAPIProvider {
    private static SwaggerAPIProvider ourInstance;

    private static String swaggerApiKey;

    private SwaggerAPIProvider() {
    }

    public static SwaggerAPIProvider getInstance() {
        if (null == ourInstance) {
            ourInstance = new SwaggerAPIProvider();
            PropertyValueProvider propertyValueProvider = ApplicationContextProvider.getInstance().getApplicationContext().getBean(PropertyValueProvider.class);
            swaggerApiKey = propertyValueProvider.getProperty("scsb.swagger.api.key");
        }
        return ourInstance;
    }

    public String getSwaggerApiKey() {
        return swaggerApiKey;
    }
}
