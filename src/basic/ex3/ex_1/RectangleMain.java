package basic.ex3.ex_1;

import java.util.Scanner;

public class RectangleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

//        System.out.print("가로 : ");
//        int width = sc.nextInt();
//
//        System.out.print("세로 : ");
//        int height = sc.nextInt();

//        rectangle.print(width, height);
        rectangle.print(5, 8);
        System.out.println(rectangle.isSquare(5, 8));
    }




}
