package pages;

public class AmazonPage extends BasePage{
    public AmazonPage() {
        super(driver);
    }

    private String URL = "https://www.amazon.com/";
    private String searchBox = "//input[@id='twotabsearchtextbox']";
    private String submitButton = "//input[@id='nav-search-submit-button']";
    ///////

    public void navigateToAmazon(){
        navigateTo(URL);
    }
    public void writeOnSearchBox(String text){
        write(searchBox,text);
    }
    public void clickOnSubmitButton(){
        click(submitButton);
    }
}
