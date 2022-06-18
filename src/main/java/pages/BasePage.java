package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.SneakyThrows;

public abstract class BasePage {

    @SneakyThrows
    public static <T extends BasePage> T getPage(Class<T> clazz)  {
        return clazz.getDeclaredConstructor().newInstance();
    }

    protected void input(final SelenideElement element, final String text) {
        element.setValue(text);
    }

    protected String getContentOfElement(final SelenideElement element) {
        return element.getText();
    }
}
