package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* loaded from: classes.dex */
public abstract class i92 {
    public static PackageInfo a(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }
}
