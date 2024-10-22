package com.google.android.gms.internal.ads;

import defpackage.hx2;
import defpackage.p71;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzavl {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final boolean zzd;
    private final zzawa zze;
    private final zzawi zzf;
    private int zzn;
    private final Object zzg = new Object();
    private final ArrayList zzh = new ArrayList();
    private final ArrayList zzi = new ArrayList();
    private final ArrayList zzj = new ArrayList();
    private int zzk = 0;
    private int zzl = 0;
    private int zzm = 0;
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";

    public zzavl(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = z;
        this.zze = new zzawa(i4);
        this.zzf = new zzawi(i5, i6, i7);
    }

    private final void zzp(String str, boolean z, float f, float f2, float f3, float f4) {
        if (str != null) {
            if (str.length() >= this.zzc) {
                synchronized (this.zzg) {
                    this.zzh.add(str);
                    this.zzk += str.length();
                    if (z) {
                        this.zzi.add(str);
                        this.zzj.add(new zzavw(f, f2, f3, f4, this.zzi.size() - 1));
                    }
                }
            }
        }
    }

    private static final String zzq(ArrayList arrayList, int i) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            sb.append((String) arrayList.get(i2));
            sb.append(' ');
            i2++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        if (sb2.length() < 100) {
            return sb2;
        }
        return sb2.substring(0, 100);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzavl)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((zzavl) obj).zzo;
        if (str == null || !str.equals(this.zzo)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.zzo.hashCode();
    }

    public final String toString() {
        ArrayList arrayList = this.zzh;
        int i = this.zzl;
        int i2 = this.zzn;
        int i3 = this.zzk;
        String zzq = zzq(arrayList, 100);
        String zzq2 = zzq(this.zzi, 100);
        String str = this.zzo;
        String str2 = this.zzp;
        String str3 = this.zzq;
        StringBuilder t = hx2.t("ActivityContent fetchId: ", i, " score:", i2, " total_length:");
        t.append(i3);
        t.append("\n text: ");
        t.append(zzq);
        t.append("\n viewableText");
        p71.A(t, zzq2, "\n signture: ", str, "\n viewableSignture: ");
        t.append(str2);
        t.append("\n viewableSignatureForVertical: ");
        t.append(str3);
        return t.toString();
    }

    public final int zza(int i, int i2) {
        if (this.zzd) {
            return this.zzb;
        }
        return (i2 * this.zzb) + (i * this.zza);
    }

    public final int zzb() {
        return this.zzn;
    }

    public final int zzc() {
        return this.zzk;
    }

    public final String zzd() {
        return this.zzo;
    }

    public final String zze() {
        return this.zzp;
    }

    public final String zzf() {
        return this.zzq;
    }

    public final void zzg() {
        synchronized (this.zzg) {
            this.zzm--;
        }
    }

    public final void zzh() {
        synchronized (this.zzg) {
            this.zzm++;
        }
    }

    public final void zzi() {
        synchronized (this.zzg) {
            this.zzn -= 100;
        }
    }

    public final void zzj(int i) {
        this.zzl = i;
    }

    public final void zzk(String str, boolean z, float f, float f2, float f3, float f4) {
        zzp(str, z, f, f2, f3, f4);
    }

    public final void zzl(String str, boolean z, float f, float f2, float f3, float f4) {
        zzp(str, z, f, f2, f3, f4);
        synchronized (this.zzg) {
            if (this.zzm < 0) {
                zzcat.zze("ActivityContent: negative number of WebViews.");
            }
            zzm();
        }
    }

    public final void zzm() {
        synchronized (this.zzg) {
            int zza = zza(this.zzk, this.zzl);
            if (zza > this.zzn) {
                this.zzn = zza;
                if (!com.google.android.gms.ads.internal.zzt.zzo().zzh().zzN()) {
                    this.zzo = this.zze.zza(this.zzh);
                    this.zzp = this.zze.zza(this.zzi);
                }
                if (!com.google.android.gms.ads.internal.zzt.zzo().zzh().zzO()) {
                    this.zzq = this.zzf.zza(this.zzi, this.zzj);
                }
            }
        }
    }

    public final void zzn() {
        synchronized (this.zzg) {
            int zza = zza(this.zzk, this.zzl);
            if (zza > this.zzn) {
                this.zzn = zza;
            }
        }
    }

    public final boolean zzo() {
        boolean z;
        synchronized (this.zzg) {
            if (this.zzm == 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }
}
