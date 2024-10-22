package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzcqb implements zzauw {
    private zzcgb zza;
    private final Executor zzb;
    private final zzcpn zzc;
    private final Clock zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final zzcpq zzg = new zzcpq();

    public zzcqb(Executor executor, zzcpn zzcpnVar, Clock clock) {
        this.zzb = executor;
        this.zzc = zzcpnVar;
        this.zzd = clock;
    }

    private final void zzg() {
        try {
            final JSONObject zzb = this.zzc.zzb(this.zzg);
            if (this.zza != null) {
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqa
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcqb.this.zzd(zzb);
                    }
                });
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed to call video active view js", e);
        }
    }

    public final void zza() {
        this.zze = false;
    }

    public final void zzb() {
        this.zze = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzauw
    public final void zzbt(zzauv zzauvVar) {
        boolean z;
        if (this.zzf) {
            z = false;
        } else {
            z = zzauvVar.zzj;
        }
        zzcpq zzcpqVar = this.zzg;
        zzcpqVar.zza = z;
        zzcpqVar.zzd = this.zzd.elapsedRealtime();
        this.zzg.zzf = zzauvVar;
        if (this.zze) {
            zzg();
        }
    }

    public final /* synthetic */ void zzd(JSONObject jSONObject) {
        this.zza.zzl("AFMA_updateActiveView", jSONObject);
    }

    public final void zze(boolean z) {
        this.zzf = z;
    }

    public final void zzf(zzcgb zzcgbVar) {
        this.zza = zzcgbVar;
    }
}
