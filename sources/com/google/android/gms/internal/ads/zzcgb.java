package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.common.util.Predicate;
import defpackage.ml1;

/* loaded from: classes.dex */
public interface zzcgb extends com.google.android.gms.ads.internal.client.zza, zzdfd, zzcfs, zzbmd, zzcgy, zzchc, zzbmq, zzauw, zzchg, com.google.android.gms.ads.internal.zzl, zzchj, zzchk, zzcdc, zzchl {
    boolean canGoBack();

    void destroy();

    @Override // com.google.android.gms.internal.ads.zzchc, com.google.android.gms.internal.ads.zzcdc
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i, int i2);

    void onPause();

    void onResume();

    @Override // com.google.android.gms.internal.ads.zzcdc
    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    @Override // com.google.android.gms.internal.ads.zzcdc
    void zzC(zzcgx zzcgxVar);

    @Override // com.google.android.gms.internal.ads.zzcfs
    zzfcr zzD();

    Context zzE();

    @Override // com.google.android.gms.internal.ads.zzchl
    View zzF();

    WebView zzG();

    WebViewClient zzH();

    @Override // com.google.android.gms.internal.ads.zzchj
    zzaro zzI();

    zzawj zzJ();

    zzbfb zzK();

    com.google.android.gms.ads.internal.overlay.zzl zzL();

    com.google.android.gms.ads.internal.overlay.zzl zzM();

    zzcho zzN();

    @Override // com.google.android.gms.internal.ads.zzchi
    zzchq zzO();

    @Override // com.google.android.gms.internal.ads.zzcgy
    zzfcv zzP();

    zzfkc zzQ();

    ml1 zzR();

    String zzS();

    void zzT(zzfcr zzfcrVar, zzfcv zzfcvVar);

    void zzU();

    void zzV();

    void zzW(int i);

    void zzX();

    void zzY();

    void zzZ(boolean z);

    boolean zzaA();

    boolean zzaB();

    boolean zzaC();

    void zzaa();

    void zzab(String str, String str2, String str3);

    void zzac();

    void zzad(String str, zzbjj zzbjjVar);

    void zzae();

    void zzaf(com.google.android.gms.ads.internal.overlay.zzl zzlVar);

    void zzag(zzchq zzchqVar);

    void zzah(zzawj zzawjVar);

    void zzai(boolean z);

    void zzaj();

    void zzak(Context context);

    void zzal(boolean z);

    void zzam(zzbez zzbezVar);

    void zzan(boolean z);

    void zzao(zzbfb zzbfbVar);

    void zzap(zzfkc zzfkcVar);

    void zzaq(int i);

    void zzar(com.google.android.gms.ads.internal.overlay.zzl zzlVar);

    void zzas(boolean z);

    void zzat(boolean z);

    void zzau(String str, zzbjj zzbjjVar);

    void zzav(String str, Predicate predicate);

    boolean zzaw();

    boolean zzax();

    boolean zzay(boolean z, int i);

    boolean zzaz();

    @Override // com.google.android.gms.internal.ads.zzchc, com.google.android.gms.internal.ads.zzcdc
    Activity zzi();

    @Override // com.google.android.gms.internal.ads.zzcdc
    com.google.android.gms.ads.internal.zza zzj();

    @Override // com.google.android.gms.internal.ads.zzcdc
    zzbcy zzm();

    @Override // com.google.android.gms.internal.ads.zzchk, com.google.android.gms.internal.ads.zzcdc
    zzcaz zzn();

    @Override // com.google.android.gms.internal.ads.zzcdc
    zzcgx zzq();

    @Override // com.google.android.gms.internal.ads.zzcdc
    void zzt(String str, zzcen zzcenVar);
}
