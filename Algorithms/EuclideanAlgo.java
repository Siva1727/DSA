//package Algorithms;
class EuclideanAlgo{ 
    public static void main(String[] args) {
        int a =15; 
        int b = 10; // Euclidean : gcd( a , b ) = gcd(a-b , b)  , a > b ;
        int gcd = 1;
        while( a > 0 && b > 0){
            if( a > b){
                a = a % b;
            }
            else {
                b = b % a;
            }

            if(a == 0) gcd = b;
            else if(b == 0) gcd = a;
        }
        System.out.println("GCD : "+gcd);
    }
}