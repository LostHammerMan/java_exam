package mid.sec10.ex4;

import mid.sec10.ex4.exception.SendExceptionV4;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        NetworkServiceV4 service = new NetworkServiceV4();

        while (true){
            System.out.print("전송할 문자 : ");
            String data = sc.nextLine();

            if (data.equals("exit")){
                break;
            }

            try {
                service.send(data);
            }catch (Exception e){
                exceptionalHandler(e);
            }
            System.out.println();
        }
        System.out.println("프로그램 정상 종료");

    }

    // 공통 예외 처리
    private static void exceptionalHandler(Exception e){
        System.out.println("사용자 메시지: 죄송 알수 없는 문제 발생");
        System.out.println("==== 개발자용 디버깅 =====");
        e.printStackTrace(System.err);

        if (e instanceof SendExceptionV4 sendExceptionV4){
            System.out.println("[전송 오류] 전송 데이터: " + sendExceptionV4.getSendData());
        }
    }
}
