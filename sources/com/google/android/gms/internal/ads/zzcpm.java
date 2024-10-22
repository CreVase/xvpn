package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzcpm {
    private final String zza;
    private final zzboj zzb;
    private final Executor zzc;
    private zzcpr zzd;
    private final zzbjj zze = new zzcpj(this);
    private final zzbjj zzf = new zzcpl(this);

    public zzcpm(String str, zzboj zzbojVar, Executor executor) {
        this.zza = str;
        this.zzb = zzbojVar;
        this.zzc = executor;
    }

    public static /* bridge */ /* synthetic */ boolean zzg(zzcpm zzcpmVar, Map map) {
        if (map != null) {
            String str = (String) map.get("hashCode");
            if (!TextUtils.isEmpty(str) && str.equals(zzcpmVar.zza)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void zzc(zzcpr zzcprVar) {
        this.zzb.zzb("/updateActiveView", this.zze);
        this.zzb.zzb("/untrackActiveViewUnit", this.zzf);
        this.zzd = zzcprVar;
    }

    public final void zzd(zzcgb zzcgbVar) {
        zzcgbVar.zzad("/updateActiveView", this.zze);
        zzcgbVar.zzad("/untrackActiveViewUnit", this.zzf);
    }

    public final void zze() {
        this.zzb.zzc("/updateActiveView", this.zze);
        this.zzb.zzc("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzf(zzcgb zzcgbVar) {
        zzcgbVar.zzau("/updateActiveView", this.zze);
        zzcgbVar.zzau("/untrackActiveViewUnit", this.zzf);
    }
}
