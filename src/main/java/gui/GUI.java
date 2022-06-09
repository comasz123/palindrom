package gui;


import database.DataBase;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

public class GUI {
    public static void displayDataBase(ArrayList<String> db){

        for (String str: db) {
            System.out.println(str);
        }
    }
}
