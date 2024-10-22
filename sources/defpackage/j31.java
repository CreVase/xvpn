package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public final class j31 implements r33 {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f2697b = new String[0];

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f2698a;

    public j31(SQLiteDatabase sQLiteDatabase) {
        this.f2698a = sQLiteDatabase;
    }

    public final void K() {
        this.f2698a.setTransactionSuccessful();
    }

    public final void a() {
        this.f2698a.beginTransaction();
    }

    public final void c() {
        this.f2698a.endTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2698a.close();
    }

    public final void d(String str) {
        this.f2698a.execSQL(str);
    }

    public final Cursor w(v33 v33Var) {
        return this.f2698a.rawQueryWithFactory(new i31(v33Var, 0), v33Var.c(), f2697b, null);
    }

    public final Cursor x(String str) {
        return w(new x50(str));
    }
}
