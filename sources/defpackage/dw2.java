package defpackage;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes2.dex */
public interface dw2 extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    d93 timeout();

    void write(lr lrVar, long j);
}
