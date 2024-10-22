package defpackage;

import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.livechat.ChatActivity;

/* loaded from: classes.dex */
public final class xv0 extends rh2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5231a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5232b;

    public /* synthetic */ xv0(Object obj, int i) {
        this.f5231a = i;
        this.f5232b = obj;
    }

    @Override // defpackage.rh2
    public final void b(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        boolean z2;
        int i3 = this.f5231a;
        Object obj = this.f5232b;
        switch (i3) {
            case 0:
                aw0 aw0Var = (aw0) obj;
                int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                int computeVerticalScrollRange = aw0Var.s.computeVerticalScrollRange();
                int i4 = aw0Var.r;
                int i5 = computeVerticalScrollRange - i4;
                int i6 = aw0Var.f349a;
                if (i5 > 0 && i4 >= i6) {
                    z = true;
                } else {
                    z = false;
                }
                aw0Var.t = z;
                int computeHorizontalScrollRange = aw0Var.s.computeHorizontalScrollRange();
                int i7 = aw0Var.q;
                if (computeHorizontalScrollRange - i7 > 0 && i7 >= i6) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                aw0Var.u = z2;
                boolean z3 = aw0Var.t;
                if (!z3 && !z2) {
                    if (aw0Var.v != 0) {
                        aw0Var.i(0);
                        return;
                    }
                    return;
                }
                if (z3) {
                    float f = i4;
                    aw0Var.l = (int) ((((f / 2.0f) + computeVerticalScrollOffset) * f) / computeVerticalScrollRange);
                    aw0Var.k = Math.min(i4, (i4 * i4) / computeVerticalScrollRange);
                }
                if (aw0Var.u) {
                    float f2 = computeHorizontalScrollOffset;
                    float f3 = i7;
                    aw0Var.o = (int) ((((f3 / 2.0f) + f2) * f3) / computeHorizontalScrollRange);
                    aw0Var.n = Math.min(i7, (i7 * i7) / computeHorizontalScrollRange);
                }
                int i8 = aw0Var.v;
                if (i8 == 0 || i8 == 1) {
                    aw0Var.i(1);
                    return;
                }
                return;
            default:
                if (i2 < 0) {
                    ChatActivity chatActivity = (ChatActivity) obj;
                    if (chatActivity.y) {
                        m20.v0(chatActivity.Z().k);
                        m20.u0(chatActivity.Z().o);
                        chatActivity.Z().e.setImageResource(R.drawable.ic_bot_command);
                    }
                }
                PopupWindow popupWindow = ((ChatActivity) obj).C;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                    return;
                }
                return;
        }
    }
}
