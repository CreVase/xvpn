package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzads implements zzabm {
    public static final zzabt zza = new zzabt() { // from class: com.google.android.gms.internal.ads.zzadr
        @Override // com.google.android.gms.internal.ads.zzabt
        public final /* synthetic */ zzabm[] zza(Uri uri, Map map) {
            int i = zzabs.zza;
            return new zzabm[]{new zzads(0)};
        }
    };
    private final byte[] zzb;
    private final zzfb zzc;
    private final zzabu zzd;
    private zzabp zze;
    private zzacs zzf;
    private int zzg;
    private zzby zzh;
    private zzabz zzi;
    private int zzj;
    private int zzk;
    private zzadq zzl;
    private int zzm;
    private long zzn;

    public zzads() {
        this(0);
    }

    private final long zza(zzfb zzfbVar, boolean z) {
        boolean z2;
        this.zzi.getClass();
        int zzc = zzfbVar.zzc();
        while (zzc <= zzfbVar.zzd() - 16) {
            zzfbVar.zzG(zzc);
            if (zzabv.zzc(zzfbVar, this.zzi, this.zzk, this.zzd)) {
                zzfbVar.zzG(zzc);
                return this.zzd.zza;
            }
            zzc++;
        }
        if (z) {
            while (zzc <= zzfbVar.zzd() - this.zzj) {
                zzfbVar.zzG(zzc);
                try {
                    z2 = zzabv.zzc(zzfbVar, this.zzi, this.zzk, this.zzd);
                } catch (IndexOutOfBoundsException unused) {
                    z2 = false;
                }
                if (zzfbVar.zzc() <= zzfbVar.zzd() && z2) {
                    zzfbVar.zzG(zzc);
                    return this.zzd.zza;
                }
                zzc++;
            }
            zzfbVar.zzG(zzfbVar.zzd());
            return -1L;
        }
        zzfbVar.zzG(zzc);
        return -1L;
    }

    private final void zzf() {
        long j = this.zzn * 1000000;
        zzabz zzabzVar = this.zzi;
        int i = zzfk.zza;
        this.zzf.zzt(j / zzabzVar.zze, 1, this.zzm, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final int zzb(zzabn zzabnVar, zzacj zzacjVar) throws IOException {
        boolean zzn;
        zzacm zzaclVar;
        int i = this.zzg;
        boolean z = true;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            this.zzf.getClass();
                            zzabz zzabzVar = this.zzi;
                            zzabzVar.getClass();
                            zzadq zzadqVar = this.zzl;
                            if (zzadqVar != null && zzadqVar.zze()) {
                                return zzadqVar.zza(zzabnVar, zzacjVar);
                            }
                            if (this.zzn == -1) {
                                this.zzn = zzabv.zzb(zzabnVar, zzabzVar);
                                return 0;
                            }
                            zzfb zzfbVar = this.zzc;
                            int zzd = zzfbVar.zzd();
                            if (zzd < 32768) {
                                int zza2 = zzabnVar.zza(zzfbVar.zzI(), zzd, 32768 - zzd);
                                if (zza2 != -1) {
                                    z = false;
                                }
                                if (!z) {
                                    this.zzc.zzF(zzd + zza2);
                                } else if (this.zzc.zza() == 0) {
                                    zzf();
                                    return -1;
                                }
                            } else {
                                z = false;
                            }
                            zzfb zzfbVar2 = this.zzc;
                            int zzc = zzfbVar2.zzc();
                            int i2 = this.zzm;
                            int i3 = this.zzj;
                            if (i2 < i3) {
                                zzfbVar2.zzH(Math.min(i3 - i2, zzfbVar2.zza()));
                            }
                            long zza3 = zza(this.zzc, z);
                            zzfb zzfbVar3 = this.zzc;
                            int zzc2 = zzfbVar3.zzc() - zzc;
                            zzfbVar3.zzG(zzc);
                            zzacq.zzb(this.zzf, this.zzc, zzc2);
                            this.zzm += zzc2;
                            if (zza3 != -1) {
                                zzf();
                                this.zzm = 0;
                                this.zzn = zza3;
                            }
                            zzfb zzfbVar4 = this.zzc;
                            if (zzfbVar4.zza() >= 16) {
                                return 0;
                            }
                            int zza4 = zzfbVar4.zza();
                            System.arraycopy(zzfbVar4.zzI(), zzfbVar4.zzc(), zzfbVar4.zzI(), 0, zza4);
                            this.zzc.zzG(0);
                            this.zzc.zzF(zza4);
                            return 0;
                        }
                        zzabnVar.zzj();
                        zzfb zzfbVar5 = new zzfb(2);
                        ((zzabc) zzabnVar).zzm(zzfbVar5.zzI(), 0, 2, false);
                        int zzp = zzfbVar5.zzp();
                        if ((zzp >> 2) == 16382) {
                            zzabnVar.zzj();
                            this.zzk = zzp;
                            zzabp zzabpVar = this.zze;
                            int i4 = zzfk.zza;
                            long zzf = zzabnVar.zzf();
                            long zzd2 = zzabnVar.zzd();
                            zzabz zzabzVar2 = this.zzi;
                            zzabzVar2.getClass();
                            if (zzabzVar2.zzk != null) {
                                zzaclVar = new zzabx(zzabzVar2, zzf);
                            } else if (zzd2 != -1 && zzabzVar2.zzj > 0) {
                                zzadq zzadqVar2 = new zzadq(zzabzVar2, this.zzk, zzf, zzd2);
                                this.zzl = zzadqVar2;
                                zzaclVar = zzadqVar2.zzb();
                            } else {
                                zzaclVar = new zzacl(zzabzVar2.zza(), 0L);
                            }
                            zzabpVar.zzO(zzaclVar);
                            this.zzg = 5;
                            return 0;
                        }
                        zzabnVar.zzj();
                        throw zzcc.zza("First frame does not start with sync code.", null);
                    }
                    zzabz zzabzVar3 = this.zzi;
                    do {
                        zzabnVar.zzj();
                        zzfa zzfaVar = new zzfa(new byte[4], 4);
                        zzabc zzabcVar = (zzabc) zzabnVar;
                        zzabcVar.zzm(zzfaVar.zza, 0, 4, false);
                        zzn = zzfaVar.zzn();
                        int zzd3 = zzfaVar.zzd(7);
                        int zzd4 = zzfaVar.zzd(24) + 4;
                        if (zzd3 == 0) {
                            byte[] bArr = new byte[38];
                            zzabcVar.zzn(bArr, 0, 38, false);
                            zzabzVar3 = new zzabz(bArr, 4);
                        } else if (zzabzVar3 != null) {
                            if (zzd3 == 3) {
                                zzfb zzfbVar6 = new zzfb(zzd4);
                                zzabcVar.zzn(zzfbVar6.zzI(), 0, zzd4, false);
                                zzabzVar3 = zzabzVar3.zzf(zzabw.zzb(zzfbVar6));
                            } else if (zzd3 == 4) {
                                zzfb zzfbVar7 = new zzfb(zzd4);
                                zzabcVar.zzn(zzfbVar7.zzI(), 0, zzd4, false);
                                zzfbVar7.zzH(4);
                                zzabzVar3 = zzabzVar3.zzg(Arrays.asList(zzacy.zzc(zzfbVar7, false, false).zzb));
                            } else if (zzd3 == 6) {
                                zzfb zzfbVar8 = new zzfb(zzd4);
                                zzabcVar.zzn(zzfbVar8.zzI(), 0, zzd4, false);
                                zzfbVar8.zzH(4);
                                zzabzVar3 = zzabzVar3.zze(zzfvs.zzm(zzaem.zzb(zzfbVar8)));
                            } else {
                                zzabcVar.zzo(zzd4, false);
                            }
                        } else {
                            throw new IllegalArgumentException();
                        }
                        int i5 = zzfk.zza;
                        this.zzi = zzabzVar3;
                    } while (!zzn);
                    zzabzVar3.getClass();
                    this.zzj = Math.max(zzabzVar3.zzc, 6);
                    this.zzf.zzl(this.zzi.zzc(this.zzb, this.zzh));
                    this.zzg = 4;
                    return 0;
                }
                zzfb zzfbVar9 = new zzfb(4);
                ((zzabc) zzabnVar).zzn(zzfbVar9.zzI(), 0, 4, false);
                if (zzfbVar9.zzt() == 1716281667) {
                    this.zzg = 3;
                    return 0;
                }
                throw zzcc.zza("Failed to read FLAC stream marker.", null);
            }
            ((zzabc) zzabnVar).zzm(this.zzb, 0, 42, false);
            zzabnVar.zzj();
            this.zzg = 2;
            return 0;
        }
        zzabnVar.zzj();
        long zze = zzabnVar.zze();
        zzby zza5 = zzabw.zza(zzabnVar, true);
        ((zzabc) zzabnVar).zzo((int) (zzabnVar.zze() - zze), false);
        this.zzh = zza5;
        this.zzg = 1;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final void zzc(zzabp zzabpVar) {
        this.zze = zzabpVar;
        this.zzf = zzabpVar.zzw(0, 1);
        zzabpVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final void zzd(long j, long j2) {
        long j3 = 0;
        if (j == 0) {
            this.zzg = 0;
        } else {
            zzadq zzadqVar = this.zzl;
            if (zzadqVar != null) {
                zzadqVar.zzd(j2);
            }
        }
        if (j2 != 0) {
            j3 = -1;
        }
        this.zzn = j3;
        this.zzm = 0;
        this.zzc.zzD(0);
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final boolean zze(zzabn zzabnVar) throws IOException {
        zzabw.zza(zzabnVar, false);
        zzfb zzfbVar = new zzfb(4);
        ((zzabc) zzabnVar).zzm(zzfbVar.zzI(), 0, 4, false);
        if (zzfbVar.zzt() != 1716281667) {
            return false;
        }
        return true;
    }

    public zzads(int i) {
        this.zzb = new byte[42];
        this.zzc = new zzfb(new byte[32768], 0);
        this.zzd = new zzabu();
        this.zzg = 0;
    }
}
