package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import defpackage.ml1;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzetl implements zzetw {
    private final zzgad zza;
    private final Context zzb;
    private final zzcaz zzc;
    private final String zzd;

    public zzetl(zzgad zzgadVar, Context context, zzcaz zzcazVar, String str) {
        this.zza = zzgadVar;
        this.zzb = context;
        this.zzc = zzcazVar;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return 35;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final ml1 zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzetk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzetl.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzetm zzc() throws Exception {
        int i;
        boolean isCallerInstantApp = Wrappers.packageManager(this.zzb).isCallerInstantApp();
        com.google.android.gms.ads.internal.zzt.zzp();
        boolean zzD = com.google.android.gms.ads.internal.util.zzt.zzD(this.zzb);
        String str = this.zzc.zza;
        com.google.android.gms.ads.internal.zzt.zzp();
        boolean zzE = com.google.android.gms.ads.internal.util.zzt.zzE();
        com.google.android.gms.ads.internal.zzt.zzp();
        ApplicationInfo applicationInfo = this.zzb.getApplicationInfo();
        if (applicationInfo == null) {
            i = 0;
        } else {
            i = applicationInfo.targetSdkVersion;
        }
        Context context = this.zzb;
        return new zzetm(isCallerInstantApp, zzD, str, zzE, i, DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID), DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID), this.zzd);
    }
}
