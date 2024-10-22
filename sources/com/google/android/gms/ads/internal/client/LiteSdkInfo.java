package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbou;
import com.google.android.gms.internal.ads.zzbox;

@KeepForSdk
/* loaded from: classes.dex */
public class LiteSdkInfo extends zzck {
    public LiteSdkInfo(Context context) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public zzbox getAdapterCreator() {
        return new zzbou();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public zzen getLiteSdkVersion() {
        return new zzen(ModuleDescriptor.MODULE_VERSION, 233702000, "22.5.0");
    }
}
