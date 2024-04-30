package basic.sec11.ex1;

public class Bird extends AbstractAnimal implements Fly {

    @Override
    public void fly() {
        System.out.println("새 날기");
    }

    @Override
    public void sound() {
        System.out.println("짹짹");
    }
}
