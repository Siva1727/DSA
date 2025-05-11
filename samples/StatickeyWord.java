class StaticKeyWord{
    public static void main(String[] args) {
        // Daughter d=new Daughter();
        // System.out.println(d.gender);   
        Father.print();
    }
}
class Father{
    char gender='m';
    static void print(){
        System.out.println("parent Class");
    }
}
class Daughter extends Father{
    char gender='f';
}