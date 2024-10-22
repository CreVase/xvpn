package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.security.xvpn.z35kb.XTextViewNew;
import com.security.xvpn.z35kb.widget.NavigationBarContentConstraintLayout;

/* loaded from: classes2.dex */
public final class zy implements nk3 {

    /* renamed from: a, reason: collision with root package name */
    public final NavigationBarContentConstraintLayout f5568a;

    /* renamed from: b, reason: collision with root package name */
    public final View f5569b;
    public final ImageView c;
    public final AppCompatImageView d;
    public final AppCompatImageView e;
    public final AppCompatImageView f;
    public final AppCompatImageView g;
    public final AppCompatImageView h;
    public final XTextViewNew i;
    public final View j;
    public final AppCompatEditText k;
    public final LinearLayout l;
    public final LinearLayout m;
    public final RecyclerView n;
    public final RecyclerView o;
    public final FrameLayout p;
    public final TextView q;

    public zy(NavigationBarContentConstraintLayout navigationBarContentConstraintLayout, View view, ImageView imageView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, AppCompatImageView appCompatImageView5, XTextViewNew xTextViewNew, View view2, AppCompatEditText appCompatEditText, LinearLayout linearLayout, LinearLayout linearLayout2, RecyclerView recyclerView, RecyclerView recyclerView2, FrameLayout frameLayout, TextView textView) {
        this.f5568a = navigationBarContentConstraintLayout;
        this.f5569b = view;
        this.c = imageView;
        this.d = appCompatImageView;
        this.e = appCompatImageView2;
        this.f = appCompatImageView3;
        this.g = appCompatImageView4;
        this.h = appCompatImageView5;
        this.i = xTextViewNew;
        this.j = view2;
        this.k = appCompatEditText;
        this.l = linearLayout;
        this.m = linearLayout2;
        this.n = recyclerView;
        this.o = recyclerView2;
        this.p = frameLayout;
        this.q = textView;
    }

    @Override // defpackage.nk3
    public final View getRoot() {
        return this.f5568a;
    }
}
