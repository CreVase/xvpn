package com.google.android.gms.internal.auth;

import android.util.Base64;
import android.util.Log;
import defpackage.hx2;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcy extends zzdc {
    final /* synthetic */ zzhu zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcy(zzcz zzczVar, String str, Object obj, boolean z, zzhu zzhuVar, byte[] bArr) {
        super(zzczVar, "getTokenRefactor__blocked_packages", obj, true, null);
        this.zza = zzhuVar;
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final Object zza(Object obj) {
        try {
            return zzhr.zzk(Base64.decode((String) obj, 3));
        } catch (IOException | IllegalArgumentException unused) {
            StringBuilder u = hx2.u("Invalid byte[] value for ", super.zzc(), ": ");
            u.append((String) obj);
            Log.e("PhenotypeFlag", u.toString());
            return null;
        }
    }
}
