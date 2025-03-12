class display{
    private String name;
    int x;

    private void show(){
        System.out.println(name);
    }
    public void set(String str){
        name=str;
        show();
    }
    public String get(){
        return name;
    }
}
public class modifiers{
    public static void main(String[] args) {
        display dis=new display();
        dis.set("siva");
        String stu2=dis.get();
        System.out.println(stu2);
    }
}
