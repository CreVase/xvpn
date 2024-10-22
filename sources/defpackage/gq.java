package defpackage;

/* loaded from: classes2.dex */
public final class gq implements dw2 {
    @Override // defpackage.dw2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.dw2, java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.dw2
    public final d93 timeout() {
        return d93.NONE;
    }

    @Override // defpackage.dw2
    public final void write(lr lrVar, long j) {
        lrVar.skip(j);
    }
}
