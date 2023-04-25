package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadData<T> {
    public List<T> loadListData(String pathName){
        List<T> list = new ArrayList<>();
        File saveFile = new File(pathName);
        try (ObjectInputStream reader = new ObjectInputStream(new FileInputStream(saveFile))){
            list = (List<T>)reader.readObject();
            System.out.println("Read success");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
