package defpackage;

import android.content.Context;
import java.io.File;

/* loaded from: classes2.dex */
public final class yy3 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5403a;

    public yy3(Context context) {
        this.f5403a = context;
    }

    public static long a(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                j += a(file2);
            }
        }
        return j;
    }
}
