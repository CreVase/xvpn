package com.google.android.gms.internal.ads;

import defpackage.p71;

/* loaded from: classes.dex */
public final class zzajv implements zzakr {
    private final zzaje zza;
    private final zzfa zzb = new zzfa(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzfi zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzajv(zzaje zzajeVar) {
        this.zza = zzajeVar;
    }

    private final void zzd(int i) {
        this.zzc = i;
        this.zzd = 0;
    }

    private final boolean zze(zzfb zzfbVar, byte[] bArr, int i) {
        int min = Math.min(zzfbVar.zza(), i - this.zzd);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            zzfbVar.zzH(min);
        } else {
            zzfbVar.zzC(bArr, this.zzd, min);
        }
        int i2 = this.zzd + min;
        this.zzd = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r6v2 */
    @Override // com.google.android.gms.internal.ads.zzakr
    public final void zza(zzfb zzfbVar, int i) throws zzcc {
        zzfb zzfbVar2;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        int i6;
        int i7;
        boolean z;
        zzfb zzfbVar3 = zzfbVar;
        zzdx.zzb(this.zze);
        int i8 = -1;
        int i9 = 2;
        ?? r6 = 0;
        int i10 = 1;
        if ((i & 1) != 0) {
            int i11 = this.zzc;
            if (i11 != 0 && i11 != 1) {
                if (i11 != 2) {
                    int i12 = this.zzj;
                    if (i12 != -1) {
                        zzer.zzf("PesReader", "Unexpected start indicator: expected " + i12 + " more bytes");
                    }
                    if (zzfbVar.zzd() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.zza.zzc(z);
                } else {
                    zzer.zzf("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zzd(1);
        }
        int i13 = i;
        while (zzfbVar.zza() > 0) {
            int i14 = this.zzc;
            if (i14 != 0) {
                if (i14 != i10) {
                    if (i14 != i9) {
                        int zza = zzfbVar.zza();
                        int i15 = this.zzj;
                        if (i15 == i8) {
                            i7 = 0;
                        } else {
                            i7 = zza - i15;
                        }
                        if (i7 > 0) {
                            zza -= i7;
                            zzfbVar3.zzF(zzfbVar.zzc() + zza);
                        }
                        this.zza.zza(zzfbVar3);
                        int i16 = this.zzj;
                        if (i16 != i8) {
                            int i17 = i16 - zza;
                            this.zzj = i17;
                            if (i17 == 0) {
                                this.zza.zzc(r6);
                                zzd(i10);
                            }
                        }
                    } else {
                        if (zze(zzfbVar3, this.zzb.zza, Math.min(10, this.zzi)) && zze(zzfbVar3, null, this.zzi)) {
                            this.zzb.zzj(r6);
                            if (this.zzf) {
                                this.zzb.zzl(4);
                                long zzd = this.zzb.zzd(3);
                                this.zzb.zzl(i10);
                                int zzd2 = this.zzb.zzd(15) << 15;
                                this.zzb.zzl(i10);
                                long zzd3 = this.zzb.zzd(15);
                                this.zzb.zzl(i10);
                                if (!this.zzh && this.zzg) {
                                    this.zzb.zzl(4);
                                    this.zzb.zzl(i10);
                                    int zzd4 = this.zzb.zzd(15) << 15;
                                    this.zzb.zzl(i10);
                                    long zzd5 = this.zzb.zzd(15);
                                    this.zzb.zzl(i10);
                                    i5 = i13;
                                    this.zze.zzb(zzd4 | (this.zzb.zzd(3) << 30) | zzd5);
                                    this.zzh = true;
                                } else {
                                    i5 = i13;
                                }
                                j = this.zze.zzb((zzd << 30) | zzd2 | zzd3);
                            } else {
                                i5 = i13;
                                j = -9223372036854775807L;
                            }
                            if (true != this.zzk) {
                                i6 = 0;
                            } else {
                                i6 = 4;
                            }
                            int i18 = i6 | i5;
                            this.zza.zzd(j, i18);
                            zzd(3);
                            zzfbVar2 = zzfbVar;
                            i13 = i18;
                            i8 = -1;
                        }
                    }
                    i2 = i13;
                    zzfbVar2 = zzfbVar;
                } else {
                    i2 = i13;
                    zzfbVar2 = zzfbVar;
                    if (zze(zzfbVar2, this.zzb.zza, 9)) {
                        this.zzb.zzj(0);
                        int zzd6 = this.zzb.zzd(24);
                        if (zzd6 != 1) {
                            p71.y("Unexpected start code prefix: ", zzd6, "PesReader");
                            i3 = -1;
                            this.zzj = -1;
                            i4 = 0;
                        } else {
                            this.zzb.zzl(8);
                            zzfa zzfaVar = this.zzb;
                            int zzd7 = zzfaVar.zzd(16);
                            zzfaVar.zzl(5);
                            this.zzk = this.zzb.zzn();
                            this.zzb.zzl(2);
                            this.zzf = this.zzb.zzn();
                            this.zzg = this.zzb.zzn();
                            this.zzb.zzl(6);
                            int zzd8 = this.zzb.zzd(8);
                            this.zzi = zzd8;
                            if (zzd7 == 0) {
                                this.zzj = -1;
                            } else {
                                int i19 = (zzd7 - 3) - zzd8;
                                this.zzj = i19;
                                if (i19 < 0) {
                                    p71.y("Found negative packet payload size: ", i19, "PesReader");
                                    i3 = -1;
                                    this.zzj = -1;
                                    i4 = 2;
                                }
                            }
                            i3 = -1;
                            i4 = 2;
                        }
                        zzd(i4);
                        i8 = i3;
                    } else {
                        i8 = -1;
                    }
                }
                i13 = i2;
            } else {
                zzfbVar2 = zzfbVar3;
                zzfbVar2.zzH(zzfbVar.zza());
            }
            r6 = 0;
            i10 = 1;
            zzfbVar3 = zzfbVar2;
            i9 = 2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakr
    public final void zzb(zzfi zzfiVar, zzabp zzabpVar, zzakq zzakqVar) {
        this.zze = zzfiVar;
        this.zza.zzb(zzabpVar, zzakqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzakr
    public final void zzc() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zze();
    }
}
