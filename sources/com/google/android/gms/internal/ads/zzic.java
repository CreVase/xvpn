package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class zzic implements zzlr, zzlt {
    private final int zzb;
    private zzlu zzd;
    private int zze;
    private zzol zzf;
    private zzdy zzg;
    private int zzh;
    private zzvo zzi;
    private zzam[] zzj;
    private long zzk;
    private long zzl;
    private boolean zzn;
    private boolean zzo;
    private zzls zzp;
    private final Object zza = new Object();
    private final zzkn zzc = new zzkn();
    private long zzm = Long.MIN_VALUE;

    public zzic(int i) {
        this.zzb = i;
    }

    private final void zzW(long j, boolean z) throws zzil {
        this.zzn = false;
        this.zzl = j;
        this.zzm = j;
        zzy(j, z);
    }

    public void zzA() {
    }

    public void zzB() throws zzil {
    }

    public void zzC() {
    }

    public void zzD(zzam[] zzamVarArr, long j, long j2) throws zzil {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final void zzE() {
        boolean z;
        if (this.zzh == 0) {
            z = true;
        } else {
            z = false;
        }
        zzdx.zzf(z);
        zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final void zzF(zzam[] zzamVarArr, zzvo zzvoVar, long j, long j2) throws zzil {
        zzdx.zzf(!this.zzn);
        this.zzi = zzvoVar;
        if (this.zzm == Long.MIN_VALUE) {
            this.zzm = j;
        }
        this.zzj = zzamVarArr;
        this.zzk = j2;
        zzD(zzamVarArr, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final void zzG() {
        boolean z;
        if (this.zzh == 0) {
            z = true;
        } else {
            z = false;
        }
        zzdx.zzf(z);
        zzkn zzknVar = this.zzc;
        zzknVar.zzb = null;
        zzknVar.zza = null;
        zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final void zzH(long j) throws zzil {
        zzW(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final void zzI() {
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzlt
    public final void zzJ(zzls zzlsVar) {
        synchronized (this.zza) {
            this.zzp = zzlsVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public /* synthetic */ void zzK(float f, float f2) {
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final void zzL() throws zzil {
        boolean z = true;
        if (this.zzh != 1) {
            z = false;
        }
        zzdx.zzf(z);
        this.zzh = 2;
        zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final void zzM() {
        boolean z;
        if (this.zzh == 2) {
            z = true;
        } else {
            z = false;
        }
        zzdx.zzf(z);
        this.zzh = 1;
        zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final boolean zzN() {
        return this.zzm == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final boolean zzO() {
        return this.zzn;
    }

    public final boolean zzP() {
        if (zzN()) {
            return this.zzn;
        }
        zzvo zzvoVar = this.zzi;
        zzvoVar.getClass();
        return zzvoVar.zze();
    }

    public final zzam[] zzQ() {
        zzam[] zzamVarArr = this.zzj;
        zzamVarArr.getClass();
        return zzamVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzlr, com.google.android.gms.internal.ads.zzlt
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final int zzbc() {
        return this.zzh;
    }

    public final int zzbd(zzkn zzknVar, zzht zzhtVar, int i) {
        zzvo zzvoVar = this.zzi;
        zzvoVar.getClass();
        int zza = zzvoVar.zza(zzknVar, zzhtVar, i);
        if (zza == -4) {
            if (zzhtVar.zzf()) {
                this.zzm = Long.MIN_VALUE;
                if (this.zzn) {
                    return -4;
                }
                return -3;
            }
            long j = zzhtVar.zze + this.zzk;
            zzhtVar.zze = j;
            this.zzm = Math.max(this.zzm, j);
        } else if (zza == -5) {
            zzam zzamVar = zzknVar.zza;
            zzamVar.getClass();
            long j2 = zzamVar.zzq;
            if (j2 != Long.MAX_VALUE) {
                zzak zzb = zzamVar.zzb();
                zzb.zzY(j2 + this.zzk);
                zzknVar.zza = zzb.zzac();
                return -5;
            }
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final long zzbe() {
        return this.zzm;
    }

    public final int zzd(long j) {
        zzvo zzvoVar = this.zzi;
        zzvoVar.getClass();
        return zzvoVar.zzb(j - this.zzk);
    }

    @Override // com.google.android.gms.internal.ads.zzlt
    public int zze() throws zzil {
        return 0;
    }

    public final long zzf() {
        return this.zzl;
    }

    public final zzdy zzh() {
        zzdy zzdyVar = this.zzg;
        zzdyVar.getClass();
        return zzdyVar;
    }

    public final zzil zzi(Throwable th, zzam zzamVar, boolean z, int i) {
        int i2;
        if (zzamVar != null && !this.zzo) {
            this.zzo = true;
            try {
                int zzV = zzV(zzamVar) & 7;
                this.zzo = false;
                i2 = zzV;
            } catch (zzil unused) {
                this.zzo = false;
            } catch (Throwable th2) {
                this.zzo = false;
                throw th2;
            }
            return zzil.zzb(th, zzR(), this.zze, zzamVar, i2, z, i);
        }
        i2 = 4;
        return zzil.zzb(th, zzR(), this.zze, zzamVar, i2, z, i);
    }

    public final zzkn zzj() {
        zzkn zzknVar = this.zzc;
        zzknVar.zzb = null;
        zzknVar.zza = null;
        return zzknVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public zzkt zzk() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final zzlt zzl() {
        return this;
    }

    public final zzlu zzm() {
        zzlu zzluVar = this.zzd;
        zzluVar.getClass();
        return zzluVar;
    }

    public final zzol zzn() {
        zzol zzolVar = this.zzf;
        zzolVar.getClass();
        return zzolVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final zzvo zzo() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzlt
    public final void zzp() {
        synchronized (this.zza) {
            this.zzp = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final void zzq() {
        boolean z = true;
        if (this.zzh != 1) {
            z = false;
        }
        zzdx.zzf(z);
        zzkn zzknVar = this.zzc;
        zzknVar.zzb = null;
        zzknVar.zza = null;
        this.zzh = 0;
        this.zzi = null;
        this.zzj = null;
        this.zzn = false;
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final void zzr(zzlu zzluVar, zzam[] zzamVarArr, zzvo zzvoVar, long j, boolean z, boolean z2, long j2, long j3) throws zzil {
        boolean z3;
        if (this.zzh == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        zzdx.zzf(z3);
        this.zzd = zzluVar;
        this.zzh = 1;
        zzx(z, z2);
        zzF(zzamVarArr, zzvoVar, j2, j3);
        zzW(j2, z);
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public /* synthetic */ void zzs() {
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public void zzt(int i, Object obj) throws zzil {
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final void zzu(int i, zzol zzolVar, zzdy zzdyVar) {
        this.zze = i;
        this.zzf = zzolVar;
        this.zzg = zzdyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final void zzv() throws IOException {
        zzvo zzvoVar = this.zzi;
        zzvoVar.getClass();
        zzvoVar.zzd();
    }

    public void zzw() {
        throw null;
    }

    public void zzx(boolean z, boolean z2) throws zzil {
    }

    public void zzy(long j, boolean z) throws zzil {
        throw null;
    }

    public void zzz() {
    }
}
