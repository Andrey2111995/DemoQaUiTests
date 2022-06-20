package providers.textBoxProviders;

import org.testng.annotations.DataProvider;

import static utils.StringUtils.*;

public final class TextBoxNegativeProviders {

    @DataProvider
    public static Object[][] providerIncorrectEmail() {
        return new Object[][]{
                {randomEnglishLowerCaseString(5)},
                {randomEnglishUpperCaseString(5)},
                {randomRussianLowerCaseString(5)},
                {randomRussianUpperCaseString(5)},
                {randomNumberString(5)},
                {"example@"},
                {"example@text"},
                {"example@text."},
                {"example.com"}
        };
    }
}
