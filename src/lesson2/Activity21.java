package lesson2;

import java.util.Scanner;

public class Activity21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so a");
        int a = scanner.nextInt();
        System.out.println("Nhap vao so b");
        int b = scanner.nextInt();

        //tinh tong, hieu , tich , thuong , chia lay nguyen , chia lay du
//        System.out.println(a+" +"+b +" ="+(a+b));
        System.out.printf("%d + %d = %d \n",a,b,(a+b));
        System.out.printf("%d mod %d = %d",a,b,(a%b));
        System.out.printf("");
    }
}
