import java.util.ArrayList;
/*
 * @author abode
 * @author maher
 * version 1
 * */

/**
 * Represents shared data used in a program.
 */
public class SharedData {

    private ArrayList<Integer> array;
    private boolean[] winArray;
    private boolean flag;
    private final int b;

    /**
     * Constructs a new instance of the SharedData class.
     * @param array The ArrayList of integers to be shared.
     * @param b     An integer value to be shared.
     */
    public SharedData(ArrayList<Integer> array, int b) {
        this.array = array;
        this.b = b;
    }

    /**
     * Gets the array of booleans indicating winning status.
     * @return The array of booleans indicating winning status.
     */
    public boolean[] getWinArray() {
        return winArray;
    }

    /**
     * Sets the array of booleans indicating winning status.
     * @param winArray The array of booleans indicating winning status.
     */
    public void setWinArray(boolean[] winArray) {
        this.winArray = winArray;
    }

    /**
     * Gets the ArrayList of integers.
     * @return The ArrayList of integers.
     */
    public ArrayList<Integer> getArray() {
        return array;
    }

    /**
     * Gets the integer value.
     * @return The integer value.
     */
    public int getB() {
        return b;
    }

    /**
     * Gets the flag indicating a certain condition.
     * @return The flag indicating a certain condition.
     */
    public boolean getFlag() {
        return flag;
    }

    /**
     * Sets the flag indicating a certain condition.
     * @param flag The flag indicating a certain condition.
     */
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
