public class peek {
    void peek(int front,int rear,int[] queue){
        if(rear==-1){
            System.out.println("queue is empty");
        }else{
            System.out.println("starting element is: "+queue[front]);
        }
    }
    public static void main(String args[]){
        int[] queue=new int[4];
        peek z=new peek();
        z.peek(-1,-1,queue);
    }
}
