package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class c11 implements dw2 {
    private final dw2 delegate;

    public c11(dw2 dw2Var) {
        this.delegate = dw2Var;
    }

    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final dw2 m4deprecated_delegate() {
        return this.delegate;
    }

    @Override // defpackage.dw2, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    public final dw2 delegate() {
        return this.delegate;
    }

    @Override // defpackage.dw2, java.io.Flushable
    public void flush() throws IOException {
        this.delegate.flush();
    }

    @Override // defpackage.dw2
    public d93 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) getClass().getSimpleName());
        sb.append('(');
        sb.append(this.delegate);
        sb.append(')');
        return sb.toString();
    }

    @Override // defpackage.dw2
    public void write(lr lrVar, long j) throws IOException {
        this.delegate.write(lrVar, j);
    }
}
