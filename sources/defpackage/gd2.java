package defpackage;

import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ObservableInt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.security.xvpn.z35kb.R;
import defpackage.n01;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class gd2 extends fh2 {
    public final ObservableInt d;
    public final f83 e;
    public final ArrayList f = new ArrayList();
    public jd2 g;

    public gd2(ObservableInt observableInt, f83 f83Var) {
        this.d = observableInt;
        this.e = f83Var;
    }

    @Override // defpackage.fh2
    public final int c() {
        ArrayList arrayList = this.f;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // defpackage.fh2
    public final void n(h hVar, int i) {
        boolean z;
        int i2;
        int i3;
        int i4;
        z82 z82Var = (z82) this.f.get(i);
        w30 w30Var = ((fd2) hVar).u;
        ConstraintLayout constraintLayout = (ConstraintLayout) w30Var.e;
        if (this.d.f203b == i) {
            z = true;
        } else {
            z = false;
        }
        constraintLayout.setSelected(z);
        w30Var.c.setText(z82Var.c);
        if (!z82Var.h) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        w30Var.f4933b.setVisibility(i2);
        long j = z82Var.d;
        View view = w30Var.d;
        if (j == 0) {
            if (!z82Var.h) {
                i4 = R.string.StartGuidePriceYearlyNF;
            } else {
                i4 = R.string.StartGuidePriceMonthlyNF;
            }
            ((TextView) view).setText(pd0.z(i4, hx2.p("$", z82Var.f)));
            return;
        }
        if (!z82Var.h) {
            i3 = R.string.StartGuidePriceYearly;
        } else {
            i3 = R.string.StartGuidePriceMonthly;
        }
        SpannableString spannableString = new SpannableString(pd0.z(i3, hx2.p("$", z82Var.f)));
        bx3.i(spannableString, pd0.y(R.string.StartGuideFreeTryHighlight), new ForegroundColorSpan() { // from class: com.security.xvpn.z35kb.purchase.PurchaseCommodityVerticalAdapter$onBindViewHolder$1
            @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setTypeface(n01.c());
            }
        });
        ((TextView) view).setText(spannableString);
    }

    @Override // defpackage.fh2
    public final h s(RecyclerView recyclerView, int i) {
        View inflate = LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.item_purchase_commodity, (ViewGroup) recyclerView, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        int i2 = R.id.tvBestValue;
        TextView textView = (TextView) m20.g0(inflate, R.id.tvBestValue);
        if (textView != null) {
            i2 = R.id.tvYearlyName;
            TextView textView2 = (TextView) m20.g0(inflate, R.id.tvYearlyName);
            if (textView2 != null) {
                i2 = R.id.tvYearlyPrice;
                TextView textView3 = (TextView) m20.g0(inflate, R.id.tvYearlyPrice);
                if (textView3 != null) {
                    return new fd2(new w30(constraintLayout, constraintLayout, textView, textView2, textView3, 1), this.g, this.e);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }
}
