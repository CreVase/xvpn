package com.chartboost.sdk.impl;

import android.content.Context;
import java.io.File;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class r4 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference<t8> f1105a;

    /* renamed from: b, reason: collision with root package name */
    public final s4 f1106b;

    public r4(Context context, AtomicReference<t8> atomicReference) {
        s4 s4Var = new s4(context.getCacheDir());
        this.f1106b = s4Var;
        this.f1105a = atomicReference;
        try {
            long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(atomicReference.get().q);
            File file = new File(s4Var.f1125a, "templates");
            if (file.exists()) {
                a(file.listFiles(), currentTimeMillis);
                a(s4Var);
            }
        } catch (Exception e) {
            f6.a("FileCache", "Exception while cleaning up templates directory at " + this.f1106b.f.getPath(), e);
            e.printStackTrace();
        }
    }

    public boolean a(File file) {
        if (file == null || !file.exists()) {
            return false;
        }
        return file.delete();
    }

    public final void b(File[] fileArr, long j) {
        if (fileArr != null) {
            for (File file : fileArr) {
                if (file.lastModified() < j && !file.delete()) {
                    f6.b("FileCache", "Unable to delete " + file.getPath());
                }
            }
        }
    }

    public boolean c(File file) {
        return file != null && file.exists() && file.length() > 0;
    }

    public File[] d() {
        File c = c();
        if (c != null) {
            return c.listFiles();
        }
        return null;
    }

    public File e() {
        return this.f1106b.i;
    }

    public JSONObject f() {
        String[] list;
        JSONObject jSONObject = new JSONObject();
        try {
            File file = a().f1125a;
            for (String str : this.f1105a.get().r) {
                if (!str.equals("templates")) {
                    File file2 = new File(file, str);
                    JSONArray jSONArray = new JSONArray();
                    if (file2.exists() && (list = file2.list()) != null) {
                        for (String str2 : list) {
                            if (!str2.equals(".nomedia") && !str2.endsWith(".tmp")) {
                                jSONArray.put(str2);
                            }
                        }
                    }
                    t1.a(jSONObject, str, jSONArray);
                }
            }
        } catch (Exception e) {
            f6.b("FileCache", "getWebViewCacheAssets: " + e.toString());
        }
        return jSONObject;
    }

    public File c() {
        return this.f1106b.h;
    }

    public File a(File file, String str) {
        if (file == null || str == null) {
            return null;
        }
        File file2 = new File(file, str);
        if (!file2.exists() || file2.length() <= 0) {
            return null;
        }
        return file2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:            if (r1 == null) goto L30;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(java.io.File r6) {
        /*
            r5 = this;
            java.lang.String r0 = "FileCache"
            r1 = 0
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L28 java.io.FileNotFoundException -> L31
            java.lang.String r3 = "rw"
            r2.<init>(r6, r3)     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L28 java.io.FileNotFoundException -> L31
            r3 = 0
            r2.seek(r3)     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L20 java.io.FileNotFoundException -> L23
            int r6 = r2.read()     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L20 java.io.FileNotFoundException -> L23
            r2.seek(r3)     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L20 java.io.FileNotFoundException -> L23
            r2.write(r6)     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L20 java.io.FileNotFoundException -> L23
            r2.close()     // Catch: java.io.IOException -> L3c
            goto L3c
        L1d:
            r6 = move-exception
            r1 = r2
            goto L3d
        L20:
            r6 = move-exception
            r1 = r2
            goto L29
        L23:
            r6 = move-exception
            r1 = r2
            goto L32
        L26:
            r6 = move-exception
            goto L3d
        L28:
            r6 = move-exception
        L29:
            java.lang.String r2 = "IOException when attempting to touch file"
            com.chartboost.sdk.impl.f6.a(r0, r2, r6)     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L3c
            goto L39
        L31:
            r6 = move-exception
        L32:
            java.lang.String r2 = "File not found when attempting to touch"
            com.chartboost.sdk.impl.f6.a(r0, r2, r6)     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L3c
        L39:
            r1.close()     // Catch: java.io.IOException -> L3c
        L3c:
            return
        L3d:
            if (r1 == 0) goto L42
            r1.close()     // Catch: java.io.IOException -> L42
        L42:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.r4.d(java.io.File):void");
    }

    public final void a(File[] fileArr, long j) {
        if (fileArr != null) {
            for (File file : fileArr) {
                if (file.isDirectory()) {
                    b(file.listFiles(), j);
                    a(file.listFiles(), file);
                }
            }
        }
    }

    public long b(File file) {
        long j = 0;
        if (file != null) {
            try {
                if (file.isDirectory()) {
                    File[] listFiles = file.listFiles();
                    if (listFiles == null) {
                        return 0L;
                    }
                    for (File file2 : listFiles) {
                        j += b(file2);
                    }
                    return j;
                }
            } catch (Exception e) {
                f6.b("FileCache", "getFolderSize: " + e.toString());
                return 0L;
            }
        }
        if (file != null) {
            return file.length();
        }
        return 0L;
    }

    public final void a(File[] fileArr, File file) {
        if (fileArr == null || fileArr.length != 0 || file.delete()) {
            return;
        }
        f6.b("FileCache", "Unable to delete " + file.getPath());
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        t1.a(jSONObject, ".chartboost-internal-folder-size", Long.valueOf(b(this.f1106b.f1125a)));
        File file = a().f1125a;
        String[] list = file.list();
        if (list != null && list.length > 0) {
            for (String str : list) {
                File file2 = new File(file, str);
                JSONObject jSONObject2 = new JSONObject();
                t1.a(jSONObject2, file2.getName() + "-size", Long.valueOf(b(file2)));
                String[] list2 = file2.list();
                if (list2 != null) {
                    t1.a(jSONObject2, "count", Integer.valueOf(list2.length));
                }
                t1.a(jSONObject, file2.getName(), jSONObject2);
            }
        }
        return jSONObject;
    }

    public final void a(s4 s4Var) {
        File file = new File(s4Var.f1125a, ".adId");
        if (!file.exists() || file.delete()) {
            return;
        }
        f6.b("FileCache", "Unable to delete " + file.getPath());
    }

    public s4 a() {
        return this.f1106b;
    }

    public Boolean a(r rVar) {
        Map<String, w0> c = rVar.c();
        s4 a2 = a();
        if (a2 == null) {
            return Boolean.FALSE;
        }
        File file = a2.f1125a;
        for (w0 w0Var : c.values()) {
            File a3 = w0Var.a(file);
            if (a3 == null) {
                return Boolean.FALSE;
            }
            if (!a3.exists()) {
                f6.e("FileCache", "Asset does not exist: " + w0Var.f1255b);
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }
}
