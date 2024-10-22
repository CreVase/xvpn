package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* loaded from: classes.dex */
final class zzbrp implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbrq zza;

    public zzbrp(zzbrq zzbrqVar) {
        this.zza = zzbrqVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzg("Operation denied by user.");
    }
}
