package defpackage;

import android.database.Cursor;

/* loaded from: classes.dex */
public final class sg0 implements km0 {

    /* renamed from: a, reason: collision with root package name */
    public final Cursor f4336a;

    public sg0(Cursor cursor) {
        this.f4336a = cursor;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f4336a.close();
    }
}
