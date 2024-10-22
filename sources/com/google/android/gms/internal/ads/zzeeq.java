package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import defpackage.ml1;
import defpackage.pr1;
import defpackage.qr1;

/* loaded from: classes.dex */
public final class zzeeq {
    private qr1 zza;
    private final Context zzb;

    public zzeeq(Context context) {
        this.zzb = context;
    }

    public final ml1 zza() {
        pr1 a2 = qr1.a(this.zzb);
        this.zza = a2;
        if (a2 == null) {
            return zzfzt.zzg(new IllegalStateException("MeasurementManagerFutures is null"));
        }
        return a2.b();
    }

    public final ml1 zzb(Uri uri, InputEvent inputEvent) {
        qr1 qr1Var = this.zza;
        qr1Var.getClass();
        return qr1Var.c(uri, inputEvent);
    }
}
