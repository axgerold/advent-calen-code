package com.company;

import java.util.List;

public class NavigationToolClass {

    public static int[][] findSub(List imported_list, int is_aim_on) {

        int i = 0;
        int x = 0;
        int y = 0;
        int [][] location = new int[1][2];
        int aim = 0;

        // check if undefined array is 0 or "null"/junk

        while (i < imported_list.size()) {
            // read next entry line
            String instruction_line = (String) imported_list.get(i);
            String [] split_instructions = instruction_line.split(" ",2);
            String direction = split_instructions[0];
            int distance = Integer.parseInt(split_instructions[1]);

            // given direction and distance, adjust location
            if (direction.contains("forward")) {
                x += distance;
                if (aim!=0 && is_aim_on==1) {
                    y += aim * distance; // increases depth by aim * distance
                }

            }
            else if (direction.contains("down")) {
                if (is_aim_on==0) {
                    y += distance;
                }
                if (is_aim_on==1) {
                    aim += distance; // if including aim, depth doesn't change
                }
            }
            else if (direction.contains("up")) {
                if (is_aim_on==0) {
                    y -= distance;
                }
                if (is_aim_on==1) {
                    aim -= distance; // if including aim, depth doesn't change
                }
            }

            i++;
        }

        location[0][0] = x;
        location[0][1] = y;

        return location;
    }

}
