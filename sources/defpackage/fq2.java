package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.h;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class fq2 extends du3 {
    public boolean A;
    public boolean B;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f2135b;
    public boolean c;
    public boolean d;
    public final Drawable e;
    public final Drawable f;
    public final Drawable g;
    public final Drawable h;
    public Drawable i;
    public final int j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;
    public final float o;
    public final float p;
    public final hu3 q;
    public final hu3 r;
    public String s;
    public h t;
    public gc3 u;
    public eq2 v;
    public final int w;
    public final int x;
    public final int y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fq2(Context context) {
        super(context, null, 6, 0);
        FrameLayout.LayoutParams layoutParams;
        final int i = 0;
        this.s = "";
        this.w = v73.j(1000050);
        this.x = v73.j(1000051);
        this.y = v73.j(1000052);
        setWillNotDraw(false);
        this.j = (int) (bx3.z(context) * 24);
        this.k = (int) (bx3.z(context) * 13);
        this.l = (int) (bx3.z(context) * 37);
        this.m = (int) (bx3.z(context) * 30);
        float z = (int) (bx3.z(context) * 64);
        this.n = z;
        float z2 = (int) (bx3.z(context) * 20);
        this.p = z2;
        bx3.z(context);
        bx3.z(context);
        hu3 hu3Var = new hu3(getContext());
        ViewGroup.LayoutParams layoutParams2 = hu3Var.getLayoutParams();
        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
            layoutParams = (FrameLayout.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        layoutParams = layoutParams == null ? new FrameLayout.LayoutParams(-2, -2) : layoutParams;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.gravity = Math.max(-1, layoutParams.gravity);
        layoutParams.setMarginStart(Math.max(-1, layoutParams.leftMargin));
        layoutParams.topMargin = Math.max(-1, layoutParams.topMargin);
        layoutParams.setMarginEnd(Math.max(-1, layoutParams.rightMargin));
        layoutParams.bottomMargin = Math.max(-1, layoutParams.bottomMargin);
        layoutParams.width = (int) z;
        layoutParams.height = -1;
        hu3Var.setLayoutParams(layoutParams);
        hu3Var.setOnClickListener(new View.OnClickListener(this) { // from class: dq2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ fq2 f1822b;

            {
                this.f1822b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jq2 jq2Var;
                zp2 zp2Var;
                int i2;
                eq2 eq2Var;
                jq2 jq2Var2;
                int i3 = i;
                fq2 fq2Var = this.f1822b;
                switch (i3) {
                    case 0:
                        gc3 gc3Var = fq2Var.u;
                        if (gc3Var != null) {
                            if (gc3Var.c) {
                                eq2 eq2Var2 = fq2Var.v;
                                if (eq2Var2 != null) {
                                    ((lq2) eq2Var2).D(fq2Var.t);
                                    return;
                                }
                                return;
                            }
                            eq2 eq2Var3 = fq2Var.v;
                            if (eq2Var3 != null) {
                                ((lq2) eq2Var3).E(fq2Var.t);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        gc3 gc3Var2 = fq2Var.u;
                        if (gc3Var2 != null && (zp2Var = (zp2) gc3Var2.d) != null) {
                            boolean z3 = true;
                            boolean z4 = !zp2Var.h;
                            zp2Var.h = z4;
                            if (z4) {
                                i2 = R.string.cancelCollectLocation;
                            } else {
                                i2 = R.string.collectLocation;
                            }
                            view.setContentDescription(pd0.z(i2, fq2Var.s));
                            fq2Var.postInvalidateOnAnimation();
                            int i4 = zp2Var.n;
                            if (i4 != 1 && i4 != 2 && i4 != 3) {
                                z3 = false;
                            }
                            if (z3 && (eq2Var = fq2Var.v) != null && (jq2Var2 = ((lq2) eq2Var).g) != null) {
                                zp2 zp2Var2 = (zp2) fq2Var.getServerNode().d;
                                hq2 hq2Var = (hq2) jq2Var2;
                                int i5 = hq2Var.f2469a;
                                sn snVar = hq2Var.f2470b;
                                switch (i5) {
                                    case 0:
                                        ((iq2) snVar).i.j(zp2Var2);
                                        return;
                                    default:
                                        ey1 ey1Var = ((sq2) snVar).f;
                                        if (ey1Var == null) {
                                            ey1Var = null;
                                        }
                                        ey1Var.j(zp2Var2);
                                        return;
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        eq2 eq2Var4 = fq2Var.v;
                        if (eq2Var4 != null && (jq2Var = ((lq2) eq2Var4).g) != null) {
                            ((hq2) jq2Var).a((zp2) fq2Var.getServerNode().d);
                            return;
                        }
                        return;
                }
            }
        });
        addView(hu3Var);
        this.q = hu3Var;
        hu3 hu3Var2 = new hu3(getContext());
        ViewGroup.LayoutParams layoutParams3 = hu3Var2.getLayoutParams();
        FrameLayout.LayoutParams layoutParams4 = layoutParams3 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams3 : null;
        layoutParams4 = layoutParams4 == null ? new FrameLayout.LayoutParams(-2, -2) : layoutParams4;
        layoutParams4.width = -2;
        layoutParams4.height = -2;
        layoutParams4.gravity = Math.max(-1, layoutParams4.gravity);
        layoutParams4.setMarginStart(Math.max(-1, layoutParams4.leftMargin));
        layoutParams4.topMargin = Math.max(-1, layoutParams4.topMargin);
        layoutParams4.setMarginEnd(Math.max(-1, layoutParams4.rightMargin));
        layoutParams4.bottomMargin = Math.max(-1, layoutParams4.bottomMargin);
        layoutParams4.width = (int) (z2 * 3);
        layoutParams4.height = -1;
        layoutParams4.gravity = 8388613;
        hu3Var2.setLayoutParams(layoutParams4);
        final int i2 = 1;
        hu3Var2.setOnClickListener(new View.OnClickListener(this) { // from class: dq2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ fq2 f1822b;

            {
                this.f1822b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jq2 jq2Var;
                zp2 zp2Var;
                int i22;
                eq2 eq2Var;
                jq2 jq2Var2;
                int i3 = i2;
                fq2 fq2Var = this.f1822b;
                switch (i3) {
                    case 0:
                        gc3 gc3Var = fq2Var.u;
                        if (gc3Var != null) {
                            if (gc3Var.c) {
                                eq2 eq2Var2 = fq2Var.v;
                                if (eq2Var2 != null) {
                                    ((lq2) eq2Var2).D(fq2Var.t);
                                    return;
                                }
                                return;
                            }
                            eq2 eq2Var3 = fq2Var.v;
                            if (eq2Var3 != null) {
                                ((lq2) eq2Var3).E(fq2Var.t);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        gc3 gc3Var2 = fq2Var.u;
                        if (gc3Var2 != null && (zp2Var = (zp2) gc3Var2.d) != null) {
                            boolean z3 = true;
                            boolean z4 = !zp2Var.h;
                            zp2Var.h = z4;
                            if (z4) {
                                i22 = R.string.cancelCollectLocation;
                            } else {
                                i22 = R.string.collectLocation;
                            }
                            view.setContentDescription(pd0.z(i22, fq2Var.s));
                            fq2Var.postInvalidateOnAnimation();
                            int i4 = zp2Var.n;
                            if (i4 != 1 && i4 != 2 && i4 != 3) {
                                z3 = false;
                            }
                            if (z3 && (eq2Var = fq2Var.v) != null && (jq2Var2 = ((lq2) eq2Var).g) != null) {
                                zp2 zp2Var2 = (zp2) fq2Var.getServerNode().d;
                                hq2 hq2Var = (hq2) jq2Var2;
                                int i5 = hq2Var.f2469a;
                                sn snVar = hq2Var.f2470b;
                                switch (i5) {
                                    case 0:
                                        ((iq2) snVar).i.j(zp2Var2);
                                        return;
                                    default:
                                        ey1 ey1Var = ((sq2) snVar).f;
                                        if (ey1Var == null) {
                                            ey1Var = null;
                                        }
                                        ey1Var.j(zp2Var2);
                                        return;
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        eq2 eq2Var4 = fq2Var.v;
                        if (eq2Var4 != null && (jq2Var = ((lq2) eq2Var4).g) != null) {
                            ((hq2) jq2Var).a((zp2) fq2Var.getServerNode().d);
                            return;
                        }
                        return;
                }
            }
        });
        addView(hu3Var2);
        this.r = hu3Var2;
        if (cp3.c == null) {
            cp3.A(context);
        }
        this.e = cp3.c;
        this.f = cp3.f;
        this.g = cp3.d;
        this.h = cp3.e;
        setLayoutParams(new ViewGroup.LayoutParams(-1, (int) (bx3.z(context) * 52)));
        TextPaint textPaint = new TextPaint(5);
        this.f2135b = textPaint;
        float f = 14;
        textPaint.setTextSize((int) (bx3.z(context) * f));
        textPaint.setColor(v73.j(1000048));
        TextPaint textPaint2 = new TextPaint(5);
        textPaint2.setTextSize((int) (bx3.z(context) * f));
        textPaint2.setColor(v73.j(1000048));
        this.o = tf3.U(textPaint) + (getLayoutParams().height / 2.0f);
        setClickable(true);
        final int i3 = 2;
        setOnClickListener(new View.OnClickListener(this) { // from class: dq2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ fq2 f1822b;

            {
                this.f1822b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jq2 jq2Var;
                zp2 zp2Var;
                int i22;
                eq2 eq2Var;
                jq2 jq2Var2;
                int i32 = i3;
                fq2 fq2Var = this.f1822b;
                switch (i32) {
                    case 0:
                        gc3 gc3Var = fq2Var.u;
                        if (gc3Var != null) {
                            if (gc3Var.c) {
                                eq2 eq2Var2 = fq2Var.v;
                                if (eq2Var2 != null) {
                                    ((lq2) eq2Var2).D(fq2Var.t);
                                    return;
                                }
                                return;
                            }
                            eq2 eq2Var3 = fq2Var.v;
                            if (eq2Var3 != null) {
                                ((lq2) eq2Var3).E(fq2Var.t);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        gc3 gc3Var2 = fq2Var.u;
                        if (gc3Var2 != null && (zp2Var = (zp2) gc3Var2.d) != null) {
                            boolean z3 = true;
                            boolean z4 = !zp2Var.h;
                            zp2Var.h = z4;
                            if (z4) {
                                i22 = R.string.cancelCollectLocation;
                            } else {
                                i22 = R.string.collectLocation;
                            }
                            view.setContentDescription(pd0.z(i22, fq2Var.s));
                            fq2Var.postInvalidateOnAnimation();
                            int i4 = zp2Var.n;
                            if (i4 != 1 && i4 != 2 && i4 != 3) {
                                z3 = false;
                            }
                            if (z3 && (eq2Var = fq2Var.v) != null && (jq2Var2 = ((lq2) eq2Var).g) != null) {
                                zp2 zp2Var2 = (zp2) fq2Var.getServerNode().d;
                                hq2 hq2Var = (hq2) jq2Var2;
                                int i5 = hq2Var.f2469a;
                                sn snVar = hq2Var.f2470b;
                                switch (i5) {
                                    case 0:
                                        ((iq2) snVar).i.j(zp2Var2);
                                        return;
                                    default:
                                        ey1 ey1Var = ((sq2) snVar).f;
                                        if (ey1Var == null) {
                                            ey1Var = null;
                                        }
                                        ey1Var.j(zp2Var2);
                                        return;
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        eq2 eq2Var4 = fq2Var.v;
                        if (eq2Var4 != null && (jq2Var = ((lq2) eq2Var4).g) != null) {
                            ((hq2) jq2Var).a((zp2) fq2Var.getServerNode().d);
                            return;
                        }
                        return;
                }
            }
        });
    }

    public final boolean b(MotionEvent motionEvent) {
        zp2 zp2Var;
        boolean z;
        gc3 gc3Var = this.u;
        boolean z2 = false;
        if (gc3Var == null || (zp2Var = (zp2) gc3Var.d) == null) {
            return false;
        }
        int i = zp2Var.n;
        if (i != 1 && i != 2 && i != 3) {
            z = false;
        } else {
            z = true;
        }
        boolean z3 = (!zp2Var.d()) & z;
        if (motionEvent.getX() > getWidth() - (this.p * 3)) {
            z2 = true;
        }
        return z3 & z2;
    }

    public final eq2 getCallback() {
        return this.v;
    }

    public final h getHolder() {
        return this.t;
    }

    public final int getItemColor() {
        return this.w;
    }

    public final int getItemPressedColor() {
        return this.x;
    }

    public final int getItemSelectedColor() {
        return this.y;
    }

    public final gc3 getServerNode() {
        return this.u;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        zp2 zp2Var;
        boolean z;
        boolean z2;
        Drawable drawable;
        float f;
        float f2;
        float f3;
        super.onDraw(canvas);
        float height = getHeight() / 2.0f;
        getWidth();
        boolean R = zf3.R();
        float f4 = this.m;
        if (R) {
            f4 = (getWidth() - f4) - this.j;
        }
        gc3 gc3Var = this.u;
        if (gc3Var != null && (zp2Var = (zp2) gc3Var.d) != null) {
            canvas.drawColor(v73.j(1000050));
            int i = 1000051;
            if (this.d) {
                canvas.drawColor(v73.j(1000051));
            }
            if (this.c | isPressed()) {
                if (this.d) {
                    i = 1000106;
                }
                canvas.drawColor(v73.j(i));
            }
            boolean z3 = true;
            if (zp2Var.k != 2 && !gc3Var.b()) {
                z = false;
            } else {
                z = true;
            }
            if (!z && zp2Var.k == 3 && this.i != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            float f5 = this.n;
            if (z) {
                Drawable drawable2 = this.i;
                if (drawable2 != null) {
                    canvas.save();
                    canvas.translate(f4, height - drawable2.getBounds().centerY());
                    drawable2.draw(canvas);
                    canvas.restore();
                }
            } else if (z2 && (drawable = this.i) != null) {
                float J = (f5 - tf3.J(16.0f)) - tf3.J(8.0f);
                if (zf3.R()) {
                    J = tf3.J(8.0f) + (getWidth() - f5);
                }
                drawable.setBounds(0, 0, tf3.J(16.0f), tf3.J(16.0f));
                canvas.save();
                canvas.translate(J, height - drawable.getBounds().centerY());
                drawable.draw(canvas);
                canvas.restore();
            }
            if (!gc3Var.a()) {
                canvas.save();
                if (z2) {
                    f = f5 - tf3.J(40.0f);
                } else if (zp2Var.k == 2) {
                    f = this.k;
                } else {
                    f = this.l;
                }
                boolean Y = tf3.Y(this);
                Drawable drawable3 = this.e;
                if (Y) {
                    f = (getWidth() - f) - drawable3.getBounds().width();
                    f2 = 180.0f;
                    f3 = -90.0f;
                } else {
                    f2 = 0.0f;
                    f3 = 90.0f;
                }
                canvas.translate(f, height - drawable3.getBounds().centerY());
                canvas.rotate(f2, drawable3.getBounds().exactCenterX(), drawable3.getBounds().exactCenterY());
                if (gc3Var.c) {
                    canvas.rotate(f3, drawable3.getBounds().exactCenterX(), drawable3.getBounds().exactCenterY());
                }
                drawable3.draw(canvas);
                canvas.restore();
            }
            TextPaint textPaint = this.f2135b;
            textPaint.setColor(v73.j(1000048));
            if (tf3.Y(this)) {
                f5 = (getWidth() - f5) - textPaint.measureText(this.s);
            }
            canvas.drawText(this.s, f5, this.o, textPaint);
            int i2 = zp2Var.n;
            if (i2 != 1 && i2 != 2 && i2 != 3) {
                z3 = false;
            }
            if (z3) {
                canvas.save();
                float width = getWidth();
                float f6 = this.p;
                Drawable drawable4 = this.f;
                float intrinsicWidth = (width - f6) - drawable4.getIntrinsicWidth();
                if (!tf3.Y(this)) {
                    f6 = intrinsicWidth;
                }
                canvas.translate(f6, height - (drawable4.getIntrinsicHeight() / 2.0f));
                if (!zp2Var.d()) {
                    if (zp2Var.h) {
                        drawable4 = this.h;
                    } else {
                        drawable4 = this.g;
                    }
                }
                drawable4.draw(canvas);
                canvas.restore();
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        jq2 jq2Var;
        boolean z2;
        int action = motionEvent.getAction();
        float f = this.n;
        boolean z3 = false;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        this.c = false;
                        this.z = false;
                        this.A = false;
                        this.B = false;
                    }
                } else {
                    boolean z4 = this.z;
                    if (motionEvent.getX() < f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z4 & (!z2)) {
                        this.z = false;
                        return true;
                    }
                    if ((!b(motionEvent)) & this.A) {
                        this.A = false;
                        return true;
                    }
                }
            } else {
                this.c = false;
                boolean z5 = this.z;
                if (motionEvent.getX() < f) {
                    z = true;
                } else {
                    z = false;
                }
                if (z5 & z) {
                    this.z = false;
                    return true;
                }
                if (b(motionEvent) & this.A) {
                    return true;
                }
                if (this.B) {
                    this.B = false;
                    gc3 gc3Var = this.u;
                    if (gc3Var != null) {
                        if (gc3Var.c) {
                            eq2 eq2Var = this.v;
                            if (eq2Var != null) {
                                ((lq2) eq2Var).D(this.t);
                            }
                        } else {
                            eq2 eq2Var2 = this.v;
                            if (eq2Var2 != null) {
                                ((lq2) eq2Var2).E(this.t);
                            }
                        }
                    }
                } else {
                    eq2 eq2Var3 = this.v;
                    if (eq2Var3 != null && (jq2Var = ((lq2) eq2Var3).g) != null) {
                        ((hq2) jq2Var).a((zp2) getServerNode().d);
                    }
                }
            }
        } else {
            this.c = true;
            if (motionEvent.getX() < f) {
                z3 = true;
            }
            if (z3) {
                this.z = true;
                return true;
            }
            if (b(motionEvent)) {
                this.A = true;
                return true;
            }
        }
        invalidate();
        return true;
    }

    public final void setCallback(eq2 eq2Var) {
        this.v = eq2Var;
    }

    public final void setContinentTouch(boolean z) {
        this.B = z;
    }

    public final void setHolder(h hVar) {
        this.t = hVar;
    }

    public final void setLeftBlockTouch(boolean z) {
        this.z = z;
    }

    public final void setRightBlockTouch(boolean z) {
        this.A = z;
    }

    public final void setServerNode(gc3 gc3Var) {
        zp2 zp2Var;
        boolean z;
        int i;
        int i2;
        int i3;
        gc3 gc3Var2;
        this.u = gc3Var;
        if (gc3Var != null && (zp2Var = (zp2) gc3Var.d) != null) {
            Drawable drawable = getResources().getDrawable(zp2Var.b());
            this.i = drawable;
            if (drawable != null) {
                int i4 = this.j;
                drawable.setBounds(0, 0, i4, i4);
            }
            if (zp2Var.k > 4 && (gc3Var2 = gc3Var.f2234a) != null && gc3Var2.c) {
                z = true;
            } else {
                z = false;
            }
            this.d = z;
            this.s = zp2Var.c();
            int i5 = 8;
            if (!gc3Var.a()) {
                i = 0;
            } else {
                i = 8;
            }
            hu3 hu3Var = this.q;
            hu3Var.setVisibility(i);
            if (!zp2Var.d()) {
                i5 = 0;
            }
            hu3 hu3Var2 = this.r;
            hu3Var2.setVisibility(i5);
            if (gc3Var.c) {
                i2 = R.string.collapseLocation;
            } else {
                i2 = R.string.expandLocation;
            }
            hu3Var.setContentDescription(pd0.z(i2, this.s));
            if (zp2Var.h) {
                i3 = R.string.cancelCollectLocation;
            } else {
                i3 = R.string.collectLocation;
            }
            hu3Var2.setContentDescription(pd0.z(i3, this.s));
            setContentDescription(this.s);
        }
        if (cp3.c == null) {
            cp3.A(getContext());
        }
    }
}
