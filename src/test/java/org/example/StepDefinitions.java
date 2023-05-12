package org.example;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.Assert.assertEquals;



public class StepDefinitions {
    public static final WebDriver webDriver = new ChromeDriver();

    static {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aleks\\IdeaProjects\\untitled3\\src\\test\\resources\\chromedriver.exe");
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        webDriver.manage().window().maximize();
    }

    @Given("url or restaurant {string}")
    public void url_or_restaurant(String url) {
         webDriver.get(url);
    }
    @Then("put the city")
    public void put_the_city() {
    webDriver.findElement(By.className("sc-1inhxcy-2")).click();
    }

    @Then("chose city {string}")
    public void chose_city(String City) {
    webDriver.findElement(By.xpath("html/body/div[4]/div/div[2]/div/div[2]/a[21]")).click();
    }

    @Then("assert that chousen city is {string}")
    public void assert_that_chousen_city_is(String expectedCity) {
      String City = webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div")).getText();
            assertEquals(expectedCity, City);
    }

    @Then("chose city on dodo {string}")
    public void chose_city_on_dodo(String city) {
        final WebElement searchInput =  webDriver.findElement(By.className("locality-selector-popup__search-input"));
        searchInput.sendKeys(city, Keys.ENTER);
    }
    @Then("assert that user got message {string}")
    public void assert_that_user_got_message(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



    }


