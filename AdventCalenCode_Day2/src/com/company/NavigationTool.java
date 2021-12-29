package com.company;

import java.util.List;

import static java.lang.Integer.parseInt;

public class NavigationTool {

    public static int[][] findSub(List imported_list) {

        int i = 0;
        int x = 0;
        int y = 0;
        int [][] location = new int[1][2];

        // check if undefined array is 0 or "null"/junk

        while (i < imported_list.size()) {
            // read next entry line
            String instruction_line = (String) imported_list.get(i);
            String [] split_instructions = instruction_line.split(" ",2);
            String direction = split_instructions[0];
            int distance = Integer.parseInt(split_instructions[1]);

            // given direction and distance, adjust location
            if (direction.contains("forward")) {
                x = x + distance;
            }
            else if (direction.contains("down")) {
                y = y + distance;
            }
            else if (direction.contains("up")) {
                y = y - distance;
            }

            i++;
        }

        location[0][0] = x;
        location[0][1] = y;

        return location;
    }

}
