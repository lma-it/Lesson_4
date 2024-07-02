package OOP_Task2_MediaPlayer;

import java.util.List;
import java.util.ArrayList;

public class Repository<T extends Content> {
    List<T> ds;
    
    private String name;

    public Repository(String name) {
        this.ds = new ArrayList<>();
        this.name = name;
        System.out.printf("\n  >>  %s created\n", this.name);
    }

    public void add(T content){
        ds.add(content);
    }

    public int getSize(){
        return ds.size();
    }

    public T getDs(int index) {
        return ds.get(index);
    }
}
