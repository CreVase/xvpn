package defpackage;

/* loaded from: classes2.dex */
public final class u9 extends ji1 implements x31 {
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9(String str, boolean z, boolean z2) {
        super(1);
        this.f = z;
        this.g = z2;
        this.h = str;
    }

    @Override // defpackage.x31
    public final Object invoke(Object obj) {
        boolean z;
        ef efVar = (ef) obj;
        boolean z2 = false;
        if (this.f && (efVar.e & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return Boolean.FALSE;
        }
        if (!this.g || i23.R0(efVar.f1926a, this.h, true)) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }
}
