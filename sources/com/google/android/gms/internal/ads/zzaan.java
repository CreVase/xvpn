package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class zzaan {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {24000, 22050, 16000};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, UserVerificationMethods.USER_VERIFY_HANDPRINT, 320, 384, 448, 512, 576, 640};
    private static final int[] zzg = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int zza(ByteBuffer byteBuffer) {
        int i = 3;
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
                i = (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4;
            }
            return zzb[i] * UserVerificationMethods.USER_VERIFY_HANDPRINT;
        }
        return 1536;
    }

    public static int zzb(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            int i = bArr[2] & 7;
            int i2 = ((bArr[3] & 255) | (i << 8)) + 1;
            return i2 + i2;
        }
        byte b2 = bArr[4];
        return zzf((b2 & 192) >> 6, b2 & 63);
    }

    public static zzam zzc(zzfb zzfbVar, String str, String str2, zzad zzadVar) {
        zzfa zzfaVar = new zzfa();
        zzfaVar.zzh(zzfbVar);
        int i = zzc[zzfaVar.zzd(2)];
        zzfaVar.zzl(8);
        int i2 = zze[zzfaVar.zzd(3)];
        if (zzfaVar.zzd(1) != 0) {
            i2++;
        }
        int i3 = zzf[zzfaVar.zzd(5)] * 1000;
        zzfaVar.zze();
        zzfbVar.zzG(zzfaVar.zzb());
        zzak zzakVar = new zzak();
        zzakVar.zzJ(str);
        zzakVar.zzU("audio/ac3");
        zzakVar.zzy(i2);
        zzakVar.zzV(i);
        zzakVar.zzD(zzadVar);
        zzakVar.zzM(str2);
        zzakVar.zzx(i3);
        zzakVar.zzQ(i3);
        return zzakVar.zzac();
    }

    public static zzam zzd(zzfb zzfbVar, String str, String str2, zzad zzadVar) {
        String str3;
        zzfa zzfaVar = new zzfa();
        zzfaVar.zzh(zzfbVar);
        int zzd2 = zzfaVar.zzd(13) * 1000;
        zzfaVar.zzl(3);
        int i = zzc[zzfaVar.zzd(2)];
        zzfaVar.zzl(10);
        int i2 = zze[zzfaVar.zzd(3)];
        if (zzfaVar.zzd(1) != 0) {
            i2++;
        }
        zzfaVar.zzl(3);
        int zzd3 = zzfaVar.zzd(4);
        zzfaVar.zzl(1);
        if (zzd3 > 0) {
            zzfaVar.zzl(6);
            if (zzfaVar.zzd(1) != 0) {
                i2 += 2;
            }
            zzfaVar.zzl(1);
        }
        if (zzfaVar.zza() > 7) {
            zzfaVar.zzl(7);
            if (zzfaVar.zzd(1) != 0) {
                str3 = "audio/eac3-joc";
                zzfaVar.zze();
                zzfbVar.zzG(zzfaVar.zzb());
                zzak zzakVar = new zzak();
                zzakVar.zzJ(str);
                zzakVar.zzU(str3);
                zzakVar.zzy(i2);
                zzakVar.zzV(i);
                zzakVar.zzD(zzadVar);
                zzakVar.zzM(str2);
                zzakVar.zzQ(zzd2);
                return zzakVar.zzac();
            }
        }
        str3 = "audio/eac3";
        zzfaVar.zze();
        zzfbVar.zzG(zzfaVar.zzb());
        zzak zzakVar2 = new zzak();
        zzakVar2.zzJ(str);
        zzakVar2.zzU(str3);
        zzakVar2.zzy(i2);
        zzakVar2.zzV(i);
        zzakVar2.zzD(zzadVar);
        zzakVar2.zzM(str2);
        zzakVar2.zzQ(zzd2);
        return zzakVar2.zzac();
    }

    public static zzaam zze(zzfa zzfaVar) {
        String str;
        int i;
        String str2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        String str3;
        int zzc2 = zzfaVar.zzc();
        zzfaVar.zzl(40);
        int zzd2 = zzfaVar.zzd(5);
        zzfaVar.zzj(zzc2);
        int i13 = -1;
        if (zzd2 > 10) {
            zzfaVar.zzl(16);
            int zzd3 = zzfaVar.zzd(2);
            if (zzd3 != 0) {
                if (zzd3 != 1) {
                    if (zzd3 == 2) {
                        i13 = 2;
                    }
                } else {
                    i13 = 1;
                }
            } else {
                i13 = 0;
            }
            zzfaVar.zzl(3);
            int zzd4 = zzfaVar.zzd(11) + 1;
            int zzd5 = zzfaVar.zzd(2);
            if (zzd5 == 3) {
                i9 = zzd[zzfaVar.zzd(2)];
                i8 = 3;
                i10 = 6;
            } else {
                int zzd6 = zzfaVar.zzd(2);
                int i14 = zzb[zzd6];
                i8 = zzd6;
                i9 = zzc[zzd5];
                i10 = i14;
            }
            int i15 = zzd4 + zzd4;
            int i16 = (i15 * i9) / (i10 * 32);
            int zzd7 = zzfaVar.zzd(3);
            boolean zzn = zzfaVar.zzn();
            int i17 = zze[zzd7] + (zzn ? 1 : 0);
            zzfaVar.zzl(10);
            if (zzfaVar.zzn()) {
                zzfaVar.zzl(8);
            }
            if (zzd7 == 0) {
                zzfaVar.zzl(5);
                if (zzfaVar.zzn()) {
                    zzfaVar.zzl(8);
                }
                i11 = 0;
                zzd7 = 0;
            } else {
                i11 = zzd7;
            }
            if (i13 == 1) {
                if (zzfaVar.zzn()) {
                    zzfaVar.zzl(16);
                }
                i12 = 1;
            } else {
                i12 = i13;
            }
            if (zzfaVar.zzn()) {
                if (i11 > 2) {
                    zzfaVar.zzl(2);
                }
                if ((i11 & 1) != 0 && i11 > 2) {
                    zzfaVar.zzl(6);
                }
                if ((i11 & 4) != 0) {
                    zzfaVar.zzl(6);
                }
                if (zzn && zzfaVar.zzn()) {
                    zzfaVar.zzl(5);
                }
                if (i12 == 0) {
                    if (zzfaVar.zzn()) {
                        zzfaVar.zzl(6);
                    }
                    if (i11 == 0 && zzfaVar.zzn()) {
                        zzfaVar.zzl(6);
                    }
                    if (zzfaVar.zzn()) {
                        zzfaVar.zzl(6);
                    }
                    int zzd8 = zzfaVar.zzd(2);
                    if (zzd8 == 1) {
                        zzfaVar.zzl(5);
                    } else if (zzd8 == 2) {
                        zzfaVar.zzl(12);
                    } else if (zzd8 == 3) {
                        int zzd9 = zzfaVar.zzd(5);
                        if (zzfaVar.zzn()) {
                            zzfaVar.zzl(5);
                            if (zzfaVar.zzn()) {
                                zzfaVar.zzl(4);
                            }
                            if (zzfaVar.zzn()) {
                                zzfaVar.zzl(4);
                            }
                            if (zzfaVar.zzn()) {
                                zzfaVar.zzl(4);
                            }
                            if (zzfaVar.zzn()) {
                                zzfaVar.zzl(4);
                            }
                            if (zzfaVar.zzn()) {
                                zzfaVar.zzl(4);
                            }
                            if (zzfaVar.zzn()) {
                                zzfaVar.zzl(4);
                            }
                            if (zzfaVar.zzn()) {
                                zzfaVar.zzl(4);
                            }
                            if (zzfaVar.zzn()) {
                                if (zzfaVar.zzn()) {
                                    zzfaVar.zzl(4);
                                }
                                if (zzfaVar.zzn()) {
                                    zzfaVar.zzl(4);
                                }
                            }
                        }
                        if (zzfaVar.zzn()) {
                            zzfaVar.zzl(5);
                            if (zzfaVar.zzn()) {
                                zzfaVar.zzl(7);
                                if (zzfaVar.zzn()) {
                                    zzfaVar.zzl(8);
                                }
                            }
                        }
                        zzfaVar.zzl((zzd9 + 2) * 8);
                        zzfaVar.zze();
                    }
                    if (i11 < 2) {
                        if (zzfaVar.zzn()) {
                            zzfaVar.zzl(14);
                        }
                        if (zzd7 == 0 && zzfaVar.zzn()) {
                            zzfaVar.zzl(14);
                        }
                    }
                    if (zzfaVar.zzn()) {
                        if (i8 == 0) {
                            zzfaVar.zzl(5);
                            i12 = 0;
                            i8 = 0;
                        } else {
                            for (int i18 = 0; i18 < i10; i18++) {
                                if (zzfaVar.zzn()) {
                                    zzfaVar.zzl(5);
                                }
                            }
                        }
                    }
                    i12 = 0;
                }
            }
            if (zzfaVar.zzn()) {
                zzfaVar.zzl(5);
                if (i11 == 2) {
                    zzfaVar.zzl(4);
                    i11 = 2;
                }
                if (i11 >= 6) {
                    zzfaVar.zzl(2);
                }
                if (zzfaVar.zzn()) {
                    zzfaVar.zzl(8);
                }
                if (i11 == 0 && zzfaVar.zzn()) {
                    zzfaVar.zzl(8);
                }
                if (zzd5 < 3) {
                    zzfaVar.zzk();
                }
            }
            if (i12 == 0 && i8 != 3) {
                zzfaVar.zzk();
            }
            if (i12 == 2 && (i8 == 3 || zzfaVar.zzn())) {
                zzfaVar.zzl(6);
            }
            if (zzfaVar.zzn() && zzfaVar.zzd(6) == 1 && zzfaVar.zzd(8) == 1) {
                str3 = "audio/eac3-joc";
            } else {
                str3 = "audio/eac3";
            }
            str2 = str3;
            i6 = i13;
            i3 = i15;
            i4 = i9;
            i7 = i10 * UserVerificationMethods.USER_VERIFY_HANDPRINT;
            i2 = i16;
            i5 = i17;
        } else {
            zzfaVar.zzl(32);
            int zzd10 = zzfaVar.zzd(2);
            if (zzd10 == 3) {
                str = null;
            } else {
                str = "audio/ac3";
            }
            int zzd11 = zzfaVar.zzd(6);
            int i19 = zzf[zzd11 / 2] * 1000;
            int zzf2 = zzf(zzd10, zzd11);
            zzfaVar.zzl(8);
            int zzd12 = zzfaVar.zzd(3);
            if ((zzd12 & 1) != 0 && zzd12 != 1) {
                zzfaVar.zzl(2);
            }
            if ((zzd12 & 4) != 0) {
                zzfaVar.zzl(2);
            }
            if (zzd12 == 2) {
                zzfaVar.zzl(2);
            }
            if (zzd10 < 3) {
                i = zzc[zzd10];
            } else {
                i = -1;
            }
            str2 = str;
            i2 = i19;
            i3 = zzf2;
            i4 = i;
            i5 = zze[zzd12] + (zzfaVar.zzn() ? 1 : 0);
            i6 = -1;
            i7 = 1536;
        }
        return new zzaam(str2, i6, i5, i4, i3, i7, i2, null);
    }

    private static int zzf(int i, int i2) {
        int i3;
        if (i < 0 || i >= 3 || i2 < 0 || (i3 = i2 >> 1) >= 19) {
            return -1;
        }
        int i4 = zzc[i];
        if (i4 == 44100) {
            int i5 = zzg[i3] + (i2 & 1);
            return i5 + i5;
        }
        int i6 = zzf[i3];
        return i4 == 32000 ? i6 * 6 : i6 * 4;
    }
}
