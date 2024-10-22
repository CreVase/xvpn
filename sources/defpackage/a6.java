package defpackage;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.activity.ComponentActivity;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class a6 extends x80 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f29a = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(ComponentActivity componentActivity, String[] strArr, int i) {
        String[] strArr2;
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (!TextUtils.isEmpty(strArr[i2])) {
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i2));
                }
            } else {
                throw new IllegalArgumentException(hx2.s(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
        }
        int size = hashSet.size();
        if (size > 0) {
            strArr2 = new String[strArr.length - size];
        } else {
            strArr2 = strArr;
        }
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < strArr.length; i4++) {
                if (!hashSet.contains(Integer.valueOf(i4))) {
                    strArr2[i3] = strArr[i4];
                    i3++;
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (componentActivity instanceof y5) {
                ((y5) componentActivity).validateRequestPermissionsRequestCode(i);
            }
            u5.b(componentActivity, strArr, i);
        } else if (componentActivity instanceof x5) {
            new Handler(Looper.getMainLooper()).post(new l30(strArr2, componentActivity, i, 3));
        }
    }

    public static boolean b(Activity activity, String str) {
        int i = Build.VERSION.SDK_INT;
        if (i < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i >= 32) {
            return w5.a(activity, str);
        }
        if (i == 31) {
            return v5.b(activity, str);
        }
        if (i < 23) {
            return false;
        }
        return u5.c(activity, str);
    }
}
