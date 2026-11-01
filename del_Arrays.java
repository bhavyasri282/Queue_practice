public class del_Arrays {
    public void dequeue(int front,int rear,int size,int[] queue){
        if(rear==-1){
            System.out.println("queue is empty");
        }
        else{
            System.out.println("deleted: "+queue[front]);
            if(front==rear){
                front=-1;
                rear=-1;
            }
            else{
                front++;
            }
        }
    }
    public static void main(String args[]){
        int[] queue=new int[4];
        del_Arrays y=new del_Arrays();
        y.dequeue(-1,-1,4,queue);
    }
}
