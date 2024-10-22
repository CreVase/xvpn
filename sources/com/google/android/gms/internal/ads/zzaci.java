package com.google.android.gms.internal.ads;

import com.vungle.ads.VungleError;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzaci {
    public static int zza(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static int zzb(ByteBuffer byteBuffer) {
        int i;
        byte b2 = 0;
        if ((byteBuffer.get(5) & 2) == 0) {
            i = 0;
        } else {
            byte b3 = byteBuffer.get(26);
            int i2 = 28;
            int i3 = 28;
            for (int i4 = 0; i4 < b3; i4++) {
                i3 += byteBuffer.get(i4 + 27);
            }
            byte b4 = byteBuffer.get(i3 + 26);
            for (int i5 = 0; i5 < b4; i5++) {
                i2 += byteBuffer.get(i3 + 27 + i5);
            }
            i = i3 + i2;
        }
        int i6 = byteBuffer.get(i + 26) + 27 + i;
        byte b5 = byteBuffer.get(i6);
        if (byteBuffer.limit() - i6 > 1) {
            b2 = byteBuffer.get(i6 + 1);
        }
        return (int) ((zzf(b5, b2) * 48000) / 1000000);
    }

    public static int zzc(ByteBuffer byteBuffer) {
        byte b2 = 0;
        byte b3 = byteBuffer.get(0);
        if (byteBuffer.limit() > 1) {
            b2 = byteBuffer.get(1);
        }
        return (int) ((zzf(b3, b2) * 48000) / 1000000);
    }

    public static long zzd(byte[] bArr) {
        byte b2 = 0;
        byte b3 = bArr[0];
        if (bArr.length > 1) {
            b2 = bArr[1];
        }
        return zzf(b3, b2);
    }

    public static List zze(byte[] bArr) {
        long zza = zza(bArr);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(zzh(zzg(zza)));
        arrayList.add(zzh(zzg(3840L)));
        return arrayList;
    }

    private static long zzf(byte b2, byte b3) {
        int i;
        int i2 = b2 & 255;
        int i3 = i2 & 3;
        if (i3 != 0) {
            i = 2;
            if (i3 != 1 && i3 != 2) {
                i = b3 & 63;
            }
        } else {
            i = 1;
        }
        int i4 = i2 >> 3;
        return i * (i4 >= 16 ? 2500 << r0 : i4 >= 12 ? VungleError.DEFAULT << (r0 & 1) : (i4 & 3) == 3 ? 60000 : VungleError.DEFAULT << r0);
    }

    private static long zzg(long j) {
        return (j * 1000000000) / 48000;
    }

    private static byte[] zzh(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }
}
