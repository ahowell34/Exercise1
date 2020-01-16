// Alysyn Howell 1/16/2020 Prog Fundamentals for Android
package com.company.Howell;
import com.sun.prism.shader.Solid_ImagePattern_Loader;

import java.util.Scanner;
import java.util.*;
/**
 * Created by 026654 on 1/16/2020.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String city = "Columbus";
        System.out.print("City: " + city + "  ");
        int zipCode = 43215;
        System.out.print("Zip Code: " + zipCode + "  ");

        int dailyHighs[] = {32, 25, 27, 40, 45};

        double sum = dailyHighs[0] + dailyHighs[1] + dailyHighs[2] + dailyHighs[3] + dailyHighs[4];
        double average = sum/ dailyHighs.length;
        System.out.print("Average High Temperature: " + average);


    }
}

