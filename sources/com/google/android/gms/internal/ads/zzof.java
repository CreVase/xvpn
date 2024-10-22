package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* loaded from: classes.dex */
public final class zzof implements zzoj {
    public static final zzftm zza = new zzftm() { // from class: com.google.android.gms.internal.ads.zzod
        @Override // com.google.android.gms.internal.ads.zzftm
        public final Object zza() {
            String zzn;
            zzn = zzof.zzn();
            return zzn;
        }
    };
    private static final Random zzb = new Random();
    private final zzcu zzc;
    private final zzcs zzd;
    private final HashMap zze;
    private final zzftm zzf;
    private zzoi zzg;
    private zzcv zzh;
    private String zzi;
    private long zzj;

    public zzof() {
        throw null;
    }

    public final long zzl() {
        long j;
        long j2;
        zzoe zzoeVar = (zzoe) this.zze.get(this.zzi);
        if (zzoeVar != null) {
            j = zzoeVar.zzd;
            if (j != -1) {
                j2 = zzoeVar.zzd;
                return j2;
            }
        }
        return this.zzj + 1;
    }

    private final zzoe zzm(int i, zztw zztwVar) {
        long j;
        zztw zztwVar2;
        zztw zztwVar3;
        long j2 = Long.MAX_VALUE;
        zzoe zzoeVar = null;
        for (zzoe zzoeVar2 : this.zze.values()) {
            zzoeVar2.zzg(i, zztwVar);
            if (zzoeVar2.zzj(i, zztwVar)) {
                j = zzoeVar2.zzd;
                if (j != -1 && j >= j2) {
                    if (j == j2) {
                        int i2 = zzfk.zza;
                        zztwVar2 = zzoeVar.zze;
                        if (zztwVar2 != null) {
                            zztwVar3 = zzoeVar2.zze;
                            if (zztwVar3 != null) {
                                zzoeVar = zzoeVar2;
                            }
                        }
                    }
                } else {
                    zzoeVar = zzoeVar2;
                    j2 = j;
                }
            }
        }
        if (zzoeVar == null) {
            String zzn = zzn();
            zzoe zzoeVar3 = new zzoe(this, zzn, i, zztwVar);
            this.zze.put(zzn, zzoeVar3);
            return zzoeVar3;
        }
        return zzoeVar;
    }

    public static String zzn() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private final void zzo(zzoe zzoeVar) {
        long j;
        long j2;
        j = zzoeVar.zzd;
        if (j != -1) {
            j2 = zzoeVar.zzd;
            this.zzj = j2;
        }
        this.zzi = null;
    }

