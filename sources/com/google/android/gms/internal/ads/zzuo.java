package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzuo extends zztf {
    private static final zzbp zza;
    private final zzty[] zzb;
    private final zzcv[] zzc;
    private final ArrayList zzd;
    private final Map zze;
    private final zzfwo zzf;
    private int zzg;
    private long[][] zzh;
    private zzun zzi;
    private final zzth zzj;

    static {
        zzar zzarVar = new zzar();
        zzarVar.zza("MergingMediaSource");
        zza = zzarVar.zzc();
    }

    public zzuo(boolean z, boolean z2, zzty... zztyVarArr) {
        zzth zzthVar = new zzth();
        this.zzb = zztyVarArr;
        this.zzj = zzthVar;
        this.zzd = new ArrayList(Arrays.asList(zztyVarArr));
        this.zzg = -1;
        this.zzc = new zzcv[zztyVarArr.length];
        this.zzh = new long[0];
        this.zze = new HashMap();
        this.zzf = zzfww.zzb(8).zzb(2).zza();
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final /* bridge */ /* synthetic */ void zzA(Object obj, zzty zztyVar, zzcv zzcvVar) {
        int i;
        if (this.zzi == null) {
            if (this.zzg == -1) {
                i = zzcvVar.zzb();
                this.zzg = i;
            } else {
                int zzb = zzcvVar.zzb();
                int i2 = this.zzg;
                if (zzb != i2) {
                    this.zzi = new zzun(0);
                    return;
                }
                i = i2;
            }
            if (this.zzh.length == 0) {
                this.zzh = (long[][]) Array.newInstance((Class<?>) Long.TYPE, i, this.zzc.length);
            }
            this.zzd.remove(zztyVar);
            this.zzc[((Integer) obj).intValue()] = zzcvVar;
            if (this.zzd.isEmpty()) {
                zzo(this.zzc[0]);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzty
    public final void zzG(zztu zztuVar) {
        zzum zzumVar = (zzum) zztuVar;
        int i = 0;
        while (true) {
            zzty[] zztyVarArr = this.zzb;
            if (i < zztyVarArr.length) {
                zztyVarArr[i].zzG(zzumVar.zzn(i));
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzty
    public final zztu zzI(zztw zztwVar, zzxz zzxzVar, long j) {
        zzcv[] zzcvVarArr = this.zzc;
        int length = this.zzb.length;
        zztu[] zztuVarArr = new zztu[length];
        int zza2 = zzcvVarArr[0].zza(zztwVar.zza);
        for (int i = 0; i < length; i++) {
            zztuVarArr[i] = this.zzb[i].zzI(zztwVar.zza(this.zzc[i].zzf(zza2)), zzxzVar, j - this.zzh[zza2][i]);
        }
        return new zzum(this.zzj, this.zzh[zza2], zztuVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzty
    public final zzbp zzJ() {
        zzty[] zztyVarArr = this.zzb;
        if (zztyVarArr.length > 0) {
            return zztyVarArr[0].zzJ();
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zztf, com.google.android.gms.internal.ads.zzsx
    public final void zzn(zzhk zzhkVar) {
        super.zzn(zzhkVar);
        int i = 0;
        while (true) {
            zzty[] zztyVarArr = this.zzb;
            if (i < zztyVarArr.length) {
                zzB(Integer.valueOf(i), zztyVarArr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztf, com.google.android.gms.internal.ads.zzsx
    public final void zzq() {
        super.zzq();
        Arrays.fill(this.zzc, (Object) null);
        this.zzg = -1;
        this.zzi = null;
        this.zzd.clear();
        Collections.addAll(this.zzd, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzsx, com.google.android.gms.internal.ads.zzty
    public final void zzt(zzbp zzbpVar) {
        this.zzb[0].zzt(zzbpVar);
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final /* bridge */ /* synthetic */ zztw zzy(Object obj, zztw zztwVar) {
        if (((Integer) obj).intValue() == 0) {
            return zztwVar;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zztf, com.google.android.gms.internal.ads.zzty
    public final void zzz() throws IOException {
        zzun zzunVar = this.zzi;
        if (zzunVar == null) {
            super.zzz();
            return;
        }
        throw zzunVar;
    }
}
