package defpackage;

import android.app.Activity;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.window.SplashScreen;
import android.window.SplashScreenView;

/* loaded from: classes.dex */
public final class uy2 extends vy2 {
    public final ty2 e;

    public uy2(Activity activity) {
        super(false, activity);
        this.e = new ty2(this, activity);
    }

    @Override // defpackage.vy2
    public final void a() {
        Activity activity = this.f4915a;
        activity.getTheme();
        new TypedValue();
        ((ViewGroup) activity.getWindow().getDecorView()).setOnHierarchyChangeListener(this.e);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [sy2] */
    @Override // defpackage.vy2
    public final void b(final ut0 ut0Var) {
        SplashScreen splashScreen;
        splashScreen = this.f4915a.getSplashScreen();
        splashScreen.setOnExitAnimationListener(new SplashScreen.OnExitAnimationListener() { // from class: sy2
            @Override // android.window.SplashScreen.OnExitAnimationListener
            public final void onSplashScreenExit(SplashScreenView splashScreenView) {
                uy2 uy2Var = uy2.this;
                wy2 wy2Var = ut0Var;
                u93 u93Var = new u93(false, uy2Var.f4915a);
                ((zy2) ((az2) u93Var.f4640b)).c = splashScreenView;
                ((ut0) wy2Var).g(u93Var);
            }
        });
    }
}
