package defpackage;

/* loaded from: classes2.dex */
public final class eh implements ia2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f1932a;

    /* renamed from: b, reason: collision with root package name */
    public final ha2 f1933b;

    public eh(int i, ha2 ha2Var) {
        this.f1932a = i;
        this.f1933b = ha2Var;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return ia2.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia2)) {
            return false;
        }
        ia2 ia2Var = (ia2) obj;
        if (this.f1932a == ((eh) ia2Var).f1932a && this.f1933b.equals(((eh) ia2Var).f1933b)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.f1932a) + (this.f1933b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f1932a + "intEncoding=" + this.f1933b + ')';
    }
}
