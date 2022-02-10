package PromoActions;

import org.openqa.selenium.By;

public class Elements {
    public static final By homeToolBar = By.xpath("//div[@sm1-id='homeToolbarMenuBTN']/descendant::span[@data-ref='btnIconEl']");
    public static final By promotionalActions = By.xpath("//div[@sm1-id='PROMOACTION']");
    public static final By addButton = By.xpath("//span[@sm1-id='AddButton']");
    public static final By customerInput = By.xpath("//div[contains(@id,'sm1advancedentityselector')][1]/ancestor::div[@sm1-id='CUSTOMER']/descendant::div[@class='sm1-triggers']");
    public static final By levelChoose = By.xpath("//div[text()='Level 3']/parent::td");
    public static final By customerCode = By.xpath("//div[@data-qtip='Customer code']/descendant::div[@data-ref='triggerEl']");
    public static final By inputID = By.xpath("//div[@sm1-id='likeValue']/descendant::div[contains(@name,'sm1textbox')]");
    public static final By okButtonElement = By.xpath("//div[@sm1-id='LOGICALTEXTBOXCOLUMNPOPUP']//span[@sm1-id='SM1OkButton']/child::span[@data-ref='btnWrap']");
    public static final By selectChosenID = By.xpath("//tr[@class='sm1-row-no-error  x-grid-row']/child::td/div[text()='EC94791']");
    public static final By okButton2 = By.xpath("//div[@sm1-id='LOGICALAVANCEDENTITYSELECTORPOPUP']/descendant::span[text()='OK']");
    public static final By innerOkButton = By.xpath("//span[contains(@id,'sm1okbutton')]/descendant::span[@data-ref='btnEl']");
    public static final By sellInDate = By.xpath("//div[@sm1-id='DATE_SELLIN']/descendant::div[contains(@id,'sm1dateperiod')]/child::input[@value='Start Date']");
    public static final By sellInDateValue = By.xpath("//div[@class='x-panel sm1-daterangepicker-popup x-layer x-panel-default x-border-box']/descendant::td[@aria-label='February 08']");
    public static final By sellInStartDate = By.xpath("//table[@data-ref='eventEl']/descendant::td[@aria-label='February 27']/div[text()='27']");
    public static final By okButtonSellIn = By.xpath("//span[text()='OK'][1]");
    public static final By productCreate = By.xpath("//div[@sm1-id='TAB_H5_PRODUCTS']/descendant::span[text()='Products']");
    public static final By addButtonCreateProd = By.xpath("//span[@sm1-id='AddButton']");
    public static final By customerAdd = By.xpath("//div[text()='BACCO PINOT 0.75 lt']");
    public static final By okButtonToAddCust = By.xpath("//span[contains(@id,'sm1okbutton')]/span[text()='OK']");
    public static final By cockPit = By.xpath("//span[text()='Cockpit']");

}
