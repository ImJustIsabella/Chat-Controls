package imjustisabella.github.com.ResponseData;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

public class LoadPoint {

    public LoadPoint() {}

    public void load() throws FileNotFoundException {
        File dir = new File(System.getenv("AppData") + "/Roaming/.twitchcontrols");
        if(dir.exists()) {
            importFromFile(new File(System.getenv("AppData") + "/Roaming/.twitchcontrols/controls.json"));
        } else {
            dir.mkdir();
        }
    }

    public void importFromFile(File f) throws FileNotFoundException {
        if(f.exists() && f.getName().endsWith(".json")) {
            JsonObject obj = JsonParser.parseReader(new FileReader(f)).getAsJsonObject();
            JsonArray array = obj.get("Data").getAsJsonArray();

            for(int i = 0; i < array.size(); i++) {
                JsonObject data = array.get(i).getAsJsonObject();

                String command = data.get("Command").getAsString();
                String type = data.get("Type").getAsString();
                if(type.equals("MouseMovement")) {
                    Handler._data.put(command, getHash(type, data.get("Uses").getAsInt(), data.get("X").getAsString(), data.get("Y").getAsString(), data.get("Requirement").getAsString()));
                } else {
                    Handler._data.put(command, getHash(type, data.get("Uses").getAsInt(), data.get("ClickType").getAsString(), data.get("Executions").getAsInt(), data.get("Requirement").getAsString()));
                }
            }
        }
    }

    private static HashMap<String, Object> getHash(String type, int uses, String x, String y, String requirement) {
        HashMap<String, Object> _data = new HashMap<String, Object>();

        _data.put("Type", type);
        _data.put("Uses", uses);
        _data.put("X", x);
        _data.put("Y", y);
        _data.put("Requirement", requirement);

        return _data;
    }

    private static HashMap<String, Object> getHash(String type, int uses, String click, int executions, String requirement) {
        HashMap<String, Object> _data = new HashMap<String, Object>();

        _data.put("Type", type);
        _data.put("Uses", uses);
        _data.put("ClickType", click);
        _data.put("Executions", executions);
        _data.put("Requirement", requirement);

        return _data;
    }
}