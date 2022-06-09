package database;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DataBase {
    private final ArrayList<String> strings = new ArrayList<>();

    private final static DataBase instance = new DataBase();

    private DataBase() {
        try (BufferedReader br = new BufferedReader(new FileReader("baza.txt"))){
            String line;
            while ((line = br.readLine()) != null) {
                this.strings.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
    public static DataBase getInstance() {
        return instance;
    }

    public ArrayList<String> getStrings() {
        return strings;
    }
}
