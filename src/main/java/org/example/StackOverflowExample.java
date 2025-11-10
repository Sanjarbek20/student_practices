package org.example;

import java.io.*;

public class StackOverflowExample {
    public static void main(String[] args) {
        callMe();
    }

    static void callMe() {
        System.out.println("Metod chaqirildi");
        callMe();
    }
}









