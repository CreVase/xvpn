package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* loaded from: classes.dex */
public final class zzru {
    public final zzrz zza;
    public final MediaFormat zzb;
    public final zzam zzc;
    public final Surface zzd;
    public final MediaCrypto zze = null;

    private zzru(zzrz zzrzVar, MediaFormat mediaFormat, zzam zzamVar, Surface surface, MediaCrypto mediaCrypto, int i) {
        this.zza = zzrzVar;
        this.zzb = mediaFormat;
        this.zzc = zzamVar;
        this.zzd = surface;
    }

    public static zzru zza(zzrz zzrzVar, MediaFormat mediaFormat, zzam zzamVar, MediaCrypto mediaCrypto) {
        return new zzru(zzrzVar, mediaFormat, zzamVar, null, null, 0);
    }

    public static zzru zzb(zzrz zzrzVar, MediaFormat mediaFormat, zzam zzamVar, Surface surface, MediaCrypto mediaCrypto) {
        return new zzru(zzrzVar, mediaFormat, zzamVar, surface, null, 0);
    }
}
