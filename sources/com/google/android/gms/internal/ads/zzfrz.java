package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;

/* loaded from: classes.dex */
public final class zzfrz {
    private static final zzfrl zza = new zzfrl("PhoneskyVerificationUtils");

    public static boolean zza(Context context) {
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr != null && (signatureArr.length) != 0) {
                    for (Signature signature : signatureArr) {
                        String zza2 = zzfry.zza(signature.toByteArray());
                        if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(zza2)) {
                            if ((Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(zza2)) {
                                return true;
                            }
                        } else {
                            return true;
                        }
                    }
                } else {
                    zza.zzd("Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }
}
