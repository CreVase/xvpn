package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgrr extends ThreadLocal {
    final /* synthetic */ zzgrs zza;

    public zzgrr(zzgrs zzgrsVar) {
        this.zza = zzgrsVar;
    }

    @Override // java.lang.ThreadLocal
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        String str;
        Key key;
        try {
            zzgrf zzgrfVar = zzgrf.zzb;
            str = this.zza.zzb;
            Mac mac = (Mac) zzgrfVar.zza(str);
            key = this.zza.zzc;
            mac.init(key);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
