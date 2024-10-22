package defpackage;

import android.os.Bundle;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes.dex */
public final class jt0 extends o52 {
    public static final String o = wi3.z(1001);
    public static final String p = wi3.z(1002);
    public static final String q = wi3.z(1003);
    public static final String r = wi3.z(1004);
    public static final String s = wi3.z(WebSocketProtocol.CLOSE_NO_STATUS_CODE);
    public static final String t = wi3.z(1006);
    public final int h;
    public final String i;
    public final int j;
    public final y01 k;
    public final int l;
    public final nt1 m;
    public final boolean n;

    public jt0(int i, Throwable th, int i2) {
        this(i, th, i2, null, -1, null, 4, false);
    }

    public final jt0 a(rt1 rt1Var) {
        return new jt0(getMessage(), getCause(), this.f3604a, this.h, this.i, this.j, this.k, this.l, rt1Var, this.f3605b, this.n);
    }

    @Override // defpackage.o52, defpackage.bs
    public final Bundle toBundle() {
        Bundle bundle = super.toBundle();
        bundle.putInt(o, this.h);
        bundle.putString(p, this.i);
        bundle.putInt(q, this.j);
        y01 y01Var = this.k;
        if (y01Var != null) {
            bundle.putBundle(r, y01Var.e(false));
        }
        bundle.putInt(s, this.l);
        bundle.putBoolean(t, this.n);
        return bundle;
    }

    public jt0(String str, Throwable th, int i, int i2, String str2, int i3, y01 y01Var, int i4, rt1 rt1Var, long j, boolean z) {
        super(str, th, i, j);
        cp3.e(!z || i2 == 1);
        cp3.e(th != null || i2 == 3);
        this.h = i2;
        this.i = str2;
        this.j = i3;
        this.k = y01Var;
        this.l = i4;
        this.m = rt1Var;
        this.n = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public jt0(int r14, java.lang.Throwable r15, int r16, java.lang.String r17, int r18, defpackage.y01 r19, int r20, boolean r21) {
        /*
            r13 = this;
            r4 = r14
            r8 = r20
            if (r4 == 0) goto L64
            r0 = 3
            r1 = 1
            if (r4 == r1) goto L17
            if (r4 == r0) goto Le
            java.lang.String r0 = "Unexpected runtime error"
            goto L10
        Le:
            java.lang.String r0 = "Remote error"
        L10:
            r5 = r17
            r6 = r18
            r7 = r19
            goto L6c
        L17:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r5 = r17
            r2.append(r5)
            java.lang.String r3 = " error, index="
            r2.append(r3)
            r6 = r18
            r2.append(r6)
            java.lang.String r3 = ", format="
            r2.append(r3)
            r7 = r19
            r2.append(r7)
            java.lang.String r3 = ", format_supported="
            r2.append(r3)
            int r3 = defpackage.wi3.f5017a
            if (r8 == 0) goto L5a
            if (r8 == r1) goto L57
            r1 = 2
            if (r8 == r1) goto L54
            if (r8 == r0) goto L51
            r0 = 4
            if (r8 != r0) goto L4b
            java.lang.String r0 = "YES"
            goto L5c
        L4b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L51:
            java.lang.String r0 = "NO_EXCEEDS_CAPABILITIES"
            goto L5c
        L54:
            java.lang.String r0 = "NO_UNSUPPORTED_DRM"
            goto L5c
        L57:
            java.lang.String r0 = "NO_UNSUPPORTED_TYPE"
            goto L5c
        L5a:
            java.lang.String r0 = "NO"
        L5c:
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L6c
        L64:
            r5 = r17
            r6 = r18
            r7 = r19
            java.lang.String r0 = "Source error"
        L6c:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L79
            java.lang.String r1 = ": null"
            java.lang.String r0 = defpackage.p71.l(r0, r1)
        L79:
            r1 = r0
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r2 = r15
            r3 = r16
            r4 = r14
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r12 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jt0.<init>(int, java.lang.Throwable, int, java.lang.String, int, y01, int, boolean):void");
    }
}
