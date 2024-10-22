package defpackage;

import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class o9 {

    /* renamed from: a, reason: collision with root package name */
    public final int f3619a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3620b;
    public final int c;
    public final v31 d;

    public o9(int i, String str, int i2, v31 v31Var) {
        this.f3619a = i;
        this.f3620b = str;
        this.c = i2;
        this.d = v31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9)) {
            return false;
        }
        o9 o9Var = (o9) obj;
        return this.f3619a == o9Var.f3619a && m20.L(this.f3620b, o9Var.f3620b) && this.c == o9Var.c && m20.L(this.d, o9Var.d);
    }

    public final int hashCode() {
        int hashCode;
        int h = (p71.h(this.f3620b, this.f3619a * 31, 31) + this.c) * 31;
        v31 v31Var = this.d;
        if (v31Var == null) {
            hashCode = 0;
        } else {
            hashCode = v31Var.hashCode();
        }
        return h + hashCode;
    }

    public final String toString() {
        return "MoreButton(viewId=" + this.f3619a + ", text=" + this.f3620b + ", textColorId=" + this.c + ", onClick=" + this.d + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o9(java.lang.String r3, int r4, defpackage.v31 r5, int r6) {
        /*
            r2 = this;
            r0 = r6 & 1
            if (r0 == 0) goto Lb
            java.util.WeakHashMap r0 = defpackage.ll3.f3151a
            int r0 = defpackage.vk3.a()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            r1 = r6 & 4
            if (r1 == 0) goto L13
            r4 = 1000021(0xf4255, float:1.401328E-39)
        L13:
            r6 = r6 & 8
            if (r6 == 0) goto L18
            r5 = 0
        L18:
            r2.<init>(r0, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o9.<init>(java.lang.String, int, v31, int):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o9(String str) {
        this(vk3.a(), str, 1000021, (v31) null);
        WeakHashMap weakHashMap = ll3.f3151a;
    }
}
