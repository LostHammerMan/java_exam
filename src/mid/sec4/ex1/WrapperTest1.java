package mid.sec4.ex1;

public class WrapperTest1 {

    public static void main(String[] args) {
//        String str1 = "10";
//        String str2 = "20";
//        int int1 = Integer.parseInt(str1);
//
//
//        System.out.println("두수의 합: " +
//                Integer.sum(Integer.parseInt(str1),Integer.parseInt(str2)));

        String[] arr = {"1.5", "2.5", "3.0"};
        Double sum = 0.0;
        for (String a : arr){
            sum += Double.parseDouble(a);
        }

        System.out.println("sum = " + sum);

    }
}
