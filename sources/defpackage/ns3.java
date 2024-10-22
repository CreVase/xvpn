package defpackage;

import java.util.HashSet;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class ns3 {

    /* renamed from: a, reason: collision with root package name */
    public UUID f3530a;

    /* renamed from: b, reason: collision with root package name */
    public rs3 f3531b;
    public final HashSet c;

    public ns3(Class cls) {
        HashSet hashSet = new HashSet();
        this.c = hashSet;
        this.f3530a = UUID.randomUUID();
        this.f3531b = new rs3(this.f3530a.toString(), cls.getName());
        hashSet.add(cls.getName());
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:            if (r3 == false) goto L9;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.f32 a() {
        /*
            r6 = this;
            r0 = r6
            e32 r0 = (defpackage.e32) r0
            f32 r1 = new f32
            r1.<init>(r0)
            rs3 r0 = r6.f3531b
            u70 r0 = r0.j
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            r4 = 1
            r5 = 0
            if (r2 < r3) goto L23
            j80 r3 = r0.h
            java.util.HashSet r3 = r3.f2720a
            int r3 = r3.size()
            if (r3 <= 0) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            if (r3 != 0) goto L35
        L23:
            boolean r3 = r0.d
            if (r3 != 0) goto L35
            boolean r3 = r0.f4634b
            if (r3 != 0) goto L35
            r3 = 23
            if (r2 < r3) goto L34
            boolean r0 = r0.c
            if (r0 == 0) goto L34
            goto L35
        L34:
            r4 = 0
        L35:
            rs3 r0 = r6.f3531b
            boolean r0 = r0.q
            if (r0 == 0) goto L46
            if (r4 != 0) goto L3e
            goto L46
        L3e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Expedited jobs only support network and storage constraints"
            r0.<init>(r1)
            throw r0
        L46:
            java.util.UUID r0 = java.util.UUID.randomUUID()
            r6.f3530a = r0
            rs3 r0 = new rs3
            rs3 r2 = r6.f3531b
            r0.<init>(r2)
            r6.f3531b = r0
            java.util.UUID r2 = r6.f3530a
            java.lang.String r2 = r2.toString()
            r0.f4206a = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ns3.a():f32");
    }
}
