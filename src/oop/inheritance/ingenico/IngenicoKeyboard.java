package oop.inheritance.ingenico;

public class IngenicoKeyboard {

    private static IngenicoKeyboard instance;

    private IngenicoKeyboard(){}

    public static IngenicoKeyboard getIngenicoKeyboard(){
        return instance;
    }

    /**
     * @return key pressed
     */
    public String get() {
        return "Key pressed";
    }
}
