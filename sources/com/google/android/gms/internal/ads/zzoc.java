package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class zzoc implements zzmb {
    private final zzdy zza;
    private final zzcs zzb;
    private final zzcu zzc;
    private final zzob zzd;
    private final SparseArray zze;
    private zzeo zzf;
    private zzco zzg;
    private zzei zzh;
    private boolean zzi;

    public zzoc(zzdy zzdyVar) {
        zzdyVar.getClass();
        this.zza = zzdyVar;
        this.zzf = new zzeo(zzfk.zzw(), zzdyVar, new zzem() { // from class: com.google.android.gms.internal.ads.zznf
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj, zzah zzahVar) {
            }
        });
        zzcs zzcsVar = new zzcs();
        this.zzb = zzcsVar;
        this.zzc = new zzcu();
        this.zzd = new zzob(zzcsVar);
        this.zze = new SparseArray();
    }

    public static /* synthetic */ void zzT(zzoc zzocVar) {
        final zzmc zzR = zzocVar.zzR();
        zzocVar.zzW(zzR, 1028, new zzel() { // from class: com.google.android.gms.internal.ads.zzmg
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
            }
        });
        zzocVar.zzf.zze();
    }

    private final zzmc zzX(zztw zztwVar) {
        zzcv zza;
        this.zzg.getClass();
        if (zztwVar == null) {
            zza = null;
        } else {
            zza = this.zzd.zza(zztwVar);
        }
        if (zztwVar != null && zza != null) {
            return zzS(zza, zza.zzn(zztwVar.zza, this.zzb).zzd, zztwVar);
        }
        int zzd = this.zzg.zzd();
        zzcv zzn = this.zzg.zzn();
        if (zzd >= zzn.zzc()) {
            zzn = zzcv.zza;
        }
        return zzS(zzn, zzd, null);
    }

    private final zzmc zzY(int i, zztw zztwVar) {
        zzco zzcoVar = this.zzg;
        zzcoVar.getClass();
        if (zztwVar != null) {
            if (this.zzd.zza(zztwVar) != null) {
                return zzX(zztwVar);
            }
            return zzS(zzcv.zza, i, zztwVar);
        }
        zzcv zzn = zzcoVar.zzn();
        if (i >= zzn.zzc()) {
            zzn = zzcv.zza;
        }
        return zzS(zzn, i, null);
    }

    private final zzmc zzZ() {
        return zzX(this.zzd.zzd());
    }

    private final zzmc zzaa() {
        return zzX(this.zzd.zze());
    }

    private final zzmc zzab(zzce zzceVar) {
        zztw zztwVar;
        if ((zzceVar instanceof zzil) && (zztwVar = ((zzil) zzceVar).zzj) != null) {
            return zzX(zztwVar);
        }
        return zzR();
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzA(final zzam zzamVar, final zzie zzieVar) {
        final zzmc zzaa = zzaa();
        zzW(zzaa, 1009, new zzel() { // from class: com.google.android.gms.internal.ads.zznr
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                ((zzme) obj).zze(zzmc.this, zzamVar, zzieVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzB(final long j) {
        final zzmc zzaa = zzaa();
        zzW(zzaa, 1010, new zzel(j) { // from class: com.google.android.gms.internal.ads.zzmw
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzC(final Exception exc) {
        final zzmc zzaa = zzaa();
        zzW(zzaa, 1014, new zzel() { // from class: com.google.android.gms.internal.ads.zzny
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzD(final int i, final long j, final long j2) {
        final zzmc zzaa = zzaa();
        zzW(zzaa, 1011, new zzel(i, j, j2) { // from class: com.google.android.gms.internal.ads.zzms
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzE(final int i, final long j) {
        final zzmc zzZ = zzZ();
        zzW(zzZ, 1018, new zzel() { // from class: com.google.android.gms.internal.ads.zznc
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                ((zzme) obj).zzh(zzmc.this, i, j);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzF(final Object obj, final long j) {
        final zzmc zzaa = zzaa();
        zzW(zzaa, 26, new zzel() { // from class: com.google.android.gms.internal.ads.zznv
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj2) {
                ((zzme) obj2).zzn(zzmc.this, obj, j);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzG(final Exception exc) {
        final zzmc zzaa = zzaa();
        zzW(zzaa, 1030, new zzel() { // from class: com.google.android.gms.internal.ads.zzmr
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzH(final String str, final long j, final long j2) {
        final zzmc zzaa = zzaa();
        zzW(zzaa, 1016, new zzel(str, j2, j) { // from class: com.google.android.gms.internal.ads.zznx
            public final /* synthetic */ String zzb;

            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzI(final String str) {
        final zzmc zzaa = zzaa();
        zzW(zzaa, 1019, new zzel() { // from class: com.google.android.gms.internal.ads.zznb
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzJ(final zzid zzidVar) {
        final zzmc zzZ = zzZ();
        zzW(zzZ, 1020, new zzel() { // from class: com.google.android.gms.internal.ads.zzno
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                ((zzme) obj).zzo(zzmc.this, zzidVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzK(final zzid zzidVar) {
        final zzmc zzaa = zzaa();
        zzW(zzaa, 1015, new zzel() { // from class: com.google.android.gms.internal.ads.zznt
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzL(final long j, final int i) {
        final zzmc zzZ = zzZ();
        zzW(zzZ, 1021, new zzel(j, i) { // from class: com.google.android.gms.internal.ads.zzng
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzM(final zzam zzamVar, final zzie zzieVar) {
        final zzmc zzaa = zzaa();
        zzW(zzaa, 1017, new zzel() { // from class: com.google.android.gms.internal.ads.zznn
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                ((zzme) obj).zzp(zzmc.this, zzamVar, zzieVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzN() {
        zzei zzeiVar = this.zzh;
        zzdx.zzb(zzeiVar);
        zzeiVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zznu
            @Override // java.lang.Runnable
            public final void run() {
                zzoc.zzT(zzoc.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzO(zzme zzmeVar) {
        this.zzf.zzf(zzmeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzP(final zzco zzcoVar, Looper looper) {
        zzfvs zzfvsVar;
        boolean z = true;
        if (this.zzg != null) {
            zzfvsVar = this.zzd.zzb;
            if (!zzfvsVar.isEmpty()) {
                z = false;
            }
        }
        zzdx.zzf(z);
        zzcoVar.getClass();
        this.zzg = zzcoVar;
        this.zzh = this.zza.zzb(looper, null);
        this.zzf = this.zzf.zza(looper, new zzem() { // from class: com.google.android.gms.internal.ads.zzmu
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj, zzah zzahVar) {
                zzoc.this.zzU(zzcoVar, (zzme) obj, zzahVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzQ(List list, zztw zztwVar) {
        zzco zzcoVar = this.zzg;
        zzcoVar.getClass();
        this.zzd.zzh(list, zztwVar, zzcoVar);
    }

    public final zzmc zzR() {
        return zzX(this.zzd.zzb());
    }

    public final zzmc zzS(zzcv zzcvVar, int i, zztw zztwVar) {
        zztw zztwVar2;
        boolean z = true;
        if (true == zzcvVar.zzo()) {
            zztwVar2 = null;
        } else {
            zztwVar2 = zztwVar;
        }
        long zza = this.zza.zza();
        if (!zzcvVar.equals(this.zzg.zzn()) || i != this.zzg.zzd()) {
            z = false;
        }
        long j = 0;
        if (zztwVar2 != null && zztwVar2.zzb()) {
            if (z && this.zzg.zzb() == zztwVar2.zzb && this.zzg.zzc() == zztwVar2.zzc) {
                j = this.zzg.zzk();
            }
        } else if (z) {
            j = this.zzg.zzj();
        } else if (!zzcvVar.zzo()) {
            long j2 = zzcvVar.zze(i, this.zzc, 0L).zzn;
            j = zzfk.zzs(0L);
        }
        return new zzmc(zza, zzcvVar, i, zztwVar2, j, this.zzg.zzn(), this.zzg.zzd(), this.zzd.zzb(), this.zzg.zzk(), this.zzg.zzm());
    }

    public final /* synthetic */ void zzU(zzco zzcoVar, zzme zzmeVar, zzah zzahVar) {
        zzmeVar.zzi(zzcoVar, new zzmd(zzahVar, this.zze));
    }

    @Override // com.google.android.gms.internal.ads.zzxx
    public final void zzV(final int i, final long j, final long j2) {
        final zzmc zzX = zzX(this.zzd.zzc());
        zzW(zzX, 1006, new zzel() { // from class: com.google.android.gms.internal.ads.zzmp
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                ((zzme) obj).zzf(zzmc.this, i, j, j2);
            }
        });
    }

    public final void zzW(zzmc zzmcVar, int i, zzel zzelVar) {
        this.zze.put(i, zzmcVar);
        zzeo zzeoVar = this.zzf;
        zzeoVar.zzd(i, zzelVar);
        zzeoVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcl
    public final void zza(final zzck zzckVar) {
        final zzmc zzR = zzR();
        zzW(zzR, 13, new zzel() { // from class: com.google.android.gms.internal.ads.zzml
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzac(int i, zztw zztwVar, final zzts zztsVar) {
        final zzmc zzY = zzY(i, zztwVar);
        zzW(zzY, 1004, new zzel() { // from class: com.google.android.gms.internal.ads.zznh
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                ((zzme) obj).zzg(zzmc.this, zztsVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzad(int i, zztw zztwVar, final zztn zztnVar, final zzts zztsVar) {
        final zzmc zzY = zzY(i, zztwVar);
        zzW(zzY, 1002, new zzel() { // from class: com.google.android.gms.internal.ads.zzni
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzae(int i, zztw zztwVar, final zztn zztnVar, final zzts zztsVar) {
        final zzmc zzY = zzY(i, zztwVar);
        zzW(zzY, 1001, new zzel() { // from class: com.google.android.gms.internal.ads.zznm
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzaf(int i, zztw zztwVar, final zztn zztnVar, final zzts zztsVar, final IOException iOException, final boolean z) {
        final zzmc zzY = zzY(i, zztwVar);
        zzW(zzY, 1003, new zzel() { // from class: com.google.android.gms.internal.ads.zzmt
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                ((zzme) obj).zzj(zzmc.this, zztnVar, zztsVar, iOException, z);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzag(int i, zztw zztwVar, final zztn zztnVar, final zzts zztsVar) {
        final zzmc zzY = zzY(i, zztwVar);
        zzW(zzY, 1000, new zzel() { // from class: com.google.android.gms.internal.ads.zzmk
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcl
    public final void zzb(final boolean z) {
        final zzmc zzR = zzR();
        zzW(zzR, 3, new zzel(z) { // from class: com.google.android.gms.internal.ads.zzmi
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcl
    public final void zzc(final boolean z) {
        final zzmc zzR = zzR();
        zzW(zzR, 7, new zzel(z) { // from class: com.google.android.gms.internal.ads.zzmx
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcl
    public final void zzd(final zzbp zzbpVar, final int i) {
        final zzmc zzR = zzR();
        zzW(zzR, 1, new zzel(zzbpVar, i) { // from class: com.google.android.gms.internal.ads.zzmn
            public final /* synthetic */ zzbp zzb;

            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcl
    public final void zze(final zzbv zzbvVar) {
        final zzmc zzR = zzR();
        zzW(zzR, 14, new zzel() { // from class: com.google.android.gms.internal.ads.zzoa
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcl
    public final void zzf(final boolean z, final int i) {
        final zzmc zzR = zzR();
        zzW(zzR, 5, new zzel(z, i) { // from class: com.google.android.gms.internal.ads.zzne
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcl
    public final void zzg(final zzcg zzcgVar) {
        final zzmc zzR = zzR();
        zzW(zzR, 12, new zzel() { // from class: com.google.android.gms.internal.ads.zzmf
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcl
    public final void zzh(final int i) {
        final zzmc zzR = zzR();
        zzW(zzR, 4, new zzel() { // from class: com.google.android.gms.internal.ads.zznl
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                ((zzme) obj).zzk(zzmc.this, i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcl
    public final void zzi(final int i) {
        final zzmc zzR = zzR();
        zzW(zzR, 6, new zzel(i) { // from class: com.google.android.gms.internal.ads.zzna
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcl
    public final void zzj(final zzce zzceVar) {
        final zzmc zzab = zzab(zzceVar);
        zzW(zzab, 10, new zzel() { // from class: com.google.android.gms.internal.ads.zznj
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                ((zzme) obj).zzl(zzmc.this, zzceVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcl
    public final void zzk(final zzce zzceVar) {
        final zzmc zzab = zzab(zzceVar);
        zzW(zzab, 10, new zzel() { // from class: com.google.android.gms.internal.ads.zznd
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcl
    public final void zzl(final boolean z, final int i) {
        final zzmc zzR = zzR();
        zzW(zzR, -1, new zzel(z, i) { // from class: com.google.android.gms.internal.ads.zzmv
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcl
    public final void zzm(final zzcn zzcnVar, final zzcn zzcnVar2, final int i) {
        if (i == 1) {
            this.zzi = false;
            i = 1;
        }
        zzob zzobVar = this.zzd;
        zzco zzcoVar = this.zzg;
        zzcoVar.getClass();
        zzobVar.zzg(zzcoVar);
        final zzmc zzR = zzR();
        zzW(zzR, 11, new zzel() { // from class: com.google.android.gms.internal.ads.zzns
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                ((zzme) obj).zzm(zzmc.this, zzcnVar, zzcnVar2, i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcl
    public final void zzn(final boolean z) {
        final zzmc zzaa = zzaa();
        zzW(zzaa, 23, new zzel(z) { // from class: com.google.android.gms.internal.ads.zzmo
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcl
    public final void zzo(final int i, final int i2) {
        final zzmc zzaa = zzaa();
        zzW(zzaa, 24, new zzel(i, i2) { // from class: com.google.android.gms.internal.ads.zznz
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcl
    public final void zzp(zzcv zzcvVar, final int i) {
        zzco zzcoVar = this.zzg;
        zzcoVar.getClass();
        this.zzd.zzi(zzcoVar);
        final zzmc zzR = zzR();
        zzW(zzR, 0, new zzel(i) { // from class: com.google.android.gms.internal.ads.zzmm
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcl
    public final void zzq(final zzdg zzdgVar) {
        final zzmc zzR = zzR();
        zzW(zzR, 2, new zzel() { // from class: com.google.android.gms.internal.ads.zzmy
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcl
    public final void zzr(final zzdm zzdmVar) {
        final zzmc zzaa = zzaa();
        zzW(zzaa, 25, new zzel() { // from class: com.google.android.gms.internal.ads.zznp
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                zzmc zzmcVar = zzmc.this;
                zzdm zzdmVar2 = zzdmVar;
                ((zzme) obj).zzq(zzmcVar, zzdmVar2);
                int i = zzdmVar2.zzc;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcl
    public final void zzs(final float f) {
        final zzmc zzaa = zzaa();
        zzW(zzaa, 22, new zzel(f) { // from class: com.google.android.gms.internal.ads.zzmq
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzt(zzme zzmeVar) {
        this.zzf.zzb(zzmeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzu() {
        if (!this.zzi) {
            final zzmc zzR = zzR();
            this.zzi = true;
            zzW(zzR, -1, new zzel() { // from class: com.google.android.gms.internal.ads.zznq
                @Override // com.google.android.gms.internal.ads.zzel
                public final void zza(Object obj) {
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzv(final Exception exc) {
        final zzmc zzaa = zzaa();
        zzW(zzaa, 1029, new zzel() { // from class: com.google.android.gms.internal.ads.zznw
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzw(final String str, final long j, final long j2) {
        final zzmc zzaa = zzaa();
        zzW(zzaa, 1008, new zzel(str, j2, j) { // from class: com.google.android.gms.internal.ads.zzmz
            public final /* synthetic */ String zzb;

            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzx(final String str) {
        final zzmc zzaa = zzaa();
        zzW(zzaa, 1012, new zzel() { // from class: com.google.android.gms.internal.ads.zzmj
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzy(final zzid zzidVar) {
        final zzmc zzZ = zzZ();
        zzW(zzZ, 1013, new zzel() { // from class: com.google.android.gms.internal.ads.zznk
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzz(final zzid zzidVar) {
        final zzmc zzaa = zzaa();
        zzW(zzaa, 1007, new zzel() { // from class: com.google.android.gms.internal.ads.zzmh
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
            }
        });
    }
}
