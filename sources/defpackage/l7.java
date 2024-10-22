package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes2.dex */
public final class l7 implements nk3 {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f3074a;

    /* renamed from: b, reason: collision with root package name */
    public final Button f3075b;
    public final TextView c;
    public final ConstraintLayout d;
    public final ConstraintLayout e;
    public final LinearLayout f;
    public final LinearLayout g;
    public final TextView h;
    public final TextView i;
    public final TextView j;
    public final TextView k;
    public final TextView l;
    public final TextView m;
    public final TextView n;
    public final TextView o;
    public final View p;

    public l7(FrameLayout frameLayout, Button button, TextView textView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, View view) {
        this.f3074a = frameLayout;
        this.f3075b = button;
        this.c = textView;
        this.d = constraintLayout;
        this.e = constraintLayout2;
        this.f = linearLayout;
        this.g = linearLayout2;
        this.h = textView2;
        this.i = textView3;
        this.j = textView4;
        this.k = textView5;
        this.l = textView6;
        this.m = textView7;
        this.n = textView8;
        this.o = textView9;
        this.p = view;
    }

    @Override // defpackage.nk3
    public final View getRoot() {
        return this.f3074a;
    }
}
