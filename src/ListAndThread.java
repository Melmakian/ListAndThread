import java.util.ArrayList;
import java.util.List;

public class ListAndThread {
    public static volatile List<Thread> list =  new ArrayList<>(5);
    public static void main(String[] args) {
        SpecialThread o1 = new SpecialThread();
        Thread n1 = new Thread(o1);
        list.add(n1);

        for (int i = 0; i <4 ; i++) {
            list.add(new Thread(new SpecialThread()));
        }
    }
    public static class SpecialThread implements Runnable{
        public void run(){
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
