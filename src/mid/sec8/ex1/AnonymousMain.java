package mid.sec8.ex1;

public class AnonymousMain {
    public static void main(String[] args) {

        // 익명 클래스
        Hello hello = new Hello() {
            @Override
            public void hello() {
                System.out.println("Hello.hello");
            }
        };
    }
}
