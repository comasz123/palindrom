import database.DataBase;
import gui.GUI;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> inputFile = DataBase.getInstance().getStrings();
        GUI.displayDataBase(inputFile);
        ArrayList<String> result = new ArrayList<>();

        for (String str :
                inputFile) {
            if (checkIfPalindrom(str)) result.add(str);
        }
        System.out.println("---------");
        GUI.displayDataBase(result);
        saveFile(result);

    }

    public static boolean checkIfPalindrom(String str) {
        String r = reverse(str);
        return str.equals(r) ? true : false;
    }

    public static String reverse(String str) {
        String result = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            result = ch + result;
        }
        return result;
    }
    public static void saveFile (ArrayList<String> strings){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("rezultat.txt"))){
            for (String str : strings) {
                bw.write(str);
                bw.newLine();
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
