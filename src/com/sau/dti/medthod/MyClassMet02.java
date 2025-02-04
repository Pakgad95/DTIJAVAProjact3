package com.sau.dti.medthod;

public class MyClassMet02 {
    //ประเภทของ Method
    // 1 ไม่มีพารามิเตอร์ ไม่มีรีเทิร์น
    public static void  showWow() {
        System.out.println("Woow wow wow");
    }
    //2 มี พารามิเตอรื แต่ไม่มีรีเทิร์น
    public static void sumNumber(int num1, int num2) {
        System.out.println(num1 + num2);

    }
    //3 ไม่มีพารามิเตอร์ มีรีเทิร์น
    public static String showsawadee() {
        return "Swaddeee jaaaaaaaaaaaaa....";

    }
    //4.มีพารามิเตอร์ มีรีเทิร์น
    public static double calpowNumber(int a, int b) {
        return Math.pow(a,b);
    }

    public static void main(String[] args) {
        showWow();

        sumNumber(10,20); //ค่าที่ส่งให้ parameter เรียกว่า argument
        sumNumber(100,200);

        //--------------------------
        System.out.println(showsawadee());
        String data = showsawadee();
        System.out.println(data + "NinniN");

        System.out.println(calpowNumber(10, 2));
        double result = calpowNumber(5,3);
        System.out.println("5^3 = " + result);


    }
}
