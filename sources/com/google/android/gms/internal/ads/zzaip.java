package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzaip extends zzain {
    private zzaio zza;
    private int zzb;
    private boolean zzc;
    private zzacx zzd;
    private zzacv zze;

    @Override // com.google.android.gms.internal.ads.zzain
    public final long zza(zzfb zzfbVar) {
        int i;
        int i2 = 0;
        if ((zzfbVar.zzI()[0] & 1) == 1) {
            return -1L;
        }
        byte b2 = zzfbVar.zzI()[0];
        zzaio zzaioVar = this.zza;
        zzdx.zzb(zzaioVar);
        if (!zzaioVar.zzd[(b2 >> 1) & (255 >>> (8 - zzaioVar.zze))].zza) {
            i = zzaioVar.zza.zze;
        } else {
            i = zzaioVar.zza.zzf;
        }
        if (this.zzc) {
            i2 = (this.zzb + i) / 4;
        }
        if (zzfbVar.zzb() < zzfbVar.zzd() + 4) {
            byte[] copyOf = Arrays.copyOf(zzfbVar.zzI(), zzfbVar.zzd() + 4);
            zzfbVar.zzE(copyOf, copyOf.length);
        } else {
            zzfbVar.zzF(zzfbVar.zzd() + 4);
        }
        long j = i2;
        byte[] zzI = zzfbVar.zzI();
        zzI[zzfbVar.zzd() - 4] = (byte) (j & 255);
        zzI[zzfbVar.zzd() - 3] = (byte) ((j >>> 8) & 255);
        zzI[zzfbVar.zzd() - 2] = (byte) ((j >>> 16) & 255);
        zzI[zzfbVar.zzd() - 1] = (byte) ((j >>> 24) & 255);
        this.zzc = true;
        this.zzb = i;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzain
    public final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzain
    public final boolean zzc(zzfb zzfbVar, long j, zzaik zzaikVar) throws IOException {
        zzaio zzaioVar;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        zzacx zzacxVar;
        long j2;
        int i6;
        int i7;
        int i8;
        boolean z;
        if (this.zza != null) {
            zzaikVar.zza.getClass();
            return false;
        }
        zzacx zzacxVar2 = this.zzd;
        int i9 = 4;
        if (zzacxVar2 == null) {
            zzacy.zzd(1, zzfbVar, false);
            int zzi = zzfbVar.zzi();
            int zzl = zzfbVar.zzl();
            int zzi2 = zzfbVar.zzi();
            int zzh = zzfbVar.zzh();
            if (zzh <= 0) {
                i6 = -1;
            } else {
                i6 = zzh;
            }
            int zzh2 = zzfbVar.zzh();
            if (zzh2 <= 0) {
                i7 = -1;
            } else {
                i7 = zzh2;
            }
            int zzh3 = zzfbVar.zzh();
            if (zzh3 <= 0) {
                i8 = -1;
            } else {
                i8 = zzh3;
            }
            int zzl2 = zzfbVar.zzl();
            int pow = (int) Math.pow(2.0d, zzl2 & 15);
            int pow2 = (int) Math.pow(2.0d, (zzl2 & 240) >> 4);
            if (1 != (zzfbVar.zzl() & 1)) {
                z = false;
            } else {
                z = true;
            }
            this.zzd = new zzacx(zzi, zzl, zzi2, i6, i7, i8, pow, pow2, z, Arrays.copyOf(zzfbVar.zzI(), zzfbVar.zzd()));
        } else {
            zzacv zzacvVar = this.zze;
            if (zzacvVar == null) {
                this.zze = zzacy.zzc(zzfbVar, true, true);
            } else {
                byte[] bArr = new byte[zzfbVar.zzd()];
                System.arraycopy(zzfbVar.zzI(), 0, bArr, 0, zzfbVar.zzd());
                int i10 = zzacxVar2.zza;
                int i11 = 5;
                zzacy.zzd(5, zzfbVar, false);
                int zzl3 = zzfbVar.zzl() + 1;
                zzacu zzacuVar = new zzacu(zzfbVar.zzI());
                zzacuVar.zzc(zzfbVar.zzc() * 8);
                int i12 = 0;
                while (true) {
                    int i13 = 2;
                    int i14 = 16;
                    if (i12 < zzl3) {
                        if (zzacuVar.zzb(24) == 5653314) {
                            int zzb = zzacuVar.zzb(16);
                            int zzb2 = zzacuVar.zzb(24);
                            if (!zzacuVar.zzd()) {
                                boolean zzd = zzacuVar.zzd();
                                for (int i15 = 0; i15 < zzb2; i15++) {
                                    if (zzd) {
                                        if (zzacuVar.zzd()) {
                                            zzacuVar.zzc(5);
                                        }
                                    } else {
                                        zzacuVar.zzc(5);
                                    }
                                }
                            } else {
                                zzacuVar.zzc(5);
                                for (int i16 = 0; i16 < zzb2; i16 += zzacuVar.zzb(zzacy.zza(zzb2 - i16))) {
                                }
                            }
                            int zzb3 = zzacuVar.zzb(i9);
                            if (zzb3 <= 2) {
                                if (zzb3 != 1) {
                                    if (zzb3 != 2) {
                                        zzacxVar = zzacxVar2;
                                        i12++;
                                        zzacxVar2 = zzacxVar;
                                        i9 = 4;
                                    }
                                } else {
                                    i13 = zzb3;
                                }
                                zzacuVar.zzc(32);
                                zzacuVar.zzc(32);
                                int zzb4 = zzacuVar.zzb(i9) + 1;
                                zzacuVar.zzc(1);
                                if (i13 == 1) {
                                    if (zzb != 0) {
                                        zzacxVar = zzacxVar2;
                                        j2 = (long) Math.floor(Math.pow(zzb2, 1.0d / zzb));
                                    } else {
                                        zzacxVar = zzacxVar2;
                                        j2 = 0;
                                    }
                                } else {
                                    zzacxVar = zzacxVar2;
                                    j2 = zzb * zzb2;
                                }
                                zzacuVar.zzc((int) (j2 * zzb4));
                                i12++;
                                zzacxVar2 = zzacxVar;
                                i9 = 4;
                            } else {
                                throw zzcc.zza("lookup type greater than 2 not decodable: " + zzb3, null);
                            }
                        } else {
                            throw zzcc.zza("expected code book to start with [0x56, 0x43, 0x42] at " + zzacuVar.zza(), null);
                        }
                    } else {
                        zzacx zzacxVar3 = zzacxVar2;
                        int i17 = 6;
                        int zzb5 = zzacuVar.zzb(6) + 1;
                        for (int i18 = 0; i18 < zzb5; i18++) {
                            if (zzacuVar.zzb(16) != 0) {
                                throw zzcc.zza("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i19 = 1;
                        int zzb6 = zzacuVar.zzb(6) + 1;
                        int i20 = 0;
                        while (true) {
                            int i21 = 3;
                            if (i20 < zzb6) {
                                int zzb7 = zzacuVar.zzb(i14);
                                if (zzb7 != 0) {
                                    if (zzb7 == i19) {
                                        int zzb8 = zzacuVar.zzb(i11);
                                        int[] iArr = new int[zzb8];
                                        int i22 = -1;
                                        for (int i23 = 0; i23 < zzb8; i23++) {
                                            int zzb9 = zzacuVar.zzb(4);
                                            iArr[i23] = zzb9;
                                            if (zzb9 > i22) {
                                                i22 = zzb9;
                                            }
                                        }
                                        int i24 = i22 + 1;
                                        int[] iArr2 = new int[i24];
                                        int i25 = 0;
                                        while (i25 < i24) {
                                            iArr2[i25] = zzacuVar.zzb(i21) + 1;
                                            int zzb10 = zzacuVar.zzb(i13);
                                            if (zzb10 > 0) {
                                                i5 = 8;
                                                zzacuVar.zzc(8);
                                            } else {
                                                i5 = 8;
                                            }
                                            int i26 = zzb6;
                                            int i27 = 0;
                                            for (int i28 = 1; i27 < (i28 << zzb10); i28 = 1) {
                                                zzacuVar.zzc(i5);
                                                i27++;
                                                i5 = 8;
                                            }
                                            i25++;
                                            zzb6 = i26;
                                            i13 = 2;
                                            i21 = 3;
                                        }
                                        i4 = zzb6;
                                        zzacuVar.zzc(2);
                                        int zzb11 = zzacuVar.zzb(4);
                                        int i29 = 0;
                                        int i30 = 0;
                                        for (int i31 = 0; i31 < zzb8; i31++) {
                                            i29 += iArr2[iArr[i31]];
                                            while (i30 < i29) {
                                                zzacuVar.zzc(zzb11);
                                                i30++;
                                            }
                                        }
                                    } else {
                                        throw zzcc.zza("floor type greater than 1 not decodable: " + zzb7, null);
                                    }
                                } else {
                                    i4 = zzb6;
                                    int i32 = 8;
                                    zzacuVar.zzc(8);
                                    zzacuVar.zzc(16);
                                    zzacuVar.zzc(16);
                                    zzacuVar.zzc(6);
                                    zzacuVar.zzc(8);
                                    int zzb12 = zzacuVar.zzb(4) + 1;
                                    int i33 = 0;
                                    while (i33 < zzb12) {
                                        zzacuVar.zzc(i32);
                                        i33++;
                                        i32 = 8;
                                    }
                                }
                                i20++;
                                zzb6 = i4;
                                i17 = 6;
                                i14 = 16;
                                i13 = 2;
                                i19 = 1;
                                i11 = 5;
                            } else {
                                int i34 = 1;
                                int zzb13 = zzacuVar.zzb(i17) + 1;
                                int i35 = 0;
                                while (i35 < zzb13) {
                                    if (zzacuVar.zzb(16) <= 2) {
                                        zzacuVar.zzc(24);
                                        zzacuVar.zzc(24);
                                        zzacuVar.zzc(24);
                                        int zzb14 = zzacuVar.zzb(i17) + i34;
                                        int i36 = 8;
                                        zzacuVar.zzc(8);
                                        int[] iArr3 = new int[zzb14];
                                        for (int i37 = 0; i37 < zzb14; i37++) {
                                            int zzb15 = zzacuVar.zzb(3);
                                            if (zzacuVar.zzd()) {
                                                i3 = zzacuVar.zzb(5);
                                            } else {
                                                i3 = 0;
                                            }
                                            iArr3[i37] = (i3 * 8) + zzb15;
                                        }
                                        int i38 = 0;
                                        while (i38 < zzb14) {
                                            int i39 = 0;
                                            while (i39 < i36) {
                                                if ((iArr3[i38] & (1 << i39)) != 0) {
                                                    zzacuVar.zzc(i36);
                                                }
                                                i39++;
                                                i36 = 8;
                                            }
                                            i38++;
                                            i36 = 8;
                                        }
                                        i35++;
                                        i17 = 6;
                                        i34 = 1;
                                    } else {
                                        throw zzcc.zza("residueType greater than 2 is not decodable", null);
                                    }
                                }
                                int zzb16 = zzacuVar.zzb(i17) + 1;
                                for (int i40 = 0; i40 < zzb16; i40++) {
                                    int zzb17 = zzacuVar.zzb(16);
                                    if (zzb17 != 0) {
                                        zzer.zzc("VorbisUtil", "mapping type other than 0 not supported: " + zzb17);
                                    } else {
                                        if (zzacuVar.zzd()) {
                                            i = 1;
                                            i2 = zzacuVar.zzb(4) + 1;
                                        } else {
                                            i = 1;
                                            i2 = 1;
                                        }
                                        if (zzacuVar.zzd()) {
                                            int zzb18 = zzacuVar.zzb(8) + i;
                                            for (int i41 = 0; i41 < zzb18; i41++) {
                                                int i42 = i10 - 1;
                                                zzacuVar.zzc(zzacy.zza(i42));
                                                zzacuVar.zzc(zzacy.zza(i42));
                                            }
                                        }
                                        if (zzacuVar.zzb(2) == 0) {
                                            if (i2 > 1) {
                                                for (int i43 = 0; i43 < i10; i43++) {
                                                    zzacuVar.zzc(4);
                                                }
                                            }
                                            for (int i44 = 0; i44 < i2; i44++) {
                                                zzacuVar.zzc(8);
                                                zzacuVar.zzc(8);
                                                zzacuVar.zzc(8);
                                            }
                                        } else {
                                            throw zzcc.zza("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                    }
                                }
                                int zzb19 = zzacuVar.zzb(6) + 1;
                                zzacw[] zzacwVarArr = new zzacw[zzb19];
                                for (int i45 = 0; i45 < zzb19; i45++) {
                                    zzacwVarArr[i45] = new zzacw(zzacuVar.zzd(), zzacuVar.zzb(16), zzacuVar.zzb(16), zzacuVar.zzb(8));
                                }
                                if (zzacuVar.zzd()) {
                                    zzaioVar = new zzaio(zzacxVar3, zzacvVar, bArr, zzacwVarArr, zzacy.zza(zzb19 - 1));
                                } else {
                                    throw zzcc.zza("framing bit after modes not set as expected", null);
                                }
                            }
                        }
                    }
                }
            }
        }
        zzaioVar = null;
        this.zza = zzaioVar;
        if (zzaioVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        zzacx zzacxVar4 = zzaioVar.zza;
        arrayList.add(zzacxVar4.zzg);
        arrayList.add(zzaioVar.zzc);
        zzby zzb20 = zzacy.zzb(zzfvs.zzk(zzaioVar.zzb.zzb));
        zzak zzakVar = new zzak();
        zzakVar.zzU("audio/vorbis");
        zzakVar.zzx(zzacxVar4.zzd);
        zzakVar.zzQ(zzacxVar4.zzc);
        zzakVar.zzy(zzacxVar4.zza);
        zzakVar.zzV(zzacxVar4.zzb);
        zzakVar.zzK(arrayList);
        zzakVar.zzO(zzb20);
        zzaikVar.zza = zzakVar.zzac();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzain
    public final void zzi(long j) {
        boolean z;
        super.zzi(j);
        int i = 0;
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        this.zzc = z;
        zzacx zzacxVar = this.zzd;
        if (zzacxVar != null) {
            i = zzacxVar.zze;
        }
        this.zzb = i;
    }
}
