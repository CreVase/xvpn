package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzvh {
    private final zzfb zza = new zzfb(32);
    private zzvg zzb;
    private zzvg zzc;
    private zzvg zzd;
    private long zze;
    private final zzxz zzf;

    public zzvh(zzxz zzxzVar) {
        this.zzf = zzxzVar;
        zzvg zzvgVar = new zzvg(0L, 65536);
        this.zzb = zzvgVar;
        this.zzc = zzvgVar;
        this.zzd = zzvgVar;
    }

    private final int zzi(int i) {
        zzvg zzvgVar = this.zzd;
        if (zzvgVar.zzc == null) {
            zzxs zzb = this.zzf.zzb();
            zzvg zzvgVar2 = new zzvg(this.zzd.zzb, 65536);
            zzvgVar.zzc = zzb;
            zzvgVar.zzd = zzvgVar2;
        }
        return Math.min(i, (int) (this.zzd.zzb - this.zze));
    }

    private static zzvg zzj(zzvg zzvgVar, long j) {
        while (j >= zzvgVar.zzb) {
            zzvgVar = zzvgVar.zzd;
        }
        return zzvgVar;
    }

    private static zzvg zzk(zzvg zzvgVar, long j, ByteBuffer byteBuffer, int i) {
        zzvg zzj = zzj(zzvgVar, j);
        while (i > 0) {
            int min = Math.min(i, (int) (zzj.zzb - j));
            byteBuffer.put(zzj.zzc.zza, zzj.zza(j), min);
            i -= min;
            j += min;
            if (j == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zzvg zzl(zzvg zzvgVar, long j, byte[] bArr, int i) {
        zzvg zzj = zzj(zzvgVar, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (zzj.zzb - j));
            System.arraycopy(zzj.zzc.zza, zzj.zza(j), bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zzvg zzm(zzvg zzvgVar, zzht zzhtVar, zzvj zzvjVar, zzfb zzfbVar) {
        zzvg zzvgVar2;
        boolean z;
        int i;
        if (zzhtVar.zzk()) {
            long j = zzvjVar.zzb;
            zzfbVar.zzD(1);
            zzvg zzl = zzl(zzvgVar, j, zzfbVar.zzI(), 1);
            long j2 = j + 1;
            byte b2 = zzfbVar.zzI()[0];
            int i2 = b2 & 128;
            int i3 = b2 & Byte.MAX_VALUE;
            zzhq zzhqVar = zzhtVar.zzb;
            byte[] bArr = zzhqVar.zza;
            if (bArr == null) {
                zzhqVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            if (i2 != 0) {
                z = true;
            } else {
                z = false;
            }
            zzvgVar2 = zzl(zzl, j2, zzhqVar.zza, i3);
            long j3 = j2 + i3;
            if (z) {
                zzfbVar.zzD(2);
                zzvgVar2 = zzl(zzvgVar2, j3, zzfbVar.zzI(), 2);
                j3 += 2;
                i = zzfbVar.zzp();
            } else {
                i = 1;
            }
            int[] iArr = zzhqVar.zzd;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzhqVar.zze;
            if (iArr3 == null || iArr3.length < i) {
                iArr3 = new int[i];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i4 = i * 6;
                zzfbVar.zzD(i4);
                zzvgVar2 = zzl(zzvgVar2, j3, zzfbVar.zzI(), i4);
                j3 += i4;
                zzfbVar.zzG(0);
                for (int i5 = 0; i5 < i; i5++) {
                    iArr2[i5] = zzfbVar.zzp();
                    iArr4[i5] = zzfbVar.zzo();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzvjVar.zza - ((int) (j3 - zzvjVar.zzb));
            }
            zzacr zzacrVar = zzvjVar.zzc;
            int i6 = zzfk.zza;
            zzhqVar.zzc(i, iArr2, iArr4, zzacrVar.zzb, zzhqVar.zza, zzacrVar.zza, zzacrVar.zzc, zzacrVar.zzd);
            long j4 = zzvjVar.zzb;
            int i7 = (int) (j3 - j4);
            zzvjVar.zzb = j4 + i7;
            zzvjVar.zza -= i7;
        } else {
            zzvgVar2 = zzvgVar;
        }
        if (zzhtVar.zze()) {
            zzfbVar.zzD(4);
            zzvg zzl2 = zzl(zzvgVar2, zzvjVar.zzb, zzfbVar.zzI(), 4);
            int zzo = zzfbVar.zzo();
            zzvjVar.zzb += 4;
            zzvjVar.zza -= 4;
            zzhtVar.zzi(zzo);
            zzvg zzk = zzk(zzl2, zzvjVar.zzb, zzhtVar.zzc, zzo);
            zzvjVar.zzb += zzo;
            int i8 = zzvjVar.zza - zzo;
            zzvjVar.zza = i8;
            ByteBuffer byteBuffer = zzhtVar.zzf;
            if (byteBuffer != null && byteBuffer.capacity() >= i8) {
                zzhtVar.zzf.clear();
            } else {
                zzhtVar.zzf = ByteBuffer.allocate(i8);
            }
            return zzk(zzk, zzvjVar.zzb, zzhtVar.zzf, zzvjVar.zza);
        }
        zzhtVar.zzi(zzvjVar.zza);
        return zzk(zzvgVar2, zzvjVar.zzb, zzhtVar.zzc, zzvjVar.zza);
    }

    private final void zzn(int i) {
        long j = this.zze + i;
        this.zze = j;
        zzvg zzvgVar = this.zzd;
        if (j == zzvgVar.zzb) {
            this.zzd = zzvgVar.zzd;
        }
    }

    public final int zza(zzt zztVar, int i, boolean z) throws IOException {
        int zzi = zzi(i);
        zzvg zzvgVar = this.zzd;
        int zza = zztVar.zza(zzvgVar.zzc.zza, zzvgVar.zza(this.zze), zzi);
        if (zza == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        zzn(zza);
        return zza;
    }

    public final long zzb() {
        return this.zze;
    }

    public final void zzc(long j) {
        zzvg zzvgVar;
        if (j != -1) {
            while (true) {
                zzvgVar = this.zzb;
                if (j < zzvgVar.zzb) {
                    break;
                }
                this.zzf.zzc(zzvgVar.zzc);
                this.zzb = this.zzb.zzb();
            }
            if (this.zzc.zza < zzvgVar.zza) {
                this.zzc = zzvgVar;
            }
        }
    }

    public final void zzd(zzht zzhtVar, zzvj zzvjVar) {
        zzm(this.zzc, zzhtVar, zzvjVar, this.zza);
    }

    public final void zze(zzht zzhtVar, zzvj zzvjVar) {
        this.zzc = zzm(this.zzc, zzhtVar, zzvjVar, this.zza);
    }

    public final void zzf() {
        zzvg zzvgVar = this.zzb;
        if (zzvgVar.zzc != null) {
            this.zzf.zzd(zzvgVar);
            zzvgVar.zzb();
        }
        this.zzb.zze(0L, 65536);
        zzvg zzvgVar2 = this.zzb;
        this.zzc = zzvgVar2;
        this.zzd = zzvgVar2;
        this.zze = 0L;
        this.zzf.zzg();
    }

    public final void zzg() {
        this.zzc = this.zzb;
    }

    public final void zzh(zzfb zzfbVar, int i) {
        while (i > 0) {
            int zzi = zzi(i);
            zzvg zzvgVar = this.zzd;
            zzfbVar.zzC(zzvgVar.zzc.zza, zzvgVar.zza(this.zze), zzi);
            i -= zzi;
            zzn(zzi);
        }
    }
}
