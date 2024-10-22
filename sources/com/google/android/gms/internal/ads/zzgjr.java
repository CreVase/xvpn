package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class zzgjr {
    public static final Charset zza = Charset.forName("UTF-8");

    public static final zzgrx zza(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= '!' && charAt <= '~') {
                bArr[i] = (byte) charAt;
            } else {
                throw new zzgjq("Not a printable ASCII character: " + charAt);
            }
        }
        return zzgrx.zzb(bArr);
    }
}
