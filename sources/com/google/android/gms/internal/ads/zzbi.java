package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbi {
    public final Uri zzb;
    public final List zzf;
    public final zzfvs zzh;

    @Deprecated
    public final List zzi;
    public final Object zzj;
    public final long zzk;
    private static final String zzl = Integer.toString(0, 36);
    private static final String zzm = Integer.toString(1, 36);
    private static final String zzn = Integer.toString(2, 36);
    private static final String zzo = Integer.toString(3, 36);
    private static final String zzp = Integer.toString(4, 36);
    private static final String zzq = Integer.toString(5, 36);
    private static final String zzr = Integer.toString(6, 36);
    private static final String zzs = Integer.toString(7, 36);
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzbg
    };
    public final String zzc = null;
    public final zzbb zzd = null;
    public final zzaq zze = null;
    public final String zzg = null;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ zzbi(Uri uri, String str, zzbb zzbbVar, zzaq zzaqVar, List list, String str2, zzfvs zzfvsVar, Object obj, long j, zzbh zzbhVar) {
        this.zzb = uri;
        this.zzf = list;
        this.zzh = zzfvsVar;
        zzfvp zzfvpVar = new zzfvp();
        if (zzfvsVar.size() <= 0) {
            this.zzi = zzfvpVar.zzi();
            this.zzj = null;
            this.zzk = -9223372036854775807L;
            return;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbi)) {
            return false;
        }
        zzbi zzbiVar = (zzbi) obj;
        if (this.zzb.equals(zzbiVar.zzb) && zzfk.zzE(null, null) && zzfk.zzE(null, null) && zzfk.zzE(null, null) && this.zzf.equals(zzbiVar.zzf) && zzfk.zzE(null, null) && this.zzh.equals(zzbiVar.zzh) && zzfk.zzE(null, null) && zzfk.zzE(-9223372036854775807L, -9223372036854775807L)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (int) ((((this.zzh.hashCode() + ((this.zzf.hashCode() + (this.zzb.hashCode() * 923521)) * 961)) * 31) * 31) - Long.MAX_VALUE);
    }
}
