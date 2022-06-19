package starter;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.fluentlenium.core.annotation.Page;
import pages.ProductPage;
import pages.LoginPage;

import static org.assertj.core.api.Assertions.assertThat;

public class MyStepdefs {

    @Page
    LoginPage loginPage;
    @Page
    ProductPage productPage;

    @Given("a customer navigates to the home page of swaglabs")
    public void aCustomerNavigatesToTheHomePageOfSwaglabs() {
        loginPage.getLoginPage();
    }

    @When("the customer click on the Login button")
    public void theCustomerClickOnTheLoginButton() {
        loginPage.clickLoginBtn();
    }

    @Then("the error message should be dispayed")
    public void theErrorMessageShouldBeDispayed() {
        assertThat(loginPage.isErrorDisplayed()).isTrue();
    }

    @When("the customer input the user {string}")
    public void theCustomerInputTheUser(String arg0) {
        loginPage.enterUserName(arg0);
    }

    @And("the customer input the password {string}")
    public void theCustomerInputThePassword(String arg0) {
        loginPage.enterPassword(arg0);
    }

    @Then("the home page is displayed")
    public void theHomePageIsDisplayed() {
        assertThat(productPage.getProductTitle().equals("PRODUCTS"));
    }

    @And("the error message contains the text {string}")
    public void theErrorMessageContainsTheText(String arg0) {
        assertThat(loginPage.getErrorMessage().equals(arg0));
    }

    @And("the user close the error message")
    public void theUserCloseTheErrorMessage() {
        loginPage.closeErrorMessage();
    }

    @Then("the error message is closed")
    public void theErrorMessageIsClosed() {
        assertThat(loginPage.isErrorClosed()).isFalse();
    }

    @When("the customer select the sort order low to high")
    public void theCustomerSelectTheSortOrderLowToHigh() {
        productPage.sortOrderLow2High();
    }

    @Then("the products are sorted by prices low to high")
    public void theProductsAreSortedByPrices() {
        assertThat(productPage.checkSortAscending()).isTrue();
    }

    @And("the customer select the sort order high to low")
    public void theCustomerSelectTheSortOrderHighToLow() {
        productPage.sortOrderHigh2Low();
    }

    @Then("the products are sorted by prices high to low")
    public void theProductsAreSortedByPricesHighToLow() {
        assertThat(productPage.checkSortDescending()).isTrue();
    }

    @Given("a customer navigates to the ProductPages of swaglabs")
    public void aCustomerNavigatesToTheProductPagesOfSwaglabs() {
        productPage.getProductPage();
    }

    @Then("the login page is displayed")
    public void theLoginPageIsDisplayed() {
        loginPage.loginPageDisplayed();
    }
}
