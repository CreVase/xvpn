package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzaiz implements zzabm {
    public static final zzabt zza = new zzabt() { // from class: com.google.android.gms.internal.ads.zzaiy
        @Override // com.google.android.gms.internal.ads.zzabt
        public final /* synthetic */ zzabm[] zza(Uri uri, Map map) {
            int i = zzabs.zza;
            return new zzabm[]{new zzaiz(0)};
        }
    };
    private final zzaja zzb;
    private final zzfb zzc;
    private final zzfb zzd;
    private final zzfa zze;
    private zzabp zzf;
    private long zzg;
    private long zzh;
    private boolean zzi;
    private boolean zzj;

    public zzaiz() {
        this(0);
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final int zzb(zzabn zzabnVar, zzacj zzacjVar) throws IOException {
        zzdx.zzb(this.zzf);
        int zza2 = zzabnVar.zza(this.zzc.zzI(), 0, 2048);
        if (!this.zzj) {
            this.zzf.zzO(new zzacl(-9223372036854775807L, 0L));
            this.zzj = true;
        }
        if (zza2 == -1) {
            return -1;
        }
        this.zzc.zzG(0);
        this.zzc.zzF(zza2);
        if (!this.zzi) {
            this.zzb.zzd(this.zzg, 4);
            this.zzi = true;
        }
        this.zzb.zza(this.zzc);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final void zzc(zzabp zzabpVar) {
        this.zzf = zzabpVar;
        this.zzb.zzb(zzabpVar, new zzakq(Integer.MIN_VALUE, 0, 1));
        zzabpVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final void zzd(long j, long j2) {
        this.zzi = false;
        this.zzb.zze();
        this.zzg = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final boolean zze(zzabn zzabnVar) throws IOException {
        int i = 0;
        while (true) {
            zzabc zzabcVar = (zzabc) zzabnVar;
            zzabcVar.zzm(this.zzd.zzI(), 0, 10, false);
            this.zzd.zzG(0);
            if (this.zzd.zzn() != 4801587) {
                break;
            }
            this.zzd.zzH(3);
            int zzk = this.zzd.zzk();
            i += zzk + 10;
            zzabcVar.zzl(zzk, false);
        }
        zzabnVar.zzj();
        zzabc zzabcVar2 = (zzabc) zzabnVar;
        zzabcVar2.zzl(i, false);
        if (this.zzh == -1) {
            this.zzh = i;
        }
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        do {
            zzabcVar2.zzm(this.zzd.zzI(), 0, 2, false);
            this.zzd.zzG(0);
            if (!zzaja.zzf(this.zzd.zzp())) {
                i2++;
                zzabnVar.zzj();
                zzabcVar2.zzl(i2, false);
            } else {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                zzabcVar2.zzm(this.zzd.zzI(), 0, 4, false);
                this.zze.zzj(14);
                int zzd = this.zze.zzd(13);
                if (zzd <= 6) {
                    i2++;
                    zzabnVar.zzj();
                    zzabcVar2.zzl(i2, false);
                } else {
                    zzabcVar2.zzl(zzd - 6, false);
                    i4 += zzd;
                }
            }
            i3 = 0;
            i4 = 0;
        } while (i2 - i < 8192);
        return false;
    }

    public zzaiz(int i) {
        this.zzb = new zzaja(true, null);
        this.zzc = new zzfb(2048);
        this.zzh = -1L;
        zzfb zzfbVar = new zzfb(10);
        this.zzd = zzfbVar;
        byte[] zzI = zzfbVar.zzI();
        this.zze = new zzfa(zzI, zzI.length);
    }
}
