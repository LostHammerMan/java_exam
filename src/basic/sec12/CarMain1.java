package basic.sec12;

public class CarMain1 {
    public static void main(String[] args) {

        Driver driver = new Driver();

        Car k3car = new K3Car();
        driver.setCar(k3car);
        driver.drive();
        System.out.println("==========");


        Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();
    }
}
