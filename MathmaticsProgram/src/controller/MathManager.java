/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.*;
import view.Validation;

/**
 *
 * @author longle2507
 */
public class MathManager {
    Validation val = new Validation();
    List<Float> forSuperlative = new ArrayList<>();
    List<Float> forQuaratic = new ArrayList<>();

    public void addNumber(Float numer) {
        forSuperlative.add(numer);
        forQuaratic.add(numer);
    }

    // ----------------------------------- Superlative Equation ax + b = 0
    public void superlativeEquation(float a, float b) {
        forSuperlative.add(a);
        forSuperlative.add(b);
        float result = -b / a;
        System.out.println("Solution: " + result);
        forSuperlative.add(result);
    }

    // ----------------------------------- Quadratic Equation ax^2 + bx + c = 0;
    public void quaraticEquation(float a, float b, float c) {
        forQuaratic.add(a);
        forQuaratic.add(b);
        forQuaratic.add(c);
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            System.out.println("null");
        } else if (delta == 0) {
            float result = -b / 2 * a;
            System.out.println("x1 = x2 : " + result);
            forQuaratic.add(result);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / 2 * a;
            double x2 = (-b - Math.sqrt(delta)) / 2 * a;
            System.out.println("x1: " + x1 + " x2: " + x2);
            forQuaratic.add((float) x1);
            forQuaratic.add((float) x2);
        }
    }

    // ----------------------------------- Find Odd, Even Number
    public void findNumberSuperlative(List<Float> superList) {
        List<Float> oddNumber = new ArrayList<>();
        List<Float> evenNumber = new ArrayList<>();
        List<Float> perfectSquare = new ArrayList<>();
        for (Float number : forSuperlative) {
            if (number % 2 == 0) {
                evenNumber.add(number);
            } else  if(number % 2 != 0){
                oddNumber.add(number);
            } 
            double sqrt = Math.sqrt(number);
            if(sqrt == Math.floor(sqrt)){
                perfectSquare.add(number);
            }
        }

        System.out.println("Number is Odd " + oddNumber);
        System.out.println("Number is Even: " + evenNumber);
        System.out.println("Number is Perfect Square: " + perfectSquare);
    }

    //-----------------------------------
    public void findNumberQuaratic(List<Float> quaraticList){
        List<Float> oddNumber = new ArrayList<>();
        List<Float> evenNumber = new ArrayList<>();
        List<Float> perfectSquare = new ArrayList<>();
        for (Float number : forQuaratic) {
            if (number % 2 == 0) {
                evenNumber.add(number);
            } else  if(number % 2 != 0){
                oddNumber.add(number);
            } 
            double sqrt = Math.sqrt(number);
            if(sqrt == Math.floor(sqrt)){
                perfectSquare.add(number);
            }
        }

        System.out.println("Number is Odd " + oddNumber);
        System.out.println("Number is Even: " + evenNumber);
        System.out.println("Number is Perfect Square: " + perfectSquare);
    }
}
