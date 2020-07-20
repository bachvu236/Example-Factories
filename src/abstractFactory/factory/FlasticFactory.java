package abstractFactory.factory;

import abstractFactory.chair.Chair;
import abstractFactory.chair.PlasticChair;
import abstractFactory.table.PlasticTable;
import abstractFactory.table.Table;

public class FlasticFactory extends FurnitureAbstractFactory {
    @Override
    public Chair createChair() {
        return new PlasticChair();
    }

    @Override
    public Table createTable() {
        return new PlasticTable();
    }
}
