package basic.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductOrderMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = 1;

        String productName = "";
        int price = 0;
        int amount = 0;

        System.out.print("입력할 주문의 개수 입력 : "); int orderAmount = sc.nextInt();
        ProductOrder[] orders = new ProductOrder[orderAmount];
        while (i <= orderAmount){

            System.out.println(i + "번째 주문 정보 입력");
            System.out.print("상품명 : "); productName = sc.next();
            System.out.print("가격 : "); price = sc.nextInt();
            System.out.print("수량 : "); amount = sc.nextInt();
            orders[i-1] = ProductOrder.createOrder(productName, price, amount);
            i++;
        }

        ProductOrder.printOrders(orders);
        ProductOrder.getTotalAmount(orders);


//        orders[0] = ProductOrder.createOrder("두부", 2000, 2);
//        orders[1] = ProductOrder.createOrder("김치", 5000, 1);
//        orders[2] = ProductOrder.createOrder("콜라", 1500, 2);
//
//        ProductOrder.printOrders(orders);
//        ProductOrder.getTotalAmount(orders);
    }
}
