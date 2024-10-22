package defpackage;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class bs3 {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f521a;

    static {
        bo1.e("WrkDbPathHelper");
        f521a = new String[]{"-journal", "-shm", "-wal"};
    }

    public static void a(Context context) {
        File file;
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        int i = Build.VERSION.SDK_INT;
        if (i >= 23 && databasePath.exists()) {
            bo1.c().a(new Throwable[0]);
            HashMap hashMap = new HashMap();
            if (i >= 23) {
                File databasePath2 = context.getDatabasePath("androidx.work.workdb");
                if (i < 23) {
                    file = context.getDatabasePath("androidx.work.workdb");
                } else {
                    file = new File(context.getNoBackupFilesDir(), "androidx.work.workdb");
                }
                hashMap.put(databasePath2, file);
                for (String str : f521a) {
                    hashMap.put(new File(databasePath2.getPath() + str), new File(file.getPath() + str));
                }
            }
            for (File file2 : hashMap.keySet()) {
                File file3 = (File) hashMap.get(file2);
                if (file2.exists() && file3 != null) {
                    if (file3.exists()) {
                        String.format("Over-writing contents of %s", file3);
                        bo1.c().f(new Throwable[0]);
                    }
                    if (file2.renameTo(file3)) {
                        String.format("Migrated %s to %s", file2, file3);
                    } else {
                        String.format("Renaming %s to %s failed", file2, file3);
                    }
                    bo1.c().a(new Throwable[0]);
                }
            }
        }
    }
}
