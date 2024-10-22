package adSupport;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import defpackage.o7;
import java.io.File;

/* loaded from: classes.dex */
public class AdInterstitialActivity extends Activity {
    public static final /* synthetic */ int h = 0;

    /* renamed from: a, reason: collision with root package name */
    public FrameLayout f63a;

    /* renamed from: b, reason: collision with root package name */
    public WebView f64b;
    public String c;
    public String d;
    public String e;
    public AdInterstitialActivity f;
    public boolean g = false;

    @Override // android.app.Activity
    public final void onBackPressed() {
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f = this;
        this.c = getIntent().getStringExtra(ImagesContract.URL);
        this.d = getIntent().getStringExtra(FacebookMediationAdapter.KEY_ID);
        this.e = getIntent().getStringExtra("link");
        getIntent().getStringExtra("showCount");
        if (!TextUtils.isEmpty(this.c) && !TextUtils.isEmpty(this.d) && !TextUtils.isEmpty(this.e)) {
            this.f63a = new FrameLayout(this.f);
            WebView webView = new WebView(this.f);
            this.f64b = webView;
            this.f63a.addView(webView);
            getWindow().setFlags(UserVerificationMethods.USER_VERIFY_ALL, UserVerificationMethods.USER_VERIFY_ALL);
            setContentView(this.f63a);
            getWindow().getDecorView().setSystemUiVisibility(4871);
            WebSettings settings = this.f64b.getSettings();
            settings.setSupportZoom(false);
            settings.setDisplayZoomControls(false);
            settings.setBuiltInZoomControls(false);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            settings.setJavaScriptEnabled(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(false);
            settings.setCacheMode(2);
            settings.setAllowFileAccess(true);
            settings.setDomStorageEnabled(false);
            this.f64b.setWebChromeClient(new WebChromeClient());
            this.f64b.setWebViewClient(new o7(this));
            this.f64b.setLongClickable(false);
            this.f64b.addJavascriptInterface(new Object() { // from class: adSupport.AdInterstitialActivity.2
                @JavascriptInterface
                @Keep
                public void onClickClose() {
                    AdInterstitialActivity.this.finish();
                }
            }, "MobileApp");
            this.f64b.loadUrl(Uri.fromFile(new File(this.c)).toString());
            return;
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        WebView webView = this.f64b;
        if (webView != null) {
            webView.stopLoading();
            this.f64b.loadUrl("about:blank");
            this.f64b.pauseTimers();
            this.f64b.onPause();
            this.f63a.removeView(this.f64b);
            this.f64b.clearHistory();
            this.f64b.clearCache(true);
            this.f64b.clearView();
            this.f64b.freeMemory();
            this.f64b.destroy();
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        WebView webView = this.f64b;
        if (webView != null) {
            webView.pauseTimers();
            this.f64b.onPause();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.g) {
            finish();
            return;
        }
        WebView webView = this.f64b;
        if (webView != null) {
            webView.onResume();
            this.f64b.resumeTimers();
        }
    }
}
