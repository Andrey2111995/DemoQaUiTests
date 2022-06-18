package providers.textBoxProviders;

import org.testng.annotations.DataProvider;

import java.util.Random;

import static utils.StringUtils.*;

public final class TextBoxPositiveProviders {

    private static final int START = 5;
    private static final int STOP = 10;
    private static final Random RANDOM = new Random();


    @DataProvider
    public static Object[][] englishProviderAllFields() {
        return new Object[][]{
                {randomEnglishLowerCaseString(generateRandomIntValue()),
                        randomEmail(),
                        randomEnglishLowerCaseString(generateRandomIntValue()),
                        randomEnglishLowerCaseString(generateRandomIntValue())},
                {randomEnglishUpperCaseString(generateRandomIntValue()),
                        randomEmail(),
                        randomEnglishUpperCaseString(generateRandomIntValue()),
                        randomEnglishLowerCaseString(generateRandomIntValue())}
        };
    }

    @DataProvider
    public static Object[][] russianProviderAllFieldsExceptEmail() {
        return new Object[][]{
                {randomRussianLowerCaseString(generateRandomIntValue()),
                        randomEmail(),
                        randomRussianLowerCaseString(generateRandomIntValue()),
                        randomRussianLowerCaseString(generateRandomIntValue())},
                {randomRussianLowerCaseString(generateRandomIntValue()),
                        randomEmail(),
                        randomRussianLowerCaseString(generateRandomIntValue()),
                        randomRussianLowerCaseString(generateRandomIntValue())}
        };
    }

    private static int generateRandomIntValue() {
        return RANDOM.nextInt(STOP - START + 1) + START;
    }
}
