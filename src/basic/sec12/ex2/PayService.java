package basic.sec12.ex2;

public class PayService {

    public void processPay(String option, int amount){

        System.out.println("결제 시작 : option= " + option +
                ", amount= " + amount);

        Pay pay = PayStore.findPay(option);
        boolean result = pay.pay(amount);

        if (result){
            System.out.println("결제성공");
        }else {
            System.out.println("결제 실패");
        }
    }
}
