package org.example.factorymethod.tableexample;

public class TableFactory {


    public Table createTable (String type){
        if (type.equals("öffice")){
            return new OfficeTable("öffice table");

        } else if (type.equals("kitchen")){
            return new KitchenTable("kitchen table");
        }else{
            return null;
        }
    }
}
