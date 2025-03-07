package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zznw;
import com.google.android.gms.measurement.internal.zzih;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgd extends zzic {
    static final Pair<String, Long> zza = new Pair<>("", 0L);
    public zzgh zzb;
    public final zzgi zzc;
    public final zzgi zzd;
    public final zzgj zze;
    public final zzgi zzf;
    public final zzgg zzg;
    public final zzgj zzh;
    public final zzgf zzi;
    public final zzgg zzj;
    public final zzgi zzk;
    public final zzgi zzl;
    public boolean zzm;
    public zzgg zzn;
    public zzgg zzo;
    public zzgi zzp;
    public final zzgj zzq;
    public final zzgj zzr;
    public final zzgi zzs;
    public final zzgf zzt;
    private SharedPreferences zzv;
    private String zzw;
    private boolean zzx;
    private long zzy;

    public zzgd(zzhf zzhfVar) {
        super(zzhfVar);
        this.zzf = new zzgi(this, "session_timeout", 1800000L);
        this.zzg = new zzgg(this, "start_new_session", true);
        this.zzk = new zzgi(this, "last_pause_time", 0L);
        this.zzl = new zzgi(this, "session_id", 0L);
        this.zzh = new zzgj(this, "non_personalized_ads", null);
        this.zzi = new zzgf(this, "last_received_uri_timestamps_by_source", null);
        this.zzj = new zzgg(this, "allow_remote_dynamite", false);
        this.zzc = new zzgi(this, "first_open_time", 0L);
        this.zzd = new zzgi(this, "app_install_time", 0L);
        this.zze = new zzgj(this, "app_instance_id", null);
        this.zzn = new zzgg(this, "app_backgrounded", false);
        this.zzo = new zzgg(this, "deep_link_retrieval_complete", false);
        this.zzp = new zzgi(this, "deep_link_retrieval_attempts", 0L);
        this.zzq = new zzgj(this, "firebase_feature_rollouts", null);
        this.zzr = new zzgj(this, "deferred_attribution_cache", null);
        this.zzs = new zzgi(this, "deferred_attribution_cache_timestamp", 0L);
        this.zzt = new zzgf(this, "default_event_parameters", null);
    }

    public final Pair<String, Boolean> zza(String str) {
        zzt();
        if (zznw.zza() && zze().zza(zzbi.zzck) && !zzm().zza(zzih.zza.AD_STORAGE)) {
            return new Pair<>("", Boolean.FALSE);
        }
        long elapsedRealtime = zzb().elapsedRealtime();
        if (this.zzw != null && elapsedRealtime < this.zzy) {
            return new Pair<>(this.zzw, Boolean.valueOf(this.zzx));
        }
        this.zzy = zze().zzf(str) + elapsedRealtime;
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(zza());
            this.zzw = "";
            String id = advertisingIdInfo.getId();
            if (id != null) {
                this.zzw = id;
            }
            this.zzx = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e) {
            zzj().zzc().zza("Unable to get advertising id", e);
            this.zzw = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(this.zzw, Boolean.valueOf(this.zzx));
    }

    public final boolean zzaa() {
        SharedPreferences sharedPreferences = this.zzv;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    public final void zzb(String str) {
        zzt();
        SharedPreferences.Editor edit = zzc().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    public final SharedPreferences zzc() {
        zzt();
        zzab();
        Preconditions.checkNotNull(this.zzv);
        return this.zzv;
    }

    public final SparseArray<Long> zzg() {
        Bundle zza2 = this.zzi.zza();
        if (zza2 == null) {
            return new SparseArray<>();
        }
        int[] intArray = zza2.getIntArray("uriSources");
        long[] longArray = zza2.getLongArray("uriTimestamps");
        if (intArray != null && longArray != null) {
            if (intArray.length != longArray.length) {
                zzj().zzg().zza("Trigger URI source and timestamp array lengths do not match");
                return new SparseArray<>();
            }
            SparseArray<Long> sparseArray = new SparseArray<>();
            for (int i = 0; i < intArray.length; i++) {
                sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
            }
            return sparseArray;
        }
        return new SparseArray<>();
    }

    public final zzay zzh() {
        zzt();
        return zzay.zza(zzc().getString("dma_consent_settings", null));
    }

    public final zzih zzm() {
        zzt();
        return zzih.zza(zzc().getString("consent_settings", "G1"), zzc().getInt("consent_source", 100));
    }

    public final Boolean zzn() {
        zzt();
        if (!zzc().contains("use_service")) {
            return null;
        }
        return Boolean.valueOf(zzc().getBoolean("use_service", false));
    }

    @Override // com.google.android.gms.measurement.internal.zzic
    public final boolean zzo() {
        return true;
    }

    public final Boolean zzp() {
        zzt();
        if (zzc().contains("measurement_enabled_from_api")) {
            return Boolean.valueOf(zzc().getBoolean("measurement_enabled_from_api", true));
        }
        return null;
    }

    public final Boolean zzu() {
        zzt();
        if (zzc().contains("measurement_enabled")) {
            return Boolean.valueOf(zzc().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    public final String zzv() {
        zzt();
        String string = zzc().getString("previous_os_version", null);
        zzf().zzab();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor edit = zzc().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }

    public final String zzw() {
        zzt();
        return zzc().getString("admob_app_id", null);
    }

    public final String zzx() {
        zzt();
        return zzc().getString("gmp_app_id", null);
    }

    public final void zzy() {
        zzt();
        Boolean zzu = zzu();
        SharedPreferences.Editor edit = zzc().edit();
        edit.clear();
        edit.apply();
        if (zzu != null) {
            zza(zzu);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzic
    public final void zzz() {
        SharedPreferences sharedPreferences = zza().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.zzv = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.zzm = z;
        if (!z) {
            SharedPreferences.Editor edit = this.zzv.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.zzb = new zzgh(this, "health_monitor", Math.max(0L, zzbi.zzc.zza(null).longValue()));
    }

    public final void zzb(Boolean bool) {
        zzt();
        SharedPreferences.Editor edit = zzc().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled_from_api");
        }
        edit.apply();
    }

    public final void zzc(String str) {
        zzt();
        SharedPreferences.Editor edit = zzc().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    public final void zzb(boolean z) {
        zzt();
        zzj().zzp().zza("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = zzc().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    public final void zza(Boolean bool) {
        zzt();
        SharedPreferences.Editor edit = zzc().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    public final void zza(boolean z) {
        zzt();
        SharedPreferences.Editor edit = zzc().edit();
        edit.putBoolean("use_service", z);
        edit.apply();
    }

    public final boolean zza(long j) {
        return j - this.zzf.zza() > this.zzk.zza();
    }

    public final boolean zza(zzih zzihVar) {
        zzt();
        int zza2 = zzihVar.zza();
        if (!zza(zza2)) {
            return false;
        }
        SharedPreferences.Editor edit = zzc().edit();
        edit.putString("consent_settings", zzihVar.zze());
        edit.putInt("consent_source", zza2);
        edit.apply();
        return true;
    }

    public final boolean zza(zzay zzayVar) {
        zzt();
        if (!zzih.zza(zzayVar.zza(), zzh().zza())) {
            return false;
        }
        SharedPreferences.Editor edit = zzc().edit();
        edit.putString("dma_consent_settings", zzayVar.zzf());
        edit.apply();
        return true;
    }

    public final boolean zza(int i) {
        return zzih.zza(i, zzc().getInt("consent_source", 100));
    }
}
