package mid.sec3;

public class TestString1 {
    public static void main(String[] args) {

        String str = "hello.txt";

        String filename = str.substring(0, str.indexOf(".txt"));
        String extName = str.substring(str.indexOf(".txt"));
        System.out.println("filename = " + filename);
        System.out.println("filename = " + extName);


//        String url = "https://www.exam.com";

//        boolean result = url.startsWith("https://");
//
//        System.out.println("result = " + result);


//        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
//        int sum = 0;
//        for (String result : arr){
//            System.out.println(result + ": " + result.length());
//            sum += result.length();
//        }
//
//        System.out.println("sum = " + sum);

//        String str = "hello.txt";
//
//        System.out.println("index = " + str.indexOf(".txt"));
    }
}
