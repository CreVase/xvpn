package com.google.android.gms.internal.ads;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.LocaleList;
import android.text.TextUtils;

/* loaded from: classes.dex */
final class zzwq extends zzxe implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg;
    private final zzww zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final boolean zzu;
    private final boolean zzv;

    /* JADX WARN: Multi-variable type inference failed */
    public zzwq(int i, zzcx zzcxVar, int i2, zzww zzwwVar, int i3, boolean z, zzfsx zzfsxVar) {
        super(i, zzcxVar, i2);
        int i4;
        int i5;
        boolean z2;
        String[] strArr;
        int i6;
        boolean z3;
        boolean z4;
        boolean z5;
        LocaleList locales;
        String languageTags;
        this.zzh = zzwwVar;
        this.zzg = zzxi.zzg(this.zzd.zzd);
        int i7 = 0;
        this.zzi = zzxi.zzn(i3, false);
        int i8 = 0;
        while (true) {
            i4 = Integer.MAX_VALUE;
            if (i8 < zzwwVar.zzq.size()) {
                i5 = zzxi.zza(this.zzd, (String) zzwwVar.zzq.get(i8), false);
                if (i5 > 0) {
                    break;
                } else {
                    i8++;
                }
            } else {
                i8 = Integer.MAX_VALUE;
                i5 = 0;
                break;
            }
        }
        this.zzk = i8;
        this.zzj = i5;
        int i9 = this.zzd.zzf;
        this.zzl = Integer.bitCount(0);
        zzam zzamVar = this.zzd;
        int i10 = zzamVar.zzf;
        this.zzm = true;
        if (1 != (zzamVar.zze & 1)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.zzp = z2;
        this.zzq = zzamVar.zzz;
        this.zzr = zzamVar.zzA;
        this.zzs = zzamVar.zzi;
        this.zzf = zzfsxVar.zza(zzamVar);
        Configuration configuration = Resources.getSystem().getConfiguration();
        if (zzfk.zza >= 24) {
            locales = configuration.getLocales();
            languageTags = locales.toLanguageTags();
            strArr = languageTags.split(",", -1);
        } else {
            strArr = new String[]{zzfk.zzz(configuration.locale)};
        }
        for (int i11 = 0; i11 < strArr.length; i11++) {
            strArr[i11] = zzfk.zzB(strArr[i11]);
        }
        int i12 = 0;
        while (true) {
            if (i12 < strArr.length) {
                i6 = zzxi.zza(this.zzd, strArr[i12], false);
                if (i6 > 0) {
                    break;
                } else {
                    i12++;
                }
            } else {
                i12 = Integer.MAX_VALUE;
                i6 = 0;
                break;
            }
        }
        this.zzn = i12;
        this.zzo = i6;
        int i13 = 0;
        while (true) {
            if (i13 >= zzwwVar.zzu.size()) {
                break;
            }
            String str = this.zzd.zzm;
            if (str != null && str.equals(zzwwVar.zzu.get(i13))) {
                i4 = i13;
                break;
            }
            i13++;
        }
        this.zzt = i4;
        if ((i3 & 384) == 128) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.zzu = z3;
        if ((i3 & 64) == 64) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.zzv = z4;
        zzww zzwwVar2 = this.zzh;
        if (zzxi.zzn(i3, zzwwVar2.zzR) && ((z5 = this.zzf) || zzwwVar2.zzL)) {
            i7 = (!zzxi.zzn(i3, false) || !z5 || this.zzd.zzi == -1 || (!zzwwVar2.zzT && z)) ? 1 : 2;
        }
        this.zze = i7;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzwq zzwqVar) {
        zzfxb zzfxbVar;
        zzfxb zza;
        zzfxb zzfxbVar2;
        if (this.zzf && this.zzi) {
            zza = zzxi.zzc;
        } else {
            zzfxbVar = zzxi.zzc;
            zza = zzfxbVar.zza();
        }
        zzfvh zzc = zzfvh.zzj().zzd(this.zzi, zzwqVar.zzi).zzc(Integer.valueOf(this.zzk), Integer.valueOf(zzwqVar.zzk), zzfxb.zzc().zza()).zzb(this.zzj, zzwqVar.zzj).zzb(this.zzl, zzwqVar.zzl).zzd(this.zzp, zzwqVar.zzp).zzd(true, true).zzc(Integer.valueOf(this.zzn), Integer.valueOf(zzwqVar.zzn), zzfxb.zzc().zza()).zzb(this.zzo, zzwqVar.zzo).zzd(this.zzf, zzwqVar.zzf).zzc(Integer.valueOf(this.zzt), Integer.valueOf(zzwqVar.zzt), zzfxb.zzc().zza());
        Integer valueOf = Integer.valueOf(this.zzs);
        Integer valueOf2 = Integer.valueOf(zzwqVar.zzs);
        boolean z = this.zzh.zzA;
        zzfxbVar2 = zzxi.zzd;
        zzfvh zzc2 = zzc.zzc(valueOf, valueOf2, zzfxbVar2).zzd(this.zzu, zzwqVar.zzu).zzd(this.zzv, zzwqVar.zzv).zzc(Integer.valueOf(this.zzq), Integer.valueOf(zzwqVar.zzq), zza).zzc(Integer.valueOf(this.zzr), Integer.valueOf(zzwqVar.zzr), zza);
        Integer valueOf3 = Integer.valueOf(this.zzs);
        Integer valueOf4 = Integer.valueOf(zzwqVar.zzs);
        if (!zzfk.zzE(this.zzg, zzwqVar.zzg)) {
            zza = zzxi.zzd;
        }
        return zzc2.zzc(valueOf3, valueOf4, zza).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzxe
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzxe
    public final /* bridge */ /* synthetic */ boolean zzc(zzxe zzxeVar) {
        String str;
        zzwq zzwqVar = (zzwq) zzxeVar;
        boolean z = this.zzh.zzO;
        zzam zzamVar = this.zzd;
        int i = zzamVar.zzz;
        if (i != -1) {
            zzam zzamVar2 = zzwqVar.zzd;
            if (i == zzamVar2.zzz && (str = zzamVar.zzm) != null && TextUtils.equals(str, zzamVar2.zzm)) {
                boolean z2 = this.zzh.zzN;
                int i2 = this.zzd.zzA;
                if (i2 != -1 && i2 == zzwqVar.zzd.zzA && this.zzu == zzwqVar.zzu && this.zzv == zzwqVar.zzv) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
