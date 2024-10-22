package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.protobuf.v;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzabj {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] zzc = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] zzd = {64, 112, 128, 192, 224, UserVerificationMethods.USER_VERIFY_HANDPRINT, 384, 448, 512, 640, 768, 896, UserVerificationMethods.USER_VERIFY_ALL, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, v.DEFAULT_BUFFER_SIZE, 6144, 7680};

    public static zzam zza(byte[] bArr, String str, String str2, zzad zzadVar) {
        zzfa zzfaVar;
        int i = 0;
        int i2 = -1;
        if (bArr[0] == Byte.MAX_VALUE) {
            zzfaVar = new zzfa(bArr, bArr.length);
        } else {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b2 = copyOf[0];
            if (b2 == -2 || b2 == -1) {
                for (int i3 = 0; i3 < copyOf.length - 1; i3 += 2) {
                    byte b3 = copyOf[i3];
                    int i4 = i3 + 1;
                    copyOf[i3] = copyOf[i4];
                    copyOf[i4] = b3;
                }
            }
            int length = copyOf.length;
            zzfaVar = new zzfa(copyOf, length);
            if (copyOf[0] == 31) {
                zzfa zzfaVar2 = new zzfa(copyOf, length);
                while (zzfaVar2.zza() >= 16) {
                    zzfaVar2.zzl(2);
                    zzfaVar.zzf(zzfaVar2.zzd(14), 14);
                }
            }
            zzfaVar.zzi(copyOf, copyOf.length);
        }
        zzfaVar.zzl(60);
        int i5 = zzb[zzfaVar.zzd(6)];
        int i6 = zzc[zzfaVar.zzd(4)];
        int zzd2 = zzfaVar.zzd(5);
        if (zzd2 < 29) {
            i2 = (zzd[zzd2] * 1000) / 2;
        }
        zzfaVar.zzl(10);
        if (zzfaVar.zzd(2) > 0) {
            i = 1;
        }
        int i7 = i5 + i;
        zzak zzakVar = new zzak();
        zzakVar.zzJ(str);
        zzakVar.zzU("audio/vnd.dts");
        zzakVar.zzx(i2);
        zzakVar.zzy(i7);
        zzakVar.zzV(i6);
        zzakVar.zzD(null);
        zzakVar.zzM(str2);
        return zzakVar.zzac();
    }
}
