package PromoActions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class WhatIfScenario {

    private WebDriver driver;

    @Before
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();

    }

    @Test
    public void tpmWhatIfScenario() {

        String customer_code = "EC12345";

        String url = "https://to-pdi.salesperformanceplatform.com/xtelsp-automhfx/web/SM1V6/SM1.aspx?DBG=1";
        //String url = "https://to-pdi.salesperformanceplatform.com/xtelsp-autom/web/?DBG=1";
        driver.get(url);
        driver.manage().window().maximize();
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(300));

//        step 1, user opens the application - > expected: the application is open
        WebElement homeToolBar = wait1.until(ExpectedConditions.presenceOfElementLocated(Elements.homeToolBar));
        homeToolBar.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

        // step 2, the user select the relevant tab to create promo - > expected: various promotions displayed
        WebElement promotionalActions = driver.findElement(Elements.promotionalActions);
        promotionalActions.click();

// step 3, user clicks add button - > expected: the add button leads to multiple levels and promotions
        WebElement addButton = wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.addButton));
        addButton.click();

// step 4, the user selects new promotion to create - > expected: the appropriate promo to be chosen
        WebElement customerInput = wait.until(ExpectedConditions.elementToBeClickable(Elements.customerInput));
        customerInput.click();

        // step 5, the user selects customer level - > expected: level 3 which is the desired level to be selected
        WebElement levelChoose = wait.until(ExpectedConditions.elementToBeClickable(Elements.levelChoose));
        levelChoose.click();
//
////        step 6, the user clicks on trigger to input the customer code - > expected: the trigger leads to the search option
//        WebElement customerCode = wait.until(ExpectedConditions.elementToBeClickable(Elements.customerCode));
//        customerCode.click();
//
//        // step 7, input the customer code on search bar - > expected: the code to be populated on the 'like' bar
//        WebElement inputID = wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.inputID));
//        inputID.sendKeys("EC94791");
//
//        // step 8 , select the ok button element - > expected: the ok button to be selected to displayed appropriate customer
//        WebElement okButtonElement = wait.until(ExpectedConditions.presenceOfElementLocated(Elements.okButtonElement));
//        okButtonElement.click();

        // step 9, confirmation of customer id, level, and name - >expected the display of all customer details
        WebElement selectChosenID = wait.until(ExpectedConditions.elementToBeClickable(Elements.selectChosenID));
        selectChosenID.click();

        // Step 10, select the ok button - > expected: the ok button to be selected and lead to customer page
        WebElement okButton2 = wait.until(ExpectedConditions.elementToBeClickable(Elements.okButton2));
        okButton2.click();

        // step 11, select inner ok button - > expected: the customer information to be displayed and click on inner ok button
        WebElement innerOkButton = wait.until(ExpectedConditions.elementToBeClickable(Elements.innerOkButton));
        innerOkButton.click();

        // step 12, click on sell in date - > expected: the calendar pop up to appear
        WebElement sellInDate = wait.until(ExpectedConditions.presenceOfElementLocated(Elements.sellInDate));
        sellInDate.click();


        // step 13, click on the start date - > expected: the first date to be selected
        WebElement sellInDateValue = wait.until(ExpectedConditions.elementToBeClickable(Elements.sellInDateValue));
        sellInDateValue.click();

        // step 14, click on the range/end date - > expected: the range of dates to appear
        WebElement sellInStartDate = wait.until(ExpectedConditions.presenceOfElementLocated(Elements.sellInStartDate));
        sellInStartDate.click();

        // step 15, select the ok button - > expected: confirmation of the range of dates
        WebElement okButtonSellIn = wait.until(ExpectedConditions.presenceOfElementLocated(Elements.okButtonSellIn));
        okButtonSellIn.click();

        WebElement editButton = wait.until(ExpectedConditions.elementToBeClickable(Elements.editButton));
        editButton.click();

        WebElement sellOutDate = wait.until(ExpectedConditions.elementToBeClickable(Elements.sellOutDate));
        sellOutDate.click();

        WebElement clearAllButton = wait.until(ExpectedConditions.elementToBeClickable(Elements.clearAllButton));
        clearAllButton.click();

        WebElement sellOutStart = wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.sellOutStart));
        sellOutStart.click();

        WebElement sellOutEnd = wait.until(ExpectedConditions.elementToBeClickable(Elements.sellOutEnd));
        sellOutEnd.click();

        WebElement okButtonSellOut = wait.until(ExpectedConditions.elementToBeClickable(Elements.okButtonSellOut));
        okButtonSellOut.click();

        // step 16, select the products tab - > expected: the page directs user to products page
        WebElement productCreate = wait.until(ExpectedConditions.elementToBeClickable(Elements.productCreate));
        productCreate.click();

        // step 17, the user selects the add button to add product - > expected: various products to appear
        WebElement addButtonCreateProd = wait.until(ExpectedConditions.presenceOfElementLocated(Elements.addButtonCreateProd));
        addButtonCreateProd.click();

        // step 18, the user selects the appropriate customer - > expected: the customer details are present and populated
        WebElement customerAdd = wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.customerAdd));
        customerAdd.click();

        // step 19, the user clicks on the ok button to add customer - > expected: the customer is added and details visible
        WebElement okButtonToAddCust = wait.until(ExpectedConditions.elementToBeClickable(Elements.okButtonToAddCust));
        okButtonToAddCust.click();

        // step 20, the user to select the cockpit - > expected: the cockpit to be displayed with multiple tabs accessible
        WebElement cockPit = wait.until(ExpectedConditions.elementToBeClickable(Elements.cockPit));
        cockPit.click();
    }

//    @After
//    public void close(){
//        driver.quit();
//    }
}







