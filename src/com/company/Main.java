package com.company;

import com.company.gui.FisherManMainWindow;

public class Main {

    public static void main(String[] args) {
	// write your code here

        FisherManMainWindow fisherManMainWindow = FisherManMainWindow.getFisherManMainWindow();
        fisherManMainWindow.pack();
        fisherManMainWindow.setLocationRelativeTo(null);
        fisherManMainWindow.setSize(500,200);
        fisherManMainWindow.show();
    }
}
