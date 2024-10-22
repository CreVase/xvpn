package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class ka1 implements uc1 {
    public static final Pattern g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");

    /* renamed from: a, reason: collision with root package name */
    public final i4 f2915a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f2916b;
    public final String c;
    public final xx0 d;
    public final nd0 e;
    public sl f;

    public ka1(Context context, String str, xx0 xx0Var, nd0 nd0Var) {
        if (str != null) {
            this.f2916b = context;
            this.c = str;
            this.d = xx0Var;
            this.e = nd0Var;
            this.f2915a = new i4(0);
            return;
        }
        throw new IllegalArgumentException("appIdentifier must not be null");
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        String uuid = UUID.randomUUID().toString();
        if (uuid == null) {
            lowerCase = null;
        } else {
            lowerCase = g.matcher(uuid).replaceAll("").toLowerCase(Locale.US);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000b, B:12:0x0019, B:16:0x001d, B:18:0x0034, B:20:0x003c, B:23:0x004b, B:25:0x0063, B:27:0x0069, B:28:0x00c0, B:31:0x0077, B:35:0x0085, B:39:0x0091, B:40:0x009f), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x001d A[Catch: all -> 0x0043, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000b, B:12:0x0019, B:16:0x001d, B:18:0x0034, B:20:0x003c, B:23:0x004b, B:25:0x0063, B:27:0x0069, B:28:0x00c0, B:31:0x0077, B:35:0x0085, B:39:0x0091, B:40:0x009f), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized defpackage.sl b() {
        /*
            r6 = this;
            monitor-enter(r6)
            sl r0 = r6.f     // Catch: java.lang.Throwable -> L43
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L16
            java.lang.String r0 = r0.f4363b     // Catch: java.lang.Throwable -> L43
            if (r0 != 0) goto L14
            nd0 r0 = r6.e     // Catch: java.lang.Throwable -> L43
            boolean r0 = r0.b()     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L14
            goto L16
        L14:
            r0 = 0
            goto L17
        L16:
            r0 = 1
        L17:
            if (r0 != 0) goto L1d
            sl r0 = r6.f     // Catch: java.lang.Throwable -> L43
            monitor-exit(r6)
            return r0
        L1d:
            android.content.Context r0 = r6.f2916b     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = "com.google.firebase.crashlytics"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r3, r2)     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = "firebase.installation.id"
            r4 = 0
            java.lang.String r3 = r0.getString(r3, r4)     // Catch: java.lang.Throwable -> L43
            nd0 r5 = r6.e     // Catch: java.lang.Throwable -> L43
            boolean r5 = r5.b()     // Catch: java.lang.Throwable -> L43
            if (r5 == 0) goto L83
            xx0 r1 = r6.d     // Catch: java.lang.Throwable -> L43
            wx0 r1 = (defpackage.wx0) r1     // Catch: java.lang.Throwable -> L43
            com.google.android.gms.tasks.Task r1 = r1.d()     // Catch: java.lang.Throwable -> L43
            java.lang.Object r1 = defpackage.aj3.a(r1)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            goto L47
        L43:
            r0 = move-exception
            goto Lc9
        L46:
            r1 = r4
        L47:
            if (r1 != 0) goto L63
            if (r3 != 0) goto L62
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = "SYN_"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L43
            java.util.UUID r2 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L43
            r1.append(r2)     // Catch: java.lang.Throwable -> L43
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L43
            goto L63
        L62:
            r1 = r3
        L63:
            boolean r2 = r1.equals(r3)     // Catch: java.lang.Throwable -> L43
            if (r2 == 0) goto L77
            java.lang.String r2 = "crashlytics.installation.id"
            java.lang.String r0 = r0.getString(r2, r4)     // Catch: java.lang.Throwable -> L43
            sl r2 = new sl     // Catch: java.lang.Throwable -> L43
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L43
            r6.f = r2     // Catch: java.lang.Throwable -> L43
            goto Lc0
        L77:
            java.lang.String r0 = r6.a(r0, r1)     // Catch: java.lang.Throwable -> L43
            sl r2 = new sl     // Catch: java.lang.Throwable -> L43
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L43
            r6.f = r2     // Catch: java.lang.Throwable -> L43
            goto Lc0
        L83:
            if (r3 == 0) goto L8e
            java.lang.String r5 = "SYN_"
            boolean r3 = r3.startsWith(r5)     // Catch: java.lang.Throwable -> L43
            if (r3 == 0) goto L8e
            goto L8f
        L8e:
            r1 = 0
        L8f:
            if (r1 == 0) goto L9f
            java.lang.String r1 = "crashlytics.installation.id"
            java.lang.String r0 = r0.getString(r1, r4)     // Catch: java.lang.Throwable -> L43
            sl r1 = new sl     // Catch: java.lang.Throwable -> L43
            r1.<init>(r0, r4)     // Catch: java.lang.Throwable -> L43
            r6.f = r1     // Catch: java.lang.Throwable -> L43
            goto Lc0
        L9f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = "SYN_"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L43
            java.util.UUID r2 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L43
            r1.append(r2)     // Catch: java.lang.Throwable -> L43
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L43
            java.lang.String r0 = r6.a(r0, r1)     // Catch: java.lang.Throwable -> L43
            sl r1 = new sl     // Catch: java.lang.Throwable -> L43
            r1.<init>(r0, r4)     // Catch: java.lang.Throwable -> L43
            r6.f = r1     // Catch: java.lang.Throwable -> L43
        Lc0:
            sl r0 = r6.f     // Catch: java.lang.Throwable -> L43
            java.util.Objects.toString(r0)     // Catch: java.lang.Throwable -> L43
            sl r0 = r6.f     // Catch: java.lang.Throwable -> L43
            monitor-exit(r6)
            return r0
        Lc9:
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ka1.b():sl");
    }

    public final String c() {
        String str;
        i4 i4Var = this.f2915a;
        Context context = this.f2916b;
        synchronized (i4Var) {
            if (i4Var.f2534a == null) {
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName == null) {
                    installerPackageName = "";
                }
                i4Var.f2534a = installerPackageName;
            }
            if ("".equals(i4Var.f2534a)) {
                str = null;
            } else {
                str = i4Var.f2534a;
            }
        }
        return str;
    }
}
