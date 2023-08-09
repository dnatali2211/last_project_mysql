package ru.netology.last_project_mysql.data;

import com.github.javafaker.Faker;
import lombok.Value;

import java.util.Locale;

public class DataHelper {
    private static Faker faker = new Faker(new Locale("en"));

    private DataHelper() {
    }

    public static BuyTour withApprovedCard() {
        return new BuyTour("1111 2222 3333 4444", generateRandomMonth(), generateRandomYear(), generateRandomName(),generateRandomCode());
    }
    public static BuyTour withDeclinedCard() {
        return new BuyTour("5555 6666 7777 8888", generateRandomMonth(), generateRandomYear(), generateRandomName(),generateRandomCode());
    }
    public static String generateRandomCardNumber() {
        return faker.numerify("#### #### #### ####");
    }
    public static String generateRandomMonth() {
        return faker.numerify("##");
    }

    public static String generateRandomYear() {
        return faker.numerify("##");
    }

    public static String generateRandomName() {
        return faker.name().fullName();
    }

    public static String generateRandomCode() {
        return faker.numerify("###");
    }


    @Value
    public static class BuyTour {
        String cardNumber;
        String month;
        String year;
        String name;
        String code;
    }
    @Value
    public static class StatusCard {
        String status;
    }

}
