package OOP.Encapsulation;

public class BasicLegoBrick {

    private String color; // This is private data, like the actual plastic material
    private int numberOfStuds; // Also private data

    public BasicLegoBrick(String color, int numberOfStuds) { // This is how you "make" a brick
        this.color = color;
        this.numberOfStuds = numberOfStuds;
    }

    public BasicLegoBrick(String color) { // This is how you "make" a brick
        this.color = color;
    }



    public String getColor() { // Public method to "see" its color
        return color;
    }

    public void snapToAnotherBrick() { // Public action you can perform
        System.out.println("This " + color + " brick with " + numberOfStuds + " studs just snapped into place!");
    }
}
