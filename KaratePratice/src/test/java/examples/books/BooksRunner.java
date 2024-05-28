package examples.books;

import com.intuit.karate.junit5.Karate;
import net.datafaker.Faker;

public class BooksRunner {
    Faker faker = new Faker();
    @Karate.Test
    Karate bookRunner(){
        return Karate.run("books").relativeTo(getClass());
    }
}
