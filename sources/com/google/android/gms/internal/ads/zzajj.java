package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes.dex */
public final class zzajj implements zzaje {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final zzakt zzb;
    private final zzfb zzc;
    private final boolean[] zzd;
    private final zzajh zze;
    private final zzajt zzf;
    private zzaji zzg;
    private long zzh;
    private String zzi;
    private zzacs zzj;
    private boolean zzk;
    private long zzl;

    public zzajj() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zzaje
    public final void zza(zzfb zzfbVar) {
        int i;
        int i2;
        float f;
        float f2;
        zzdx.zzb(this.zzg);
        zzdx.zzb(this.zzj);
        int zzc = zzfbVar.zzc();
        int zzd = zzfbVar.zzd();
        byte[] zzI = zzfbVar.zzI();
        this.zzh += zzfbVar.zza();
        this.zzj.zzr(zzfbVar, zzfbVar.zza());
        while (true) {
            int zza2 = zzfy.zza(zzI, zzc, zzd, this.zzd);
            if (zza2 == zzd) {
                break;
            }
            int i3 = zza2 + 3;
            int i4 = zzfbVar.zzI()[i3] & 255;
            int i5 = zza2 - zzc;
            if (!this.zzk) {
                if (i5 > 0) {
                    this.zze.zza(zzI, zzc, zza2);
                }
                if (i5 < 0) {
                    i2 = -i5;
                } else {
                    i2 = 0;
                }
                if (this.zze.zzc(i4, i2)) {
                    zzacs zzacsVar = this.zzj;
                    zzajh zzajhVar = this.zze;
                    int i6 = zzajhVar.zzb;
                    String str = this.zzi;
                    str.getClass();
                    byte[] copyOf = Arrays.copyOf(zzajhVar.zzc, zzajhVar.zza);
                    zzfa zzfaVar = new zzfa(copyOf, copyOf.length);
                    zzfaVar.zzm(i6);
                    zzfaVar.zzm(4);
                    zzfaVar.zzk();
                    zzfaVar.zzl(8);
                    if (zzfaVar.zzn()) {
                        zzfaVar.zzl(4);
                        zzfaVar.zzl(3);
                    }
                    int zzd2 = zzfaVar.zzd(4);
                    if (zzd2 == 15) {
                        int zzd3 = zzfaVar.zzd(8);
                        int zzd4 = zzfaVar.zzd(8);
                        if (zzd4 == 0) {
                            zzer.zzf("H263Reader", "Invalid aspect ratio");
                            f2 = 1.0f;
                        } else {
                            f = zzd3 / zzd4;
                            f2 = f;
                        }
                    } else if (zzd2 < 7) {
                        f = zza[zzd2];
                        f2 = f;
                    } else {
                        zzer.zzf("H263Reader", "Invalid aspect ratio");
                        f2 = 1.0f;
                    }
                    if (zzfaVar.zzn()) {
                        zzfaVar.zzl(2);
                        zzfaVar.zzl(1);
                        if (zzfaVar.zzn()) {
                            zzfaVar.zzl(15);
                            zzfaVar.zzk();
                            zzfaVar.zzl(15);
                            zzfaVar.zzk();
                            zzfaVar.zzl(15);
                            zzfaVar.zzk();
                            zzfaVar.zzl(3);
                            zzfaVar.zzl(11);
                            zzfaVar.zzk();
                            zzfaVar.zzl(15);
                            zzfaVar.zzk();
                        }
                    }
                    if (zzfaVar.zzd(2) != 0) {
                        zzer.zzf("H263Reader", "Unhandled video object layer shape");
                    }
                    zzfaVar.zzk();
                    int zzd5 = zzfaVar.zzd(16);
                    zzfaVar.zzk();
                    if (zzfaVar.zzn()) {
                        if (zzd5 == 0) {
                            zzer.zzf("H263Reader", "Invalid vop_increment_time_resolution");
                        } else {
                            int i7 = zzd5 - 1;
                            int i8 = 0;
                            while (i7 > 0) {
                                i7 >>= 1;
                                i8++;
                            }
                            zzfaVar.zzl(i8);
                        }
                    }
                    zzfaVar.zzk();
                    int zzd6 = zzfaVar.zzd(13);
                    zzfaVar.zzk();
                    int zzd7 = zzfaVar.zzd(13);
                    zzfaVar.zzk();
                    zzfaVar.zzk();
                    zzak zzakVar = new zzak();
                    zzakVar.zzJ(str);
                    zzakVar.zzU("video/mp4v-es");
                    zzakVar.zzab(zzd6);
                    zzakVar.zzH(zzd7);
                    zzakVar.zzR(f2);
                    zzakVar.zzK(Collections.singletonList(copyOf));
                    zzacsVar.zzl(zzakVar.zzac());
                    this.zzk = true;
                }
            }
            this.zzg.zza(zzI, zzc, zza2);
            zzajt zzajtVar = this.zzf;
            if (i5 > 0) {
                zzajtVar.zza(zzI, zzc, zza2);
                i = 0;
            } else {
                i = -i5;
            }
            if (this.zzf.zzd(i)) {
                zzajt zzajtVar2 = this.zzf;
                int zzb = zzfy.zzb(zzajtVar2.zza, zzajtVar2.zzb);
                zzfb zzfbVar2 = this.zzc;
                int i9 = zzfk.zza;
                zzfbVar2.zzE(this.zzf.zza, zzb);
                this.zzb.zza(this.zzl, this.zzc);
            }
            if (i4 == 178) {
                if (zzfbVar.zzI()[zza2 + 2] == 1) {
                    this.zzf.zzc(178);
                }
                i4 = 178;
            }
            int i10 = zzd - zza2;
            this.zzg.zzb(this.zzh - i10, i10, this.zzk);
            this.zzg.zzc(i4, this.zzl);
            zzc = i3;
        }
        if (!this.zzk) {
            this.zze.zza(zzI, zzc, zzd);
        }
        this.zzg.zza(zzI, zzc, zzd);
        this.zzf.zza(zzI, zzc, zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzaje
    public final void zzb(zzabp zzabpVar, zzakq zzakqVar) {
        zzakqVar.zzc();
        this.zzi = zzakqVar.zzb();
        zzacs zzw = zzabpVar.zzw(zzakqVar.zza(), 2);
        this.zzj = zzw;
        this.zzg = new zzaji(zzw);
        this.zzb.zzb(zzabpVar, zzakqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaje
    public final void zzc(boolean z) {
        zzdx.zzb(this.zzg);
        if (z) {
            this.zzg.zzb(this.zzh, 0, this.zzk);
            this.zzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaje
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzl = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaje
    public final void zze() {
        zzfy.zzf(this.zzd);
        this.zze.zzb();
        zzaji zzajiVar = this.zzg;
        if (zzajiVar != null) {
            zzajiVar.zzd();
        }
        this.zzf.zzb();
        this.zzh = 0L;
        this.zzl = -9223372036854775807L;
    }

    public zzajj(zzakt zzaktVar) {
        this.zzb = zzaktVar;
        this.zzd = new boolean[4];
        this.zze = new zzajh(128);
        this.zzl = -9223372036854775807L;
        this.zzf = new zzajt(178, 128);
        this.zzc = new zzfb();
    }
}
