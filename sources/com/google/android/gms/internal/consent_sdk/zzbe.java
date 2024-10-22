package com.google.android.gms.internal.consent_sdk;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import defpackage.ji3;
import defpackage.ki3;
import defpackage.n60;
import defpackage.o60;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes.dex */
public final class zzbe implements o60 {
    private final Application zzb;
    private final zzae zzc;
    private final zzby zzd;
    private final zzas zze;
    private final zzbs zzf;
    private final zzdr zzg;
    private Dialog zzh;
    private zzbw zzi;
    private final AtomicBoolean zzj = new AtomicBoolean();
    private final AtomicReference zzk = new AtomicReference();
    private final AtomicReference zzl = new AtomicReference();
    private final AtomicReference zzm = new AtomicReference();
    boolean zza = false;

    public zzbe(Application application, zzae zzaeVar, zzby zzbyVar, zzas zzasVar, zzbs zzbsVar, zzdr zzdrVar) {
        this.zzb = application;
        this.zzc = zzaeVar;
        this.zzd = zzbyVar;
        this.zze = zzasVar;
        this.zzf = zzbsVar;
        this.zzg = zzdrVar;
    }

    private final void zzg() {
        Dialog dialog = this.zzh;
        if (dialog != null) {
            dialog.dismiss();
            this.zzh = null;
        }
        this.zzd.zza(null);
        zzbb zzbbVar = (zzbb) this.zzm.getAndSet(null);
        if (zzbbVar != null) {
            zzbbVar.zza.zzb.unregisterActivityLifecycleCallbacks(zzbbVar);
        }
    }

    @Override // defpackage.o60
    public final void show(Activity activity, n60 n60Var) {
        String str;
        zzct.zza();
        if (!this.zzj.compareAndSet(false, true)) {
            if (true != this.zza) {
                str = "ConsentForm#show can only be invoked once.";
            } else {
                str = "Privacy options form is being loading. Please try again later.";
            }
            n60Var.a(new zzi(3, str).zza());
            return;
        }
        zzbb zzbbVar = new zzbb(this, activity);
        this.zzb.registerActivityLifecycleCallbacks(zzbbVar);
        this.zzm.set(zzbbVar);
        this.zzd.zza(activity);
        Dialog dialog = new Dialog(activity, R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(this.zzi);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            n60Var.a(new zzi(3, "Activity with null windows is passed in.").zza());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setFlags(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
        this.zzl.set(n60Var);
        dialog.show();
        this.zzh = dialog;
        this.zzi.zzc("UMP_messagePresented", "");
    }

    public final zzbw zza() {
        return this.zzi;
    }

    public final void zzb(ki3 ki3Var, ji3 ji3Var) {
        zzbw zzb = ((zzbx) this.zzg).zzb();
        this.zzi = zzb;
        zzb.setBackgroundColor(0);
        zzb.getSettings().setJavaScriptEnabled(true);
        zzb.setWebViewClient(new zzbv(zzb, null));
        this.zzk.set(new zzbd(ki3Var, ji3Var, 0 == true ? 1 : 0));
        this.zzi.loadDataWithBaseURL(this.zzf.zza(), this.zzf.zzb(), "text/html", "UTF-8", null);
        zzct.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzba
            @Override // java.lang.Runnable
            public final void run() {
                zzbe.this.zzf(new zzi(4, "Web view timed out."));
            }
        }, 10000L);
    }

    public final void zzc(int i) {
        zzg();
        n60 n60Var = (n60) this.zzl.getAndSet(null);
        if (n60Var == null) {
            return;
        }
        this.zze.zzg(3);
        n60Var.a(null);
    }

    public final void zzd(zzi zziVar) {
        zzg();
        n60 n60Var = (n60) this.zzl.getAndSet(null);
        if (n60Var == null) {
            return;
        }
        n60Var.a(zziVar.zza());
    }

    public final void zze() {
        zzbd zzbdVar = (zzbd) this.zzk.getAndSet(null);
        if (zzbdVar == null) {
            return;
        }
        zzbdVar.onConsentFormLoadSuccess(this);
    }

    public final void zzf(zzi zziVar) {
        zzbd zzbdVar = (zzbd) this.zzk.getAndSet(null);
        if (zzbdVar == null) {
            return;
        }
        zzbdVar.onConsentFormLoadFailure(zziVar.zza());
    }
}
