package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import defpackage.q2;

/* loaded from: classes.dex */
final class zzhp {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb = q2.e();

    public static /* bridge */ /* synthetic */ void zza(zzhp zzhpVar, int i, int i2) {
        zzhpVar.zzb.set(i, i2);
        zzhpVar.zza.setPattern(zzhpVar.zzb);
    }
}
