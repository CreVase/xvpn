package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzrn extends Handler {
    final /* synthetic */ zzrp zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzrn(zzrp zzrpVar, Looper looper) {
        super(looper);
        this.zza = zzrpVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        zzrp.zza(this.zza, message);
    }
}
