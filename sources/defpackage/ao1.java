package defpackage;

import java.io.Writer;

/* loaded from: classes.dex */
public final class ao1 extends Writer {

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f304a = new StringBuilder(128);

    public final void a() {
        StringBuilder sb = this.f304a;
        if (sb.length() > 0) {
            sb.toString();
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                a();
            } else {
                this.f304a.append(c);
            }
        }
    }
}
