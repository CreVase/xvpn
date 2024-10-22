package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class pq1 extends ArrayAdapter {

    /* renamed from: a, reason: collision with root package name */
    public ColorStateList f3898a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f3899b;
    public final /* synthetic */ qq1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq1(qq1 qq1Var, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.c = qq1Var;
        a();
    }

    public final void a() {
        boolean z;
        ColorStateList colorStateList;
        boolean z2;
        boolean z3;
        qq1 qq1Var = this.c;
        ColorStateList colorStateList2 = qq1Var.l;
        if (colorStateList2 != null) {
            z = true;
        } else {
            z = false;
        }
        ColorStateList colorStateList3 = null;
        if (!z) {
            colorStateList = null;
        } else {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        }
        this.f3899b = colorStateList;
        if (qq1Var.k != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (qq1Var.l != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                int[] iArr2 = {R.attr.state_hovered, -16842919};
                int[] iArr3 = {R.attr.state_selected, -16842919};
                colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{h20.b(qq1Var.l.getColorForState(iArr3, 0), qq1Var.k), h20.b(qq1Var.l.getColorForState(iArr2, 0), qq1Var.k), qq1Var.k});
            }
        }
        this.f3898a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z;
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            qq1 qq1Var = this.c;
            Drawable drawable = null;
            if (qq1Var.getText().toString().contentEquals(textView.getText())) {
                if (qq1Var.k != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    ColorDrawable colorDrawable = new ColorDrawable(qq1Var.k);
                    if (this.f3899b != null) {
                        bn0.h(colorDrawable, this.f3898a);
                        drawable = new RippleDrawable(this.f3899b, colorDrawable, null);
                    } else {
                        drawable = colorDrawable;
                    }
                }
            }
            WeakHashMap weakHashMap = ll3.f3151a;
            uk3.q(textView, drawable);
        }
        return view2;
    }
}
