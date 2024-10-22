package com.google.android.gms.internal.ads;

import android.net.Uri;
import defpackage.hx2;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzgn {
    public static final /* synthetic */ int zzj = 0;
    public final Uri zza;
    public final int zzb;
    public final byte[] zzc;
    public final Map zzd;

    @Deprecated
    public final long zze;
    public final long zzf;
    public final long zzg;
    public final String zzh;
    public final int zzi;

    static {
        zzbq.zzb("media3.datasource");
    }

    public final String toString() {
        StringBuilder u = hx2.u("DataSpec[GET ", String.valueOf(this.zza), ", ");
        u.append(this.zzf);
        u.append(", ");
        u.append(this.zzg);
        u.append(", null, ");
        return hx2.r(u, this.zzi, "]");
    }

    public final boolean zza(int i) {
        return (this.zzi & i) == i;
    }

    public zzgn(Uri uri) {
        this(uri, 0L, 1, null, Collections.emptyMap(), 0L, -1L, null, 0, null);
    }

    @Deprecated
    public zzgn(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        this(uri, j - j2, 1, null, Collections.emptyMap(), j2, j3, null, i, null);
    }

    private zzgn(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2, Object obj) {
        long j4 = j + j2;
        boolean z = false;
        zzdx.zzd(j4 >= 0);
        zzdx.zzd(j2 >= 0);
        if (j3 <= 0) {
            j3 = j3 == -1 ? -1L : j3;
            zzdx.zzd(z);
            this.zza = uri;
            this.zzb = 1;
            this.zzc = null;
            this.zzd = Collections.unmodifiableMap(new HashMap(map));
            this.zzf = j2;
            this.zze = j4;
            this.zzg = j3;
            this.zzh = null;
            this.zzi = i2;
        }
        z = true;
        zzdx.zzd(z);
        this.zza = uri;
        this.zzb = 1;
        this.zzc = null;
        this.zzd = Collections.unmodifiableMap(new HashMap(map));
        this.zzf = j2;
        this.zze = j4;
        this.zzg = j3;
        this.zzh = null;
        this.zzi = i2;
    }
}
