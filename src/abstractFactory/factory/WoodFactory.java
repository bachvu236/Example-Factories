package abstractFactory.factory;

import abstractFactory.chair.Chair;
import abstractFactory.chair.WoodChair;
import abstractFactory.table.Table;
import abstractFactory.table.WoodTable;

public class WoodFactory extends FurnitureAbstractFactory {
    @Override
    public Chair createChair() {
        return new WoodChair();
    }

    @Override
    public Table createTable() {
        return new WoodTable();
    }
}
