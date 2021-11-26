package lesson2;

import java.util.Scanner;

public class Activity23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so n");
        int n = sc.nextInt();

        for (int i = 1; i < 11; i++) {
            int rs = n*i;
            System.out.println(n + "x" + i +" = "+ rs);
        }

    }
}
