package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.InventoryPage;
import pages.LoginPage;
import utils.DriverFactory;

public class CarrinhoSteps {

    private WebDriver driver;

    private LoginPage loginPage;
    private InventoryPage inventoryPage;

    @Given("que o usuário acessa o site da loja virtual")
    public void acessarSite() {

        driver = DriverFactory.getDriver();

        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);

        loginPage.acessarSite();
    }

    @Given("informa credenciais válidas")
    public void realizarLogin() {

        loginPage.realizarLogin(
                "standard_user",
                "secret_sauce");
    }

    @When("adiciona dois produtos distintos à sacola")
    public void adicionarProdutos() {

        inventoryPage.adicionarProdutos();
    }

    @Then("o sistema deve exibir o número 2 no carrinho")
    public void validarCarrinho() {

        assertEquals(
                "2",
                inventoryPage.obterQuantidadeCarrinho());

        
    }
}