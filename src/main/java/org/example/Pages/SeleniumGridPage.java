package org.example.Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumGridPage {
    private WebDriver driver;
    private By gridButtonLocator = By.xpath("//span[text()='Grid']");
    private By getStartedGridLocator = By.xpath("//div[@class='entry']//a[@href='/documentation/grid/getting_started/']");
    private By titleOfGridLocator = By.xpath("//div[text()='Instructions for a simple Selenium Grid']");


    public SeleniumGridPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Перейти на страницу Grid")
    public SeleniumGridPage clickGridButton() {
        WebElement gridButton = driver.findElement(gridButtonLocator);
        gridButton.click();

        return this;
    }

    @Step("Нажать Get Started Grid")
    public SeleniumGridPage clickGetStartGrid() {
        WebElement getStartedGrid = driver.findElement(getStartedGridLocator);
        getStartedGrid.click();

        return this;
    }

    @Step("get text title og grid")
    public String getTextTitleGrid() {
        WebElement getStartGridTitle = driver.findElement(titleOfGridLocator);
        return getStartGridTitle.getText();
    }

}
