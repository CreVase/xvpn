package com.google.ads.conversiontracking;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public class f {
    public static final String c = String.format(Locale.US, "CREATE TABLE IF NOT EXISTS %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, %s TEXT NOT NULL, %s TEXT, %s INTEGER, %s INTEGER, %s TEXT, %s INTEGER, %s INTEGER,%s INTEGER);", "conversiontracking", "conversion_ping_id", "string_url", "preference_key", "is_repeatable", "parameter_is_null", "preference_name", "record_time", "retry_count", "last_retry_time");

    /* renamed from: a, reason: collision with root package name */
    public final a f1389a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1390b = new Object();

    /* loaded from: classes.dex */
    public class a extends SQLiteOpenHelper {
        public a(f fVar, Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 5);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(f.c);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            StringBuilder sb = new StringBuilder(64);
            sb.append("Database updated from version ");
            sb.append(i);
            sb.append(" to version ");
            sb.append(i2);
            Log.i("GoogleConversionReporter", sb.toString());
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS conversiontracking");
            onCreate(sQLiteDatabase);
        }
    }

    public f(Context context) {
        this.f1389a = new a(this, context, "google_conversion_tracking.db");
    }

    public void a(d dVar) {
        if (dVar == null) {
            return;
        }
        synchronized (this.f1390b) {
            SQLiteDatabase a2 = a();
            if (a2 == null) {
                return;
            }
            a2.delete("conversiontracking", String.format(Locale.US, "%s = %d", "conversion_ping_id", Long.valueOf(dVar.h)), null);
        }
    }

    public void b(d dVar) {
        if (dVar == null) {
            return;
        }
        synchronized (this.f1390b) {
            SQLiteDatabase a2 = a();
            if (a2 == null) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("string_url", dVar.g);
            contentValues.put("preference_key", dVar.f);
            int i = 1;
            contentValues.put("is_repeatable", Integer.valueOf(dVar.f1384b ? 1 : 0));
            if (!dVar.f1383a) {
                i = 0;
            }
            contentValues.put("parameter_is_null", Integer.valueOf(i));
            contentValues.put("preference_name", dVar.e);
            contentValues.put("record_time", Long.valueOf(dVar.d));
            contentValues.put("retry_count", (Integer) 0);
            contentValues.put("last_retry_time", Long.valueOf(dVar.d));
            dVar.h = a2.insert("conversiontracking", null, contentValues);
            b();
            if (c() > 20000) {
                d();
            }
        }
    }

    public void c(d dVar) {
        if (dVar == null) {
            return;
        }
        synchronized (this.f1390b) {
            SQLiteDatabase a2 = a();
            if (a2 == null) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            HashMap hashMap = g.f1391a;
            contentValues.put("last_retry_time", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("retry_count", Integer.valueOf(dVar.c + 1));
            a2.update("conversiontracking", contentValues, String.format(Locale.US, "%s = %d", "conversion_ping_id", Long.valueOf(dVar.h)), null);
            b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0046, code lost:            if (r10 != null) goto L15;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d() {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f1390b
            monitor-enter(r0)
            android.database.sqlite.SQLiteDatabase r1 = r11.a()     // Catch: java.lang.Throwable -> L51
            if (r1 != 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L51
            return
        Lb:
            r10 = 0
            java.lang.String r8 = "record_time ASC"
            java.lang.String r2 = "conversiontracking"
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r9 = "1"
            android.database.Cursor r10 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L32
            if (r10 == 0) goto L2a
            boolean r1 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L32
            if (r1 == 0) goto L2a
            com.google.ads.conversiontracking.d r1 = r11.a(r10)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L32
            r11.a(r1)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L32
        L2a:
            if (r10 == 0) goto L49
        L2c:
            r10.close()     // Catch: java.lang.Throwable -> L51
            goto L49
        L30:
            r1 = move-exception
            goto L4b
        L32:
            r1 = move-exception
            java.lang.String r2 = "Error remove oldest record"
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L30
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L30
            int r3 = r1.length()     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L46
            r2.concat(r1)     // Catch: java.lang.Throwable -> L30
        L46:
            if (r10 == 0) goto L49
            goto L2c
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L51
            return
        L4b:
            if (r10 == 0) goto L50
            r10.close()     // Catch: java.lang.Throwable -> L51
        L50:
            throw r1     // Catch: java.lang.Throwable -> L51
        L51:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L51
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.conversiontracking.f.d():void");
    }

    public SQLiteDatabase a() {
        try {
            return this.f1389a.getWritableDatabase();
        } catch (SQLiteException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:            if (r11.moveToFirst() != false) goto L15;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:            r1.add(a(r11));     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:            if (r11.moveToNext() != false) goto L39;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:            r11.close();     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:            return r1;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0057, code lost:            if (r11 != null) goto L17;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<com.google.ads.conversiontracking.d> a(long r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f1390b
            monitor-enter(r0)
            java.util.LinkedList r1 = new java.util.LinkedList     // Catch: java.lang.Throwable -> L62
            r1.<init>()     // Catch: java.lang.Throwable -> L62
            r2 = 0
            int r4 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r4 > 0) goto L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L62
            return r1
        L10:
            android.database.sqlite.SQLiteDatabase r2 = r12.a()     // Catch: java.lang.Throwable -> L62
            if (r2 != 0) goto L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L62
            return r1
        L18:
            r11 = 0
            java.lang.String r9 = "last_retry_time ASC"
            java.lang.String r3 = "conversiontracking"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r10 = java.lang.String.valueOf(r13)     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L43
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L43
            boolean r13 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L43
            if (r13 == 0) goto L3d
        L30:
            com.google.ads.conversiontracking.d r13 = r12.a(r11)     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L43
            r1.add(r13)     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L43
            boolean r13 = r11.moveToNext()     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L43
            if (r13 != 0) goto L30
        L3d:
            r11.close()     // Catch: java.lang.Throwable -> L62
            goto L5a
        L41:
            r13 = move-exception
            goto L5c
        L43:
            r13 = move-exception
            java.lang.String r14 = "Error extracing ping Info: "
            java.lang.String r13 = r13.getMessage()     // Catch: java.lang.Throwable -> L41
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch: java.lang.Throwable -> L41
            int r2 = r13.length()     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L57
            r14.concat(r13)     // Catch: java.lang.Throwable -> L41
        L57:
            if (r11 == 0) goto L5a
            goto L3d
        L5a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L62
            return r1
        L5c:
            if (r11 == 0) goto L61
            r11.close()     // Catch: java.lang.Throwable -> L62
        L61:
            throw r13     // Catch: java.lang.Throwable -> L62
        L62:
            r13 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L62
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.conversiontracking.f.a(long):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003c, code lost:            if (r3 != null) goto L15;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int c() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f1390b
            monitor-enter(r0)
            android.database.sqlite.SQLiteDatabase r1 = r6.a()     // Catch: java.lang.Throwable -> L47
            r2 = 0
            if (r1 != 0) goto Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            return r2
        Lc:
            r3 = 0
            java.lang.String r4 = "select count(*) from conversiontracking"
            android.database.Cursor r3 = r1.rawQuery(r4, r3)     // Catch: java.lang.Throwable -> L26 android.database.sqlite.SQLiteException -> L28
            boolean r1 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L26 android.database.sqlite.SQLiteException -> L28
            if (r1 == 0) goto L22
            int r1 = r3.getInt(r2)     // Catch: java.lang.Throwable -> L26 android.database.sqlite.SQLiteException -> L28
            r3.close()     // Catch: java.lang.Throwable -> L47
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            return r1
        L22:
            r3.close()     // Catch: java.lang.Throwable -> L47
            goto L3f
        L26:
            r1 = move-exception
            goto L41
        L28:
            r1 = move-exception
            java.lang.String r4 = "Error getting record count"
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L26
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L26
            int r5 = r1.length()     // Catch: java.lang.Throwable -> L26
            if (r5 == 0) goto L3c
            r4.concat(r1)     // Catch: java.lang.Throwable -> L26
        L3c:
            if (r3 == 0) goto L3f
            goto L22
        L3f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            return r2
        L41:
            if (r3 == 0) goto L46
            r3.close()     // Catch: java.lang.Throwable -> L47
        L46:
            throw r1     // Catch: java.lang.Throwable -> L47
        L47:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.conversiontracking.f.c():int");
    }

    public void b() {
        synchronized (this.f1390b) {
            SQLiteDatabase a2 = a();
            if (a2 == null) {
                return;
            }
            Locale locale = Locale.US;
            HashMap hashMap = g.f1391a;
            a2.delete("conversiontracking", String.format(locale, "(%s > %d) or (%s < %d and %s > 0)", "retry_count", 9000L, "record_time", Long.valueOf(System.currentTimeMillis() - 43200000), "retry_count"), null);
        }
    }

    public d a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        int i = cursor.getInt(7);
        String string = cursor.getString(1);
        if (i > 0) {
            string = Uri.parse(string).buildUpon().appendQueryParameter("retry", Integer.toString(i)).build().toString();
        }
        return new d(cursor.getLong(0), string, cursor.getString(2), cursor.getInt(3) > 0, cursor.getInt(4) > 0, cursor.getString(5), cursor.getLong(6), i);
    }
}
