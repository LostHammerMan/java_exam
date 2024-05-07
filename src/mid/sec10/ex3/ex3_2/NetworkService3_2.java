package mid.sec10.ex3.ex3_2;

import mid.sec10.ex3.NetworkClientV3;
import mid.sec10.ex3.exception.ConnectExceptionV3;
import mid.sec10.ex3.exception.NetworkClientExceptionV3;
import mid.sec10.ex3.exception.SendExceptionV3;

public class NetworkService3_2 {

    public void sendMsg(String data){
        String address = "https://exam.com";

        NetworkClientV3 clientV3 = new NetworkClientV3(address);
        clientV3.initError(data);

        try {
            clientV3.connect();
            clientV3.send(data);
        }catch (ConnectExceptionV3 e){
            System.out.println("[연결 오류] 주소 : " + e.getAddress() + ", 메시지 : " + e.getMessage());
        }catch (NetworkClientExceptionV3 e){
            System.out.println("[네트워크 오류] 메시지: " + e.getMessage());
        }catch (Exception e){
            System.out.println("[알 수 없는 오류] 메시지: " + e.getMessage());
        }finally {
            clientV3.disConnect();
        }
    }
}
