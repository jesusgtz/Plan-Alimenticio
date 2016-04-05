package planalimenticio;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Equipo1
 */
public class ToList {
    
    private final List list;
    private final ArrayList arr;
    private final int size;
    
    /**
     * Constructor
     * @param list
     * @param arr
     * @param size 
     */
    public ToList(List list, ArrayList arr, int size) {
        this.list = list;
        this.arr = arr;
        this.size = size;
    }

    public List getList() {
        return this.list;
    }

    public ArrayList getArray() {
        return this.arr;
    }

    public int getSize() {
        return this.size;
    }
}
