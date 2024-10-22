package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes2.dex */
public final class w30 implements nk3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4932a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f4933b;
    public final TextView c;
    public final View d;
    public final ViewGroup e;
    public final View f;

    public /* synthetic */ w30(ViewGroup viewGroup, View view, TextView textView, TextView textView2, View view2, int i) {
        this.f4932a = i;
        this.e = viewGroup;
        this.f = view;
        this.f4933b = textView;
        this.c = textView2;
        this.d = view2;
    }

    @Override // defpackage.nk3
    public final View getRoot() {
        int i = this.f4932a;
        ViewGroup viewGroup = this.e;
        switch (i) {
            case 0:
                return (CardView) viewGroup;
            case 1:
                return (ConstraintLayout) viewGroup;
            default:
                return (LinearLayout) viewGroup;
        }
    }
}
