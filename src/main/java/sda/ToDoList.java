package sda;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ToDoList {

    private static List<Task> tasks = new ArrayList<>(); //lista zadan

    public static void addTask(Task task){ //dodaje liste
        tasks.add(task);
    }

    public List<Task> getTasks(){  //zwraca liste
        return tasks;
    }

    public List<Task> getTasksComp (Comparator<Task> taskComparator){
        tasks.sort(taskComparator);
        return tasks;
    }

    public List<Task>taskListComp(Comparator<Task> comp, KOLEJNOSC ASC_or_DESC){
        if(ASC_or_DESC.name().equalsIgnoreCase("ASC")) {
            tasks.sort(comp);
        }else if(ASC_or_DESC.name().equalsIgnoreCase("DESC")){
            tasks.sort(comp.reversed());
        }
        return tasks;
    }
}

