package imjustisabella.github.com.Frames;

import imjustisabella.github.com.Frames.Tabs.ProgramsTab;
import imjustisabella.github.com.Frames.Tabs.SettingsTab;
import imjustisabella.github.com.Frames.Tabs.TasksTab;

import javax.swing.*;

public class MainFrame {

    public static JFrame frame;
    public MainFrame() {
        JTabbedPane tabs = new JTabbedPane();

        tabs.addTab("Program List", new ProgramsTab().getPanel());
        tabs.addTab("Command Actions", new TasksTab().getPanel());
        tabs.addTab("Settings", new SettingsTab().getPanel());

        frame.add(tabs);
        frame.setVisible(true);
        frame.setSize(250, 250);
    }
}
