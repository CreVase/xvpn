package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zzfvw extends zzfvl {
    Object[] zzd;
    private int zze;

    public zzfvw() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzfvl, com.google.android.gms.internal.ads.zzfvm
    public final /* bridge */ /* synthetic */ zzfvm zzb(Object obj) {
        zzf(obj);
        return this;
    }

    public final zzfvw zzf(Object obj) {
        obj.getClass();
        if (this.zzd != null) {
            int zzh = zzfvx.zzh(this.zzb);
            int length = this.zzd.length;
            if (zzh <= length) {
                int hashCode = obj.hashCode();
                int zza = zzfvk.zza(hashCode);
                while (true) {
                    Object[] objArr = this.zzd;
                    int i = zza & (length - 1);
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        objArr[i] = obj;
                        this.zze += hashCode;
                        super.zza(obj);
                        break;
                    }
                    if (obj2.equals(obj)) {
                        break;
                    }
                    zza = i + 1;
                }
                return this;
            }
        }
        this.zzd = null;
        super.zza(obj);
        return this;
    }

    public final zzfvw zzg(Iterable iterable) {
        iterable.getClass();
        if (this.zzd != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                zzf(it.next());
            }
        } else {
            super.zzc(iterable);
        }
        return this;
    }

    public final zzfvx zzh() {
        zzfvx zzs;
        boolean zzt;
        int i = this.zzb;
        if (i != 0) {
            if (i != 1) {
                if (this.zzd != null && zzfvx.zzh(i) == this.zzd.length) {
                    int i2 = this.zzb;
                    Object[] objArr = this.zza;
                    zzt = zzfvx.zzt(i2, objArr.length);
                    if (zzt) {
                        objArr = Arrays.copyOf(objArr, i2);
                    }
                    zzs = new zzfxi(objArr, this.zze, this.zzd, r6.length - 1, this.zzb);
                } else {
                    zzs = zzfvx.zzs(this.zzb, this.zza);
                    this.zzb = zzs.size();
                }
                this.zzc = true;
                this.zzd = null;
                return zzs;
            }
            Object obj = this.zza[0];
            obj.getClass();
            return new zzfxp(obj);
        }
        return zzfxi.zza;
    }

    public zzfvw(int i) {
        super(i);
        this.zzd = new Object[zzfvx.zzh(i)];
    }
}
