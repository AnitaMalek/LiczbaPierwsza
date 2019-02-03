package sda;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App
{
    public static void main( String[] args ) {


//Prime pierwsza = new Prime();
//
//pierwsza.isPrime();
//
        List<Task> listaZadan = Arrays.asList(new Task(Priorytet.WYSOKI, "salon",
                "umyc okna",Status.NOWE, LocalDateTime.now()),
                new Task(Priorytet.WYSOKI, "salon", "odkurzyc", Status.W_TRAKCIE_REALIZACJI,
                        LocalDateTime.now()),
                new Task(Priorytet.NISKI, "lazienka", "umyc wanne", Status.NOWE, LocalDateTime.now()));

//        System.out.println(listaZadan);
//        Collections.sort(listaZadan);
//        System.out.println(listaZadan);

        ToDoList toDoList = new ToDoList();
        ToDoList.addTask(new Task(Priorytet.KRYTYCZNY, "korytarz", "pomalowac szafe",
                Status.W_TRAKCIE_REALIZACJI, LocalDateTime.now()));
        ToDoList.addTask((new Task(Priorytet.NISKI, "kuchnia", "obrac ziemniaki", Status.ZAKONCZONE,
                LocalDateTime.now())));
        ToDoList.addTask(new Task(Priorytet.WYSOKI, "strych", "powbijac deski",
                Status.NOWE, LocalDateTime.now()));
        ;
//        System.out.println(toDoList.getTasks());
//        System.out.println(toDoList.getTasksComp(TaskSorting.sortByName()));
//      System.out.println(toDoList.getTasksComp(TaskSorting.sortByDate()));
//      System.out.println(toDoList.getTasksComp(TaskSorting.sortByPriority()));
        System.out.println(toDoList.getTasksComp(TaskSorting.sortyByDateAndPriority()));

    }
}


