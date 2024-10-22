package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class jy0 {

    /* renamed from: a, reason: collision with root package name */
    public static final jy0 f2853a = new jy0();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f2854b = Collections.synchronizedMap(new LinkedHashMap());

    public static hy0 a(hr2 hr2Var) {
        Object obj = f2854b.get(hr2Var);
        if (obj != null) {
            return (hy0) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + hr2Var + ". Dependencies should be added at class load time.");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ab A[Catch: all -> 0x00c4, TRY_ENTER, TryCatch #0 {all -> 0x00c4, blocks: (B:12:0x0099, B:23:0x00ab, B:24:0x00c3), top: B:11:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0097 -> B:10:0x0098). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.c90 r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.iy0
            if (r0 == 0) goto L13
            r0 = r11
            iy0 r0 = (defpackage.iy0) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            iy0 r0 = new iy0
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.k
            ba0 r1 = defpackage.ba0.f430a
            int r2 = r0.m
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r2 = r0.j
            java.util.Map r4 = r0.i
            java.util.Map r4 = (java.util.Map) r4
            hy1 r5 = r0.h
            hr2 r6 = r0.g
            java.util.Iterator r7 = r0.f
            java.util.Map r8 = r0.e
            java.util.Map r8 = (java.util.Map) r8
            defpackage.fl.a0(r11)
            goto L98
        L37:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3f:
            defpackage.fl.a0(r11)
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            java.util.Map r2 = defpackage.jy0.f2854b
            int r4 = r2.size()
            int r4 = defpackage.bx3.N(r4)
            r11.<init>(r4)
            java.util.Set r2 = r2.entrySet()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
            r4 = r11
            r7 = r2
        L5d:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto Lcb
            java.lang.Object r11 = r7.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r5 = r11.getKey()
            r6 = r5
            hr2 r6 = (defpackage.hr2) r6
            java.lang.Object r11 = r11.getValue()
            hy0 r11 = (defpackage.hy0) r11
            hy1 r11 = r11.f2500a
            r5 = r4
            java.util.Map r5 = (java.util.Map) r5
            r0.e = r5
            r0.f = r7
            r0.g = r6
            r0.h = r11
            r0.i = r5
            r0.j = r2
            r0.m = r3
            r5 = r11
            ky1 r5 = (defpackage.ky1) r5
            java.lang.Object r11 = r5.d(r0)
            if (r11 != r1) goto L97
            return r1
        L97:
            r8 = r4
        L98:
            r11 = 0
            hy0 r9 = a(r6)     // Catch: java.lang.Throwable -> Lc4
            ha0 r9 = r9.f2501b     // Catch: java.lang.Throwable -> Lc4
            if (r9 == 0) goto Lab
            ky1 r5 = (defpackage.ky1) r5
            r5.e(r11)
            r4.put(r2, r9)
            r4 = r8
            goto L5d
        Lab:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lc4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r2 = "Subscriber "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc4
            r1.append(r6)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r2 = " has not been registered."
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc4
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc4
            throw r0     // Catch: java.lang.Throwable -> Lc4
        Lc4:
            r0 = move-exception
            ky1 r5 = (defpackage.ky1) r5
            r5.e(r11)
            throw r0
        Lcb:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jy0.b(c90):java.lang.Object");
    }
}
