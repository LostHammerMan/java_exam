package mid.sec5.ex1;

public class AuthGradeMain {
    public static void main(String[] args) {

        AuthGrade[] authGrade = AuthGrade.values();

        for (AuthGrade grade : authGrade)
            System.out.println("grade=" + grade + ", level=" + grade.getLevel() + ", 설명=" + grade.getDescription());

    }

}
