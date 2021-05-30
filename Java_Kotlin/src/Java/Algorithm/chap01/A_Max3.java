package Java.Algorithm.chap01;

import java.util.Scanner;

public class A_Max3 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scan = new Scanner(System.in);

        System.out.println("세 정수의 최댓값을 구합니다.");
        System.out.print("a의 값 : "); int a = scan.nextInt();
        System.out.print("b의 값 : "); int b = scan.nextInt();
        System.out.print("c의 값 : "); int c = scan.nextInt();

        int max = a;

        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println("최댓값은 " + max + "입니다.");

        System.out.println("========");

        Boolean bool = scan.nextBoolean();
        System.out.println(bool);
    }

}
