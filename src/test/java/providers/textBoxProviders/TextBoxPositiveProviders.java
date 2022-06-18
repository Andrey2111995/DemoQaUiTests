package providers.textBoxProviders;

import org.testng.annotations.DataProvider;

import static utils.StringUtils.*;

public final class TextBoxPositiveProviders {

    @DataProvider
    public static Object[][] englishProviderAllFields() {
        return new Object[][]{
                {randomEnglishLowerCaseString(5), randomEmail(), randomEnglishLowerCaseString(5), randomEnglishLowerCaseString(5)},
                {randomEnglishUpperCaseString(5), randomEmail(), randomEnglishUpperCaseString(5), randomEnglishLowerCaseString(5)}
        };
    }

    @DataProvider
    public static Object[][] russianProviderAllFieldsExceptEmail() {
        return new Object[][]{
                {randomRussianLowerCaseString(5), randomEmail(), randomRussianLowerCaseString(5), randomRussianLowerCaseString(5)},
                {randomRussianLowerCaseString(5), randomEmail(), randomRussianLowerCaseString(5), randomRussianLowerCaseString(5)}
        };
    }
}
