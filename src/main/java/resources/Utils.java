package resources;

import java.util.ArrayList;

public class Utils {

    public static Boolean descendingCheck(ArrayList<Float> data) {
        for (int i = 0; i < data.size() - 1; i++) {
            if (data.get(i) < data.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static Boolean ascendingCheck(ArrayList<Float> data) {
        for (int i = 0; i < data.size() - 1; i++) {
            if (data.get(i) > data.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
