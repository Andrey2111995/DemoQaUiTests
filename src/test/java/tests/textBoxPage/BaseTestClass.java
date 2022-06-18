package tests.textBoxPage;


import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeMethod;
import pages.BasePage;
import pages.TextBoxPage;

public abstract class BaseTestClass {

    protected TextBoxPage textBoxPage;

    private static final String URI = "https://demoqa.com/text-box";

    @BeforeMethod
    public void setUp() {
        textBoxPage = BasePage.getPage(TextBoxPage.class);
        Selenide.open(URI);
    }
}
