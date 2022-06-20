package tests.textBoxPage;

import org.testng.annotations.Test;
import providers.textBoxProviders.TextBoxNegativeProviders;

import static org.testng.Assert.assertEquals;

public class TextBoxNegativeTests extends BaseTestClass {

    @Test(dataProviderClass = TextBoxNegativeProviders.class, dataProvider = "providerIncorrectEmail")
    public void checkIncorrectEmailInput(String email) {
        final String expectedResult = "mr-sm-2 field-error form-control";
        textBoxPage.inputEmail(email);
        textBoxPage.sendForm();
        final String actualResult = textBoxPage.getClassAttributeEmailInput();

        assertEquals(actualResult, expectedResult);
    }
}
