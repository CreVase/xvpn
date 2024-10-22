package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.security.xvpn.z35kb.R;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class ta2 extends fh2 {
    public final f83 d;
    public final ArrayList e;

    public ta2(f83 f83Var) {
        this.d = f83Var;
        this.e = new ArrayList();
        this.e = new ArrayList();
    }

    @Override // defpackage.fh2
    public final int c() {
        return this.e.size();
    }

    @Override // defpackage.fh2
    public final int e(int i) {
        return ((ra2) this.e.get(i)).f4121a;
    }

    @Override // defpackage.fh2
    public final void n(h hVar, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (hVar instanceof qa2) {
            ((qa2) hVar).a();
            return;
        }
        if (hVar instanceof sa2) {
            sa2 sa2Var = (sa2) hVar;
            ra2 ra2Var = (ra2) this.e.get(i);
            sa2Var.a();
            ab2 ab2Var = (ab2) ra2Var.f4122b;
            boolean z4 = true;
            if (ab2Var.f50b.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && i23.R0("KM", ab2Var.f50b, false)) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean X = ew3.X();
            te1 te1Var = sa2Var.u;
            te1Var.d.setText(ab2Var.f49a);
            te1Var.f4490b.setText(pd0.A(ab2Var.e.toString()));
            te1Var.d.setSelected(ab2Var.c);
            boolean z5 = ab2Var.c;
            LinearLayout linearLayout = te1Var.f4489a;
            linearLayout.setSelected(z5);
            if (z2 && !X) {
                z3 = true;
            } else {
                z3 = false;
            }
            m20.g1(te1Var.e, z3);
            if (!ab2Var.d || (!X && z2)) {
                z4 = false;
            }
            m20.g1(te1Var.c, z4);
            View view = sa2Var.f281a;
            view.setNextFocusForwardId(0);
            linearLayout.setNextFocusDownId(0);
            view.setOnClickListener(new cr1(ab2Var, 19));
        }
    }

    @Override // defpackage.fh2
    public final h s(RecyclerView recyclerView, int i) {
        h sa2Var;
        LayoutInflater from = LayoutInflater.from(recyclerView.getContext());
        f83 f83Var = this.d;
        if (i == 0) {
            View inflate = from.inflate(R.layout.item_protocol_header, (ViewGroup) recyclerView, false);
            int i2 = R.id.text;
            TextView textView = (TextView) m20.g0(inflate, R.id.text);
            if (textView != null) {
                i2 = R.id.vDivider;
                View g0 = m20.g0(inflate, R.id.vDivider);
                if (g0 != null) {
                    sa2Var = new qa2(new se1((LinearLayout) inflate, textView, g0, 1), f83Var);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        }
        View inflate2 = from.inflate(R.layout.item_protocol, (ViewGroup) recyclerView, false);
        LinearLayout linearLayout = (LinearLayout) inflate2;
        int i3 = R.id.tvDesc;
        TextView textView2 = (TextView) m20.g0(inflate2, R.id.tvDesc);
        if (textView2 != null) {
            i3 = R.id.tvRecommend;
            TextView textView3 = (TextView) m20.g0(inflate2, R.id.tvRecommend);
            if (textView3 != null) {
                i3 = R.id.tvTitle;
                TextView textView4 = (TextView) m20.g0(inflate2, R.id.tvTitle);
                if (textView4 != null) {
                    i3 = R.id.vPremium;
                    TextView textView5 = (TextView) m20.g0(inflate2, R.id.vPremium);
                    if (textView5 != null) {
                        sa2Var = new sa2(new te1(linearLayout, textView2, textView3, textView4, textView5), f83Var);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i3)));
        return sa2Var;
    }
}
