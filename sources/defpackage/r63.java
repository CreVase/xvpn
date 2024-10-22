package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* loaded from: classes2.dex */
public final class r63 extends bx3 {
    public final /* synthetic */ Context l;
    public final /* synthetic */ TextPaint m;
    public final /* synthetic */ bx3 n;
    public final /* synthetic */ s63 o;

    public r63(s63 s63Var, Context context, TextPaint textPaint, bx3 bx3Var) {
        this.o = s63Var;
        this.l = context;
        this.m = textPaint;
        this.n = bx3Var;
    }

    @Override // defpackage.bx3
    public final void P(int i) {
        this.n.P(i);
    }

    @Override // defpackage.bx3
    public final void Q(Typeface typeface, boolean z) {
        this.o.g(this.l, this.m, typeface);
        this.n.Q(typeface, z);
    }
}
