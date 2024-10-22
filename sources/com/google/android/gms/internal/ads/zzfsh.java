package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class zzfsh implements zzfsx {
    public static zzfsh zzc(char c) {
        return new zzfse(c);
    }

    @Override // com.google.android.gms.internal.ads.zzfsx
    @Deprecated
    public final /* synthetic */ boolean zza(Object obj) {
        return zzb(((Character) obj).charValue());
    }

    public abstract boolean zzb(char c);
}
