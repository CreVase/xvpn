package com.chartboost.sdk.impl;

import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.chartboost.sdk.impl.va;
import defpackage.i23;
import defpackage.ng0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h2 extends WebChromeClient implements va.a, x4 {
    public static final a f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final View f849a;

    /* renamed from: b, reason: collision with root package name */
    public final j6 f850b;
    public final va c;
    public boolean d;
    public WebChromeClient.CustomViewCallback e;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(ng0 ng0Var) {
            this();
        }

        public a() {
        }
    }

    public h2(View view, j6 j6Var, va vaVar) {
        this.f849a = view;
        this.f850b = j6Var;
        this.c = vaVar;
        j6Var.a(this);
    }

    public final void a(String str) {
        va vaVar = this.c;
        if (vaVar != null) {
            vaVar.a(str, this);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        consoleMessage.lineNumber();
        consoleMessage.sourceId();
        a(message);
        return true;
    }

    @Override // android.webkit.WebChromeClient, com.chartboost.sdk.impl.x4
    public void onHideCustomView() {
        boolean z;
        WebChromeClient.CustomViewCallback customViewCallback;
        if (this.d) {
            this.f849a.setVisibility(0);
            WebChromeClient.CustomViewCallback customViewCallback2 = this.e;
            if (customViewCallback2 != null && !i23.R0(customViewCallback2.getClass().getName(), ".chromium.", false)) {
                z = true;
            } else {
                z = false;
            }
            if (z && (customViewCallback = this.e) != null) {
                customViewCallback.onCustomViewHidden();
            }
            this.d = false;
            this.e = null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        try {
            JSONObject jSONObject = new JSONObject(str2);
            String string = jSONObject.getString("eventType");
            String a2 = this.f850b.a(jSONObject.getJSONObject("eventArgs"), string);
            if (jsPromptResult != null) {
                jsPromptResult.confirm(a2);
            }
            return true;
        } catch (JSONException unused) {
            f6.b("CBWebChromeClient", "Exception caught parsing the function name from js to native");
            return true;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        if (view instanceof FrameLayout) {
            this.d = true;
            this.e = customViewCallback;
            this.f849a.setVisibility(4);
        }
    }

    @Override // com.chartboost.sdk.impl.va.a
    public void a(JSONObject jSONObject) {
        this.f850b.a(jSONObject, k6.ERROR.c());
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, customViewCallback);
    }
}
