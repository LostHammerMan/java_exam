package mid.sec10.ex3;

import mid.sec10.ex3.exception.ConnectExceptionV3;
import mid.sec10.ex3.exception.NetworkClientExceptionV3;
import mid.sec10.ex3.exception.SendExceptionV3;

public class NetworkClientV3 {

    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV3(String address) {
        this.address = address;
    }

    public void connect() throws ConnectExceptionV3 {
        if (connectError){
            throw new ConnectExceptionV3("connectError", address + "서버 연결 실패");
        }

        System.out.println("서버 연결 성공");
    }

    public void send(String data) throws SendExceptionV3 {
        if (sendError){
            throw new SendExceptionV3("sendError", address + " 서버에 데이터" +
                    "전송 실패");
        }

        System.out.println(address + " 서버에 데이터 전송 " + data);
    }

    public void disConnect(){
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data){
        if (data.contains("error1")){
            connectError = true;
        }

        if (data.contains("error2")){
            sendError = true;
        }
    }
}
