package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbro implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbrq zza;

    public zzbro(zzbrq zzbrqVar) {
        this.zza = zzbrqVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context;
        zzbrq zzbrqVar = this.zza;
        Intent zzb = zzbrqVar.zzb();
        com.google.android.gms.ads.internal.zzt.zzp();
        context = zzbrqVar.zzb;
        com.google.android.gms.ads.internal.util.zzt.zzS(context, zzb);
    }
}
