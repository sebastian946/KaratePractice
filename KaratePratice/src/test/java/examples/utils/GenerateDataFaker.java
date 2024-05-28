package examples.utils;

import net.datafaker.Faker;

public class GenerateDataFaker {
    public static Faker dataFaker(){
        Faker faker = new Faker();
        return faker;
    }
}
