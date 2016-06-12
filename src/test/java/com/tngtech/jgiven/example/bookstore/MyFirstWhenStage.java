package com.tngtech.jgiven.example.bookstore;

import static org.assertj.core.api.Assertions.assertThat;

import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import com.tngtech.jgiven.annotation.ScenarioState;
import com.tngtech.jgiven.example.bookstore.entity.Customer;

public class MyFirstWhenStage {

    @ExpectedScenarioState( resolution = ScenarioState.Resolution.NAME )
    Customer customer;

    String customerName;

    public void the_customer_logs_in() {
        assertThat( true ).isFalse();
    }
}
