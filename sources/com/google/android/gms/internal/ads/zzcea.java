package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzcea extends zzano {
    static final zzcea zzb = new zzcea();

    @Override // com.google.android.gms.internal.ads.zzano
    public final zzans zza(String str, byte[] bArr, String str2) {
        if ("moov".equals(str)) {
            return new zzanu();
        }
        if ("mvhd".equals(str)) {
            return new zzanv();
        }
        return new zzanw(str);
    }
}
