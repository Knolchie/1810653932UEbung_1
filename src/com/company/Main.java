package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JOptionPane.showInputDialog("Bitte geben sie eine zahl ein");

        int alter = Integer.parseInt(JOptionPane.showInputDialog("bitte geben sie eine zahl ein"));

        if (alter<=18)
        {
            System.out.println("du bist nicht volljährig");
        }
        else
        {
            System.out.println("du bist volljährig");
        }
    }
}