    private final void zzp(zzmc zzmcVar) {
        String str;
        long j;
        zztw zztwVar;
        zztw zztwVar2;
        zztw zztwVar3;
        String unused;
        String unused2;
        if (zzmcVar.zzb.zzo()) {
            String str2 = this.zzi;
            if (str2 != null) {
                zzoe zzoeVar = (zzoe) this.zze.get(str2);
                zzoeVar.getClass();
                zzo(zzoeVar);
                return;
            }
            return;
        }
        zzoe zzoeVar2 = (zzoe) this.zze.get(this.zzi);
        zzoe zzm = zzm(zzmcVar.zzc, zzmcVar.zzd);
        str = zzm.zzb;
        this.zzi = str;
        zzi(zzmcVar);
        zztw zztwVar4 = zzmcVar.zzd;
        if (zztwVar4 != null && zztwVar4.zzb()) {
            if (zzoeVar2 != null) {
                long j2 = zztwVar4.zzd;
                j = zzoeVar2.zzd;
                if (j == j2) {
                    zztwVar = zzoeVar2.zze;
                    if (zztwVar != null) {
                        zztwVar2 = zzoeVar2.zze;
                        if (zztwVar2.zzb == zzmcVar.zzd.zzb) {
                            zztwVar3 = zzoeVar2.zze;
                            if (zztwVar3.zzc == zzmcVar.zzd.zzc) {
                                return;
                            }
                        }
                    }
                }
            }
            zztw zztwVar5 = zzmcVar.zzd;
            unused = zzm(zzmcVar.zzc, new zztw(zztwVar5.zza, zztwVar5.zzd)).zzb;
            unused2 = zzm.zzb;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoj
    public final synchronized String zze() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzoj
    public final synchronized String zzf(zzcv zzcvVar, zztw zztwVar) {
        String str;
        str = zzm(zzcvVar.zzn(zztwVar.zza, this.zzd).zzd, zztwVar).zzb;
        return str;
    }

    @Override // com.google.android.gms.internal.ads.zzoj
    public final synchronized void zzg(zzmc zzmcVar) {
        boolean z;
        zzoi zzoiVar;
        String str;
        String str2 = this.zzi;
        if (str2 != null) {
            zzoe zzoeVar = (zzoe) this.zze.get(str2);
            zzoeVar.getClass();
            zzo(zzoeVar);
        }
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzoe zzoeVar2 = (zzoe) it.next();
            it.remove();
            z = zzoeVar2.zzf;
            if (z && (zzoiVar = this.zzg) != null) {
                str = zzoeVar2.zzb;
                zzoiVar.zzd(zzmcVar, str, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoj
    public final void zzh(zzoi zzoiVar) {
        this.zzg = zzoiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzoj
    public final synchronized void zzi(zzmc zzmcVar) {
        boolean z;
        String str;
        boolean z2;
        String str2;
        boolean z3;
        String str3;
        long j;
        int i;
        String unused;
        String unused2;
        this.zzg.getClass();
        if (zzmcVar.zzb.zzo()) {
            return;
        }
        zztw zztwVar = zzmcVar.zzd;
        if (zztwVar != null) {
            if (zztwVar.zzd < zzl()) {
                return;
            }
            zzoe zzoeVar = (zzoe) this.zze.get(this.zzi);
            if (zzoeVar != null) {
                j = zzoeVar.zzd;
                if (j == -1) {
                    i = zzoeVar.zzc;
                    if (i != zzmcVar.zzc) {
                        return;
                    }
                }
            }
        }
        zzoe zzm = zzm(zzmcVar.zzc, zzmcVar.zzd);
        if (this.zzi == null) {
            str3 = zzm.zzb;
            this.zzi = str3;
        }
        zztw zztwVar2 = zzmcVar.zzd;
        if (zztwVar2 != null && zztwVar2.zzb()) {
            zzoe zzm2 = zzm(zzmcVar.zzc, new zztw(zztwVar2.zza, zztwVar2.zzd, zztwVar2.zzb));
            z3 = zzm2.zzf;
            if (!z3) {
                zzm2.zzf = true;
                zzcv zzcvVar = zzmcVar.zzb;
                zztw zztwVar3 = zzmcVar.zzd;
                zzcvVar.zzn(zztwVar3.zza, this.zzd);
                this.zzd.zzi(zzmcVar.zzd.zzb);
                Math.max(0L, zzfk.zzs(0L) + zzfk.zzs(0L));
                unused = zzm2.zzb;
            }
        }
        z = zzm.zzf;
        if (!z) {
            zzm.zzf = true;
            unused2 = zzm.zzb;
        }
        str = zzm.zzb;
        if (str.equals(this.zzi)) {
            z2 = zzm.zzg;
            if (!z2) {
                zzm.zzg = true;
                zzoi zzoiVar = this.zzg;
                str2 = zzm.zzb;
                zzoiVar.zzc(zzmcVar, str2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoj
    public final synchronized void zzj(zzmc zzmcVar, int i) {
        boolean z;
        String str;
        String str2;
        boolean z2;
        this.zzg.getClass();
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzoe zzoeVar = (zzoe) it.next();
            if (zzoeVar.zzk(zzmcVar)) {
                it.remove();
                z = zzoeVar.zzf;
                if (z) {
                    str = zzoeVar.zzb;
                    boolean equals = str.equals(this.zzi);
                    boolean z3 = false;
                    if (i == 0 && equals) {
                        z2 = zzoeVar.zzg;
                        if (z2) {
                            z3 = true;
                        }
                    }
                    if (equals) {
                        zzo(zzoeVar);
                    }
                    zzoi zzoiVar = this.zzg;
                    str2 = zzoeVar.zzb;
                    zzoiVar.zzd(zzmcVar, str2, z3);
                }
            }
        }
        zzp(zzmcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzoj
    public final synchronized void zzk(zzmc zzmcVar) {
        boolean z;
        String str;
        String str2;
        this.zzg.getClass();
        zzcv zzcvVar = this.zzh;
        this.zzh = zzmcVar.zzb;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzoe zzoeVar = (zzoe) it.next();
            if (!zzoeVar.zzl(zzcvVar, this.zzh) || zzoeVar.zzk(zzmcVar)) {
                it.remove();
                z = zzoeVar.zzf;
                if (z) {
                    str = zzoeVar.zzb;
                    if (str.equals(this.zzi)) {
                        zzo(zzoeVar);
                    }
                    zzoi zzoiVar = this.zzg;
                    str2 = zzoeVar.zzb;
                    zzoiVar.zzd(zzmcVar, str2, false);
                }
            }
        }
        zzp(zzmcVar);
    }

    public zzof(zzftm zzftmVar) {
        this.zzf = zzftmVar;
        this.zzc = new zzcu();
        this.zzd = new zzcs();
        this.zze = new HashMap();
        this.zzh = zzcv.zza;
        this.zzj = -1L;
    }
}
