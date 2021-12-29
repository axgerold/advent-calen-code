package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReadingClass {
    public static void ReadFile() {
        try {
            File myObj = new File("C:\\Users\\aimee_gerold\\IdeaProjects\\AdventCalenCode\\src\\test_case_data.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static ArrayList ImportFileSaveAsList(File myObj) {
        // initialize array list
        ArrayList arrayList = new ArrayList();

        try {

            // initialize scanner
            Scanner scanner = new Scanner(myObj);

            // scan through text file and populate arraylist
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                arrayList.add(data);
//                System.out.println(arrayList);
            }

            // close scanner
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return arrayList;
    }
}
