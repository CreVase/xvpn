package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzaja implements zzaje {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final zzfa zzc = new zzfa(new byte[7], 7);
    private final zzfb zzd = new zzfb(Arrays.copyOf(zza, 10));
    private final String zze;
    private String zzf;
    private zzacs zzg;
    private zzacs zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private boolean zzq;
    private long zzr;
    private int zzs;
    private long zzt;
    private zzacs zzu;
    private long zzv;

    public zzaja(boolean z, String str) {
        zzh();
        this.zzn = -1;
        this.zzo = -1;
        this.zzr = -9223372036854775807L;
        this.zzt = -9223372036854775807L;
        this.zzb = z;
        this.zze = str;
    }

    public static boolean zzf(int i) {
        return (i & 65526) == 65520;
    }

    private final void zzg() {
        this.zzm = false;
        zzh();
    }

    private final void zzh() {
        this.zzi = 0;
        this.zzj = 0;
        this.zzk = UserVerificationMethods.USER_VERIFY_HANDPRINT;
    }

    private final void zzi() {
        this.zzi = 3;
        this.zzj = 0;
    }

    private final void zzj(zzacs zzacsVar, long j, int i, int i2) {
        this.zzi = 4;
        this.zzj = i;
        this.zzu = zzacsVar;
        this.zzv = j;
        this.zzs = i2;
    }

    private final boolean zzk(zzfb zzfbVar, byte[] bArr, int i) {
        int min = Math.min(zzfbVar.zza(), i - this.zzj);
        zzfbVar.zzC(bArr, this.zzj, min);
        int i2 = this.zzj + min;
        this.zzj = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    private static final boolean zzl(byte b2, byte b3) {
        return zzf((b3 & 255) | 65280);
    }

    private static final boolean zzm(zzfb zzfbVar, byte[] bArr, int i) {
        if (zzfbVar.zza() < i) {
            return false;
        }
        zzfbVar.zzC(bArr, 0, i);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x024b, code lost:            r16.zzp = (r11 & 8) >> 3;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0253, code lost:            if (1 == ((r11 & 1) ^ 1)) goto L97;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0255, code lost:            r0 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0258, code lost:            r16.zzl = r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x025c, code lost:            if (r16.zzm != false) goto L101;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x025e, code lost:            r16.zzi = 1;        r16.zzj = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0267, code lost:            r17.zzG(r13);     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0264, code lost:            zzi();     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0257, code lost:            r0 = true;     */
    @Override // com.google.android.gms.internal.ads.zzaje
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzfb r17) throws com.google.android.gms.internal.ads.zzcc {
        /*
            Method dump skipped, instructions count: 701
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaja.zza(com.google.android.gms.internal.ads.zzfb):void");
    }

    @Override // com.google.android.gms.internal.ads.zzaje
    public final void zzb(zzabp zzabpVar, zzakq zzakqVar) {
        zzakqVar.zzc();
        this.zzf = zzakqVar.zzb();
        zzacs zzw = zzabpVar.zzw(zzakqVar.zza(), 1);
        this.zzg = zzw;
        this.zzu = zzw;
        if (this.zzb) {
            zzakqVar.zzc();
            zzacs zzw2 = zzabpVar.zzw(zzakqVar.zza(), 5);
            this.zzh = zzw2;
            zzak zzakVar = new zzak();
            zzakVar.zzJ(zzakqVar.zzb());
            zzakVar.zzU("application/id3");
            zzw2.zzl(zzakVar.zzac());
            return;
        }
        this.zzh = new zzabl();
    }

    @Override // com.google.android.gms.internal.ads.zzaje
    public final void zzc(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzaje
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzt = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaje
    public final void zze() {
        this.zzt = -9223372036854775807L;
        zzg();
    }
}
