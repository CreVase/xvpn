package com.google.android.gms.internal.ads;

import defpackage.hx2;

/* loaded from: classes.dex */
public final class zzph extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzam zzc;

    public zzph(int i, zzam zzamVar, boolean z) {
        super(hx2.m("AudioTrack write failed: ", i));
        this.zzb = z;
        this.zza = i;
        this.zzc = zzamVar;
    }
}
