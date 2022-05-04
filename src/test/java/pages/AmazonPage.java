package pages;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class AmazonPage extends BasePage{

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
    public List<String> allItemsName(){
        List<WebElement> list = allWebElements("a-size-mini a-spacing-none a-color-base s-line-clamp-2");
        List<String> stringsFromList = new ArrayList<String>();
            for(WebElement e:list){
                stringsFromList.add(e.getText());
            }
            return stringsFromList;
    }

    @Test
    public void testCase(){
        navigateToAmazon();
        writeOnSearchBox("Hollow Knight");
        clickOnSubmitButton();
        List<String> list = allItemsName();
        boolean textIsThere = list.contains("HOLLOW KNIGHT [E10]");
            if(textIsThere){
                System.out.println("The Item is there");
            } else{
                throw new Error("The Item is not there");
            }
    }
}
