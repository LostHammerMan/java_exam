package basic.sec12.ex2;

public class KakaoPay implements Pay{

    @Override
    public boolean pay(int amount) {

        System.out.println("카카오 시스템과 연결...");
        System.out.println(amount + "원 결제를 시도함");
        return true;
    }
}
