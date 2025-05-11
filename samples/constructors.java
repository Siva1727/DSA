
class Sample{
    int rollno;
    int marks;
    Sample(int num , int mark){
        System.out.println("Hi bruhh...!!!");
        rollno=num;
        marks=mark;
    }

}
public class constructors {
    public static void main(String[] args) {
        Sample obj=new Sample(45,85);
        System.out.println(obj.rollno);
        System.out.println(obj.marks-5);
        
    }
    
}
