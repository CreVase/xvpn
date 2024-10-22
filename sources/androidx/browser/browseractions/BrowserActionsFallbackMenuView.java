package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.oe2;

@Deprecated
/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final int f181a;

    /* renamed from: b, reason: collision with root package name */
    public final int f182b;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f181a = getResources().getDimensionPixelOffset(oe2.browser_actions_context_menu_min_padding);
        this.f182b = getResources().getDimensionPixelOffset(oe2.browser_actions_context_menu_max_width);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f181a * 2), this.f182b), 1073741824), i2);
    }
}
