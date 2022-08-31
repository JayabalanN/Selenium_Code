package RunnerFile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "D:\\Project_Tranning_Cucumber\\Feature_File\\FaceBook.feature",
glue = "Stepdefinitions",
plugin = {"html:Report/Cucumber.html"})
public class Runner_Facebook {

}
