package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.security.xvpn.z35kb.XTextViewNew;
import com.security.xvpn.z35kb.widget.Toolbar;

/* loaded from: classes2.dex */
public abstract class q5 extends tl3 {
    public static final /* synthetic */ int z = 0;
    public final zl0 o;
    public final zl0 p;
    public final LinearLayout q;
    public final LinearLayout r;
    public final Toolbar s;
    public final TextView t;
    public final XTextViewNew u;
    public final XTextViewNew v;
    public Boolean w;
    public Integer x;
    public ut0 y;

    public q5(View view, zl0 zl0Var, zl0 zl0Var2, LinearLayout linearLayout, LinearLayout linearLayout2, Toolbar toolbar, TextView textView, XTextViewNew xTextViewNew, XTextViewNew xTextViewNew2) {
        super(null, view, 0);
        this.o = zl0Var;
        this.p = zl0Var2;
        this.q = linearLayout;
        this.r = linearLayout2;
        this.s = toolbar;
        this.t = textView;
        this.u = xTextViewNew;
        this.v = xTextViewNew2;
    }

    public abstract void o(Boolean bool);

    public abstract void p(Integer num);
}
