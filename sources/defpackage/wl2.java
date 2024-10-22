package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public final /* synthetic */ class wl2 implements yl2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5033a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ am2 f5034b;

    public /* synthetic */ wl2(am2 am2Var, int i) {
        this.f5033a = i;
        this.f5034b = am2Var;
    }

    @Override // defpackage.yl2
    public final Object apply(Object obj) {
        int i = this.f5033a;
        am2 am2Var = this.f5034b;
        switch (i) {
            case 0:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                am2Var.getClass();
                sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
                sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + ((gi3) am2Var.f111b).a()).execute();
                return null;
            case 1:
                Cursor cursor = (Cursor) obj;
                am2Var.getClass();
                while (cursor.moveToNext()) {
                    am2Var.d(new ei3(cursor.getString(1), cursor.getInt(0), vn1.MESSAGE_TOO_OLD));
                }
                return null;
            default:
                Cursor cursor2 = (Cursor) obj;
                am2Var.getClass();
                while (cursor2.moveToNext()) {
                    am2Var.d(new ei3(cursor2.getString(1), cursor2.getInt(0), vn1.MAX_RETRIES_REACHED));
                }
                return null;
        }
    }
}
