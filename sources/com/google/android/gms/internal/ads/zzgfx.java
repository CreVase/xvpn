package com.google.android.gms.internal.ads;

import defpackage.hx2;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzgfx implements zzgax {
    private static final byte[] zza = new byte[0];
    private static final Set zzb;
    private final zzgpe zzc;
    private final zzgax zzd;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = Collections.unmodifiableSet(hashSet);
    }

    public zzgfx(zzgpe zzgpeVar, zzgax zzgaxVar) {
        if (zzb(zzgpeVar.zzg())) {
            this.zzc = zzgpeVar;
            this.zzd = zzgaxVar;
            return;
        }
        throw new IllegalArgumentException(hx2.q("Unsupported DEK key type: ", zzgpeVar.zzg(), ". Only Tink AEAD key types are supported."));
    }

    public static boolean zzb(String str) {
        return zzb.contains(str);
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i = wrap.getInt();
            if (i > 0 && i <= bArr.length - 4) {
                byte[] bArr3 = new byte[i];
                wrap.get(bArr3, 0, i);
                byte[] bArr4 = new byte[wrap.remaining()];
                wrap.get(bArr4, 0, wrap.remaining());
                byte[] zza2 = this.zzd.zza(bArr3, zza);
                String zzg = this.zzc.zzg();
                int i2 = zzgcg.zza;
                zzgsr zzgsrVar = zzgsr.zzb;
                return ((zzgax) zzgcg.zzd(zzg, zzgsr.zzv(zza2, 0, zza2.length), zzgax.class)).zza(bArr4, bArr2);
            }
            throw new GeneralSecurityException("invalid ciphertext");
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e) {
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
