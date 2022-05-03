package steps;

import io.cucumber.java.en.*;
import pages.AmazonPage;

public class AmazonSteps {
    AmazonPage amazon = new AmazonPage();

    @Given("^I navigate in Amazon page$")
    public void i_navigate_in_amazon_page() {
        amazon.navigateToAmazon();
    }
    @When("^I make a search of a product (.+)$")
    public void i_make_a_search_of_a_product(String text) {
        amazon.writeOnSearchBox(text);
        amazon.clickOnSubmitButton();
    }
    /////
    @Then("^I can find a specific text in the page$")
    public void i_can_find_a_specific_text_in_the_page() {
    }
    @Then("^I can use the PRICE AND DEALS filter$")
    public void i_can_use_the_filter() {
    }
}
