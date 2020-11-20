package imjustisabella.github.com.TaskHandler;

import imjustisabella.github.com.Main;

import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.HashMap;

public class KeyboardTasks {

    private static HashMap<String, HashMap<String, Long>> _data = new HashMap<String, HashMap<String, Long>>();

    public KeyboardTasks(int usesPerSecond, String clickType, int executions) {
        if(addClick(clickType, usesPerSecond)) {
            for(int i = 0; i < executions; i++) {
                new AsyncTask(new Runnable() {
                    @Override
                    public void run() {
                        press(clickType.charAt(0));
                    }
                });
            }
        }
    }

    private boolean addClick(String type, int max) {
        if(max > -1) {
            long clicks = 0;
            if (_data.containsKey(type)) {
                if (_data.get(type).get("Date") - 1000 <= new Date().getTime()) {
                    _data.remove(type);
                } else {
                    clicks = _data.get(type).get("Clicks");
                }
            }
            clicks++;

            if (_data.containsKey(type)) {
                _data.get(type).put("Clicks", clicks);
            } else {
                HashMap<String, Long> _d = new HashMap<String, Long>();
                _d.put("Clicks", clicks);
                _d.put("Date", new Date().getTime());
                _data.put(type, _d);
            }

            if (clicks < max) {
                return true;
            }
            return false;
        }
        return true;
    }

