package com.tngtech.jgiven.example.bookstore;

import org.junit.rules.TemporaryFolder;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.*;
import com.tngtech.jgiven.example.bookstore.entity.Customer;
import com.tngtech.jgiven.example.bookstore.entity.CustomerRepository;
import com.tngtech.jgiven.format.BooleanFormatter;

public class MyFirstGivenStage extends Stage<MyFirstGivenStage> {

    @ExpectedScenarioState
    public String testValue = "TEst";

    @ProvidedScenarioState
    private Customer customer;

    @ScenarioRule
    TemporaryFolder temporaryFolder = new TemporaryFolder();

    public MyFirstGivenStage a_customer() {
        customer = new Customer();
        return this;
    }

    @As( "," )
    @IntroWord
    public MyFirstGivenStage comma() {
        return this;
    }

    public void a_book() {

    }

    public MyFirstGivenStage the_customer_has_name( @Quoted String name ) {
        customer.name = name;
        return this;
    }

    @Pending
    public void a_book_with_$_discount( @Format( value = BooleanFormatter.class, args = { "a", "no" } ) boolean b ) {

    }

    @Hidden
    public MyFirstGivenStage anEmailMock() {
        return this;
    }

    @AfterStage
    public void afterStage() {
        CustomerRepository repository = new CustomerRepository();
        repository.store( customer );
    }
}
