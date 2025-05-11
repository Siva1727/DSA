// using arr;
class st_impl{
    static int top = -1;
    static int[]st= new int[10];
    static void push(int x){
        if(top >= st.length-1){
            System.out.print("Stack overflow");
            return ;
        }
        top = top+1;
        st[top] = x ;

    }

    static void pop(){
        if(top == -1){
            System.out.print("Np element to pop ");
            return ;
        }
        top = top-1;
    }
    static int  peek(){
        if(top == -1){
            System.out.print("No elements in stack");
            return -1;
        }
        return st[top];
    }

    static int size(){
        return top+1;
    }
    static void display(){
        for(int i=0;i<=top;i++){
            System.out.print(st[i]+" ");
        }
        System.out.println();
    }
}

class stack_implementation{
    public static void main(String[] args) {
        st_impl.push(5);
        st_impl.push(6);
        st_impl.push(7);
        st_impl.push(8);
        st_impl.display();
        st_impl.pop();
        st_impl.display();
        System.out.println(st_impl.peek());
        System.out.println(st_impl.size());


    }
}