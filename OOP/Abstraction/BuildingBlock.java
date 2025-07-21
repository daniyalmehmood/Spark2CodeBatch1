package OOP.Abstraction;

public abstract class BuildingBlock {

    private String material;

    public BuildingBlock(String material) {
        this.material = material;
    }

    // Abstract method - subclasses MUST implement this
    public abstract void describeShape();

    public void showMaterial() {
        System.out.println("Made of " + material);
    }
}
