package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.XApplication;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class f82 extends qn {
    public static final /* synthetic */ int n = 0;
    public jy2 j;
    public final List k;
    public final GradientDrawable l;
    public final GradientDrawable m;

    public f82(lt3 lt3Var) {
        super(lt3Var, R.style.Theme_PrivacyPolicyDialog);
        int i = 1;
        d82 d82Var = new d82(pd0.y(R.string.PrivacySubTitle), 1);
        j73 k = bx3.k(false);
        j73 l = bx3.l(false);
        HashMap hashMap = d82Var.c;
        hashMap.put(k.f2717a, k.f2718b);
        hashMap.put(l.f2717a, l.f2718b);
        d82 d82Var2 = new d82(getContext().getString(R.string.PrivacyEndText), 2);
        j73 k2 = bx3.k(false);
        j73 l2 = bx3.l(false);
        HashMap hashMap2 = d82Var2.c;
        hashMap2.put(k2.f2717a, k2.f2718b);
        hashMap2.put(l2.f2717a, l2.f2718b);
        this.k = tf3.b0(new d82(pd0.y(R.string.PrivacyTitle), 0), d82Var, new d82(pd0.y(R.string.PrivacyPromiseTitle), 2), new d82(pd0.y(R.string.PrivacyPromiseItem0), 4), new d82(pd0.y(R.string.PrivacyPromiseItem1), 4), new d82(pd0.y(R.string.PrivacyPromiseItem2), 4), new d82(pd0.y(R.string.PrivacyCollectTitle), 2), new d82(pd0.y(R.string.PrivacyCollectItem1Title), 3), new d82(pd0.y(R.string.PrivacyCollectItem1Details), 4), new d82(pd0.y(R.string.PrivacyCollectItem1Details2), 4), new d82(pd0.y(R.string.PrivacyCollectItem1Details3), 4), new d82(pd0.y(R.string.PrivacyCollectItem2Title), 3), new d82(pd0.y(R.string.PrivacyCollectItem2Details), 4), d82Var2);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{v73.j(1000114), v73.j(1000115)});
        float f = 100;
        gradientDrawable.setCornerRadius(tf3.F * f);
        this.l = gradientDrawable;
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{v73.j(1000112), v73.j(1000113)});
        gradientDrawable2.setCornerRadius(tf3.F * f);
        this.m = gradientDrawable2;
        requestWindowFeature(1);
        e(1);
        getWindow().addFlags(1);
        jl0 jl0Var = new jl0(lt3Var);
        if (!XApplication.c) {
            jl0Var.setCornerRadius(8 * tf3.F);
        }
        fl.g(this, jl0Var, 1000003);
        View.inflate(lt3Var, R.layout.dialog_privacy_policy, jl0Var);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = tf3.K(10);
        layoutParams.bottomMargin = tf3.K(10);
        layoutParams.leftMargin = tf3.K(5);
        layoutParams.rightMargin = tf3.K(5);
        setContentView(jl0Var, layoutParams);
        setCanceledOnTouchOutside(false);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mList);
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(new rv0(this, lt3Var));
        if (XApplication.c) {
            GradientDrawable gradientDrawable3 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1648546, -1652686});
            gradientDrawable3.setCornerRadius(f * tf3.F);
            gradientDrawable3.setStroke(tf3.J(1.5f), -11153696);
            Button button = (Button) findViewById(R.id.btnAgree);
            if (button != null) {
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(ew3.q, gradientDrawable3);
                stateListDrawable.addState(ew3.o, gradientDrawable);
                stateListDrawable.addState(StateSet.WILD_CARD, gradientDrawable2);
                button.setBackground(stateListDrawable);
            }
        } else {
            Button button2 = (Button) findViewById(R.id.btnAgree);
            if (button2 != null) {
                button2.setBackground(v73.t(24 * tf3.F, 0.0f, 1000116));
                fl.n(this, button2, 1000117);
            }
        }
        Button button3 = (Button) findViewById(R.id.btnAgree);
        if (button3 != null) {
            button3.setOnClickListener(new q61(this, i));
        }
        setOnCancelListener(new c82(lt3Var, 2));
        Button button4 = (Button) findViewById(R.id.btnAgree);
        if (button4 != null) {
            button4.requestFocus();
        }
    }

    @Override // defpackage.qn
    public final String f() {
        return "PrivacyPolicyDialog";
    }

    @Override // defpackage.qn, defpackage.w73
    public final void p(boolean z) {
        this.l.setColors(new int[]{v73.j(1000114), v73.j(1000115)});
        this.m.setColors(new int[]{v73.j(1000112), v73.j(1000113)});
        super.p(z);
    }
}
