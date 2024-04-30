package basic.sec12.ex1;

public class EmailSender implements Sender{

    @Override
    public void sendMessage(String msg) {
        System.out.println("메일 발송 : " + msg);
    }
}
