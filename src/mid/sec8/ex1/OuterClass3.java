package mid.sec8.ex1;

public class OuterClass3 {
    public void myMethod(){

        class LocalClass {
            public void hello(){
                System.out.println("지역클래스.hello");
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.hello();
    }
}
