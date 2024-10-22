package com.chartboost.sdk.internal.Libraries;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import com.chartboost.sdk.impl.f6;
import com.chartboost.sdk.impl.g7;
import com.chartboost.sdk.impl.t8;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class CBUtility {

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1341a;

        static {
            int[] iArr = new int[g7.values().length];
            f1341a = iArr;
            try {
                iArr[g7.LANDSCAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1341a[g7.LANDSCAPE_REVERSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1341a[g7.LANDSCAPE_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1341a[g7.LANDSCAPE_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1341a[g7.PORTRAIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1341a[g7.PORTRAIT_REVERSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1341a[g7.PORTRAIT_LEFT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1341a[g7.PORTRAIT_RIGHT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static g7 a(Context context) {
        if (context == null) {
            return g7.PORTRAIT;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return g7.PORTRAIT;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        if (defaultDisplay == null) {
            return g7.PORTRAIT;
        }
        int rotation = defaultDisplay.getRotation();
        boolean z = defaultDisplay.getWidth() != defaultDisplay.getHeight() ? defaultDisplay.getWidth() < defaultDisplay.getHeight() : context.getResources().getConfiguration().orientation != 2;
        if (rotation != 0 && rotation != 2) {
            z = !z;
        }
        if (z) {
            if (rotation == 1) {
                return g7.LANDSCAPE_LEFT;
            }
            if (rotation == 2) {
                return g7.PORTRAIT_REVERSE;
            }
            if (rotation != 3) {
                return g7.PORTRAIT;
            }
            return g7.LANDSCAPE_RIGHT;
        }
        if (rotation == 1) {
            return g7.PORTRAIT_LEFT;
        }
        if (rotation == 2) {
            return g7.LANDSCAPE_REVERSE;
        }
        if (rotation != 3) {
            return g7.LANDSCAPE;
        }
        return g7.PORTRAIT_RIGHT;
    }

    public static String b(Context context) {
        switch (a.f1341a[a(context).ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return "landscape";
            case 5:
            case 6:
            case 7:
            case 8:
                return "portrait";
            default:
                return "unknown";
        }
    }

    public static void throwProguardError(Exception exc) {
        if (exc instanceof NoSuchMethodException) {
            f6.b("CBUtility", "Chartboost library error! Have you used proguard on your application? Make sure to add the line '-keep class com.chartboost.sdk.** { *; }' to your proguard config file.");
        } else if (exc != null && exc.getMessage() != null) {
            f6.b("CBUtility", exc.getMessage());
        } else {
            f6.b("CBUtility", "Unknown Proguard error");
        }
    }

    public static String b() {
        return String.format("%s %s %s", "Chartboost-Android-SDK", "", "9.4.1");
    }

    public static void b(Activity activity, t8 t8Var) {
        if (activity == null || a(activity) || !t8Var.s || !t8Var.w) {
            return;
        }
        activity.setRequestedOrientation(-1);
    }

    public static String a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ZZZZ", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        return simpleDateFormat.format(new Date());
    }

    public static void a(Activity activity, t8 t8Var) {
        if (activity == null || a(activity) || !t8Var.s || !t8Var.w) {
            return;
        }
        g7 a2 = a((Context) activity);
        if (a2 != g7.PORTRAIT && a2 != g7.PORTRAIT_RIGHT) {
            if (a2 != g7.PORTRAIT_REVERSE && a2 != g7.PORTRAIT_LEFT) {
                if (a2 != g7.LANDSCAPE && a2 != g7.LANDSCAPE_LEFT) {
                    activity.setRequestedOrientation(8);
                    return;
                } else {
                    activity.setRequestedOrientation(0);
                    return;
                }
            }
            activity.setRequestedOrientation(9);
            return;
        }
        activity.setRequestedOrientation(1);
    }

    public static boolean a(g7 g7Var) {
        return g7Var == g7.PORTRAIT || g7Var == g7.PORTRAIT_REVERSE || g7Var == g7.PORTRAIT_LEFT || g7Var == g7.PORTRAIT_RIGHT;
    }

    public static ArrayList<File> a(File file, boolean z) {
        if (file == null) {
            return null;
        }
        ArrayList<File> arrayList = new ArrayList<>();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isFile() && !file2.getName().equals(".nomedia")) {
                    arrayList.add(file2);
                } else if (file2.isDirectory() && z) {
                    arrayList.addAll(a(file2, z));
                }
            }
        }
        return arrayList;
    }

    public static boolean a(Activity activity) {
        if (activity == null || activity.getWindow() == null || activity.getWindow().getDecorView() == null || activity.getWindow().getDecorView().getBackground() == null) {
            return true;
        }
        return Build.VERSION.SDK_INT == 26 && activity.getApplicationInfo().targetSdkVersion > 26 && activity.getWindow().getDecorView().getBackground().getAlpha() != 255;
    }
}
