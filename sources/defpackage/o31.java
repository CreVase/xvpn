package defpackage;

import android.database.sqlite.SQLiteStatement;

/* loaded from: classes.dex */
public final class o31 extends n31 {

    /* renamed from: b, reason: collision with root package name */
    public final SQLiteStatement f3591b;

    public o31(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f3591b = sQLiteStatement;
    }

    public final int K() {
        return this.f3591b.executeUpdateDelete();
    }
}
