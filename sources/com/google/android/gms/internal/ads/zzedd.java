package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzedd {
    private final zzaxv zza;
    private final Context zzb;
    private final zzech zzc;
    private final zzcaz zzd;
    private final String zze;
    private final zzfib zzf;
    private final com.google.android.gms.ads.internal.util.zzg zzg = com.google.android.gms.ads.internal.zzt.zzo().zzh();

    public zzedd(Context context, zzcaz zzcazVar, zzaxv zzaxvVar, zzech zzechVar, String str, zzfib zzfibVar) {
        this.zzb = context;
        this.zzd = zzcazVar;
        this.zza = zzaxvVar;
        this.zzc = zzechVar;
        this.zze = str;
        this.zzf = zzfibVar;
    }

    private static final void zzc(SQLiteDatabase sQLiteDatabase, ArrayList arrayList) {
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            zzbae zzbaeVar = (zzbae) arrayList.get(i);
            if (zzbaeVar.zzw() == 2 && zzbaeVar.zze() > j) {
                j = zzbaeVar.zze();
            }
        }
        if (j != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, Long.valueOf(j));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
    }

    public final /* synthetic */ Void zza(boolean z, SQLiteDatabase sQLiteDatabase) throws Exception {
        String str;
        String str2;
        String str3;
        if (z) {
            this.zzb.deleteDatabase("OfflineUpload.db");
            return null;
        }
        int i = 2;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzir)).booleanValue()) {
            zzfia zzb = zzfia.zzb("oa_upload");
            zzb.zza("oa_failed_reqs", String.valueOf(zzecw.zza(sQLiteDatabase, 0)));
            zzb.zza("oa_total_reqs", String.valueOf(zzecw.zza(sQLiteDatabase, 1)));
            zzb.zza("oa_upload_time", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
            zzb.zza("oa_last_successful_time", String.valueOf(zzecw.zzb(sQLiteDatabase, 2)));
            if (this.zzg.zzQ()) {
                str = "";
            } else {
                str = this.zze;
            }
            zzb.zza("oa_session_id", str);
            this.zzf.zzb(zzb);
            ArrayList zzc = zzecw.zzc(sQLiteDatabase);
            zzc(sQLiteDatabase, zzc);
            int size = zzc.size();
            for (int i2 = 0; i2 < size; i2++) {
                zzbae zzbaeVar = (zzbae) zzc.get(i2);
                com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzg;
                zzfia zzb2 = zzfia.zzb("oa_signals");
                if (zzgVar.zzQ()) {
                    str2 = "";
                } else {
                    str2 = this.zze;
                }
                zzb2.zza("oa_session_id", str2);
                zzazz zzf = zzbaeVar.zzf();
                if (zzf.zzf()) {
                    str3 = String.valueOf(zzf.zzh() - 1);
                } else {
                    str3 = "-1";
                }
                String obj = zzfwg.zzb(zzbaeVar.zzk(), new zzfsk() { // from class: com.google.android.gms.internal.ads.zzedc
                    @Override // com.google.android.gms.internal.ads.zzfsk
                    public final Object apply(Object obj2) {
                        return ((zzayt) obj2).name();
                    }
                }).toString();
                zzb2.zza("oa_sig_ts", String.valueOf(zzbaeVar.zze()));
                zzb2.zza("oa_sig_status", String.valueOf(zzbaeVar.zzw() - 1));
                zzb2.zza("oa_sig_resp_lat", String.valueOf(zzbaeVar.zzd()));
                zzb2.zza("oa_sig_render_lat", String.valueOf(zzbaeVar.zzc()));
                zzb2.zza("oa_sig_formats", obj);
                zzb2.zza("oa_sig_nw_type", str3);
                zzb2.zza("oa_sig_wifi", String.valueOf(zzbaeVar.zzx() - 1));
                zzb2.zza("oa_sig_airplane", String.valueOf(zzbaeVar.zzt() - 1));
                zzb2.zza("oa_sig_data", String.valueOf(zzbaeVar.zzu() - 1));
                zzb2.zza("oa_sig_nw_resp", String.valueOf(zzbaeVar.zza()));
                zzb2.zza("oa_sig_offline", String.valueOf(zzbaeVar.zzv() - 1));
                zzb2.zza("oa_sig_nw_state", String.valueOf(zzbaeVar.zzj().zza()));
                if (zzf.zze() && zzf.zzf() && zzf.zzh() == 2) {
                    zzb2.zza("oa_sig_cell_type", String.valueOf(zzf.zzg() - 1));
                }
                this.zzf.zzb(zzb2);
            }
        } else {
            ArrayList zzc2 = zzecw.zzc(sQLiteDatabase);
            Context context = this.zzb;
            zzbaf zza = zzbaj.zza();
            zza.zzb(context.getPackageName());
            zza.zzd(Build.MODEL);
            zza.zze(zzecw.zza(sQLiteDatabase, 0));
            zza.zza(zzc2);
            zza.zzg(zzecw.zza(sQLiteDatabase, 1));
            zza.zzc(zzecw.zza(sQLiteDatabase, 3));
            zza.zzh(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis());
            zza.zzf(zzecw.zzb(sQLiteDatabase, 2));
            final zzbaj zzbajVar = (zzbaj) zza.zzal();
            zzc(sQLiteDatabase, zzc2);
            this.zza.zzb(new zzaxu() { // from class: com.google.android.gms.internal.ads.zzeda
                @Override // com.google.android.gms.internal.ads.zzaxu
                public final void zza(zzazk zzazkVar) {
                    zzazkVar.zzi(zzbaj.this);
                }
            });
            zzcaz zzcazVar = this.zzd;
            zzbau zza2 = zzbav.zza();
            zza2.zza(zzcazVar.zzb);
            zza2.zzc(this.zzd.zzc);
            if (true == this.zzd.zzd) {
                i = 0;
            }
            zza2.zzb(i);
            final zzbav zzbavVar = (zzbav) zza2.zzal();
            this.zza.zzb(new zzaxu() { // from class: com.google.android.gms.internal.ads.zzedb
                @Override // com.google.android.gms.internal.ads.zzaxu
                public final void zza(zzazk zzazkVar) {
                    zzazc zzazcVar = (zzazc) zzazkVar.zzb().zzaB();
                    zzazcVar.zzb(zzbav.this);
                    zzazkVar.zzg(zzazcVar);
                }
            });
            this.zza.zzc(10004);
        }
        zzecw.zzf(sQLiteDatabase);
        return null;
    }

    public final void zzb(final boolean z) {
        try {
            this.zzc.zza(new zzfgu() { // from class: com.google.android.gms.internal.ads.zzecz
                @Override // com.google.android.gms.internal.ads.zzfgu
                public final Object zza(Object obj) {
                    zzedd.this.zza(z, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e) {
            zzcat.zzg("Error in offline signals database startup: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
