package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class rt {
    public static final String[] c = {AppMeasurementSdk.ConditionalUserProperty.NAME, "length", "last_touch_timestamp"};

    /* renamed from: a, reason: collision with root package name */
    public final he0 f4208a;

    /* renamed from: b, reason: collision with root package name */
    public String f4209b;

    public rt(he0 he0Var) {
        this.f4208a = he0Var;
    }

    public final HashMap a() {
        try {
            this.f4209b.getClass();
            Cursor query = ((rg0) this.f4208a).a().query(this.f4209b, c, null, null, null, null, null);
            try {
                HashMap hashMap = new HashMap(query.getCount());
                while (query.moveToNext()) {
                    String string = query.getString(0);
                    string.getClass();
                    hashMap.put(string, new qt(query.getLong(1), query.getLong(2)));
                }
                query.close();
                return hashMap;
            } finally {
            }
        } catch (SQLException e) {
            throw new ge0(e);
        }
    }

    public final void b(long j) {
        he0 he0Var = this.f4208a;
        try {
            String hexString = Long.toHexString(j);
            this.f4209b = "ExoPlayerCacheFileMetadata" + hexString;
            if (vj3.a(((rg0) he0Var).a(), hexString, 2) != 1) {
                SQLiteDatabase b2 = ((rg0) he0Var).b();
                b2.beginTransactionNonExclusive();
                try {
                    vj3.b(b2, 2, hexString, 1);
                    b2.execSQL("DROP TABLE IF EXISTS " + this.f4209b);
                    b2.execSQL("CREATE TABLE " + this.f4209b + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    b2.setTransactionSuccessful();
                    b2.endTransaction();
                } catch (Throwable th) {
                    b2.endTransaction();
                    throw th;
                }
            }
        } catch (SQLException e) {
            throw new ge0(e);
        }
    }

    public final void c(Set set) {
        this.f4209b.getClass();
        try {
            SQLiteDatabase b2 = ((rg0) this.f4208a).b();
            b2.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    b2.delete(this.f4209b, "name = ?", new String[]{(String) it.next()});
                }
                b2.setTransactionSuccessful();
            } finally {
                b2.endTransaction();
            }
        } catch (SQLException e) {
            throw new ge0(e);
        }
    }

    public final void d(long j, String str, long j2) {
        this.f4209b.getClass();
        try {
            SQLiteDatabase b2 = ((rg0) this.f4208a).b();
            ContentValues contentValues = new ContentValues();
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            b2.replaceOrThrow(this.f4209b, null, contentValues);
        } catch (SQLException e) {
            throw new ge0(e);
        }
    }
}
