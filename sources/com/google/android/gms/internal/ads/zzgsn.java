package com.google.android.gms.internal.ads;

import defpackage.hx2;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zzgsn extends zzgsm {
    protected final byte[] zza;

    public zzgsn(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgsr
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgsr) || zzd() != ((zzgsr) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (obj instanceof zzgsn) {
            zzgsn zzgsnVar = (zzgsn) obj;
            int zzr = zzr();
            int zzr2 = zzgsnVar.zzr();
            if (zzr != 0 && zzr2 != 0 && zzr != zzr2) {
                return false;
            }
            return zzg(zzgsnVar, 0, zzd());
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgsr
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgsr
    public byte zzb(int i) {
        return this.zza[i];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgsr
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.ads.zzgsr
    public void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, i, bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgsm
    public final boolean zzg(zzgsr zzgsrVar, int i, int i2) {
        if (i2 <= zzgsrVar.zzd()) {
            int i3 = i + i2;
            if (i3 <= zzgsrVar.zzd()) {
                if (zzgsrVar instanceof zzgsn) {
                    zzgsn zzgsnVar = (zzgsn) zzgsrVar;
                    byte[] bArr = this.zza;
                    byte[] bArr2 = zzgsnVar.zza;
                    int zzc = zzc() + i2;
                    int zzc2 = zzc();
                    int zzc3 = zzgsnVar.zzc() + i;
                    while (zzc2 < zzc) {
                        if (bArr[zzc2] != bArr2[zzc3]) {
                            return false;
                        }
                        zzc2++;
                        zzc3++;
                    }
                    return true;
                }
                return zzgsrVar.zzk(i, i3).equals(zzk(0, i2));
            }
            int zzd = zzgsrVar.zzd();
            StringBuilder t = hx2.t("Ran off end of other: ", i, ", ", i2, ", ");
            t.append(zzd);
            throw new IllegalArgumentException(t.toString());
        }
        throw new IllegalArgumentException("Length too large: " + i2 + zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgsr
    public final int zzi(int i, int i2, int i3) {
        return zzguj.zzb(i, this.zza, zzc() + i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgsr
    public final int zzj(int i, int i2, int i3) {
        int zzc = zzc() + i2;
        return zzgxi.zzf(i, this.zza, zzc, i3 + zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgsr
    public final zzgsr zzk(int i, int i2) {
        int zzq = zzgsr.zzq(i, i2, zzd());
        if (zzq == 0) {
            return zzgsr.zzb;
        }
        return new zzgsk(this.zza, zzc() + i, zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzgsr
    public final zzgsz zzl() {
        return zzgsz.zzI(this.zza, zzc(), zzd(), true);
    }

    @Override // com.google.android.gms.internal.ads.zzgsr
    public final String zzm(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgsr
    public final ByteBuffer zzn() {
        return ByteBuffer.wrap(this.zza, zzc(), zzd()).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzgsr
    public final void zzo(zzgsg zzgsgVar) throws IOException {
        zzgsgVar.zza(this.zza, zzc(), zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgsr
    public final boolean zzp() {
        int zzc = zzc();
        return zzgxi.zzj(this.zza, zzc, zzd() + zzc);
    }
}
