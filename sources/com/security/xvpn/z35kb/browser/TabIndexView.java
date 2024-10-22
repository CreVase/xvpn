package com.security.xvpn.z35kb.browser;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.k53;
import defpackage.n53;
import defpackage.s53;
import defpackage.v53;

/* loaded from: classes2.dex */
public final class TabIndexView extends ConstraintLayout {
    public boolean A;
    public final float B;
    public boolean q;
    public float r;
    public v53 s;
    public int t;
    public final VelocityTracker u;
    public final int v;
    public float w;
    public float x;
    public k53 y;
    public int z;

    public TabIndexView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.u = VelocityTracker.obtain();
        this.v = ViewConfiguration.get(context).getScaledTouchSlop();
        this.z = -1;
        float f = context.getResources().getDisplayMetrics().density;
        this.B = f;
        this.t = (int) (f * 125.984245f);
    }

    public final v53 getCallback() {
        return this.s;
    }

    public final k53 getData() {
        return this.y;
    }

    public final int getIndex() {
        return this.z;
    }

    public final int getMm2() {
        return this.t;
    }

    public final boolean getU() {
        return this.A;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!super.onInterceptTouchEvent(motionEvent) && !this.q) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        v53 v53Var;
        TabIndexView tabIndexView;
        float f2;
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        VelocityTracker velocityTracker = this.u;
        if (action != 0) {
            int i = -1;
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        v53 v53Var2 = this.s;
                        if (v53Var2 != null) {
                            ((n53) v53Var2).a(0, false);
                        }
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(false);
                        }
                        this.q = false;
                        velocityTracker.clear();
                    }
                } else {
                    velocityTracker.addMovement(motionEvent);
                    float f3 = rawX - this.r;
                    this.r = rawX;
                    if (this.y == null) {
                        return false;
                    }
                    if (this.q && (v53Var = this.s) != null && (tabIndexView = ((n53) v53Var).f3397a) != null) {
                        float translationX = tabIndexView.getTranslationX() + f3;
                        tabIndexView.setTranslationX(translationX);
                        int width = tabIndexView.getWidth() / 2;
                        float abs = Math.abs(translationX);
                        if (abs > tabIndexView.getWidth() / 2) {
                            float f4 = width;
                            f2 = Math.max(1.0f - (((abs - f4) / f4) / 2), 0.5f);
                        } else {
                            f2 = 1.0f;
                        }
                        tabIndexView.setAlpha(f2);
                    }
                    if (!this.q) {
                        float f5 = rawX - this.w;
                        float f6 = rawY - this.x;
                        float abs2 = Math.abs(f5);
                        float abs3 = Math.abs(f6);
                        float f7 = this.v;
                        if (abs2 < f7 || abs3 >= abs2) {
                            return true;
                        }
                        if (f5 > 0.0f) {
                            f = f5 - f7;
                        } else {
                            f = f5 + f7;
                        }
                        v53 v53Var3 = this.s;
                        if (v53Var3 != null) {
                            n53 n53Var = (n53) v53Var3;
                            s53 s53Var = n53Var.c;
                            int indexOf = s53Var.g.indexOf(getData());
                            if (indexOf != -1) {
                                n53Var.f3398b = (k53) s53Var.g.get(indexOf);
                                n53Var.f3397a = this;
                                setTranslationZ(1.0f);
                                setTranslationX(f);
                            }
                        }
                        this.q = true;
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            } else {
                if (isClickable() && !this.q) {
                    performClick();
                    return true;
                }
                if (this.q) {
                    float f8 = rawX - this.w;
                    float abs4 = Math.abs(f8);
                    if (f8 > 0.0f) {
                        i = 1;
                    }
                    velocityTracker.computeCurrentVelocity(1000);
                    float xVelocity = velocityTracker.getXVelocity();
                    float abs5 = Math.abs(xVelocity);
                    float abs6 = Math.abs(velocityTracker.getYVelocity());
                    if (abs4 > getWidth()) {
                        v53 v53Var4 = this.s;
                        if (v53Var4 != null) {
                            ((n53) v53Var4).a(i, true);
                        }
                    } else {
                        float f9 = this.B;
                        float f10 = 400 * f9;
                        if (abs5 < f10 && (abs5 < 300 * f9 || abs6 < f10 - Math.abs(xVelocity))) {
                            v53 v53Var5 = this.s;
                            if (v53Var5 != null) {
                                ((n53) v53Var5).a(0, false);
                            }
                        } else {
                            v53 v53Var6 = this.s;
                            if (v53Var6 != null) {
                                ((n53) v53Var6).a(i, true);
                            }
                        }
                    }
                }
                this.q = false;
                ViewParent parent3 = getParent();
                if (parent3 != null) {
                    parent3.requestDisallowInterceptTouchEvent(false);
                }
                this.q = false;
                velocityTracker.clear();
            }
        } else {
            this.r = rawX;
            this.w = rawX;
            this.x = rawY;
            SystemClock.elapsedRealtime();
            velocityTracker.addMovement(motionEvent);
        }
        return true;
    }

    public final void setCallback(v53 v53Var) {
        this.s = v53Var;
    }

    public final void setData(k53 k53Var) {
        this.y = k53Var;
    }

    public final void setIndex(int i) {
        this.z = i;
    }

    public final void setMm2(int i) {
        this.t = i;
    }

    public final void setU(boolean z) {
        this.A = z;
    }
}
