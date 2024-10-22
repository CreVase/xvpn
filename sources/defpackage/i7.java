package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.security.xvpn.z35kb.XTextViewNew;
import com.security.xvpn.z35kb.widget.NavigationBarContentConstraintLayout;

/* loaded from: classes2.dex */
public final class i7 implements nk3 {

    /* renamed from: a, reason: collision with root package name */
    public final NavigationBarContentConstraintLayout f2545a;

    /* renamed from: b, reason: collision with root package name */
    public final View f2546b;
    public final TextView c;
    public final XTextViewNew d;
    public final XTextViewNew e;
    public final TextView f;
    public final TextView g;
    public final Group h;
    public final TextView i;
    public final TextView j;
    public final View k;
    public final LinearLayout l;
    public final RecyclerView m;

    public i7(NavigationBarContentConstraintLayout navigationBarContentConstraintLayout, View view, TextView textView, XTextViewNew xTextViewNew, XTextViewNew xTextViewNew2, TextView textView2, TextView textView3, Group group, TextView textView4, TextView textView5, View view2, LinearLayout linearLayout, RecyclerView recyclerView) {
        this.f2545a = navigationBarContentConstraintLayout;
        this.f2546b = view;
        this.c = textView;
        this.d = xTextViewNew;
        this.e = xTextViewNew2;
        this.f = textView2;
        this.g = textView3;
        this.h = group;
        this.i = textView4;
        this.j = textView5;
        this.k = view2;
        this.l = linearLayout;
        this.m = recyclerView;
    }

    @Override // defpackage.nk3
    public final View getRoot() {
        return this.f2545a;
    }
}
