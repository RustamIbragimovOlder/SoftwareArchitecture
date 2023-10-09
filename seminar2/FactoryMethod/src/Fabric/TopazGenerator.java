package Fabric;

import Interface.IGameItem;
import Product.Topaz;

public class TopazGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Topaz();
    }

}
