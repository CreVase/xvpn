package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zznk;
import com.google.android.gms.internal.measurement.zznp;
import com.google.android.gms.internal.measurement.zznq;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.hx2;
import defpackage.kg;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzao extends zzmo {
    private static final String[] zza = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    private static final String[] zzb = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] zzc = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;"};
    private static final String[] zzd = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] zze = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] zzg = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzh = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzi = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private static final String[] zzj = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;"};
    private static final String[] zzk = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};
    private final zzau zzl;
    private final zzmi zzm;

    public zzao(zzmp zzmpVar) {
        super(zzmpVar);
        this.zzm = new zzmi(zzb());
        this.zzl = new zzau(this, zza(), "google_app_measurement.db");
    }

    private final boolean zzan() {
        return zza().getDatabasePath("google_app_measurement.db").exists();
    }

    public final long b_() {
        Cursor cursor = null;
        try {
            try {
                cursor = e_().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return -1L;
                }
                long j = cursor.getLong(0);
                cursor.close();
                return j;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error querying raw events", e);
                if (cursor != null) {
                    cursor.close();
                }
                return -1L;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long c_() {
        return zza("select max(bundle_end_timestamp) from queue", (String[]) null, 0L);
    }

    public final long d_() {
        return zza("select max(timestamp) from raw_events", (String[]) null, 0L);
    }

    public final SQLiteDatabase e_() {
        zzt();
        try {
            return this.zzl.getWritableDatabase();
        } catch (SQLiteException e) {
            zzj().zzu().zza("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String f_() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.e_()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L25
            boolean r2 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L3a
            if (r2 == 0) goto L1a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L3a
            r0.close()
            return r1
        L1a:
            r0.close()
            return r1
        L1e:
            r2 = move-exception
            goto L27
        L20:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3b
        L25:
            r2 = move-exception
            r0 = r1
        L27:
            com.google.android.gms.measurement.internal.zzfr r3 = r6.zzj()     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzg()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.zza(r4, r2)     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L39
            r0.close()
        L39:
            return r1
        L3a:
            r1 = move-exception
        L3b:
            if (r0 == 0) goto L40
            r0.close()
        L40:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzao.f_():java.lang.String");
    }

    public final long zzb(String str, String str2) {
        long zza2;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzak();
        SQLiteDatabase e_ = e_();
        e_.beginTransaction();
        long j = 0;
        try {
            try {
                try {
                    zza2 = zza("select " + str2 + " from app2 where app_id=?", new String[]{str}, -1L);
                    if (zza2 == -1) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("app_id", str);
                        contentValues.put("first_open_count", (Integer) 0);
                        contentValues.put("previous_install_count", (Integer) 0);
                        if (e_.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                            zzj().zzg().zza("Failed to insert column (got -1). appId", zzfr.zza(str), str2);
                            e_.endTransaction();
                            return -1L;
                        }
                        zza2 = 0;
                    }
                } catch (Throwable th) {
                    th = th;
                    e_.endTransaction();
                    throw th;
                }
            } catch (SQLiteException e) {
                e = e;
            }
        } catch (SQLiteException e2) {
            e = e2;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("app_id", str);
            contentValues2.put(str2, Long.valueOf(1 + zza2));
            if (e_.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                zzj().zzg().zza("Failed to update column (got 0). appId", zzfr.zza(str), str2);
                e_.endTransaction();
                return -1L;
            }
            e_.setTransactionSuccessful();
            e_.endTransaction();
            return zza2;
        } catch (SQLiteException e3) {
            e = e3;
            j = zza2;
            zzj().zzg().zza("Error inserting column. appId", zzfr.zza(str), str2, e);
            e_.endTransaction();
            return j;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzmo
    public final boolean zzc() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0224 A[Catch: SQLiteException -> 0x0327, all -> 0x0350, TryCatch #0 {all -> 0x0350, blocks: (B:14:0x0114, B:16:0x0171, B:20:0x017b, B:23:0x01c5, B:25:0x01f4, B:29:0x01fe, B:32:0x0219, B:34:0x0224, B:35:0x0236, B:37:0x023c, B:39:0x0248, B:41:0x0254, B:42:0x025d, B:44:0x0263, B:46:0x026f, B:48:0x0277, B:51:0x0280, B:53:0x0283, B:55:0x029b, B:57:0x02a7, B:58:0x02b9, B:60:0x02bf, B:62:0x02cb, B:64:0x02d3, B:67:0x02dc, B:69:0x02df, B:71:0x02e5, B:73:0x02f1, B:76:0x0306, B:77:0x02fb, B:80:0x0302, B:81:0x0309, B:83:0x0312, B:87:0x0215, B:89:0x01c0, B:92:0x0339), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x023c A[Catch: SQLiteException -> 0x0327, all -> 0x0350, TryCatch #0 {all -> 0x0350, blocks: (B:14:0x0114, B:16:0x0171, B:20:0x017b, B:23:0x01c5, B:25:0x01f4, B:29:0x01fe, B:32:0x0219, B:34:0x0224, B:35:0x0236, B:37:0x023c, B:39:0x0248, B:41:0x0254, B:42:0x025d, B:44:0x0263, B:46:0x026f, B:48:0x0277, B:51:0x0280, B:53:0x0283, B:55:0x029b, B:57:0x02a7, B:58:0x02b9, B:60:0x02bf, B:62:0x02cb, B:64:0x02d3, B:67:0x02dc, B:69:0x02df, B:71:0x02e5, B:73:0x02f1, B:76:0x0306, B:77:0x02fb, B:80:0x0302, B:81:0x0309, B:83:0x0312, B:87:0x0215, B:89:0x01c0, B:92:0x0339), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0263 A[Catch: SQLiteException -> 0x0327, all -> 0x0350, TryCatch #0 {all -> 0x0350, blocks: (B:14:0x0114, B:16:0x0171, B:20:0x017b, B:23:0x01c5, B:25:0x01f4, B:29:0x01fe, B:32:0x0219, B:34:0x0224, B:35:0x0236, B:37:0x023c, B:39:0x0248, B:41:0x0254, B:42:0x025d, B:44:0x0263, B:46:0x026f, B:48:0x0277, B:51:0x0280, B:53:0x0283, B:55:0x029b, B:57:0x02a7, B:58:0x02b9, B:60:0x02bf, B:62:0x02cb, B:64:0x02d3, B:67:0x02dc, B:69:0x02df, B:71:0x02e5, B:73:0x02f1, B:76:0x0306, B:77:0x02fb, B:80:0x0302, B:81:0x0309, B:83:0x0312, B:87:0x0215, B:89:0x01c0, B:92:0x0339), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x029b A[Catch: SQLiteException -> 0x0327, all -> 0x0350, TryCatch #0 {all -> 0x0350, blocks: (B:14:0x0114, B:16:0x0171, B:20:0x017b, B:23:0x01c5, B:25:0x01f4, B:29:0x01fe, B:32:0x0219, B:34:0x0224, B:35:0x0236, B:37:0x023c, B:39:0x0248, B:41:0x0254, B:42:0x025d, B:44:0x0263, B:46:0x026f, B:48:0x0277, B:51:0x0280, B:53:0x0283, B:55:0x029b, B:57:0x02a7, B:58:0x02b9, B:60:0x02bf, B:62:0x02cb, B:64:0x02d3, B:67:0x02dc, B:69:0x02df, B:71:0x02e5, B:73:0x02f1, B:76:0x0306, B:77:0x02fb, B:80:0x0302, B:81:0x0309, B:83:0x0312, B:87:0x0215, B:89:0x01c0, B:92:0x0339), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02bf A[Catch: SQLiteException -> 0x0327, all -> 0x0350, TryCatch #0 {all -> 0x0350, blocks: (B:14:0x0114, B:16:0x0171, B:20:0x017b, B:23:0x01c5, B:25:0x01f4, B:29:0x01fe, B:32:0x0219, B:34:0x0224, B:35:0x0236, B:37:0x023c, B:39:0x0248, B:41:0x0254, B:42:0x025d, B:44:0x0263, B:46:0x026f, B:48:0x0277, B:51:0x0280, B:53:0x0283, B:55:0x029b, B:57:0x02a7, B:58:0x02b9, B:60:0x02bf, B:62:0x02cb, B:64:0x02d3, B:67:0x02dc, B:69:0x02df, B:71:0x02e5, B:73:0x02f1, B:76:0x0306, B:77:0x02fb, B:80:0x0302, B:81:0x0309, B:83:0x0312, B:87:0x0215, B:89:0x01c0, B:92:0x0339), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02e5 A[Catch: SQLiteException -> 0x0327, all -> 0x0350, TryCatch #0 {all -> 0x0350, blocks: (B:14:0x0114, B:16:0x0171, B:20:0x017b, B:23:0x01c5, B:25:0x01f4, B:29:0x01fe, B:32:0x0219, B:34:0x0224, B:35:0x0236, B:37:0x023c, B:39:0x0248, B:41:0x0254, B:42:0x025d, B:44:0x0263, B:46:0x026f, B:48:0x0277, B:51:0x0280, B:53:0x0283, B:55:0x029b, B:57:0x02a7, B:58:0x02b9, B:60:0x02bf, B:62:0x02cb, B:64:0x02d3, B:67:0x02dc, B:69:0x02df, B:71:0x02e5, B:73:0x02f1, B:76:0x0306, B:77:0x02fb, B:80:0x0302, B:81:0x0309, B:83:0x0312, B:87:0x0215, B:89:0x01c0, B:92:0x0339), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02fb A[Catch: SQLiteException -> 0x0327, all -> 0x0350, TryCatch #0 {all -> 0x0350, blocks: (B:14:0x0114, B:16:0x0171, B:20:0x017b, B:23:0x01c5, B:25:0x01f4, B:29:0x01fe, B:32:0x0219, B:34:0x0224, B:35:0x0236, B:37:0x023c, B:39:0x0248, B:41:0x0254, B:42:0x025d, B:44:0x0263, B:46:0x026f, B:48:0x0277, B:51:0x0280, B:53:0x0283, B:55:0x029b, B:57:0x02a7, B:58:0x02b9, B:60:0x02bf, B:62:0x02cb, B:64:0x02d3, B:67:0x02dc, B:69:0x02df, B:71:0x02e5, B:73:0x02f1, B:76:0x0306, B:77:0x02fb, B:80:0x0302, B:81:0x0309, B:83:0x0312, B:87:0x0215, B:89:0x01c0, B:92:0x0339), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0312 A[Catch: SQLiteException -> 0x0327, all -> 0x0350, TRY_LEAVE, TryCatch #0 {all -> 0x0350, blocks: (B:14:0x0114, B:16:0x0171, B:20:0x017b, B:23:0x01c5, B:25:0x01f4, B:29:0x01fe, B:32:0x0219, B:34:0x0224, B:35:0x0236, B:37:0x023c, B:39:0x0248, B:41:0x0254, B:42:0x025d, B:44:0x0263, B:46:0x026f, B:48:0x0277, B:51:0x0280, B:53:0x0283, B:55:0x029b, B:57:0x02a7, B:58:0x02b9, B:60:0x02bf, B:62:0x02cb, B:64:0x02d3, B:67:0x02dc, B:69:0x02df, B:71:0x02e5, B:73:0x02f1, B:76:0x0306, B:77:0x02fb, B:80:0x0302, B:81:0x0309, B:83:0x0312, B:87:0x0215, B:89:0x01c0, B:92:0x0339), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0215 A[Catch: SQLiteException -> 0x0327, all -> 0x0350, TryCatch #0 {all -> 0x0350, blocks: (B:14:0x0114, B:16:0x0171, B:20:0x017b, B:23:0x01c5, B:25:0x01f4, B:29:0x01fe, B:32:0x0219, B:34:0x0224, B:35:0x0236, B:37:0x023c, B:39:0x0248, B:41:0x0254, B:42:0x025d, B:44:0x0263, B:46:0x026f, B:48:0x0277, B:51:0x0280, B:53:0x0283, B:55:0x029b, B:57:0x02a7, B:58:0x02b9, B:60:0x02bf, B:62:0x02cb, B:64:0x02d3, B:67:0x02dc, B:69:0x02df, B:71:0x02e5, B:73:0x02f1, B:76:0x0306, B:77:0x02fb, B:80:0x0302, B:81:0x0309, B:83:0x0312, B:87:0x0215, B:89:0x01c0, B:92:0x0339), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c0 A[Catch: SQLiteException -> 0x0327, all -> 0x0350, TryCatch #0 {all -> 0x0350, blocks: (B:14:0x0114, B:16:0x0171, B:20:0x017b, B:23:0x01c5, B:25:0x01f4, B:29:0x01fe, B:32:0x0219, B:34:0x0224, B:35:0x0236, B:37:0x023c, B:39:0x0248, B:41:0x0254, B:42:0x025d, B:44:0x0263, B:46:0x026f, B:48:0x0277, B:51:0x0280, B:53:0x0283, B:55:0x029b, B:57:0x02a7, B:58:0x02b9, B:60:0x02bf, B:62:0x02cb, B:64:0x02d3, B:67:0x02dc, B:69:0x02df, B:71:0x02e5, B:73:0x02f1, B:76:0x0306, B:77:0x02fb, B:80:0x0302, B:81:0x0309, B:83:0x0312, B:87:0x0215, B:89:0x01c0, B:92:0x0339), top: B:2:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzh zzd(java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 856
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzao.zzd(java.lang.String):com.google.android.gms.measurement.internal.zzh");
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0089: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:27:0x0089 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzaq zze(java.lang.String r13) {
        /*
            r12 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r13)
            r12.zzt()
            r12.zzak()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r12.e_()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r2 = "apps"
            r3 = 3
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r4 = "remote_config"
            r9 = 0
            r3[r9] = r4     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r4 = "config_last_modified_time"
            r10 = 1
            r3[r10] = r4     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r4 = "e_tag"
            r11 = 2
            r3[r11] = r4     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r4 = "app_id=?"
            java.lang.String[] r5 = new java.lang.String[]{r13}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L6b java.lang.Throwable -> L88
            if (r2 != 0) goto L39
            r1.close()
            return r0
        L39:
            byte[] r2 = r1.getBlob(r9)     // Catch: android.database.sqlite.SQLiteException -> L6b java.lang.Throwable -> L88
            java.lang.String r3 = r1.getString(r10)     // Catch: android.database.sqlite.SQLiteException -> L6b java.lang.Throwable -> L88
            java.lang.String r4 = r1.getString(r11)     // Catch: android.database.sqlite.SQLiteException -> L6b java.lang.Throwable -> L88
            boolean r5 = r1.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L6b java.lang.Throwable -> L88
            if (r5 == 0) goto L5c
            com.google.android.gms.measurement.internal.zzfr r5 = r12.zzj()     // Catch: android.database.sqlite.SQLiteException -> L6b java.lang.Throwable -> L88
            com.google.android.gms.measurement.internal.zzft r5 = r5.zzg()     // Catch: android.database.sqlite.SQLiteException -> L6b java.lang.Throwable -> L88
            java.lang.String r6 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzfr.zza(r13)     // Catch: android.database.sqlite.SQLiteException -> L6b java.lang.Throwable -> L88
            r5.zza(r6, r7)     // Catch: android.database.sqlite.SQLiteException -> L6b java.lang.Throwable -> L88
        L5c:
            if (r2 != 0) goto L62
            r1.close()
            return r0
        L62:
            com.google.android.gms.measurement.internal.zzaq r5 = new com.google.android.gms.measurement.internal.zzaq     // Catch: android.database.sqlite.SQLiteException -> L6b java.lang.Throwable -> L88
            r5.<init>(r2, r3, r4)     // Catch: android.database.sqlite.SQLiteException -> L6b java.lang.Throwable -> L88
            r1.close()
            return r5
        L6b:
            r2 = move-exception
            goto L71
        L6d:
            r13 = move-exception
            goto L8a
        L6f:
            r2 = move-exception
            r1 = r0
        L71:
            com.google.android.gms.measurement.internal.zzfr r3 = r12.zzj()     // Catch: java.lang.Throwable -> L88
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzg()     // Catch: java.lang.Throwable -> L88
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzfr.zza(r13)     // Catch: java.lang.Throwable -> L88
            r3.zza(r4, r13, r2)     // Catch: java.lang.Throwable -> L88
            if (r1 == 0) goto L87
            r1.close()
        L87:
            return r0
        L88:
            r13 = move-exception
            r0 = r1
        L8a:
            if (r0 == 0) goto L8f
            r0.close()
        L8f:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzao.zze(java.lang.String):com.google.android.gms.measurement.internal.zzaq");
    }

    public final zzay zzf(String str) {
        if (zznp.zza() && zze().zza(zzbi.zzcm)) {
            Preconditions.checkNotNull(str);
            zzt();
            zzak();
            return zzay.zza(zza("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
        }
        return zzay.zza;
    }

    public final zzih zzg(String str) {
        Preconditions.checkNotNull(str);
        zzt();
        zzak();
        if (zznp.zza() && zze().zza(zzbi.zzcm)) {
            zzih zzihVar = (zzih) zza("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str}, new zzar() { // from class: com.google.android.gms.measurement.internal.zzan
                @Override // com.google.android.gms.measurement.internal.zzar
                public final Object zza(Cursor cursor) {
                    zzih zza2;
                    zza2 = zzih.zza(cursor.getString(0), cursor.getInt(1));
                    return zza2;
                }
            });
            return zzihVar == null ? zzih.zza : zzihVar;
        }
        return zzih.zza(zza("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str}, "G1"));
    }

    public final List<zzmh> zzh(String str) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzak();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = e_().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    arrayList.add(new zzmh(string, cursor.getLong(1), cursor.getInt(2)));
                } while (cursor.moveToNext());
                cursor.close();
                return arrayList;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error querying trigger uris. appId", zzfr.zza(str), e);
                List<zzmh> emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zzne> zzi(java.lang.String r16) {
        /*
            r15 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r16)
            r15.zzt()
            r15.zzak()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r15.e_()     // Catch: java.lang.Throwable -> L87 android.database.sqlite.SQLiteException -> L8a
            java.lang.String r3 = "user_attributes"
            r4 = 4
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L87 android.database.sqlite.SQLiteException -> L8a
            java.lang.String r5 = "name"
            r11 = 0
            r4[r11] = r5     // Catch: java.lang.Throwable -> L87 android.database.sqlite.SQLiteException -> L8a
            java.lang.String r5 = "origin"
            r12 = 1
            r4[r12] = r5     // Catch: java.lang.Throwable -> L87 android.database.sqlite.SQLiteException -> L8a
            java.lang.String r5 = "set_timestamp"
            r13 = 2
            r4[r13] = r5     // Catch: java.lang.Throwable -> L87 android.database.sqlite.SQLiteException -> L8a
            java.lang.String r5 = "value"
            r14 = 3
            r4[r14] = r5     // Catch: java.lang.Throwable -> L87 android.database.sqlite.SQLiteException -> L8a
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[]{r16}     // Catch: java.lang.Throwable -> L87 android.database.sqlite.SQLiteException -> L8a
            r7 = 0
            r8 = 0
            java.lang.String r9 = "rowid"
            java.lang.String r10 = "1000"
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L87 android.database.sqlite.SQLiteException -> L8a
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L87 android.database.sqlite.SQLiteException -> L8a
            if (r2 != 0) goto L46
            r1.close()
            return r0
        L46:
            java.lang.String r6 = r1.getString(r11)     // Catch: java.lang.Throwable -> L87 android.database.sqlite.SQLiteException -> L8a
            java.lang.String r2 = r1.getString(r12)     // Catch: java.lang.Throwable -> L87 android.database.sqlite.SQLiteException -> L8a
            if (r2 != 0) goto L52
            java.lang.String r2 = ""
        L52:
            r5 = r2
            long r7 = r1.getLong(r13)     // Catch: java.lang.Throwable -> L87 android.database.sqlite.SQLiteException -> L8a
            r2 = r15
            java.lang.Object r9 = r15.zza(r1, r14)     // Catch: android.database.sqlite.SQLiteException -> L85 java.lang.Throwable -> La7
            if (r9 != 0) goto L70
            com.google.android.gms.measurement.internal.zzfr r3 = r15.zzj()     // Catch: android.database.sqlite.SQLiteException -> L85 java.lang.Throwable -> La7
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzg()     // Catch: android.database.sqlite.SQLiteException -> L85 java.lang.Throwable -> La7
            java.lang.String r4 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzfr.zza(r16)     // Catch: android.database.sqlite.SQLiteException -> L85 java.lang.Throwable -> La7
            r3.zza(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> L85 java.lang.Throwable -> La7
            goto L7b
        L70:
            com.google.android.gms.measurement.internal.zzne r10 = new com.google.android.gms.measurement.internal.zzne     // Catch: android.database.sqlite.SQLiteException -> L85 java.lang.Throwable -> La7
            r3 = r10
            r4 = r16
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: android.database.sqlite.SQLiteException -> L85 java.lang.Throwable -> La7
            r0.add(r10)     // Catch: android.database.sqlite.SQLiteException -> L85 java.lang.Throwable -> La7
        L7b:
            boolean r3 = r1.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L85 java.lang.Throwable -> La7
            if (r3 != 0) goto L46
            r1.close()
            return r0
        L85:
            r0 = move-exception
            goto L8c
        L87:
            r0 = move-exception
            r2 = r15
            goto La8
        L8a:
            r0 = move-exception
            r2 = r15
        L8c:
            com.google.android.gms.measurement.internal.zzfr r3 = r15.zzj()     // Catch: java.lang.Throwable -> La7
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzg()     // Catch: java.lang.Throwable -> La7
            java.lang.String r4 = "Error querying user properties. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzfr.zza(r16)     // Catch: java.lang.Throwable -> La7
            r3.zza(r4, r5, r0)     // Catch: java.lang.Throwable -> La7
            java.util.List r0 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> La7
            if (r1 == 0) goto La6
            r1.close()
        La6:
            return r0
        La7:
            r0 = move-exception
        La8:
            if (r1 == 0) goto Lad
            r1.close()
        Lad:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzao.zzi(java.lang.String):java.util.List");
    }

    public final Map<Integer, zzfi.zzl> zzj(String str) {
        zzak();
        zzt();
        Preconditions.checkNotEmpty(str);
        Cursor cursor = null;
        try {
            try {
                Cursor query = e_().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, zzfi.zzl> emptyMap = Collections.emptyMap();
                    query.close();
                    return emptyMap;
                }
                kg kgVar = new kg();
                do {
                    int i = query.getInt(0);
                    try {
                        kgVar.put(Integer.valueOf(i), (zzfi.zzl) ((com.google.android.gms.internal.measurement.zzix) ((zzfi.zzl.zza) zzmz.zza(zzfi.zzl.zze(), query.getBlob(1))).zzab()));
                    } catch (IOException e) {
                        zzj().zzg().zza("Failed to merge filter results. appId, audienceId, error", zzfr.zza(str), Integer.valueOf(i), e);
                    }
                } while (query.moveToNext());
                query.close();
                return kgVar;
            } catch (SQLiteException e2) {
                zzj().zzg().zza("Database error querying filter results. appId", zzfr.zza(str), e2);
                Map<Integer, zzfi.zzl> emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final Map<Integer, List<zzew.zzb>> zzk(String str) {
        Preconditions.checkNotEmpty(str);
        kg kgVar = new kg();
        Cursor cursor = null;
        try {
            try {
                Cursor query = e_().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (!query.moveToFirst()) {
                        Map<Integer, List<zzew.zzb>> emptyMap = Collections.emptyMap();
                        query.close();
                        return emptyMap;
                    }
                    do {
                        try {
                            zzew.zzb zzbVar = (zzew.zzb) ((com.google.android.gms.internal.measurement.zzix) ((zzew.zzb.zza) zzmz.zza(zzew.zzb.zzc(), query.getBlob(1))).zzab());
                            if (zzbVar.zzk()) {
                                int i = query.getInt(0);
                                List list = (List) kgVar.getOrDefault(Integer.valueOf(i), null);
                                if (list == null) {
                                    list = new ArrayList();
                                    kgVar.put(Integer.valueOf(i), list);
                                }
                                list.add(zzbVar);
                            }
                        } catch (IOException e) {
                            zzj().zzg().zza("Failed to merge filter. appId", zzfr.zza(str), e);
                        }
                    } while (query.moveToNext());
                    query.close();
                    return kgVar;
                } catch (SQLiteException e2) {
                    e = e2;
                    cursor = query;
                    zzj().zzg().zza("Database error querying filters. appId", zzfr.zza(str), e);
                    Map<Integer, List<zzew.zzb>> emptyMap2 = Collections.emptyMap();
                    if (cursor != null) {
                        cursor.close();
                    }
                    return emptyMap2;
                } catch (Throwable th) {
                    th = th;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (SQLiteException e3) {
            e = e3;
        }
    }

    public final Map<Integer, List<Integer>> zzl(String str) {
        zzak();
        zzt();
        Preconditions.checkNotEmpty(str);
        kg kgVar = new kg();
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = e_().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str, str});
                try {
                    if (!rawQuery.moveToFirst()) {
                        Map<Integer, List<Integer>> emptyMap = Collections.emptyMap();
                        rawQuery.close();
                        return emptyMap;
                    }
                    do {
                        int i = rawQuery.getInt(0);
                        List list = (List) kgVar.getOrDefault(Integer.valueOf(i), null);
                        if (list == null) {
                            list = new ArrayList();
                            kgVar.put(Integer.valueOf(i), list);
                        }
                        list.add(Integer.valueOf(rawQuery.getInt(1)));
                    } while (rawQuery.moveToNext());
                    rawQuery.close();
                    return kgVar;
                } catch (SQLiteException e) {
                    e = e;
                    cursor = rawQuery;
                    zzj().zzg().zza("Database error querying scoped filters. appId", zzfr.zza(str), e);
                    Map<Integer, List<Integer>> emptyMap2 = Collections.emptyMap();
                    if (cursor != null) {
                        cursor.close();
                    }
                    return emptyMap2;
                } catch (Throwable th) {
                    th = th;
                    cursor = rawQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void zzp() {
        zzak();
        e_().beginTransaction();
    }

    public final void zzu() {
        zzak();
        e_().endTransaction();
    }

    public final void zzv() {
        int delete;
        zzt();
        zzak();
        if (!zzan()) {
            return;
        }
        long zza2 = zzn().zza.zza();
        long elapsedRealtime = zzb().elapsedRealtime();
        if (Math.abs(elapsedRealtime - zza2) > zzbi.zzy.zza(null).longValue()) {
            zzn().zza.zza(elapsedRealtime);
            zzt();
            zzak();
            if (zzan() && (delete = e_().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(zzb().currentTimeMillis()), String.valueOf(zzaf.zzm())})) > 0) {
                zzj().zzp().zza("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
            }
        }
    }

    public final void zzw() {
        zzak();
        e_().setTransactionSuccessful();
    }

    public final boolean zzx() {
        if (zzb("select count(1) > 0 from raw_events", (String[]) null) != 0) {
            return true;
        }
        return false;
    }

    public final boolean zzy() {
        if (zzb("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0) {
            return true;
        }
        return false;
    }

    public final boolean zzz() {
        if (zzb("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0) {
            return true;
        }
        return false;
    }

    public final int zza(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzak();
        try {
            return e_().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error deleting conditional property", zzfr.zza(str), zzi().zzc(str2), e);
            return 0;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00cf: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:58:0x00cf */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle zzc(java.lang.String r8) {
        /*
            r7 = this;
            r7.zzt()
            r7.zzak()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.e_()     // Catch: java.lang.Throwable -> Lb7 android.database.sqlite.SQLiteException -> Lb9
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            java.lang.String[] r3 = new java.lang.String[]{r8}     // Catch: java.lang.Throwable -> Lb7 android.database.sqlite.SQLiteException -> Lb9
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> Lb7 android.database.sqlite.SQLiteException -> Lb9
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> Lb5 java.lang.Throwable -> Lce
            if (r2 != 0) goto L2c
            com.google.android.gms.measurement.internal.zzfr r8 = r7.zzj()     // Catch: android.database.sqlite.SQLiteException -> Lb5 java.lang.Throwable -> Lce
            com.google.android.gms.measurement.internal.zzft r8 = r8.zzp()     // Catch: android.database.sqlite.SQLiteException -> Lb5 java.lang.Throwable -> Lce
            java.lang.String r2 = "Default event parameters not found"
            r8.zza(r2)     // Catch: android.database.sqlite.SQLiteException -> Lb5 java.lang.Throwable -> Lce
            r1.close()
            return r0
        L2c:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch: android.database.sqlite.SQLiteException -> Lb5 java.lang.Throwable -> Lce
            com.google.android.gms.internal.measurement.zzfi$zze$zza r3 = com.google.android.gms.internal.measurement.zzfi.zze.zze()     // Catch: java.io.IOException -> L9f android.database.sqlite.SQLiteException -> Lb5 java.lang.Throwable -> Lce
            com.google.android.gms.internal.measurement.zzkm r2 = com.google.android.gms.measurement.internal.zzmz.zza(r3, r2)     // Catch: java.io.IOException -> L9f android.database.sqlite.SQLiteException -> Lb5 java.lang.Throwable -> Lce
            com.google.android.gms.internal.measurement.zzfi$zze$zza r2 = (com.google.android.gms.internal.measurement.zzfi.zze.zza) r2     // Catch: java.io.IOException -> L9f android.database.sqlite.SQLiteException -> Lb5 java.lang.Throwable -> Lce
            com.google.android.gms.internal.measurement.zzkj r2 = r2.zzab()     // Catch: java.io.IOException -> L9f android.database.sqlite.SQLiteException -> Lb5 java.lang.Throwable -> Lce
            com.google.android.gms.internal.measurement.zzix r2 = (com.google.android.gms.internal.measurement.zzix) r2     // Catch: java.io.IOException -> L9f android.database.sqlite.SQLiteException -> Lb5 java.lang.Throwable -> Lce
            com.google.android.gms.internal.measurement.zzfi$zze r2 = (com.google.android.gms.internal.measurement.zzfi.zze) r2     // Catch: java.io.IOException -> L9f android.database.sqlite.SQLiteException -> Lb5 java.lang.Throwable -> Lce
            r7.g_()     // Catch: android.database.sqlite.SQLiteException -> Lb5 java.lang.Throwable -> Lce
            java.util.List r8 = r2.zzh()     // Catch: android.database.sqlite.SQLiteException -> Lb5 java.lang.Throwable -> Lce
            android.os.Bundle r2 = new android.os.Bundle     // Catch: android.database.sqlite.SQLiteException -> Lb5 java.lang.Throwable -> Lce
            r2.<init>()     // Catch: android.database.sqlite.SQLiteException -> Lb5 java.lang.Throwable -> Lce
            java.util.Iterator r8 = r8.iterator()     // Catch: android.database.sqlite.SQLiteException -> Lb5 java.lang.Throwable -> Lce
        L53:
            boolean r3 = r8.hasNext()     // Catch: android.database.sqlite.SQLiteException -> Lb5 java.lang.Throwable -> Lce
            if (r3 == 0) goto L9b
            java.lang.Object r3 = r8.next()     // Catch: android.database.sqlite.SQLiteException -> Lb5 java.lang.Throwable -> Lce
            com.google.android.gms.internal.measurement.zzfi$zzg r3 = (com.google.android.gms.internal.measurement.zzfi.zzg) r3     // Catch: android.database.sqlite.SQLiteException -> Lb5 java.lang.Throwable -> Lce
            java.lang.String r4 = r3.zzg()     // Catch: android.database.sqlite.SQLiteException -> Lb5 java.lang.Throwable -> Lce
            boolean r5 = r3.zzj()     // Catch: android.database.sqlite.SQLiteException -> Lb5 java.lang.Throwable -> Lce
            if (r5 == 0) goto L71
            double r5 = r3.zza()     // Catch: android.database.sqlite.SQLiteException -> Lb5 java.lang.Throwable -> Lce
            r2.putDouble(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Lb5 java.lang.Throwable -> Lce
            goto L53
        L71:
            boolean r5 = r3.zzk()     // Catch: android.database.sqlite.SQLiteException -> Lb5 java.lang.Throwable -> Lce
            if (r5 == 0) goto L7f
            float r3 = r3.zzb()     // Catch: android.database.sqlite.SQLiteException -> Lb5 java.lang.Throwable -> Lce
            r2.putFloat(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lb5 java.lang.Throwable -> Lce
            goto L53
        L7f:
            boolean r5 = r3.zzn()     // Catch: android.database.sqlite.SQLiteException -> Lb5 java.lang.Throwable -> Lce
            if (r5 == 0) goto L8d
            java.lang.String r3 = r3.zzh()     // Catch: android.database.sqlite.SQLiteException -> Lb5 java.lang.Throwable -> Lce
            r2.putString(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lb5 java.lang.Throwable -> Lce
            goto L53
        L8d:
            boolean r5 = r3.zzl()     // Catch: android.database.sqlite.SQLiteException -> Lb5 java.lang.Throwable -> Lce
            if (r5 == 0) goto L53
            long r5 = r3.zzd()     // Catch: android.database.sqlite.SQLiteException -> Lb5 java.lang.Throwable -> Lce
            r2.putLong(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Lb5 java.lang.Throwable -> Lce
            goto L53
        L9b:
            r1.close()
            return r2
        L9f:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzfr r3 = r7.zzj()     // Catch: android.database.sqlite.SQLiteException -> Lb5 java.lang.Throwable -> Lce
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzg()     // Catch: android.database.sqlite.SQLiteException -> Lb5 java.lang.Throwable -> Lce
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzfr.zza(r8)     // Catch: android.database.sqlite.SQLiteException -> Lb5 java.lang.Throwable -> Lce
            r3.zza(r4, r8, r2)     // Catch: android.database.sqlite.SQLiteException -> Lb5 java.lang.Throwable -> Lce
            r1.close()
            return r0
        Lb5:
            r8 = move-exception
            goto Lbb
        Lb7:
            r8 = move-exception
            goto Ld0
        Lb9:
            r8 = move-exception
            r1 = r0
        Lbb:
            com.google.android.gms.measurement.internal.zzfr r2 = r7.zzj()     // Catch: java.lang.Throwable -> Lce
            com.google.android.gms.measurement.internal.zzft r2 = r2.zzg()     // Catch: java.lang.Throwable -> Lce
            java.lang.String r3 = "Error selecting default event parameters"
            r2.zza(r3, r8)     // Catch: java.lang.Throwable -> Lce
            if (r1 == 0) goto Lcd
            r1.close()
        Lcd:
            return r0
        Lce:
            r8 = move-exception
            r0 = r1
        Ld0:
            if (r0 == 0) goto Ld5
            r0.close()
        Ld5:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzao.zzc(java.lang.String):android.os.Bundle");
    }

    public final Map<Integer, List<zzew.zzb>> zzf(String str, String str2) {
        zzak();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        kg kgVar = new kg();
        Cursor cursor = null;
        try {
            try {
                Cursor query = e_().query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!query.moveToFirst()) {
                        Map<Integer, List<zzew.zzb>> emptyMap = Collections.emptyMap();
                        query.close();
                        return emptyMap;
                    }
                    do {
                        try {
                            zzew.zzb zzbVar = (zzew.zzb) ((com.google.android.gms.internal.measurement.zzix) ((zzew.zzb.zza) zzmz.zza(zzew.zzb.zzc(), query.getBlob(1))).zzab());
                            int i = query.getInt(0);
                            List list = (List) kgVar.getOrDefault(Integer.valueOf(i), null);
                            if (list == null) {
                                list = new ArrayList();
                                kgVar.put(Integer.valueOf(i), list);
                            }
                            list.add(zzbVar);
                        } catch (IOException e) {
                            zzj().zzg().zza("Failed to merge filter. appId", zzfr.zza(str), e);
                        }
                    } while (query.moveToNext());
                    query.close();
                    return kgVar;
                } catch (SQLiteException e2) {
                    e = e2;
                    cursor = query;
                    zzj().zzg().zza("Database error querying filters. appId", zzfr.zza(str), e);
                    Map<Integer, List<zzew.zzb>> emptyMap2 = Collections.emptyMap();
                    if (cursor != null) {
                        cursor.close();
                    }
                    return emptyMap2;
                } catch (Throwable th) {
                    th = th;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (SQLiteException e3) {
            e = e3;
        }
    }

    public final Map<Integer, List<zzew.zze>> zzg(String str, String str2) {
        zzak();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        kg kgVar = new kg();
        Cursor cursor = null;
        try {
            try {
                Cursor query = e_().query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!query.moveToFirst()) {
                        Map<Integer, List<zzew.zze>> emptyMap = Collections.emptyMap();
                        query.close();
                        return emptyMap;
                    }
                    do {
                        try {
                            zzew.zze zzeVar = (zzew.zze) ((com.google.android.gms.internal.measurement.zzix) ((zzew.zze.zza) zzmz.zza(zzew.zze.zzc(), query.getBlob(1))).zzab());
                            int i = query.getInt(0);
                            List list = (List) kgVar.getOrDefault(Integer.valueOf(i), null);
                            if (list == null) {
                                list = new ArrayList();
                                kgVar.put(Integer.valueOf(i), list);
                            }
                            list.add(zzeVar);
                        } catch (IOException e) {
                            zzj().zzg().zza("Failed to merge filter", zzfr.zza(str), e);
                        }
                    } while (query.moveToNext());
                    query.close();
                    return kgVar;
                } catch (SQLiteException e2) {
                    e = e2;
                    cursor = query;
                    zzj().zzg().zza("Database error querying filters. appId", zzfr.zza(str), e);
                    Map<Integer, List<zzew.zze>> emptyMap2 = Collections.emptyMap();
                    if (cursor != null) {
                        cursor.close();
                    }
                    return emptyMap2;
                } catch (Throwable th) {
                    th = th;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (SQLiteException e3) {
            e = e3;
        }
    }

    public final long zza(String str) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzak();
        try {
            return e_().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, zze().zzb(str, zzbi.zzp))))});
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error deleting over the limit events. appId", zzfr.zza(str), e);
            return 0L;
        }
    }

    public final void zzh(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzak();
        try {
            e_().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error deleting user property. appId", zzfr.zza(str), zzi().zzc(str2), e);
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0097: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:27:0x0097 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzne zze(java.lang.String r14, java.lang.String r15) {
        /*
            r13 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r14)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r15)
            r13.zzt()
            r13.zzak()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r13.e_()     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            java.lang.String r3 = "user_attributes"
            r0 = 3
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            java.lang.String r0 = "set_timestamp"
            r10 = 0
            r4[r10] = r0     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            java.lang.String r0 = "value"
            r11 = 1
            r4[r11] = r0     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            java.lang.String r0 = "origin"
            r12 = 2
            r4[r12] = r0     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            java.lang.String r5 = "app_id=? and name=?"
            java.lang.String[] r6 = new java.lang.String[]{r14, r15}     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            boolean r0 = r2.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L96
            if (r0 != 0) goto L3c
            r2.close()
            return r1
        L3c:
            long r7 = r2.getLong(r10)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L96
            java.lang.Object r9 = r13.zza(r2, r11)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L96
            if (r9 != 0) goto L4a
            r2.close()
            return r1
        L4a:
            java.lang.String r5 = r2.getString(r12)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L96
            com.google.android.gms.measurement.internal.zzne r0 = new com.google.android.gms.measurement.internal.zzne     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L96
            r3 = r0
            r4 = r14
            r6 = r15
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L96
            boolean r3 = r2.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L96
            if (r3 == 0) goto L6d
            com.google.android.gms.measurement.internal.zzfr r3 = r13.zzj()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L96
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzg()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L96
            java.lang.String r4 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzfr.zza(r14)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L96
            r3.zza(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L96
        L6d:
            r2.close()
            return r0
        L71:
            r0 = move-exception
            goto L77
        L73:
            r0 = move-exception
            goto L98
        L75:
            r0 = move-exception
            r2 = r1
        L77:
            com.google.android.gms.measurement.internal.zzfr r3 = r13.zzj()     // Catch: java.lang.Throwable -> L96
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzg()     // Catch: java.lang.Throwable -> L96
            java.lang.String r4 = "Error querying user property. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzfr.zza(r14)     // Catch: java.lang.Throwable -> L96
            com.google.android.gms.measurement.internal.zzfq r6 = r13.zzi()     // Catch: java.lang.Throwable -> L96
            java.lang.String r6 = r6.zzc(r15)     // Catch: java.lang.Throwable -> L96
            r3.zza(r4, r5, r6, r0)     // Catch: java.lang.Throwable -> L96
            if (r2 == 0) goto L95
            r2.close()
        L95:
            return r1
        L96:
            r0 = move-exception
            r1 = r2
        L98:
            if (r1 == 0) goto L9d
            r1.close()
        L9d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzao.zze(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzne");
    }

    public final long zza(zzfi.zzj zzjVar) throws IOException {
        zzt();
        zzak();
        Preconditions.checkNotNull(zzjVar);
        Preconditions.checkNotEmpty(zzjVar.zzx());
        byte[] zzbv = zzjVar.zzbv();
        long zza2 = g_().zza(zzbv);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzjVar.zzx());
        contentValues.put("metadata_fingerprint", Long.valueOf(zza2));
        contentValues.put("metadata", zzbv);
        try {
            e_().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return zza2;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing raw event metadata. appId", zzfr.zza(zzjVar.zzx()), e);
            throw e;
        }
    }

    public final long zzb(String str) {
        Preconditions.checkNotEmpty(str);
        return zza("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzad zzc(java.lang.String r36, java.lang.String r37) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzao.zzc(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzad");
    }

    private final long zzb(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = e_().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j = rawQuery.getLong(0);
                    rawQuery.close();
                    return j;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e) {
                zzj().zzg().zza("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final long zza(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            try {
                cursor = e_().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    long j2 = cursor.getLong(0);
                    cursor.close();
                    return j2;
                }
                cursor.close();
                return j;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a1, code lost:            zzj().zzg().zza("Read more than the max allowed user properties, ignoring excess", 1000);     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zzne> zzb(java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzao.zzb(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x008b: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:29:0x008b */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair<com.google.android.gms.internal.measurement.zzfi.zze, java.lang.Long> zza(java.lang.String r8, java.lang.Long r9) {
        /*
            r7 = this;
            r7.zzt()
            r7.zzak()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.e_()     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            r4 = 0
            r3[r4] = r8     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            r6 = 1
            r3[r6] = r5     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            if (r2 != 0) goto L35
            com.google.android.gms.measurement.internal.zzfr r8 = r7.zzj()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.measurement.internal.zzft r8 = r8.zzp()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            java.lang.String r9 = "Main event not found"
            r8.zza(r9)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            r1.close()
            return r0
        L35:
            byte[] r2 = r1.getBlob(r4)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            long r3 = r1.getLong(r6)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.internal.measurement.zzfi$zze$zza r4 = com.google.android.gms.internal.measurement.zzfi.zze.zze()     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.internal.measurement.zzkm r2 = com.google.android.gms.measurement.internal.zzmz.zza(r4, r2)     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.internal.measurement.zzfi$zze$zza r2 = (com.google.android.gms.internal.measurement.zzfi.zze.zza) r2     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.internal.measurement.zzkj r2 = r2.zzab()     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.internal.measurement.zzix r2 = (com.google.android.gms.internal.measurement.zzix) r2     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.internal.measurement.zzfi$zze r2 = (com.google.android.gms.internal.measurement.zzfi.zze) r2     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            android.util.Pair r8 = android.util.Pair.create(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            r1.close()
            return r8
        L5b:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzfr r3 = r7.zzj()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzg()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzfr.zza(r8)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            r3.zza(r4, r8, r9, r2)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            r1.close()
            return r0
        L71:
            r8 = move-exception
            goto L77
        L73:
            r8 = move-exception
            goto L8c
        L75:
            r8 = move-exception
            r1 = r0
        L77:
            com.google.android.gms.measurement.internal.zzfr r9 = r7.zzj()     // Catch: java.lang.Throwable -> L8a
            com.google.android.gms.measurement.internal.zzft r9 = r9.zzg()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = "Error selecting main event"
            r9.zza(r2, r8)     // Catch: java.lang.Throwable -> L8a
            if (r1 == 0) goto L89
            r1.close()
        L89:
            return r0
        L8a:
            r8 = move-exception
            r0 = r1
        L8c:
            if (r0 == 0) goto L91
            r0.close()
        L91:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzao.zza(java.lang.String, java.lang.Long):android.util.Pair");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzbc zzd(java.lang.String r29, java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzao.zzd(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzbc");
    }

    public final zzap zza(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return zza(j, str, 1L, false, false, z3, false, z5);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzap zza(long r23, java.lang.String r25, long r26, boolean r28, boolean r29, boolean r30, boolean r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzao.zza(long, java.lang.String, long, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.measurement.internal.zzap");
    }

    private final boolean zzb(String str, List<Integer> list) {
        Preconditions.checkNotEmpty(str);
        zzak();
        zzt();
        SQLiteDatabase e_ = e_();
        try {
            long zzb2 = zzb("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, zze().zzb(str, zzbi.zzaf)));
            if (zzb2 <= max) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                Integer num = list.get(i);
                if (num == null) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            return e_.delete("audience_filter_values", hx2.q("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ", hx2.q("(", TextUtils.join(",", arrayList), ")"), " order by rowid desc limit -1 offset ?)"), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Database error querying filters. appId", zzfr.zza(str), e);
            return false;
        }
    }

    private final Object zza(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            zzj().zzg().zza("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i));
        }
        if (type == 3) {
            return cursor.getString(i);
        }
        if (type != 4) {
            zzj().zzg().zza("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        zzj().zzg().zza("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final <T> T zza(java.lang.String r3, java.lang.String[] r4, com.google.android.gms.measurement.internal.zzar<T> r5) {
        /*
            r2 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r2.e_()     // Catch: java.lang.Throwable -> L2a android.database.sqlite.SQLiteException -> L2c
            android.database.Cursor r3 = r1.rawQuery(r3, r4)     // Catch: java.lang.Throwable -> L2a android.database.sqlite.SQLiteException -> L2c
            boolean r4 = r3.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L28 java.lang.Throwable -> L41
            if (r4 != 0) goto L20
            com.google.android.gms.measurement.internal.zzfr r4 = r2.zzj()     // Catch: android.database.sqlite.SQLiteException -> L28 java.lang.Throwable -> L41
            com.google.android.gms.measurement.internal.zzft r4 = r4.zzp()     // Catch: android.database.sqlite.SQLiteException -> L28 java.lang.Throwable -> L41
            java.lang.String r5 = "No data found"
            r4.zza(r5)     // Catch: android.database.sqlite.SQLiteException -> L28 java.lang.Throwable -> L41
            r3.close()
            return r0
        L20:
            java.lang.Object r4 = r5.zza(r3)     // Catch: android.database.sqlite.SQLiteException -> L28 java.lang.Throwable -> L41
            r3.close()
            return r4
        L28:
            r4 = move-exception
            goto L2e
        L2a:
            r4 = move-exception
            goto L43
        L2c:
            r4 = move-exception
            r3 = r0
        L2e:
            com.google.android.gms.measurement.internal.zzfr r5 = r2.zzj()     // Catch: java.lang.Throwable -> L41
            com.google.android.gms.measurement.internal.zzft r5 = r5.zzg()     // Catch: java.lang.Throwable -> L41
            java.lang.String r1 = "Error querying database."
            r5.zza(r1, r4)     // Catch: java.lang.Throwable -> L41
            if (r3 == 0) goto L40
            r3.close()
        L40:
            return r0
        L41:
            r4 = move-exception
            r0 = r3
        L43:
            if (r0 == 0) goto L48
            r0.close()
        L48:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzao.zza(java.lang.String, java.lang.String[], com.google.android.gms.measurement.internal.zzar):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String zza(long r5) {
        /*
            r4 = this;
            r4.zzt()
            r4.zzak()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.e_()     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            r6 = 0
            r3[r6] = r5     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            boolean r1 = r5.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            if (r1 != 0) goto L32
            com.google.android.gms.measurement.internal.zzfr r6 = r4.zzj()     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            com.google.android.gms.measurement.internal.zzft r6 = r6.zzp()     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.zza(r1)     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            r5.close()
            return r0
        L32:
            java.lang.String r6 = r5.getString(r6)     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            r5.close()
            return r6
        L3a:
            r6 = move-exception
            goto L40
        L3c:
            r6 = move-exception
            goto L55
        L3e:
            r6 = move-exception
            r5 = r0
        L40:
            com.google.android.gms.measurement.internal.zzfr r1 = r4.zzj()     // Catch: java.lang.Throwable -> L53
            com.google.android.gms.measurement.internal.zzft r1 = r1.zzg()     // Catch: java.lang.Throwable -> L53
            java.lang.String r2 = "Error selecting expired configs"
            r1.zza(r2, r6)     // Catch: java.lang.Throwable -> L53
            if (r5 == 0) goto L52
            r5.close()
        L52:
            return r0
        L53:
            r6 = move-exception
            r0 = r5
        L55:
            if (r0 == 0) goto L5a
            r0.close()
        L5a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzao.zza(long):java.lang.String");
    }

    private final String zza(String str, String[] strArr, String str2) {
        Cursor cursor = null;
        try {
            try {
                cursor = e_().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    String string = cursor.getString(0);
                    cursor.close();
                    return string;
                }
                cursor.close();
                return str2;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0186 A[EDGE_INSN: B:63:0x0186->B:25:0x0186 BREAK  A[LOOP:0: B:16:0x005a->B:76:0x0183], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<android.util.Pair<com.google.android.gms.internal.measurement.zzfi.zzj, java.lang.Long>> zza(java.lang.String r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzao.zza(java.lang.String, int, int):java.util.List");
    }

    public final List<zzad> zza(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzak();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + "*");
            sb.append(" and name glob ?");
        }
        return zza(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008c, code lost:            zzj().zzg().zza("Read more than the max allowed conditional properties, ignoring extra", 1000);     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zzad> zza(java.lang.String r40, java.lang.String[] r41) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzao.zza(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final void zza(List<Long> list) {
        zzt();
        zzak();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (zzan()) {
            String q = hx2.q("(", TextUtils.join(",", list), ")");
            if (zzb(hx2.q("SELECT COUNT(1) FROM queue WHERE rowid IN ", q, " AND retry_count =  2147483647 LIMIT 1"), (String[]) null) > 0) {
                zzj().zzu().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                e_().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + q + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error incrementing retry count. error", e);
            }
        }
    }

    private static void zza(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else {
            if (obj instanceof Double) {
                contentValues.put(str, (Double) obj);
                return;
            }
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    public final void zza(String str, List<zzew.zza> list) {
        boolean z;
        boolean z2;
        Preconditions.checkNotNull(list);
        for (int i = 0; i < list.size(); i++) {
            zzew.zza.C0002zza zzby = list.get(i).zzby();
            if (zzby.zza() != 0) {
                for (int i2 = 0; i2 < zzby.zza(); i2++) {
                    zzew.zzb.zza zzby2 = zzby.zza(i2).zzby();
                    zzew.zzb.zza zzaVar = (zzew.zzb.zza) ((zzix.zzb) zzby2.clone());
                    String zzb2 = zzii.zzb(zzby2.zzb());
                    if (zzb2 != null) {
                        zzaVar.zza(zzb2);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    for (int i3 = 0; i3 < zzby2.zza(); i3++) {
                        zzew.zzc zza2 = zzby2.zza(i3);
                        String zza3 = zzik.zza(zza2.zze());
                        if (zza3 != null) {
                            zzaVar.zza(i3, (zzew.zzc) ((com.google.android.gms.internal.measurement.zzix) zza2.zzby().zza(zza3).zzab()));
                            z2 = true;
                        }
                    }
                    if (z2) {
                        zzby = zzby.zza(i2, zzaVar);
                        list.set(i, (zzew.zza) ((com.google.android.gms.internal.measurement.zzix) zzby.zzab()));
                    }
                }
            }
            if (zzby.zzb() != 0) {
                for (int i4 = 0; i4 < zzby.zzb(); i4++) {
                    zzew.zze zzb3 = zzby.zzb(i4);
                    String zza4 = zzij.zza(zzb3.zze());
                    if (zza4 != null) {
                        zzby = zzby.zza(i4, zzb3.zzby().zza(zza4));
                        list.set(i, (zzew.zza) ((com.google.android.gms.internal.measurement.zzix) zzby.zzab()));
                    }
                }
            }
        }
        zzak();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        SQLiteDatabase e_ = e_();
        e_.beginTransaction();
        try {
            zzak();
            zzt();
            Preconditions.checkNotEmpty(str);
            SQLiteDatabase e_2 = e_();
            e_2.delete("property_filters", "app_id=?", new String[]{str});
            e_2.delete("event_filters", "app_id=?", new String[]{str});
            for (zzew.zza zzaVar2 : list) {
                zzak();
                zzt();
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotNull(zzaVar2);
                if (!zzaVar2.zzg()) {
                    zzj().zzu().zza("Audience with no ID. appId", zzfr.zza(str));
                } else {
                    int zza5 = zzaVar2.zza();
                    Iterator<zzew.zzb> it = zzaVar2.zze().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!it.next().zzl()) {
                                zzj().zzu().zza("Event filter with no ID. Audience definition ignored. appId, audienceId", zzfr.zza(str), Integer.valueOf(zza5));
                                break;
                            }
                        } else {
                            Iterator<zzew.zze> it2 = zzaVar2.zzf().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (!it2.next().zzi()) {
                                        zzj().zzu().zza("Property filter with no ID. Audience definition ignored. appId, audienceId", zzfr.zza(str), Integer.valueOf(zza5));
                                        break;
                                    }
                                } else {
                                    Iterator<zzew.zzb> it3 = zzaVar2.zze().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (!zza(str, zza5, it3.next())) {
                                                z = false;
                                                break;
                                            }
                                        } else {
                                            z = true;
                                            break;
                                        }
                                    }
                                    if (z) {
                                        Iterator<zzew.zze> it4 = zzaVar2.zzf().iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                if (!zza(str, zza5, it4.next())) {
                                                    z = false;
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                    if (!z) {
                                        zzak();
                                        zzt();
                                        Preconditions.checkNotEmpty(str);
                                        SQLiteDatabase e_3 = e_();
                                        e_3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(zza5)});
                                        e_3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(zza5)});
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (zzew.zza zzaVar3 : list) {
                arrayList.add(zzaVar3.zzg() ? Integer.valueOf(zzaVar3.zza()) : null);
            }
            zzb(str, arrayList);
            e_.setTransactionSuccessful();
        } finally {
            e_.endTransaction();
        }
    }

    public final void zza(zzh zzhVar) {
        Preconditions.checkNotNull(zzhVar);
        zzt();
        zzak();
        String zzx = zzhVar.zzx();
        Preconditions.checkNotNull(zzx);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzx);
        contentValues.put("app_instance_id", zzhVar.zzy());
        contentValues.put("gmp_app_id", zzhVar.zzac());
        contentValues.put("resettable_device_id_hash", zzhVar.zzae());
        contentValues.put("last_bundle_index", Long.valueOf(zzhVar.zzq()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(zzhVar.zzr()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(zzhVar.zzp()));
        contentValues.put("app_version", zzhVar.zzaa());
        contentValues.put("app_store", zzhVar.zzz());
        contentValues.put("gmp_version", Long.valueOf(zzhVar.zzo()));
        contentValues.put("dev_cert_hash", Long.valueOf(zzhVar.zzl()));
        contentValues.put("measurement_enabled", Boolean.valueOf(zzhVar.zzak()));
        contentValues.put("day", Long.valueOf(zzhVar.zzk()));
        contentValues.put("daily_public_events_count", Long.valueOf(zzhVar.zzi()));
        contentValues.put("daily_events_count", Long.valueOf(zzhVar.zzh()));
        contentValues.put("daily_conversions_count", Long.valueOf(zzhVar.zzf()));
        contentValues.put("config_fetched_time", Long.valueOf(zzhVar.zze()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(zzhVar.zzn()));
        contentValues.put("app_version_int", Long.valueOf(zzhVar.zzc()));
        contentValues.put("firebase_instance_id", zzhVar.zzab());
        contentValues.put("daily_error_events_count", Long.valueOf(zzhVar.zzg()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(zzhVar.zzj()));
        contentValues.put("health_monitor_sample", zzhVar.zzad());
        contentValues.put("android_id", Long.valueOf(zzhVar.zzb()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(zzhVar.zzaj()));
        contentValues.put("admob_app_id", zzhVar.zzv());
        contentValues.put("dynamite_version", Long.valueOf(zzhVar.zzm()));
        contentValues.put("session_stitching_token", zzhVar.zzaf());
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(zzhVar.zzam()));
        contentValues.put("target_os_version", Long.valueOf(zzhVar.zzt()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(zzhVar.zzs()));
        if (zzpg.zza() && zze().zze(zzx, zzbi.zzcf)) {
            contentValues.put("ad_services_version", Integer.valueOf(zzhVar.zza()));
            contentValues.put("attribution_eligibility_status", Long.valueOf(zzhVar.zzd()));
        }
        if (zznk.zza() && zze().zze(zzx, zzbi.zzcr)) {
            contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(zzhVar.zzan()));
        }
        List<String> zzag = zzhVar.zzag();
        if (zzag != null) {
            if (zzag.isEmpty()) {
                zzj().zzu().zza("Safelisted events should not be an empty list. appId", zzx);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", zzag));
            }
        }
        if (zznq.zza() && zze().zza(zzbi.zzbp) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        if (zznp.zza() && zze().zze(zzx, zzbi.zzcm)) {
            contentValues.put("npa_metadata_value", zzhVar.zzu());
        }
        try {
            SQLiteDatabase e_ = e_();
            if (e_.update("apps", contentValues, "app_id = ?", new String[]{zzx}) == 0 && e_.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                zzj().zzg().zza("Failed to insert/update app (got -1). appId", zzfr.zza(zzx));
            }
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing app. appId", zzfr.zza(zzx), e);
        }
    }

    public final void zza(String str, zzih zzihVar) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzihVar);
        zzt();
        zzak();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", zzihVar.zze());
        if (zznp.zza() && zze().zza(zzbi.zzcm)) {
            contentValues.put("consent_source", Integer.valueOf(zzihVar.zza()));
            zza("consent_settings", "app_id", contentValues);
            return;
        }
        try {
            if (e_().insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                zzj().zzg().zza("Failed to insert/update consent setting (got -1). appId", zzfr.zza(str));
            }
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing consent setting. appId, error", zzfr.zza(str), e);
        }
    }

    public final void zza(String str, zzay zzayVar) {
        if (zznp.zza() && zze().zza(zzbi.zzcm)) {
            Preconditions.checkNotNull(str);
            Preconditions.checkNotNull(zzayVar);
            zzt();
            zzak();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("dma_consent_settings", zzayVar.zzf());
            zza("consent_settings", "app_id", contentValues);
        }
    }

    public final void zza(zzbc zzbcVar) {
        Preconditions.checkNotNull(zzbcVar);
        zzt();
        zzak();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzbcVar.zza);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzbcVar.zzb);
        contentValues.put("lifetime_count", Long.valueOf(zzbcVar.zzc));
        contentValues.put("current_bundle_count", Long.valueOf(zzbcVar.zzd));
        contentValues.put("last_fire_timestamp", Long.valueOf(zzbcVar.zzf));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zzbcVar.zzg));
        contentValues.put("last_bundled_day", zzbcVar.zzh);
        contentValues.put("last_sampled_complex_event_id", zzbcVar.zzi);
        contentValues.put("last_sampling_rate", zzbcVar.zzj);
        contentValues.put("current_session_count", Long.valueOf(zzbcVar.zze));
        Boolean bool = zzbcVar.zzk;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (e_().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                zzj().zzg().zza("Failed to insert/update event aggregates (got -1). appId", zzfr.zza(zzbcVar.zza));
            }
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing event aggregates. appId", zzfr.zza(zzbcVar.zza), e);
        }
    }

    private final void zza(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase e_ = e_();
            if (contentValues.getAsString(str2) == null) {
                zzj().zzh().zza("Value of the primary key is not set.", zzfr.zza(str2));
                return;
            }
            if (e_.update(str, contentValues, str2 + " = ?", new String[]{r1}) == 0 && e_.insertWithOnConflict(str, null, contentValues, 5) == -1) {
                zzj().zzg().zza("Failed to insert/update table (got -1). key", zzfr.zza(str), zzfr.zza(str2));
            }
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing into table. key", zzfr.zza(str), zzfr.zza(str2), e);
        }
    }

    public final boolean zza(zzfi.zzj zzjVar, boolean z) {
        zzt();
        zzak();
        Preconditions.checkNotNull(zzjVar);
        Preconditions.checkNotEmpty(zzjVar.zzx());
        Preconditions.checkState(zzjVar.zzbe());
        zzv();
        long currentTimeMillis = zzb().currentTimeMillis();
        if (zzjVar.zzl() < currentTimeMillis - zzaf.zzm() || zzjVar.zzl() > zzaf.zzm() + currentTimeMillis) {
            zzj().zzu().zza("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzfr.zza(zzjVar.zzx()), Long.valueOf(currentTimeMillis), Long.valueOf(zzjVar.zzl()));
        }
        try {
            byte[] zzb2 = g_().zzb(zzjVar.zzbv());
            zzj().zzp().zza("Saving bundle, size", Integer.valueOf(zzb2.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzjVar.zzx());
            contentValues.put("bundle_end_timestamp", Long.valueOf(zzjVar.zzl()));
            contentValues.put("data", zzb2);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (zzjVar.zzbl()) {
                contentValues.put("retry_count", Integer.valueOf(zzjVar.zzf()));
            }
            try {
                if (e_().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                zzj().zzg().zza("Failed to insert bundle (got -1). appId", zzfr.zza(zzjVar.zzx()));
                return false;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error storing bundle. appId", zzfr.zza(zzjVar.zzx()), e);
                return false;
            }
        } catch (IOException e2) {
            zzj().zzg().zza("Data loss. Failed to serialize bundle. appId", zzfr.zza(zzjVar.zzx()), e2);
            return false;
        }
    }

    private final boolean zza(String str, int i, zzew.zzb zzbVar) {
        zzak();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzbVar);
        if (zzbVar.zzf().isEmpty()) {
            zzj().zzu().zza("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", zzfr.zza(str), Integer.valueOf(i), String.valueOf(zzbVar.zzl() ? Integer.valueOf(zzbVar.zzb()) : null));
            return false;
        }
        byte[] zzbv = zzbVar.zzbv();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", zzbVar.zzl() ? Integer.valueOf(zzbVar.zzb()) : null);
        contentValues.put("event_name", zzbVar.zzf());
        contentValues.put("session_scoped", zzbVar.zzm() ? Boolean.valueOf(zzbVar.zzj()) : null);
        contentValues.put("data", zzbv);
        try {
            if (e_().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert event filter (got -1). appId", zzfr.zza(str));
            return true;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing event filter. appId", zzfr.zza(str), e);
            return false;
        }
    }

    private final boolean zza(String str, int i, zzew.zze zzeVar) {
        zzak();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzeVar);
        if (zzeVar.zze().isEmpty()) {
            zzj().zzu().zza("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", zzfr.zza(str), Integer.valueOf(i), String.valueOf(zzeVar.zzi() ? Integer.valueOf(zzeVar.zza()) : null));
            return false;
        }
        byte[] zzbv = zzeVar.zzbv();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", zzeVar.zzi() ? Integer.valueOf(zzeVar.zza()) : null);
        contentValues.put("property_name", zzeVar.zze());
        contentValues.put("session_scoped", zzeVar.zzj() ? Boolean.valueOf(zzeVar.zzh()) : null);
        contentValues.put("data", zzbv);
        try {
            if (e_().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert property filter (got -1). appId", zzfr.zza(str));
            return false;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing property filter. appId", zzfr.zza(str), e);
            return false;
        }
    }

    public final boolean zza(zzaz zzazVar, long j, boolean z) {
        zzt();
        zzak();
        Preconditions.checkNotNull(zzazVar);
        Preconditions.checkNotEmpty(zzazVar.zza);
        byte[] zzbv = g_().zza(zzazVar).zzbv();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzazVar.zza);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzazVar.zzb);
        contentValues.put("timestamp", Long.valueOf(zzazVar.zzc));
        contentValues.put("metadata_fingerprint", Long.valueOf(j));
        contentValues.put("data", zzbv);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (e_().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert raw event (got -1). appId", zzfr.zza(zzazVar.zza));
            return false;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing raw event. appId", zzfr.zza(zzazVar.zza), e);
            return false;
        }
    }

    public final boolean zza(String str, zzmh zzmhVar) {
        zzt();
        zzak();
        Preconditions.checkNotNull(zzmhVar);
        Preconditions.checkNotEmpty(str);
        long currentTimeMillis = zzb().currentTimeMillis();
        if (zzmhVar.zzb < currentTimeMillis - zzaf.zzm() || zzmhVar.zzb > zzaf.zzm() + currentTimeMillis) {
            zzj().zzu().zza("Storing trigger URI outside of the max retention time span. appId, now, timestamp", zzfr.zza(str), Long.valueOf(currentTimeMillis), Long.valueOf(zzmhVar.zzb));
        }
        zzj().zzp().zza("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", zzmhVar.zza);
        contentValues.put("source", Integer.valueOf(zzmhVar.zzc));
        contentValues.put("timestamp_millis", Long.valueOf(zzmhVar.zzb));
        try {
            if (e_().insert("trigger_uris", null, contentValues) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert trigger URI (got -1). appId", zzfr.zza(str));
            return false;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing trigger URI. appId", zzfr.zza(str), e);
            return false;
        }
    }

    public final boolean zza(String str, Long l, long j, zzfi.zze zzeVar) {
        zzt();
        zzak();
        Preconditions.checkNotNull(zzeVar);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l);
        byte[] zzbv = zzeVar.zzbv();
        zzj().zzp().zza("Saving complex main event, appId, data size", zzi().zza(str), Integer.valueOf(zzbv.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", zzbv);
        try {
            if (e_().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert complex main event (got -1). appId", zzfr.zza(str));
            return false;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing complex main event. appId", zzfr.zza(str), e);
            return false;
        }
    }

    public final boolean zza(zzad zzadVar) {
        Preconditions.checkNotNull(zzadVar);
        zzt();
        zzak();
        String str = zzadVar.zza;
        Preconditions.checkNotNull(str);
        if (zze(str, zzadVar.zzc.zza) == null && zzb("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzadVar.zzb);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzadVar.zzc.zza);
        zza(contentValues, AppMeasurementSdk.ConditionalUserProperty.VALUE, Preconditions.checkNotNull(zzadVar.zzc.zza()));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.valueOf(zzadVar.zze));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzadVar.zzf);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.valueOf(zzadVar.zzh));
        zzq();
        contentValues.put("timed_out_event", zznd.zza((Parcelable) zzadVar.zzg));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzadVar.zzd));
        zzq();
        contentValues.put("triggered_event", zznd.zza((Parcelable) zzadVar.zzi));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.valueOf(zzadVar.zzc.zzb));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.valueOf(zzadVar.zzj));
        zzq();
        contentValues.put("expired_event", zznd.zza((Parcelable) zzadVar.zzk));
        try {
            if (e_().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert/update conditional user property (got -1)", zzfr.zza(str));
            return true;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing conditional user property", zzfr.zza(str), e);
            return true;
        }
    }

    public final boolean zza(String str, Bundle bundle) {
        zzt();
        zzak();
        byte[] zzbv = g_().zza(new zzaz(this.zzu, "", str, "dep", 0L, 0L, bundle)).zzbv();
        zzj().zzp().zza("Saving default event parameters, appId, data size", zzi().zza(str), Integer.valueOf(zzbv.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", zzbv);
        try {
            if (e_().insertWithOnConflict("default_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert default event parameters (got -1). appId", zzfr.zza(str));
            return false;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing default event parameters. appId", zzfr.zza(str), e);
            return false;
        }
    }

    public final boolean zza(zzne zzneVar) {
        Preconditions.checkNotNull(zzneVar);
        zzt();
        zzak();
        if (zze(zzneVar.zza, zzneVar.zzc) == null) {
            if (zznd.zzh(zzneVar.zzc)) {
                if (zzb("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{zzneVar.zza}) >= zze().zza(zzneVar.zza, zzbi.zzag, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(zzneVar.zzc) && zzb("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{zzneVar.zza, zzneVar.zzb}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzneVar.zza);
        contentValues.put("origin", zzneVar.zzb);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzneVar.zzc);
        contentValues.put("set_timestamp", Long.valueOf(zzneVar.zzd));
        zza(contentValues, AppMeasurementSdk.ConditionalUserProperty.VALUE, zzneVar.zze);
        try {
            if (e_().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert/update user property (got -1). appId", zzfr.zza(zzneVar.zza));
            return true;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing user property. appId", zzfr.zza(zzneVar.zza), e);
            return true;
        }
    }
}
