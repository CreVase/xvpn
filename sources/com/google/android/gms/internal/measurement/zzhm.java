package com.google.android.gms.internal.measurement;

import defpackage.hx2;
import defpackage.p71;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class zzhm implements Serializable, Iterable<Byte> {
    public static final zzhm zza = new zzhw(zziz.zzb);
    private static final zzht zzb = new zzhz();
    private static final Comparator<zzhm> zzc = new zzho();
    private int zzd = 0;

    public static /* synthetic */ int zza(byte b2) {
        return b2 & 255;
    }

    public static zzhv zzc(int i) {
        return new zzhv(i);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zzd;
        if (i == 0) {
            int zzb2 = zzb();
            i = zzb(zzb2, 0, zzb2);
            if (i == 0) {
                i = 1;
            }
            this.zzd = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzhp(this);
    }

    public final String toString() {
        String l;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzb());
        if (zzb() <= 50) {
            l = zzlw.zza(this);
        } else {
            l = p71.l(zzlw.zza(zza(0, 47)), "...");
        }
        objArr[2] = l;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i);

    public abstract zzhm zza(int i, int i2);

    public abstract String zza(Charset charset);

    public abstract void zza(zzhn zzhnVar) throws IOException;

    public abstract byte zzb(int i);

    public abstract int zzb();

    public abstract int zzb(int i, int i2, int i3);

    public abstract boolean zzd();

    public static int zza(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(p71.k("Beginning index: ", i, " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(hx2.n("Beginning index larger than ending index: ", i, ", ", i2));
        }
        throw new IndexOutOfBoundsException(hx2.n("End index: ", i2, " >= ", i3));
    }

    public final String zzc() {
        return zzb() == 0 ? "" : zza(zziz.zza);
    }

    public final int zza() {
        return this.zzd;
    }

    public static zzhm zza(byte[] bArr, int i, int i2) {
        zza(i, i + i2, bArr.length);
        return new zzhw(zzb.zza(bArr, i, i2));
    }

    public static zzhm zza(String str) {
        return new zzhw(str.getBytes(zziz.zza));
    }

    public static zzhm zza(byte[] bArr) {
        return new zzhw(bArr);
    }
}
