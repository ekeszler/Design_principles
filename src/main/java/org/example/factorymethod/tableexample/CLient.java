package org.example.factorymethod.tableexample;

public class CLient {

    public static void main(String[] args) {
        Table kitchenTable = new KitchenTable("kitchen table");

        TableFactory tableFactory = new TableFactory();
        Table officeTable = tableFactory.createTable("öffice");
        System.out.println(officeTable instanceof OfficeTable);

    }
}
