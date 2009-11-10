package ibis.poolInfo;

import ibis.ipl.IbisProperties;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;

public final class PoolInfoProperties {
    
    public static final String IBIS_PREFIX = "ibis.";
    
    public static final String HOST = IBIS_PREFIX + "host";
    
    public static final String CLUSTER = IBIS_PREFIX + "cluster";

    public static final String POOL_PREFIX = "ibis.pool.";

    public static final String POOL_NAME = POOL_PREFIX + "name";

    public static final String POOL_SIZE = POOL_PREFIX + "size";

    private static final String[][] propertiesList = new String[][] {
            { POOL_NAME, null, "Name of the pool" },
            
            { POOL_SIZE, null, "Int: size of the pool" },
            
            { HOST, null, "String used as an identifier for this machine. Default is the Fully Qualified Domain name of this machine"},
            
            { CLUSTER, "unknown", "Cluster of the local machine"},
    
    };

    public static Properties getHardcodedProperties() {
        Properties properties = IbisProperties.getHardcodedProperties();

        for (String[] element : propertiesList) {
            if (element[1] != null) {
                properties.setProperty(element[0], element[1]);
            }
        }

        return properties;
    }

    public static Map<String, String> getDescriptions() {
        Map<String, String> result = new LinkedHashMap<String, String>();

        for (String[] element : propertiesList) {
            result.put(element[0], element[2]);
        }

        return result;
    }

}
