package model;

import java.util.HashMap;
import java.util.List;

public interface Iinput {
    public abstract HashMap<String, List<Integer>> getNumber(String input);
    public abstract HashMap<String, StringBuilder> getCharacter(String input);
}
