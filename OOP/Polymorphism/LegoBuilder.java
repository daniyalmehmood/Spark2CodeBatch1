package OOP.Polymorphism;

import OOP.Encapsulation.BasicLegoBrick;
import OOP.Inheritence.WheelLegoBrick;
import OOP.Inheritence.WindowLegoBrick;

public class LegoBuilder {
    public static void main(String[] args) {
        // We declare them as BasicLegoBrick (the parent type)
        BasicLegoBrick brick1 = new BasicLegoBrick("Blue", 8);
        BasicLegoBrick brick2 = new WindowLegoBrick("Red", 4, true); // Still a BasicLegoBrick underneath!
        BasicLegoBrick brick3 = new WheelLegoBrick("Black", 2, true); // Still a BasicLegoBrick underneath!

        // Put them all in a list of BasicLegoBrick
        BasicLegoBrick[] myLegoCollection = {brick1, brick2, brick3};

        System.out.println("--- Snapping all my LEGO bricks! ---");
        for (BasicLegoBrick brick : myLegoCollection) {
            brick.snapToAnotherBrick(); // The SAME method call
            // Notice: The output for the window/wheel brick comes from the parent class's snapToAnotherBrick()
            // If we OVERRODE snapToAnotherBrick in the child classes, it would be different.
        }

        System.out.println("\n--- Using Specific Brick Features ---");
        // To use special features, you might need to "cast" them back to their specific type
        if (brick2 instanceof WindowLegoBrick) {
            ((WindowLegoBrick) brick2).lookThrough();
        }
        if (brick3 instanceof WheelLegoBrick) {
            ((WheelLegoBrick) brick3).roll();
        }
    }
}
