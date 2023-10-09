package Fabric;

import Interface.IGameItem;
import Product.Garnet;

public class GarnetGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Garnet();
    }

}
