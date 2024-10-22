package defpackage;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* loaded from: classes.dex */
public class az2 {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f367a;

    /* renamed from: b, reason: collision with root package name */
    public final k43 f368b = new k43(new yy2(this, 0));

    public az2(Activity activity) {
        this.f367a = activity;
    }

    public void a() {
        ViewGroup viewGroup = (ViewGroup) this.f367a.findViewById(R.id.content);
        ViewGroup viewGroup2 = null;
        if (viewGroup != null) {
            viewGroup.setLayoutAnimation(null);
        }
        if (viewGroup != null) {
            viewGroup.setStateListAnimator(null);
        }
        View rootView = viewGroup.getRootView();
        if (rootView instanceof ViewGroup) {
            viewGroup2 = (ViewGroup) rootView;
        }
        if (viewGroup2 != null) {
            viewGroup2.addView((ViewGroup) this.f368b.getValue());
        }
    }

    public View b() {
        return c().findViewById(com.security.xvpn.z35kb.R.id.splashscreen_icon_view);
    }

    public ViewGroup c() {
        return (ViewGroup) this.f368b.getValue();
    }

    public void d() {
        ViewGroup viewGroup;
        ViewParent parent = c().getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            viewGroup.removeView(c());
        }
    }
}
