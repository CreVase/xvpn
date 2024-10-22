package com.google.android.gms.internal.auth;

import android.util.Log;
import defpackage.hx2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcv extends zzdc {
    public zzcv(zzcz zzczVar, String str, Long l, boolean z) {
        super(zzczVar, str, l, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder u = hx2.u("Invalid long value for ", super.zzc(), ": ");
            u.append((String) obj);
            Log.e("PhenotypeFlag", u.toString());
            return null;
        }
    }
}
