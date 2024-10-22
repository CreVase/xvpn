package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* loaded from: classes.dex */
public final class i31 implements SQLiteDatabase.CursorFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2528a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v33 f2529b;

    public /* synthetic */ i31(v33 v33Var, int i) {
        this.f2528a = i;
        this.f2529b = v33Var;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        int i = this.f2528a;
        v33 v33Var = this.f2529b;
        switch (i) {
            case 0:
                v33Var.w(new n31(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            default:
                v33Var.w(new n31(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }
}
