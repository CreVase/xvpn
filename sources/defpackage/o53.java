package defpackage;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class o53 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3606a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3607b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o53(int i, Object obj, Object obj2) {
        this.f3606a = i;
        this.f3607b = obj;
        this.c = obj2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        int i2 = this.f3606a;
        Object obj = this.c;
        Object obj2 = this.f3607b;
        switch (i2) {
            case 0:
                o11 o11Var = ((s53) obj2).l;
                if (o11Var != null) {
                    Object[] objArr = new Object[1];
                    String str = ((k53) obj).d;
                    if (str == null) {
                        str = "";
                    }
                    objArr[0] = str;
                    String z = pd0.z(R.string.CloseTab, objArr);
                    boolean z2 = false;
                    while (true) {
                        if (z.length() > 60) {
                            z = z.substring(0, 60).concat("\"");
                        }
                        TextView textView = o11Var.f;
                        if (textView.getPaint().measureText(z) > textView.getWidth()) {
                            if (!z2) {
                                z = z.substring(0, z.length() - 2).concat("...\"");
                                z2 = true;
                            } else {
                                z = z.substring(0, z.length() - 5).concat("...\"");
                            }
                        } else {
                            textView.setText(z);
                            if (textView.getViewTreeObserver().isAlive()) {
                                textView.getViewTreeObserver().removeOnPreDrawListener(this);
                            }
                        }
                    }
                }
                return false;
            default:
                p6 p6Var = (p6) obj2;
                int height = p6Var.C.getHeight();
                ScrollView scrollView = p6Var.C;
                int paddingTop = height - scrollView.getPaddingTop();
                AppCompatTextView appCompatTextView = p6Var.I;
                int height2 = appCompatTextView.getHeight();
                ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = null;
                }
                if (marginLayoutParams != null) {
                    i = marginLayoutParams.topMargin;
                } else {
                    i = 0;
                }
                int i3 = height2 + i;
                Space space = p6Var.D;
                int height3 = p6Var.J.getHeight() + space.getHeight() + i3;
                Space space2 = p6Var.E;
                int height4 = p6Var.A.getHeight() + space2.getHeight() + height3;
                Space space3 = p6Var.F;
                int height5 = p6Var.x.getHeight() + p6Var.y.getHeight() + space3.getHeight() + height4;
                Space space4 = p6Var.G;
                int height6 = paddingTop - (space4.getHeight() + height5);
                Drawable drawable = appCompatTextView.getCompoundDrawables()[1];
                if (height6 < 0 && drawable != null) {
                    appCompatTextView.setCompoundDrawables(null, null, null, null);
                } else {
                    if (height6 > tf3.J(70.0f)) {
                        height6 = tf3.J(70.0f);
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) space.getLayoutParams();
                    marginLayoutParams2.topMargin = t9.h0((height6 * 14) / 70.0f);
                    space.setLayoutParams(marginLayoutParams2);
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) space2.getLayoutParams();
                    marginLayoutParams3.topMargin = t9.h0((height6 * 29) / 70.0f);
                    space2.setLayoutParams(marginLayoutParams3);
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) space3.getLayoutParams();
                    marginLayoutParams4.topMargin = t9.h0((height6 * 12) / 70.0f);
                    space3.setLayoutParams(marginLayoutParams4);
                    ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) space4.getLayoutParams();
                    marginLayoutParams5.height = t9.h0((height6 * 10) / 70.0f);
                    space4.setLayoutParams(marginLayoutParams5);
                    ((kd2) obj).i = t9.h0((height6 * 5) / 70.0f) + tf3.K(10);
                    RecyclerView recyclerView = p6Var.B;
                    if (recyclerView.p.size() != 0) {
                        c cVar = recyclerView.n;
                        if (cVar != null) {
                            cVar.c("Cannot invalidate item decorations during a scroll or layout");
                        }
                        recyclerView.Q();
                        recyclerView.requestLayout();
                    }
                    if (scrollView.getViewTreeObserver().isAlive()) {
                        scrollView.getViewTreeObserver().removeOnPreDrawListener(this);
                    }
                }
                return false;
        }
    }
}
