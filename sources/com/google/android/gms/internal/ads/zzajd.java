package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzajd implements zzaje {
    private final List zza;
    private final zzacs[] zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private long zzf = -9223372036854775807L;

    public zzajd(List list) {
        this.zza = list;
        this.zzb = new zzacs[list.size()];
    }

    private final boolean zzf(zzfb zzfbVar, int i) {
        if (zzfbVar.zza() == 0) {
            return false;
        }
        if (zzfbVar.zzl() != i) {
            this.zzc = false;
        }
        this.zzd--;
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaje
    public final void zza(zzfb zzfbVar) {
        if (this.zzc) {
            if (this.zzd == 2 && !zzf(zzfbVar, 32)) {
                return;
            }
            if (this.zzd == 1 && !zzf(zzfbVar, 0)) {
                return;
            }
            int zzc = zzfbVar.zzc();
            int zza = zzfbVar.zza();
            for (zzacs zzacsVar : this.zzb) {
                zzfbVar.zzG(zzc);
                zzacsVar.zzr(zzfbVar, zza);
            }
            this.zze += zza;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaje
    public final void zzb(zzabp zzabpVar, zzakq zzakqVar) {
        for (int i = 0; i < this.zzb.length; i++) {
            zzakn zzaknVar = (zzakn) this.zza.get(i);
            zzakqVar.zzc();
            zzacs zzw = zzabpVar.zzw(zzakqVar.zza(), 3);
            zzak zzakVar = new zzak();
            zzakVar.zzJ(zzakqVar.zzb());
            zzakVar.zzU("application/dvbsubs");
            zzakVar.zzK(Collections.singletonList(zzaknVar.zzb));
            zzakVar.zzM(zzaknVar.zza);
            zzw.zzl(zzakVar.zzac());
            this.zzb[i] = zzw;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaje
    public final void zzc(boolean z) {
        if (this.zzc) {
            if (this.zzf != -9223372036854775807L) {
                for (zzacs zzacsVar : this.zzb) {
                    zzacsVar.zzt(this.zzf, 1, this.zze, 0, null);
                }
            }
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaje
    public final void zzd(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.zzc = true;
        if (j != -9223372036854775807L) {
            this.zzf = j;
        }
        this.zze = 0;
        this.zzd = 2;
    }

    @Override // com.google.android.gms.internal.ads.zzaje
    public final void zze() {
        this.zzc = false;
        this.zzf = -9223372036854775807L;
    }
}
