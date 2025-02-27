import dz13.Book;
import dz9.Poster;
import org.example.dz2.SqrtService;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Book book = new Book();
        book.setPrice(12_000);
        System.out.println(book.isTooExpensive());

    }
}