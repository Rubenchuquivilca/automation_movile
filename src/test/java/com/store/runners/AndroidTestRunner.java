package com.store.runners;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.store.steps", "com.store.hooks"},
        tags = "@login",
        plugin = {"pretty"}
)
public class AndroidTestRunner {}
