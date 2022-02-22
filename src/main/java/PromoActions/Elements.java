package PromoActions;

import org.openqa.selenium.By;

public class Elements {
    public static By homeToolBar = By.xpath("//div[@sm1-id='homeToolbarMenuBTN']/descendant::span[@data-ref='btnIconEl']");
    public static By promotionalActions = By.xpath("//div[@sm1-id='PROMOACTION']");
    public static By addButton = By.xpath("//span[@sm1-id='AddButton']");
    public static By customerInput = By.xpath("//div[contains(@id,'sm1advancedentityselector')][1]/ancestor::div[@sm1-id='CUSTOMER']/descendant::div[@class='sm1-triggers']");
    public static By levelChoose = By.xpath("//div[text()='Level 3']/parent::td");
    public static By customerCode = By.xpath("//div[@data-qtip='Customer code']/descendant::div[@data-ref='triggerEl']");
    public static By inputID = By.xpath("//div[@sm1-id='likeValue']/descendant::div[contains(@name,'sm1textbox')]");
    public static By okButtonElement = By.xpath("//div[@sm1-id='LOGICALTEXTBOXCOLUMNPOPUP']//span[@sm1-id='SM1OkButton']/child::span[@data-ref='btnWrap']");
    public static String selectChosenID = "//tr[@class='sm1-row-no-error  x-grid-row']/child::td/div[text()='EC94791']";
    public static By okButton2 = By.xpath("//div[@sm1-id='LOGICALAVANCEDENTITYSELECTORPOPUP']/descendant::span[text()='OK']");
    public static By innerOkButton = By.xpath("//span[contains(@id,'sm1okbutton')]/descendant::span[@data-ref='btnEl']");
    public static By sellInDate = By.xpath("//div[@sm1-id='DATE_SELLIN']/descendant::div[contains(@id,'sm1dateperiod')]/child::input[@value='Start Date']");
    public static By sellInDateValue = By.xpath("//div[@class='x-panel sm1-daterangepicker-popup x-layer x-panel-default x-border-box']/descendant::td[@aria-label='March 01']");
    public static By sellInStartDate = By.xpath("//table[@data-ref='eventEl']/descendant::td[@aria-label='March 04']/div[text()='4']");
    public static By okButtonSellIn = By.xpath("//span[text()='OK'][1]");
    public static By editButton = By.xpath("//span[text()='Edit']");
    public static By clearAllButton = By.xpath("//div[contains(@class,'sm1-daterangepicker-popup') and not (@style='height: 384px; left: 657px; top: 173px; z-index: 19000; width: 362px; display: none;')]/descendant::div[contains(@id,'toolbar')]/descendant::span[text()='Clear All']");
    public static By sellOutDate = By.xpath("//div[@sm1-id='DATE_SELLOUT']/descendant::div[contains(@id,'sm1dateperiod')]/input");
    public static By sellOutStart = By.xpath("//td[contains(@class,'x-datepicker-cell') and (@aria-label='March 04') and not (@data-qtip='Date Before Min Date')]");
    public static By sellOutEnd = By.xpath("//td[(@aria-label='March 09') and (@data-qtip='Date After Max Date')]/preceding-sibling::td[@aria-label='March 08']");
    public static By okButtonSellOut = By.xpath("//div[@id='sm1WaitDiv']/following-sibling::div[contains(@class,'daterangepicker')]/following-sibling::div[contains(@class,'daterangepicker')]/descendant::span[text()='OK']");
    public static By generalInfo = By.xpath("//span[text()='General info']");
    public static By tprRateIn = By.xpath("//div[text()='TPR in Rate ']/ancestor::td[contains(@class,'x-grid-cell x-grid-td x-grid-cell-sm1gridhtmlcolumn')]/preceding-sibling::td");
    public static By productCreate = By.xpath("//div[@sm1-id='TAB_H5_PRODUCTS']/descendant::span[text()='Products']");
    public static By addButtonCreateProd = By.xpath("//div[@class='x-panel sm1-tabitem x-fit-item x-panel-default']/descendant::span[@sm1-id='AddButton']");
    public static By customerAdd = By.xpath("//div[text()='BACCO PINOT 0.75 lt']");
    public static By okButtonToAddCust = By.xpath("//span[contains(@id,'sm1okbutton')]/span[text()='OK']");
    public static By saveButton = By.xpath("//span[text()='Save']");
    public static By cockPit = By.xpath("//span[text()='Cockpit']/parent::span");
    public static By promoWhatIf = By.xpath("//a[@sm1-id='ACTION_ACT_H5_PROMOSHOTSPOPUP']");
    public static By promoOkButton = By.xpath("//div[contains(@class,'x-window sm1-popup')]/descendant::span[text()='OK']");

}
