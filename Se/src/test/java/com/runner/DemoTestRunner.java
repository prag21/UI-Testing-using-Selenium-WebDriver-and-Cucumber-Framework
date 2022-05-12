package com.runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\pragn\\eclipse-workspace\\Se\\Features\\demo.feature",glue="com.cucumber.steps")
public class DemoTestRunner {

}
