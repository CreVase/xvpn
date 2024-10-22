package defpackage;

import android.view.View;
import android.view.WindowInsets;
import com.security.xvpn.z35kb.widget.FullDragDrawerLayout;

/* loaded from: classes2.dex */
public final class p31 implements View.OnApplyWindowInsetsListener {
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        boolean z;
        FullDragDrawerLayout fullDragDrawerLayout = (FullDragDrawerLayout) view;
        boolean z2 = true;
        if (windowInsets.getSystemWindowInsetTop() > 0) {
            z = true;
        } else {
            z = false;
        }
        fullDragDrawerLayout.w = windowInsets;
        fullDragDrawerLayout.x = z;
        if (z || fullDragDrawerLayout.getBackground() != null) {
            z2 = false;
        }
        fullDragDrawerLayout.setWillNotDraw(z2);
        fullDragDrawerLayout.requestLayout();
        return windowInsets.consumeSystemWindowInsets();
    }
}
