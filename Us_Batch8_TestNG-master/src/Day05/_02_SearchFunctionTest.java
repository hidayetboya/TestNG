package Day05;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _02_SearchFunctionTest extends BaseDriver {

    /**
     * Go to "https://opencart.abstracta.us/index.php?route=account/login"
     * Log in with parameters from xml
     * Search for "mac" (use xml to send "mac" keyword)
     * Check if all results contains mac keyword
     */

    @Test
    @Parameters({"email", "password", "searchKeyword"})
    void searchFunctionTest(String email, String password, String searchKeyword) {
        login(email, password);

        WebElement searchInput = driver.findElement(By.xpath("//input[@name='search']"));
        searchInput.sendKeys(searchKeyword);

        WebElement searchButton = driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
        searchButton.click();

        List<WebElement> results = driver.findElements(By.cssSelector("div[class=\"caption\"] a"));

        for (WebElement e: results){
            Assert.assertTrue(e.getText().toLowerCase().contains(searchKeyword));
        }
    }
}
