package providers.textBoxProviders;

import org.testng.annotations.DataProvider;

import java.util.Random;

import static utils.StringUtils.*;

public final class TextBoxPositiveProviders {

    private static final int START = 5;
    private static final int STOP = 10;

    @DataProvider
    public static Object[][] englishProviderAllInputs() {
        return new Object[][]{
                {randomEnglishLowerCaseString(generateRandomIntValue()),
                        randomEmailLowerCase(),
                        randomEnglishLowerCaseString(generateRandomIntValue()),
                        randomEnglishLowerCaseString(generateRandomIntValue())},
                {randomEnglishUpperCaseString(generateRandomIntValue()),
                        randomEmailUpperCase(),
                        randomEnglishUpperCaseString(generateRandomIntValue()),
                        randomEnglishUpperCaseString(generateRandomIntValue())}
        };
    }

    @DataProvider
    public static Object[][] russianProviderAllInputsExceptEmail() {
        return new Object[][]{
                {randomRussianLowerCaseString(generateRandomIntValue()),
                        randomEmailLowerCase(),
                        randomRussianLowerCaseString(generateRandomIntValue()),
                        randomRussianLowerCaseString(generateRandomIntValue())},
                {randomRussianUpperCaseString(generateRandomIntValue()),
                        randomEmailUpperCase(),
                        randomRussianUpperCaseString(generateRandomIntValue()),
                        randomRussianUpperCaseString(generateRandomIntValue())}
        };
    }

    @DataProvider
    public static Object[][] arabicNumberProviders() {
        return new Object[][] {
                {randomNumberString(1),
                        randomEmailOfArabicNumbers(),
                        randomNumberString(1),
                        randomNumberString(1)
                },
                {randomNumberString(generateRandomIntValue()),
                        randomEmailOfArabicNumbers(),
                        randomNumberString(generateRandomIntValue()),
                        randomNumberString(generateRandomIntValue())
                }
        };
    }

    private static int generateRandomIntValue() {
        return new Random().nextInt(STOP - START + 1) + START;
    }
}
