package com.google.android.gms.internal.ads;

import defpackage.ml1;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzezu implements zzfai {
    private final zzffa zza;
    private final Executor zzb;
    private final zzfzp zzc = new zzezs(this);

    public zzezu(zzffa zzffaVar, Executor executor) {
        this.zza = zzffaVar;
        this.zzb = executor;
    }

    public final /* synthetic */ ml1 zza(zzcws zzcwsVar, zzfad zzfadVar) throws Exception {
        zzffa zzffaVar = this.zza;
        zzffk zzffkVar = zzfadVar.zzb;
        zzbvg zzbvgVar = zzfadVar.zza;
        zzffj zzb = zzffaVar.zzb(zzffkVar);
        if (zzb != null && zzbvgVar != null) {
            zzfzt.zzr(zzcwsVar.zzb().zzh(zzbvgVar), this.zzc, this.zzb);
        }
        return zzfzt.zzh(new zzezt(zzffkVar, zzbvgVar, zzb));
    }

    public final ml1 zzb(zzfaj zzfajVar, zzfah zzfahVar, final zzcws zzcwsVar) {
        return zzfzt.zze(zzfzt.zzn(zzfzk.zzu(new zzfae(this.zza, zzcwsVar, this.zzb).zzc()), new zzfza() { // from class: com.google.android.gms.internal.ads.zzezq
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                return zzezu.this.zza(zzcwsVar, (zzfad) obj);
            }
        }, this.zzb), Exception.class, new zzezr(this), this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfai
    public final /* bridge */ /* synthetic */ ml1 zzc(zzfaj zzfajVar, zzfah zzfahVar, Object obj) {
        return zzb(zzfajVar, zzfahVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfai
    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
