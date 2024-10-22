package defpackage;

/* loaded from: classes2.dex */
public abstract class ca2 extends du implements th1 {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f604b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ca2(java.lang.Object r10, java.lang.Class r11, java.lang.String r12, java.lang.String r13, int r14) {
        /*
            r9 = this;
            r0 = r14 & 1
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L8
            r8 = 1
            goto L9
        L8:
            r8 = 0
        L9:
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            r10 = 2
            r11 = r14 & 2
            if (r11 != r10) goto L17
            goto L18
        L17:
            r1 = 0
        L18:
            r9.f604b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ca2.<init>(java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int):void");
    }

    @Override // defpackage.du
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final th1 getReflected() {
        if (!this.f604b) {
            lh1 compute = compute();
            if (compute != this) {
                return (th1) compute;
            }
            throw new ko3();
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
    }

    @Override // defpackage.du
    public final lh1 compute() {
        if (this.f604b) {
            return this;
        }
        return super.compute();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ca2) {
            ca2 ca2Var = (ca2) obj;
            if (getOwner().equals(ca2Var.getOwner()) && getName().equals(ca2Var.getName()) && getSignature().equals(ca2Var.getSignature()) && m20.L(getBoundReceiver(), ca2Var.getBoundReceiver())) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof th1)) {
            return false;
        }
        return obj.equals(compute());
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    public final String toString() {
        lh1 compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
