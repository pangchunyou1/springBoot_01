package com.atguigu.springBoot.bean;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//@Component
//@ConfigurationProperties(prefix = "spring.jdbc.datasource")
public class Datasource {
    private String name;
    private String password;
    private String url;
    private String driverClassName;

    @Override
    public String toString() {
        return "Datasource{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", url='" + url + '\'' +
                ", driverClassName='" + driverClassName + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public Datasource(String name, String password, String url, String driverClassName) {
        this.name = name;
        this.password = password;
        this.url = url;
        this.driverClassName = driverClassName;
    }

    public Datasource() {
    }
}
