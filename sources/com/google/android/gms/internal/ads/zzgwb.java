package com.google.android.gms.internal.ads;

import com.google.protobuf.v;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgwb extends zzgsr {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    private final zzgsr zzd;
    private final zzgsr zze;
    private final int zzf;
    private final int zzg;

    public static zzgsr zzC(zzgsr zzgsrVar, zzgsr zzgsrVar2) {
        if (zzgsrVar2.zzd() == 0) {
            return zzgsrVar;
        }
        if (zzgsrVar.zzd() == 0) {
            return zzgsrVar2;
        }
        int zzd = zzgsrVar2.zzd() + zzgsrVar.zzd();
        if (zzd < 128) {
            return zzD(zzgsrVar, zzgsrVar2);
        }
        if (zzgsrVar instanceof zzgwb) {
            zzgwb zzgwbVar = (zzgwb) zzgsrVar;
            if (zzgsrVar2.zzd() + zzgwbVar.zze.zzd() < 128) {
                return new zzgwb(zzgwbVar.zzd, zzD(zzgwbVar.zze, zzgsrVar2));
            }
            if (zzgwbVar.zzd.zzf() > zzgwbVar.zze.zzf() && zzgwbVar.zzg > zzgsrVar2.zzf()) {
                return new zzgwb(zzgwbVar.zzd, new zzgwb(zzgwbVar.zze, zzgsrVar2));
            }
        }
        if (zzd >= zzc(Math.max(zzgsrVar.zzf(), zzgsrVar2.zzf()) + 1)) {
            return new zzgwb(zzgsrVar, zzgsrVar2);
        }
        return zzgvx.zza(new zzgvx(null), zzgsrVar, zzgsrVar2);
    }

    private static zzgsr zzD(zzgsr zzgsrVar, zzgsr zzgsrVar2) {
        int zzd = zzgsrVar.zzd();
        int zzd2 = zzgsrVar2.zzd();
        byte[] bArr = new byte[zzd + zzd2];
        zzgsrVar.zzz(bArr, 0, 0, zzd);
        zzgsrVar2.zzz(bArr, 0, zzd, zzd2);
        return new zzgsn(bArr);
    }

    public static int zzc(int i) {
        int[] iArr = zza;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgsr
    public final boolean equals(Object obj) {
        boolean zzg;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgsr)) {
            return false;
        }
        zzgsr zzgsrVar = (zzgsr) obj;
        if (this.zzc != zzgsrVar.zzd()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int zzr = zzr();
        int zzr2 = zzgsrVar.zzr();
        if (zzr != 0 && zzr2 != 0 && zzr != zzr2) {
            return false;
        }
        zzgvy zzgvyVar = null;
        zzgvz zzgvzVar = new zzgvz(this, zzgvyVar);
        zzgsm next = zzgvzVar.next();
        zzgvz zzgvzVar2 = new zzgvz(zzgsrVar, zzgvyVar);
        zzgsm next2 = zzgvzVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int zzd = next.zzd() - i;
            int zzd2 = next2.zzd() - i2;
            int min = Math.min(zzd, zzd2);
            if (i == 0) {
                zzg = next.zzg(next2, i2, min);
            } else {
                zzg = next2.zzg(next, i, min);
            }
            if (!zzg) {
                return false;
            }
            i3 += min;
            int i4 = this.zzc;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == zzd) {
                next = zzgvzVar.next();
                i = 0;
            } else {
                i += min;
                next = next;
            }
            if (min == zzd2) {
                next2 = zzgvzVar2.next();
                i2 = 0;
            } else {
                i2 += min;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgsr, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzgvv(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgsr
    public final byte zza(int i) {
        zzgsr.zzy(i, this.zzc);
        return zzb(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgsr
    public final byte zzb(int i) {
        int i2 = this.zzf;
        if (i < i2) {
            return this.zzd.zzb(i);
        }
        return this.zze.zzb(i - i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgsr
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgsr
    public final void zze(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            this.zzd.zze(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.zze.zze(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.zzd.zze(bArr, i, i2, i6);
            this.zze.zze(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgsr
    public final int zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgsr
    public final boolean zzh() {
        if (this.zzc >= zzc(this.zzg)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgsr
    public final int zzi(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            return this.zzd.zzi(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zze.zzi(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zze.zzi(this.zzd.zzi(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.android.gms.internal.ads.zzgsr
    public final int zzj(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            return this.zzd.zzj(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zze.zzj(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zze.zzj(this.zzd.zzj(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.android.gms.internal.ads.zzgsr
    public final zzgsr zzk(int i, int i2) {
        int zzq = zzgsr.zzq(i, i2, this.zzc);
        if (zzq == 0) {
            return zzgsr.zzb;
        }
        if (zzq == this.zzc) {
            return this;
        }
        int i3 = this.zzf;
        if (i2 <= i3) {
            return this.zzd.zzk(i, i2);
        }
        if (i >= i3) {
            return this.zze.zzk(i - i3, i2 - i3);
        }
        zzgsr zzgsrVar = this.zzd;
        return new zzgwb(zzgsrVar.zzk(i, zzgsrVar.zzd()), this.zze.zzk(0, i2 - this.zzf));
    }

    @Override // com.google.android.gms.internal.ads.zzgsr
    public final zzgsz zzl() {
        ArrayList arrayList = new ArrayList();
        byte b2 = 0;
        zzgvz zzgvzVar = new zzgvz(this, null);
        while (zzgvzVar.hasNext()) {
            arrayList.add(zzgvzVar.next().zzn());
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            i2 += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                i |= 1;
            } else if (byteBuffer.isDirect()) {
                i |= 2;
            } else {
                i |= 4;
            }
        }
        if (i == 2) {
            return new zzgsv(arrayList, i2, true, b2 == true ? 1 : 0);
        }
        return zzgsz.zzH(new zzgum(arrayList), v.DEFAULT_BUFFER_SIZE);
    }

    @Override // com.google.android.gms.internal.ads.zzgsr
    public final String zzm(Charset charset) {
        return new String(zzA(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgsr
    public final ByteBuffer zzn() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgsr
    public final void zzo(zzgsg zzgsgVar) throws IOException {
        this.zzd.zzo(zzgsgVar);
        this.zze.zzo(zzgsgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgsr
    public final boolean zzp() {
        zzgsr zzgsrVar = this.zzd;
        zzgsr zzgsrVar2 = this.zze;
        if (zzgsrVar2.zzj(zzgsrVar.zzj(0, 0, this.zzf), 0, zzgsrVar2.zzd()) != 0) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgsr
    /* renamed from: zzs */
    public final zzgsl iterator() {
        return new zzgvv(this);
    }

    private zzgwb(zzgsr zzgsrVar, zzgsr zzgsrVar2) {
        this.zzd = zzgsrVar;
        this.zze = zzgsrVar2;
        int zzd = zzgsrVar.zzd();
        this.zzf = zzd;
        this.zzc = zzgsrVar2.zzd() + zzd;
        this.zzg = Math.max(zzgsrVar.zzf(), zzgsrVar2.zzf()) + 1;
    }
}
