package sda;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class App
{
    public static void main( String[] args ) {

        List<Task> listaZadan = Arrays.asList(new Task(Priorytet.WYSOKI, "mycie okien",
                "dokladnie wyczyscic uszczelki",Status.NOWE, LocalDateTime.now()),
                new Task(Priorytet.WYSOKI, "czyszczenie dywanu", "uzyc odkurzacza", Status.W_TRAKCIE_REALIZACJI,
                        LocalDateTime.now()),
                new Task(Priorytet.NISKI, "mycie naczyń", "umyc szklanki", Status.NOWE, LocalDateTime.now()));

        System.out.println(listaZadan);
        Collections.sort(listaZadan);
        System.out.println(listaZadan);

    }
}
