package org.example.Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    private WebDriver driver;
    private By documentationButtonLocator = By.xpath("//span[text()='Documentation']");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Нажать на Documentation")
    public DocumentationPage clickDocumentationButton() {
        WebElement documentationButton = driver.findElement(documentationButtonLocator);
        documentationButton.click();

        return new DocumentationPage(driver);
    }
}
