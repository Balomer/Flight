package com.flightnetwork.pages;

import com.flightnetwork.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FlightPage extends BasePage{
    public FlightPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//span[@class='css-1ubn1th ewhyijf6']")
    public WebElement filter;

    @FindBy(xpath = "(//div[@data-testid='tripDetails-title-TitleText']/span)[1]")
    public WebElement DepartureAirport;

    @FindBy(xpath = "(//div[@data-testid='tripDetails-title-TitleText']/span)[3]")
    public WebElement ArrivalAirport;


    @FindBy(xpath = "(//div[@data-testid='tripDetails-title-date-desktop']/span)[1]")
    public WebElement DepartureDate;

    @FindBy(xpath = "(//div[@data-testid='tripDetails-title-date-desktop']/span)[3]")
    public WebElement ReturnDate;

    @FindBy(xpath = "//div[@data-testid='tripDetails-title-travelers-desktop']")
    public WebElement passangerInfoFlightPage;

    @FindBy(xpath = "//label[@data-testid='MAX_STOPS-direct']")
    public WebElement NumberOfStop;

    @FindBy(xpath = "//span[@class='css-powtjg epwz15m1']")
    public WebElement AirlinesClear;

    @FindBy(xpath = "(//input[@class='_3n3vnt1'])[2]")
    public WebElement AirlinesSelectOne;
    @FindBy(xpath = "(//input[@class='_3n3vnt1'])[3]")
    public WebElement AirlinesSelectTwo;

    @FindBy(xpath= "(//div[@class='_3won560 welvw82 _3won567 _3won562'])[7]")
    public WebElement Arrival;

    @FindBy(xpath = "(//div[@data-testid='handle-0'])[1]")
    public WebElement PriceBegin;
    @FindBy(xpath = "(//div[@data-testid='handle-1'])[1]")
    public WebElement PriceLast;


    @FindBy(xpath = "(//div[@data-testid='handle-0'])[2]")
    public WebElement FromBegin;

    @FindBy(xpath="(//div[@data-testid='handle-1'])[2]")
    public WebElement FromLast;


    @FindBy(xpath = "(//div[@data-testid='handle-0'])[3]")
    public WebElement ToBegin;
    @FindBy(xpath = "(//div[@data-testid='handle-1'])[3]")
    public WebElement ToLast;

    @FindBy(xpath = "(//div[@data-testid='handle-0'])[4]")
    public WebElement TravelTime;

    @FindBy(xpath = "//button[@data-testid='filtersForm-applyFilters-button']")
    public WebElement DoneBtn;

    @FindBy(xpath = "//div[@class='css-akpcxl e1ngmrql4']")
    public List<WebElement> AirlineVerify;

    @FindBy(xpath = "//input[@type='checkbox']")
   public List<WebElement> AirlineListBox;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div/div/div/section/div/div/ul/li/label")
    public List<WebElement> AirlineListText;



    @FindBy(xpath = "(//div[@class='css-q8818v'])[4]")
    public WebElement TravelTimeExpected;

    @FindBy(xpath = "//p[@data-testid='searchResults-segment-duration']")
    public List<WebElement> TravelTimeActual;

    @FindBy(xpath = "//div[@class='css-q8818v']")
    public List<WebElement> FiltersBeginning;

    @FindBy(xpath = "//div[@class='css-gbzxm']")
    public List<WebElement> FiltersEnding;

    @FindBy(xpath = "//span[@class='css-1q7o3zb e19cul220']")
    public WebElement FilterBy;





















}
