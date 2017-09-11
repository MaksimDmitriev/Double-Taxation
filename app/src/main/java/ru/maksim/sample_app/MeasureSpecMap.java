package ru.maksim.sample_app;

import android.view.View;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by maksim on 11.09.17.
 */

public class MeasureSpecMap {

    private static final Map<Integer, String> MAP = new HashMap<>();

    static {
        MAP.put(View.MeasureSpec.AT_MOST, "AT_MOST");
        MAP.put(View.MeasureSpec.EXACTLY, "EXACTLY");
        MAP.put(View.MeasureSpec.UNSPECIFIED, "UNSPECIFIED");
    }

    private MeasureSpecMap() {

    }

    public static String getName(int mode) {
        return MAP.get(mode);
    }

}
