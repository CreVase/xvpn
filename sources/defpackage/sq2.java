package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.l;
import androidx.lifecycle.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.widget.NavigationBarContentConstraintLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class sq2 extends sn implements a22 {
    public static final /* synthetic */ int k = 0;
    public b d;
    public ey1 e;
    public ey1 f;
    public lq2 g;
    public String h;
    public d21 i;
    public o03 j;

    public sq2() {
        super(0);
    }

    @Override // defpackage.a22
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final void F(String str) {
        if (!m20.L(this.h, str) && str != null) {
            this.h = str;
            o03 o03Var = this.j;
            if (o03Var != null) {
                o03Var.c(null);
            }
            this.j = zf3.T(this, null, new rq2(str, this, null), 3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        F("");
        View inflate = layoutInflater.inflate(R.layout.fragment_search, (ViewGroup) null, false);
        int i = R.id.searchEmptyPanel;
        Group group = (Group) m20.g0(inflate, R.id.searchEmptyPanel);
        if (group != null) {
            i = R.id.searchResultList;
            RecyclerView recyclerView = (RecyclerView) m20.g0(inflate, R.id.searchResultList);
            if (recyclerView != null) {
                i = R.id.tvContactSupport;
                TextView textView = (TextView) m20.g0(inflate, R.id.tvContactSupport);
                if (textView != null) {
                    i = R.id.tv_flag_1;
                    TextView textView2 = (TextView) m20.g0(inflate, R.id.tv_flag_1);
                    if (textView2 != null) {
                        i = R.id.tv_flag_2;
                        TextView textView3 = (TextView) m20.g0(inflate, R.id.tv_flag_2);
                        if (textView3 != null) {
                            i = R.id.tvSendEmail;
                            TextView textView4 = (TextView) m20.g0(inflate, R.id.tvSendEmail);
                            if (textView4 != null) {
                                NavigationBarContentConstraintLayout navigationBarContentConstraintLayout = (NavigationBarContentConstraintLayout) inflate;
                                this.i = new d21(navigationBarContentConstraintLayout, group, recyclerView, textView, textView2, textView3, textView4);
                                return navigationBarContentConstraintLayout;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.sn, defpackage.w73
    public final void p(boolean z) {
        super.p(z);
        z();
    }

    @Override // defpackage.sn
    public final void t(View view, Bundle bundle) {
        view.setBackgroundColor(v73.j(1000004));
        RecyclerView recyclerView = this.i.c;
        getActivity();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        lq2 lq2Var = new lq2(new WeakReference(this.i.c), this);
        final int i = 0;
        final int i2 = 1;
        this.i.c.setAdapter(new n40(new fh2[]{lq2Var, new oq2(lq2Var.e, -1)}));
        lq2Var.g = new hq2(this, 1);
        this.g = lq2Var;
        b bVar = this.d;
        if (bVar == null) {
            bVar = null;
        }
        bVar.d(this, this);
        this.i.d.setOnClickListener(new View.OnClickListener(this) { // from class: qq2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ sq2 f4041b;

            {
                this.f4041b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i3 = i;
                sq2 sq2Var = this.f4041b;
                switch (i3) {
                    case 0:
                        int i4 = sq2.k;
                        bx3.a(sq2Var.requireContext());
                        return;
                    default:
                        int i5 = sq2.k;
                        l requireActivity = sq2Var.requireActivity();
                        Intent intent = new Intent("android.intent.action.SENDTO");
                        intent.setData(Uri.parse("mailto:support@xvpn.io"));
                        requireActivity.startActivity(Intent.createChooser(intent, "Send Email"));
                        return;
                }
            }
        });
        this.i.g.setOnClickListener(new View.OnClickListener(this) { // from class: qq2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ sq2 f4041b;

            {
                this.f4041b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i3 = i2;
                sq2 sq2Var = this.f4041b;
                switch (i3) {
                    case 0:
                        int i4 = sq2.k;
                        bx3.a(sq2Var.requireContext());
                        return;
                    default:
                        int i5 = sq2.k;
                        l requireActivity = sq2Var.requireActivity();
                        Intent intent = new Intent("android.intent.action.SENDTO");
                        intent.setData(Uri.parse("mailto:support@xvpn.io"));
                        requireActivity.startActivity(Intent.createChooser(intent, "Send Email"));
                        return;
                }
            }
        });
        fl.n(this, this.i.e, 1000014);
        fl.n(this, this.i.f, 1000015);
        z();
    }

    public final void z() {
        d21 d21Var = this.i;
        if (d21Var != null) {
            boolean l = v73.l();
            TextView textView = d21Var.d;
            TextView textView2 = d21Var.g;
            if (l) {
                textView2.setBackground(x80.getDrawable(requireContext(), R.drawable.bg_send_email_dark));
                textView.setBackground(x80.getDrawable(requireContext(), R.drawable.bg_contact_support_dark));
                textView2.setTextColor(-2500135);
            } else {
                textView2.setBackground(x80.getDrawable(requireContext(), R.drawable.bg_send_email));
                textView.setBackground(x80.getDrawable(requireContext(), R.drawable.bg_contact_support));
                textView2.setTextColor(x80.getColor(requireContext(), R.color.send_email_text_color));
            }
        }
    }
}
