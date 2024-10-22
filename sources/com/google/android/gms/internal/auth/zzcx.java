package com.google.android.gms.internal.auth;

import android.util.Log;
import defpackage.hx2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcx extends zzdc {
    public zzcx(zzcz zzczVar, String str, Double d, boolean z) {
        super(zzczVar, str, d, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder u = hx2.u("Invalid double value for ", super.zzc(), ": ");
            u.append((String) obj);
            Log.e("PhenotypeFlag", u.toString());
            return null;
        }
    }
}
