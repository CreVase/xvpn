package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
final class zzff implements zzeh {
    private Message zza;
    private zzfg zzb;

    private zzff() {
    }

    public /* synthetic */ zzff(zzfe zzfeVar) {
    }

    private final void zzd() {
        this.zza = null;
        this.zzb = null;
        zzfg.zzl(this);
    }

    @Override // com.google.android.gms.internal.ads.zzeh
    public final void zza() {
        Message message = this.zza;
        message.getClass();
        message.sendToTarget();
        zzd();
    }

    public final zzff zzb(Message message, zzfg zzfgVar) {
        this.zza = message;
        this.zzb = zzfgVar;
        return this;
    }

    public final boolean zzc(Handler handler) {
        Message message = this.zza;
        message.getClass();
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        zzd();
        return sendMessageAtFrontOfQueue;
    }
}
