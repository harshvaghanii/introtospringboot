package com.codingshuttle.harsh.week1Introduction.introductionToSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "preference", havingValue = "chocolate")
public class Chocolate implements Syrup, Frosting {
    @Override
    public String getFrostingType() {
        return "Chocolate Frosting";
    }

    @Override
    public String getSyrupType() {
        return "Chocolate Syrup";
    }
}
