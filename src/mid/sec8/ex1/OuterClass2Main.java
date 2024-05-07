package mid.sec8.ex1;

public class OuterClass2Main {

    public static void main(String[] args) {
        OuterClass2 outerClass2 = new OuterClass2();
        OuterClass2.InnerClass2 inner = outerClass2.new InnerClass2();
        inner.hello();
    }
}
