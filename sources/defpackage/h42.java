package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: classes.dex */
public abstract class h42 {
    static {
        bo1.e("PackageManagerHelper");
    }

    public static void a(Context context, Class cls, boolean z) {
        int i;
        Object obj;
        String str = "enabled";
        try {
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, cls.getName());
            if (z) {
                i = 1;
            } else {
                i = 2;
            }
            packageManager.setComponentEnabledSetting(componentName, i, 1);
            bo1 c = bo1.c();
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            if (z) {
                obj = "enabled";
            } else {
                obj = "disabled";
            }
            objArr[1] = obj;
            String.format("%s %s", objArr);
            c.a(new Throwable[0]);
        } catch (Exception e) {
            bo1 c2 = bo1.c();
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            if (!z) {
                str = "disabled";
            }
            objArr2[1] = str;
            String.format("%s could not be %s", objArr2);
            c2.a(e);
        }
    }
}
