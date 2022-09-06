package com.flightnetwork.step_definitions;

import com.flightnetwork.pages.FlightPage;
import com.flightnetwork.pages.MainPage;
import com.flightnetwork.utilities.BrowserUtils;
import com.flightnetwork.utilities.ConfigurationReader;
import com.flightnetwork.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.*;
import java.util.concurrent.TimeUnit;


public class FlightNetwork {

    MainPage main = new MainPage();
    FlightPage flight = new FlightPage();
    Actions actions = new Actions(Driver.getDriver());
    Set<String> listExpected = new HashSet<String>();
    public String FilterTimeExpected = new String("");
    List<String> FlightTimeActual = new ArrayList<>();
    public String FilterTimeSecond = new String("");



    @Given("User lands on main page")
    public void user_lands_on_main_page() {
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
        BrowserUtils.waitFor(1);
        main.cookies.click();

    }
    @Then("user selects flight type {string}")
    public void userSelectsFlightType(String arg0) {
        BrowserUtils.waitFor(1);
        List<WebElement> Ftype = new ArrayList<>(main.FlightType);
        if(arg0.equals("RETURN")){
            Ftype.get(0).click();
        }else if(arg0.equals("ONE-WAY")){
            Ftype.get(1).click();
        }else if(arg0.equals("MULTI")) {
            Ftype.get(2).click();
        }
        BrowserUtils.waitFor(1);
    }

    @When("user selects departure airport {string}")
    public void userSelectsDepartureAirport(String expectedDepartureAirport) {
        main.from.click();
        actions.sendKeys(expectedDepartureAirport).perform();
        BrowserUtils.waitFor(2);
        actions.sendKeys(Keys.ENTER).perform();
    }

    @And("user selects arrival airport {string}")
    public void userSelectsArrivalAirportArrivalAirport(String expectedArrivalAirport) {
        BrowserUtils.waitFor(1);
        main.to.click();
        actions.sendKeys(expectedArrivalAirport).perform();
        BrowserUtils.waitFor(2);
        actions.sendKeys(Keys.ENTER).perform();
    }

