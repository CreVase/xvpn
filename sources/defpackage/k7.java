package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.security.xvpn.z35kb.widget.NavigationBarContentConstraintLayout;
import com.security.xvpn.z35kb.widget.Toolbar;

/* loaded from: classes2.dex */
public final class k7 implements nk3 {

    /* renamed from: a, reason: collision with root package name */
    public final NavigationBarContentConstraintLayout f2901a;

    /* renamed from: b, reason: collision with root package name */
    public final View f2902b;
    public final SwitchCompat c;
    public final SwitchCompat d;
    public final Toolbar e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public final TextView j;
    public final TextView k;
    public final TextView l;
    public final View m;
    public final View n;
    public final LinearLayout o;
    public final LinearLayout p;

    public k7(NavigationBarContentConstraintLayout navigationBarContentConstraintLayout, View view, SwitchCompat switchCompat, SwitchCompat switchCompat2, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, View view2, View view3, LinearLayout linearLayout, LinearLayout linearLayout2) {
        this.f2901a = navigationBarContentConstraintLayout;
        this.f2902b = view;
        this.c = switchCompat;
        this.d = switchCompat2;
        this.e = toolbar;
        this.f = textView;
        this.g = textView2;
        this.h = textView3;
        this.i = textView4;
        this.j = textView5;
        this.k = textView6;
        this.l = textView7;
        this.m = view2;
        this.n = view3;
        this.o = linearLayout;
        this.p = linearLayout2;
    }

    @Override // defpackage.nk3
    public final View getRoot() {
        return this.f2901a;
    }
}
