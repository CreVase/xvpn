package defpackage;

import a.bx;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.livechat.ChatActivity;
import com.security.xvpn.z35kb.livechat.a;

/* loaded from: classes2.dex */
public final class rx extends fh2 {
    public final /* synthetic */ ChatActivity d;

    public rx(ChatActivity chatActivity) {
        this.d = chatActivity;
    }

    @Override // defpackage.fh2
    public final int c() {
        return this.d.n.size();
    }

    @Override // defpackage.fh2
    public final long d(int i) {
        return ((tt3) this.d.n.get(i)).f4577a.hashCode();
    }

    @Override // defpackage.fh2
    public final int e(int i) {
        tt3 tt3Var = (tt3) this.d.n.get(i);
        if (m20.L(tt3Var.d, "Tips")) {
            return 1;
        }
        if (m20.L(tt3Var.d, "Rate")) {
            return 2;
        }
        if (tt3Var.p) {
            if (m20.L(tt3Var.r, "RestartApp")) {
                return 5;
            }
            return 3;
        }
        if (m20.L(tt3Var.d, "TextButton")) {
            return 4;
        }
        return 0;
    }

    @Override // defpackage.fh2
    public final void n(h hVar, int i) {
        int i2;
        LinearLayout.LayoutParams layoutParams;
        int e = hVar.e();
        if (e >= 0 && e < c()) {
            tt3 tt3Var = (tt3) this.d.n.get(e);
            View view = hVar.f281a;
            if (view instanceof lz) {
                lz lzVar = (lz) view;
                lzVar.setType(2);
                lzVar.setText(tt3Var.c);
                return;
            }
            if (view instanceof jz) {
                bx j = hx2.j(tt3Var.c, 48);
                vt3 vt3Var = new vt3();
                vt3Var.f4896a = j.u();
                vt3Var.f4897b = j.t();
                vt3Var.c = j.u();
                vt3Var.d = j.u();
                j.h();
                jz jzVar = (jz) view;
                jzVar.setRateInfo(vt3Var);
                jzVar.setMsgId(tt3Var.f4577a);
                if (cz.L.contains(vt3Var.d)) {
                    jzVar.a();
                    return;
                }
                Long l = null;
                int i3 = 1;
                if (jzVar.i.getChildCount() != 1) {
                    jzVar.i.removeAllViews();
                    eu3 eu3Var = jzVar.i;
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams2.topMargin = tf3.K(10);
                    layoutParams2.bottomMargin = tf3.K(10);
                    layoutParams2.gravity = 17;
                    eu3Var.setLayoutParams(layoutParams2);
                    eu3 eu3Var2 = jzVar.i;
                    AppCompatTextView appCompatTextView = new AppCompatTextView(eu3Var2.getContext(), null);
                    appCompatTextView.setId(-1);
                    appCompatTextView.setText("");
                    tf3.A0(appCompatTextView);
                    appCompatTextView.getPaint().setUnderlineText(true);
                    appCompatTextView.getPaint().setFakeBoldText(true);
                    appCompatTextView.setTextColor(-6710887);
                    ViewGroup.LayoutParams layoutParams3 = appCompatTextView.getLayoutParams();
                    if (layoutParams3 instanceof LinearLayout.LayoutParams) {
                        layoutParams = (LinearLayout.LayoutParams) layoutParams3;
                    } else {
                        layoutParams = null;
                    }
                    if (layoutParams == null) {
                        layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    }
                    layoutParams.width = -2;
                    layoutParams.height = -2;
                    layoutParams.weight = Math.max(-1.0f, layoutParams.weight);
                    layoutParams.gravity = Math.max(-1, layoutParams.gravity);
                    layoutParams.leftMargin = Math.max(-1, layoutParams.leftMargin);
                    layoutParams.topMargin = Math.max(-1, layoutParams.topMargin);
                    layoutParams.rightMargin = Math.max(-1, layoutParams.rightMargin);
                    layoutParams.bottomMargin = Math.max(-1, layoutParams.bottomMargin);
                    appCompatTextView.setLayoutParams(layoutParams);
                    appCompatTextView.setOnClickListener(new hz(jzVar, i3));
                    eu3Var2.addView(appCompatTextView);
                    jzVar.g = appCompatTextView;
                }
                jzVar.i.setBackground(null);
                TextView textView = jzVar.g;
                if (textView != null) {
                    vt3 vt3Var2 = jzVar.h;
                    if (vt3Var2 != null) {
                        l = Long.valueOf(vt3Var2.f4897b);
                    }
                    if (l.longValue() > 0) {
                        i2 = R.string.SupportReviewsLastService;
                    } else {
                        i2 = R.string.SupportRateLastService;
                    }
                    textView.setText(pd0.y(i2));
                    return;
                }
                return;
            }
            if (view instanceof bz) {
                ((bz) view).setData(tt3Var);
                return;
            }
            if (view instanceof kz) {
                ((kz) view).setData(tt3Var);
            } else if (view instanceof ud2) {
                ((ud2) view).setData(tt3Var);
            } else {
                ((a) view).setData(tt3Var);
            }
        }
    }

    @Override // defpackage.fh2
    public final h s(RecyclerView recyclerView, int i) {
        qx qxVar;
        if (i != 1) {
            if (i != 2) {
                ChatActivity chatActivity = this.d;
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            int i2 = ChatActivity.L;
                            a aVar = new a(chatActivity.c, chatActivity.B);
                            chatActivity.bindInvalidate(aVar);
                            return new qx(aVar);
                        }
                        qxVar = new qx(chatActivity, new kz(recyclerView.getContext(), chatActivity.i));
                    } else {
                        qxVar = new qx(new ud2(recyclerView.getContext(), chatActivity.i));
                    }
                } else {
                    qxVar = new qx(chatActivity, new bz(recyclerView.getContext(), chatActivity.i));
                }
            } else {
                qxVar = new qx(new jz(recyclerView.getContext()));
            }
        } else {
            qxVar = new qx(new lz(recyclerView.getContext()));
        }
        return qxVar;
    }
}
