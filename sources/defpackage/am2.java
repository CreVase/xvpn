package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class am2 implements os0, j43, w00 {
    public static final lr0 f = new lr0("proto");

    /* renamed from: a, reason: collision with root package name */
    public final qn2 f110a;

    /* renamed from: b, reason: collision with root package name */
    public final g10 f111b;
    public final g10 c;
    public final ql d;
    public final Provider e;

    public am2(g10 g10Var, g10 g10Var2, ql qlVar, qn2 qn2Var, Provider provider) {
        this.f110a = qn2Var;
        this.f111b = g10Var;
        this.c = g10Var2;
        this.d = qlVar;
        this.e = provider;
    }

    public static String K(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((am) it.next()).f108a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object L(Cursor cursor, yl2 yl2Var) {
        try {
            return yl2Var.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long c(SQLiteDatabase sQLiteDatabase, lm lmVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(lmVar.f3153a, String.valueOf(b82.a(lmVar.c))));
        byte[] bArr = lmVar.f3154b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) L(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new qy2(10));
    }

    public final SQLiteDatabase a() {
        Object apply;
        qn2 qn2Var = this.f110a;
        Objects.requireNonNull(qn2Var);
        qy2 qy2Var = new qy2(4);
        gi3 gi3Var = (gi3) this.c;
        long a2 = gi3Var.a();
        while (true) {
            try {
                apply = qn2Var.getWritableDatabase();
                break;
            } catch (SQLiteDatabaseLockedException e) {
                if (gi3Var.a() >= this.d.c + a2) {
                    apply = qy2Var.apply(e);
                    break;
                }
                SystemClock.sleep(50L);
            }
        }
        return (SQLiteDatabase) apply;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f110a.close();
    }

    public final Object d(yl2 yl2Var) {
        SQLiteDatabase a2 = a();
        a2.beginTransaction();
        try {
            Object apply = yl2Var.apply(a2);
            a2.setTransactionSuccessful();
            return apply;
        } finally {
            a2.endTransaction();
        }
    }

    public final ArrayList w(SQLiteDatabase sQLiteDatabase, lm lmVar, int i) {
        ArrayList arrayList = new ArrayList();
        Long c = c(sQLiteDatabase, lmVar);
        if (c == null) {
            return arrayList;
        }
        L(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{c.toString()}, null, null, null, String.valueOf(i)), new pi0(this, arrayList, lmVar, 3));
        return arrayList;
    }

    public final Object x(i43 i43Var) {
        SQLiteDatabase a2 = a();
        qy2 qy2Var = new qy2(6);
        gi3 gi3Var = (gi3) this.c;
        long a3 = gi3Var.a();
        while (true) {
            try {
                a2.beginTransaction();
            } catch (SQLiteDatabaseLockedException e) {
                if (gi3Var.a() >= this.d.c + a3) {
                    qy2Var.apply(e);
                    break;
                }
                SystemClock.sleep(50L);
            }
        }
        try {
            Object execute = i43Var.execute();
            a2.setTransactionSuccessful();
            return execute;
        } finally {
            a2.endTransaction();
        }
    }
}
