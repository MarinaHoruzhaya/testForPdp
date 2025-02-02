package org.example.Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverPage {
    private WebDriver driver;
    private By searchButtonLocator = By.cssSelector(".DocSearch-Button-Placeholder");
    private By searchFieldLocator = By.xpath("//input[@class='DocSearch-Input']");
    private By getStartWebDriverLocator = By.xpath("//div[@class='entry']//a[@href='/documentation/webdriver/getting_started/']");
    private By titleWebDriverLocator = By.xpath("//h1[text()='Getting started']");
    private By webDriverSearchLocator = By.xpath("(//mark[text()='WebDriver'])[1]");

    public WebDriverPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Найти текст")
    public WebDriverPage searchNeededText(String text) {
        WebElement searchButton = driver.findElement(searchButtonLocator);
        searchButton.click();
        WebElement searchField = driver.findElement(searchFieldLocator);
        searchField.sendKeys(text);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement webDriverSearch = wait.until(ExpectedConditions.visibilityOfElementLocated(webDriverSearchLocator));
        webDriverSearch.click();

        return this;
    }

    @Step("Нажать get start webDriver")
    public WebDriverPage clickGetStartWebDriver() {
        WebElement getStartWebDriver = driver.findElement(getStartWebDriverLocator);
        getStartWebDriver.click();

        return this;
    }

    @Step("Получить текст заголовка страницы webDriver")
    public String getTextOfTitle() {
        WebElement titleWebdriver = driver.findElement(titleWebDriverLocator);
        return titleWebdriver.getText();
    }
}
