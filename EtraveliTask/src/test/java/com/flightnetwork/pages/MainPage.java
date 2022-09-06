package com.flightnetwork.pages;

import com.flightnetwork.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage extends BasePage{
    Actions actions =new Actions(Driver.getDriver());
    public MainPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//button[@class='_1hglkl65 _1hglkl60 _1hglkl63 css-8ftosc']")
    public WebElement cookies;

    @FindBy(xpath = "(//div[@class=' css-1hwfws3'])[1]")
    public WebElement from;

    @FindBy(xpath = "(//div[@class=' css-1hwfws3'])[2]")
    public WebElement to;

    @FindBy(xpath = "//div[@class='_3won560 welvw82 _3won567 _3won562']")
    public List<WebElement> FlightType;


    @FindBy(xpath= "//input[@placeholder='Departure']")
    public WebElement departureDateClick;

    @FindBy(xpath = "//input[@placeholder='Return']")
    public WebElement returnDateClick;

    @FindBy(xpath = "//div[@class='DayPicker-Day'][contains(@aria-label,'Thu Sep 15 2022')]")
    public WebElement departureDateSelect;

    @FindBy(xpath = "//div[@class='DayPicker-Day'][contains(@aria-label,'Sun Sep 18 2022')]")
    public WebElement returnDateSelect;

    @FindBy(xpath = "//div[@class='css-1a8en2k em00kgn0']")
    public WebElement passengerClick;

    @FindBy(xpath = "//button[@data-testid='counter-adults-minus-button']")
    public WebElement AdultMinusBtn;

    @FindBy(xpath = "//button[@data-testid='counter-adults-plus-button']")
    public WebElement AdultPlusBtn;

    @FindBy(xpath = "//button[@data-testid='counter-children-minus-button']")
    public WebElement ChildrenMinusBtn;

    @FindBy(xpath = "//button[@data-testid='counter-children-plus-button']")
    public WebElement ChildrenPlusBtn;

    @FindBy(xpath = "//button[@data-testid='counter-infants-minus-button']")
    public WebElement InfantsMinusBtn;

    @FindBy(xpath = "//button[@data-testid='counter-infants-plus-button']")
    public WebElement InfantsPlusBtn;

    @FindBy(xpath = "//button[@data-testid='counter-child-0-age-minus-button']")
    public WebElement ChildrenAgeMinusBtn;

    @FindBy(xpath = "//button[@data-testid='counter-child-0-age-plus-button']")
    public WebElement ChildrenAgePlusBtn;

    @FindBy(xpath = "//button[@data-testid='counter-infant-0-age-minus-button']")
    public WebElement InfantsAgeMinusBtn;

    @FindBy(xpath = "//button[@data-testid='counter-infant-0-age-plus-button']")
    public WebElement InfantsAgePlusBtn;

    @FindBy(xpath = "//div[@class='css-f1ynmf em00kgn0']")
    public WebElement statu;
    @FindBy(xpath = "//div[@data-testid='etiDropdownOption']")
    public List<WebElement> statuSelect;

    @FindBy(xpath = "//input[@data-testid='directFlight-input']")
    public WebElement directFly;

    @FindBy(xpath = "//button[@data-testid='searchForm-searchFlights-button']")
    public WebElement searchBtn;




}
