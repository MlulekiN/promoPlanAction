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

public class WhatIfScenario {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        String url = "https://to-pdi.salesperformanceplatform.com/xtelsp-automhfx/web/SM1V6/SM1.aspx?DBG=1";
        driver.get(url);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));

    }

    @Test
    public void tpmWhatIfScenario() {

//        String url1 = "https://to-pdi.salesperformanceplatform.com/xtelsp-autom/web/?DBG=1";
//        driver.get(url1);

        WebElement homeToolBar = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@sm1-id='homeToolbarMenuBTN']/descendant::span[@data-ref='btnIconEl']")));
        homeToolBar.click();

        WebElement promotionalActions = driver.findElement(By.xpath("//div[@sm1-id='PROMOACTION']"));
        promotionalActions.click();

        WebElement addButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@sm1-id='AddButton']")));
        addButton.click();

        WebElement customerInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@id,'sm1advancedentityselector')][1]/ancestor::div[@sm1-id='CUSTOMER']/descendant::div[@class='sm1-triggers']")));
        customerInput.click();

        WebElement levelChoose = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Level 3']/parent::td")));
        levelChoose.click();

        WebElement customerCode = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-qtip='Customer code']/descendant::div[@data-ref='triggerEl']")));
        customerCode.click();

        WebElement inputID = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@sm1-id='likeValue']/descendant::div[contains(@name,'sm1textbox')]")));
        inputID.sendKeys("EC94791");

        WebElement okButtonElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@sm1-id='LOGICALTEXTBOXCOLUMNPOPUP']//span[@sm1-id='SM1OkButton']/child::span[@data-ref='btnWrap']")));
        okButtonElement.click();

        WebElement selectChosenID = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tr[@class='sm1-row-no-error  x-grid-row']/child::td/div[text()='EC94791']")));
        selectChosenID.click();

        WebElement okButton2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@sm1-id='LOGICALAVANCEDENTITYSELECTORPOPUP']/descendant::span[text()='OK']")));
        okButton2.click();

        WebElement innerOkButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@id,'sm1okbutton')]/descendant::span[@data-ref='btnEl']")));
        innerOkButton.click();

        WebElement sellInDate = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@sm1-id='DATE_SELLIN']/descendant::div[contains(@id,'sm1dateperiod')]/child::input[@value='Start Date']")));
        sellInDate.click();

        WebElement sellInDateValue = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='x-panel sm1-daterangepicker-popup x-layer x-panel-default x-border-box']/descendant::td[@aria-label='February 08']")));
        sellInDateValue.click();

        WebElement sellInStartDate = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@data-ref='eventEl']/descendant::td[@aria-label='February 27']/div[text()='27']")));
        sellInStartDate.click();

        WebElement okButtonSellIn = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='OK'][1]")));
        okButtonSellIn.click();

        WebElement productCreate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@sm1-id='TAB_H5_PRODUCTS']/descendant::span[text()='Products']")));
        productCreate.click();

        WebElement addButtonCreateProd = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@sm1-id='AddButton']")));
        addButtonCreateProd.click();

        WebElement customerAdd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='BACCO PINOT 0.75 lt']")));
        customerAdd.click();

        WebElement okButtonToAddCust = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@id,'sm1okbutton')]/span[text()='OK']")));
        okButtonToAddCust.click();

        WebElement cockPit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Cockpit']")));
        cockPit.click();
    }

    @After
    public void close() {
        driver.quit();
    }
}







