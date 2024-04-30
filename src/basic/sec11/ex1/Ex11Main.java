package basic.sec11.ex1;

public class Ex11Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        soundAnimal(dog);
        soundAnimal(bird);
        soundAnimal(chicken);

        flyAnimal(bird);
        flyAnimal(bird);
    }

    private static void soundAnimal(AbstractAnimal abstractAnimal){
        System.out.println("테스트 시작");
        abstractAnimal.sound();
        System.out.println("테스트 종료");
    }

    private static void flyAnimal(Fly fly){
        System.out.println("날기 테스트 시작");
        fly.fly();
        System.out.println("날기 테스트 종료");
    }
}
