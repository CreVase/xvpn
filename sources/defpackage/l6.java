package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.security.xvpn.z35kb.widget.Toolbar;

/* loaded from: classes2.dex */
public final class l6 implements nk3 {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f3071a;

    /* renamed from: b, reason: collision with root package name */
    public final RecyclerView f3072b;
    public final Toolbar c;

    public l6(ConstraintLayout constraintLayout, RecyclerView recyclerView, Toolbar toolbar) {
        this.f3071a = constraintLayout;
        this.f3072b = recyclerView;
        this.c = toolbar;
    }

    @Override // defpackage.nk3
    public final View getRoot() {
        return this.f3071a;
    }
}
