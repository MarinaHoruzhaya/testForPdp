package org.example.Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SponsorsPage {
    private WebDriver driver;
    private By openCollectiveSponsorsLocator = By.xpath("//h2[text()='OpenCollective Sponsors']");

    public SponsorsPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Получить заголовок текста спонсоров")
    public String getTextOfAllSponsors() {
        WebElement openCollectiveSponsors = driver.findElement(openCollectiveSponsorsLocator);

        return openCollectiveSponsors.getText();
    }
}
