package lesson2;

import java.util.Scanner;

public class Activity22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so n");
        int n = scanner.nextInt();

        // tinh n + nn + nnn = n(1+11+111)
        int sum = n *(1+11+111);
//        System.out.printf("%d + %d%d+ %d%d%d = %d",n,n,n,n,n,n,sum);
        System.out.println(n + "+" + 11*n + "+" + 111*n + "=" + n*123);

    }
}
