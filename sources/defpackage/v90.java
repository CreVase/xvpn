package defpackage;

/* loaded from: classes2.dex */
public abstract class v90 extends w implements e90 {

    /* renamed from: a, reason: collision with root package name */
    public static final u90 f4798a = new u90(0);

    public v90() {
        super(d5.f1730b);
    }

    public abstract void K(t90 t90Var, Runnable runnable);

    public boolean L() {
        return !(this instanceof yg3);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    @Override // defpackage.w, defpackage.t90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.r90 get(defpackage.s90 r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof defpackage.x
            if (r0 == 0) goto L26
            x r3 = (defpackage.x) r3
            s90 r0 = r2.getKey()
            if (r0 == r3) goto L13
            s90 r1 = r3.f5095b
            if (r1 != r0) goto L11
            goto L16
        L11:
            r0 = 0
            goto L17
        L13:
            r3.getClass()
        L16:
            r0 = 1
        L17:
            if (r0 == 0) goto L2c
            x31 r3 = r3.f5094a
            java.lang.Object r3 = r3.invoke(r2)
            r90 r3 = (defpackage.r90) r3
            boolean r0 = r3 instanceof defpackage.r90
            if (r0 == 0) goto L2c
            goto L2d
        L26:
            d5 r0 = defpackage.d5.f1730b
            if (r0 != r3) goto L2c
            r3 = r2
            goto L2d
        L2c:
            r3 = 0
        L2d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v90.get(s90):r90");
    }

    @Override // defpackage.w, defpackage.t90
    public final t90 minusKey(s90 s90Var) {
        boolean z;
        boolean z2 = s90Var instanceof x;
        zq0 zq0Var = zq0.f5530a;
        if (z2) {
            x xVar = (x) s90Var;
            s90 key = getKey();
            if (key != xVar) {
                if (xVar.f5095b != key) {
                    z = false;
                    if (z && ((r90) xVar.f5094a.invoke(this)) != null) {
                        return zq0Var;
                    }
                }
            } else {
                xVar.getClass();
            }
            z = true;
            if (z) {
                return zq0Var;
            }
        } else if (d5.f1730b == s90Var) {
            return zq0Var;
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + pe0.u(this);
    }
}
