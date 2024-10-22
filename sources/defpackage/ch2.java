package defpackage;

import a.bx;
import a.du;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.livechat.ChatActivity;
import com.security.xvpn.z35kb.speedtest.SpeedTestActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class ch2 implements qh2 {

    /* renamed from: a, reason: collision with root package name */
    public final GestureDetector f634a;

    /* renamed from: b, reason: collision with root package name */
    public View f635b;
    public int c;

    public ch2(Context context) {
        this.f634a = new GestureDetector(context, new bh2(this));
    }

    @Override // defpackage.qh2
    public final void a() {
    }

    @Override // defpackage.qh2
    public boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        View view;
        boolean z;
        boolean L;
        boolean L2;
        boolean z2;
        Object obj;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int e = recyclerView.f.e();
        while (true) {
            e--;
            if (e >= 0) {
                view = recyclerView.f.d(e);
                float translationX = view.getTranslationX();
                float translationY = view.getTranslationY();
                if (x >= view.getLeft() + translationX && x <= view.getRight() + translationX && y >= view.getTop() + translationY && y <= view.getBottom() + translationY) {
                    break;
                }
            } else {
                view = null;
                break;
            }
        }
        this.f635b = view;
        this.c = RecyclerView.K(view);
        if (view == null || !this.f634a.onTouchEvent(motionEvent)) {
            return false;
        }
        int K = RecyclerView.K(view);
        jy jyVar = (jy) this;
        int i = 2;
        int i2 = jyVar.d;
        zo zoVar = jyVar.e;
        switch (i2) {
            case 0:
                if (K >= 0 && K < ((ChatActivity) zoVar).v.size()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    return false;
                }
                ChatActivity chatActivity = (ChatActivity) zoVar;
                ut3 ut3Var = (ut3) chatActivity.v.get(K);
                String str = ut3Var.f;
                chatActivity.x = ut3Var;
                if (m20.L(str, tf3.a())) {
                    L = true;
                } else {
                    bx i3 = hx2.i(32);
                    String u = i3.u();
                    i3.h();
                    L = m20.L(str, u);
                }
                ArrayList arrayList = chatActivity.v;
                rv0 rv0Var = chatActivity.w;
                if (L) {
                    arrayList.clear();
                    c20.E0(arrayList, ut3Var.g);
                } else {
                    bx i4 = hx2.i(33);
                    String u2 = i4.u();
                    i4.h();
                    boolean L3 = m20.L(str, u2);
                    ArrayList arrayList2 = chatActivity.u;
                    if (L3) {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        rv0Var.f();
                        if (chatActivity.Z().o.isShown()) {
                            chatActivity.g0();
                        }
                        return true;
                    }
                    if (m20.L(str, tf3.b())) {
                        L2 = true;
                    } else {
                        bx i5 = hx2.i(37);
                        String u3 = i5.u();
                        i5.h();
                        L2 = m20.L(str, u3);
                    }
                    if (L2) {
                        if (m20.L(ut3Var.f, tf3.b())) {
                            chatActivity.K = true;
                            du.d(82, null);
                        }
                        chatActivity.j0();
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        rv0Var.f();
                        chatActivity.Z().o.f0(0);
                    } else if (m20.L(str, tf3.c())) {
                        if (fl.I()) {
                            chatActivity.K = true;
                            du.d(82, null);
                        }
                        chatActivity.j0();
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        rv0Var.f();
                        chatActivity.Z().o.f0(0);
                    }
                }
                if (m20.L(ut3Var.f, tf3.a()) || m20.L(ut3Var.f, tf3.b())) {
                    chatActivity.J = true;
                }
                zf3.d(chatActivity, vl0.c, new gy(chatActivity, ut3Var, null), 2);
                rv0Var.f();
                chatActivity.g0();
                if (m20.L(ut3Var.f, tf3.c())) {
                    ArrayList arrayList3 = chatActivity.n;
                    ListIterator listIterator = arrayList3.listIterator(arrayList3.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            obj = listIterator.previous();
                            if (!((tt3) obj).j) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    tt3 tt3Var = (tt3) obj;
                    if (tt3Var != null) {
                        zf3.d(chatActivity, vl0.c, new hy(tt3Var, null), 2);
                    }
                }
                if (m20.L(ut3Var.f, tf3.c())) {
                    wt3 wt3Var = chatActivity.D;
                    boolean z3 = chatActivity.r;
                    bx bxVar = new bx();
                    if (wt3Var != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    bxVar.v(z2);
                    if (wt3Var != null) {
                        bxVar.z(wt3Var.f5071a);
                        bxVar.v(wt3Var.f5072b);
                        bxVar.y(wt3Var.c);
                        bxVar.z(wt3Var.d);
                        if (wt3Var.e != null) {
                            bxVar.y(r7.length);
                            for (ut3 ut3Var2 : wt3Var.e) {
                                if (ut3Var2 == null) {
                                    ut3Var2 = new ut3();
                                }
                                tf3.n(bxVar, ut3Var2);
                            }
                        } else {
                            bxVar.y(0L);
                        }
                        bxVar.z(wt3Var.f);
                    }
                    bxVar.v(z3);
                    du.d(53, bxVar);
                    tt3 tt3Var2 = new tt3();
                    tf3.o(bxVar, tt3Var2);
                    bxVar.h();
                    if (pd0.v(chatActivity).getLanguage().equals(new Locale("ar").getLanguage())) {
                        if (i23.q1(tt3Var2.c, "Sorry we are offline now, please get back after ", false)) {
                            List n1 = i23.n1(tt3Var2.c, new char[]{' '});
                            String str2 = (String) d20.L0(n1);
                            tt3Var2.c = pd0.y(R.string.FaqReplyTalkToHuman2) + " " + ((String) n1.get(n1.size() - 2)) + " " + pd0.A(str2);
                        } else {
                            tt3Var2.c = pd0.A(tt3Var2.c);
                        }
                    }
                    zf3.d(chatActivity, vl0.c, new iy(tt3Var2, null), 2);
                }
                return true;
            case 1:
                return false;
            default:
                if (ew3.X() && (!ew3.V() || i23.R0(((rb2) ((SpeedTestActivity) zoVar).n.get(K)).f4125a, "-N-", false))) {
                    if (K < 0) {
                        return false;
                    }
                    SpeedTestActivity speedTestActivity = (SpeedTestActivity) zoVar;
                    if (!m20.L(speedTestActivity.Z().m.getAdapter(), speedTestActivity.m)) {
                        return false;
                    }
                    boolean isSelected = speedTestActivity.Z().c.isSelected();
                    ArrayList arrayList4 = speedTestActivity.n;
                    if (isSelected) {
                        t9.u0(speedTestActivity, new q90(13, speedTestActivity, ((rb2) arrayList4.get(K)).f4125a));
                        return false;
                    }
                    tf3.x(speedTestActivity, ((rb2) arrayList4.get(K)).f4125a, new by2(speedTestActivity, i));
                    return false;
                }
                int i6 = SpeedTestActivity.u;
                r61 r61Var = new r61(((SpeedTestActivity) zoVar).c);
                r61Var.l(2);
                r61Var.show();
                return false;
        }
    }

    @Override // defpackage.qh2
    public final void onTouchEvent(MotionEvent motionEvent) {
    }
}
