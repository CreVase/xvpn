package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import com.chartboost.sdk.ads.Ad;
import com.chartboost.sdk.ads.Banner;
import com.chartboost.sdk.ads.Interstitial;
import com.chartboost.sdk.ads.Rewarded;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class ym implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5358a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5359b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ym(int i, Object obj, boolean z) {
        this.f5358a = i;
        this.c = obj;
        this.f5359b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        br3 br3Var;
        int i = this.f5358a;
        final boolean z = this.f5359b;
        Object obj = this.c;
        switch (i) {
            case 0:
                Banner.postSessionNotStartedInMainThread$lambda$0(z, (Banner) obj);
                return;
            case 1:
                Interstitial.postSessionNotStartedInMainThread$lambda$0(z, (Interstitial) obj);
                return;
            case 2:
                Rewarded.a(z, (Rewarded) obj);
                return;
            case 3:
                yt0 yt0Var = (yt0) ((x50) obj).c;
                int i2 = wi3.f5017a;
                bu0 bu0Var = yt0Var.f5387a;
                if (bu0Var.V != z) {
                    bu0Var.V = z;
                    bu0Var.k.l(23, new rl1() { // from class: xt0
                        @Override // defpackage.rl1
                        public final void invoke(Object obj2) {
                            ((v52) obj2).onSkipSilenceEnabledChanged(z);
                        }
                    });
                    return;
                }
                return;
            default:
                View view = (View) obj;
                if (z) {
                    WeakHashMap weakHashMap = ll3.f3151a;
                    if (Build.VERSION.SDK_INT >= 30) {
                        br3Var = gl3.c(view);
                    } else {
                        Context context = view.getContext();
                        while (true) {
                            if (context instanceof ContextWrapper) {
                                if (context instanceof Activity) {
                                    Window window = ((Activity) context).getWindow();
                                    if (window != null) {
                                        br3Var = new br3(window, view);
                                    }
                                } else {
                                    context = ((ContextWrapper) context).getBaseContext();
                                }
                            }
                        }
                        br3Var = null;
                    }
                    if (br3Var != null) {
                        br3Var.f518a.r(8);
                        return;
                    }
                }
                ((InputMethodManager) x80.getSystemService(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                return;
        }
    }

    public /* synthetic */ ym(boolean z, Ad ad, int i) {
        this.f5358a = i;
        this.f5359b = z;
        this.c = ad;
    }
}
