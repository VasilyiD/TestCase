package ru.chitaigorod.SeleniumTests;

import org.junit.Assert;
import org.junit.Test;
import ru.chitaigorod.initialization.BaseSeleniumTest;
import ru.chitaigorod.models.MainPage;
import ru.chitaigorod.models.ShoppingCartPage;

import static ru.chitaigorod.helpers.TestValues.BOOK_NAME;

public class CheckoutBookTest extends BaseSeleniumTest {

    @Test
    public void checkoutBookTest() {

        MainPage mainPage = new MainPage();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

        mainPage
                .inputBookName(BOOK_NAME)
                .clickSearchButton()
                .clickAddToCartFirstInSearch()
                .clickCartIcon();
        shoppingCartPage
                .clickCheckoutButton();

        Assert.assertTrue(shoppingCartPage.isAuthorisationHeaderExist());

    }
}
