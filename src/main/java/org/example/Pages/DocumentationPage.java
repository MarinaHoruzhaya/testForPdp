package org.example.Pages;


import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DocumentationPage {
    private WebDriver driver;
    private By learnMoreLocator = By.cssSelector(".selenium-button.selenium-white-cyan");
    private By javaScriptButtonLocator = By.cssSelector("#tabs-03-04-tab");

    public DocumentationPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("нажать на кнопку learn more button")
    public void clickLearnMoreButton() {
        WebElement learnMoreButton = driver.findElement(learnMoreLocator);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", learnMoreButton);
        try {
            Thread.sleep(600);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        learnMoreButton.click();
    }

    @Step("Выбрать зык JS")
    public void chooseJavaScript() {
        WebElement javaScriptButton = driver.findElement(javaScriptButtonLocator);

        javaScriptButton.click();
    }

    @Step("проверить что язык выбран")
    public String getAttributeOfJSButton() {
        WebElement javaScriptButton = driver.findElement(javaScriptButtonLocator);
        return javaScriptButton.getAttribute("aria-selected");

    }
}
