package mid.sec5.ex1;

import java.util.Scanner;

public class AuthGradeMain2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("당신의 등급을 입력하세요 [GUEST, LOGIN, ADMIN]: ");
        String input = sc.nextLine();
        AuthGrade grade = AuthGrade.valueOf(input.toUpperCase());

        if (grade != null){
            System.out.println("당신의 등급은 " + grade.getDescription() + "입니다.");
        }

        if (grade.getLevel() > 0 ){
            System.out.println("== 메뉴 목록 ==");
            System.out.println("- 메인화면");
        }

        if (grade.getLevel() > 1){
            System.out.println("- 이메일 관리 화면");
        }

        if (grade.getLevel() > 2){
            System.out.println("- 관리자 화면");
        }

    }

    public void gradeName(AuthGrade grade){

    }
}