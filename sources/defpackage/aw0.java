package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class aw0 extends mh2 implements qh2 {
    public static final int[] C = {R.attr.state_pressed};
    public static final int[] D = new int[0];
    public int A;
    public final wv0 B;

    /* renamed from: a, reason: collision with root package name */
    public final int f349a;

    /* renamed from: b, reason: collision with root package name */
    public final int f350b;
    public final StateListDrawable c;
    public final Drawable d;
    public final int e;
    public final int f;
    public final StateListDrawable g;
    public final Drawable h;
    public final int i;
    public final int j;
    public int k;
    public int l;
    public float m;
    public int n;
    public int o;
    public float p;
    public RecyclerView s;
    public final ValueAnimator z;
    public int q = 0;
    public int r = 0;
    public boolean t = false;
    public boolean u = false;
    public int v = 0;
    public int w = 0;
    public final int[] x = new int[2];
    public final int[] y = new int[2];

    public aw0(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.z = ofFloat;
        this.A = 0;
        wv0 wv0Var = new wv0(this, 0);
        this.B = wv0Var;
        xv0 xv0Var = new xv0(this, 0 == true ? 1 : 0);
        this.c = stateListDrawable;
        this.d = drawable;
        this.g = stateListDrawable2;
        this.h = drawable2;
        this.e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f349a = i2;
        this.f350b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new yv0(this));
        ofFloat.addUpdateListener(new zv0(this));
        RecyclerView recyclerView2 = this.s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                c cVar = recyclerView2.n;
                if (cVar != null) {
                    cVar.c("Cannot remove item decoration during a scroll  or layout");
                }
                ArrayList arrayList = recyclerView2.p;
                arrayList.remove(this);
                if (arrayList.isEmpty()) {
                    recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
                }
                recyclerView2.Q();
                recyclerView2.requestLayout();
                RecyclerView recyclerView3 = this.s;
                recyclerView3.q.remove(this);
                if (recyclerView3.r == this) {
                    recyclerView3.r = null;
                }
                ArrayList arrayList2 = this.s.u0;
                if (arrayList2 != null) {
                    arrayList2.remove(xv0Var);
                }
                this.s.removeCallbacks(wv0Var);
            }
            this.s = recyclerView;
            if (recyclerView != null) {
                recyclerView.i(this);
                this.s.q.add(this);
                this.s.j(xv0Var);
            }
        }
    }

    @Override // defpackage.qh2
    public final void a() {
    }

    @Override // defpackage.qh2
    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.v;
        if (i == 1) {
            boolean g = g(motionEvent.getX(), motionEvent.getY());
            boolean f = f(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (g || f)) {
                if (f) {
                    this.w = 1;
                    this.p = (int) motionEvent.getX();
                } else if (g) {
                    this.w = 2;
                    this.m = (int) motionEvent.getY();
                }
                i(2);
                return true;
            }
        } else if (i == 2) {
            return true;
        }
        return false;
    }

    @Override // defpackage.mh2
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        if (this.q == this.s.getWidth() && this.r == this.s.getHeight()) {
            if (this.A != 0) {
                if (this.t) {
                    int i = this.q;
                    int i2 = this.e;
                    int i3 = i - i2;
                    int i4 = this.l;
                    int i5 = this.k;
                    int i6 = i4 - (i5 / 2);
                    StateListDrawable stateListDrawable = this.c;
                    stateListDrawable.setBounds(0, 0, i2, i5);
                    int i7 = this.r;
                    int i8 = this.f;
                    Drawable drawable = this.d;
                    drawable.setBounds(0, 0, i8, i7);
                    RecyclerView recyclerView2 = this.s;
                    WeakHashMap weakHashMap = ll3.f3151a;
                    boolean z = true;
                    if (vk3.d(recyclerView2) != 1) {
                        z = false;
                    }
                    if (z) {
                        drawable.draw(canvas);
                        canvas.translate(i2, i6);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(-1.0f, 1.0f);
                        canvas.translate(-i2, -i6);
                    } else {
                        canvas.translate(i3, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, i6);
                        stateListDrawable.draw(canvas);
                        canvas.translate(-i3, -i6);
                    }
                }
                if (this.u) {
                    int i9 = this.r;
                    int i10 = this.i;
                    int i11 = i9 - i10;
                    int i12 = this.o;
                    int i13 = this.n;
                    int i14 = i12 - (i13 / 2);
                    StateListDrawable stateListDrawable2 = this.g;
                    stateListDrawable2.setBounds(0, 0, i13, i10);
                    int i15 = this.q;
                    int i16 = this.j;
                    Drawable drawable2 = this.h;
                    drawable2.setBounds(0, 0, i15, i16);
                    canvas.translate(0.0f, i11);
                    drawable2.draw(canvas);
                    canvas.translate(i14, 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-i14, -i11);
                    return;
                }
                return;
            }
            return;
        }
        this.q = this.s.getWidth();
        this.r = this.s.getHeight();
        i(0);
    }

    public final boolean f(float f, float f2) {
        if (f2 >= this.r - this.i) {
            int i = this.o;
            int i2 = this.n;
            if (f >= i - (i2 / 2) && f <= (i2 / 2) + i) {
                return true;
            }
        }
        return false;
    }

    public final boolean g(float f, float f2) {
        boolean z;
        RecyclerView recyclerView = this.s;
        WeakHashMap weakHashMap = ll3.f3151a;
        if (vk3.d(recyclerView) == 1) {
            z = true;
        } else {
            z = false;
        }
        int i = this.e;
        if (z) {
            if (f > i) {
                return false;
            }
        } else if (f < this.q - i) {
            return false;
        }
        int i2 = this.l;
        int i3 = this.k / 2;
        if (f2 < i2 - i3 || f2 > i3 + i2) {
            return false;
        }
        return true;
    }

    public final void i(int i) {
        wv0 wv0Var = this.B;
        StateListDrawable stateListDrawable = this.c;
        if (i == 2 && this.v != 2) {
            stateListDrawable.setState(C);
            this.s.removeCallbacks(wv0Var);
        }
        if (i == 0) {
            this.s.invalidate();
        } else {
            l();
        }
        if (this.v == 2 && i != 2) {
            stateListDrawable.setState(D);
            this.s.removeCallbacks(wv0Var);
            this.s.postDelayed(wv0Var, 1200);
        } else if (i == 1) {
            this.s.removeCallbacks(wv0Var);
            this.s.postDelayed(wv0Var, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        this.v = i;
    }

    public final void l() {
        int i = this.A;
        ValueAnimator valueAnimator = this.z;
        if (i != 0) {
            if (i == 3) {
                valueAnimator.cancel();
            } else {
                return;
            }
        }
        this.A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bc, code lost:            if (r9 >= 0) goto L35;     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0114, code lost:            if (r5 >= 0) goto L49;     */
    @Override // defpackage.qh2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aw0.onTouchEvent(android.view.MotionEvent):void");
    }
}