    @And("user selects departure date {string}")
    public void userSelectsDepartureDate(String expectedDepartureDate) {
        main.departureDateClick.click();
        BrowserUtils.waitFor(1);
        Driver.getDriver().findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'" + expectedDepartureDate + "')]")).click();

    }

    @And("user selects return date {string}")
    public void userSelectsReturnDate(String expectedReturnDate) {
        main.returnDateClick.click();
        BrowserUtils.waitFor(1);
        Driver.getDriver().findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'" + expectedReturnDate + "')]")).click();

    }


    @Then("user should see {string}")
    public void userShouldSee(String ExpectedFlightResult) {
        String ActualFlightResult = flight.DepartureAirport.getText() + " - " + flight.ArrivalAirport.getText() + " " + flight.DepartureDate.getText() + " - " + flight.ReturnDate.getText() + " " + flight.passangerInfoFlightPage.getText();
        System.out.println("flightResult = " + ActualFlightResult);
        System.out.println("ExpectedFlightResult = " + ExpectedFlightResult);
        Assert.assertEquals(ExpectedFlightResult, ActualFlightResult);

    }

    @And("user selects adult number {string}")
    public void userSelectsAdultNumber(String arg0) {
        int adultNumber = Integer.parseInt(arg0);
        main.passengerClick.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        for (int i = 1; i < adultNumber; i++) {
            main.AdultPlusBtn.click();
            BrowserUtils.waitFor(2);
        }

    }

    @And("user selects children number {string}")
    public void userSelectsChildrenNumber(String arg0) {
        int ChildrenNumber = Integer.parseInt(arg0);
        BrowserUtils.waitFor(2);
        if (ChildrenNumber > 0) {
            for (int i = 1; i <= ChildrenNumber; i++) {
                main.ChildrenPlusBtn.click();
                BrowserUtils.waitFor(2);
            }
            for (int j = 1; j <= 3; j++) {
                main.ChildrenAgePlusBtn.click();
                BrowserUtils.waitFor(1);
            }
        }
    }

    @And("user selects infants number {string}")
    public void userSelectsInfantsNumber(String arg0) {
        int InfantsNumber = Integer.parseInt(arg0);
        BrowserUtils.waitFor(2);
        if (InfantsNumber > 0) {
            for (int i = 1; i <= InfantsNumber; i++) {
                main.InfantsPlusBtn.click();
                BrowserUtils.waitFor(2);
            }
        }
    }

    @And("user selects status {string}")
    public void userSelectsStatus(String arg0) {
        BrowserUtils.waitFor(1);
        main.statu.click();
        BrowserUtils.waitFor(4);
       // List<WebElement> statuValue = new ArrayList<>(main.statuSelect);

        for (WebElement element : main.statuSelect) {
            if (element.getText().equalsIgnoreCase(arg0)){
                System.out.println(element.getText());
                element.click();
            break;}
        }

       /* if(arg0.equals("ECONOMY")){
            statuValue.get(0).click();
        }else if(arg0.equals("PREMIUM")){
            statuValue.get(1).click();
        }else if(arg0.equals("BUSINESS")) {
            statuValue.get(2).click();
        }else if(arg0.equals("FIRST")) {
            statuValue.get(3).click();
        }
        BrowserUtils.waitFor(2);*/
        //actions.sendKeys(Keys.ENTER).perform();
        BrowserUtils.waitFor(1);
    }

    @And("User can click direct flight button and search flight button")
    public void userCanClickDirectFlightButtonAndSearchFlightButton() {

        main.directFly.click();
        BrowserUtils.waitFor(1);
        main.searchBtn.click();
        BrowserUtils.waitFor(4);
    }

    @Then("User can click Filter button and can be applied")
    public void user_can_click_filter_button_and_can_be_applied() {

        String noFilter=flight.FilterBy.getText();

        BrowserUtils.waitFor(2);
        flight.filter.click();
        BrowserUtils.waitFor(2);
        flight.NumberOfStop.click();

        flight.AirlinesClear.click();
        BrowserUtils.waitFor(2);
        flight.AirlinesSelectOne.click();
        BrowserUtils.waitFor(2);
        flight.AirlinesSelectTwo.click();
        BrowserUtils.waitFor(2);
        for (int i = 1; i < flight.AirlineListBox.size(); i++) {
            if (flight.AirlineListBox.get(i).isSelected()) {
                listExpected.add(flight.AirlineListText.get(i - 1).getText());

            }

        }

        System.out.println("ListExpected = " + listExpected);
        flight.Arrival.click();

        BrowserUtils.waitFor(2);
        actions.dragAndDropBy(flight.PriceBegin, 104, 100).perform();

        BrowserUtils.waitFor(2);
        actions.dragAndDropBy(flight.FromLast, -300, 100).perform();

        BrowserUtils.waitFor(2);
        actions.dragAndDropBy(flight.ToBegin, 100, 100).perform();
        BrowserUtils.waitFor(2);
        actions.dragAndDropBy(flight.ToLast, -100, 100).perform();

        BrowserUtils.waitFor(2);
        actions.dragAndDropBy(flight.TravelTime, -150, 100).perform();
        BrowserUtils.waitFor(2);

        FilterTimeExpected = flight.TravelTimeExpected.getText();
        System.out.println("FilterTimeExpected = " + FilterTimeExpected);
        BrowserUtils.waitFor(2);
        FilterTimeSecond = FilterTimeExpected.substring(0, FilterTimeExpected.indexOf("h"));

        System.out.println("FilterTimeSecond = " + FilterTimeSecond);
        BrowserUtils.waitFor(2);

        String AfterFilter=flight.FilterBy.getText();
        System.out.println("noFilter = " + noFilter);
        System.out.println("AfterFilter = " + AfterFilter);
        Assert.assertNotEquals(noFilter,AfterFilter);

        flight.DoneBtn.click();

    }

    @Then("User verify the changes")
    public void user_verify_the_changes() {
        Set<String> setActual = new HashSet<String>();


        for (WebElement each : flight.AirlineVerify) {
            String eachText = each.getText();
            setActual.add(eachText);
        }
        System.out.println("setActual = " + setActual);
        System.out.println("setExpected = " + listExpected);

        Assert.assertTrue(listExpected.containsAll(setActual));


        for (WebElement eachFtime : flight.TravelTimeActual) {
            String eachFtimeText = eachFtime.getText();
            FlightTimeActual.add(eachFtimeText);
        }
        System.out.println("FlightTimeActual = " + FlightTimeActual);
        System.out.println("FilterTimeSecond = " + FilterTimeSecond);




    }


}