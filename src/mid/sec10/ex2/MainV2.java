package mid.sec10.ex2;

import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) throws NetworkClientExceptionV2 {

        NetworkService2_1 service1 = new NetworkService2_1();
        NetworkService2_3 service3 = new NetworkService2_3();

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("전송할 문자 : ");
            String input = sc.nextLine();

            if (input.equals("exit")){
                break;
            }

//            service.sendMsg(input);
            service3.sendMsg(input);
            System.out.println();
        }
        System.out.println("프로그램 정상 종료");
    }
}
