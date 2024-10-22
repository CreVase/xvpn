package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* loaded from: classes.dex */
final class zzbru implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbrv zza;

    public zzbru(zzbrv zzbrvVar) {
        this.zza = zzbrvVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzg("User canceled the download.");
    }
}
