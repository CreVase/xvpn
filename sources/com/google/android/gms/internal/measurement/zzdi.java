package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzdf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdi extends zzdf.zza {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ Context zze;
    private final /* synthetic */ Bundle zzf;
    private final /* synthetic */ zzdf zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdi(zzdf zzdfVar, String str, String str2, Context context, Bundle bundle) {
        super(zzdfVar);
        this.zzg = zzdfVar;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        boolean zzc;
        String str;
        String str2;
        String str3;
        zzcu zzcuVar;
        boolean z;
        zzcu zzcuVar2;
        String str4;
        String unused;
        try {
            zzc = this.zzg.zzc(this.zzc, this.zzd);
            if (zzc) {
                String str5 = this.zzd;
                String str6 = this.zzc;
                str4 = this.zzg.zzc;
                str3 = str5;
                str2 = str6;
                str = str4;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            Preconditions.checkNotNull(this.zze);
            zzdf zzdfVar = this.zzg;
            zzdfVar.zzj = zzdfVar.zza(this.zze, true);
            zzcuVar = this.zzg.zzj;
            if (zzcuVar == null) {
                unused = this.zzg.zzc;
                return;
            }
            int localVersion = DynamiteModule.getLocalVersion(this.zze, ModuleDescriptor.MODULE_ID);
            int remoteVersion = DynamiteModule.getRemoteVersion(this.zze, ModuleDescriptor.MODULE_ID);
            int max = Math.max(localVersion, remoteVersion);
            if (remoteVersion < localVersion) {
                z = true;
            } else {
                z = false;
            }
            zzdd zzddVar = new zzdd(82001L, max, z, str, str2, str3, this.zzf, com.google.android.gms.measurement.internal.zzgz.zza(this.zze));
            zzcuVar2 = this.zzg.zzj;
            ((zzcu) Preconditions.checkNotNull(zzcuVar2)).initialize(ObjectWrapper.wrap(this.zze), zzddVar, this.zza);
        } catch (Exception e) {
            this.zzg.zza(e, true, false);
        }
    }
}
