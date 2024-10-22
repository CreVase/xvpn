package defpackage;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class sq0 extends c02 {
    public final rq0 d;

    public sq0(TextView textView) {
        super(8);
        this.d = new rq0(textView);
    }

    @Override // defpackage.c02
    public final InputFilter[] h(InputFilter[] inputFilterArr) {
        boolean z;
        if (aq0.k != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return inputFilterArr;
        }
        return this.d.h(inputFilterArr);
    }

    @Override // defpackage.c02
    public final boolean j() {
        return this.d.f;
    }

    @Override // defpackage.c02
    public final void m(boolean z) {
        boolean z2;
        if (aq0.k != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return;
        }
        this.d.m(z);
    }

    @Override // defpackage.c02
    public final void n(boolean z) {
        boolean z2;
        if (aq0.k != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z3 = !z2;
        rq0 rq0Var = this.d;
        if (z3) {
            rq0Var.f = z;
        } else {
            rq0Var.n(z);
        }
    }

    @Override // defpackage.c02
    public final TransformationMethod o(TransformationMethod transformationMethod) {
        boolean z;
        if (aq0.k != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return transformationMethod;
        }
        return this.d.o(transformationMethod);
    }
}
