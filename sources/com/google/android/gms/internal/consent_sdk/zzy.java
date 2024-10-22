package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzy implements zzdo {
    private final zzdr zza;
    private final zzdr zzb;
    private final zzdr zzc;
    private final zzdr zzd;
    private final zzdr zze;
    private final zzdr zzf;
    private final zzdr zzg;
    private final zzdr zzh;
    private final zzdr zzi;

    public zzy(zzdr zzdrVar, zzdr zzdrVar2, zzdr zzdrVar3, zzdr zzdrVar4, zzdr zzdrVar5, zzdr zzdrVar6, zzdr zzdrVar7, zzdr zzdrVar8, zzdr zzdrVar9) {
        this.zza = zzdrVar;
        this.zzb = zzdrVar2;
        this.zzc = zzdrVar3;
        this.zzd = zzdrVar4;
        this.zze = zzdrVar5;
        this.zzf = zzdrVar6;
        this.zzg = zzdrVar7;
        this.zzh = zzdrVar8;
        this.zzi = zzdrVar9;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdr
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzx zzb() {
        Application application = (Application) this.zza.zzb();
        zzae zzaeVar = (zzae) this.zzb.zzb();
        Handler handler = zzct.zza;
        zzdq.zza(handler);
        Executor executor = zzct.zzb;
        zzdq.zza(executor);
        return new zzx(application, zzaeVar, handler, executor, (zzas) this.zze.zzb(), (zzbq) this.zzf.zzb(), ((zzq) this.zzg).zzb(), ((zzad) this.zzh).zzb(), (zzg) this.zzi.zzb());
    }
}
