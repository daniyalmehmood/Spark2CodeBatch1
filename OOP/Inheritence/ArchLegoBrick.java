package OOP.Inheritence;

import OOP.Abstraction.Connectable;

public class ArchLegoBrick implements Connectable {


    @Override
    public void connect() {
        System.out.println("Connect above the door");
    }
}
