package sda;


import org.apache.log4j.Logger;

import java.time.LocalDateTime;
import java.util.*;


import static sda.BubbleSort.bubbleSort;

public class App {

    private static final Logger log = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
log.info("Log o poziomie info generuje wartości");
log.warn("Log o poziomie warning");

//Prime pierwsza = new Prime();
//
//pierwsza.isPrime();
//
//        List<Task> listaZadan = Arrays.asList(new Task(Priorytet.WYSOKI, "salon",
//                "umyc okna",Status.NOWE, LocalDateTime.now()),
//                new Task(Priorytet.WYSOKI, "salon", "odkurzyc", Status.W_TRAKCIE_REALIZACJI,
//                        LocalDateTime.now()),
//                new Task(Priorytet.NISKI, "lazienka", "umyc wanne", Status.NOWE, LocalDateTime.now()));

//        System.out.println(listaZadan);
//        Collections.sort(listaZadan);
//        System.out.println(listaZadan);
//
//        ToDoList toDoList = new ToDoList();
//        ToDoList.addTask(new Task(Priorytet.KRYTYCZNY, "korytarz", "pomalowac szafe",
//                Status.W_TRAKCIE_REALIZACJI, LocalDateTime.now()));
//        ToDoList.addTask((new Task(Priorytet.NISKI, "kuchnia", "obrac ziemniaki", Status.ZAKONCZONE,
//                LocalDateTime.now())));
//        ToDoList.addTask(new Task(Priorytet.WYSOKI, "strych", "powbijac deski",
//                Status.NOWE, LocalDateTime.now()));
//        ;
//        System.out.println(toDoList.getTasks());
//        System.out.println(toDoList.getTasksComp(TaskSorting.sortByName()));
//      System.out.println(toDoList.getTasksComp(TaskSorting.sortByDate()));
//      System.out.println(toDoList.getTasksComp(TaskSorting.sortByPriority()));
//        System.out.println(toDoList.getTasksComp(TaskSorting.sortyByDateAndPriority()));


//BubbleSort b = new BubbleSort();
//        int [] arr = {4, 7, 9, 1, 3, 5, 52, 91, 2, 0};
//
//        System.out.println("Array Before Bubble Sort");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//b.bubbleSort(arr);
//
//        System.out.println("Array After Bubble Sort");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//
//        }


//losowanie 10 z 100 liczb, przypisywanie do parzystych lub nie:
//        Random random = new Random();
//        int liczby = 20;
//        List<Integer> odd = new ArrayList<>();
//        List<Integer> even = new ArrayList<>();
//
//        while (odd.size() < 10 || even.size() < 10) {
//            for (int i = 1; i <= liczby; i++) {
//                int temp = random.nextInt(100) + 1;
//                if (temp % 2 == 0 && even.size() < 10) {
//                    even.add(temp);
//                }
//                if (temp % 2 != 0 && odd.size() < 10) {
//                    odd.add(temp);
//                }
//            }
//        }
//        System.out.println("Liczby parzyste: " + even);
//        System.out.println("Liczby nieparzyste: " + odd);
//
//        Integer[] sortedEven = sort(even);
//        for (int i = 0; i < sortedEven.length; i++) {
//            System.out.println(sortedEven[i]);
//        }
//    }
//
//    // sortowanie przez wybieranie:
//
//    public static Integer[] sort(List<Integer> list) {
//        Integer[] values = new Integer[list.size()];
//        list.toArray(values);
//        for (int i = 0; i <= values.length - 1; i++) {
//            int min = values[i];
//            int minIndex = i;
//            for (int j = i; j <= values.length - 1; j++) {
//                if (values[j] <= min) {
//                    min = values[j];
//                    minIndex = j;
//                }
//            }
//            int temp = values[i];
//            values[i] = min;
//            values[minIndex] = temp;
//        }
//        return values;
    }
}








