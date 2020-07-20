package abstractFactory.factory;

import abstractFactory.chair.Chair;
import abstractFactory.table.Table;

public abstract class AbstractFactory {
    public abstract Chair createChair();
    public abstract Table createTable();
}
