package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbry;
import com.google.android.gms.internal.ads.zzbso;
import com.google.android.gms.internal.ads.zzbsu;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzcgb;
import com.google.android.gms.internal.ads.zzeea;
import com.google.android.gms.internal.ads.zzeeb;
import com.google.android.gms.internal.ads.zzfkc;
import com.google.android.gms.internal.ads.zzfps;
import java.util.Collections;

/* loaded from: classes.dex */
public class zzl extends zzbsu implements zzad {
    static final int zza = Color.argb(0, 0, 0, 0);
    protected final Activity zzb;
    AdOverlayInfoParcel zzc;
    zzcgb zzd;
    zzh zze;
    zzr zzf;
    FrameLayout zzh;
    WebChromeClient.CustomViewCallback zzi;
    zzg zzl;
    private Runnable zzp;
    private boolean zzq;
    private boolean zzr;
    private TextView zzv;
    boolean zzg = false;
    boolean zzj = false;
    boolean zzk = false;
    boolean zzm = false;
    int zzn = 1;
    private final Object zzo = new Object();
    private boolean zzs = false;
    private boolean zzt = false;
    private boolean zzu = true;

    public zzl(Activity activity) {
        this.zzb = activity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbci.zzaE)).booleanValue() != false) goto L15;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:            r1 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0045, code lost:            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbci.zzaD)).booleanValue() != false) goto L20;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzJ(android.content.res.Configuration r6) {
        /*
            r5 = this;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r5.zzc
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L10
            com.google.android.gms.ads.internal.zzj r0 = r0.zzo
            if (r0 == 0) goto L10
            boolean r0 = r0.zzb
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            android.app.Activity r3 = r5.zzb
            com.google.android.gms.ads.internal.util.zzab r4 = com.google.android.gms.ads.internal.zzt.zzq()
            boolean r6 = r4.zze(r3, r6)
            boolean r3 = r5.zzk
            if (r3 == 0) goto L33
            if (r0 != 0) goto L33
            com.google.android.gms.internal.ads.zzbca r0 = com.google.android.gms.internal.ads.zzbci.zzaE
            com.google.android.gms.internal.ads.zzbcg r3 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r3.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L48
        L33:
            if (r6 == 0) goto L4a
            com.google.android.gms.internal.ads.zzbca r6 = com.google.android.gms.internal.ads.zzbci.zzaD
            com.google.android.gms.internal.ads.zzbcg r0 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r6 = r0.zzb(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L48
            goto L4a
        L48:
            r1 = 0
            goto L57
        L4a:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r5.zzc
            if (r6 == 0) goto L57
            com.google.android.gms.ads.internal.zzj r6 = r6.zzo
            if (r6 == 0) goto L57
            boolean r6 = r6.zzg
            if (r6 == 0) goto L57
            r2 = 1
        L57:
            android.app.Activity r6 = r5.zzb
            android.view.Window r6 = r6.getWindow()
            com.google.android.gms.internal.ads.zzbca r0 = com.google.android.gms.internal.ads.zzbci.zzbd
            com.google.android.gms.internal.ads.zzbcg r3 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r3.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L83
            android.view.View r6 = r6.getDecorView()
            if (r1 == 0) goto L7d
            if (r2 == 0) goto L7a
            r0 = 5894(0x1706, float:8.259E-42)
            goto L7f
        L7a:
            r0 = 5380(0x1504, float:7.539E-42)
            goto L7f
        L7d:
            r0 = 256(0x100, float:3.59E-43)
        L7f:
            r6.setSystemUiVisibility(r0)
            return
        L83:
            r0 = 1024(0x400, float:1.435E-42)
            r3 = 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L9b
            r6.addFlags(r0)
            r6.clearFlags(r3)
            if (r2 == 0) goto L9a
            android.view.View r6 = r6.getDecorView()
            r0 = 4098(0x1002, float:5.743E-42)
            r6.setSystemUiVisibility(r0)
        L9a:
            return
        L9b:
            r6.addFlags(r3)
            r6.clearFlags(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzl.zzJ(android.content.res.Configuration):void");
    }

    private static final void zzK(zzfkc zzfkcVar, View view) {
        if (zzfkcVar != null && view != null) {
            com.google.android.gms.ads.internal.zzt.zzA().zzh(zzfkcVar, view);
        }
    }

    public final void zzA(int i) {
        if (this.zzb.getApplicationInfo().targetSdkVersion >= ((Integer) zzba.zzc().zzb(zzbci.zzfU)).intValue()) {
            if (this.zzb.getApplicationInfo().targetSdkVersion <= ((Integer) zzba.zzc().zzb(zzbci.zzfV)).intValue()) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= ((Integer) zzba.zzc().zzb(zzbci.zzfW)).intValue()) {
                    if (i2 <= ((Integer) zzba.zzc().zzb(zzbci.zzfX)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.zzb.setRequestedOrientation(i);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zzB(boolean z) {
        if (z) {
            this.zzl.setBackgroundColor(0);
        } else {
            this.zzl.setBackgroundColor(-16777216);
        }
    }

    public final void zzC(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.zzb);
        this.zzh = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.zzh.addView(view, -1, -1);
        this.zzb.setContentView(this.zzh);
        this.zzr = true;
        this.zzi = customViewCallback;
        this.zzg = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzD(boolean r27) throws com.google.android.gms.ads.internal.overlay.zzf {
        /*
            Method dump skipped, instructions count: 663
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzl.zzD(boolean):void");
    }

    public final void zzE() {
        synchronized (this.zzo) {
            this.zzq = true;
            Runnable runnable = this.zzp;
            if (runnable != null) {
                zzfps zzfpsVar = com.google.android.gms.ads.internal.util.zzt.zza;
                zzfpsVar.removeCallbacks(runnable);
                zzfpsVar.post(this.zzp);
            }
        }
    }

    public final void zzF() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzo zzoVar;
        if (this.zzb.isFinishing() && !this.zzs) {
            this.zzs = true;
            zzcgb zzcgbVar = this.zzd;
            if (zzcgbVar != null) {
                zzcgbVar.zzW(this.zzn - 1);
                synchronized (this.zzo) {
                    if (!this.zzq && this.zzd.zzax()) {
                        if (((Boolean) zzba.zzc().zzb(zzbci.zzeG)).booleanValue() && !this.zzt && (adOverlayInfoParcel = this.zzc) != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
                            zzoVar.zzbu();
                        }
                        Runnable runnable = new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzd
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzl.this.zzc();
                            }
                        };
                        this.zzp = runnable;
                        com.google.android.gms.ads.internal.util.zzt.zza.postDelayed(runnable, ((Long) zzba.zzc().zzb(zzbci.zzaW)).longValue());
                        return;
                    }
                }
            }
            zzc();
        }
    }

    public final void zzG(String str) {
        TextView textView = this.zzv;
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final boolean zzH() {
        this.zzn = 1;
        if (this.zzd == null) {
            return true;
        }
        if (((Boolean) zzba.zzc().zzb(zzbci.zziF)).booleanValue() && this.zzd.canGoBack()) {
            this.zzd.goBack();
            return false;
        }
        boolean zzaC = this.zzd.zzaC();
        if (!zzaC) {
            this.zzd.zzd("onbackblocked", Collections.emptyMap());
        }
        return zzaC;
    }

    public final void zzb() {
        this.zzn = 3;
        this.zzb.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && adOverlayInfoParcel.zzk == 5) {
            this.zzb.overridePendingTransition(0, 0);
        }
    }

    public final void zzc() {
        zzcgb zzcgbVar;
        zzo zzoVar;
        if (this.zzt) {
            return;
        }
        this.zzt = true;
        zzcgb zzcgbVar2 = this.zzd;
        if (zzcgbVar2 != null) {
            this.zzl.removeView(zzcgbVar2.zzF());
            zzh zzhVar = this.zze;
            if (zzhVar != null) {
                this.zzd.zzak(zzhVar.zzd);
                this.zzd.zzan(false);
                ViewGroup viewGroup = this.zze.zzc;
                View zzF = this.zzd.zzF();
                zzh zzhVar2 = this.zze;
                viewGroup.addView(zzF, zzhVar2.zza, zzhVar2.zzb);
                this.zze = null;
            } else if (this.zzb.getApplicationContext() != null) {
                this.zzd.zzak(this.zzb.getApplicationContext());
            }
            this.zzd = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzby(this.zzn);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
        if (adOverlayInfoParcel2 != null && (zzcgbVar = adOverlayInfoParcel2.zzd) != null) {
            zzK(zzcgbVar.zzQ(), this.zzc.zzd.zzF());
        }
    }

    public final void zzd() {
        this.zzl.zzb = true;
    }

    public final void zze() {
        this.zzd.zzX();
    }

    public final void zzf(zzeeb zzeebVar) throws zzf, RemoteException {
        zzbso zzbsoVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzbsoVar = adOverlayInfoParcel.zzv) != null) {
            zzbsoVar.zzg(ObjectWrapper.wrap(zzeebVar));
            return;
        }
        throw new zzf("noioou");
    }

    public final void zzg() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && this.zzg) {
            zzA(adOverlayInfoParcel.zzj);
        }
        if (this.zzh != null) {
            this.zzb.setContentView(this.zzl);
            this.zzr = true;
            this.zzh.removeAllViews();
            this.zzh = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.zzi;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.zzi = null;
        }
        this.zzg = false;
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzh(int i, int i2, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzi() {
        this.zzn = 1;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzad
    public final void zzj() {
        this.zzn = 2;
        this.zzb.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzk(IObjectWrapper iObjectWrapper) {
        zzJ((Configuration) ObjectWrapper.unwrap(iObjectWrapper));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0092 A[Catch: zzf -> 0x0116, TryCatch #0 {zzf -> 0x0116, blocks: (B:11:0x001b, B:13:0x0029, B:15:0x002d, B:17:0x0033, B:18:0x0039, B:19:0x0044, B:21:0x004f, B:22:0x0051, B:24:0x0059, B:25:0x0067, B:27:0x006e, B:30:0x007b, B:32:0x007f, B:34:0x0084, B:36:0x0092, B:38:0x0096, B:40:0x009c, B:41:0x009f, B:43:0x00a5, B:44:0x00a8, B:46:0x00ae, B:48:0x00b2, B:49:0x00b5, B:51:0x00bb, B:52:0x00be, B:59:0x00ed, B:62:0x00f1, B:63:0x00f8, B:64:0x00f9, B:66:0x00fd, B:68:0x010a, B:70:0x0075, B:72:0x0079, B:73:0x008e, B:74:0x010e, B:75:0x0115), top: B:10:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010a A[Catch: zzf -> 0x0116, TryCatch #0 {zzf -> 0x0116, blocks: (B:11:0x001b, B:13:0x0029, B:15:0x002d, B:17:0x0033, B:18:0x0039, B:19:0x0044, B:21:0x004f, B:22:0x0051, B:24:0x0059, B:25:0x0067, B:27:0x006e, B:30:0x007b, B:32:0x007f, B:34:0x0084, B:36:0x0092, B:38:0x0096, B:40:0x009c, B:41:0x009f, B:43:0x00a5, B:44:0x00a8, B:46:0x00ae, B:48:0x00b2, B:49:0x00b5, B:51:0x00bb, B:52:0x00be, B:59:0x00ed, B:62:0x00f1, B:63:0x00f8, B:64:0x00f9, B:66:0x00fd, B:68:0x010a, B:70:0x0075, B:72:0x0079, B:73:0x008e, B:74:0x010e, B:75:0x0115), top: B:10:0x001b }] */
    @Override // com.google.android.gms.internal.ads.zzbsv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void zzl(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzl.zzl(android.os.Bundle):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzm() {
        zzcgb zzcgbVar = this.zzd;
        if (zzcgbVar != null) {
            try {
                this.zzl.removeView(zzcgbVar.zzF());
            } catch (NullPointerException unused) {
            }
        }
        zzF();
    }

    public final void zzn() {
        if (this.zzm) {
            this.zzm = false;
            zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzo() {
        zzo zzoVar;
        zzg();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzbo();
        }
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzeI)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzp(int i, String[] strArr, int[] iArr) {
        zzl zzlVar;
        if (i == 12345) {
            Activity activity = this.zzb;
            zzeea zze = zzeeb.zze();
            zze.zza(activity);
            if (this.zzc.zzk == 5) {
                zzlVar = this;
            } else {
                zzlVar = null;
            }
            zze.zzb(zzlVar);
            try {
                this.zzc.zzv.zzf(strArr, iArr, ObjectWrapper.wrap(zze.zze()));
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzr() {
        zzo zzoVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzbL();
        }
        zzJ(this.zzb.getResources().getConfiguration());
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzeI)).booleanValue()) {
            zzcgb zzcgbVar = this.zzd;
            if (zzcgbVar != null && !zzcgbVar.zzaz()) {
                this.zzd.onResume();
            } else {
                zzcat.zzj("The webview does not exist. Ignoring action.");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzs(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzt() {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzeI)).booleanValue()) {
            zzcgb zzcgbVar = this.zzd;
            if (zzcgbVar != null && !zzcgbVar.zzaz()) {
                this.zzd.onResume();
            } else {
                zzcat.zzj("The webview does not exist. Ignoring action.");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzu() {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzeI)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzv() {
        zzo zzoVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzbx();
        }
    }

    public final void zzw(boolean z) {
        boolean z2;
        int i;
        int intValue = ((Integer) zzba.zzc().zzb(zzbci.zzeL)).intValue();
        int i2 = 0;
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzaZ)).booleanValue() && !z) {
            z2 = false;
        } else {
            z2 = true;
        }
        zzq zzqVar = new zzq();
        zzqVar.zzd = 50;
        if (true != z2) {
            i = 0;
        } else {
            i = intValue;
        }
        zzqVar.zza = i;
        if (true != z2) {
            i2 = intValue;
        }
        zzqVar.zzb = i2;
        zzqVar.zzc = intValue;
        this.zzf = new zzr(this.zzb, zzqVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        int i3 = 11;
        if (this.zzc.zzw && this.zzd != null) {
            layoutParams.addRule(11);
            layoutParams.addRule(2, this.zzd.zzF().getId());
        } else {
            if (true != z2) {
                i3 = 9;
            }
            layoutParams.addRule(i3);
        }
        zzy(z, this.zzc.zzg);
        this.zzl.addView(this.zzf, layoutParams);
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzx() {
        this.zzr = true;
    }

    public final void zzy(boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzj zzjVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzj zzjVar2;
        boolean z5 = true;
        if (((Boolean) zzba.zzc().zzb(zzbci.zzaX)).booleanValue() && (adOverlayInfoParcel2 = this.zzc) != null && (zzjVar2 = adOverlayInfoParcel2.zzo) != null && zzjVar2.zzh) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (((Boolean) zzba.zzc().zzb(zzbci.zzaY)).booleanValue() && (adOverlayInfoParcel = this.zzc) != null && (zzjVar = adOverlayInfoParcel.zzo) != null && zzjVar.zzi) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z && z2 && z3 && !z4) {
            new zzbry(this.zzd, "useCustomClose").zzg("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzr zzrVar = this.zzf;
        if (zzrVar != null) {
            if (!z4 && (!z2 || z3)) {
                z5 = false;
            }
            zzrVar.zzb(z5);
        }
    }

    public final void zzz() {
        this.zzl.removeView(this.zzf);
        zzw(true);
    }
}
