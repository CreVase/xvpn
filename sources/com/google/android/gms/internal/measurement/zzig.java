package com.google.android.gms.internal.measurement;

import defpackage.hx2;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class zzig extends zzhn {
    private static final Logger zzb = Logger.getLogger(zzig.class.getName());
    private static final boolean zzc = zzmg.zzc();
    zzij zza;

    /* loaded from: classes.dex */
    public static class zza extends zzig {
        private final byte[] zzb;
        private final int zzc;
        private final int zzd;
        private int zze;

        public zza(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                if ((i2 | 0 | (bArr.length - i2)) >= 0) {
                    this.zzb = bArr;
                    this.zzc = 0;
                    this.zze = 0;
                    this.zzd = i2;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)));
            }
            throw new NullPointerException("buffer");
        }

        private final void zzc(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.zzb, this.zze, i2);
                this.zze += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final int zza() {
            return this.zzd - this.zze;
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zzb(byte[] bArr, int i, int i2) throws IOException {
            zzc(i2);
            zzc(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zzd(int i, int i2) throws IOException {
            zzc(i, 0);
            zzc(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zza(byte b2) throws IOException {
            try {
                byte[] bArr = this.zzb;
                int i = this.zze;
                this.zze = i + 1;
                bArr[i] = b2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zzb(int i, int i2) throws IOException {
            zzc(i, 0);
            zzb(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zza(int i, boolean z) throws IOException {
            zzc(i, 0);
            zza(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zzb(int i) throws IOException {
            if (i >= 0) {
                zzc(i);
            } else {
                zzb(i);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zzc(int i, int i2) throws IOException {
            zzc((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zzc(int i) throws IOException {
            while ((i & (-128)) != 0) {
                try {
                    byte[] bArr = this.zzb;
                    int i2 = this.zze;
                    this.zze = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
                }
            }
            byte[] bArr2 = this.zzb;
            int i3 = this.zze;
            this.zze = i3 + 1;
            bArr2[i3] = (byte) i;
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zza(int i, zzhm zzhmVar) throws IOException {
            zzc(i, 2);
            zza(zzhmVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zzb(int i, zzhm zzhmVar) throws IOException {
            zzc(1, 3);
            zzd(2, i);
            zza(3, zzhmVar);
            zzc(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zza(zzhm zzhmVar) throws IOException {
            zzc(zzhmVar.zzb());
            zzhmVar.zza(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zza(int i, int i2) throws IOException {
            zzc(i, 5);
            zza(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zzb(int i, long j) throws IOException {
            zzc(i, 0);
            zzb(j);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zza(int i) throws IOException {
            try {
                byte[] bArr = this.zzb;
                int i2 = this.zze;
                int i3 = i2 + 1;
                bArr[i2] = (byte) i;
                int i4 = i3 + 1;
                bArr[i3] = (byte) (i >> 8);
                int i5 = i4 + 1;
                bArr[i4] = (byte) (i >> 16);
                this.zze = i5 + 1;
                bArr[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zzb(long j) throws IOException {
            if (zzig.zzc && zza() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.zzb;
                    int i = this.zze;
                    this.zze = i + 1;
                    zzmg.zza(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.zzb;
                int i2 = this.zze;
                this.zze = i2 + 1;
                zzmg.zza(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.zzb;
                    int i3 = this.zze;
                    this.zze = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
                }
            }
            byte[] bArr4 = this.zzb;
            int i4 = this.zze;
            this.zze = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zza(int i, long j) throws IOException {
            zzc(i, 1);
            zza(j);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zza(long j) throws IOException {
            try {
                byte[] bArr = this.zzb;
                int i = this.zze;
                int i2 = i + 1;
                bArr[i] = (byte) j;
                int i3 = i2 + 1;
                bArr[i2] = (byte) (j >> 8);
                int i4 = i3 + 1;
                bArr[i3] = (byte) (j >> 16);
                int i5 = i4 + 1;
                bArr[i4] = (byte) (j >> 24);
                int i6 = i5 + 1;
                bArr[i5] = (byte) (j >> 32);
                int i7 = i6 + 1;
                bArr[i6] = (byte) (j >> 40);
                int i8 = i7 + 1;
                bArr[i7] = (byte) (j >> 48);
                this.zze = i8 + 1;
                bArr[i8] = (byte) (j >> 56);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzhn
        public final void zza(byte[] bArr, int i, int i2) throws IOException {
            zzc(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zza(int i, zzkj zzkjVar, zzlb zzlbVar) throws IOException {
            zzc(i, 2);
            zzc(((zzhd) zzkjVar).zza(zzlbVar));
            zzlbVar.zza((zzlb) zzkjVar, (zzmw) this.zza);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zza(zzkj zzkjVar) throws IOException {
            zzc(zzkjVar.zzbw());
            zzkjVar.zza(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zza(int i, zzkj zzkjVar) throws IOException {
            zzc(1, 3);
            zzd(2, i);
            zzc(3, 2);
            zza(zzkjVar);
            zzc(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zza(int i, String str) throws IOException {
            zzc(i, 2);
            zza(str);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zza(String str) throws IOException {
            int i = this.zze;
            try {
                int zzj = zzig.zzj(str.length() * 3);
                int zzj2 = zzig.zzj(str.length());
                if (zzj2 == zzj) {
                    int i2 = i + zzj2;
                    this.zze = i2;
                    int zza = zzmh.zza(str, this.zzb, i2, zza());
                    this.zze = i;
                    zzc((zza - i) - zzj2);
                    this.zze = zza;
                    return;
                }
                zzc(zzmh.zza(str));
                this.zze = zzmh.zza(str, this.zzb, this.zze, zza());
            } catch (zzmk e) {
                this.zze = i;
                zza(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(e2);
            }
        }
    }

    public static int zza(double d) {
        return 8;
    }

    public static int zzb(int i, boolean z) {
        return zzj(i << 3) + 1;
    }

    public static int zzc(long j) {
        return 8;
    }

    public static int zzd(int i) {
        return zzf(i);
    }

    public static int zze(int i) {
        return 4;
    }

    public static int zzf(int i, int i2) {
        return zzj(i << 3) + 4;
    }

    public static int zzg(int i) {
        return 4;
    }

    public static int zzh(int i, int i2) {
        return zzj(i << 3) + 4;
    }

    private static long zzi(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int zzj(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    private static int zzl(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public abstract int zza();

    public abstract void zza(byte b2) throws IOException;

    public abstract void zza(int i) throws IOException;

    public abstract void zza(int i, int i2) throws IOException;

    public abstract void zza(int i, long j) throws IOException;

    public abstract void zza(int i, zzhm zzhmVar) throws IOException;

    public abstract void zza(int i, zzkj zzkjVar) throws IOException;

    public abstract void zza(int i, zzkj zzkjVar, zzlb zzlbVar) throws IOException;

    public abstract void zza(int i, String str) throws IOException;

    public abstract void zza(int i, boolean z) throws IOException;

    public abstract void zza(long j) throws IOException;

    public abstract void zza(zzhm zzhmVar) throws IOException;

    public abstract void zza(zzkj zzkjVar) throws IOException;

    public abstract void zza(String str) throws IOException;

    public abstract void zzb(int i) throws IOException;

    public abstract void zzb(int i, int i2) throws IOException;

    public abstract void zzb(int i, long j) throws IOException;

    public abstract void zzb(int i, zzhm zzhmVar) throws IOException;

    public abstract void zzb(long j) throws IOException;

    public abstract void zzb(byte[] bArr, int i, int i2) throws IOException;

    public abstract void zzc(int i) throws IOException;

    public abstract void zzc(int i, int i2) throws IOException;

    public abstract void zzd(int i, int i2) throws IOException;

    public final void zzk(int i, int i2) throws IOException {
        zzd(i, zzl(i2));
    }

    private zzig() {
    }

    public static int zza(float f) {
        return 4;
    }

    public static int zzb(zzhm zzhmVar) {
        int zzb2 = zzhmVar.zzb();
        return zzj(zzb2) + zzb2;
    }

    public static int zzd(int i, long j) {
        return zzg(j) + zzj(i << 3);
    }

    public static int zze(long j) {
        return 8;
    }

    public static int zzf(int i) {
        if (i >= 0) {
            return zzj(i);
        }
        return 10;
    }

    public static int zzg(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int zzh(int i) {
        return zzj(zzl(i));
    }

    public static int zzi(int i, int i2) {
        return zzj(zzl(i2)) + zzj(i << 3);
    }

    public static int zzj(int i, int i2) {
        return zzj(i2) + zzj(i << 3);
    }

    public final void zzk(int i) throws IOException {
        zzc(zzl(i));
    }

    public static int zza(boolean z) {
        return 1;
    }

    public static int zzc(int i, zzhm zzhmVar) {
        int zzj = zzj(i << 3);
        int zzb2 = zzhmVar.zzb();
        return zzj(zzb2) + zzb2 + zzj;
    }

    public static int zze(int i, int i2) {
        return zzf(i2) + zzj(i << 3);
    }

    public static int zzf(int i, long j) {
        return zzg(zzi(j)) + zzj(i << 3);
    }

    public static int zzg(int i, int i2) {
        return zzf(i2) + zzj(i << 3);
    }

    public final void zzh(int i, long j) throws IOException {
        zzb(i, zzi(j));
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        return zzj(length) + length;
    }

    @Deprecated
    public static int zzb(int i, zzkj zzkjVar, zzlb zzlbVar) {
        return ((zzhd) zzkjVar).zza(zzlbVar) + (zzj(i << 3) << 1);
    }

    public static int zzd(long j) {
        return zzg(j);
    }

    public static int zzi(int i) {
        return zzj(i << 3);
    }

    public final void zzh(long j) throws IOException {
        zzb(zzi(j));
    }

    public static int zzd(int i, zzhm zzhmVar) {
        return zzc(3, zzhmVar) + zzj(2, i) + (zzj(8) << 1);
    }

    public static int zze(int i, long j) {
        return zzj(i << 3) + 8;
    }

    public static int zzf(long j) {
        return zzg(zzi(j));
    }

    public static int zzg(int i, long j) {
        return zzg(j) + zzj(i << 3);
    }

    public static int zza(int i, double d) {
        return zzj(i << 3) + 8;
    }

    @Deprecated
    public static int zzb(zzkj zzkjVar) {
        return zzkjVar.zzbw();
    }

    public static int zzc(int i, long j) {
        return zzj(i << 3) + 8;
    }

    public static int zza(int i, float f) {
        return zzj(i << 3) + 4;
    }

    public static int zzb(int i, zzjn zzjnVar) {
        int zzj = zzj(i << 3);
        int zzb2 = zzjnVar.zzb();
        return zzj(zzb2) + zzb2 + zzj;
    }

    public static int zzc(int i, zzkj zzkjVar, zzlb zzlbVar) {
        return zza(zzkjVar, zzlbVar) + zzj(i << 3);
    }

    public static int zza(int i, zzjn zzjnVar) {
        return zzb(3, zzjnVar) + zzj(2, i) + (zzj(8) << 1);
    }

    public static int zzc(zzkj zzkjVar) {
        int zzbw = zzkjVar.zzbw();
        return zzj(zzbw) + zzbw;
    }

    /* loaded from: classes.dex */
    public static class zzb extends IOException {
        public zzb(String str, Throwable th) {
            super(hx2.p("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
        }

        public zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public zzb(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    public static int zzb(int i, zzkj zzkjVar) {
        return zzc(zzkjVar) + zzj(24) + zzj(2, i) + (zzj(8) << 1);
    }

    public static int zza(zzjn zzjnVar) {
        int zzb2 = zzjnVar.zzb();
        return zzj(zzb2) + zzb2;
    }

    public static int zza(zzkj zzkjVar, zzlb zzlbVar) {
        int zza2 = ((zzhd) zzkjVar).zza(zzlbVar);
        return zzj(zza2) + zza2;
    }

    public static int zzb(int i, String str) {
        return zzb(str) + zzj(i << 3);
    }

    public final void zza(String str, zzmk zzmkVar) throws IOException {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzmkVar);
        byte[] bytes = str.getBytes(zziz.zza);
        try {
            zzc(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzb(e);
        }
    }

    public static int zzb(String str) {
        int length;
        try {
            length = zzmh.zza(str);
        } catch (zzmk unused) {
            length = str.getBytes(zziz.zza).length;
        }
        return zzj(length) + length;
    }

    public static zzig zzb(byte[] bArr) {
        return new zza(bArr, 0, bArr.length);
    }

    public final void zzb() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzb(boolean z) throws IOException {
        zza(z ? (byte) 1 : (byte) 0);
    }

    public final void zzb(int i, double d) throws IOException {
        zza(i, Double.doubleToRawLongBits(d));
    }

    public final void zzb(double d) throws IOException {
        zza(Double.doubleToRawLongBits(d));
    }

    public final void zzb(int i, float f) throws IOException {
        zza(i, Float.floatToRawIntBits(f));
    }

    public final void zzb(float f) throws IOException {
        zza(Float.floatToRawIntBits(f));
    }
}
