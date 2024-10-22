package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class cr extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1657a;

    /* renamed from: b, reason: collision with root package name */
    public final yo3 f1658b;
    public View c;

    public cr(Context context, yo3 yo3Var) {
        this.f1657a = context;
        this.f1658b = yo3Var;
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
        if (defaultVideoPoster == null) {
            return BitmapFactory.decodeResource(this.f1657a.getResources(), R.mipmap.ic_launcher_round);
        }
        return defaultVideoPoster;
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        super.onHideCustomView();
        yo3 yo3Var = this.f1658b;
        if (yo3Var != null) {
            yo3Var.f();
        }
        this.c = null;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        yo3 yo3Var = this.f1658b;
        if (yo3Var != null) {
            yo3Var.d(i);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        super.onReceivedIcon(webView, bitmap);
        yo3 yo3Var = this.f1658b;
        if (yo3Var != null) {
            yo3Var.b(bitmap);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        yo3 yo3Var = this.f1658b;
        if (yo3Var != null) {
            yo3Var.E();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
        if (this.c != null) {
            customViewCallback.onCustomViewHidden();
            return;
        }
        this.c = view;
        yo3 yo3Var = this.f1658b;
        if (yo3Var != null) {
            yo3Var.goFullScreen(view);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        yo3 yo3Var = this.f1658b;
        if (yo3Var != null) {
            yo3Var.z();
            return true;
        }
        return true;
    }
}
