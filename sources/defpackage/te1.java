package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class te1 implements nk3 {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayout f4489a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f4490b;
    public final TextView c;
    public final TextView d;
    public final TextView e;

    public te1(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f4489a = linearLayout;
        this.f4490b = textView;
        this.c = textView2;
        this.d = textView3;
        this.e = textView4;
    }

    @Override // defpackage.nk3
    public final View getRoot() {
        return this.f4489a;
    }
}
