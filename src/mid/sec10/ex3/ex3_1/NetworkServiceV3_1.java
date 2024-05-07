package mid.sec10.ex3.ex3_1;

import mid.sec10.ex3.NetworkClientV3;
import mid.sec10.ex3.exception.ConnectExceptionV3;
import mid.sec10.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_1 {

    public void sendMsg(String data){
        String address = "https://exam.com";

        NetworkClientV3 clientV3 = new NetworkClientV3(address);

        clientV3.initError(data);

        try {
            clientV3.connect();
            clientV3.send(data);
        }catch (ConnectExceptionV3 e){
            System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메시지: " +
                    e.getMessage());
        }catch (SendExceptionV3 e){
            System.out.println("[연결 오류] 주소: " + e.getSendData() + ", 메시지: " +
                    e.getMessage());
        }finally {
            clientV3.disConnect();
        }
    }
}
