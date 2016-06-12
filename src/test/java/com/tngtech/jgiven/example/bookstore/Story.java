package com.tngtech.jgiven.example.bookstore;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import com.tngtech.jgiven.annotation.IsTag;

@IsTag( prependType = true,
    color = "#00942E", description = "This is a story" )
@Retention( RetentionPolicy.RUNTIME )
public @interface Story {
    String value();
}
