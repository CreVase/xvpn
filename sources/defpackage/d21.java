package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.security.xvpn.z35kb.widget.NavigationBarContentConstraintLayout;

/* loaded from: classes2.dex */
public final class d21 implements nk3 {

    /* renamed from: a, reason: collision with root package name */
    public final NavigationBarContentConstraintLayout f1720a;

    /* renamed from: b, reason: collision with root package name */
    public final Group f1721b;
    public final RecyclerView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;

    public d21(NavigationBarContentConstraintLayout navigationBarContentConstraintLayout, Group group, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f1720a = navigationBarContentConstraintLayout;
        this.f1721b = group;
        this.c = recyclerView;
        this.d = textView;
        this.e = textView2;
        this.f = textView3;
        this.g = textView4;
    }

    @Override // defpackage.nk3
    public final View getRoot() {
        return this.f1720a;
    }
}
