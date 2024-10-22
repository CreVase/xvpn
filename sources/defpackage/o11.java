package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class o11 implements nk3 {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f3578a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f3579b;
    public final ImageView c;
    public final RecyclerView d;
    public final AppCompatImageView e;
    public final TextView f;
    public final LinearLayout g;
    public final AppCompatImageView h;
    public final ImageView i;
    public final FrameLayout j;
    public final TextView k;

    public o11(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, ImageView imageView, RecyclerView recyclerView, AppCompatImageView appCompatImageView2, TextView textView, LinearLayout linearLayout, AppCompatImageView appCompatImageView3, ImageView imageView2, FrameLayout frameLayout, TextView textView2) {
        this.f3578a = constraintLayout;
        this.f3579b = appCompatImageView;
        this.c = imageView;
        this.d = recyclerView;
        this.e = appCompatImageView2;
        this.f = textView;
        this.g = linearLayout;
        this.h = appCompatImageView3;
        this.i = imageView2;
        this.j = frameLayout;
        this.k = textView2;
    }

    @Override // defpackage.nk3
    public final View getRoot() {
        return this.f3578a;
    }
}
