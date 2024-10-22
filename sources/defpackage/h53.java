package defpackage;

import android.animation.LayoutTransition;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final /* synthetic */ class h53 implements ep1, fr, aw3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j53 f2370a;

    public /* synthetic */ h53(j53 j53Var) {
        this.f2370a = j53Var;
    }

    @Override // defpackage.fr
    public final void a(int i, String str) {
        j53 j53Var = this.f2370a;
        j53Var.getClass();
        boolean z = false;
        boolean z2 = true;
        switch (i) {
            case 1:
                j53Var.y = true;
                j53Var.m.reload();
                return;
            case 2:
                j53Var.m.stopLoading();
                j53Var.c.setShowProgress(false);
                return;
            case 3:
            case 4:
            case 5:
                j53Var.q = false;
                j53Var.y = true;
                j53Var.p = true;
                if (str != null && !str.trim().isEmpty()) {
                    if (i == 5) {
                        if (ya0.X(str)) {
                            str = ya0.Y(str);
                        } else {
                            str = ya0.P(str);
                        }
                    }
                    if (i == 3) {
                        str = ya0.Y(str);
                    }
                    j53Var.m.loadUrl(str);
                    j53Var.c.setUrl(str);
                    j53Var.c.setShowProgress(true);
                    j53Var.c.setWebProgress(0.1f);
                    j53Var.n.setVisibility(8);
                    j53Var.j.setVisibility(8);
                    j53Var.A = null;
                    return;
                }
                return;
            case 6:
                j53Var.n.setVisibility(0);
                j53Var.p = false;
                return;
            case 7:
                j53Var.j.setVisibility(8);
                if (j53Var.f.isEnabled()) {
                    j53Var.p = true;
                    j53Var.n.setVisibility(8);
                    j53Var.c.setUrl(j53Var.m.getUrl());
                    return;
                }
                return;
            case 8:
                j53Var.o.e(true, true, true);
                return;
            case 9:
                if (!TextUtils.isEmpty(str) && j53Var.c.G) {
                    j53Var.j.setVisibility(0);
                    if (str.contains(".") && !str.endsWith(".")) {
                        j53Var.l.setVisibility(0);
                        j53Var.k.setText(str);
                        j53Var.l.setText(str);
                        if (j53Var.k.getLayoutDirection() == 1) {
                            z = true;
                        }
                        if (ya0.X(str)) {
                            j53.j(j53Var.k, R.drawable.ic_browser_input_load, z);
                            j53.j(j53Var.l, R.drawable.ic_browser_input_search, z);
                            j53Var.k.setId(R.id.tv_input_expand_item_load);
                            j53Var.l.setId(R.id.tv_input_expand_item_search);
                            return;
                        }
                        j53.j(j53Var.k, R.drawable.ic_browser_input_search, z);
                        j53.j(j53Var.l, R.drawable.ic_browser_input_load, z);
                        j53Var.k.setId(R.id.tv_input_expand_item_search);
                        j53Var.l.setId(R.id.tv_input_expand_item_load);
                        return;
                    }
                    j53Var.k.setText(str);
                    TextView textView = j53Var.k;
                    if (textView.getLayoutDirection() != 1) {
                        z2 = false;
                    }
                    j53.j(textView, R.drawable.ic_browser_input_search, z2);
                    j53Var.k.setId(R.id.tv_input_expand_item_search);
                    j53Var.l.setVisibility(8);
                    j53Var.l.setId(0);
                    return;
                }
                j53Var.j.setVisibility(8);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.aw3
    public final void d(boolean z) {
        LayoutTransition layoutTransition;
        int i;
        j53 j53Var = this.f2370a;
        if (z != j53Var.r) {
            ViewGroup viewGroup = (ViewGroup) j53Var.o.getParent();
            if (z) {
                layoutTransition = new LayoutTransition();
            } else {
                layoutTransition = null;
            }
            viewGroup.setLayoutTransition(layoutTransition);
            j53Var.r = z;
            FrameLayout frameLayout = j53Var.i;
            if (z) {
                i = 0;
            } else {
                i = j53Var.v;
            }
            frameLayout.setPadding(0, 0, 0, i);
            j53Var.h.postDelayed(new e53(j53Var, 2), 0L);
        }
    }
}
