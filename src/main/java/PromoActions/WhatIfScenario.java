package PromoActions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WhatIfScenario {

    private WebDriver driver;

    @Before
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();

    }

    @Test
    public void tpmWhatIfScenario() {

        String url = "https://to-pdi.salesperformanceplatform.com/xtelsp-automhfx/web/SM1V6/SM1.aspx?DBG=1";
        driver.get(url);
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

        WebElement homeToolBar = wait.until(ExpectedConditions.presenceOfElementLocated(Elements.homeToolBar));
        homeToolBar.click();

        WebElement promotionalActions = driver.findElement(Elements.promotionalActions);
        promotionalActions.click();

        WebElement addButton = wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.addButton));
        addButton.click();

        WebElement customerInput = wait.until(ExpectedConditions.elementToBeClickable(Elements.customerInput));
        customerInput.click();

        WebElement levelChoose = wait.until(ExpectedConditions.elementToBeClickable(Elements.levelChoose));
        levelChoose.click();

        WebElement customerCode = wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.customerCode));
        customerCode.click();

        WebElement inputID = wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.inputID));
        inputID.sendKeys("EC94791");

        WebElement okButtonElement = wait.until(ExpectedConditions.presenceOfElementLocated(Elements.okButtonElement));
        okButtonElement.click();

        WebElement selectChosenID = wait.until(ExpectedConditions.elementToBeClickable(Elements.selectChosenID));
        selectChosenID.click();

        WebElement okButton2 = wait.until(ExpectedConditions.elementToBeClickable(Elements.okButton2));
        okButton2.click();

        WebElement innerOkButton = wait.until(ExpectedConditions.elementToBeClickable(Elements.innerOkButton));
        innerOkButton.click();

        WebElement sellInDate = wait.until(ExpectedConditions.presenceOfElementLocated(Elements.sellInDate));
        sellInDate.click();

        WebElement sellInDateValue = wait.until(ExpectedConditions.elementToBeClickable(Elements.sellInDateValue));
        sellInDateValue.click();

        WebElement sellInStartDate = wait.until(ExpectedConditions.presenceOfElementLocated(Elements.sellInStartDate));
        sellInStartDate.click();

        WebElement okButtonSellIn = wait.until(ExpectedConditions.presenceOfElementLocated(Elements.okButtonSellIn));
        okButtonSellIn.click();

        WebElement productCreate = wait.until(ExpectedConditions.elementToBeClickable(Elements.productCreate));
        productCreate.click();

        WebElement addButtonCreateProd = wait.until(ExpectedConditions.presenceOfElementLocated(Elements.addButtonCreateProd));
        addButtonCreateProd.click();

        WebElement customerAdd = wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.customerAdd));
        customerAdd.click();

        WebElement okButtonToAddCust = wait.until(ExpectedConditions.elementToBeClickable(Elements.okButtonToAddCust));
        okButtonToAddCust.click();

        WebElement cockPit = wait.until(ExpectedConditions.elementToBeClickable(Elements.cockPit));
        cockPit.click();
    }

    @After
    public void close() {
        driver.quit();
    }
}







