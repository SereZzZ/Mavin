import dz13.Book;
import dz13.Product;
import dz9.Poster;
import org.example.dz2.SqrtService;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Product book = new Book(
                1,
                "Гоша",
                10_001,
                "Гоша рубчинский",
                120,
                1999

        );
        book.setPrice(book.getPrice());
        System.out.println(book.isTooExpensive());
        book.use();

    }
}