import java.util.*;
public class insertion_using_A{
    public void Enqueue(int value,int front,int rear,int size,int[] queue){
        if(rear==size-1){
            System.out.println("queue is full");
        }else{
            if(front==-1){
                front=0;
            }
            rear++;
            queue[rear]=value;
            System.out.println("inserted: "+value);
        }
    }
    public static void main(String args[]){
        insertion_using_A x=new insertion_using_A();
        int[] queue=new int[4];
        x.Enqueue(4,-1,-1,4,queue);
    }
}