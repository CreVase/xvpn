package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzalo;
import com.google.android.gms.internal.ads.zzamk;
import com.google.android.gms.internal.ads.zzaml;
import com.google.android.gms.internal.ads.zzank;
import com.google.android.gms.internal.ads.zzcas;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbk extends zzank {
    final /* synthetic */ byte[] zza;
    final /* synthetic */ Map zzb;
    final /* synthetic */ zzcas zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbk(zzbq zzbqVar, int i, String str, zzaml zzamlVar, zzamk zzamkVar, byte[] bArr, Map map, zzcas zzcasVar) {
        super(i, str, zzamlVar, zzamkVar);
        this.zza = bArr;
        this.zzb = map;
        this.zzc = zzcasVar;
    }

    @Override // com.google.android.gms.internal.ads.zzamg
    public final Map zzl() throws zzalo {
        Map map = this.zzb;
        if (map == null) {
            return Collections.emptyMap();
        }
        return map;
    }

    @Override // com.google.android.gms.internal.ads.zzamg
    public final byte[] zzx() throws zzalo {
        byte[] bArr = this.zza;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzank, com.google.android.gms.internal.ads.zzamg
    /* renamed from: zzz */
    public final void zzo(String str) {
        this.zzc.zzg(str);
        super.zzo(str);
    }
}
