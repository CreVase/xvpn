package com.google.android.gms.internal.ads;

import defpackage.hx2;
import defpackage.p71;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class zzgsr implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzgsr zzb = new zzgsn(zzguj.zzd);
    private static final zzgsq zzd;
    private int zzc = 0;

    static {
        int i = zzgsc.zza;
        zzd = new zzgsq(null);
        zza = new zzgsi();
    }

    private static zzgsr zzc(Iterator it, int i) {
        if (i > 0) {
            if (i == 1) {
                return (zzgsr) it.next();
            }
            int i2 = i >>> 1;
            zzgsr zzc = zzc(it, i2);
            zzgsr zzc2 = zzc(it, i - i2);
            if (Integer.MAX_VALUE - zzc.zzd() >= zzc2.zzd()) {
                return zzgwb.zzC(zzc, zzc2);
            }
            throw new IllegalArgumentException(hx2.n("ByteString would be too long: ", zzc.zzd(), "+", zzc2.zzd()));
        }
        throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
    }

    public static int zzq(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i >= 0) {
                if (i2 < i) {
                    throw new IndexOutOfBoundsException(hx2.n("Beginning index larger than ending index: ", i, ", ", i2));
                }
                throw new IndexOutOfBoundsException(hx2.n("End index: ", i2, " >= ", i3));
            }
            throw new IndexOutOfBoundsException(p71.k("Beginning index: ", i, " < 0"));
        }
        return i4;
    }

    public static zzgso zzt() {
        return new zzgso(128);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzgsr zzu(Iterable iterable) {
        int size;
        if (!(iterable instanceof Collection)) {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = iterable.size();
        }
        if (size == 0) {
            return zzb;
        }
        return zzc(iterable.iterator(), size);
    }

    public static zzgsr zzv(byte[] bArr, int i, int i2) {
        zzq(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzgsn(bArr2);
    }

    public static zzgsr zzw(String str) {
        return new zzgsn(str.getBytes(zzguj.zzb));
    }

    public static void zzy(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(hx2.m("Index < 0: ", i));
            }
            throw new ArrayIndexOutOfBoundsException(hx2.n("Index > length: ", i, ", ", i2));
        }
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int zzd2 = zzd();
            i = zzi(zzd2, 0, zzd2);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        if (zzd() <= 50) {
            concat = zzgwr.zza(this);
        } else {
            concat = zzgwr.zza(zzk(0, 47)).concat("...");
        }
        objArr[2] = concat;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public final byte[] zzA() {
        int zzd2 = zzd();
        if (zzd2 == 0) {
            return zzguj.zzd;
        }
        byte[] bArr = new byte[zzd2];
        zze(bArr, 0, 0, zzd2);
        return bArr;
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i, int i2, int i3);

    public abstract int zzf();

    public abstract boolean zzh();

    public abstract int zzi(int i, int i2, int i3);

    public abstract int zzj(int i, int i2, int i3);

    public abstract zzgsr zzk(int i, int i2);

    public abstract zzgsz zzl();

    public abstract String zzm(Charset charset);

    public abstract ByteBuffer zzn();

    public abstract void zzo(zzgsg zzgsgVar) throws IOException;

    public abstract boolean zzp();

    public final int zzr() {
        return this.zzc;
    }

    @Override // java.lang.Iterable
    /* renamed from: zzs, reason: merged with bridge method [inline-methods] */
    public zzgsl iterator() {
        return new zzgsh(this);
    }

    public final String zzx(Charset charset) {
        if (zzd() == 0) {
            return "";
        }
        return zzm(charset);
    }

    @Deprecated
    public final void zzz(byte[] bArr, int i, int i2, int i3) {
        zzq(0, i3, zzd());
        zzq(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            zze(bArr, 0, i2, i3);
        }
    }
}
