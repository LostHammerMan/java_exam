package mid.sec3;

public class TestString6 {

    public static void main(String[] args) {

        String email = "hello@exam.com";
        int index = email.indexOf(".");

        String[] result = email.split("@");
        System.out.println("Id = " + result[0]);
        System.out.println("Domain = " + result[1]);
//        System.out.println("Domain = " + result[1]);

//        String input = "hello java spring jpa java";
//
//        String oldWord = "java";
//        String newWord = "jvm";
//
//        System.out.println(input.replace(oldWord, newWord));

//        String original = "   Hello Java  ";
//        String result = original.trim();
//
//        System.out.println("result = " + result);
//        String str = "start hello java, hello spring, hello jpa";
//        String key = "hello";
//        int count = 0;
//
//
//
//        for (int i=0; i<str.length(); i++){
//    //            str.indexOf(key, i);
//    //            System.out.println(str.indexOf(key, i, str.length()));
//            if (i == str.indexOf(key, i)){
//                count++;
//            }
//
//        }
//        System.out.println("count = " + count);
    }

}
