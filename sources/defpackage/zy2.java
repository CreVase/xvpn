package defpackage;

import android.app.Activity;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.window.SplashScreenView;

/* loaded from: classes.dex */
public final class zy2 extends az2 {
    public SplashScreenView c;

    @Override // defpackage.az2
    public final void a() {
    }

    @Override // defpackage.az2
    public final View b() {
        View iconView;
        View iconView2;
        SplashScreenView splashScreenView = this.c;
        SplashScreenView splashScreenView2 = null;
        if (splashScreenView == null) {
            splashScreenView = null;
        }
        iconView = splashScreenView.getIconView();
        if (iconView != null) {
            SplashScreenView splashScreenView3 = this.c;
            if (splashScreenView3 != null) {
                splashScreenView2 = splashScreenView3;
            }
            iconView2 = splashScreenView2.getIconView();
            return iconView2;
        }
        ImageView imageView = new ImageView(this.f367a);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return imageView;
    }

    @Override // defpackage.az2
    public final ViewGroup c() {
        SplashScreenView splashScreenView = this.c;
        if (splashScreenView == null) {
            splashScreenView = null;
        }
        return splashScreenView;
    }

    @Override // defpackage.az2
    public final void d() {
        SplashScreenView splashScreenView = this.c;
        if (splashScreenView == null) {
            splashScreenView = null;
        }
        splashScreenView.remove();
        Activity activity = this.f367a;
        g83.b(activity.getTheme(), activity.getWindow().getDecorView(), new TypedValue());
    }
}
