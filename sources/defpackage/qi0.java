package defpackage;

/* loaded from: classes2.dex */
public final class qi0 extends jn2 {
    public static final qi0 c = new qi0();

    public qi0() {
        super(m63.c, m63.d, m63.f3246a, m63.e);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.v90
    public final String toString() {
        return "Dispatchers.Default";
    }
}
