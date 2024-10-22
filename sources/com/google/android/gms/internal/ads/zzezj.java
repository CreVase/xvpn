package com.google.android.gms.internal.ads;

import defpackage.ml1;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzezj implements zzfai {
    private zzcws zza;
    private final Executor zzb = zzgaj.zzb();

    public final zzcws zza() {
        return this.zza;
    }

    public final ml1 zzb(zzfaj zzfajVar, zzfah zzfahVar, zzcws zzcwsVar) {
        zzcwr zza = zzfahVar.zza(zzfajVar.zzb);
        zza.zzb(new zzfam(true));
        zzcws zzcwsVar2 = (zzcws) zza.zzh();
        this.zza = zzcwsVar2;
        final zzcue zzb = zzcwsVar2.zzb();
        final zzffj zzffjVar = new zzffj();
        return zzfzt.zzm(zzfzt.zzn(zzfzk.zzu(zzb.zzj()), new zzfza() { // from class: com.google.android.gms.internal.ads.zzezh
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                zzfde zzfdeVar = (zzfde) obj;
                zzffjVar.zzb = zzfdeVar;
                Iterator it = zzfdeVar.zzb.zza.iterator();
                boolean z = false;
                loop0: while (true) {
                    if (it.hasNext()) {
                        Iterator it2 = ((zzfcr) it.next()).zza.iterator();
                        while (it2.hasNext()) {
                            if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                                break loop0;
                            }
                            z = true;
                        }
                    } else if (z) {
                        return zzb.zzi(zzfzt.zzh(zzfdeVar));
                    }
                }
                return zzfzt.zzh(null);
            }
        }, this.zzb), new zzfsk() { // from class: com.google.android.gms.internal.ads.zzezi
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj) {
                zzffj zzffjVar2 = zzffj.this;
                zzffjVar2.zzc = (zzcsx) obj;
                return zzffjVar2;
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfai
    public final /* bridge */ /* synthetic */ ml1 zzc(zzfaj zzfajVar, zzfah zzfahVar, Object obj) {
        return zzb(zzfajVar, zzfahVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfai
    public final /* synthetic */ Object zzd() {
        return this.zza;
    }
}
