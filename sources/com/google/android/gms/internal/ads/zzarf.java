package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class zzarf implements zzfol {
    final /* synthetic */ zzfml zza;

    public zzarf(zzarh zzarhVar, zzfml zzfmlVar) {
        this.zza = zzfmlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfol
    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
