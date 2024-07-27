package com.codingshuttle.harsh.week1Introduction.introductionToSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "env", havingValue = "production")
public class ProdDB implements DB{
    public String getData() {
        return "Production Data";
    }
}
