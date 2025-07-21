package OOP.Inheritence;

import OOP.Encapsulation.BasicLegoBrick;

public class WindowLegoBrick extends BasicLegoBrick {
    private boolean hasGlassPane;

    public WindowLegoBrick(String color, int numberOfStuds, boolean hasGlassPane) {
        super(color, numberOfStuds); // Calls the constructor of the parent class (BasicLegoBrick)
        this.hasGlassPane = hasGlassPane;
    }

    public void lookThrough() {
        if (hasGlassPane) {
            System.out.println("Looking through the " + getColor() + " window pane.");
        } else {
            System.out.println("This window brick has no glass!");
        }
    }
}
