package com.security.xvpn.z35kb.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import com.security.xvpn.z35kb.R;
import defpackage.nt3;
import defpackage.sf2;

/* loaded from: classes2.dex */
public class XEditText extends AppCompatEditText {
    public static final /* synthetic */ int k = 0;
    public Drawable g;
    public boolean h;
    public boolean i;
    public View.OnClickListener j;

    public XEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!isInEditMode()) {
            setHint(getHint().toString());
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sf2.XEditText);
            this.h = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
        }
    }

    private void setIconVisible(boolean z) {
        Drawable drawable;
        this.i = z;
        Drawable drawable2 = getCompoundDrawablesRelative()[0];
        Drawable drawable3 = getCompoundDrawables()[1];
        if (z) {
            drawable = this.g;
        } else {
            drawable = null;
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2, drawable3, drawable, getCompoundDrawables()[3]);
    }

    public final void c() {
        setTransformationMethod(PasswordTransformationMethod.getInstance());
        setRight(getResources().getDrawable(R.drawable.ic_pass_cleartext));
        setRightClick(new nt3(this, 1));
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.h) {
            if (hasFocus() && charSequence.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            setIconVisible(z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:            if (r2 > (r0.getBounds().width() + getPaddingLeft())) goto L21;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:            r6.j.onClick(r6);     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:            if (r2 >= ((r3 - getPaddingRight()) - r0.getBounds().width())) goto L26;     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            boolean r0 = r6.i
            if (r0 == 0) goto L6b
            int r0 = r7.getAction()
            r1 = 1
            if (r0 == r1) goto Lc
            goto L6b
        Lc:
            android.graphics.drawable.Drawable[] r0 = r6.getCompoundDrawables()
            r2 = 2
            r0 = r0[r2]
            if (r0 == 0) goto L6b
            android.view.View$OnClickListener r2 = r6.j
            if (r2 == 0) goto L6b
            int r2 = r6.getLayoutDirection()
            if (r2 != r1) goto L20
            goto L21
        L20:
            r1 = 0
        L21:
            float r2 = r7.getX()
            int r3 = r6.getWidth()
            if (r1 == 0) goto L46
            int r4 = r6.getPaddingLeft()
            float r4 = (float) r4
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L46
            int r4 = r6.getPaddingLeft()
            android.graphics.Rect r5 = r0.getBounds()
            int r5 = r5.width()
            int r5 = r5 + r4
            float r4 = (float) r5
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L66
        L46:
            if (r1 != 0) goto L6b
            int r1 = r6.getPaddingRight()
            int r1 = r3 - r1
            float r1 = (float) r1
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 > 0) goto L6b
            int r1 = r6.getPaddingRight()
            int r3 = r3 - r1
            android.graphics.Rect r0 = r0.getBounds()
            int r0 = r0.width()
            int r3 = r3 - r0
            float r0 = (float) r3
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L6b
        L66:
            android.view.View$OnClickListener r0 = r6.j
            r0.onClick(r6)
        L6b:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.security.xvpn.z35kb.widget.XEditText.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setRight(Drawable drawable) {
        boolean z;
        this.g = drawable;
        if (drawable != null) {
            z = true;
        } else {
            z = false;
        }
        setIconVisible(z);
    }

    public void setRightClick(View.OnClickListener onClickListener) {
        this.j = onClickListener;
    }
}
