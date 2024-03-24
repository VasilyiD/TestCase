package ru.chitaigorod.models;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.chitaigorod.initialization.BaseSeleniumPage;

public class ShoppingCartPage extends BaseSeleniumPage {


    @FindBy(css = ".button.cart-sidebar__order-button.blue")
    private WebElement goToCheckoutButton;

    @FindBy(xpath = "//h4[@class='auth-modal__header']")
    private WebElement authorisationHeader;

    public ShoppingCartPage clickCheckoutButton() {
        goToCheckoutButton.click();
        return this;
    }

    public boolean isAuthorisationHeaderExist() {
        return goToCheckoutButton.isDisplayed();
    }

    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }
}