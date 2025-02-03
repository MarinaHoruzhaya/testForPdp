package seleniumTests;

import jdk.jfr.Description;
import org.example.Pages.*;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SeleniumDevTest extends BaseTest {
    private WebDriverPage webDriverPage;
    private MainPage mainPage;
    private SeleniumGridPage seleniumGridPage;
    private DocumentationPage documentationPage;
    private SponsorsPage sponsorsPage;
    private final static String sponsors = "OpenCollective Sponsors ";

    @BeforeEach

    public void createPages() {
        webDriverPage = new WebDriverPage(driver);
        mainPage = new MainPage(driver);
        seleniumGridPage = new SeleniumGridPage(driver);
        documentationPage = new DocumentationPage(driver);
        sponsorsPage = new SponsorsPage(driver);
    }

    @Description("успешный тест 1")
    @Test
    @Order(1)
    public void testWebDriver() {
        mainPage.clickDocumentationButton();
        webDriverPage.searchNeededText("WebDriver");
        webDriverPage.clickGetStartWebDriver();

        assertEquals("Getting started", webDriverPage.getTextOfTitle());
    }

    @Description("Успешный тест 2")
    @Test
    @Order(3)
    public void seleniumGrid() {
        mainPage.clickDocumentationButton();
        seleniumGridPage.clickGridButton();
        seleniumGridPage.clickGetStartGrid();

        assertEquals("Instructions for a simple Selenium Grid", seleniumGridPage.getTextTitleGrid());
    }

    @Description("упавший тест 1")
    @Test
    @Order(2)
    public void checkOpenCollectiveSponsors() {
        mainPage.clickDocumentationButton();
        documentationPage.clickLearnMoreButton();

        assertEquals(sponsors, sponsorsPage.getTextOfAllSponsors());
    }

    @Disabled
    @Description("отключенный тест")
    @Test
    @Order(4)
    public void changeLanguage() {
        mainPage.clickDocumentationButton();
        documentationPage.chooseJavaScript();

        assertEquals("true", documentationPage.getAttributeOfJSButton());
    }
}

