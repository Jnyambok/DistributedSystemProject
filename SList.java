import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SList {
    private ArrayList<ObjectOutputStream> list;

    SList() {
        list = new ArrayList<ObjectOutputStream>();
    }

    synchronized ObjectOutputStream get(int i) {
        return list.get(i);
    }

    synchronized void add(ObjectOutputStream o) {
        list.add(o);
    }

    synchronized int size() {
        return list.size();
    }

    synchronized void remove(ObjectOutputStream o) {
        list.remove(o);
    }
}