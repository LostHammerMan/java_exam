package mid.sec10.ex4;

public class NetworkServiceV4 {

    public void send(String data){
        String address = "https://exam.com";
        NetworkClientV4 clientV4 = new NetworkClientV4(address);
        clientV4.initError(data);

        try {
            clientV4.connect();
            clientV4.send(data);
        }finally {
            clientV4.disconnect();
        }
    }



}
