import java.util.*;
public class deletion{
    public static void main(String args[]){
        Queue<Integer> q=new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        int remove=q.poll();
        System.out.println(q);
        System.out.println(remove);
    }
}