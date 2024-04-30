package mid.sec3;

public class TestString10 {

    public static void main(String[] args) {

        String str = "hello java";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);

        StringBuilder sb = new StringBuilder();
        sb.append(str);

        System.out.println(sb.reverse());

//        String fruits = "apple,banana,mango";
//        String[] result = fruits.split(",");
//        String joinedString = "";
//
////        String joinedString = result[0].join("->");
//
//            joinedString = String.join("->", result[0], result[1], result[2]);
//            String joinedString2 = String.join("->", result);
//
//
//
//        System.out.println("joinedString = " + joinedString);
//        System.out.println("joinedString2 = " + joinedString2);
    }
}
