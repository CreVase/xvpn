package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.ads.internal.api.AdComponentFrameLayout;
import com.facebook.ads.internal.api.AdComponentViewParentApi;

/* loaded from: classes.dex */
public final class n7 implements AdComponentViewParentApi {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdComponentFrameLayout f3405a;

    public n7(AdComponentFrameLayout adComponentFrameLayout) {
        this.f3405a = adComponentFrameLayout;
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super/*android.widget.FrameLayout*/.addView(view, i, layoutParams);
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void bringChildToFront(View view) {
        super/*android.widget.FrameLayout*/.bringChildToFront(view);
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onAttachedToWindow() {
        super/*android.widget.FrameLayout*/.onAttachedToWindow();
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super/*android.widget.FrameLayout*/.onDetachedFromWindow();
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onMeasure(int i, int i2) {
        super/*android.widget.FrameLayout*/.onMeasure(i, i2);
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onVisibilityChanged(View view, int i) {
        super/*android.widget.FrameLayout*/.onVisibilityChanged(view, i);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public final void onWindowFocusChanged(boolean z) {
        super/*android.widget.FrameLayout*/.onWindowFocusChanged(z);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super/*android.widget.FrameLayout*/.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void setMeasuredDimension(int i, int i2) {
        super/*android.widget.FrameLayout*/.setMeasuredDimension(i, i2);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public final void addView(View view) {
        super/*android.widget.FrameLayout*/.addView(view);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public final void addView(View view, int i) {
        super/*android.widget.FrameLayout*/.addView(view, i);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super/*android.widget.FrameLayout*/.addView(view, layoutParams);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public final void addView(View view, int i, int i2) {
        super/*android.widget.FrameLayout*/.addView(view, i, i2);
    }
}
