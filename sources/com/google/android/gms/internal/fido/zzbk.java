package com.google.android.gms.internal.fido;

import java.io.IOException;
import java.math.RoundingMode;

/* loaded from: classes.dex */
class zzbk extends zzbl {
    final zzbh zzb;
    final Character zzc;

    public zzbk(zzbh zzbhVar, Character ch) {
        this.zzb = zzbhVar;
        if (ch == null || !zzbhVar.zzb(ch.charValue())) {
            this.zzc = ch;
            return;
        }
        throw new IllegalArgumentException(zzat.zza("Padding character %s was already in alphabet", ch));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbk) {
            zzbk zzbkVar = (zzbk) obj;
            if (this.zzb.equals(zzbkVar.zzb)) {
                Character ch = this.zzc;
                Character ch2 = zzbkVar.zzc;
                if (ch != ch2) {
                    if (ch != null && ch.equals(ch2)) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.zzb.hashCode();
        Character ch = this.zzc;
        if (ch == null) {
            hashCode = 0;
        } else {
            hashCode = ch.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.zzb);
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.zzc);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.fido.zzbl
    public void zza(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        zzas.zze(0, i2, bArr.length);
        while (i3 < i2) {
            zzc(appendable, bArr, i3, Math.min(this.zzb.zzd, i2 - i3));
            i3 += this.zzb.zzd;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzbl
    public final int zzb(int i) {
        zzbh zzbhVar = this.zzb;
        return zzbn.zza(i, zzbhVar.zzd, RoundingMode.CEILING) * zzbhVar.zzc;
    }

    public final void zzc(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        boolean z;
        zzas.zze(i, i + i2, bArr.length);
        int i3 = 0;
        if (i2 <= this.zzb.zzd) {
            z = true;
        } else {
            z = false;
        }
        zzas.zzc(z);
        long j = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            j = (j | (bArr[i + i4] & 255)) << 8;
        }
        int i5 = ((i2 + 1) * 8) - this.zzb.zzb;
        while (i3 < i2 * 8) {
            zzbh zzbhVar = this.zzb;
            appendable.append(zzbhVar.zza(zzbhVar.zza & ((int) (j >>> (i5 - i3)))));
            i3 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i3 < this.zzb.zzd * 8) {
                appendable.append(this.zzc.charValue());
                i3 += this.zzb.zzb;
            }
        }
    }

    public zzbk(String str, String str2, Character ch) {
        this(new zzbh(str, str2.toCharArray()), ch);
    }
}
