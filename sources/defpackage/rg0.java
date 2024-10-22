package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.chartboost.sdk.impl.l4;

/* loaded from: classes.dex */
public final class rg0 implements he0 {

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteOpenHelper f4150a;

    public rg0(l4 l4Var) {
        this.f4150a = l4Var;
    }

    public final SQLiteDatabase a() {
        return this.f4150a.getReadableDatabase();
    }

    public final SQLiteDatabase b() {
        return this.f4150a.getWritableDatabase();
    }
}
