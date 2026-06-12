package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {

    private WebDriver driver;

    private By backpack =
            By.id("add-to-cart-sauce-labs-backpack");

    private By bikeLight =
            By.id("add-to-cart-sauce-labs-bike-light");

    private By shoppingCartBadge =
            By.className("shopping_cart_badge");

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void adicionarProdutos() {

        driver.findElement(backpack).click();
        driver.findElement(bikeLight).click();
    }

    public String obterQuantidadeCarrinho() {

        return driver.findElement(shoppingCartBadge).getText();
    }
}