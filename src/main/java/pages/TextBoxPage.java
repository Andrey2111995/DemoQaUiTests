package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import static com.codeborne.selenide.Selenide.$x;

@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class TextBoxPage extends BasePage{
    private final SelenideElement fullNameInput = $x("//input[@id='userName']");
    private final SelenideElement emailInput = $x("//input[@id='userEmail']");
    private final SelenideElement currentAddressInput = $x("//textArea[@id='currentAddress']");
    private final SelenideElement permanentAddressInput = $x("//textArea[@id='permanentAddress']");
    private final SelenideElement submitButton = $x("//button[@id='submit' and @type='button']");
    private final SelenideElement nameField = $x("//p[@id='name']");
    private final SelenideElement emailField = $x("//p[@id='email']");
    private final SelenideElement currentAddressField = $x("//p[@id='currentAddress']");
    private final SelenideElement permanentAddressField = $x("//p[@id='permanentAddress']");
    // всплывающее сообщение для email

    public void inputFullName(final String fullName) {
        input(fullNameInput,fullName);
    }

    public void inputEmail(final String email) {
        input(emailInput, email);
    }

    public void inputCurrentAddress(final String currentAddress) {
        input(currentAddressInput, currentAddress);
    }

    public void inputPermanentAddress(final String permanentAddress) {
        input(permanentAddressInput, permanentAddress);
    }

    public void sendForm() {
        submitButton.scrollTo().click();
    }

    public void register(final String fullName, final String email, final String currentAddress, final String permanentAddress) {
        inputFullName(fullName);
        inputEmail(email);
        inputCurrentAddress(currentAddress);
        inputPermanentAddress(permanentAddress);
        sendForm();
    }

    public String getName() {
        return getContentOfElement(nameField);
    }

    public String getEmail() {
        return getContentOfElement(emailField);
    }

    public String getCurrentAddress() {
        return getContentOfElement(currentAddressField);
    }

    public String getPermanentAddress() {
        return getContentOfElement(permanentAddressField);
    }
}
