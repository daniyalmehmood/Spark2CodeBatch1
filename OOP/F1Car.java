package OOP;

import OOP.Encapsulation.BasicLegoBrick;

public class F1Car extends Car {


    private String maximumSpeed;
    private String tyreType;
    private Float weight;
    private String downForce;
    private String driverName;
    private String batteryCapacity;
    private Integer fuelTankCapacity;

    public void changeModes(){
        System.out.println("Change to Electric");
    }

    public void useDRS(){
        System.out.println("Using DRS");
    }

    public void doABurnOut(){
        System.out.println("Showing off");
    }

    public void changingGear(){
        System.out.println("Change Gears");
    }

    public void autoParking(){
        System.out.println("No option to autopark in f1 car");
    }

    public void showDriverName(){
        System.out.println("Drivers name: " + driverName);
    }

    public void showDriverName(String driverFullName){
        System.out.println("Drivers Full Name: " + driverFullName);
    }

    public void showDriverName(String driverFirstName, String driverLastName){
        System.out.println("Drivers First Name: " + driverFirstName + " " + driverLastName);
    }

    public void showDriverName(String driverFirstName, String driverLastName, String middleName){
        System.out.println("Drivers First Name: " + driverFirstName + " " + driverLastName + " " + middleName);
    }









}
