package Day03;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class _02_Exercise2 extends BaseDriver {

    /**
     * Go to "https://opencart.abstracta.us/index.php?route=account/login"
     * Login
     * Validate that you see all menu options and they are written correctly.
     */

    @Test(groups = "SmokeTest")
    void validateMenu() {
        login();

        List<WebElement> menuOptions = driver.findElements(By.cssSelector("ul[class='nav navbar-nav']>li"));
        //Desktops, Laptops & Notebooks, Components, Tablets, Software, Phones & PDAs, Cameras, MP3 Players
        List<String> menuText = new ArrayList<>(List.of("Desktops", "Laptops & Notebooks", "Components", "Tablets", "Software", "Phones & PDAs", "Cameras", "MP3 Players"));

        for (WebElement m : menuOptions) {
            Assert.assertTrue(menuText.contains(m.getText()));
            Assert.assertTrue(m.isDisplayed());
        }
    }
}
