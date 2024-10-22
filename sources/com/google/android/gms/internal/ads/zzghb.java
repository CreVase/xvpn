package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes.dex */
public final class zzghb extends zzggz {
    public zzghb(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzggz
    public final zzggx zza(byte[] bArr, int i) throws InvalidKeyException {
        return new zzgha(bArr, i);
    }
}
