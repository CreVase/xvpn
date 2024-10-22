package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes2.dex */
public final class se1 implements nk3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4326a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f4327b;
    public final ViewGroup c;
    public final View d;

    public /* synthetic */ se1(ViewGroup viewGroup, TextView textView, View view, int i) {
        this.f4326a = i;
        this.c = viewGroup;
        this.f4327b = textView;
        this.d = view;
    }

    @Override // defpackage.nk3
    public final View getRoot() {
        int i = this.f4326a;
        ViewGroup viewGroup = this.c;
        switch (i) {
            case 0:
                return (ConstraintLayout) viewGroup;
            case 1:
                return (LinearLayout) viewGroup;
            default:
                return (FrameLayout) viewGroup;
        }
    }

    public se1(ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        this.f4326a = 0;
        this.c = constraintLayout;
        this.d = imageView;
        this.f4327b = textView;
    }
}
