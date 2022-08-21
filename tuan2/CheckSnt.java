package tuan2;

import java.util.Scanner;

public class CheckSnt {

    public boolean Snt(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int number;
        System.out.println("So kiem tra");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        CheckSnt ck = new CheckSnt();
        if (ck.Snt(number))
            System.out.println("Day la so nguyen to");
        else
            System.out.println("Day khong la so nguyen to");

    }
}
