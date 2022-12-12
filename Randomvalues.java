package com.mycompany.randomvalues;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
import java.util.Random;

/**
 *
 * @author luald
 */
public class Randomvalues {

    public static void main(String[] args) {
        Random random = new Random();
      int x = random.nextInt();
   //  double y = random.nextDouble();
   
      System.out.println(x);
    }
}
