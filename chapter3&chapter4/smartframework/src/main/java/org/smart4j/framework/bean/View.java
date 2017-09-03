package org.smart4j.framework.bean;

import java.util.HashMap;
import java.util.Map;

public class View {

     private String path;   //视图路径
     private Map<String, Object> model; //模型数据

    public View(String path) {
        this.path = path;
        model = new HashMap<String, Object>();
    }

    public View addModel(String key, Object value) {
        model.put(key, value);
        return this;
    }

    public String getPath() {
         return path;
    }

    public Map<String, Object> getModel() {
        return model;
    }
}
