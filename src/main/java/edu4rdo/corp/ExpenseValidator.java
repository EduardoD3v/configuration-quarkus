package edu4rdo.corp;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ExpenseValidator {

    @Inject
    ExpenseConfiguration config;


    public void debugRanges() {
        config.debugMessage().ifPresent(System.out::println);
    }

    public boolean isValidAmount(int amount) {
        if (config.debugEnabled()) {
            debugRanges();
        }
        return amount >= config.rangeLow() && amount <= config.rangeHigh();
    }
}
