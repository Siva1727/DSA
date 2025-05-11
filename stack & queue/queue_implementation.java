class queue_impl{
        static int cur_size = 0;
        static int max = 5;
        static int[]qu= new int[max];
        static int st=-1,end=-1;
        static void add(int x){
            if(cur_size == max){
                System.out.println("Queue overflow");
                return ;
            }
            if(st == -1){ //or end == -1
                st = 0;
                end = 0;
            }
            else{
                end  = (end+1)%max;
            }
            qu[end] = x;
            cur_size++;
        }

        static void remove(){
            if(cur_size == 0){
                System.out.println("Queue is empty");
                return ;
            }
            if(cur_size == 1){
                st = -1;
                end = -1;
            }
            else{
                st = (st+1)%max;
            }
            cur_size --;

        }
        static int  peek(){
            if(cur_size == 0){
                System.out.println("Queue is empty");
                return -1;
            }
            return qu[st];
        }

        static int size(){
            return cur_size;
        }
        static void display(){
            if(cur_size == 0){
                System.out.println("Queue is empty");
                return ;
            }
            for(int i=0;i<cur_size;i++){
                System.out.print(qu[(st+i)%max] +" ");
            }
            System.out.println();
        }
}




public class queue_implementation {
    public static void main(String[] args) {
        queue_impl.add(5);
        queue_impl.add(6);
        queue_impl.add(7);
        queue_impl.add(8);
        //queue_impl.add(9);

        queue_impl.display();
        queue_impl.remove();
        queue_impl.display();
        System.out.println(queue_impl.peek());
        System.out.println(queue_impl.size());
    }
}
