package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* loaded from: classes.dex */
public final class zzcax {
    public static Context zza(Context context) throws zzcaw {
        return zzc(context).getModuleContext();
    }

    public static Object zzb(Context context, String str, zzcav zzcavVar) throws zzcaw {
        try {
            return zzcavVar.zza(zzc(context).instantiate(str));
        } catch (Exception e) {
            throw new zzcaw(e);
        }
    }

    private static DynamiteModule zzc(Context context) throws zzcaw {
        try {
            return DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID);
        } catch (Exception e) {
            throw new zzcaw(e);
        }
    }
}
