package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import java.io.IOException;
import java.net.URLDecoder;

/* loaded from: classes.dex */
public final class zzgg extends zzgc {
    private zzgn zza;
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzgg() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.zzd;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.zzb;
        int i4 = zzfk.zza;
        System.arraycopy(bArr2, this.zzc, bArr, i, min);
        this.zzc += min;
        this.zzd -= min;
        zzg(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final long zzb(zzgn zzgnVar) throws IOException {
        zzi(zzgnVar);
        this.zza = zzgnVar;
        Uri normalizeScheme = zzgnVar.zza.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        zzdx.zze("data".equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        int i = zzfk.zza;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.zzb = Base64.decode(str, 0);
                } catch (IllegalArgumentException e) {
                    throw zzcc.zzb("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e);
                }
            } else {
                this.zzb = URLDecoder.decode(str, zzfsi.zza.name()).getBytes(zzfsi.zzc);
            }
            long j = zzgnVar.zzf;
            int length = this.zzb.length;
            if (j <= length) {
                int i2 = (int) j;
                this.zzc = i2;
                int i3 = length - i2;
                this.zzd = i3;
                long j2 = zzgnVar.zzg;
                if (j2 != -1) {
                    this.zzd = (int) Math.min(i3, j2);
                }
                zzj(zzgnVar);
                long j3 = zzgnVar.zzg;
                if (j3 != -1) {
                    return j3;
                }
                return this.zzd;
            }
            this.zzb = null;
            throw new zzgj(2008);
        }
        throw zzcc.zzb("Unexpected URI format: ".concat(String.valueOf(normalizeScheme)), null);
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final Uri zzc() {
        zzgn zzgnVar = this.zza;
        if (zzgnVar != null) {
            return zzgnVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final void zzd() {
        if (this.zzb != null) {
            this.zzb = null;
            zzh();
        }
        this.zza = null;
    }
}
