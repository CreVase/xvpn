package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.security.xvpn.z35kb.widget.NavigationBarContentConstraintLayout;
import com.security.xvpn.z35kb.widget.Toolbar;

/* loaded from: classes2.dex */
public final class n6 implements nk3 {

    /* renamed from: a, reason: collision with root package name */
    public final NavigationBarContentConstraintLayout f3399a;

    /* renamed from: b, reason: collision with root package name */
    public final RecyclerView f3400b;
    public final Toolbar c;

    public n6(NavigationBarContentConstraintLayout navigationBarContentConstraintLayout, RecyclerView recyclerView, Toolbar toolbar) {
        this.f3399a = navigationBarContentConstraintLayout;
        this.f3400b = recyclerView;
        this.c = toolbar;
    }

    @Override // defpackage.nk3
    public final View getRoot() {
        return this.f3399a;
    }
}
