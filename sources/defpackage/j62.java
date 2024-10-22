package defpackage;

/* loaded from: classes2.dex */
public final class j62 extends o1 {

    /* renamed from: a, reason: collision with root package name */
    public final mh1 f2709a;

    /* renamed from: b, reason: collision with root package name */
    public final ui1 f2710b = m20.D0(kj1.f2954b, new yy2(this, 24));

    public j62(j00 j00Var) {
        this.f2709a = j00Var;
    }

    @Override // defpackage.sk0
    public final mp2 getDescriptor() {
        return (mp2) this.f2710b.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.f2709a + ')';
    }
}
