package com.wxb.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@ToString
@ConfigurationProperties(prefix = "per")
@Component
@Data
public class Pet {
    private String name;
    private String weight;
}
