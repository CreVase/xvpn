package defpackage;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class wu3 extends v7 {
    public WebView d;
    public Long e = null;
    public final Map f;
    public final String g;

    public wu3(Map map, String str) {
        this.f = map;
        this.g = str;
    }

    @Override // defpackage.v7
    public final void a(mu3 mu3Var, o40 o40Var) {
        JSONObject jSONObject = new JSONObject();
        Map unmodifiableMap = Collections.unmodifiableMap((Map) o40Var.d);
        Iterator it = unmodifiableMap.keySet().iterator();
        if (!it.hasNext()) {
            b(mu3Var, o40Var, jSONObject);
        } else {
            p71.C(unmodifiableMap.get((String) it.next()));
            throw null;
        }
    }

    @Override // defpackage.v7
    public final void d() {
        long convert;
        super.d();
        if (this.e == null) {
            convert = 4000;
        } else {
            convert = TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.e.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new y4(this), Math.max(4000 - convert, 2000L));
        this.d = null;
    }

    @Override // defpackage.v7
    public final void f() {
        WebView webView = new WebView(s4.f4267b.f4268a);
        this.d = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.d.getSettings().setAllowContentAccess(false);
        this.f4787a = new ru3(this.d);
        WebView webView2 = this.d;
        if (webView2 != null) {
            String str = this.g;
            if (!TextUtils.isEmpty(str)) {
                try {
                    webView2.evaluateJavascript(str, null);
                } catch (IllegalStateException unused) {
                    webView2.loadUrl("javascript: " + str);
                }
            }
        }
        Map map = this.f;
        Iterator it = map.keySet().iterator();
        if (!it.hasNext()) {
            this.e = Long.valueOf(System.nanoTime());
        } else {
            p71.C(map.get((String) it.next()));
            throw null;
        }
    }
}
