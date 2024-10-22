package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class yi2 implements cs2 {

    /* renamed from: a, reason: collision with root package name */
    public final xx0 f5341a;

    /* renamed from: b, reason: collision with root package name */
    public final vf f5342b;
    public final ub0 c;
    public final zr2 d;
    public final ky1 e = new ky1(false);

    public yi2(xx0 xx0Var, vf vfVar, aj2 aj2Var, x62 x62Var) {
        this.f5341a = xx0Var;
        this.f5342b = vfVar;
        this.c = aj2Var;
        this.d = new zr2(x62Var);
    }

    public static String e(String str) {
        return Pattern.compile("/").matcher(str).replaceAll("");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0083 A[Catch: all -> 0x0153, TryCatch #0 {all -> 0x0153, blocks: (B:25:0x004a, B:26:0x0098, B:31:0x00a3, B:33:0x010d, B:35:0x0119, B:43:0x007a, B:46:0x0083), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [hy1] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // defpackage.cs2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.c90 r21) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yi2.a(c90):java.lang.Object");
    }

    @Override // defpackage.cs2
    public final Boolean b() {
        xq2 xq2Var = this.d.f5538b;
        if (xq2Var == null) {
            xq2Var = null;
        }
        return xq2Var.f5205a;
    }

    @Override // defpackage.cs2
    public final po0 c() {
        xq2 xq2Var = this.d.f5538b;
        if (xq2Var == null) {
            xq2Var = null;
        }
        Integer num = xq2Var.c;
        if (num == null) {
            return null;
        }
        int i = po0.d;
        return new po0(fl.c0(num.intValue(), to0.d));
    }

    @Override // defpackage.cs2
    public final Double d() {
        xq2 xq2Var = this.d.f5538b;
        if (xq2Var == null) {
            xq2Var = null;
        }
        return xq2Var.f5206b;
    }
}
