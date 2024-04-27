package com.atguigu.springBoot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring.jdbc")
public class JdbcDatasource {
    private Datasource datasource;
    private String type;

    @Override
    public String toString() {
        return "jdbcDatasource{" +
                "datasource=" + datasource +
                ", type='" + type + '\'' +
                '}';
    }

    public Datasource getDatasource() {
        return datasource;
    }

    public void setDatasource(Datasource datasource) {
        this.datasource = datasource;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public JdbcDatasource() {
    }

    public JdbcDatasource(Datasource datasource, String type) {
        this.datasource = datasource;
        this.type = type;
    }
}
