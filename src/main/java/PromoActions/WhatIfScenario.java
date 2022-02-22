package PromoActions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
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

        String selectChosenID = "EC94791";

        //  String url = "https://to-pdi.salesperformanceplatform.com/xtelsp-automhfx/web/SM1V6/SM1.aspx?DBG=1";
        String url = "https://to-pdi.salesperformanceplatform.com/xtelsp-autom/web/?DBG=1";
        driver.get(url);
        driver.manage().window().maximize();
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(300));

        WebElement homeToolBar = wait1.until(ExpectedConditions.presenceOfElementLocated(Elements.homeToolBar));
        homeToolBar.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

        WebElement promotionalActions = driver.findElement(Elements.promotionalActions);
        promotionalActions.click();

        WebElement addButton = wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.addButton));
        addButton.click();

        WebElement customerInput = wait.until(ExpectedConditions.elementToBeClickable(Elements.customerInput));
        customerInput.click();

        WebElement levelChoose = wait.until(ExpectedConditions.elementToBeClickable(Elements.levelChoose));
        levelChoose.click();
        {
            new WebDriverWait(driver, Duration.ofSeconds(5))
                    .ignoring(StaleElementReferenceException.class)
                    .until((WebDriver d) -> {
                        d.findElement(Elements.customerCode).click();
                        return true;
                    });
        }

        WebElement inputID = wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.inputID));
        inputID.sendKeys("EC94791");

        WebElement okButtonElement = wait.until(ExpectedConditions.presenceOfElementLocated(Elements.okButtonElement));
        okButtonElement.click();

        {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .ignoring(StaleElementReferenceException.class)
                .until((WebDriver d) -> {
                    d.findElement(By.xpath("//tr[@class='sm1-row-no-error  x-grid-row']/child::td/div[text()='EC94791']")).click();
                    return true;
                });
    }

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

        WebElement generalInfo = wait.until(ExpectedConditions.elementToBeClickable(Elements.generalInfo));
        generalInfo.click();

        WebElement tprRateIn = wait.until(ExpectedConditions.elementToBeClickable(Elements.tprRateIn));
        tprRateIn.click();

        WebElement productCreate = wait.until(ExpectedConditions.elementToBeClickable(Elements.productCreate));
        productCreate.click();

        WebElement addButtonCreateProd = wait.until(ExpectedConditions.elementToBeClickable(Elements.addButtonCreateProd));
        addButtonCreateProd.click();

        WebElement customerAdd = wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.customerAdd));
        customerAdd.click();

        WebElement okButtonToAddCust = wait.until(ExpectedConditions.elementToBeClickable(Elements.okButtonToAddCust));
        okButtonToAddCust.click();

        WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(Elements.saveButton));
        saveButton.click();

        {
            new WebDriverWait(driver, Duration.ofSeconds(5))
                    .ignoring(ElementClickInterceptedException.class)
                    .until((WebDriver d) -> {
                        d.findElement(Elements.promoWhatIf).click();
                        return true;
                    });
        }

        WebElement promoOkButton = wait.until(ExpectedConditions.elementToBeClickable(Elements.promoOkButton));
        promoOkButton.click();

        WebElement cockPit = wait.until(ExpectedConditions.presenceOfElementLocated(Elements.cockPit));
        cockPit.click();

    }

    @After
    public void close() {
        driver.quit();
    }
}







