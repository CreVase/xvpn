package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public final /* synthetic */ class ul2 implements yl2, rl1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4692a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f4693b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ul2(long j, lm lmVar) {
        this.f4692a = 1;
        this.f4693b = j;
        this.c = lmVar;
    }

    @Override // defpackage.yl2
    public final Object apply(Object obj) {
        int i = this.f4692a;
        long j = this.f4693b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                am2 am2Var = (am2) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                am2Var.getClass();
                String[] strArr = {String.valueOf(j)};
                am2.L(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new wl2(am2Var, 1));
                return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
            default:
                lm lmVar = (lm) obj2;
                SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j));
                String str = lmVar.f3153a;
                y72 y72Var = lmVar.c;
                if (sQLiteDatabase2.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(b82.a(y72Var))}) < 1) {
                    contentValues.put("backend_name", lmVar.f3153a);
                    contentValues.put("priority", Integer.valueOf(b82.a(y72Var)));
                    sQLiteDatabase2.insert("transport_contexts", null, contentValues);
                }
                return null;
        }
    }

    @Override // defpackage.rl1
    public final void invoke(Object obj) {
        ((xa) obj).getClass();
    }

    public /* synthetic */ ul2(Object obj, long j, int i) {
        this.f4692a = i;
        this.c = obj;
        this.f4693b = j;
    }
}
