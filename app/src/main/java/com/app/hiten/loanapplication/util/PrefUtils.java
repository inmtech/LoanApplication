package com.app.hiten.loanapplication.util;

import android.content.Context;
import android.content.SharedPreferences;

import com.app.hiten.loanapplication.R;

public class PrefUtils {
    /**
     * Storing API Key in shared preferences to
     * add it in header part of every retrofit request
     */
    public PrefUtils() {
    }
 
    private static SharedPreferences getSharedPreferences(Context context) {
        return context.getSharedPreferences("APP_PREF", Context.MODE_PRIVATE);
    }
 
    public static void storeApiKey(Context context, String apiKey) {
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        editor.putString(context.getString(R.string.api_key), apiKey);
        editor.commit();
    }
 
    public static String getApiKey(Context context) {
        return getSharedPreferences(context).getString("API_KEY", null);
    }
}