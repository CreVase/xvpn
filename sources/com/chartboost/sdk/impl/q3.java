package com.chartboost.sdk.impl;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import java.util.UUID;

/* loaded from: classes.dex */
public class q3 {

    /* renamed from: a, reason: collision with root package name */
    public static int f1082a = 4;

    /* renamed from: b, reason: collision with root package name */
    public static int f1083b = 5;

    public static String a(Context context, boolean z) {
        String a2 = a(context);
        return (z || a2 == null) ? c(context) : a2;
    }

    public static Integer b(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f = displayMetrics.heightPixels / displayMetrics.ydpi;
        float f2 = displayMetrics.widthPixels / displayMetrics.xdpi;
        if (Math.sqrt((f * f) + (f2 * f2)) >= 6.5d) {
            return Integer.valueOf(f1083b);
        }
        return Integer.valueOf(f1082a);
    }

    public static String c(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("cbPrefs", 0);
        if (sharedPreferences == null) {
            return UUID.randomUUID().toString();
        }
        String string = sharedPreferences.getString("cbUUID", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (edit != null) {
            edit.putString("cbUUID", uuid).apply();
        }
        return uuid;
    }

    public static String d(Context context) {
        Resources resources;
        Configuration configuration;
        if (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null) {
            return "phone";
        }
        int i = configuration.uiMode & 15;
        int i2 = configuration.screenLayout & 15;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return "phone";
        }
        if (!packageManager.hasSystemFeature("org.chromium.arc.device_management")) {
            String str = Build.BRAND;
            if (str == null || !str.equals("chromium") || !Build.MANUFACTURER.equals("chromium")) {
                String str2 = Build.DEVICE;
                if (str2 == null || !str2.matches(".+_cheets")) {
                    if (!packageManager.hasSystemFeature("android.hardware.type.watch") && i != 6) {
                        if (!packageManager.hasSystemFeature("android.hardware.type.television") && i != 4) {
                            String str3 = Build.MANUFACTURER;
                            if ((str3 == null || !str3.equalsIgnoreCase("Amazon")) && i2 != 4) {
                                return "phone";
                            }
                            return "tablet";
                        }
                        return "tv";
                    }
                    return "watch";
                }
                return "chromebook";
            }
            return "chromebook";
        }
        return "chromebook";
    }

    public static boolean e(Context context) {
        try {
            Object obj = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get("cb.limit.aid");
            if (obj instanceof Integer) {
                if (((Integer) obj).intValue() == 1) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @SuppressLint({"HardwareIds"})
    public static String a(Context context) {
        ContentResolver contentResolver;
        if (context == null || Build.VERSION.SDK_INT >= 26 || e(context) || (contentResolver = context.getContentResolver()) == null) {
            return null;
        }
        try {
            String string = Settings.Secure.getString(contentResolver, "android_id");
            try {
                if ("9774d56d682e549c".equals(string)) {
                    return null;
                }
            } catch (Exception unused) {
            }
            return string;
        } catch (Exception unused2) {
            return null;
        }
    }
}
