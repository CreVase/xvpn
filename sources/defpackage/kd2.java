package defpackage;

import a.bx;
import a.du;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ObservableInt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.security.xvpn.z35kb.purchase.GoogleIABHelper;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class kd2 extends sn implements qt3 {
    public static final /* synthetic */ int j = 0;
    public final ui1 d;
    public final gm3 e;
    public int f;
    public final ObservableInt g;
    public final gd2 h;
    public int i;

    public kd2() {
        super(0);
        int i = 1;
        this.d = m20.D0(kj1.f2953a, new ma(this, i));
        ui1 D0 = m20.D0(kj1.c, new z62(new a31(this, i), i));
        this.e = new gm3(gi2.a(md2.class), new yy2(D0, 14), new a72(9, this, D0), new a72(8, null, D0));
        ObservableInt observableInt = new ObservableInt(0);
        this.g = observableInt;
        this.h = new gd2(observableInt, this);
        this.i = tf3.K(10);
    }

    public final md2 D() {
        return (md2) this.e.getValue();
    }

    @Override // defpackage.qt3
    public final void i(boolean z, boolean z2) {
        if (z) {
            z().z.setVisibility(8);
            z().x.setVisibility(8);
        } else {
            z().z.setVisibility(0);
            z().x.setVisibility(0);
        }
    }

    @Override // defpackage.sn
    public final boolean m() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        Bundle arguments = getArguments();
        if (arguments != null) {
            i = arguments.getInt("from");
        } else {
            i = 0;
        }
        this.f = i;
        z().e.post(new hd2(this, 1));
        return z().e;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        rt3.e().l(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (zb2 zb2Var : ew3.F()) {
            z82 z82Var = new z82();
            z82Var.f5443b = zb2Var.f5459a;
            z82Var.c = zb2Var.f5460b;
            z82Var.d = zb2Var.c;
            z82Var.e = zb2Var.d;
            z82Var.f = zb2Var.e;
            z82Var.g = zb2Var.f;
            z82Var.h = zb2Var.g;
            arrayList.add(z82Var);
        }
        gd2 gd2Var = this.h;
        ArrayList arrayList2 = gd2Var.f;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        gd2Var.f();
        D().f = arrayList;
        z().B.post(new hd2(this, i));
        md2 D = D();
        arrayList.size();
        D.getClass();
    }

    @Override // defpackage.sn, defpackage.w73
    public final void p(boolean z) {
        super.p(z);
        D().p(z);
    }

    @Override // defpackage.sn
    public final void t(View view, Bundle bundle) {
        p6 z = z();
        md2 D = D();
        q6 q6Var = (q6) z;
        final int i = 1;
        q6Var.n(1, D);
        q6Var.K = D;
        synchronized (q6Var) {
            q6Var.o0 |= 2;
        }
        q6Var.e(23);
        q6Var.m();
        this.g.a(new sl3(this));
        if (this.f == 7) {
            D().g = true;
            du.d(342, null);
        }
        final int i2 = 0;
        z().v.setOnClickListener(new View.OnClickListener(this) { // from class: id2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ kd2 f2574b;

            {
                this.f2574b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i3 = i2;
                kd2 kd2Var = this.f2574b;
                switch (i3) {
                    case 0:
                        int i4 = kd2.j;
                        kd2Var.requireActivity().onBackPressed();
                        return;
                    case 1:
                        int i5 = kd2.j;
                        kd2Var.getClass();
                        du.d(262, null);
                        du.d(282, null);
                        kd2Var.requireActivity();
                        fv2 fv2Var = new fv2(kd2Var, 9);
                        yc2.a();
                        fv2Var.invoke(GoogleIABHelper.g);
                        return;
                    case 2:
                        int i6 = kd2.j;
                        kd2Var.requireActivity();
                        d42 d42Var = d42.q;
                        yc2.a();
                        d42Var.invoke(GoogleIABHelper.g);
                        return;
                    default:
                        int i7 = kd2.j;
                        bx3.G(kd2Var.requireActivity(), true, null);
                        return;
                }
            }
        });
        RecyclerView recyclerView = z().B;
        gd2 gd2Var = this.h;
        recyclerView.setAdapter(gd2Var);
        RecyclerView recyclerView2 = z().B;
        requireContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        final int i3 = 2;
        z().B.i(new mi1(this, i3));
        z().B.setHasFixedSize(true);
        z().B.setNestedScrollingEnabled(false);
        gd2Var.g = new jd2(this);
        z().y.setOnClickListener(new View.OnClickListener(this) { // from class: id2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ kd2 f2574b;

            {
                this.f2574b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i32 = i;
                kd2 kd2Var = this.f2574b;
                switch (i32) {
                    case 0:
                        int i4 = kd2.j;
                        kd2Var.requireActivity().onBackPressed();
                        return;
                    case 1:
                        int i5 = kd2.j;
                        kd2Var.getClass();
                        du.d(262, null);
                        du.d(282, null);
                        kd2Var.requireActivity();
                        fv2 fv2Var = new fv2(kd2Var, 9);
                        yc2.a();
                        fv2Var.invoke(GoogleIABHelper.g);
                        return;
                    case 2:
                        int i6 = kd2.j;
                        kd2Var.requireActivity();
                        d42 d42Var = d42.q;
                        yc2.a();
                        d42Var.invoke(GoogleIABHelper.g);
                        return;
                    default:
                        int i7 = kd2.j;
                        bx3.G(kd2Var.requireActivity(), true, null);
                        return;
                }
            }
        });
        z().w.setOnClickListener(new View.OnClickListener(this) { // from class: id2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ kd2 f2574b;

            {
                this.f2574b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i32 = i3;
                kd2 kd2Var = this.f2574b;
                switch (i32) {
                    case 0:
                        int i4 = kd2.j;
                        kd2Var.requireActivity().onBackPressed();
                        return;
                    case 1:
                        int i5 = kd2.j;
                        kd2Var.getClass();
                        du.d(262, null);
                        du.d(282, null);
                        kd2Var.requireActivity();
                        fv2 fv2Var = new fv2(kd2Var, 9);
                        yc2.a();
                        fv2Var.invoke(GoogleIABHelper.g);
                        return;
                    case 2:
                        int i6 = kd2.j;
                        kd2Var.requireActivity();
                        d42 d42Var = d42.q;
                        yc2.a();
                        d42Var.invoke(GoogleIABHelper.g);
                        return;
                    default:
                        int i7 = kd2.j;
                        bx3.G(kd2Var.requireActivity(), true, null);
                        return;
                }
            }
        });
        final int i4 = 3;
        z().x.setOnClickListener(new View.OnClickListener(this) { // from class: id2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ kd2 f2574b;

            {
                this.f2574b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i32 = i4;
                kd2 kd2Var = this.f2574b;
                switch (i32) {
                    case 0:
                        int i42 = kd2.j;
                        kd2Var.requireActivity().onBackPressed();
                        return;
                    case 1:
                        int i5 = kd2.j;
                        kd2Var.getClass();
                        du.d(262, null);
                        du.d(282, null);
                        kd2Var.requireActivity();
                        fv2 fv2Var = new fv2(kd2Var, 9);
                        yc2.a();
                        fv2Var.invoke(GoogleIABHelper.g);
                        return;
                    case 2:
                        int i6 = kd2.j;
                        kd2Var.requireActivity();
                        d42 d42Var = d42.q;
                        yc2.a();
                        d42Var.invoke(GoogleIABHelper.g);
                        return;
                    default:
                        int i7 = kd2.j;
                        bx3.G(kd2Var.requireActivity(), true, null);
                        return;
                }
            }
        });
        z().H.setMovementMethod(LinkMovementMethod.getInstance());
        p6 z2 = z();
        z2.C.getViewTreeObserver().addOnPreDrawListener(new o53(i, z2, this));
        z().w.setBackground(v73.v(0.0f, 1000004, 3));
        z().x.setBackground(v73.v(0.0f, 1000004, 3));
        fl.n(this, z().I, 1000013);
        fl.n(this, z().H, 1000015);
        fl.m(this, z().H, 1000122);
        fl.g(this, z().e, 1000004);
        z().y.setBackground(v73.t(24 * tf3.F, 0.0f, 1000118));
        fl.n(this, z().y, 1000121);
        fl.n(this, z().w, 1000122);
        fl.n(this, z().x, 1000122);
        du.d(273, null);
        du.d(276, null);
        du.d(281, null);
        int i5 = this.f;
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        if (i5 != 5) {
                            if (i5 != 7) {
                                if (i5 != 8) {
                                    if (i5 != 24) {
                                        if (i5 != 40) {
                                            if (i5 != 26) {
                                                if (i5 != 27) {
                                                    switch (i5) {
                                                        case 15:
                                                            du.d(321, null);
                                                            break;
                                                        case 16:
                                                            du.d(335, null);
                                                            break;
                                                        case 17:
                                                            du.d(339, null);
                                                            break;
                                                        case 18:
                                                            du.d(340, null);
                                                            break;
                                                        case 19:
                                                            du.d(336, null);
                                                            break;
                                                        case 20:
                                                            du.d(337, null);
                                                            break;
                                                        default:
                                                            switch (i5) {
                                                                case 29:
                                                                    du.d(432, null);
                                                                    break;
                                                                case 30:
                                                                    du.d(345, null);
                                                                    break;
                                                                case 31:
                                                                    du.d(346, null);
                                                                    break;
                                                                case 32:
                                                                    du.d(338, null);
                                                                    break;
                                                                case 33:
                                                                    du.d(347, null);
                                                                    break;
                                                                case 34:
                                                                    du.d(324, null);
                                                                    break;
                                                                case 35:
                                                                    du.d(328, null);
                                                                    break;
                                                                case 36:
                                                                    du.d(329, null);
                                                                    break;
                                                                case 37:
                                                                    du.d(330, null);
                                                                    break;
                                                                case 38:
                                                                    du.d(323, null);
                                                                    break;
                                                            }
                                                    }
                                                } else {
                                                    du.d(344, null);
                                                }
                                            } else {
                                                du.d(341, null);
                                            }
                                        } else {
                                            bx i6 = hx2.i(443);
                                            String u = i6.u();
                                            i6.h();
                                            bx bxVar = new bx();
                                            bxVar.z(u);
                                            du.d(348, bxVar);
                                            bxVar.h();
                                        }
                                    } else {
                                        du.d(343, null);
                                    }
                                } else {
                                    du.d(331, null);
                                }
                            } else {
                                du.d(342, null);
                            }
                        } else {
                            du.d(333, null);
                        }
                    } else {
                        du.d(332, null);
                    }
                } else {
                    du.d(326, null);
                }
            } else {
                du.d(327, null);
            }
        } else {
            du.d(325, null);
        }
        rt3.e().c(this);
    }

    public final p6 z() {
        return (p6) this.d.getValue();
    }
}
