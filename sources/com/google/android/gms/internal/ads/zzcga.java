package com.google.android.gms.internal.ads;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.hx2;
import defpackage.p71;

/* loaded from: classes.dex */
public final class zzcga extends WebChromeClient {
    private final zzcgb zza;

    public zzcga(zzcgb zzcgbVar) {
        this.zza = zzcgbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Context zzb(WebView webView) {
        if (!(webView instanceof zzcgb)) {
            return webView.getContext();
        }
        zzcgb zzcgbVar = (zzcgb) webView;
        Activity zzi = zzcgbVar.zzi();
        if (zzi != null) {
            return zzi;
        }
        return zzcgbVar.getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof zzcgb)) {
            zzcat.zzj("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzl zzL = ((zzcgb) webView).zzL();
        if (zzL == null) {
            zzcat.zzj("Tried to close an AdWebView not associated with an overlay.");
        } else {
            zzL.zzb();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        String r = hx2.r(p71.q("JS: ", message, " (", sourceId, ":"), consoleMessage.lineNumber(), ")");
        if (r.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = zzcfz.zza[consoleMessage.messageLevel().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    if (i != 5) {
                        zzcat.zzi(r);
                    } else {
                        zzcat.zze(r);
                    }
                } else {
                    zzcat.zzi(r);
                }
            } else {
                zzcat.zzj(r);
            }
        } else {
            zzcat.zzg(r);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.zza.zzH() != null) {
            webView2.setWebViewClient(this.zza.zzH());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j == 0) {
            if (j2 > j4 || j2 > 1048576) {
                j2 = 0;
            }
        } else if (j2 == 0) {
            j2 = Math.min(Math.min(131072L, j4) + j, 1048576L);
        } else {
            if (j2 <= Math.min(1048576 - j, j4)) {
                j += j2;
            }
            j2 = j;
        }
        quotaUpdater.updateQuota(j2);
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z;
        if (callback != null) {
            zzcgb zzcgbVar = this.zza;
            com.google.android.gms.ads.internal.zzt.zzp();
            if (!com.google.android.gms.ads.internal.util.zzt.zzz(zzcgbVar.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                zzcgb zzcgbVar2 = this.zza;
                com.google.android.gms.ads.internal.zzt.zzp();
                if (!com.google.android.gms.ads.internal.util.zzt.zzz(zzcgbVar2.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z = false;
                    callback.invoke(str, z, true);
                }
            }
            z = true;
            callback.invoke(str, z, true);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        com.google.android.gms.ads.internal.overlay.zzl zzL = this.zza.zzL();
        if (zzL == null) {
            zzcat.zzj("Could not get ad overlay when hiding custom view.");
        } else {
            zzL.zzg();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return zza(zzb(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        com.google.android.gms.ads.internal.overlay.zzl zzL = this.zza.zzL();
        if (zzL == null) {
            zzcat.zzj("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
        } else {
            zzL.zzC(view, customViewCallback);
            zzL.zzA(i);
        }
    }

    public final boolean zza(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        zzcgb zzcgbVar;
        com.google.android.gms.ads.internal.zzb zzd;
        try {
            zzcgbVar = this.zza;
        } catch (WindowManager.BadTokenException e) {
            zzcat.zzk("Fail to display Dialog.", e);
        }
        if (zzcgbVar != null && zzcgbVar.zzN() != null && this.zza.zzN().zzd() != null && (zzd = this.zza.zzN().zzd()) != null && !zzd.zzc()) {
            zzd.zzb("window." + str + "('" + str3 + "')");
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        AlertDialog.Builder zzJ = com.google.android.gms.ads.internal.util.zzt.zzJ(context);
        zzJ.setTitle(str2);
        if (z) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            zzJ.setView(linearLayout).setPositiveButton(R.string.ok, new zzcfy(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new zzcfx(jsPromptResult)).setOnCancelListener(new zzcfw(jsPromptResult)).create().show();
        } else {
            zzJ.setMessage(str3).setPositiveButton(R.string.ok, new zzcfv(jsResult)).setNegativeButton(R.string.cancel, new zzcfu(jsResult)).setOnCancelListener(new zzcft(jsResult)).create().show();
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
