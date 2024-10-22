package com.google.android.gms.internal.ads;

import defpackage.ml1;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzezo implements zzfai {
    private final zzfai zza;
    private final zzfai zzb;
    private final zzffw zzc;
    private final String zzd;
    private zzcws zze;
    private final Executor zzf;

    public zzezo(zzfai zzfaiVar, zzfai zzfaiVar2, zzffw zzffwVar, String str, Executor executor) {
        this.zza = zzfaiVar;
        this.zzb = zzfaiVar2;
        this.zzc = zzffwVar;
        this.zzd = str;
        this.zzf = executor;
    }

    private final ml1 zzg(zzffj zzffjVar, zzfaj zzfajVar) {
        zzcws zzcwsVar = zzffjVar.zza;
        this.zze = zzcwsVar;
        if (zzffjVar.zzc != null) {
            if (zzcwsVar.zzf() != null) {
                zzffjVar.zzc.zzo().zzl(zzffjVar.zza.zzf());
            }
            return zzfzt.zzh(zzffjVar.zzc);
        }
        zzcwsVar.zzb().zzl(zzffjVar.zzb);
        return ((zzezy) this.zza).zzb(zzfajVar, null, zzffjVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfai
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcws zzd() {
        return this.zze;
    }

    public final /* synthetic */ ml1 zzb(zzfaj zzfajVar, zzezn zzeznVar, zzfah zzfahVar, zzcws zzcwsVar, zzezt zzeztVar) throws Exception {
        if (zzeztVar != null) {
            zzezn zzeznVar2 = new zzezn(zzeznVar.zza, zzeznVar.zzb, zzeznVar.zzc, zzeznVar.zzd, zzeznVar.zze, zzeznVar.zzf, zzeztVar.zza);
            if (zzeztVar.zzc != null) {
                this.zze = null;
                this.zzc.zze(zzeznVar2);
                return zzg(zzeztVar.zzc, zzfajVar);
            }
            ml1 zza = this.zzc.zza(zzeznVar2);
            if (zza != null) {
                this.zze = null;
                return zzfzt.zzn(zza, new zzfza() { // from class: com.google.android.gms.internal.ads.zzezk
                    @Override // com.google.android.gms.internal.ads.zzfza
                    public final ml1 zza(Object obj) {
                        return zzezo.this.zze((zzfft) obj);
                    }
                }, this.zzf);
            }
            this.zzc.zze(zzeznVar2);
            zzfajVar = new zzfaj(zzfajVar.zzb, zzeztVar.zzb);
        }
        ml1 zzb = ((zzezy) this.zza).zzb(zzfajVar, zzfahVar, zzcwsVar);
        this.zze = zzcwsVar;
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfai
    public final /* bridge */ /* synthetic */ ml1 zzc(zzfaj zzfajVar, zzfah zzfahVar, Object obj) {
        return zzf(zzfajVar, zzfahVar, null);
    }

    public final /* synthetic */ ml1 zze(zzfft zzfftVar) throws Exception {
        zzffv zzffvVar;
        if (zzfftVar != null && zzfftVar.zza != null && (zzffvVar = zzfftVar.zzb) != null) {
            zzayk zza = zzayq.zza();
            zzayi zza2 = zzayj.zza();
            zza2.zzd(2);
            zza2.zzb(zzayn.zzd());
            zza.zza(zza2);
            zzfftVar.zza.zza.zzb().zzc().zzm((zzayq) zza.zzal());
            return zzg(zzfftVar.zza, ((zzezn) zzffvVar).zzb);
        }
        throw new zzdwm(1, "Empty prefetch");
    }

    public final synchronized ml1 zzf(final zzfaj zzfajVar, final zzfah zzfahVar, zzcws zzcwsVar) {
        zzcwr zza = zzfahVar.zza(zzfajVar.zzb);
        zza.zza(new zzezp(this.zzd));
        final zzcws zzcwsVar2 = (zzcws) zza.zzh();
        zzcwsVar2.zzg();
        zzcwsVar2.zzg();
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzcwsVar2.zzg().zzd;
        if (zzlVar.zzs == null && zzlVar.zzx == null) {
            zzfdn zzg = zzcwsVar2.zzg();
            final zzezn zzeznVar = new zzezn(zzfahVar, zzfajVar, zzg.zzd, zzg.zzf, this.zzf, zzg.zzj, null);
            return zzfzt.zzn(zzfzk.zzu(((zzezu) this.zzb).zzb(zzfajVar, zzfahVar, zzcwsVar2)), new zzfza() { // from class: com.google.android.gms.internal.ads.zzezl
                @Override // com.google.android.gms.internal.ads.zzfza
                public final ml1 zza(Object obj) {
                    return zzezo.this.zzb(zzfajVar, zzeznVar, zzfahVar, zzcwsVar2, (zzezt) obj);
                }
            }, this.zzf);
        }
        this.zze = zzcwsVar2;
        return ((zzezy) this.zza).zzb(zzfajVar, zzfahVar, zzcwsVar2);
    }
}
