package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class zzagi {
    public byte[] zzM;
    public zzact zzS;
    public boolean zzT;
    public zzacs zzV;
    public int zzW;
    private int zzX;
    public String zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public boolean zzg;
    public byte[] zzh;
    public zzacr zzi;
    public byte[] zzj;
    public zzad zzk;
    public int zzl = -1;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = 0;
    public int zzq = -1;
    public float zzr = 0.0f;
    public float zzs = 0.0f;
    public float zzt = 0.0f;
    public byte[] zzu = null;
    public int zzv = -1;
    public boolean zzw = false;
    public int zzx = -1;
    public int zzy = -1;
    public int zzz = -1;
    public int zzA = 1000;
    public int zzB = 200;
    public float zzC = -1.0f;
    public float zzD = -1.0f;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public int zzN = 1;
    public int zzO = -1;
    public int zzP = 8000;
    public long zzQ = 0;
    public long zzR = 0;
    public boolean zzU = true;
    private String zzY = "eng";

    private static Pair zzf(zzfb zzfbVar) throws zzcc {
        try {
            zzfbVar.zzH(16);
            long zzr = zzfbVar.zzr();
            if (zzr == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (zzr == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (zzr == 826496599) {
                int zzc = zzfbVar.zzc() + 20;
                byte[] zzI = zzfbVar.zzI();
                while (true) {
                    int length = zzI.length;
                    if (zzc < length - 4) {
                        int i = zzc + 1;
                        if (zzI[zzc] == 0 && zzI[i] == 0 && zzI[zzc + 2] == 1 && zzI[zzc + 3] == 15) {
                            return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(zzI, zzc, length)));
                        }
                        zzc = i;
                    } else {
                        throw zzcc.zza("Failed to find FourCC VC1 initialization data", null);
                    }
                }
            } else {
                zzer.zzf("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzcc.zza("Error parsing FourCC private data", null);
        }
    }

    private static List zzg(byte[] bArr) throws zzcc {
        int i;
        int i2;
        try {
            if (bArr[0] == 2) {
                int i3 = 1;
                int i4 = 0;
                while (true) {
                    int i5 = bArr[i3];
                    i3++;
                    i = i5 & 255;
                    if (i != 255) {
                        break;
                    }
                    i4 += 255;
                }
                int i6 = i4 + i;
                int i7 = 0;
                while (true) {
                    int i8 = bArr[i3];
                    i3++;
                    i2 = i8 & 255;
                    if (i2 != 255) {
                        break;
                    }
                    i7 += 255;
                }
                int i9 = i7 + i2;
                if (bArr[i3] == 1) {
                    byte[] bArr2 = new byte[i6];
                    System.arraycopy(bArr, i3, bArr2, 0, i6);
                    int i10 = i3 + i6;
                    if (bArr[i10] == 3) {
                        int i11 = i10 + i9;
                        if (bArr[i11] == 5) {
                            int length = bArr.length - i11;
                            byte[] bArr3 = new byte[length];
                            System.arraycopy(bArr, i11, bArr3, 0, length);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw zzcc.zza("Error parsing vorbis codec private", null);
                    }
                    throw zzcc.zza("Error parsing vorbis codec private", null);
                }
                throw zzcc.zza("Error parsing vorbis codec private", null);
            }
            throw zzcc.zza("Error parsing vorbis codec private", null);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzcc.zza("Error parsing vorbis codec private", null);
        }
    }

    private static boolean zzh(zzfb zzfbVar) throws zzcc {
        UUID uuid;
        UUID uuid2;
        try {
            int zzj = zzfbVar.zzj();
            if (zzj == 1) {
                return true;
            }
            if (zzj == 65534) {
                zzfbVar.zzG(24);
                long zzs = zzfbVar.zzs();
                uuid = zzagj.zzf;
                if (zzs == uuid.getMostSignificantBits()) {
                    long zzs2 = zzfbVar.zzs();
                    uuid2 = zzagj.zzf;
                    if (zzs2 == uuid2.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzcc.zza("Error parsing MS/ACM codec private", null);
        }
    }

    private final byte[] zzi(String str) throws zzcc {
        byte[] bArr = this.zzj;
        if (bArr != null) {
            return bArr;
        }
        throw zzcc.zza("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x01a4. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x03e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zze(com.google.android.gms.internal.ads.zzabp r20, int r21) throws com.google.android.gms.internal.ads.zzcc {
        /*
            Method dump skipped, instructions count: 1726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagi.zze(com.google.android.gms.internal.ads.zzabp, int):void");
    }
}
