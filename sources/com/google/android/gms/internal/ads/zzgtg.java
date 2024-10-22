package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class zzgtg extends zzgsg {
    private static final Logger zza = Logger.getLogger(zzgtg.class.getName());
    private static final boolean zzb = zzgxd.zzA();
    public static final /* synthetic */ int zzf = 0;
    zzgth zze;

    private zzgtg() {
    }

    public /* synthetic */ zzgtg(zzgtf zzgtfVar) {
    }

    public static int zzA(int i) {
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

    public static int zzB(long j) {
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
            j >>>= 14;
            i += 2;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static zzgtg zzC(byte[] bArr, int i, int i2) {
        return new zzgtc(bArr, 0, i2);
    }

    @Deprecated
    public static int zzw(int i, zzgvj zzgvjVar, zzgwc zzgwcVar) {
        int zzat = ((zzgsa) zzgvjVar).zzat(zzgwcVar);
        int zzA = zzA(i << 3);
        return zzA + zzA + zzat;
    }

    public static int zzx(int i) {
        if (i >= 0) {
            return zzA(i);
        }
        return 10;
    }

    public static int zzy(zzgvj zzgvjVar, zzgwc zzgwcVar) {
        int zzat = ((zzgsa) zzgvjVar).zzat(zzgwcVar);
        return zzA(zzat) + zzat;
    }

    public static int zzz(String str) {
        int length;
        try {
            length = zzgxi.zze(str);
        } catch (zzgxh unused) {
            length = str.getBytes(zzguj.zzb).length;
        }
        return zzA(length) + length;
    }

    public final void zzD() {
        if (zzb() == 0) {
        } else {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzE(String str, zzgxh zzgxhVar) throws IOException {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzgxhVar);
        byte[] bytes = str.getBytes(zzguj.zzb);
        try {
            int length = bytes.length;
            zzs(length);
            zza(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzgtd(e);
        }
    }

    public abstract void zzI() throws IOException;

    public abstract void zzJ(byte b2) throws IOException;

    public abstract void zzK(int i, boolean z) throws IOException;

    public abstract void zzL(int i, zzgsr zzgsrVar) throws IOException;

    @Override // com.google.android.gms.internal.ads.zzgsg
    public abstract void zza(byte[] bArr, int i, int i2) throws IOException;

    public abstract int zzb();

    public abstract void zzh(int i, int i2) throws IOException;

    public abstract void zzi(int i) throws IOException;

    public abstract void zzj(int i, long j) throws IOException;

    public abstract void zzk(long j) throws IOException;

    public abstract void zzl(int i, int i2) throws IOException;

    public abstract void zzm(int i) throws IOException;

    public abstract void zzn(int i, zzgvj zzgvjVar, zzgwc zzgwcVar) throws IOException;

    public abstract void zzo(int i, String str) throws IOException;

    public abstract void zzq(int i, int i2) throws IOException;

    public abstract void zzr(int i, int i2) throws IOException;

    public abstract void zzs(int i) throws IOException;

    public abstract void zzt(int i, long j) throws IOException;

    public abstract void zzu(long j) throws IOException;
}
