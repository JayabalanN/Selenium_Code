package runneradactin;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features ="D:\\Maven_WorkSpace\\CucumberProject\\FeatureFiles\\AdactinHotel.feature",
glue ={"stepdefinitions"} )
public class AdactinRunner {

}
