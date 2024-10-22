package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzdnd {
    private final Executor zza;
    private final zzcqb zzb;
    private final zzdex zzc;

    public zzdnd(Executor executor, zzcqb zzcqbVar, zzdex zzdexVar) {
        this.zza = executor;
        this.zzc = zzdexVar;
        this.zzb = zzcqbVar;
    }

    public final void zza(final zzcgb zzcgbVar) {
        if (zzcgbVar == null) {
            return;
        }
        this.zzc.zza(zzcgbVar.zzF());
        this.zzc.zzo(new zzauw() { // from class: com.google.android.gms.internal.ads.zzdmz
            @Override // com.google.android.gms.internal.ads.zzauw
            public final void zzbt(zzauv zzauvVar) {
                zzcho zzN = zzcgb.this.zzN();
                Rect rect = zzauvVar.zzd;
                zzN.zzp(rect.left, rect.top, false);
            }
        }, this.zza);
        this.zzc.zzo(new zzauw() { // from class: com.google.android.gms.internal.ads.zzdna
            @Override // com.google.android.gms.internal.ads.zzauw
            public final void zzbt(zzauv zzauvVar) {
                String str;
                HashMap hashMap = new HashMap();
                if (true != zzauvVar.zzj) {
                    str = "0";
                } else {
                    str = "1";
                }
                hashMap.put("isVisible", str);
                zzcgb.this.zzd("onAdVisibilityChanged", hashMap);
            }
        }, this.zza);
        this.zzc.zzo(this.zzb, this.zza);
        this.zzb.zzf(zzcgbVar);
        zzcgbVar.zzad("/trackActiveViewUnit", new zzbjj() { // from class: com.google.android.gms.internal.ads.zzdnb
            @Override // com.google.android.gms.internal.ads.zzbjj
            public final void zza(Object obj, Map map) {
                zzdnd.this.zzb((zzcgb) obj, map);
            }
        });
        zzcgbVar.zzad("/untrackActiveViewUnit", new zzbjj() { // from class: com.google.android.gms.internal.ads.zzdnc
            @Override // com.google.android.gms.internal.ads.zzbjj
            public final void zza(Object obj, Map map) {
                zzdnd.this.zzc((zzcgb) obj, map);
            }
        });
    }

    public final /* synthetic */ void zzb(zzcgb zzcgbVar, Map map) {
        this.zzb.zzb();
    }

    public final /* synthetic */ void zzc(zzcgb zzcgbVar, Map map) {
        this.zzb.zza();
    }
}
