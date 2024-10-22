package defpackage;

import android.database.DatabaseErrorHandler;

/* loaded from: classes.dex */
public final class k31 implements DatabaseErrorHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rd f2878a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j31[] f2879b;

    public k31(rd rdVar, j31[] j31VarArr) {
        this.f2878a = rdVar;
        this.f2879b = j31VarArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:            if (r2 == false) goto L9;     */
    @Override // android.database.DatabaseErrorHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCorruption(android.database.sqlite.SQLiteDatabase r4) {
        /*
            r3 = this;
            j31[] r0 = r3.f2879b
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
            rd r0 = r3.f2878a
            r0.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Corruption reported by sqlite on database: "
            r0.<init>(r1)
            android.database.sqlite.SQLiteDatabase r1 = r4.f2698a
            java.lang.String r1 = r1.getPath()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "SupportSQLite"
            android.util.Log.e(r1, r0)
            android.database.sqlite.SQLiteDatabase r0 = r4.f2698a
            boolean r1 = r0.isOpen()
            if (r1 != 0) goto L47
            java.lang.String r4 = r0.getPath()
            defpackage.rd.b(r4)
            goto L97
        L47:
            r1 = 0
            java.util.List r1 = r0.getAttachedDbs()     // Catch: java.lang.Throwable -> L4d android.database.sqlite.SQLiteException -> L4f
            goto L4f
        L4d:
            r4 = move-exception
            goto L53
        L4f:
            r4.close()     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L75
            goto L76
        L53:
            if (r1 == 0) goto L6d
            java.util.Iterator r0 = r1.iterator()
        L59:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L74
            java.lang.Object r1 = r0.next()
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r1 = r1.second
            java.lang.String r1 = (java.lang.String) r1
            defpackage.rd.b(r1)
            goto L59
        L6d:
            java.lang.String r0 = r0.getPath()
            defpackage.rd.b(r0)
        L74:
            throw r4
        L75:
        L76:
            if (r1 == 0) goto L90
            java.util.Iterator r4 = r1.iterator()
        L7c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L97
            java.lang.Object r0 = r4.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            defpackage.rd.b(r0)
            goto L7c
        L90:
            java.lang.String r4 = r0.getPath()
            defpackage.rd.b(r4)
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k31.onCorruption(android.database.sqlite.SQLiteDatabase):void");
    }
}
