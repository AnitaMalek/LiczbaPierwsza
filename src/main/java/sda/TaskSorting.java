package sda;

import java.util.Comparator;

public class TaskSorting {

    public static Comparator<Task> sortByName() {
        Comparator<Task> sortByName = new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                int result = o1.getNazwa().compareTo(o2.getNazwa());
                return result;
            }
        };
        return sortByName;
    }

    public static Comparator<Task> sortByDate() {
        Comparator<Task> sortByDate = new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                int result = o1.getDataUtworzenia().compareTo(o2.getDataUtworzenia());
                return result;
            }
        };
        return sortByDate;
    }

    public static Comparator<Task> sortByPriority() {
        Comparator<Task> sortByPriority = new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                int result = o1.getPriorytet().compareTo(o2.getPriorytet());
                return result;
            }
        };
        return sortByPriority;
    }


    public static Comparator<Task> sortyByDateAndPriority() {
        Comparator<Task> sortByDateAndPriority = new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                int result = o1.getDataUtworzenia().compareTo(o2.getDataUtworzenia());
                if (result == 0) {
                    return o1.getPriorytet().compareTo(o2.getPriorytet());

                }
                return result;
            }
        };
        return sortByDateAndPriority;
    }


}


