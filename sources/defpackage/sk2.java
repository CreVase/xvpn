package defpackage;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class sk2 extends BufferedOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4359a;

    public sk2(mh mhVar) {
        super(mhVar);
    }

    public final void a(OutputStream outputStream) {
        cp3.m(this.f4359a);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f4359a = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f4359a = true;
        try {
            flush();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th == null) {
            return;
        }
        int i = wi3.f5017a;
        throw th;
    }

    public sk2(FileOutputStream fileOutputStream, int i) {
        super(fileOutputStream, i);
    }
}
