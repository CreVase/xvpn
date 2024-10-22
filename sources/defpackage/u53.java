package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.h;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.browser.TabIndexView;

/* loaded from: classes2.dex */
public final class u53 extends h {
    public static final /* synthetic */ int B = 0;
    public final ImageView A;
    public final p53 u;
    public final Context v;
    public final TabIndexView w;
    public final ImageView x;
    public final TextView y;
    public final ImageView z;

    public u53(View view, p53 p53Var, v53 v53Var) {
        super(view);
        this.u = p53Var;
        this.v = view.getContext();
        TabIndexView tabIndexView = (TabIndexView) view.findViewById(R.id.vTab);
        this.w = tabIndexView;
        this.x = (ImageView) view.findViewById(R.id.vDelete);
        this.y = (TextView) view.findViewById(R.id.tvTitle);
        this.z = (ImageView) view.findViewById(R.id.ivLogo);
        this.A = (ImageView) view.findViewById(R.id.ivSnapshot);
        tabIndexView.setCallback(v53Var);
        float f = view.getResources().getDisplayMetrics().density;
    }
}
