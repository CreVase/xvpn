package defpackage;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.security.xvpn.z35kb.WebViewActivity;

/* loaded from: classes2.dex */
public final class xo3 extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebViewActivity f5197a;

    public xo3(WebViewActivity webViewActivity) {
        this.f5197a = webViewActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        this.f5197a.o.setProgress(i);
    }
}
