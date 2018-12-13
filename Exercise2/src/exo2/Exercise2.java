package exo2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Exercise2 {
    public static void main(String[] args) throws IOException {
        FileReader myFile = new FileReader("./src/exo2/source.txt");
        BufferedReader reader = new BufferedReader(myFile);
        ArrayList<Integer> list = new ArrayList<>();
        String line;
        int total = 0;
        int avg;
        while((line = reader.readLine()) != null) {
            list.add(Integer.parseInt(line.substring(line.indexOf(":"))));
        }
        if(list.size() == 0 ){
            System.out.println("No elements found");
        } else {
            for (Integer integer : list) {
                total += integer;
            }
        }
        avg = total / list.size();
        System.out.println(avg);
        myFile.close();
    }
}
