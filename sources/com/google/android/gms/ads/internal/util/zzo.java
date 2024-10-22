package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbdh;
import com.google.android.gms.internal.ads.zzbdj;
import com.google.android.gms.internal.ads.zzhbq;
import defpackage.wc0;
import defpackage.x50;
import defpackage.x80;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzo implements zzbdh {
    final /* synthetic */ zzbdj zza;
    final /* synthetic */ Context zzb;
    final /* synthetic */ Uri zzc;

    public zzo(zzt zztVar, zzbdj zzbdjVar, Context context, Uri uri) {
        this.zza = zzbdjVar;
        this.zzb = context;
        this.zzc = uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void zza() {
        x50 a2 = new wc0(this.zza.zza()).a();
        ((Intent) a2.f5117b).setPackage(zzhbq.zza(this.zzb));
        Context context = this.zzb;
        ((Intent) a2.f5117b).setData(this.zzc);
        x80.startActivity(context, (Intent) a2.f5117b, (Bundle) a2.c);
        this.zza.zzf((Activity) this.zzb);
    }
}
