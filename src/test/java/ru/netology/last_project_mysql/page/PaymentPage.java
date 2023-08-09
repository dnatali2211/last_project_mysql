package ru.netology.last_project_mysql.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class PaymentPage {
private final SelenideElement buyButton = $ ("button button_size_m button_theme_alfa-on-white");
private final SelenideElement cardNumberField = $ ("input__control[placeholder='0000 0000 0000 0000']");
private final SelenideElement monthField = $ ("input__control[placeholder='08']");
private final SelenideElement yearField = $ ("input__control[placeholder='22']");
private final SelenideElement nameField = $ ("span.input__inner > span.input__box > input.input__control");
private final SelenideElement codeField = $ ("input__control[placeholder='999']");
private final SelenideElement agreeButton = $ ("button button_view_extra button_size_m button_theme_alfa-on-white");
private final SelenideElement successNotification = $ ("notification notification_status_ok notification_has-closer notification_stick-to_right notification_theme_alfa-on-white");
private final SelenideElement errorNotification = $ ("notification notification_visible notification_status_error notification_has-closer notification_stick-to_right notification_theme_alfa-on-white");

public void verifySuccessNotificationVisibility() {
    successNotification.shouldBe(Condition.visible);
}
public void verifyErrorNotificationVisibility() {
    errorNotification.shouldBe(Condition.visible);
}
public void findSuccessNotificationVisibility(String expectedText) {
    successNotification.shouldHave(Condition.exactText(expectedText), Duration.ofSeconds(15)).shouldBe(Condition.visible);
}
public void findErrorNotificationVisibility(String expectedText) {
    errorNotification.shouldHave(Condition.exactText(expectedText), Duration.ofSeconds(15)).shouldBe(Condition.visible);
}
}
