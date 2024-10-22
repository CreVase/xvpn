package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import defpackage.ml1;
import java.util.Set;
import java.util.concurrent.Callable;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes.dex */
public final class zzerb implements zzetw {
    private final zzgad zza;
    private final ViewGroup zzb;
    private final Context zzc;
    private final Set zzd;

    public zzerb(zzgad zzgadVar, ViewGroup viewGroup, Context context, Set set) {
        this.zza = zzgadVar;
        this.zzd = set;
        this.zzb = viewGroup;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return 22;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final ml1 zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzera
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzerb.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzerc zzc() throws Exception {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzfP)).booleanValue() && this.zzb != null && this.zzd.contains("banner")) {
            return new zzerc(Boolean.valueOf(this.zzb.isHardwareAccelerated()));
        }
        Boolean bool = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzfQ)).booleanValue() && this.zzd.contains("native")) {
            Context context = this.zzc;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                if (window != null && (window.getAttributes().flags & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0) {
                    bool = Boolean.TRUE;
                } else {
                    try {
                        boolean z = false;
                        if ((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) != 0) {
                            z = true;
                        }
                        bool = Boolean.valueOf(z);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                return new zzerc(bool);
            }
        }
        return new zzerc(null);
    }
}
