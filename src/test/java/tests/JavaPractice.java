package tests;

public class JavaPractice {

    public static void main(String[] args) {
        Calculator cal = new Calculator();

        System.out.println( cal.sum(5,4));
        System.out.println( cal.sum(10,20,30));

        System.out.println(cal.sum(10.2,9,90));
        System.out.println(cal.sum(12,32.0));

        System.out.println(cal.sub(10,5));
        System.out.println(cal.sub(40,90,100));


        System.out.println(cal.sub(50,4));







    }




}


