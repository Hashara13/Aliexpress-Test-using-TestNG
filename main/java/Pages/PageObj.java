package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObj {
    WebDriver driverobj;
    WebDriverWait wait;

    By searchInput = By.id("search-key");
    By searchButton = By.cssSelector("input[type='submit']");  
    By itemComponent = By.cssSelector("a[class*='item-title']");  
    By cartButton = By.cssSelector("button.add-to-cart"); 
    By viewButton = By.cssSelector("button.view-cart"); 
    By checkoutButton = By.cssSelector("button.checkout"); 
    By emailInput = By.xpath("//input[@type='email']");
    By continueButton = By.xpath("//button[contains(text(),'Continue')]");

    public PageObj(WebDriver driverobj, WebDriverWait wait) {
        this.driverobj = driverobj;
        this.wait = wait;
    }

    public void addToCart(String product) {
    	driverobj.findElement(searchInput).click();;
        System.out.println("Entering product name: " + product);
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchInput));
        driverobj.findElement(searchInput).sendKeys(product);
        driverobj.findElement(searchInput).sendKeys(Keys.ENTER);

        wait.until(ExpectedConditions.visibilityOfElementLocated(itemComponent));
        System.out.println("Selecting the first item from the search results.");
        driverobj.findElement(itemComponent).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(cartButton));
        System.out.println("Clicking the add to cart button.");
        driverobj.findElement(cartButton).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(viewButton));
        System.out.println("Clicking the view cart button.");
        driverobj.findElement(viewButton).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(checkoutButton));
        System.out.println("Clicking the checkout button.");
        driverobj.findElement(checkoutButton).click();
    }

    public void login(String email) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailInput));
        driverobj.findElement(emailInput).sendKeys(email);
        driverobj.findElement(emailInput).sendKeys(Keys.ENTER);

        wait.until(ExpectedConditions.visibilityOfElementLocated(continueButton));
        driverobj.findElement(continueButton).click();
    }
}
