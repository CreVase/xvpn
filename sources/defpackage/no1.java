package defpackage;

import android.app.Activity;
import android.media.MediaCodecInfo;
import android.os.Trace;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.webkit.WebView;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class no1 {
    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint d(int i, int i2, int i3) {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, i3);
    }

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint e(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static /* synthetic */ WindowInsets.Builder f() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ void j() {
    }

    public static /* bridge */ /* synthetic */ void k(Activity activity, hj2 hj2Var) {
        activity.registerActivityLifecycleCallbacks(hj2Var);
    }

    public static /* bridge */ /* synthetic */ void s(ViewGroup viewGroup, boolean z) {
        viewGroup.suppressLayout(z);
    }

    public static /* bridge */ /* synthetic */ void t(WebView webView) {
        webView.setWebViewRenderProcessClient(null);
    }

    public static /* bridge */ /* synthetic */ boolean w() {
        return Trace.isEnabled();
    }
}
