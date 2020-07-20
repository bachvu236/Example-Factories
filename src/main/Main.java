package main;

import abstractFactory.chair.Chair;
import abstractFactory.factory.FurnitureAbstractFactory;
import abstractFactory.factory.FurnitureFactory;
import abstractFactory.table.Table;
import util.MaterialType;

public class Main {
    public static void main(String[] args) {
        FurnitureAbstractFactory factory = FurnitureFactory.getFactory(MaterialType.WOOD);
        Chair chair = factory.createChair();
        chair.create(); // Create plastic chair
        Table table = factory.createTable();
        table.create(); // Create plastic table
    }
}
