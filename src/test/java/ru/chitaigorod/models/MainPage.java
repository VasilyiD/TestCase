package ru.chitaigorod.models;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.chitaigorod.initialization.BaseSeleniumPage;

public class MainPage extends BaseSeleniumPage {


    @FindBy(xpath = "//input[@class='header-search__input']")
    private WebElement searchField;

    @FindBy(xpath = "//*[@class='products-list']//article[1]/div/div/span")
    private WebElement firstBookBySearch;

    @FindBy(css = ".header-cart__icon.header-cart__icon--desktop")
    private WebElement cartIcon;

    @FindBy(xpath = "//button[@class='header-search__button']")
    private WebElement searchButton;


    public MainPage inputBookName(String bookName) {
        searchField.click();
        searchField.sendKeys(bookName);
        return this;
    }

    public MainPage clickAddToCartFirstInSearch() {
        firstBookBySearch.click();
        return this;
    }

    public MainPage clickCartIcon() {
        cartIcon.click();
        return this;
    }

    public MainPage clickSearchButton() {
        searchButton.click();
        return this;
    }

    public MainPage() {
        driver.get("https://www.chitai-gorod.ru/");
        PageFactory.initElements(driver,this);
    }
}