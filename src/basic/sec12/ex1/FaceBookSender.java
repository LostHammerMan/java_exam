package basic.sec12.ex1;

public class FaceBookSender implements Sender{

    @Override
    public void sendMessage(String msg) {
        System.out.println("페이스북 발송 : " + msg);
    }
}
