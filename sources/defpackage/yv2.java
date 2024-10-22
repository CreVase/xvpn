package defpackage;

import java.io.File;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class yv2 implements de0 {
    public static final LinkedHashSet j = new LinkedHashSet();
    public static final Object k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final v31 f5395a;

    /* renamed from: b, reason: collision with root package name */
    public final xp2 f5396b;
    public final ea0 c;
    public final lv2 d;
    public final String e;
    public final k43 f;
    public final b13 g;
    public List h;
    public final wq2 i;

    public yv2(z62 z62Var, List list, d5 d5Var, aa0 aa0Var) {
        d5 d5Var2 = d5.j;
        this.f5395a = z62Var;
        this.f5396b = d5Var2;
        this.c = d5Var;
        this.d = new lv2(new mv2(this, null));
        this.e = ".tmp";
        this.f = new k43(new yy2(this, 1));
        this.g = pd0.f(xg3.f5156a);
        this.h = d20.Q0(list);
        this.i = new wq2(aa0Var, new fv2(this, 0), new hv2(this, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00de A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fd A[ADDED_TO_REGION, EDGE_INSN: B:29:0x00fd->B:25:0x00fd BREAK  A[LOOP:0: B:20:0x00d3->B:27:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004e  */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(defpackage.yv2 r9, defpackage.cv2 r10, defpackage.c90 r11) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv2.b(yv2, cv2, c90):java.lang.Object");
    }

    @Override // defpackage.de0
    public final Object a(l41 l41Var, xr2 xr2Var) {
        a30 a30Var = new a30(null);
        this.i.e(new cv2(l41Var, a30Var, (y03) this.g.getValue(), xr2Var.getContext()));
        Object q = a30Var.q(xr2Var);
        ba0 ba0Var = ba0.f430a;
        return q;
    }

    public final File c() {
        return (File) this.f.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0102 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.c90 r14) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv2.d(c90):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.c90 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.rv2
            if (r0 == 0) goto L13
            r0 = r5
            rv2 r0 = (defpackage.rv2) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            rv2 r0 = new rv2
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f
            ba0 r1 = defpackage.ba0.f430a
            int r2 = r0.h
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yv2 r0 = r0.e
            defpackage.fl.a0(r5)     // Catch: java.lang.Throwable -> L29
            goto L41
        L29:
            r5 = move-exception
            goto L46
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            defpackage.fl.a0(r5)
            r0.e = r4     // Catch: java.lang.Throwable -> L44
            r0.h = r3     // Catch: java.lang.Throwable -> L44
            java.lang.Object r5 = r4.d(r0)     // Catch: java.lang.Throwable -> L44
            if (r5 != r1) goto L41
            return r1
        L41:
            ch3 r5 = defpackage.ch3.f636a
            return r5
        L44:
            r5 = move-exception
            r0 = r4
        L46:
            b13 r0 = r0.g
            rg2 r1 = new rg2
            r1.<init>(r5)
            r0.g(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv2.e(c90):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.c90 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.sv2
            if (r0 == 0) goto L13
            r0 = r5
            sv2 r0 = (defpackage.sv2) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            sv2 r0 = new sv2
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f
            ba0 r1 = defpackage.ba0.f430a
            int r2 = r0.h
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yv2 r0 = r0.e
            defpackage.fl.a0(r5)     // Catch: java.lang.Throwable -> L29
            goto L4d
        L29:
            r5 = move-exception
            goto L43
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            defpackage.fl.a0(r5)
            r0.e = r4     // Catch: java.lang.Throwable -> L41
            r0.h = r3     // Catch: java.lang.Throwable -> L41
            java.lang.Object r5 = r4.d(r0)     // Catch: java.lang.Throwable -> L41
            if (r5 != r1) goto L4d
            return r1
        L41:
            r5 = move-exception
            r0 = r4
        L43:
            b13 r0 = r0.g
            rg2 r1 = new rg2
            r1.<init>(r5)
            r0.g(r1)
        L4d:
            ch3 r5 = defpackage.ch3.f636a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv2.f(c90):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12, types: [yv2] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [tv2] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [yv2] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.c90 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.tv2
            if (r0 == 0) goto L13
            r0 = r5
            tv2 r0 = (defpackage.tv2) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            tv2 r0 = new tv2
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.g
            ba0 r1 = defpackage.ba0.f430a
            int r2 = r0.i
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.io.FileInputStream r1 = r0.f
            yv2 r0 = r0.e
            defpackage.fl.a0(r5)     // Catch: java.lang.Throwable -> L2b
            goto L55
        L2b:
            r5 = move-exception
            goto L60
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            defpackage.fl.a0(r5)
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L66
            java.io.File r2 = r4.c()     // Catch: java.io.FileNotFoundException -> L66
            r5.<init>(r2)     // Catch: java.io.FileNotFoundException -> L66
            xp2 r2 = r4.f5396b     // Catch: java.lang.Throwable -> L5c
            r0.e = r4     // Catch: java.lang.Throwable -> L5c
            r0.f = r5     // Catch: java.lang.Throwable -> L5c
            r0.i = r3     // Catch: java.lang.Throwable -> L5c
            d5 r2 = (defpackage.d5) r2     // Catch: java.lang.Throwable -> L5c
            fy1 r0 = r2.E(r5)     // Catch: java.lang.Throwable -> L5c
            if (r0 != r1) goto L52
            return r1
        L52:
            r1 = r5
            r5 = r0
            r0 = r4
        L55:
            r2 = 0
            defpackage.tf3.y(r1, r2)     // Catch: java.io.FileNotFoundException -> L5a
            return r5
        L5a:
            r5 = move-exception
            goto L68
        L5c:
            r0 = move-exception
            r1 = r5
            r5 = r0
            r0 = r4
        L60:
            throw r5     // Catch: java.lang.Throwable -> L61
        L61:
            r2 = move-exception
            defpackage.tf3.y(r1, r5)     // Catch: java.io.FileNotFoundException -> L5a
            throw r2     // Catch: java.io.FileNotFoundException -> L5a
        L66:
            r5 = move-exception
            r0 = r4
        L68:
            java.io.File r1 = r0.c()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L7f
            xp2 r5 = r0.f5396b
            d5 r5 = (defpackage.d5) r5
            r5.getClass()
            fy1 r5 = new fy1
            r5.<init>(r3)
            return r5
        L7f:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv2.g(c90):java.lang.Object");
    }

    @Override // defpackage.de0
    public final gz0 getData() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(defpackage.c90 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.uv2
            if (r0 == 0) goto L13
            r0 = r6
            uv2 r0 = (defpackage.uv2) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            uv2 r0 = new uv2
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.g
            ba0 r1 = defpackage.ba0.f430a
            int r2 = r0.i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L67
            if (r2 == r4) goto L5d
            r4 = 3
            if (r2 == r3) goto L3e
            if (r2 != r4) goto L36
            java.lang.Object r1 = r0.f
            java.lang.Object r0 = r0.e
            da0 r0 = (defpackage.da0) r0
            defpackage.fl.a0(r6)     // Catch: java.io.IOException -> L34
            r6 = r1
            goto L56
        L34:
            r6 = move-exception
            goto L59
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3e:
            java.lang.Object r2 = r0.f
            da0 r2 = (defpackage.da0) r2
            java.lang.Object r3 = r0.e
            yv2 r3 = (defpackage.yv2) r3
            defpackage.fl.a0(r6)
            r0.e = r2     // Catch: java.io.IOException -> L57
            r0.f = r6     // Catch: java.io.IOException -> L57
            r0.i = r4     // Catch: java.io.IOException -> L57
            java.lang.Object r0 = r3.j(r6, r0)     // Catch: java.io.IOException -> L57
            if (r0 != r1) goto L56
            return r1
        L56:
            return r6
        L57:
            r6 = move-exception
            r0 = r2
        L59:
            defpackage.bx3.h(r0, r6)
            throw r0
        L5d:
            java.lang.Object r1 = r0.e
            yv2 r1 = (defpackage.yv2) r1
            defpackage.fl.a0(r6)     // Catch: defpackage.da0 -> L65
            goto L75
        L65:
            r6 = move-exception
            goto L78
        L67:
            defpackage.fl.a0(r6)
            r0.e = r5     // Catch: defpackage.da0 -> L76
            r0.i = r4     // Catch: defpackage.da0 -> L76
            java.lang.Object r6 = r5.g(r0)     // Catch: defpackage.da0 -> L76
            if (r6 != r1) goto L75
            return r1
        L75:
            return r6
        L76:
            r6 = move-exception
            r1 = r5
        L78:
            ea0 r2 = r1.c
            r0.e = r1
            r0.f = r6
            r0.i = r3
            d5 r2 = (defpackage.d5) r2
            r2.getClass()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv2.h(c90):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(defpackage.c90 r8, defpackage.t90 r9, defpackage.l41 r10) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.vv2
            if (r0 == 0) goto L13
            r0 = r8
            vv2 r0 = (defpackage.vv2) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            vv2 r0 = new vv2
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.h
            ba0 r1 = defpackage.ba0.f430a
            int r2 = r0.j
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r9 = r0.f
            yv2 r10 = r0.e
            defpackage.fl.a0(r8)
            goto L86
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            java.lang.Object r9 = r0.g
            java.lang.Object r10 = r0.f
            kd0 r10 = (defpackage.kd0) r10
            yv2 r2 = r0.e
            defpackage.fl.a0(r8)
            goto L6b
        L43:
            defpackage.fl.a0(r8)
            b13 r8 = r7.g
            java.lang.Object r8 = r8.getValue()
            kd0 r8 = (defpackage.kd0) r8
            r8.a()
            wv2 r2 = new wv2
            java.lang.Object r6 = r8.f2936a
            r2.<init>(r6, r3, r10)
            r0.e = r7
            r0.f = r8
            r0.g = r6
            r0.j = r5
            java.lang.Object r9 = defpackage.zf3.p0(r0, r9, r2)
            if (r9 != r1) goto L67
            return r1
        L67:
            r2 = r7
            r10 = r8
            r8 = r9
            r9 = r6
        L6b:
            r10.a()
            boolean r10 = defpackage.m20.L(r9, r8)
            if (r10 == 0) goto L75
            goto L98
        L75:
            r0.e = r2
            r0.f = r8
            r0.g = r3
            r0.j = r4
            java.lang.Object r9 = r2.j(r8, r0)
            if (r9 != r1) goto L84
            return r1
        L84:
            r9 = r8
            r10 = r2
        L86:
            b13 r8 = r10.g
            kd0 r10 = new kd0
            if (r9 == 0) goto L91
            int r0 = r9.hashCode()
            goto L92
        L91:
            r0 = 0
        L92:
            r10.<init>(r9, r0)
            r8.g(r10)
        L98:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv2.i(c90, t90, l41):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a3 A[Catch: IOException -> 0x00ba, TryCatch #1 {IOException -> 0x00ba, blocks: (B:15:0x0095, B:19:0x00a3, B:20:0x00b9, B:28:0x00c1, B:29:0x00c4, B:39:0x006c, B:25:0x00bf), top: B:7:0x0023, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.io.File] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.io.File] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(java.lang.Object r9, defpackage.c90 r10) {
        /*
            r8 = this;
            java.lang.String r0 = "Unable to rename "
            boolean r1 = r10 instanceof defpackage.xv2
            if (r1 == 0) goto L15
            r1 = r10
            xv2 r1 = (defpackage.xv2) r1
            int r2 = r1.k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.k = r2
            goto L1a
        L15:
            xv2 r1 = new xv2
            r1.<init>(r8, r10)
        L1a:
            java.lang.Object r10 = r1.i
            ba0 r2 = defpackage.ba0.f430a
            int r3 = r1.k
            ch3 r4 = defpackage.ch3.f636a
            r5 = 1
            if (r3 == 0) goto L3e
            if (r3 != r5) goto L36
            java.io.FileOutputStream r9 = r1.h
            java.io.FileOutputStream r2 = r1.g
            java.io.File r3 = r1.f
            yv2 r1 = r1.e
            defpackage.fl.a0(r10)     // Catch: java.lang.Throwable -> L33
            goto L8d
        L33:
            r9 = move-exception
            goto Lbc
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            defpackage.fl.a0(r10)
            java.io.File r10 = r8.c()
            java.io.File r3 = r10.getCanonicalFile()
            java.io.File r3 = r3.getParentFile()
            if (r3 != 0) goto L50
            goto L59
        L50:
            r3.mkdirs()
            boolean r3 = r3.isDirectory()
            if (r3 == 0) goto Lcf
        L59:
            java.io.File r3 = new java.io.File
            java.io.File r10 = r8.c()
            java.lang.String r10 = r10.getAbsolutePath()
            java.lang.String r6 = r8.e
            java.lang.String r10 = defpackage.m20.d1(r6, r10)
            r3.<init>(r10)
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch: java.io.IOException -> Lba
            r10.<init>(r3)     // Catch: java.io.IOException -> Lba
            xp2 r6 = r8.f5396b     // Catch: java.lang.Throwable -> Lbe
            ev2 r7 = new ev2     // Catch: java.lang.Throwable -> Lbe
            r7.<init>(r10)     // Catch: java.lang.Throwable -> Lbe
            r1.e = r8     // Catch: java.lang.Throwable -> Lbe
            r1.f = r3     // Catch: java.lang.Throwable -> Lbe
            r1.g = r10     // Catch: java.lang.Throwable -> Lbe
            r1.h = r10     // Catch: java.lang.Throwable -> Lbe
            r1.k = r5     // Catch: java.lang.Throwable -> Lbe
            d5 r6 = (defpackage.d5) r6     // Catch: java.lang.Throwable -> Lbe
            r6.L(r9, r7)     // Catch: java.lang.Throwable -> Lbe
            if (r4 != r2) goto L8a
            return r2
        L8a:
            r1 = r8
            r9 = r10
            r2 = r9
        L8d:
            java.io.FileDescriptor r9 = r9.getFD()     // Catch: java.lang.Throwable -> L33
            r9.sync()     // Catch: java.lang.Throwable -> L33
            r9 = 0
            defpackage.tf3.y(r2, r9)     // Catch: java.io.IOException -> Lba
            java.io.File r9 = r1.c()     // Catch: java.io.IOException -> Lba
            boolean r9 = r3.renameTo(r9)     // Catch: java.io.IOException -> Lba
            if (r9 == 0) goto La3
            return r4
        La3:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.io.IOException -> Lba
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lba
            r10.<init>(r0)     // Catch: java.io.IOException -> Lba
            r10.append(r3)     // Catch: java.io.IOException -> Lba
            java.lang.String r0 = ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."
            r10.append(r0)     // Catch: java.io.IOException -> Lba
            java.lang.String r10 = r10.toString()     // Catch: java.io.IOException -> Lba
            r9.<init>(r10)     // Catch: java.io.IOException -> Lba
            throw r9     // Catch: java.io.IOException -> Lba
        Lba:
            r9 = move-exception
            goto Lc5
        Lbc:
            r10 = r2
            goto Lbf
        Lbe:
            r9 = move-exception
        Lbf:
            throw r9     // Catch: java.lang.Throwable -> Lc0
        Lc0:
            r0 = move-exception
            defpackage.tf3.y(r10, r9)     // Catch: java.io.IOException -> Lba
            throw r0     // Catch: java.io.IOException -> Lba
        Lc5:
            boolean r10 = r3.exists()
            if (r10 == 0) goto Lce
            r3.delete()
        Lce:
            throw r9
        Lcf:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r0 = "Unable to create parent directories of "
            java.lang.String r10 = defpackage.m20.d1(r10, r0)
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv2.j(java.lang.Object, c90):java.lang.Object");
    }
}
