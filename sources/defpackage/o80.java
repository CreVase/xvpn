package defpackage;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public abstract class o80 {
    public static File[] a(Context context) {
        return context.getExternalCacheDirs();
    }

    public static File[] b(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    public static File[] c(Context context) {
        return context.getObbDirs();
    }
}
