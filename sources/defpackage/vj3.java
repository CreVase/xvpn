package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public abstract class vj3 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4846a = 0;

    static {
        iu0.a("goog.exo.database");
    }

    public static int a(SQLiteDatabase sQLiteDatabase, String str, int i) {
        try {
            if (!wi3.J(sQLiteDatabase, "ExoPlayerVersions")) {
                return -1;
            }
            Cursor query = sQLiteDatabase.query("ExoPlayerVersions", new String[]{"version"}, "feature = ? AND instance_uid = ?", new String[]{Integer.toString(i), str}, null, null, null);
            try {
                if (query.getCount() == 0) {
                    query.close();
                    return -1;
                }
                query.moveToNext();
                int i2 = query.getInt(0);
                query.close();
                return i2;
            } finally {
            }
        } catch (SQLException e) {
            throw new ge0(e);
        }
    }

    public static void b(SQLiteDatabase sQLiteDatabase, int i, String str, int i2) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))");
            ContentValues contentValues = new ContentValues();
            contentValues.put("feature", Integer.valueOf(i));
            contentValues.put("instance_uid", str);
            contentValues.put("version", Integer.valueOf(i2));
            sQLiteDatabase.replaceOrThrow("ExoPlayerVersions", null, contentValues);
        } catch (SQLException e) {
            throw new ge0(e);
        }
    }
}
