package basic.sec12.ex1;

public class SmsSender implements Sender{

    @Override
    public void sendMessage(String msg) {
        System.out.println("SMS 발송 : " + msg);
    }
}
