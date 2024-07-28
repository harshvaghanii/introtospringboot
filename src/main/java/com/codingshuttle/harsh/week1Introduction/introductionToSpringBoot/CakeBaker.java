package com.codingshuttle.harsh.week1Introduction.introductionToSpringBoot;

import org.springframework.stereotype.Component;

@Component
public class CakeBaker {

    private final Frosting frosting;
    private final Syrup syrup;

    public CakeBaker(Frosting frosting, Syrup syrup) {
        this.frosting = frosting;
        this.syrup = syrup;
    }

    public void bakeCake() {
        System.out.println("The cake is being baked with " + this.frosting.getFrostingType() + " frost and " + this.syrup.getSyrupType() + " syrup!");
    }
}
