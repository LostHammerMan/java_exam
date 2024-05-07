package mid.sec5.ex2;

import java.util.Scanner;

public class HttpStatusMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Http Code : ");
        int httpInput = sc.nextInt();

        HttpStatus status = HttpStatus.findByCode(httpInput);

        if (status == null){
            System.out.println("정의되지 않은 코드");
        }else {
            System.out.println(status.getCode() + " " + status.getMessage());
            System.out.println("isSucess = " + status.isSuccess());
        }
    }
}
