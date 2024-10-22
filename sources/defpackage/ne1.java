package defpackage;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class ne1 {
    public static final String[] j = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: b, reason: collision with root package name */
    public final String[] f3449b;
    public final gl2 c;
    public volatile o31 f;
    public final le1 g;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public volatile boolean e = false;
    public final jm2 h = new jm2();
    public final qw3 i = new qw3(this, 10);

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3448a = new HashMap();

    public ne1(gl2 gl2Var, HashMap hashMap, HashMap hashMap2, String... strArr) {
        this.c = gl2Var;
        this.g = new le1(strArr.length);
        Collections.newSetFromMap(new IdentityHashMap());
        int length = strArr.length;
        this.f3449b = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f3448a.put(lowerCase, Integer.valueOf(i));
            String str2 = (String) hashMap.get(strArr[i]);
            if (str2 != null) {
                this.f3449b[i] = str2.toLowerCase(locale);
            } else {
                this.f3449b[i] = lowerCase;
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = str3.toLowerCase(locale2);
            if (this.f3448a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                HashMap hashMap3 = this.f3448a;
                hashMap3.put(lowerCase3, hashMap3.get(lowerCase2));
            }
        }
    }

    public final boolean a() {
        boolean z;
        r33 r33Var = this.c.f2275a;
        if (r33Var != null && ((j31) r33Var).f2698a.isOpen()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (!this.e) {
            this.c.c.q();
        }
        if (this.e) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void b(r33 r33Var, int i) {
        j31 j31Var = (j31) r33Var;
        j31Var.d(p71.k("INSERT OR IGNORE INTO room_table_modification_log VALUES(", i, ", 0)"));
        String str = this.f3449b[i];
        StringBuilder sb = new StringBuilder();
        String[] strArr = j;
        for (int i2 = 0; i2 < 3; i2++) {
            String str2 = strArr[i2];
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb.append("`");
            sb.append("room_table_modification_trigger_");
            p71.A(sb, str, "_", str2, "`");
            p71.A(sb, " AFTER ", str2, " ON `", str);
            p71.A(sb, "` BEGIN UPDATE ", "room_table_modification_log", " SET ", "invalidated");
            p71.A(sb, " = 1", " WHERE ", "table_id", " = ");
            sb.append(i);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            j31Var.d(sb.toString());
        }
    }

    public final void c(r33 r33Var) {
        j31 j31Var = (j31) r33Var;
        if (j31Var.f2698a.inTransaction()) {
            return;
        }
        while (true) {
            try {
                ReentrantReadWriteLock.ReadLock readLock = this.c.h.readLock();
                readLock.lock();
                try {
                    int[] a2 = this.g.a();
                    if (a2 == null) {
                        return;
                    }
                    int length = a2.length;
                    j31Var.a();
                    for (int i = 0; i < length; i++) {
                        try {
                            int i2 = a2[i];
                            if (i2 != 1) {
                                if (i2 == 2) {
                                    String str = this.f3449b[i];
                                    StringBuilder sb = new StringBuilder();
                                    String[] strArr = j;
                                    for (int i3 = 0; i3 < 3; i3++) {
                                        String str2 = strArr[i3];
                                        sb.setLength(0);
                                        sb.append("DROP TRIGGER IF EXISTS ");
                                        sb.append("`");
                                        sb.append("room_table_modification_trigger_");
                                        sb.append(str);
                                        sb.append("_");
                                        sb.append(str2);
                                        sb.append("`");
                                        j31Var.d(sb.toString());
                                    }
                                }
                            } else {
                                b(j31Var, i);
                            }
                        } catch (Throwable th) {
                            j31Var.c();
                            throw th;
                        }
                    }
                    j31Var.K();
                    j31Var.c();
                    le1 le1Var = this.g;
                    synchronized (le1Var) {
                        le1Var.c = false;
                    }
                } finally {
                    readLock.unlock();
                }
            } catch (SQLiteException | IllegalStateException e) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                return;
            }
        }
    }
}
