package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzc {
    public final long zzb;
    public final int zzc;
    public final Uri[] zzd;
    public final int[] zze;
    public final long[] zzf;
    public final long zzg;
    public final boolean zzh;
    private static final String zzi = Integer.toString(0, 36);
    private static final String zzj = Integer.toString(1, 36);
    private static final String zzk = Integer.toString(2, 36);
    private static final String zzl = Integer.toString(3, 36);
    private static final String zzm = Integer.toString(4, 36);
    private static final String zzn = Integer.toString(5, 36);
    private static final String zzo = Integer.toString(6, 36);
    private static final String zzp = Integer.toString(7, 36);
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzb
    };

    public zzc(long j) {
        this(0L, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzc.class == obj.getClass()) {
            zzc zzcVar = (zzc) obj;
            if (this.zzc == zzcVar.zzc && Arrays.equals(this.zzd, zzcVar.zzd) && Arrays.equals(this.zze, zzcVar.zze) && Arrays.equals(this.zzf, zzcVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.zzf) + ((Arrays.hashCode(this.zze) + (((((this.zzc * 31) - 1) * 961) + Arrays.hashCode(this.zzd)) * 31)) * 31)) * 961;
    }

    public final int zza(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.zze;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    public final zzc zzb(int i) {
        int[] iArr = this.zze;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = this.zzf;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        return new zzc(0L, 0, -1, copyOf, (Uri[]) Arrays.copyOf(this.zzd, 0), copyOf2, 0L, false);
    }

    private zzc(long j, int i, int i2, int[] iArr, Uri[] uriArr, long[] jArr, long j2, boolean z) {
        zzdx.zzd(iArr.length == uriArr.length);
        this.zzb = 0L;
        this.zzc = i;
        this.zze = iArr;
        this.zzd = uriArr;
        this.zzf = jArr;
        this.zzg = 0L;
        this.zzh = false;
    }
}
