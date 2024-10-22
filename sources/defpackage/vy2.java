package defpackage;

import android.app.Activity;
import android.util.TypedValue;
import android.view.ViewGroup;
import com.security.xvpn.z35kb.R;

/* loaded from: classes.dex */
public class vy2 {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f4915a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4916b;
    public final qy2 c = new qy2(0);
    public wy2 d;

    public vy2(boolean z, Activity activity) {
        this.f4915a = activity;
        this.f4916b = z;
    }

    public void a() {
        new TypedValue();
        this.f4915a.getTheme();
    }

    public void b(ut0 ut0Var) {
        this.d = ut0Var;
        u93 u93Var = new u93(this.f4916b, this.f4915a);
        ViewGroup f = u93Var.f();
        f.setBackgroundResource(R.color.splash_screen_background);
        f.addOnLayoutChangeListener(new ry2(this, u93Var));
    }
}
