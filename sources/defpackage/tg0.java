package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.exoplayer2.offline.DownloadRequest;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class tg0 implements ht3 {
    public static final String d = h(3, 4);
    public static final String[] e = {FacebookMediationAdapter.KEY_ID, "mime_type", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", wm0.KEY_STOP_REASON, "failure_reason", "percent_downloaded", "bytes_downloaded", "key_set_id"};

    /* renamed from: a, reason: collision with root package name */
    public final he0 f4497a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4498b = new Object();
    public boolean c;

    public tg0(he0 he0Var) {
        this.f4497a = he0Var;
    }

    public static ArrayList a(String str) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        int i = wi3.f5017a;
        for (String str2 : str.split(",", -1)) {
            String[] split = str2.split("\\.", -1);
            if (split.length == 3) {
                z = true;
            } else {
                z = false;
            }
            cp3.m(z);
            arrayList.add(new StreamKey(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2])));
        }
        return arrayList;
    }

    public static jm0 e(Cursor cursor) {
        int i;
        byte[] blob = cursor.getBlob(14);
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        Uri parse = Uri.parse(string2);
        String string3 = cursor.getString(1);
        ArrayList a2 = a(cursor.getString(3));
        if (blob.length <= 0) {
            blob = null;
        }
        DownloadRequest downloadRequest = new DownloadRequest(string, parse, string3, a2, blob, cursor.getString(4), cursor.getBlob(5));
        tm0 tm0Var = new tm0();
        tm0Var.f4533a = cursor.getLong(13);
        tm0Var.f4534b = cursor.getFloat(12);
        int i2 = cursor.getInt(6);
        if (i2 == 4) {
            i = cursor.getInt(11);
        } else {
            i = 0;
        }
        return new jm0(downloadRequest, i2, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i, tm0Var);
    }

    public static jm0 f(Cursor cursor) {
        String str;
        int i;
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        Uri parse = Uri.parse(string2);
        String string3 = cursor.getString(1);
        if ("dash".equals(string3)) {
            str = "application/dash+xml";
        } else if ("hls".equals(string3)) {
            str = "application/x-mpegURL";
        } else if ("ss".equals(string3)) {
            str = "application/vnd.ms-sstr+xml";
        } else {
            str = "video/x-unknown";
        }
        DownloadRequest downloadRequest = new DownloadRequest(string, parse, str, a(cursor.getString(3)), null, cursor.getString(4), cursor.getBlob(5));
        tm0 tm0Var = new tm0();
        tm0Var.f4533a = cursor.getLong(13);
        tm0Var.f4534b = cursor.getFloat(12);
        int i2 = cursor.getInt(6);
        if (i2 == 4) {
            i = cursor.getInt(11);
        } else {
            i = 0;
        }
        return new jm0(downloadRequest, i2, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i, tm0Var);
    }

    public static String h(int... iArr) {
        if (iArr.length == 0) {
            return "1";
        }
        StringBuilder sb = new StringBuilder("state IN (");
        for (int i = 0; i < iArr.length; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(iArr[i]);
        }
        sb.append(')');
        return sb.toString();
    }

    public static ArrayList i(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        if (!wi3.J(sQLiteDatabase, "ExoPlayerDownloads")) {
            return arrayList;
        }
        Cursor query = sQLiteDatabase.query("ExoPlayerDownloads", new String[]{FacebookMediationAdapter.KEY_ID, "title", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", wm0.KEY_STOP_REASON, "failure_reason", "percent_downloaded", "bytes_downloaded"}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                arrayList.add(f(query));
            } finally {
            }
        }
        query.close();
        return arrayList;
    }

    public final void b() {
        ArrayList arrayList;
        synchronized (this.f4498b) {
            if (this.c) {
                return;
            }
            try {
                int a2 = vj3.a(((rg0) this.f4497a).a(), "", 0);
                if (a2 != 3) {
                    SQLiteDatabase b2 = ((rg0) this.f4497a).b();
                    b2.beginTransactionNonExclusive();
                    try {
                        vj3.b(b2, 0, "", 3);
                        if (a2 == 2) {
                            arrayList = i(b2);
                        } else {
                            arrayList = new ArrayList();
                        }
                        b2.execSQL("DROP TABLE IF EXISTS ExoPlayerDownloads");
                        b2.execSQL("CREATE TABLE ExoPlayerDownloads (id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)");
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            k((jm0) it.next(), b2);
                        }
                        b2.setTransactionSuccessful();
                        b2.endTransaction();
                    } catch (Throwable th) {
                        b2.endTransaction();
                        throw th;
                    }
                }
                this.c = true;
            } catch (SQLException e2) {
                throw new ge0(e2);
            }
        }
    }

    public final Cursor c(String str, String[] strArr) {
        try {
            return ((rg0) this.f4497a).a().query("ExoPlayerDownloads", e, str, strArr, null, null, "start_time_ms ASC");
        } catch (SQLiteException e2) {
            throw new ge0(e2);
        }
    }

    public final jm0 d(String str) {
        b();
        try {
            Cursor c = c("id = ?", new String[]{str});
            try {
                if (c.getCount() == 0) {
                    c.close();
                    return null;
                }
                c.moveToNext();
                jm0 e2 = e(c);
                c.close();
                return e2;
            } finally {
            }
        } catch (SQLiteException e3) {
            throw new ge0(e3);
        }
    }

    public final sg0 g(int... iArr) {
        b();
        return new sg0(c(h(iArr), null));
    }

    public final void j(jm0 jm0Var) {
        b();
        try {
            k(jm0Var, ((rg0) this.f4497a).b());
        } catch (SQLiteException e2) {
            throw new ge0(e2);
        }
    }

    public final void k(jm0 jm0Var, SQLiteDatabase sQLiteDatabase) {
        byte[] bArr = jm0Var.f2790a.e;
        if (bArr == null) {
            bArr = wi3.f;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(FacebookMediationAdapter.KEY_ID, jm0Var.f2790a.f1509a);
        contentValues.put("mime_type", jm0Var.f2790a.c);
        contentValues.put("uri", jm0Var.f2790a.f1510b.toString());
        List list = jm0Var.f2790a.d;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            StreamKey streamKey = (StreamKey) list.get(i);
            sb.append(streamKey.f1511a);
            sb.append('.');
            sb.append(streamKey.f1512b);
            sb.append('.');
            sb.append(streamKey.c);
            sb.append(',');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        contentValues.put("stream_keys", sb.toString());
        contentValues.put("custom_cache_key", jm0Var.f2790a.f);
        contentValues.put("data", jm0Var.f2790a.g);
        contentValues.put("state", Integer.valueOf(jm0Var.f2791b));
        contentValues.put("start_time_ms", Long.valueOf(jm0Var.c));
        contentValues.put("update_time_ms", Long.valueOf(jm0Var.d));
        contentValues.put("content_length", Long.valueOf(jm0Var.e));
        contentValues.put(wm0.KEY_STOP_REASON, Integer.valueOf(jm0Var.f));
        contentValues.put("failure_reason", Integer.valueOf(jm0Var.g));
        contentValues.put("percent_downloaded", Float.valueOf(jm0Var.h.f4534b));
        contentValues.put("bytes_downloaded", Long.valueOf(jm0Var.h.f4533a));
        contentValues.put("key_set_id", bArr);
        sQLiteDatabase.replaceOrThrow("ExoPlayerDownloads", null, contentValues);
    }

    public final void l() {
        b();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 0);
            ((rg0) this.f4497a).b().update("ExoPlayerDownloads", contentValues, "state = 2", null);
        } catch (SQLException e2) {
            throw new ge0(e2);
        }
    }

    public final void m() {
        b();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 5);
            contentValues.put("failure_reason", (Integer) 0);
            ((rg0) this.f4497a).b().update("ExoPlayerDownloads", contentValues, null, null);
        } catch (SQLException e2) {
            throw new ge0(e2);
        }
    }

    public final void n(int i) {
        b();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(wm0.KEY_STOP_REASON, Integer.valueOf(i));
            ((rg0) this.f4497a).b().update("ExoPlayerDownloads", contentValues, d, null);
        } catch (SQLException e2) {
            throw new ge0(e2);
        }
    }

    public final void o(int i, String str) {
        b();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(wm0.KEY_STOP_REASON, Integer.valueOf(i));
            ((rg0) this.f4497a).b().update("ExoPlayerDownloads", contentValues, d + " AND id = ?", new String[]{str});
        } catch (SQLException e2) {
            throw new ge0(e2);
        }
    }
}
