package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class lb extends e13 implements h93 {
    public ib p;
    public bx3 q;
    public int r = -1;
    public int s = -1;
    public boolean t;

    public lb(ib ibVar, Resources resources) {
        d(new ib(ibVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0263, code lost:            throw new org.xmlpull.v1.XmlPullParserException(r26.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x028b, code lost:            r4.onStateChange(r4.getState());     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0292, code lost:            return r4;     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0112, code lost:            if (r8 == null) goto L47;     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0114, code lost:            r8 = r26.next();     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0119, code lost:            if (r8 != 4) goto L121;     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011d, code lost:            if (r8 != 2) goto L109;     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0129, code lost:            if (r26.getName().equals("vector") == false) goto L55;     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012b, code lost:            r8 = new defpackage.tj3();        r8.inflate(r24, r26, r25, r7);     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0134, code lost:            r8 = defpackage.y20.a(r24, r26, r25, r7);     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0151, code lost:            throw new org.xmlpull.v1.XmlPullParserException(r26.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0152, code lost:            if (r8 == null) goto L111;     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0154, code lost:            r9 = r11.p;        r8 = r9.a(r8);        r9.H[r8] = r6;        r9.J.e(r8, java.lang.Integer.valueOf(r5));     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0181, code lost:            throw new org.xmlpull.v1.XmlPullParserException(r26.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0264 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0208  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.lb e(android.content.Context r22, android.content.res.Resources.Theme r23, android.content.res.Resources r24, android.util.AttributeSet r25, android.content.res.XmlResourceParser r26) {
        /*
            Method dump skipped, instructions count: 689
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lb.e(android.content.Context, android.content.res.Resources$Theme, android.content.res.Resources, android.util.AttributeSet, android.content.res.XmlResourceParser):lb");
    }

    @Override // defpackage.fn0
    public final void d(ib ibVar) {
        this.f2123a = ibVar;
        int i = this.g;
        if (i >= 0) {
            Drawable d = ibVar.d(i);
            this.c = d;
            if (d != null) {
                b(d);
            }
        }
        this.d = null;
        if (ibVar instanceof d13) {
            this.n = ibVar;
        }
        if (ibVar instanceof ib) {
            this.p = ibVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // defpackage.fn0, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        bx3 bx3Var = this.q;
        if (bx3Var != null) {
            bx3Var.b0();
            this.q = null;
            c(this.r);
            this.r = -1;
            this.s = -1;
        }
    }

    @Override // defpackage.e13, defpackage.fn0, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.t) {
            super.mutate();
            this.p.e();
            this.t = true;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0129  */
    @Override // defpackage.e13, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onStateChange(int[] r18) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lb.onStateChange(int[]):boolean");
    }

    @Override // defpackage.fn0, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        bx3 bx3Var = this.q;
        if (bx3Var != null && (visible || z2)) {
            if (z) {
                bx3Var.a0();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
