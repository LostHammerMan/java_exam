package basic.sec12.ex2;

import java.util.Scanner;

public class PayMain1 {

    public static void main(String[] args) {
        PayService payService = new PayService();
        Scanner sc = new Scanner(System.in);

        System.out.print("결제 수단 입력 : ");
        String option = sc.next();

        if (option.equals("exit")){
            System.out.println("프로그램 종료");
            return;
        }

        System.out.print("결제 금액 입력 : ");
        int amount = sc.nextInt();

        System.out.println();

        payService.processPay(option, amount);

//        // 카카오 결제
//        String option1 = "kakao";
//        int amount1 = 5000;
//        payService.processPay(option1, amount1);
//
//        // 네이바 결제
//        String option2 = "naver";
//        int amount2 = 10000;
//        payService.processPay(option2, amount2);
//
//        // 잘못된 결제
//        String option3 = "bad";
//        int amount3 = 5000;
//        payService.processPay(option3, amount3);
    }
}
