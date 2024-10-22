package defpackage;

import android.view.ViewTreeObserver;
import com.chartboost.sdk.impl.sa;
import com.vungle.ads.internal.ImpressionTracker;

/* loaded from: classes.dex */
public final /* synthetic */ class kw3 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3024a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3025b;

    public /* synthetic */ kw3(Object obj, int i) {
        this.f3024a = i;
        this.f3025b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i = this.f3024a;
        Object obj = this.f3025b;
        switch (i) {
            case 0:
                return sa.f((sa) obj);
            default:
                return ImpressionTracker.a((ImpressionTracker) obj);
        }
    }
}
