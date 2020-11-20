package imjustisabella.github.com;

import imjustisabella.github.com.Frames.MainFrame;
import imjustisabella.github.com.Frames.MousePositioning;
import imjustisabella.github.com.ResponseData.LoadPoint;

import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;

public class Main {

    public static String channel = "ImJustIsabellaa";
    public static Robot controller;

    static {
        try {
            controller = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);

        try {
            new LoadPoint().load();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        new MousePositioning();
//        MainFrame.frame = new JFrame();
//        new MainFrame();
    }
}
