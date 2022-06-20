package utils;

import org.testng.Assert;

/**
 * Вспомогательный класс для проверки заполнения полей ввода
 */
public final class TextBoxAssertUtils {

    public static void assertName(final String actual, final String expected) {
        Assert.assertEquals(actual, constructResultValue("Name:", expected));
    }

    public static void assertEmail(final String actual, final String expected) {
        Assert.assertEquals(actual, constructResultValue("Email:", expected));
    }

    public static void assertCurrentAddress(final String actual, final String expected) {
        Assert.assertEquals(actual, constructResultValue("Current Address :", expected));
    }

    public static void assertPermanentAddress(final String actual, final String expected) {
        Assert.assertEquals(actual, constructResultValue("Permananet Address :", expected));
    }

    private static String constructResultValue(final String defaultValue, final String inputValue) {
        return String.format("%s%s", defaultValue, inputValue);
    }
}
