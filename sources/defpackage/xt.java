package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class xt implements zt {
    public static final String[] e = {FacebookMediationAdapter.KEY_ID, "key", "metadata"};

    /* renamed from: a, reason: collision with root package name */
    public final he0 f5216a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f5217b = new SparseArray();
    public String c;
    public String d;

    public xt(he0 he0Var) {
        this.f5216a = he0Var;
    }

    @Override // defpackage.zt
    public final void a(HashMap hashMap) {
        try {
            SQLiteDatabase b2 = ((rg0) this.f5216a).b();
            b2.beginTransactionNonExclusive();
            try {
                j(b2);
                Iterator it = hashMap.values().iterator();
                while (it.hasNext()) {
                    i(b2, (wt) it.next());
                }
                b2.setTransactionSuccessful();
                this.f5217b.clear();
            } finally {
                b2.endTransaction();
            }
        } catch (SQLException e2) {
            throw new ge0(e2);
        }
    }

    @Override // defpackage.zt
    public final void b(wt wtVar, boolean z) {
        SparseArray sparseArray = this.f5217b;
        int i = wtVar.f5067a;
        if (z) {
            sparseArray.delete(i);
        } else {
            sparseArray.put(i, null);
        }
    }

    @Override // defpackage.zt
    public final void c(wt wtVar) {
        this.f5217b.put(wtVar.f5067a, wtVar);
    }

    @Override // defpackage.zt
    public final boolean d() {
        try {
            SQLiteDatabase a2 = ((rg0) this.f5216a).a();
            String str = this.c;
            str.getClass();
            if (vj3.a(a2, str, 1) != -1) {
                return true;
            }
            return false;
        } catch (SQLException e2) {
            throw new ge0(e2);
        }
    }

    @Override // defpackage.zt
    public final void e(HashMap hashMap) {
        SparseArray sparseArray = this.f5217b;
        if (sparseArray.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase b2 = ((rg0) this.f5216a).b();
            b2.beginTransactionNonExclusive();
            for (int i = 0; i < sparseArray.size(); i++) {
                try {
                    wt wtVar = (wt) sparseArray.valueAt(i);
                    if (wtVar == null) {
                        int keyAt = sparseArray.keyAt(i);
                        String str = this.d;
                        str.getClass();
                        b2.delete(str, "id = ?", new String[]{Integer.toString(keyAt)});
                    } else {
                        i(b2, wtVar);
                    }
                } finally {
                    b2.endTransaction();
                }
            }
            b2.setTransactionSuccessful();
            sparseArray.clear();
        } catch (SQLException e2) {
            throw new ge0(e2);
        }
    }

    @Override // defpackage.zt
    public final void f(long j) {
        String hexString = Long.toHexString(j);
        this.c = hexString;
        this.d = hx2.p("ExoPlayerCacheIndex", hexString);
    }

    @Override // defpackage.zt
    public final void g(HashMap hashMap, SparseArray sparseArray) {
        boolean z;
        he0 he0Var = this.f5216a;
        if (this.f5217b.size() == 0) {
            z = true;
        } else {
            z = false;
        }
        cp3.m(z);
        try {
            SQLiteDatabase a2 = ((rg0) he0Var).a();
            String str = this.c;
            str.getClass();
            if (vj3.a(a2, str, 1) != 1) {
                SQLiteDatabase b2 = ((rg0) he0Var).b();
                b2.beginTransactionNonExclusive();
                try {
                    j(b2);
                    b2.setTransactionSuccessful();
                    b2.endTransaction();
                } catch (Throwable th) {
                    b2.endTransaction();
                    throw th;
                }
            }
            SQLiteDatabase a3 = ((rg0) he0Var).a();
            String str2 = this.d;
            str2.getClass();
            Cursor query = a3.query(str2, e, null, null, null, null, null);
            while (query.moveToNext()) {
                try {
                    int i = query.getInt(0);
                    String string = query.getString(1);
                    string.getClass();
                    hashMap.put(string, new wt(i, string, jx0.a(new DataInputStream(new ByteArrayInputStream(query.getBlob(2))))));
                    sparseArray.put(i, string);
                } finally {
                }
            }
            query.close();
        } catch (SQLiteException e2) {
            hashMap.clear();
            sparseArray.clear();
            throw new ge0(e2);
        }
    }

    @Override // defpackage.zt
    public final void h() {
        he0 he0Var = this.f5216a;
        String str = this.c;
        str.getClass();
        try {
            String concat = "ExoPlayerCacheIndex".concat(str);
            SQLiteDatabase b2 = ((rg0) he0Var).b();
            b2.beginTransactionNonExclusive();
            try {
                int i = vj3.f4846a;
                try {
                    if (wi3.J(b2, "ExoPlayerVersions")) {
                        b2.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
                    }
                    b2.execSQL("DROP TABLE IF EXISTS " + concat);
                    b2.setTransactionSuccessful();
                } catch (SQLException e2) {
                    throw new ge0(e2);
                }
            } finally {
                b2.endTransaction();
            }
        } catch (SQLException e3) {
            throw new ge0(e3);
        }
    }

    public final void i(SQLiteDatabase sQLiteDatabase, wt wtVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        jx0.b(wtVar.e, new DataOutputStream(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put(FacebookMediationAdapter.KEY_ID, Integer.valueOf(wtVar.f5067a));
        contentValues.put("key", wtVar.f5068b);
        contentValues.put("metadata", byteArray);
        String str = this.d;
        str.getClass();
        sQLiteDatabase.replaceOrThrow(str, null, contentValues);
    }

    public final void j(SQLiteDatabase sQLiteDatabase) {
        String str = this.c;
        str.getClass();
        vj3.b(sQLiteDatabase, 1, str, 1);
        String str2 = this.d;
        str2.getClass();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
        sQLiteDatabase.execSQL("CREATE TABLE " + this.d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
    }
}
