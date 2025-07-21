package OOP.Inheritence;

import OOP.Encapsulation.BasicLegoBrick;

public class WheelLegoBrick extends BasicLegoBrick { // WheelLegoBrick 'is a' BasicLegoBrick
    private boolean isRubberTire;

    public WheelLegoBrick(String color, int numberOfStuds, boolean isRubberTire) {
        super(color, numberOfStuds);
        this.isRubberTire = isRubberTire;
    }

    public void roll() {
        if (isRubberTire) {
            System.out.println("The " + getColor() + " wheel is rolling smoothly!");
        } else {
            System.out.println("This is a hard plastic wheel, might slip!");
        }
    }
}