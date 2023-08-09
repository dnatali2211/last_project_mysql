package ru.netology.last_project_mysql.test;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.netology.last_project_mysql.data.DataHelper;
import ru.netology.last_project_mysql.data.SQLHelper;
import ru.netology.last_project_mysql.page.PaymentPage;

import static com.codeborne.selenide.Selenide.open;
import static ru.netology.last_project_mysql.data.SQLHelper.cleanDataBase;

public class TravelFormTest {
    @BeforeAll
    static void setUpAll() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterAll
    static void tearDownAll() {
        SelenideLogger.removeListener("allure");
    }
    @AfterAll
    static void teardown() {
        cleanDataBase();
    }

    @Test
    @DisplayName("Should successfully payment with approved card")
    void successfullyPaymentWithApprovedCard() {
        var paymentPage = open("http://localhost:8080", PaymentPage.class);
        var buyerInfo = DataHelper.withApprovedCard();
        paymentPage.verifySuccessNotificationVisibility();
        var statusCard = SQLHelper.getStatusCard();
    }
}
