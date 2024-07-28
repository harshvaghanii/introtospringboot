package com.codingshuttle.harsh.week1Introduction.introductionToSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "preference", havingValue = "strawberry")
public class Strawberry implements Frosting, Syrup {
    @Override
    public String getFrostingType() {
        return "Strawberry Frosting";
    }

    @Override
    public String getSyrupType() {
        return "Strawberry Syrup";
    }
}
