package defpackage;

/* loaded from: classes2.dex */
public final class fe3 extends he3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f2085a;

    public fe3(String str) {
        this.f2085a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fe3) && m20.L(this.f2085a, ((fe3) obj).f2085a);
    }

    public final int hashCode() {
        return this.f2085a.hashCode();
    }

    public final String toString() {
        return hx2.s(new StringBuilder("ProtocolChange(bannerId="), this.f2085a, ")");
    }
}
