package cn.pyc.functionalprogram.property;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @author pi
 * @date 2020/8/14 13:53:37
 */
public class Properties {
   private Map<String,String> properties = new HashMap<>();

    public void setProperty(String name, String value) {
       this.properties.put(name,value);
    }

    public String getProperty(String name) {
       return this.properties.get(name);
    }
}
