package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public final /* synthetic */ class ei3 implements i43, yl2, rl1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f1939a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1940b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ei3(Object obj, long j, Object obj2) {
        this.f1940b = obj;
        this.c = obj2;
        this.f1939a = j;
    }

    @Override // defpackage.yl2
    public final Object apply(Object obj) {
        String str = (String) this.f1940b;
        vn1 vn1Var = (vn1) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        lr0 lr0Var = am2.f;
        boolean booleanValue = ((Boolean) am2.L(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(vn1Var.f4865a)}), new qy2(8))).booleanValue();
        long j = this.f1939a;
        int i = vn1Var.f4865a;
        if (!booleanValue) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
        }
        return null;
    }

    @Override // defpackage.i43
    public final Object execute() {
        fi3 fi3Var = (fi3) this.f1940b;
        lm lmVar = (lm) this.c;
        long a2 = ((gi3) fi3Var.g).a() + this.f1939a;
        am2 am2Var = (am2) fi3Var.c;
        am2Var.getClass();
        am2Var.d(new ul2(a2, lmVar));
        return null;
    }

    @Override // defpackage.rl1
    public final void invoke(Object obj) {
        ((xa) obj).getClass();
    }
}
