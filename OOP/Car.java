package OOP;

public class Car {

    private String color;
    private String model;
    private String type;
    private String name;
    private Float horsePower;
    private String size;
    private String manufacturer;


    public void accelerate() {
        System.out.println("accelerate");
    }

    public void ignition() {
        System.out.println("Start or Stop");
    }

    public void applybrakes() {
        System.out.println("Reduce speed");
    }

    public void autoParking() {
        System.out.println("Auto parking");
    }

    public void pressHorn() {
        System.out.println("Make annoying sound");
    }

    public void indicateTurning() {
        System.out.println("Use indicators");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Float horsePower) {
        if (horsePower < 0) {
            System.out.println("Invalid horsepower");
        } else {
            this.horsePower = horsePower;
        }
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
