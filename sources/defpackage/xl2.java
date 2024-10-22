package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public final /* synthetic */ class xl2 implements yl2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5179a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f5180b;

    public /* synthetic */ xl2(long j, int i) {
        this.f5179a = i;
        this.f5180b = j;
    }

    @Override // defpackage.yl2
    public final Object apply(Object obj) {
        int i = this.f5179a;
        long j = this.f5180b;
        switch (i) {
            case 0:
                return (w83) am2.L(((SQLiteDatabase) obj).rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new xl2(j, 1));
            default:
                Cursor cursor = (Cursor) obj;
                cursor.moveToNext();
                return new w83(cursor.getLong(0), j);
        }
    }
}
