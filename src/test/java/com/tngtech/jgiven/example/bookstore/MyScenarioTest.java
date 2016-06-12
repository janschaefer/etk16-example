package com.tngtech.jgiven.example.bookstore;

import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import com.tngtech.jgiven.annotation.ScenarioStage;
import com.tngtech.jgiven.junit.ScenarioTest;

public class MyScenarioTest extends ScenarioTest<MyFirstGivenStage, MyFirstWhenStage, MyFirstThenStage> {

    @ScenarioStage
    ThenEmail thenEmail;

    @ProvidedScenarioState
    public String testValue = "TEst";

    @Story( "ABC-4" )
    public void my_first_scenario() {

        given().anEmailMock()
                .a_customer()
                .and().the_customer_has_name( "John" )
                .and().a_book_with_$_discount( true );

    }
}
