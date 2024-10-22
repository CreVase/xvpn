package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* loaded from: classes.dex */
public final class ae extends vd {
    public final SeekBar d;
    public Drawable e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public boolean h;
    public boolean i;

    public ae(SeekBar seekBar) {
        super(seekBar);
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = false;
        this.d = seekBar;
    }

    @Override // defpackage.vd
    public final void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, i);
        SeekBar seekBar = this.d;
        Context context = seekBar.getContext();
        int[] iArr = cg2.AppCompatSeekBar;
        go2 m = go2.m(context, attributeSet, iArr, i);
        ll3.o(seekBar, seekBar.getContext(), iArr, attributeSet, (TypedArray) m.f2294b, i);
        Drawable f = m.f(cg2.AppCompatSeekBar_android_thumb);
        if (f != null) {
            seekBar.setThumb(f);
        }
        Drawable e = m.e(cg2.AppCompatSeekBar_tickMark);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.e = e;
        if (e != null) {
            e.setCallback(seekBar);
            t9.o0(e, vk3.d(seekBar));
            if (e.isStateful()) {
                e.setState(seekBar.getDrawableState());
            }
            c();
        }
        seekBar.invalidate();
        int i2 = cg2.AppCompatSeekBar_tickMarkTintMode;
        if (m.l(i2)) {
            this.g = in0.c(m.h(i2, -1), this.g);
            this.i = true;
        }
        int i3 = cg2.AppCompatSeekBar_tickMarkTint;
        if (m.l(i3)) {
            this.f = m.b(i3);
            this.h = true;
        }
        m.o();
        c();
    }

    public final void c() {
        Drawable drawable = this.e;
        if (drawable != null) {
            if (this.h || this.i) {
                Drawable L0 = t9.L0(drawable.mutate());
                this.e = L0;
                if (this.h) {
                    bn0.h(L0, this.f);
                }
                if (this.i) {
                    bn0.i(this.e, this.g);
                }
                if (this.e.isStateful()) {
                    this.e.setState(this.d.getDrawableState());
                }
            }
        }
    }

    public final void d(Canvas canvas) {
        int i;
        if (this.e != null) {
            int max = this.d.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = this.e.getIntrinsicWidth();
                int intrinsicHeight = this.e.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i = intrinsicWidth / 2;
                } else {
                    i = 1;
                }
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                this.e.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
