package imjustisabella.github.com.ResponseData;

import imjustisabella.github.com.Frames.MainFrame;
import imjustisabella.github.com.TaskHandler.AsyncTask;
import imjustisabella.github.com.TaskHandler.KeyboardTasks;

import java.util.HashMap;

public class ChatMessage {

    public static boolean antiSpam = false;
    private void doChat(String message, String username) {
        if (!MainFrame.frame.isFocused() && !antiSpam) {
            new AsyncTask(new Runnable() {
                @Override
                public void run() {
                    if (new Handler().getData(message) != null) {
                        antiSpam = true;
                        HashMap<String, Object> _data = new Handler().getData(message);

                        String type = (String) _data.get("Type");
                        int usesPerSecond = (int) _data.get("Uses");

                        if (type.equals("MouseMovement")) {
                            String moveToX = (String) _data.get("X");
                            String moveToY = (String) _data.get("Y");

                            //new MouseTasks(usesPerSecond, moveToX, moveToY);
                        }
                        if (type.equals("MouseClick")) {
                            int executions = (int) _data.get("Executions");
                            String clickType = (String) _data.get("ClickType");

                            //new ClickTasks(usesPerSecond, clickType, executions);
                        }
                        if (type.equals("KeyboardClick")) {
                            int executions = (int) _data.get("Executions");
                            String clickType = (String) _data.get("ClickType");

                            new KeyboardTasks(usesPerSecond, clickType, executions);
                        }
                    }
                }
            });
        }
    }
}
