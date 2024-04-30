package mid.sec4.ex2;

public class LottoGeneratorMain {

    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();
        int[] result = lottoGenerator.generator();
        System.out.print("로또 번호 : ");
        for (int r : result){
            System.out.print(r + " ");
        }
    }

}
