package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.l;
import androidx.lifecycle.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.widget.NavigationBarContentConstraintLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class iq2 extends sn implements a22 {
    public static final /* synthetic */ int m = 0;
    public int d;
    public RecyclerView e;
    public lq2 f;
    public pq2 g;
    public b h;
    public ey1 i;
    public ey1 j;
    public final c32 k = new c32();
    public Rect l;

    @Override // defpackage.a22
    public final void F(Object obj) {
        ew3.b0(new to1(2, this, (qb2) obj));
    }

    @Override // defpackage.sn, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d = getArguments().getInt("key_type");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_server_list, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        RecyclerView recyclerView;
        super.onHiddenChanged(z);
        if (!z && (recyclerView = this.e) != null && recyclerView.getChildCount() > 0) {
            this.e.getChildAt(0).requestFocus();
        }
    }

    @Override // defpackage.sn
    public final void t(View view, Bundle bundle) {
        int i;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.server_list_view);
        this.e = recyclerView;
        getActivity();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        zh0 zh0Var = new zh0();
        zh0Var.c = 0L;
        zh0Var.f = 0L;
        zh0Var.d = 0L;
        zh0Var.e = 0L;
        int i2 = 0;
        zh0Var.g = false;
        this.e.setItemAnimator(zh0Var);
        lq2 lq2Var = new lq2(new WeakReference(this.e), this);
        this.f = lq2Var;
        n40 n40Var = new n40(new fh2[]{lq2Var, new oq2(this, this.d)});
        this.f.getClass();
        this.e.post(new to1(1, this, n40Var));
        RecyclerView recyclerView2 = this.e;
        l activity = getActivity();
        if (this.d == 1) {
            i = 10;
        } else {
            i = 30;
        }
        recyclerView2.i(new mq2(activity, i));
        RecyclerView recyclerView3 = this.e;
        getActivity();
        pq2 pq2Var = new pq2();
        this.g = pq2Var;
        recyclerView3.i(pq2Var);
        this.f.f2091a.registerObserver(new gq2(this, i2));
        this.f.g = new hq2(this, i2);
        View findViewById = view.findViewById(R.id.btn_go_premium);
        if (ew3.X()) {
            i2 = 8;
        }
        findViewById.setVisibility(i2);
        findViewById.setOnClickListener(new cr1(this, 9));
        b bVar = this.h;
        if (bVar != null) {
            bVar.d(this, this);
        }
        if (getView() != null && this.l != null) {
            ((NavigationBarContentConstraintLayout) getView()).fitSystemWindows(this.l);
        }
        fl.j(this.e, this);
    }
}
