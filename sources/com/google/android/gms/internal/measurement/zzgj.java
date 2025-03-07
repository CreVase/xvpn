package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import defpackage.o72;
import defpackage.p32;
import defpackage.r;
import defpackage.uu2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzgj {

    /* loaded from: classes.dex */
    public static class zza {
        private static volatile p32 zza;

        private zza() {
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0036 A[Catch: all -> 0x0054, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0018, B:12:0x0036, B:14:0x0050, B:15:0x003a, B:17:0x0040, B:20:0x0047, B:21:0x004b, B:22:0x0020, B:24:0x0028, B:28:0x0052), top: B:3:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[Catch: all -> 0x0054, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0018, B:12:0x0036, B:14:0x0050, B:15:0x003a, B:17:0x0040, B:20:0x0047, B:21:0x004b, B:22:0x0020, B:24:0x0028, B:28:0x0052), top: B:3:0x0003 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static defpackage.p32 zza(android.content.Context r4) {
            /*
                java.lang.Class<com.google.android.gms.internal.measurement.zzgj$zza> r0 = com.google.android.gms.internal.measurement.zzgj.zza.class
                monitor-enter(r0)
                p32 r1 = com.google.android.gms.internal.measurement.zzgj.zza.zza     // Catch: java.lang.Throwable -> L54
                if (r1 != 0) goto L52
                com.google.android.gms.internal.measurement.zzgj r1 = new com.google.android.gms.internal.measurement.zzgj     // Catch: java.lang.Throwable -> L54
                r1.<init>()     // Catch: java.lang.Throwable -> L54
                java.lang.String r1 = android.os.Build.TYPE     // Catch: java.lang.Throwable -> L54
                java.lang.String r2 = android.os.Build.TAGS     // Catch: java.lang.Throwable -> L54
                java.lang.String r3 = "eng"
                boolean r3 = r1.equals(r3)     // Catch: java.lang.Throwable -> L54
                if (r3 != 0) goto L20
                java.lang.String r3 = "userdebug"
                boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> L54
                if (r1 == 0) goto L31
            L20:
                java.lang.String r1 = "dev-keys"
                boolean r1 = r2.contains(r1)     // Catch: java.lang.Throwable -> L54
                if (r1 != 0) goto L33
                java.lang.String r1 = "test-keys"
                boolean r1 = r2.contains(r1)     // Catch: java.lang.Throwable -> L54
                if (r1 == 0) goto L31
                goto L33
            L31:
                r1 = 0
                goto L34
            L33:
                r1 = 1
            L34:
                if (r1 != 0) goto L3a
                r r4 = defpackage.r.f4081a     // Catch: java.lang.Throwable -> L54
            L38:
                r1 = r4
                goto L50
            L3a:
                boolean r1 = com.google.android.gms.internal.measurement.zzfw.zza()     // Catch: java.lang.Throwable -> L54
                if (r1 == 0) goto L4b
                boolean r1 = defpackage.q62.u(r4)     // Catch: java.lang.Throwable -> L54
                if (r1 == 0) goto L47
                goto L4b
            L47:
                android.content.Context r4 = defpackage.q2.d(r4)     // Catch: java.lang.Throwable -> L54
            L4b:
                p32 r4 = com.google.android.gms.internal.measurement.zzgj.zza(r4)     // Catch: java.lang.Throwable -> L54
                goto L38
            L50:
                com.google.android.gms.internal.measurement.zzgj.zza.zza = r1     // Catch: java.lang.Throwable -> L54
            L52:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L54
                return r1
            L54:
                r4 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L54
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgj.zza.zza(android.content.Context):p32");
        }
    }

    private static zzgh zza(Context context, File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                uu2 uu2Var = new uu2();
                HashMap hashMap = new HashMap();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        String[] split = readLine.split(" ", 3);
                        if (split.length != 3) {
                            Log.e("HermeticFileOverrides", "Invalid: " + readLine);
                        } else {
                            String zza2 = zza(split[0]);
                            String decode = Uri.decode(zza(split[1]));
                            String str = (String) hashMap.get(split[2]);
                            if (str == null) {
                                String zza3 = zza(split[2]);
                                str = Uri.decode(zza3);
                                if (str.length() < 1024 || str == zza3) {
                                    hashMap.put(zza3, str);
                                }
                            }
                            if (!uu2Var.containsKey(zza2)) {
                                uu2Var.put(zza2, new uu2());
                            }
                            ((uu2) uu2Var.getOrDefault(zza2, null)).put(decode, str);
                        }
                    } else {
                        String.valueOf(file);
                        context.getPackageName();
                        zzgc zzgcVar = new zzgc(uu2Var);
                        bufferedReader.close();
                        return zzgcVar;
                    }
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception unused) {
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static p32 zzb(Context context) {
        r rVar = r.f4081a;
        try {
            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            if (file.exists()) {
                return new o72(file);
            }
            return rVar;
        } catch (RuntimeException e) {
            Log.e("HermeticFileOverrides", "no data dir", e);
            return rVar;
        }
    }

    public static p32 zza(Context context) {
        p32 p32Var;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            p32 zzb = zzb(context);
            if (zzb.b()) {
                zzgh zza2 = zza(context, (File) zzb.a());
                zza2.getClass();
                p32Var = new o72(zza2);
            } else {
                p32Var = r.f4081a;
            }
            return p32Var;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    private static final String zza(String str) {
        return new String(str);
    }
}
