package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;

/* loaded from: classes.dex */
public final class zzepi implements zzetv {
    private final Integer zza;

    private zzepi(Integer num) {
        this.zza = num;
    }

    public static /* bridge */ /* synthetic */ zzepi zzb() {
        int i;
        int extensionVersion;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzju)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            if (Build.VERSION.SDK_INT >= 30) {
                extensionVersion = SdkExtensions.getExtensionVersion(30);
                if (extensionVersion > 3) {
                    i = SdkExtensions.getExtensionVersion(1000000);
                    return new zzepi(Integer.valueOf(i));
                }
            }
            i = 0;
            return new zzepi(Integer.valueOf(i));
        }
        return new zzepi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Integer num = this.zza;
        Bundle bundle = (Bundle) obj;
        if (num != null) {
            bundle.putInt("aos", num.intValue());
        }
    }
}
