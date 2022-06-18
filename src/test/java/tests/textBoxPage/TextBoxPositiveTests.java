package tests.textBoxPage;

import org.testng.annotations.Test;
import providers.textBoxProviders.TextBoxPositiveProviders;
import utils.TextBoxAssertUtils;

public class TextBoxPositiveTests extends BaseTestClass {


    @Test(dataProviderClass = TextBoxPositiveProviders.class, dataProvider = "englishProviderAllFields")
    public void checkEnglishSymbolsSuccessRegister(String fullName, String email, String currentAddress, String permanentAddress) {
        textBoxPage.register(fullName, email, currentAddress, permanentAddress);

        TextBoxAssertUtils.assertName(textBoxPage.getName(), fullName);
        TextBoxAssertUtils.assertEmail(textBoxPage.getEmail(), email);
        TextBoxAssertUtils.assertCurrentAddress(textBoxPage.getCurrentAddress(), currentAddress);
        TextBoxAssertUtils.assertPermanentAddress(textBoxPage.getPermanentAddress(), permanentAddress);
    }

    @Test(dataProviderClass = TextBoxPositiveProviders.class, dataProvider = "russianProviderAllFieldsExceptEmail")
    public void checkRussianSymbolsSuccessRegister(String fullName, String email, String currentAddress, String permanentAddress) {
        textBoxPage.register(fullName, email, currentAddress, permanentAddress);

        TextBoxAssertUtils.assertName(textBoxPage.getName(), fullName);
        TextBoxAssertUtils.assertEmail(textBoxPage.getEmail(), email);
        TextBoxAssertUtils.assertCurrentAddress(textBoxPage.getCurrentAddress(), currentAddress);
        TextBoxAssertUtils.assertPermanentAddress(textBoxPage.getPermanentAddress(), permanentAddress);
    }
}
