package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class as0 implements uh1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f326a;

    /* renamed from: b, reason: collision with root package name */
    public final ui1 f327b;
    public final Object c;
    public final cr0 d;

    public as0() {
        ch3 ch3Var = ch3.f636a;
        this.f326a = 1;
        this.c = ch3Var;
        this.d = cr0.f1659a;
        this.f327b = m20.D0(kj1.f2954b, new a72(13, "kotlin.Unit", this));
    }

    @Override // defpackage.sk0
    public final Object deserialize(qe0 qe0Var) {
        boolean z;
        int i = this.f326a;
        Object obj = this.c;
        switch (i) {
            case 0:
                int w = qe0Var.w(getDescriptor());
                if (w >= 0 && w < ((Enum[]) obj).length) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return ((Enum[]) obj)[w];
                }
                throw new wp2(w + " is not among valid " + getDescriptor().a() + " enum values, values size is " + ((Enum[]) obj).length);
            default:
                mp2 descriptor = getDescriptor();
                f40 c = qe0Var.c(descriptor);
                int j = c.j(getDescriptor());
                if (j == -1) {
                    c.a(descriptor);
                    return obj;
                }
                throw new wp2(hx2.m("Unexpected index ", j));
        }
    }

    @Override // defpackage.sk0
    public final mp2 getDescriptor() {
        ui1 ui1Var = this.f327b;
        switch (this.f326a) {
            case 0:
                return (mp2) ui1Var.getValue();
            default:
                return (mp2) ui1Var.getValue();
        }
    }

    @Override // defpackage.uh1
    public final void serialize(ir0 ir0Var, Object obj) {
        switch (this.f326a) {
            case 0:
                Enum r5 = (Enum) obj;
                Enum[] enumArr = (Enum[]) this.c;
                int l1 = og.l1(enumArr, r5);
                if (l1 != -1) {
                    ir0Var.v(getDescriptor(), l1);
                    return;
                }
                throw new wp2(r5 + " is not a valid enum " + getDescriptor().a() + ", must be one of " + Arrays.toString(enumArr));
            default:
                ir0Var.c(getDescriptor()).a(getDescriptor());
                return;
        }
    }

    public final String toString() {
        switch (this.f326a) {
            case 0:
                return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().a() + '>';
            default:
                return super.toString();
        }
    }

    public as0(String str, Enum[] enumArr) {
        this.f326a = 0;
        this.c = enumArr;
        this.f327b = new k43(new a72(12, this, str));
    }
}
