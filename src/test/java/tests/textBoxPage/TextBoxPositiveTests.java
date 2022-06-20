package tests.textBoxPage;

import org.testng.annotations.Test;
import providers.textBoxProviders.TextBoxPositiveProviders;

import static org.testng.Assert.assertFalse;
import static utils.TextBoxAssertUtils.*;

public class TextBoxPositiveTests extends BaseTestClass {

    @Test(dataProviderClass = TextBoxPositiveProviders.class, dataProvider = "englishProviderAllInputs")
    public void checkEnglishSymbolsSuccessRegister(String fullName, String email, String currentAddress, String permanentAddress) {
        textBoxPage.register(fullName, email, currentAddress, permanentAddress);

        assertName(textBoxPage.getName(), fullName);
        assertEmail(textBoxPage.getEmail(), email);
        assertCurrentAddress(textBoxPage.getCurrentAddress(), currentAddress);
        assertPermanentAddress(textBoxPage.getPermanentAddress(), permanentAddress);
    }

    @Test(dataProviderClass = TextBoxPositiveProviders.class, dataProvider = "russianProviderAllInputsExceptEmail")
    public void checkRussianSymbolsSuccessRegister(String fullName, String email, String currentAddress, String permanentAddress) {
        textBoxPage.register(fullName, email, currentAddress, permanentAddress);

        assertName(textBoxPage.getName(), fullName);
        assertEmail(textBoxPage.getEmail(), email);
        assertCurrentAddress(textBoxPage.getCurrentAddress(), currentAddress);
        assertPermanentAddress(textBoxPage.getPermanentAddress(), permanentAddress);
    }

    @Test(dataProviderClass = TextBoxPositiveProviders.class, dataProvider = "arabicNumberProviders")
    public void checkArabicNumbersSuccessRegister(String fullName, String email, String currentAddress, String permanentAddress) {
        textBoxPage.register(fullName, email, currentAddress, permanentAddress);

        assertName(textBoxPage.getName(), fullName);
        assertEmail(textBoxPage.getEmail(), email);
        assertCurrentAddress(textBoxPage.getCurrentAddress(), currentAddress);
        assertPermanentAddress(textBoxPage.getPermanentAddress(), permanentAddress);
    }

    @Test
    public void checkEmptyInputs() {
        textBoxPage.sendForm();

        assertFalse(textBoxPage.isDisplayedNameField());
        assertFalse(textBoxPage.isDisplayedEmailField());
        assertFalse(textBoxPage.isDisplayedCurrentAddressField());
        assertFalse(textBoxPage.isDisplayedPermanentAddress());
    }
}
