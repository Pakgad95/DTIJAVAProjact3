package com.sau.dti.medthod;

public class MyclassMet01 {
    //method คือ function คือ การทำงานหนึ่งๆ ที่จะไม่ทำหากไม่เรียกใช้ (call method)

    public static void showHi( ){
        System.out.println("Hi..........");

    }
    public static void showHey( ) {
        System.out.println("Hey..........");
    }

    public static void main(String[] args) {
        showHey();
        showHi();
    }

}
