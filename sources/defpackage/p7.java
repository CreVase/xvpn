package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.ads.internal.api.AdComponentViewParentApi;
import com.facebook.ads.internal.api.AdNativeComponentView;

/* loaded from: classes.dex */
public final class p7 implements AdComponentViewParentApi {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdNativeComponentView f3792a;

    public p7(AdNativeComponentView adNativeComponentView) {
        this.f3792a = adNativeComponentView;
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super/*android.widget.RelativeLayout*/.addView(view, i, layoutParams);
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void bringChildToFront(View view) {
        super/*android.widget.RelativeLayout*/.bringChildToFront(view);
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onAttachedToWindow() {
        super/*android.widget.RelativeLayout*/.onAttachedToWindow();
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super/*android.widget.RelativeLayout*/.onDetachedFromWindow();
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onMeasure(int i, int i2) {
        super/*android.widget.RelativeLayout*/.onMeasure(i, i2);
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onVisibilityChanged(View view, int i) {
        super/*android.widget.RelativeLayout*/.onVisibilityChanged(view, i);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public final void onWindowFocusChanged(boolean z) {
        super/*android.widget.RelativeLayout*/.onWindowFocusChanged(z);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super/*android.widget.RelativeLayout*/.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void setMeasuredDimension(int i, int i2) {
        super/*android.widget.RelativeLayout*/.setMeasuredDimension(i, i2);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public final void addView(View view) {
        super/*android.widget.RelativeLayout*/.addView(view);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public final void addView(View view, int i) {
        super/*android.widget.RelativeLayout*/.addView(view, i);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super/*android.widget.RelativeLayout*/.addView(view, layoutParams);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public final void addView(View view, int i, int i2) {
        super/*android.widget.RelativeLayout*/.addView(view, i, i2);
    }
}
