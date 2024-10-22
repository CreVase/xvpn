package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.zzaj;
import com.google.android.gms.internal.play_billing.zzak;
import defpackage.hx2;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class zzak<MessageType extends zzak<MessageType, BuilderType>, BuilderType extends zzaj<MessageType, BuilderType>> implements zzdf {
    protected int zza = 0;

    public int zza(zzdp zzdpVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdf
    public final zzba zzb() {
        try {
            int zze = zze();
            zzba zzbaVar = zzba.zzb;
            byte[] bArr = new byte[zze];
            zzbi zzz = zzbi.zzz(bArr, 0, zze);
            zzr(zzz);
            zzz.zzA();
            return new zzax(bArr);
        } catch (IOException e) {
            throw new RuntimeException(hx2.q("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e);
        }
    }

    public final byte[] zzc() {
        try {
            int zze = zze();
            byte[] bArr = new byte[zze];
            zzbi zzz = zzbi.zzz(bArr, 0, zze);
            zzr(zzz);
            zzz.zzA();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(hx2.q("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
        }
    }
}
