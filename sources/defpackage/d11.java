package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class d11 implements mx2 {
    private final mx2 delegate;

    public d11(mx2 mx2Var) {
        this.delegate = mx2Var;
    }

    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final mx2 m97deprecated_delegate() {
        return this.delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final mx2 delegate() {
        return this.delegate;
    }

    @Override // defpackage.mx2
    public long read(lr lrVar, long j) throws IOException {
        return this.delegate.read(lrVar, j);
    }

    @Override // defpackage.mx2
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
}
