package defpackage;

/* loaded from: classes2.dex */
public abstract class x41 extends du implements w41, ph1 {
    private final int arity;
    private final int flags;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public x41(int r9, java.lang.Object r10, java.lang.Class r11, java.lang.String r12, java.lang.String r13, int r14) {
        /*
            r8 = this;
            r0 = r14 & 1
            r1 = 1
            if (r0 != r1) goto L7
            r7 = 1
            goto L9
        L7:
            r0 = 0
            r7 = 0
        L9:
            r2 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            r8.arity = r9
            int r9 = r14 >> 1
            r8.flags = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x41.<init>(int, java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int):void");
    }

    @Override // defpackage.du
    public lh1 computeReflected() {
        gi2.f2259a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x41) {
            x41 x41Var = (x41) obj;
            if (getName().equals(x41Var.getName()) && getSignature().equals(x41Var.getSignature()) && this.flags == x41Var.flags && this.arity == x41Var.arity && m20.L(getBoundReceiver(), x41Var.getBoundReceiver()) && m20.L(getOwner(), x41Var.getOwner())) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof ph1)) {
            return false;
        }
        return obj.equals(compute());
    }

    @Override // defpackage.w41
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        int hashCode;
        if (getOwner() == null) {
            hashCode = 0;
        } else {
            hashCode = getOwner().hashCode() * 31;
        }
        return getSignature().hashCode() + ((getName().hashCode() + hashCode) * 31);
    }

    @Override // defpackage.ph1
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // defpackage.ph1
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // defpackage.ph1
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // defpackage.ph1
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // defpackage.ph1
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        lh1 compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // defpackage.du
    public ph1 getReflected() {
        lh1 compute = compute();
        if (compute != this) {
            return (ph1) compute;
        }
        throw new ko3();
    }
}
