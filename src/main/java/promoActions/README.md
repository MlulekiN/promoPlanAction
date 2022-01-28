package promoActions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class WhatIfScenario {

    @Test
    public void tpmWhatIfScenario() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

        driver.manage().window().maximize();

        String url = "https://to-pdi.salesperformanceplatform.com/xtelsp-automhfx/web/SM1V6/SM1.aspx?DBG=1";
        driver.get(url);

//        String url = "https://to-pdi.salesperformanceplatform.com/xtelsp-autom/web/?DBG=1";
//        driver.get(url);

        WebElement homeToolBar = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@sm1-id='homeToolbarMenuBTN']/descendant::span[@data-ref='btnIconEl']")));
        homeToolBar.click();

        WebElement promotionalActions = driver.findElement(By.xpath("//div[@sm1-id='PROMOACTION']/descendant::span[text()='Promotional actions'][1]"));
        promotionalActions.click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@sm1-id='AddButton']"))).click();

        WebElement customerSelect;
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@id,'sm1advancedentityselector')][1]/ancestor::div[@sm1-id='CUSTOMER']/descendant::div[@class='sm1-triggers']"))).click();

        WebElement levelSelect;
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Level 3']/parent::td"))).click();

        WebElement customerCode;
        for (int i = 0; i < 2; i++) {
            try {
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-qtip='Customer code']/child::div[@data-ref='triggerEl']"))).click();
                break;
            } catch (Exception e) {
                System.out.println("Element not found");
            }
        }

        WebElement inputID = driver.findElement(By.xpath("//div[@sm1-id='likeValue']/descendant::div[contains(@name,'sm1textbox')]"));
        inputID.sendKeys("EC94791");

        boolean isClicked = false;
        List<WebElement> okButtonElement = driver.findElements(By.xpath("//span[contains(@id, 'sm1okbutton')]/child::span[@data-ref='btnIconEl']/following-sibling::span[text()='OK']"));
        int i = okButtonElement.size();
        for (int l = 2; l < i; l++) {
            isClicked = okButtonElement.get(2).isSelected();

            if (!isClicked) {
                okButtonElement.get(2).click();
            }
        }
        for (int j = 0; j < 2; j++) {
            try {
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='EC94791']"))).click();
                break;
            } catch (StaleElementReferenceException ignored) {
            }
        }
        WebElement okButton;
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[text()='OK']"))).get(1).click();

        WebElement innerOkButton;
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@id,'sm1okbutton')]/descendant::span[@data-ref='btnEl']"))).click();

        WebElement sellInDate;
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@sm1-id='DATE_SELLIN']/descendant::div[contains(@id,'sm1dateperiod')]/child::input[@value='Start Date']"))).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[@id='ext-element-82']"))).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[@id='ext-element-100']"))).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='OK'][1]"))).click();

        WebElement products;
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@sm1-id='TAB_H5_PRODUCTS']/descendant::span[text()='Products'][1]"))).click();

        WebElement addButton;
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@sm1-id='AddButton']"))).click();

        WebElement chooseProduct;
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='BACCO PINOT 0.75 lt']"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@id,'sm1okbutton')]/span[text()='OK']"))).click();


        WebElement cockPit;
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Cockpit']"))).click();

        driver.quit();
    }
}




