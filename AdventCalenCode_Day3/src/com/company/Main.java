package com.company;

import java.io.File;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        // initialize tool and file reader
        FileReadingClass fileReader = new FileReadingClass();

            String day = "3";

            // import example data
            File example_file = new File("C:\\Users\\aimee_gerold\\OneDrive - Edwards Lifesciences\\Documents\\GitHub\\advent-calen-code\\AdventCalenCode_Day" + day + "\\src\\example_data.txt");
            List imported_example_list = fileReader.ImportFileSaveAsList(example_file);

            // import test case data
            File test_case_file = new File("C:\\Users\\aimee_gerold\\OneDrive - Edwards Lifesciences\\Documents\\GitHub\\advent-calen-code\\AdventCalenCode_Day" + day + "\\src\\test_case_data.txt");
            List imported_test_case_list = fileReader.ImportFileSaveAsList(test_case_file);

        // Part A: the purpose of this project is to find the power consumption (= gamma * epsilon)
            // gamma: the most common bit (0 or 1) in each space is the corresponding bit
            // epsilon: the least common bit (converse)
            // i.e. for each digit space, if the list of entries has more 1's, add a "1" to gamma binary answer

            PowerToolClass powerToolClassInstance = new PowerToolClass();

            int example_power_consumption = powerToolClassInstance.calculatePowerConsumption(imported_example_list);
            System.out.println("Example power consumption: " + example_power_consumption);

            int test_case_power_consumption = powerToolClassInstance.calculatePowerConsumption(imported_test_case_list);
            System.out.print("Test case power consumption: " + test_case_power_consumption);

        // Part B: the purpose of this part is to calculate life support (= O2_gen * CO2_scrub)
            // O2_gen: keep only the binary lines that contain the most common bit (if equal, take "1") for each digit
                // i.e. for first digit, if most common bit is "1", remove all binary lines starting with "0"
                // the remaining line is the O2_gen rating in binary
            // CO2_scrub: keep only binary lines with the least common bit (if equal, take "0") for each digit space

            LifeSupportToolClass lifeSupportToolInstance = new LifeSupportToolClass();

            int example_life_support = lifeSupportToolInstance.calculateLifeSupport(imported_example_list);
            System.out.println("Example life support: " + example_life_support);

            int test_case_life_support = lifeSupportToolInstance.calculateLifeSupport(imported_test_case_list);
            System.out.print("Test case life support: " + test_case_life_support);
    }
}
