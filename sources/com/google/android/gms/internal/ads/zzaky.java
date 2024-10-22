package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzaky implements zzabm {
    public static final zzabt zza = new zzabt() { // from class: com.google.android.gms.internal.ads.zzaku
        @Override // com.google.android.gms.internal.ads.zzabt
        public final /* synthetic */ zzabm[] zza(Uri uri, Map map) {
            int i = zzabs.zza;
            return new zzabm[]{new zzaky()};
        }
    };
    private zzabp zzb;
    private zzacs zzc;
    private zzakw zzf;
    private int zzd = 0;
    private long zze = -1;
    private int zzg = -1;
    private long zzh = -1;

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e6, code lost:            if (r1 != 65534) goto L43;     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010b  */
    @Override // com.google.android.gms.internal.ads.zzabm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.zzabn r19, com.google.android.gms.internal.ads.zzacj r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaky.zzb(com.google.android.gms.internal.ads.zzabn, com.google.android.gms.internal.ads.zzacj):int");
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final void zzc(zzabp zzabpVar) {
        this.zzb = zzabpVar;
        this.zzc = zzabpVar.zzw(0, 1);
        zzabpVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final void zzd(long j, long j2) {
        int i;
        if (j == 0) {
            i = 0;
        } else {
            i = 4;
        }
        this.zzd = i;
        zzakw zzakwVar = this.zzf;
        if (zzakwVar != null) {
            zzakwVar.zzb(j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final boolean zze(zzabn zzabnVar) throws IOException {
        return zzalb.zzc(zzabnVar);
    }
}
