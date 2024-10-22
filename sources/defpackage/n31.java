package defpackage;

import android.database.sqlite.SQLiteProgram;
import java.io.Closeable;

/* loaded from: classes.dex */
public class n31 implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteProgram f3392a;

    public n31(SQLiteProgram sQLiteProgram) {
        this.f3392a = sQLiteProgram;
    }

    public final void a(int i, byte[] bArr) {
        this.f3392a.bindBlob(i, bArr);
    }

    public final void c(int i, double d) {
        this.f3392a.bindDouble(i, d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3392a.close();
    }

    public final void d(int i, long j) {
        this.f3392a.bindLong(i, j);
    }

    public final void w(int i) {
        this.f3392a.bindNull(i);
    }

    public final void x(int i, String str) {
        this.f3392a.bindString(i, str);
    }
}
