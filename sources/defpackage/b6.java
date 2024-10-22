package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes2.dex */
public final class b6 implements nk3 {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f408a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f409b;
    public final LinearLayout c;
    public final TextView d;

    public b6(ConstraintLayout constraintLayout, FrameLayout frameLayout, LinearLayout linearLayout, TextView textView) {
        this.f408a = constraintLayout;
        this.f409b = frameLayout;
        this.c = linearLayout;
        this.d = textView;
    }

    @Override // defpackage.nk3
    public final View getRoot() {
        return this.f408a;
    }
}
