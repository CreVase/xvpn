package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.common.wrappers.Wrappers;
import defpackage.ml1;

/* loaded from: classes.dex */
public final class zzesf implements zzetw, zzetv {
    private final ApplicationInfo zza;
    private final PackageInfo zzb;
    private final Context zzc;

    public zzesf(ApplicationInfo applicationInfo, PackageInfo packageInfo, Context context) {
        this.zza = applicationInfo;
        this.zzb = packageInfo;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return 29;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final ml1 zzb() {
        return zzfzt.zzh(this);
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Integer valueOf;
        Bundle bundle = (Bundle) obj;
        String str = this.zza.packageName;
        PackageInfo packageInfo = this.zzb;
        String str2 = null;
        if (packageInfo == null) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(packageInfo.versionCode);
        }
        bundle.putString("pn", str);
        if (valueOf != null) {
            bundle.putInt("vc", valueOf.intValue());
        }
        PackageInfo packageInfo2 = this.zzb;
        if (packageInfo2 != null) {
            str2 = packageInfo2.versionName;
        }
        if (str2 != null) {
            bundle.putString("vnm", str2);
        }
        try {
            Context context = this.zzc;
            String str3 = this.zza.packageName;
            zzfps zzfpsVar = com.google.android.gms.ads.internal.util.zzt.zza;
            bundle.putString("dl", String.valueOf(Wrappers.packageManager(context).getApplicationLabel(str3)));
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
