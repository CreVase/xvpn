package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* loaded from: classes.dex */
public final class l31 extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    public final j31[] f3058a;

    /* renamed from: b, reason: collision with root package name */
    public final rd f3059b;
    public boolean c;

    public l31(Context context, String str, j31[] j31VarArr, rd rdVar) {
        super(context, str, null, rdVar.f4132a, new k31(rdVar, j31VarArr));
        this.f3059b = rdVar;
        this.f3058a = j31VarArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:            if (r2 == false) goto L9;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.j31 a(android.database.sqlite.SQLiteDatabase r4) {
        /*
            r3 = this;
            j31[] r0 = r3.f3058a
            r1 = 0
            r2 = r0[r1]
            if (r2 == 0) goto L10
            android.database.sqlite.SQLiteDatabase r2 = r2.f2698a
            if (r2 != r4) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = 0
        Le:
            if (r2 != 0) goto L17
        L10:
            j31 r2 = new j31
            r2.<init>(r4)
            r0[r1] = r2
        L17:
            r4 = r0[r1]
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l31.a(android.database.sqlite.SQLiteDatabase):j31");
    }

    public final synchronized r33 c() {
        this.c = false;
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (this.c) {
            close();
            return c();
        }
        return a(writableDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final synchronized void close() {
        super.close();
        this.f3058a[0] = null;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase);
        this.f3059b.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072 A[ORIG_RETURN, RETURN] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.database.sqlite.SQLiteDatabase r6) {
        /*
            r5 = this;
            j31 r6 = r5.a(r6)
            rd r0 = r5.f3059b
            r0.getClass()
            java.lang.String r1 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
            android.database.Cursor r1 = r6.x(r1)
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L73
            r3 = 0
            if (r2 == 0) goto L1e
            int r2 = r1.getInt(r3)     // Catch: java.lang.Throwable -> L73
            if (r2 != 0) goto L1e
            r2 = 1
            goto L1f
        L1e:
            r2 = 0
        L1f:
            r1.close()
            q9 r1 = r0.c
            r1.getClass()
            defpackage.q9.m(r6)
            if (r2 != 0) goto L4d
            u93 r2 = defpackage.q9.o(r6)
            boolean r4 = r2.f4639a
            if (r4 == 0) goto L35
            goto L4d
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Pre-packaged database has an invalid schema: "
            r0.<init>(r1)
            java.lang.Object r1 = r2.f4640b
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L4d:
            r0.h(r6)
            java.lang.Object r6 = r1.f3970b
            androidx.work.impl.WorkDatabase_Impl r6 = (androidx.work.impl.WorkDatabase_Impl) r6
            int r0 = androidx.work.impl.WorkDatabase_Impl.s
            java.util.List r6 = r6.g
            if (r6 == 0) goto L72
            int r6 = r6.size()
        L5e:
            if (r3 >= r6) goto L72
            java.lang.Object r0 = r1.f3970b
            androidx.work.impl.WorkDatabase_Impl r0 = (androidx.work.impl.WorkDatabase_Impl) r0
            java.util.List r0 = r0.g
            java.lang.Object r0 = r0.get(r3)
            yr3 r0 = (defpackage.yr3) r0
            r0.getClass()
            int r3 = r3 + 1
            goto L5e
        L72:
            return
        L73:
            r6 = move-exception
            r1.close()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l31.onCreate(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.c = true;
        this.f3059b.d(a(sQLiteDatabase), i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0066  */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onOpen(android.database.sqlite.SQLiteDatabase r11) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l31.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.c = true;
        this.f3059b.d(a(sQLiteDatabase), i, i2);
    }
}
