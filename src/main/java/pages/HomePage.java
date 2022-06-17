package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.ui.ExpectedConditions;
import resources.Utils;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends PageObject {

    @FindBy(xpath = "//span[@class='title']")
    private WebElementFacade productTitle;

    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElementFacade sortdropdown;

    @FindBy(xpath = "(//option)[3]")
    private WebElementFacade sortLow2High;

    @FindBy(xpath = "(//option)[4]")
    private WebElementFacade sortHigh2Low;

    @FindBy(xpath = "//div[@class='inventory_item_price']")
    private List<WebElementFacade> priceElements;

    public String getProductTitle() {
        waitFor(ExpectedConditions.visibilityOf(productTitle));
        return productTitle.getText();
    }

    public void sortOrderLow2High() {
        waitFor(ExpectedConditions.visibilityOf(sortdropdown));
        sortdropdown.click();
        waitFor(ExpectedConditions.visibilityOf(sortLow2High));
        sortLow2High.click();
    }

    public void sortOrderHigh2Low() {
        waitFor(ExpectedConditions.visibilityOf(sortdropdown));
        sortdropdown.click();
        waitFor(ExpectedConditions.visibilityOf(sortHigh2Low));
        sortHigh2Low.click();
    }

    public boolean checkSortDescending() {
        ArrayList<Float> prices = new ArrayList<>();
        for (WebElementFacade webElement : priceElements) {
            String webElementText = webElement.getText().replace("$", "");
            prices.add(Float.parseFloat(webElementText));
        }

        return Utils.descendingCheck(prices);
    }

    public boolean checkSortAscending() {
        ArrayList<Float> prices = new ArrayList<>();
        for (WebElementFacade webElement : priceElements) {
            String webElementText = webElement.getText().replace("$", "");
            prices.add(Float.parseFloat(webElementText));
            System.out.println(webElementText);
        }

        return Utils.ascendingCheck(prices);
    }
}
