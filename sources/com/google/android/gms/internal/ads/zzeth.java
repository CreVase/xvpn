package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.ml1;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzeth implements zzetw {
    private final zzbyy zza;
    private final zzgad zzb;
    private final Context zzc;

    public zzeth(zzbyy zzbyyVar, zzgad zzgadVar, Context context) {
        this.zza = zzbyyVar;
        this.zzb = zzgadVar;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return 34;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final ml1 zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzetg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeth.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzeti zzc() throws Exception {
        String str;
        String str2;
        String str3;
        String str4;
        Long l;
        if (!this.zza.zzu(this.zzc)) {
            return new zzeti(null, null, null, null, null);
        }
        String zze = this.zza.zze(this.zzc);
        if (zze == null) {
            str = "";
        } else {
            str = zze;
        }
        String zzc = this.zza.zzc(this.zzc);
        if (zzc == null) {
            str2 = "";
        } else {
            str2 = zzc;
        }
        String zza = this.zza.zza(this.zzc);
        if (zza == null) {
            str3 = "";
        } else {
            str3 = zza;
        }
        String zzb = this.zza.zzb(this.zzc);
        if (zzb == null) {
            str4 = "";
        } else {
            str4 = zzb;
        }
        if ("TIME_OUT".equals(str2)) {
            l = (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzaf);
        } else {
            l = null;
        }
        return new zzeti(str, str2, str3, str4, l);
    }
}
