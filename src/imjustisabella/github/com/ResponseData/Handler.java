package imjustisabella.github.com.ResponseData;

import java.util.HashMap;

public class Handler {

    public static HashMap<String, HashMap<String, Object>> _data = new HashMap<String, HashMap<String, Object>>();

    public HashMap<String, Object> getData(String message) {
        HashMap<String, Object> _d = null;
        for(String commands : _data.keySet()) {
            if(((String) _data.get(commands).get("Requirement")).equals("Contains") && message.contains(commands)) {
                _d = _data.get(commands);
            } else if(message.startsWith(commands)) {
                _d = _data.get(commands);
            }
        }

        return _d;
    }
}
