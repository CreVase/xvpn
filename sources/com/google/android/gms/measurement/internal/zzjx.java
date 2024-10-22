package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzjx implements Application.ActivityLifecycleCallbacks {
    private final /* synthetic */ zziq zza;

    public zzjx(zziq zziqVar) {
        this.zza = zziqVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00bd A[Catch: RuntimeException -> 0x01c8, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x01c8, blocks: (B:3:0x000d, B:5:0x001a, B:8:0x002b, B:10:0x0031, B:13:0x0042, B:19:0x00bd, B:21:0x00c9, B:24:0x00da, B:26:0x00e0, B:29:0x00f5, B:31:0x00fb, B:34:0x0108, B:36:0x010e, B:37:0x0126, B:38:0x0135, B:42:0x013c, B:46:0x015f, B:47:0x017b, B:49:0x016c, B:50:0x0182, B:52:0x0188, B:54:0x018e, B:56:0x0194, B:58:0x019a, B:60:0x01a2, B:64:0x01ae, B:66:0x01bc, B:68:0x01c2, B:75:0x0056, B:78:0x005e, B:80:0x0066, B:82:0x006c, B:84:0x0072, B:86:0x0078, B:88:0x0080, B:90:0x0088, B:93:0x0092, B:95:0x009a, B:96:0x00a6, B:98:0x00b4), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013c A[Catch: RuntimeException -> 0x01c8, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x01c8, blocks: (B:3:0x000d, B:5:0x001a, B:8:0x002b, B:10:0x0031, B:13:0x0042, B:19:0x00bd, B:21:0x00c9, B:24:0x00da, B:26:0x00e0, B:29:0x00f5, B:31:0x00fb, B:34:0x0108, B:36:0x010e, B:37:0x0126, B:38:0x0135, B:42:0x013c, B:46:0x015f, B:47:0x017b, B:49:0x016c, B:50:0x0182, B:52:0x0188, B:54:0x018e, B:56:0x0194, B:58:0x019a, B:60:0x01a2, B:64:0x01ae, B:66:0x01bc, B:68:0x01c2, B:75:0x0056, B:78:0x005e, B:80:0x0066, B:82:0x006c, B:84:0x0072, B:86:0x0078, B:88:0x0080, B:90:0x0088, B:93:0x0092, B:95:0x009a, B:96:0x00a6, B:98:0x00b4), top: B:2:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void zza(com.google.android.gms.measurement.internal.zzjx r17, boolean r18, android.net.Uri r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjx.zza(com.google.android.gms.measurement.internal.zzjx, boolean, android.net.Uri, java.lang.String, java.lang.String):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        String str;
        boolean z;
        try {
            this.zza.zzj().zzp().zza("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent == null) {
                return;
            }
            Uri data = intent.getData();
            if (data == null || !data.isHierarchical()) {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    String string = extras.getString("com.android.vending.referral_url");
                    if (!TextUtils.isEmpty(string)) {
                        data = Uri.parse(string);
                    }
                }
                data = null;
            }
            Uri uri = data;
            if (uri != null && uri.isHierarchical()) {
                this.zza.zzq();
                if (zznd.zza(intent)) {
                    str = "gs";
                } else {
                    str = "auto";
                }
                String str2 = str;
                String queryParameter = uri.getQueryParameter("referrer");
                if (bundle == null) {
                    z = true;
                } else {
                    z = false;
                }
                this.zza.zzl().zzb(new zzka(this, z, uri, str2, queryParameter));
            }
        } catch (RuntimeException e) {
            this.zza.zzj().zzg().zza("Throwable caught in onActivityCreated", e);
        } finally {
            this.zza.zzn().zza(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.zza.zzn().zza(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.zza.zzn().zzb(activity);
        zzlx zzp = this.zza.zzp();
        zzp.zzl().zzb(new zzlz(zzp, zzp.zzb().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zzlx zzp = this.zza.zzp();
        zzp.zzl().zzb(new zzma(zzp, zzp.zzb().elapsedRealtime()));
        this.zza.zzn().zzc(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.zza.zzn().zzb(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
