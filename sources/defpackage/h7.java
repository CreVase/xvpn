package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Group;
import com.security.xvpn.z35kb.widget.NavigationBarContentConstraintLayout;
import com.security.xvpn.z35kb.widget.TabSaveFocusLayout;
import com.security.xvpn.z35kb.widget.XEditText;

/* loaded from: classes2.dex */
public final class h7 implements nk3 {

    /* renamed from: a, reason: collision with root package name */
    public final NavigationBarContentConstraintLayout f2373a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f2374b;
    public final TextView c;
    public final FrameLayout d;
    public final View e;
    public final View f;
    public final XEditText g;
    public final FrameLayout h;
    public final FrameLayout i;
    public final AppCompatImageView j;
    public final NavigationBarContentConstraintLayout k;
    public final Group l;
    public final TabSaveFocusLayout m;
    public final TextView n;
    public final TextView o;

    public h7(NavigationBarContentConstraintLayout navigationBarContentConstraintLayout, AppCompatImageView appCompatImageView, TextView textView, FrameLayout frameLayout, View view, View view2, XEditText xEditText, FrameLayout frameLayout2, FrameLayout frameLayout3, AppCompatImageView appCompatImageView2, NavigationBarContentConstraintLayout navigationBarContentConstraintLayout2, Group group, TabSaveFocusLayout tabSaveFocusLayout, TextView textView2, TextView textView3) {
        this.f2373a = navigationBarContentConstraintLayout;
        this.f2374b = appCompatImageView;
        this.c = textView;
        this.d = frameLayout;
        this.e = view;
        this.f = view2;
        this.g = xEditText;
        this.h = frameLayout2;
        this.i = frameLayout3;
        this.j = appCompatImageView2;
        this.k = navigationBarContentConstraintLayout2;
        this.l = group;
        this.m = tabSaveFocusLayout;
        this.n = textView2;
        this.o = textView3;
    }

    @Override // defpackage.nk3
    public final View getRoot() {
        return this.f2373a;
    }
}
