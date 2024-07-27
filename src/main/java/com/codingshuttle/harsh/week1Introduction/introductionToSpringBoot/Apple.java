package com.codingshuttle.harsh.week1Introduction.introductionToSpringBoot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * By default, the implementation of Bean is Singleton
 * You can change the scope by using the @Scope annotation
 */
@Component
//@Scope("prototype") // This makes the scope of the bean as prototype
public class Apple {

    int counter = 1;

    void eatApple() {
        System.out.println("I am eating the Apple!" + this.counter);
    }

    @PostConstruct
    void callThisBeforeAppleIsUsed() {
        System.out.println("Creating the apple before use!");
    }

    @PreDestroy
    void callThisBeforeAppleIsDestroyed() {
        System.out.println("Destroying the Apple!");
    }

}
