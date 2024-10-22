package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import java.io.File;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class x80 {
    private static final String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final String TAG = "ContextCompat";
    private static final Object sLock = new Object();
    private static final Object sSync = new Object();
    private static TypedValue sTempValue;

    public static int checkSelfPermission(Context context, String str) {
        if (str != null) {
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                if (new l12(context).a()) {
                    return 0;
                }
                return -1;
            }
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static Context createDeviceProtectedStorageContext(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return r80.a(context);
        }
        return null;
    }

    public static String getAttributionTag(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return u80.a(context);
        }
        return null;
    }

    public static File getCodeCacheDir(Context context) {
        return p80.a(context);
    }

    public static int getColor(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return q80.a(context, i);
        }
        return context.getResources().getColor(i);
    }

    public static ColorStateList getColorStateList(Context context, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ek2 ek2Var;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        fk2 fk2Var = new fk2(resources, theme);
        synchronized (jk2.c) {
            SparseArray sparseArray = (SparseArray) jk2.f2781b.get(fk2Var);
            colorStateList = null;
            if (sparseArray != null && sparseArray.size() > 0 && (ek2Var = (ek2) sparseArray.get(i)) != null) {
                if (ek2Var.f1950b.equals(resources.getConfiguration()) && ((theme == null && ek2Var.c == 0) || (theme != null && ek2Var.c == theme.hashCode()))) {
                    colorStateList2 = ek2Var.f1949a;
                } else {
                    sparseArray.remove(i);
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 == null) {
            ThreadLocal threadLocal = jk2.f2780a;
            TypedValue typedValue = (TypedValue) threadLocal.get();
            if (typedValue == null) {
                typedValue = new TypedValue();
                threadLocal.set(typedValue);
            }
            boolean z = true;
            resources.getValue(i, typedValue, true);
            int i2 = typedValue.type;
            if (i2 < 28 || i2 > 31) {
                z = false;
            }
            if (!z) {
                try {
                    colorStateList = g20.a(resources, resources.getXml(i), theme);
                } catch (Exception unused) {
                }
            }
            if (colorStateList != null) {
                jk2.a(fk2Var, i, colorStateList, theme);
                return colorStateList;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                return dk2.b(resources, i, theme);
            }
            return resources.getColorStateList(i);
        }
        return colorStateList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x005b, code lost:            if (r2 != null) goto L62;     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0068, code lost:            r2.close();     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0054, code lost:            r1 = r3.getAttributeValue(null, "application_locales");     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0066, code lost:            if (r2 == null) goto L35;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.Context getContextForLanguage(android.content.Context r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L1a
            java.lang.String r0 = "locale"
            java.lang.Object r0 = r8.getSystemService(r0)
            if (r0 == 0) goto L17
            android.os.LocaleList r0 = defpackage.cn1.a(r0)
            wm1 r0 = defpackage.wm1.f(r0)
            goto L7e
        L17:
            wm1 r0 = defpackage.wm1.f5037b
            goto L7e
        L1a:
            java.lang.Object r0 = defpackage.of.f3650a
            monitor-enter(r0)
            java.lang.String r1 = ""
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileInputStream r2 = r8.openFileInput(r2)     // Catch: java.io.FileNotFoundException -> L79 java.lang.Throwable -> La7
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L5e java.lang.Throwable -> L65
            java.lang.String r4 = "UTF-8"
            r3.setInput(r2, r4)     // Catch: java.lang.Throwable -> L5e java.lang.Throwable -> L65
            int r4 = r3.getDepth()     // Catch: java.lang.Throwable -> L5e java.lang.Throwable -> L65
        L32:
            int r5 = r3.next()     // Catch: java.lang.Throwable -> L5e java.lang.Throwable -> L65
            r6 = 1
            if (r5 == r6) goto L5b
            r6 = 3
            if (r5 != r6) goto L42
            int r7 = r3.getDepth()     // Catch: java.lang.Throwable -> L5e java.lang.Throwable -> L65
            if (r7 <= r4) goto L5b
        L42:
            if (r5 == r6) goto L32
            r6 = 4
            if (r5 != r6) goto L48
            goto L32
        L48:
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> L5e java.lang.Throwable -> L65
            java.lang.String r6 = "locales"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L5e java.lang.Throwable -> L65
            if (r5 == 0) goto L32
            java.lang.String r4 = "application_locales"
            r5 = 0
            java.lang.String r1 = r3.getAttributeValue(r5, r4)     // Catch: java.lang.Throwable -> L5e java.lang.Throwable -> L65
        L5b:
            if (r2 == 0) goto L6b
            goto L68
        L5e:
            r8 = move-exception
            if (r2 == 0) goto L64
            r2.close()     // Catch: java.io.IOException -> L64 java.lang.Throwable -> La7
        L64:
            throw r8     // Catch: java.lang.Throwable -> La7
        L65:
            if (r2 == 0) goto L6b
        L68:
            r2.close()     // Catch: java.io.IOException -> L6b java.lang.Throwable -> La7
        L6b:
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> La7
            if (r2 != 0) goto L72
            goto L77
        L72:
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r8.deleteFile(r2)     // Catch: java.lang.Throwable -> La7
        L77:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La7
            goto L7a
        L79:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La7
        L7a:
            wm1 r0 = defpackage.wm1.b(r1)
        L7e:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 32
            if (r1 > r2) goto La6
            boolean r2 = r0.d()
            if (r2 != 0) goto La6
            android.content.res.Configuration r2 = new android.content.res.Configuration
            android.content.res.Resources r3 = r8.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            r2.<init>(r3)
            r3 = 24
            if (r1 < r3) goto L9f
            defpackage.w40.b(r2, r0)
            goto La2
        L9f:
            defpackage.v40.a(r2, r0)
        La2:
            android.content.Context r8 = defpackage.n80.a(r8, r2)
        La6:
            return r8
        La7:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La7
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x80.getContextForLanguage(android.content.Context):android.content.Context");
    }

    public static File getDataDir(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return r80.b(context);
        }
        String str = context.getApplicationInfo().dataDir;
        if (str != null) {
            return new File(str);
        }
        return null;
    }

    public static Display getDisplayOrDefault(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return u80.b(context);
        }
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public static Drawable getDrawable(Context context, int i) {
        return p80.b(context, i);
    }

    public static File[] getExternalCacheDirs(Context context) {
        return o80.a(context);
    }

    public static File[] getExternalFilesDirs(Context context, String str) {
        return o80.b(context, str);
    }

    public static Executor getMainExecutor(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return t80.a(context);
        }
        return new ts0(new Handler(context.getMainLooper()));
    }

    public static File getNoBackupFilesDir(Context context) {
        return p80.c(context);
    }

    public static File[] getObbDirs(Context context) {
        return o80.c(context);
    }

    public static String getString(Context context, int i) {
        return getContextForLanguage(context).getString(i);
    }

    public static <T> T getSystemService(Context context, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 23) {
            return (T) q80.b(context, cls);
        }
        String systemServiceName = getSystemServiceName(context, cls);
        if (systemServiceName != null) {
            return (T) context.getSystemService(systemServiceName);
        }
        return null;
    }

    public static String getSystemServiceName(Context context, Class<?> cls) {
        if (Build.VERSION.SDK_INT >= 23) {
            return q80.c(context, cls);
        }
        return (String) w80.f4960a.get(cls);
    }

    public static boolean isDeviceProtectedStorage(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return r80.c(context);
        }
        return false;
    }

    public static String obtainAndCheckReceiverPermission(Context context) {
        String str = context.getPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
        if (ew3.D0(context, str) == 0) {
            return str;
        }
        throw new RuntimeException(hx2.q("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        return registerReceiver(context, broadcastReceiver, intentFilter, null, null, i);
    }

    public static boolean startActivities(Context context, Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    public static void startActivity(Context context, Intent intent, Bundle bundle) {
        m80.b(context, intent, bundle);
    }

    public static void startForegroundService(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            s80.b(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        int i2 = i & 1;
        if (i2 != 0 && (i & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i2 != 0) {
            i |= 2;
        }
        int i3 = i;
        int i4 = i3 & 2;
        if (i4 == 0 && (i3 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i4 != 0 && (i3 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 33) {
            return v80.a(context, broadcastReceiver, intentFilter, str, handler, i3);
        }
        if (i5 >= 26) {
            return s80.a(context, broadcastReceiver, intentFilter, str, handler, i3);
        }
        if ((i3 & 4) != 0 && str == null) {
            return context.registerReceiver(broadcastReceiver, intentFilter, obtainAndCheckReceiverPermission(context), handler);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
    }

    public static boolean startActivities(Context context, Intent[] intentArr, Bundle bundle) {
        m80.a(context, intentArr, bundle);
        return true;
    }
}