    public void press(char character) {
        switch (character) {
            case 'a': doPress(KeyEvent.VK_A); break;
            case 'b': doPress(KeyEvent.VK_B); break;
            case 'c': doPress(KeyEvent.VK_C); break;
            case 'd': doPress(KeyEvent.VK_D); break;
            case 'e': doPress(KeyEvent.VK_E); break;
            case 'f': doPress(KeyEvent.VK_F); break;
            case 'g': doPress(KeyEvent.VK_G); break;
            case 'h': doPress(KeyEvent.VK_H); break;
            case 'i': doPress(KeyEvent.VK_I); break;
            case 'j': doPress(KeyEvent.VK_J); break;
            case 'k': doPress(KeyEvent.VK_K); break;
            case 'l': doPress(KeyEvent.VK_L); break;
            case 'm': doPress(KeyEvent.VK_M); break;
            case 'n': doPress(KeyEvent.VK_N); break;
            case 'o': doPress(KeyEvent.VK_O); break;
            case 'p': doPress(KeyEvent.VK_P); break;
            case 'q': doPress(KeyEvent.VK_Q); break;
            case 'r': doPress(KeyEvent.VK_R); break;
            case 's': doPress(KeyEvent.VK_S); break;
            case 't': doPress(KeyEvent.VK_T); break;
            case 'u': doPress(KeyEvent.VK_U); break;
            case 'v': doPress(KeyEvent.VK_V); break;
            case 'w': doPress(KeyEvent.VK_W); break;
            case 'x': doPress(KeyEvent.VK_X); break;
            case 'y': doPress(KeyEvent.VK_Y); break;
            case 'z': doPress(KeyEvent.VK_Z); break;
            case 'A': doPress(KeyEvent.VK_SHIFT, KeyEvent.VK_A); break;
            case 'B': doPress(KeyEvent.VK_SHIFT, KeyEvent.VK_B); break;
            case 'C': doPress(KeyEvent.VK_SHIFT, KeyEvent.VK_C); break;
            case 'D': doPress(KeyEvent.VK_SHIFT, KeyEvent.VK_D); break;
            case 'E': doPress(KeyEvent.VK_SHIFT, KeyEvent.VK_E); break;
            case 'F': doPress(KeyEvent.VK_SHIFT, KeyEvent.VK_F); break;
            case 'G': doPress(KeyEvent.VK_SHIFT, KeyEvent.VK_G); break;
            case 'H': doPress(KeyEvent.VK_SHIFT, KeyEvent.VK_H); break;
            case 'I': doPress(KeyEvent.VK_SHIFT, KeyEvent.VK_I); break;
            case 'J': doPress(KeyEvent.VK_SHIFT, KeyEvent.VK_J); break;
            case 'K': doPress(KeyEvent.VK_SHIFT, KeyEvent.VK_K); break;
            case 'L': doPress(KeyEvent.VK_SHIFT, KeyEvent.VK_L); break;
            case 'M': doPress(KeyEvent.VK_SHIFT, KeyEvent.VK_M); break;
            case 'N': doPress(KeyEvent.VK_SHIFT, KeyEvent.VK_N); break;
            case 'O': doPress(KeyEvent.VK_SHIFT, KeyEvent.VK_O); break;
            case 'P': doPress(KeyEvent.VK_SHIFT, KeyEvent.VK_P); break;
            case 'Q': doPress(KeyEvent.VK_SHIFT, KeyEvent.VK_Q); break;
            case 'R': doPress(KeyEvent.VK_SHIFT, KeyEvent.VK_R); break;
            case 'S': doPress(KeyEvent.VK_SHIFT, KeyEvent.VK_S); break;
            case 'T': doPress(KeyEvent.VK_SHIFT, KeyEvent.VK_T); break;
            case 'U': doPress(KeyEvent.VK_SHIFT, KeyEvent.VK_U); break;
            case 'V': doPress(KeyEvent.VK_SHIFT, KeyEvent.VK_V); break;
            case 'W': doPress(KeyEvent.VK_SHIFT, KeyEvent.VK_W); break;
            case 'X': doPress(KeyEvent.VK_SHIFT, KeyEvent.VK_X); break;
            case 'Y': doPress(KeyEvent.VK_SHIFT, KeyEvent.VK_Y); break;
            case 'Z': doPress(KeyEvent.VK_SHIFT, KeyEvent.VK_Z); break;
            case '`': doPress(KeyEvent.VK_BACK_QUOTE); break;
            case '0': doPress(KeyEvent.VK_0); break;
            case '1': doPress(KeyEvent.VK_1); break;
            case '2': doPress(KeyEvent.VK_2); break;
            case '3': doPress(KeyEvent.VK_3); break;
            case '4': doPress(KeyEvent.VK_4); break;
            case '5': doPress(KeyEvent.VK_5); break;
            case '6': doPress(KeyEvent.VK_6); break;
            case '7': doPress(KeyEvent.VK_7); break;
            case '8': doPress(KeyEvent.VK_8); break;
            case '9': doPress(KeyEvent.VK_9); break;
            case '-': doPress(KeyEvent.VK_MINUS); break;
            case '=': doPress(KeyEvent.VK_EQUALS); break;
            case '~': doPress(KeyEvent.VK_SHIFT, KeyEvent.VK_BACK_QUOTE); break;
            case '!': doPress(KeyEvent.VK_EXCLAMATION_MARK); break;
            case '@': doPress(KeyEvent.VK_AT); break;
            case '#': doPress(KeyEvent.VK_NUMBER_SIGN); break;
            case '$': doPress(KeyEvent.VK_DOLLAR); break;
            case '%': doPress(KeyEvent.VK_SHIFT, KeyEvent.VK_5); break;
            case '^': doPress(KeyEvent.VK_CIRCUMFLEX); break;
            case '&': doPress(KeyEvent.VK_AMPERSAND); break;
            case '*': doPress(KeyEvent.VK_ASTERISK); break;
            case '(': doPress(KeyEvent.VK_LEFT_PARENTHESIS); break;
            case ')': doPress(KeyEvent.VK_RIGHT_PARENTHESIS); break;
            case '_': doPress(KeyEvent.VK_UNDERSCORE); break;
            case '+': doPress(KeyEvent.VK_PLUS); break;
            case '\t':doPress(KeyEvent.VK_TAB); break;
            case '\n':doPress(KeyEvent.VK_ENTER); break;
            case '[': doPress(KeyEvent.VK_OPEN_BRACKET); break;
            case ']': doPress(KeyEvent.VK_CLOSE_BRACKET); break;
            case '\\':doPress(KeyEvent.VK_BACK_SLASH); break;
            case '{': doPress(KeyEvent.VK_SHIFT, KeyEvent.VK_OPEN_BRACKET); break;
            case '}': doPress(KeyEvent.VK_SHIFT, KeyEvent.VK_CLOSE_BRACKET); break;
            case '|': doPress(KeyEvent.VK_SHIFT, KeyEvent.VK_BACK_SLASH); break;
            case ';': doPress(KeyEvent.VK_SEMICOLON); break;
            case ':': doPress(KeyEvent.VK_COLON); break;
            case '\'':doPress(KeyEvent.VK_QUOTE); break;
            case '"': doPress(KeyEvent.VK_QUOTEDBL); break;
            case ',': doPress(KeyEvent.VK_COMMA); break;
            case '<': doPress(KeyEvent.VK_SHIFT, KeyEvent.VK_COMMA); break;
            case '.': doPress(KeyEvent.VK_PERIOD); break;
            case '>': doPress(KeyEvent.VK_SHIFT, KeyEvent.VK_PERIOD); break;
            case '/': doPress(KeyEvent.VK_SLASH); break;
            case '?': doPress(KeyEvent.VK_SHIFT, KeyEvent.VK_SLASH); break;
            case ' ': doPress(KeyEvent.VK_SPACE); break;
            default:
                throw new IllegalArgumentException("Cannot type character " + character);
        }
    }

    private void doPress(int... keyCodes) {
        doPress(keyCodes, 0, keyCodes.length);
    }

    private void doPress(int[] keyCodes, int offset, int length) {
        if (length == 0) {
            return;
        }

        Main.controller.keyPress(keyCodes[offset]);
        doPress(keyCodes, offset + 1, length - 1);
        Main.controller.keyRelease(keyCodes[offset]);
    }
}
