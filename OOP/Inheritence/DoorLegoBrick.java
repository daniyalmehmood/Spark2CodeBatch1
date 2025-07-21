package OOP.Inheritence;

import OOP.Abstraction.BuildingBlock;
import OOP.Abstraction.Connectable;

public class DoorLegoBrick extends BuildingBlock implements Connectable {


    public DoorLegoBrick(String material) {
        super(material);
    }

    @Override
    public void connect() {
        System.out.println("Connect between 2 Walls Lego Bricks");
    }

    @Override
    public void describeShape() {
        System.out.println("Rectangle");
    }
}
