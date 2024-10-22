package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzelj extends zzbqx {
    private final String zza;
    private final zzbqv zzb;
    private final zzcbl zzc;
    private final JSONObject zzd;
    private final long zze;
    private boolean zzf;

    public zzelj(String str, zzbqv zzbqvVar, zzcbl zzcblVar, long j) {
        JSONObject jSONObject = new JSONObject();
        this.zzd = jSONObject;
        this.zzf = false;
        this.zzc = zzcblVar;
        this.zza = str;
        this.zzb = zzbqvVar;
        this.zze = j;
        try {
            jSONObject.put("adapter_version", zzbqvVar.zzf().toString());
            jSONObject.put("sdk_version", zzbqvVar.zzg().toString());
            jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    public static synchronized void zzb(String str, zzcbl zzcblVar) {
        synchronized (zzelj.class) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
                jSONObject.put("signal_error", "Adapter failed to instantiate");
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzby)).booleanValue()) {
                    jSONObject.put("signal_error_code", 1);
                }
                zzcblVar.zzc(jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    private final synchronized void zzh(String str, int i) {
        if (this.zzf) {
            return;
        }
        try {
            this.zzd.put("signal_error", str);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbz)).booleanValue()) {
                this.zzd.put("latency", com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zze);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzby)).booleanValue()) {
                this.zzd.put("signal_error_code", i);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    public final synchronized void zzc() {
        zzh("Signal collection timeout.", 3);
    }

    public final synchronized void zzd() {
        if (this.zzf) {
            return;
        }
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzby)).booleanValue()) {
                this.zzd.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbqy
    public final synchronized void zze(String str) throws RemoteException {
        if (this.zzf) {
            return;
        }
        if (str == null) {
            zzf("Adapter returned null signals");
            return;
        }
        try {
            this.zzd.put("signals", str);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbz)).booleanValue()) {
                this.zzd.put("latency", com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zze);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzby)).booleanValue()) {
                this.zzd.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbqy
    public final synchronized void zzf(String str) throws RemoteException {
        zzh(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbqy
    public final synchronized void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzh(zzeVar.zzb, 2);
    }
}
