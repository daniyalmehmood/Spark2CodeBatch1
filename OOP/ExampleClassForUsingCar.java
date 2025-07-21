package OOP;

public class ExampleClassForUsingCar {

    public static void main(String[] args) {

        int age = 8;
        Car daniyalCar = new Car();
        System.out.println("Daniyal car below:");
        daniyalCar.autoParking();
        daniyalCar.setName("Mustang");
        daniyalCar.setColor("White");
        daniyalCar.setHorsePower(450.0f);
        daniyalCar.setSize("150x150x150");
        daniyalCar.setType("Coupe");
        daniyalCar.setManufacturer("Ford");
        daniyalCar.setModel("1989");

        F1Car maxCar = new F1Car();
        System.out.println("Max's Car below:");
        maxCar.autoParking();

    }
}
