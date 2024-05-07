package mid.sec10.ex2;

public class NetworkService2_1 {

    public void sendMsg(String data) throws NetworkClientExceptionV2{

        String address = "https://ex.com";
        NetworkClientV2 clientV2 = new NetworkClientV2(address);
        clientV2.initError(data);

        try {
            clientV2.connect();
        }catch (NetworkClientExceptionV2 e){
            System.out.println("[오류] 코드 : " + e.getErrorCode() + ", 메시지: " +
                    e.getMessage());
            return;
        }

        try {
            clientV2.send(data);
        }catch (NetworkClientExceptionV2 e){
            System.out.println("[오류] 코드 : " + e.getErrorCode() + ", 메시지: " +
                    e.getMessage());
            return;
        }
        clientV2.disConnect();
    }
}
