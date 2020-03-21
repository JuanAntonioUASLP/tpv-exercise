package oop.inheritance.ingenico;


public class IngenicoDisplay {

    private static IngenicoDisplay instance;

    private  IngenicoDisplay(){}

    public static IngenicoDisplay getIngenicoDisplay() {
        return instance;
    }

    /**
     * Prints a message to specied position
     *
     * @param x       horizontal position
     * @param y       vertical position
     * @param message message to be printed
     */
    public void showMessage(int x, int y, String message) {
    }

    /**
     * Clears the screen
     */
    public void clear() {

    }
}
