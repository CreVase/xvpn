package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.common.util.Predicate;
import defpackage.ml1;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzcgq extends FrameLayout implements zzcgb {
    private final zzcgb zza;
    private final zzccr zzb;
    private final AtomicBoolean zzc;

    /* JADX WARN: Multi-variable type inference failed */
    public zzcgq(zzcgb zzcgbVar) {
        super(zzcgbVar.getContext());
        this.zzc = new AtomicBoolean();
        this.zza = zzcgbVar;
        this.zzb = new zzccr(zzcgbVar.zzE(), this, this);
        addView((View) zzcgbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final boolean canGoBack() {
        return this.zza.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void destroy() {
        final zzfkc zzQ = zzQ();
        if (zzQ != null) {
            zzfps zzfpsVar = com.google.android.gms.ads.internal.util.zzt.zza;
            zzfpsVar.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgo
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.ads.internal.zzt.zzA().zzg(zzfkc.this);
                }
            });
            final zzcgb zzcgbVar = this.zza;
            zzcgbVar.getClass();
            zzfpsVar.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgp
                @Override // java.lang.Runnable
                public final void run() {
                    zzcgb.this.destroy();
                }
            }, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzeT)).intValue());
            return;
        }
        this.zza.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void goBack() {
        this.zza.goBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void loadData(String str, String str2, String str3) {
        this.zza.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.zza.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void loadUrl(String str) {
        this.zza.loadUrl(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcgb zzcgbVar = this.zza;
        if (zzcgbVar != null) {
            zzcgbVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void onPause() {
        this.zzb.zzf();
        this.zza.onPause();
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void onResume() {
        this.zza.onResume();
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcgb
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zza.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcgb
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.zza.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.zza.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.zza.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final void zzA(int i) {
        this.zza.zzA(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final void zzB(int i) {
        this.zzb.zzg(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcgb, com.google.android.gms.internal.ads.zzcdc
    public final void zzC(zzcgx zzcgxVar) {
        this.zza.zzC(zzcgxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgb, com.google.android.gms.internal.ads.zzcfs
    public final zzfcr zzD() {
        return this.zza.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final Context zzE() {
        return this.zza.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzcgb, com.google.android.gms.internal.ads.zzchl
    public final View zzF() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final WebView zzG() {
        return (WebView) this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final WebViewClient zzH() {
        return this.zza.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzcgb, com.google.android.gms.internal.ads.zzchj
    public final zzaro zzI() {
        return this.zza.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final zzawj zzJ() {
        return this.zza.zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final zzbfb zzK() {
        return this.zza.zzK();
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final com.google.android.gms.ads.internal.overlay.zzl zzL() {
        return this.zza.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final com.google.android.gms.ads.internal.overlay.zzl zzM() {
        return this.zza.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final zzcho zzN() {
        return ((zzcgu) this.zza).zzaJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcgb, com.google.android.gms.internal.ads.zzchi
    public final zzchq zzO() {
        return this.zza.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzcgb, com.google.android.gms.internal.ads.zzcgy
    public final zzfcv zzP() {
        return this.zza.zzP();
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final zzfkc zzQ() {
        return this.zza.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final ml1 zzR() {
        return this.zza.zzR();
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final String zzS() {
        return this.zza.zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzT(zzfcr zzfcrVar, zzfcv zzfcvVar) {
        this.zza.zzT(zzfcrVar, zzfcvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzU() {
        this.zzb.zze();
        this.zza.zzU();
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzV() {
        this.zza.zzV();
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzW(int i) {
        this.zza.zzW(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzX() {
        this.zza.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzY() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(com.google.android.gms.ads.internal.zzt.zzr().zze()));
        hashMap.put("app_volume", String.valueOf(com.google.android.gms.ads.internal.zzt.zzr().zza()));
        zzcgu zzcguVar = (zzcgu) this.zza;
        hashMap.put("device_volume", String.valueOf(com.google.android.gms.ads.internal.util.zzac.zzb(zzcguVar.getContext())));
        zzcguVar.zzd("volume", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzZ(boolean z) {
        this.zza.zzZ(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbmq
    public final void zza(String str) {
        ((zzcgu) this.zza).zzaO(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final boolean zzaA() {
        return this.zza.zzaA();
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final boolean zzaB() {
        return this.zzc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final boolean zzaC() {
        return this.zza.zzaC();
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzaD(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z) {
        this.zza.zzaD(zzcVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzaE(String str, String str2, int i) {
        this.zza.zzaE(str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzaF(boolean z, int i, boolean z2) {
        this.zza.zzaF(z, i, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzaG(boolean z, int i, String str, String str2, boolean z2) {
        this.zza.zzaG(z, i, str, str2, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzaH(boolean z, int i, String str, boolean z2, boolean z3) {
        this.zza.zzaH(z, i, str, z2, z3);
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzaa() {
        this.zza.zzaa();
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzab(String str, String str2, String str3) {
        this.zza.zzab(str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzac() {
        this.zza.zzac();
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzad(String str, zzbjj zzbjjVar) {
        this.zza.zzad(str, zzbjjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzae() {
        TextView textView = new TextView(getContext());
        com.google.android.gms.ads.internal.zzt.zzp();
        textView.setText(com.google.android.gms.ads.internal.util.zzt.zzx());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzaf(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zza.zzaf(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzag(zzchq zzchqVar) {
        this.zza.zzag(zzchqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzah(zzawj zzawjVar) {
        this.zza.zzah(zzawjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzai(boolean z) {
        this.zza.zzai(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzaj() {
        setBackgroundColor(0);
        this.zza.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzak(Context context) {
        this.zza.zzak(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzal(boolean z) {
        this.zza.zzal(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzam(zzbez zzbezVar) {
        this.zza.zzam(zzbezVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzan(boolean z) {
        this.zza.zzan(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzao(zzbfb zzbfbVar) {
        this.zza.zzao(zzbfbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzap(zzfkc zzfkcVar) {
        this.zza.zzap(zzfkcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzaq(int i) {
        this.zza.zzaq(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzar(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zza.zzar(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzas(boolean z) {
        this.zza.zzas(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzat(boolean z) {
        this.zza.zzat(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzau(String str, zzbjj zzbjjVar) {
        this.zza.zzau(str, zzbjjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzav(String str, Predicate predicate) {
        this.zza.zzav(str, predicate);
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final boolean zzaw() {
        return this.zza.zzaw();
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final boolean zzax() {
        return this.zza.zzax();
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final boolean zzay(boolean z, int i) {
        if (!this.zzc.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzaK)).booleanValue()) {
            return false;
        }
        if (this.zza.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.zza.getParent()).removeView((View) this.zza);
        }
        this.zza.zzay(z, i);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final boolean zzaz() {
        return this.zza.zzaz();
    }

    @Override // com.google.android.gms.internal.ads.zzbmq
    public final void zzb(String str, String str2) {
        this.zza.zzb("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final void zzbK() {
        zzcgb zzcgbVar = this.zza;
        if (zzcgbVar != null) {
            zzcgbVar.zzbK();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final void zzbj() {
        this.zza.zzbj();
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final void zzbk() {
        this.zza.zzbk();
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final String zzbl() {
        return this.zza.zzbl();
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final String zzbm() {
        return this.zza.zzbm();
    }

    @Override // com.google.android.gms.internal.ads.zzauw
    public final void zzbt(zzauv zzauvVar) {
        this.zza.zzbt(zzauvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbmd
    public final void zzd(String str, Map map) {
        this.zza.zzd(str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbmd
    public final void zze(String str, JSONObject jSONObject) {
        this.zza.zze(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final int zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final int zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzdH)).booleanValue()) {
            return this.zza.getMeasuredHeight();
        }
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final int zzh() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzdH)).booleanValue()) {
            return this.zza.getMeasuredWidth();
        }
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcgb, com.google.android.gms.internal.ads.zzchc, com.google.android.gms.internal.ads.zzcdc
    public final Activity zzi() {
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzcgb, com.google.android.gms.internal.ads.zzcdc
    public final com.google.android.gms.ads.internal.zza zzj() {
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final zzbcx zzk() {
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzbmq
    public final void zzl(String str, JSONObject jSONObject) {
        ((zzcgu) this.zza).zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcgb, com.google.android.gms.internal.ads.zzcdc
    public final zzbcy zzm() {
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzcgb, com.google.android.gms.internal.ads.zzchk, com.google.android.gms.internal.ads.zzcdc
    public final zzcaz zzn() {
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final zzccr zzo() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final zzcen zzp(String str) {
        return this.zza.zzp(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcgb, com.google.android.gms.internal.ads.zzcdc
    public final zzcgx zzq() {
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final void zzs() {
        zzcgb zzcgbVar = this.zza;
        if (zzcgbVar != null) {
            zzcgbVar.zzs();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgb, com.google.android.gms.internal.ads.zzcdc
    public final void zzt(String str, zzcen zzcenVar) {
        this.zza.zzt(str, zzcenVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final void zzu() {
        this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final void zzv(boolean z, long j) {
        this.zza.zzv(z, j);
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final void zzw() {
        this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final void zzx(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final void zzy(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final void zzz(boolean z) {
        this.zza.zzz(false);
    }
}
