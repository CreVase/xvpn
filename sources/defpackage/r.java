package defpackage;

/* loaded from: classes2.dex */
public final class r extends p32 {

    /* renamed from: a, reason: collision with root package name */
    public static final r f4081a = new r();

    @Override // defpackage.p32
    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // defpackage.p32
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
