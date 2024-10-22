package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzagr implements zzabm {
    public static final zzabt zza = new zzabt() { // from class: com.google.android.gms.internal.ads.zzagp
        @Override // com.google.android.gms.internal.ads.zzabt
        public final /* synthetic */ zzabm[] zza(Uri uri, Map map) {
            int i = zzabs.zza;
            return new zzabm[]{new zzagr(0)};
        }
    };
    private static final zzafe zzb = new zzafe() { // from class: com.google.android.gms.internal.ads.zzagq
    };
    private final zzfb zzc;
    private final zzacg zzd;
    private final zzacc zze;
    private final zzace zzf;
    private final zzacs zzg;
    private zzabp zzh;
    private zzacs zzi;
    private zzacs zzj;
    private int zzk;
    private zzby zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private zzagt zzq;
    private boolean zzr;

    public zzagr() {
        this(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzf(com.google.android.gms.internal.ads.zzabn r17) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 625
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagr.zzf(com.google.android.gms.internal.ads.zzabn):int");
    }

    private final long zzg(long j) {
        zzacg zzacgVar = this.zzd;
        return ((j * 1000000) / zzacgVar.zzd) + this.zzm;
    }

    private final zzagt zzh(zzabn zzabnVar, boolean z) throws IOException {
        ((zzabc) zzabnVar).zzm(this.zzc.zzI(), 0, 4, false);
        this.zzc.zzG(0);
        this.zzd.zza(this.zzc.zzf());
        return new zzagm(zzabnVar.zzd(), zzabnVar.zzf(), this.zzd, false);
    }

    private static boolean zzi(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    private final boolean zzj(zzabn zzabnVar) throws IOException {
        zzagt zzagtVar = this.zzq;
        if (zzagtVar != null) {
            long zzc = zzagtVar.zzc();
            if (zzc != -1 && zzabnVar.zze() > zzc - 4) {
                return true;
            }
        }
        try {
            if (!zzabnVar.zzm(this.zzc.zzI(), 0, 4, true)) {
                return true;
            }
            return false;
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean zzk(zzabn zzabnVar, boolean z) throws IOException {
        int i;
        int i2;
        int zzb2;
        int i3;
        zzabnVar.zzj();
        if (zzabnVar.zzf() == 0) {
            zzby zza2 = this.zzf.zza(zzabnVar, null);
            this.zzl = zza2;
            if (zza2 != null) {
                this.zze.zzb(zza2);
            }
            i2 = (int) zzabnVar.zze();
            if (!z) {
                ((zzabc) zzabnVar).zzo(i2, false);
            }
            i = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (zzj(zzabnVar)) {
                if (i4 <= 0) {
                    throw new EOFException();
                }
            } else {
                this.zzc.zzG(0);
                int zzf = this.zzc.zzf();
                if ((i != 0 && !zzi(zzf, i)) || (zzb2 = zzach.zzb(zzf)) == -1) {
                    if (true != z) {
                        i3 = 131072;
                    } else {
                        i3 = 32768;
                    }
                    int i6 = i5 + 1;
                    if (i5 == i3) {
                        if (z) {
                            return false;
                        }
                        throw zzcc.zza("Searched too many bytes.", null);
                    }
                    if (z) {
                        zzabnVar.zzj();
                        ((zzabc) zzabnVar).zzl(i2 + i6, false);
                    } else {
                        ((zzabc) zzabnVar).zzo(1, false);
                    }
                    i5 = i6;
                    i = 0;
                    i4 = 0;
                } else {
                    i4++;
                    if (i4 == 1) {
                        this.zzd.zza(zzf);
                        i = zzf;
                    } else if (i4 == 4) {
                        break;
                    }
                    ((zzabc) zzabnVar).zzl(zzb2 - 4, false);
                }
            }
        }
        if (z) {
            ((zzabc) zzabnVar).zzo(i2 + i5, false);
        } else {
            zzabnVar.zzj();
        }
        this.zzk = i;
        return true;
    }

    public final void zza() {
        this.zzr = true;
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final int zzb(zzabn zzabnVar, zzacj zzacjVar) throws IOException {
        zzdx.zzb(this.zzi);
        int i = zzfk.zza;
        int zzf = zzf(zzabnVar);
        if (zzf == -1 && (this.zzq instanceof zzagn)) {
            if (this.zzq.zza() != zzg(this.zzn)) {
                throw null;
            }
        }
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final void zzc(zzabp zzabpVar) {
        this.zzh = zzabpVar;
        zzacs zzw = zzabpVar.zzw(0, 1);
        this.zzi = zzw;
        this.zzj = zzw;
        this.zzh.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final void zzd(long j, long j2) {
        this.zzk = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = 0L;
        this.zzp = 0;
        zzagt zzagtVar = this.zzq;
        if (!(zzagtVar instanceof zzagn)) {
            return;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final boolean zze(zzabn zzabnVar) throws IOException {
        return zzk(zzabnVar, true);
    }

    public zzagr(int i) {
        this.zzc = new zzfb(10);
        this.zzd = new zzacg();
        this.zze = new zzacc();
        this.zzm = -9223372036854775807L;
        this.zzf = new zzace();
        zzabl zzablVar = new zzabl();
        this.zzg = zzablVar;
        this.zzj = zzablVar;
    }
}
