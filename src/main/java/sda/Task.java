package sda;


import java.time.LocalDateTime;

public class Task implements Comparable<Task>{

    private Enum priorytet;
    private String nazwa;
    private String opis;
    private Enum status;
    private LocalDateTime dataUtworzenia;

public Task(Enum priorytet, String nazwa, String opis, Enum status, LocalDateTime dataUtworzenia) {
    this.priorytet = priorytet;
    this.nazwa = nazwa;
    this.opis = opis;
    this.status = status;
    this.dataUtworzenia = dataUtworzenia;
}

//    @Override
//    public int compareTo(Task o) {
//        int result = this.nazwa.compareTo(o.nazwa);
//        if (result==0){
//            result = this.opis.compareTo(o.opis);
//        }
//        return result;
//    }

public int compareTo(Task o) {
    int result = this.priorytet.compareTo(o.priorytet);
    if (result==0) {
        result = this.nazwa.compareTo(o.nazwa);
    }
    if (result==0) {
        result = this.status.compareTo(o.status);
    }
    return result;
    }

    @Override
    public String toString() {
        return "Task{" +
                "priorytet=" + priorytet +
                ", nazwa='" + nazwa + '\'' +
                ", opis='" + opis + '\'' +
                ", status=" + status +
                ", dataUtworzenia=" + dataUtworzenia +
                '}';
    }
}


