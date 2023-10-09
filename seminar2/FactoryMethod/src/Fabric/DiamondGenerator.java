package Fabric;

import Interface.IGameItem;
import Product.Diamond;

public class DiamondGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Diamond();
    }

}
