package com.kang.wuji.util;

import android.content.Context;

/**
 * @author created by kangren on 2018/5/24 17:37
 */
public class Settings {
    /**
     * 主题，Light和Night
     */
    public static final String THEME = "theme";
    public static final String THEME_LIGHT = "light";
    public static final String THEME_NIGHT = "night";

    public static void setTheme(Context context, String theme) {
        Prefs.setString(context, THEME, theme);
    }

    public static boolean isLightTheme(Context context) {
        return THEME_LIGHT.equals(Prefs.getString(context, THEME, THEME_LIGHT));
    }
}
