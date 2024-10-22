package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzajx implements zzaax {
    private final zzfi zza;
    private final zzfb zzb = new zzfb();

    public /* synthetic */ zzajx(zzfi zzfiVar, zzajw zzajwVar) {
        this.zza = zzfiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final zzaaw zza(zzabn zzabnVar, long j) throws IOException {
        int zzh;
        long j2;
        long zzf = zzabnVar.zzf();
        int min = (int) Math.min(20000L, zzabnVar.zzd() - zzf);
        this.zzb.zzD(min);
        ((zzabc) zzabnVar).zzm(this.zzb.zzI(), 0, min, false);
        int i = -1;
        long j3 = -9223372036854775807L;
        int i2 = -1;
        while (true) {
            zzfb zzfbVar = this.zzb;
            if (zzfbVar.zza() >= 4) {
                if (zzajy.zzh(zzfbVar.zzI(), zzfbVar.zzc()) != 442) {
                    zzfbVar.zzH(1);
                } else {
                    zzfbVar.zzH(4);
                    long zzc = zzajz.zzc(zzfbVar);
                    if (zzc != -9223372036854775807L) {
                        long zzb = this.zza.zzb(zzc);
                        if (zzb > j) {
                            if (j3 == -9223372036854775807L) {
                                return zzaaw.zzd(zzb, zzf);
                            }
                            j2 = i2;
                        } else {
                            if (100000 + zzb > j) {
                                j2 = zzfbVar.zzc();
                                break;
                            }
                            i2 = zzfbVar.zzc();
                            j3 = zzb;
                        }
                    }
                    int zzd = zzfbVar.zzd();
                    if (zzfbVar.zza() < 10) {
                        zzfbVar.zzG(zzd);
                    } else {
                        zzfbVar.zzH(9);
                        int zzl = zzfbVar.zzl() & 7;
                        if (zzfbVar.zza() < zzl) {
                            zzfbVar.zzG(zzd);
                        } else {
                            zzfbVar.zzH(zzl);
                            if (zzfbVar.zza() < 4) {
                                zzfbVar.zzG(zzd);
                            } else {
                                if (zzajy.zzh(zzfbVar.zzI(), zzfbVar.zzc()) == 443) {
                                    zzfbVar.zzH(4);
                                    int zzp = zzfbVar.zzp();
                                    if (zzfbVar.zza() < zzp) {
                                        zzfbVar.zzG(zzd);
                                    } else {
                                        zzfbVar.zzH(zzp);
                                    }
                                }
                                while (true) {
                                    if (zzfbVar.zza() < 4 || (zzh = zzajy.zzh(zzfbVar.zzI(), zzfbVar.zzc())) == 442 || zzh == 441 || (zzh >>> 8) != 1) {
                                        break;
                                    }
                                    zzfbVar.zzH(4);
                                    if (zzfbVar.zza() < 2) {
                                        zzfbVar.zzG(zzd);
                                        break;
                                    }
                                    zzfbVar.zzG(Math.min(zzfbVar.zzd(), zzfbVar.zzc() + zzfbVar.zzp()));
                                }
                            }
                        }
                    }
                    i = zzfbVar.zzc();
                }
            } else {
                if (j3 != -9223372036854775807L) {
                    return zzaaw.zzf(j3, zzf + i);
                }
                return zzaaw.zza;
            }
        }
        return zzaaw.zze(zzf + j2);
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final void zzb() {
        byte[] bArr = zzfk.zzf;
        int length = bArr.length;
        this.zzb.zzE(bArr, 0);
    }
}
