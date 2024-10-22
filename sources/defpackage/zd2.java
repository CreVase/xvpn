package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class zd2 implements gx0 {
    public static final Charset d = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final File f5466a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5467b = 65536;
    public yd2 c;

    public zd2(File file) {
        this.f5466a = file;
    }

    @Override // defpackage.gx0
    public final void a() {
        m20.U(this.c, "There was a problem closing the Crashlytics log file.");
        this.c = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    @Override // defpackage.gx0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String b() {
        /*
            r7 = this;
            java.io.File r0 = r7.f5466a
            boolean r0 = r0.exists()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto Lb
            goto L12
        Lb:
            r7.c()
            yd2 r0 = r7.c
            if (r0 != 0) goto L14
        L12:
            r4 = r1
            goto L3a
        L14:
            int[] r3 = new int[]{r2}
            int r0 = r0.P()
            byte[] r0 = new byte[r0]
            yd2 r4 = r7.c     // Catch: java.io.IOException -> L2b
            y33 r5 = new y33     // Catch: java.io.IOException -> L2b
            r6 = 25
            r5.<init>(r6, r7, r0, r3)     // Catch: java.io.IOException -> L2b
            r4.w(r5)     // Catch: java.io.IOException -> L2b
            goto L33
        L2b:
            r4 = move-exception
            java.lang.String r5 = "FirebaseCrashlytics"
            java.lang.String r6 = "A problem occurred while reading the Crashlytics log file."
            android.util.Log.e(r5, r6, r4)
        L33:
            q9 r4 = new q9
            r3 = r3[r2]
            r4.<init>(r0, r3)
        L3a:
            if (r4 != 0) goto L3e
            r3 = r1
            goto L49
        L3e:
            int r0 = r4.f3969a
            byte[] r3 = new byte[r0]
            java.lang.Object r4 = r4.f3970b
            byte[] r4 = (byte[]) r4
            java.lang.System.arraycopy(r4, r2, r3, r2, r0)
        L49:
            if (r3 == 0) goto L52
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r0 = defpackage.zd2.d
            r1.<init>(r3, r0)
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zd2.b():java.lang.String");
    }

    public final void c() {
        File file = this.f5466a;
        if (this.c == null) {
            try {
                this.c = new yd2(file);
            } catch (IOException e) {
                Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e);
            }
        }
    }

    @Override // defpackage.gx0
    public final void d(String str, long j) {
        c();
        int i = this.f5467b;
        if (this.c != null) {
            if (str == null) {
                str = "null";
            }
            try {
                int i2 = i / 4;
                if (str.length() > i2) {
                    str = "..." + str.substring(str.length() - i2);
                }
                this.c.a(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(d));
                while (!this.c.x() && this.c.P() > i) {
                    this.c.M();
                }
            } catch (IOException e) {
                Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e);
            }
        }
    }
}
