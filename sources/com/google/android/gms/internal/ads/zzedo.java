package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.RemoteException;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzedo extends SQLiteOpenHelper {
    private final Context zza;
    private final zzgad zzb;

    public zzedo(Context context, zzgad zzgadVar) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzif)).intValue());
        this.zza = context;
        this.zzb = zzgadVar;
    }

    public static /* synthetic */ Void zzb(zzcay zzcayVar, SQLiteDatabase sQLiteDatabase) throws Exception {
        zzj(sQLiteDatabase, zzcayVar);
        return null;
    }

    public static /* synthetic */ void zzf(SQLiteDatabase sQLiteDatabase, String str, zzcay zzcayVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        zzj(sQLiteDatabase, zzcayVar);
    }

    public static final void zzi(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    private static void zzj(SQLiteDatabase sQLiteDatabase, zzcay zzcayVar) {
        sQLiteDatabase.beginTransaction();
        try {
            Cursor query = sQLiteDatabase.query("offline_buffered_pings", new String[]{ImagesContract.URL}, "event_state = 1", null, null, null, "timestamp ASC", null);
            int count = query.getCount();
            String[] strArr = new String[count];
            int i = 0;
            while (query.moveToNext()) {
                int columnIndex = query.getColumnIndex(ImagesContract.URL);
                if (columnIndex != -1) {
                    strArr[i] = query.getString(columnIndex);
                }
                i++;
            }
            query.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            for (int i2 = 0; i2 < count; i2++) {
                zzcayVar.zza(strArr[i2]);
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    public final /* synthetic */ Void zza(zzedq zzedqVar, SQLiteDatabase sQLiteDatabase) throws Exception {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(zzedqVar.zza));
        contentValues.put("gws_query_id", zzedqVar.zzb);
        contentValues.put(ImagesContract.URL, zzedqVar.zzc);
        contentValues.put("event_state", Integer.valueOf(zzedqVar.zzd - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        com.google.android.gms.ads.internal.zzt.zzp();
        com.google.android.gms.ads.internal.util.zzbt zzy = com.google.android.gms.ads.internal.util.zzt.zzy(this.zza);
        if (zzy != null) {
            try {
                zzy.zze(ObjectWrapper.wrap(this.zza));
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzb("Failed to schedule offline ping sender.", e);
            }
        }
        return null;
    }

    public final void zzc(final String str) {
        zze(new zzfgu() { // from class: com.google.android.gms.internal.ads.zzedm
            @Override // com.google.android.gms.internal.ads.zzfgu
            public final Object zza(Object obj) {
                zzedo.zzi((SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    public final void zzd(final zzedq zzedqVar) {
        zze(new zzfgu() { // from class: com.google.android.gms.internal.ads.zzedi
            @Override // com.google.android.gms.internal.ads.zzfgu
            public final Object zza(Object obj) {
                zzedo.this.zza(zzedqVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    public final void zze(zzfgu zzfguVar) {
        zzfzt.zzr(this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzedk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzedo.this.getWritableDatabase();
            }
        }), new zzedn(this, zzfguVar), this.zzb);
    }

    public final void zzg(final SQLiteDatabase sQLiteDatabase, final zzcay zzcayVar, final String str) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedl
            @Override // java.lang.Runnable
            public final void run() {
                zzedo.zzf(sQLiteDatabase, str, zzcayVar);
            }
        });
    }

    public final void zzh(final zzcay zzcayVar, final String str) {
        zze(new zzfgu() { // from class: com.google.android.gms.internal.ads.zzedj
            @Override // com.google.android.gms.internal.ads.zzfgu
            public final Object zza(Object obj) {
                zzedo.this.zzg((SQLiteDatabase) obj, zzcayVar, str);
                return null;
            }
        });
    }
}
