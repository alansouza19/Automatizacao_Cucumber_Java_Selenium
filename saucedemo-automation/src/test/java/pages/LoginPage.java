package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    private By username = By.id("user-name");
    private By password = By.id("password");
    private By loginButton = By.id("login-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarSite() {
        driver.get("https://www.saucedemo.com");
    }

    public void realizarLogin(String usuario, String senha) {

        driver.findElement(username).sendKeys(usuario);
        driver.findElement(password).sendKeys(senha);
        driver.findElement(loginButton).click();
    }
}