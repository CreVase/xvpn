package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class e00 extends View implements ke1, f83 {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f1867a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f1868b;
    public final TextPaint c;
    public final TextPaint d;
    public boolean e;
    public Drawable f;
    public final int g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;
    public final float o;
    public final Drawable p;
    public final Drawable q;
    public final Drawable r;
    public String s;
    public h t;
    public gc3 u;
    public d00 v;
    public boolean w;

    public e00(Context context) {
        super(context);
        this.f1868b = new RectF();
        this.g = tf3.K(24);
        float f = tf3.F;
        this.h = 13 * f;
        this.i = 37 * f;
        this.j = 30 * f;
        this.k = 64 * f;
        this.l = 20 * f;
        this.m = 15 * f;
        this.n = 10 * f;
        this.s = "";
        cp3.A(context);
        this.p = cp3.c;
        this.q = cp3.h;
        this.r = cp3.g;
        setLayoutParams(new ViewGroup.LayoutParams(-1, tf3.K(48)));
        Paint paint = new Paint(5);
        this.f1867a = paint;
        paint.setColor(v73.j(1000050));
        paint.setStrokeWidth((int) (bx3.z(context) * 1.5f));
        paint.setStyle(Paint.Style.STROKE);
        setLayoutParams(new ViewGroup.LayoutParams(-1, (int) (bx3.z(context) * 52)));
        TextPaint textPaint = new TextPaint(5);
        this.c = textPaint;
        float f2 = 14;
        textPaint.setTextSize((int) (bx3.z(context) * f2));
        textPaint.setColor(v73.j(1000048));
        TextPaint textPaint2 = new TextPaint(5);
        this.d = textPaint2;
        textPaint2.setTextSize((int) (bx3.z(context) * f2));
        textPaint2.setColor(-12166042);
        TextPaint textPaint3 = new TextPaint(5);
        textPaint3.setTextSize((int) (bx3.z(context) * 9));
        textPaint3.setColor(-14326);
        this.o = tf3.U(textPaint) + (getLayoutParams().height / 2.0f);
        setClickable(true);
        fl.k(this, this);
    }

    @Override // defpackage.ke1
    public final void a() {
        postInvalidate();
    }

    @Override // defpackage.f83
    public final void addThemeInvalidateListener(View view) {
        fl.j(view, this);
    }

    @Override // defpackage.f83
    public final void bindInvalidate(View view) {
        fl.j(view, this);
    }

    public final d00 getCallback() {
        return this.v;
    }

    public final h getHolder() {
        return this.t;
    }

    public final gc3 getServerNode() {
        return this.u;
    }

    @Override // defpackage.f83
    public a83 getThemeListeners() {
        return ((dn) getContext()).i;
    }

    @Override // defpackage.w73
    public final boolean h() {
        return true;
    }

    @Override // defpackage.f83
    public final void j(TextView textView, int i) {
        fl.n(this, textView, i);
    }

    @Override // defpackage.f83
    public final void k(pn0 pn0Var) {
        fl.i(this, pn0Var, true);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        zp2 zp2Var;
        Drawable drawable;
        float f;
        super.onDraw(canvas);
        float height = getHeight() / 2.0f;
        int j = v73.j(1000050);
        v73.j(1000051);
        int j2 = v73.j(1000052);
        gc3 gc3Var = this.u;
        if (gc3Var != null && (zp2Var = (zp2) gc3Var.d) != null) {
            canvas.drawColor(j);
            if (this.e && gc3Var.c) {
                canvas.drawColor(j2);
            }
            boolean z = this.e;
            Drawable drawable2 = this.p;
            if (z) {
                String str = this.s;
                TextPaint textPaint = this.d;
                canvas.drawText(str, this.m, (height - ((textPaint.getFontMetrics().descent - textPaint.getFontMetrics().ascent) / 2.0f)) - textPaint.getFontMetrics().ascent, textPaint);
                canvas.save();
                canvas.translate((getWidth() - this.n) - drawable2.getBounds().width(), height - drawable2.getBounds().centerY());
                if (gc3Var.c) {
                    canvas.rotate(90.0f, drawable2.getBounds().exactCenterX(), drawable2.getBounds().exactCenterY());
                }
                drawable2.draw(canvas);
                canvas.restore();
                return;
            }
            int i = zp2Var.k;
            float f2 = this.j;
            if ((i == 2 || gc3Var.b()) && (drawable = this.f) != null) {
                canvas.save();
                canvas.translate(f2, height - drawable.getBounds().centerY());
                drawable.draw(canvas);
                canvas.restore();
            }
            if (!gc3Var.a()) {
                canvas.save();
                if (zp2Var.k == 2) {
                    f = this.h;
                } else {
                    f = this.i;
                }
                canvas.translate(f, height - drawable2.getBounds().centerY());
                if (gc3Var.c) {
                    canvas.rotate(90.0f, drawable2.getBounds().exactCenterX(), drawable2.getBounds().exactCenterY());
                }
                drawable2.draw(canvas);
                canvas.restore();
            }
            TextPaint textPaint2 = this.c;
            textPaint2.setColor(v73.j(1000048));
            boolean L = m20.L(zp2Var.a(), "8ebagyhr8n");
            float f3 = this.o;
            if (L) {
                canvas.drawText(this.s, f2, f3, textPaint2);
            } else {
                canvas.drawText(this.s, this.k, f3, textPaint2);
            }
            int width = getWidth();
            Drawable drawable3 = this.q;
            int save = canvas.save();
            canvas.translate((width - drawable3.getIntrinsicWidth()) - this.l, height - (drawable3.getIntrinsicHeight() / 2.0f));
            try {
                if (!zp2Var.o) {
                    drawable3 = this.r;
                }
                drawable3.draw(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float strokeWidth = this.f1867a.getStrokeWidth() / 2.0f;
        this.f1868b.set(strokeWidth, strokeWidth, getMeasuredWidth() - strokeWidth, getMeasuredHeight() - strokeWidth);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int action = motionEvent.getAction();
        float f = this.k;
        boolean z3 = false;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        this.w = false;
                    }
                } else {
                    boolean z4 = this.w;
                    if (motionEvent.getX() < f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if ((!z2) & z4) {
                        this.w = false;
                    }
                }
            } else {
                boolean z5 = this.w;
                if (motionEvent.getX() < f) {
                    z = true;
                } else {
                    z = false;
                }
                if (z & z5) {
                    this.w = false;
                    gc3 gc3Var = this.u;
                    if (gc3Var != null) {
                        if (!gc3Var.a()) {
                            if (gc3Var.c) {
                                d00 d00Var = this.v;
                                if (d00Var != null) {
                                    c00 c00Var = (c00) d00Var;
                                    int e = this.t.e();
                                    if (e >= 0) {
                                        ArrayList arrayList = new ArrayList(c00Var.f);
                                        int D = c00Var.D(arrayList, (gc3) arrayList.get(e));
                                        RecyclerView recyclerView = (RecyclerView) c00Var.d.get();
                                        if (recyclerView != null) {
                                            recyclerView.l0();
                                        }
                                        c00Var.f = arrayList;
                                        c00Var.g(e);
                                        c00Var.f2091a.e(e + 1, D);
                                    }
                                }
                            } else {
                                d00 d00Var2 = this.v;
                                if (d00Var2 != null) {
                                    c00 c00Var2 = (c00) d00Var2;
                                    int e2 = this.t.e();
                                    if (e2 >= 0) {
                                        ArrayList arrayList2 = new ArrayList(c00Var2.f);
                                        gc3 gc3Var2 = (gc3) arrayList2.get(e2);
                                        if (((zp2) gc3Var2.d).k == 2) {
                                            z3 = true;
                                        }
                                        int E = c00Var2.E(arrayList2, gc3Var2, z3, e2);
                                        RecyclerView recyclerView2 = (RecyclerView) c00Var2.d.get();
                                        if (recyclerView2 != null) {
                                            recyclerView2.l0();
                                        }
                                        c00Var2.f = arrayList2;
                                        c00Var2.i(e2, new Object());
                                        c00Var2.l(e2 + 1, E);
                                    }
                                }
                            }
                        } else {
                            d00 d00Var3 = this.v;
                            if (d00Var3 != null) {
                                ((c00) d00Var3).F(this.t);
                            }
                        }
                    }
                    return true;
                }
                d00 d00Var4 = this.v;
                if (d00Var4 != null) {
                    ((c00) d00Var4).F(this.t);
                }
            }
        } else {
            if (motionEvent.getX() < f) {
                z3 = true;
            }
            if (z3) {
                this.w = true;
            }
        }
        return true;
    }

    @Override // defpackage.w73
    public final void p(boolean z) {
        getThemeListeners().b(z);
    }

    @Override // defpackage.f83
    public final void q(ke1 ke1Var) {
        fl.k(this, ke1Var);
    }

    @Override // defpackage.f83
    public final void r(View view, boolean z) {
        fl.i(this, view, z);
    }

    public final void setCallback(d00 d00Var) {
        this.v = d00Var;
    }

    public final void setHolder(h hVar) {
        this.t = hVar;
    }

    public final void setLeftBlockTouch(boolean z) {
        this.w = z;
    }

    public final void setServerNode(gc3 gc3Var) {
        zp2 zp2Var;
        zp2 zp2Var2;
        this.u = gc3Var;
        if (gc3Var != null && (zp2Var2 = (zp2) gc3Var.d) != null) {
            setContentDescription(zp2Var2.c());
        }
        gc3 gc3Var2 = this.u;
        if (gc3Var2 != null && (zp2Var = (zp2) gc3Var2.d) != null) {
            boolean z = false;
            if (zp2Var.b() > 0) {
                Drawable drawable = getResources().getDrawable(zp2Var.b());
                this.f = drawable;
                if (drawable != null) {
                    int i = this.g;
                    drawable.setBounds(0, 0, i, i);
                }
            } else {
                this.f = null;
            }
            if (zp2Var.k == 1) {
                z = true;
            }
            this.e = z;
            this.s = zp2Var.c();
        }
        cp3.A(getContext());
    }

    @Override // defpackage.f83
    public final void u(ke1 ke1Var) {
        fl.l(this, ke1Var, false);
    }

    @Override // defpackage.f83
    public final void x(View view) {
        fl.g(this, view, 1000008);
    }
}
