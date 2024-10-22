package com.google.android.gms.internal.measurement;

import defpackage.hx2;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zzhw extends zzhx {
    protected final byte[] zzb;

    public zzhw(byte[] bArr) {
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzhm
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzhm) || zzb() != ((zzhm) obj).zzb()) {
            return false;
        }
        if (zzb() == 0) {
            return true;
        }
        if (obj instanceof zzhw) {
            zzhw zzhwVar = (zzhw) obj;
            int zza = zza();
            int zza2 = zzhwVar.zza();
            if (zza != 0 && zza2 != 0 && zza != zza2) {
                return false;
            }
            return zza(zzhwVar, 0, zzb());
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzhm
    public byte zza(int i) {
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzhm
    public byte zzb(int i) {
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzhm
    public final boolean zzd() {
        int zze = zze();
        return zzmh.zzc(this.zzb, zze, zzb() + zze);
    }

    public int zze() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzhm
    public final zzhm zza(int i, int i2) {
        int zza = zzhm.zza(0, i2, zzb());
        if (zza == 0) {
            return zzhm.zza;
        }
        return new zzhq(this.zzb, zze(), zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzhm
    public final int zzb(int i, int i2, int i3) {
        return zziz.zza(i, this.zzb, zze(), i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzhm
    public int zzb() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzhm
    public final String zza(Charset charset) {
        return new String(this.zzb, zze(), zzb(), charset);
    }

    @Override // com.google.android.gms.internal.measurement.zzhm
    public final void zza(zzhn zzhnVar) throws IOException {
        zzhnVar.zza(this.zzb, zze(), zzb());
    }

    @Override // com.google.android.gms.internal.measurement.zzhx
    public final boolean zza(zzhm zzhmVar, int i, int i2) {
        if (i2 <= zzhmVar.zzb()) {
            if (i2 <= zzhmVar.zzb()) {
                if (zzhmVar instanceof zzhw) {
                    zzhw zzhwVar = (zzhw) zzhmVar;
                    byte[] bArr = this.zzb;
                    byte[] bArr2 = zzhwVar.zzb;
                    int zze = zze() + i2;
                    int zze2 = zze();
                    int zze3 = zzhwVar.zze();
                    while (zze2 < zze) {
                        if (bArr[zze2] != bArr2[zze3]) {
                            return false;
                        }
                        zze2++;
                        zze3++;
                    }
                    return true;
                }
                return zzhmVar.zza(0, i2).equals(zza(0, i2));
            }
            throw new IllegalArgumentException(hx2.n("Ran off end of other: 0, ", i2, ", ", zzhmVar.zzb()));
        }
        throw new IllegalArgumentException("Length too large: " + i2 + zzb());
    }
}
