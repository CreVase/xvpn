package com.security.xvpn.z35kb.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatEditText;
import defpackage.i23;
import defpackage.tf3;
import defpackage.v73;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class PasscodeEditText extends AppCompatEditText {
    public int g;
    public int h;
    public float i;
    public float j;
    public float k;
    public RectF l;

    public PasscodeEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = -2894893;
        this.h = 920180952;
        float f = tf3.F;
        this.i = 7 * f;
        this.j = 10 * f;
        this.k = 1 * f;
        this.l = new RectF();
        setBackground(null);
        setLongClickable(false);
        InputFilter[] filters = getFilters();
        InputFilter.AllCaps allCaps = new InputFilter.AllCaps();
        int length = filters.length;
        Object[] copyOf = Arrays.copyOf(filters, length + 1);
        copyOf[length] = allCaps;
        setFilters((InputFilter[]) copyOf);
        InputFilter[] filters2 = getFilters();
        DigitsKeyListener digitsKeyListener = DigitsKeyListener.getInstance("ABCDEFGHJKMNPQRSTUVWXYZ0123456789");
        int length2 = filters2.length;
        Object[] copyOf2 = Arrays.copyOf(filters2, length2 + 1);
        copyOf2[length2] = digitsKeyListener;
        setFilters((InputFilter[]) copyOf2);
        setGravity(3);
    }

    private final int getMaxLen() {
        InputFilter.LengthFilter lengthFilter;
        InputFilter inputFilter;
        InputFilter[] filters = getFilters();
        int length = filters.length;
        int i = 0;
        while (true) {
            lengthFilter = null;
            if (i < length) {
                inputFilter = filters[i];
                if (inputFilter instanceof InputFilter.LengthFilter) {
                    break;
                }
                i++;
            } else {
                inputFilter = null;
                break;
            }
        }
        if (inputFilter instanceof InputFilter.LengthFilter) {
            lengthFilter = (InputFilter.LengthFilter) inputFilter;
        }
        if (lengthFilter != null) {
            return lengthFilter.getMax();
        }
        return 6;
    }

    public final RectF getInputRect() {
        return this.l;
    }

    public final float getInputRectBorder() {
        return this.k;
    }

    public final int getInputRectBorderColor() {
        return this.g;
    }

    public final float getInputRectDivider() {
        return this.j;
    }

    public final int getInputRectFillColor() {
        return this.h;
    }

    public final float getInputRectRadius() {
        return this.i;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        Character ch;
        RectF rectF = this.l;
        float f = this.k;
        rectF.offsetTo(f, f);
        int maxLen = getMaxLen();
        for (int i = 0; i < maxLen; i++) {
            RectF rectF2 = this.l;
            float f2 = this.i;
            canvas.drawRoundRect(rectF2, f2, f2, tf3.E(v73.j(1000093)));
            RectF rectF3 = this.l;
            float f3 = this.i;
            int j = v73.j(1000094);
            float f4 = this.k;
            Paint paint = tf3.A;
            if (paint == null) {
                Paint paint2 = new Paint(5);
                tf3.A = paint2;
                paint2.setStyle(Paint.Style.STROKE);
                tf3.A.setStrokeWidth(f4);
                tf3.A.setColor(j);
                tf3.B = j;
                tf3.C = f4;
            } else {
                if (tf3.B != j) {
                    paint.setColor(j);
                    tf3.B = j;
                }
                if (tf3.C == f4) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    tf3.A.setStrokeWidth(f4);
                    tf3.C = f4;
                }
            }
            canvas.drawRoundRect(rectF3, f3, f3, tf3.A);
            Editable text = getText();
            String str = null;
            if (text != null) {
                if (i >= 0 && i <= i23.V0(text)) {
                    ch = Character.valueOf(text.charAt(i));
                } else {
                    ch = null;
                }
                if (ch != null) {
                    str = ch.toString();
                }
            }
            if (str == null) {
                RectF rectF4 = this.l;
                rectF4.offset(rectF4.width() + this.j, 0.0f);
            } else {
                TextPaint paint3 = getPaint();
                int length = str.length();
                if (tf3.D == null) {
                    tf3.D = new Rect();
                }
                paint3.getTextBounds(str, 0, length, tf3.D);
                Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
                float centerX = this.l.centerX();
                if (tf3.D == null) {
                    tf3.D = new Rect();
                }
                float f5 = 2;
                canvas.drawText(str, centerX - tf3.D.centerX(), (this.l.centerY() - (fontMetrics.bottom / f5)) - (fontMetrics.top / f5), getPaint());
                RectF rectF5 = this.l;
                rectF5.offset(rectF5.width() + this.j, 0.0f);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z) {
            setSelection(length());
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 3 && i != 19 && i != 21 && i != 92 && i != 122) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        return super.onKeyMultiple(i, i2, keyEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 3 && i != 19 && i != 21 && i != 92 && i != 122) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(length(), length());
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        RectF rectF = this.l;
        float f = this.k;
        rectF.top = f;
        rectF.bottom = (i2 - f) - f;
        rectF.left = 0.0f;
        float f2 = ((i - (this.j * 5.0f)) - (f * 2)) / 6;
        if (f2 > rectF.height()) {
            RectF rectF2 = this.l;
            rectF2.right = rectF2.height();
        } else {
            this.l.right = f2;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        setSelection(length());
        return true;
    }

    @Override // android.widget.EditText
    public final void selectAll() {
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        super.setBackground(null);
    }

    public final void setInputRect(RectF rectF) {
        this.l = rectF;
    }

    public final void setInputRectBorder(float f) {
        this.k = f;
    }

    public final void setInputRectBorderColor(int i) {
        this.g = i;
    }

    public final void setInputRectDivider(float f) {
        this.j = f;
    }

    public final void setInputRectFillColor(int i) {
        this.h = i;
    }

    public final void setInputRectRadius(float f) {
        this.i = f;
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        super.setMaxLines(1);
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        super.setMinLines(1);
    }

    @Override // android.widget.EditText
    public void setSelection(int i) {
        super.setSelection(length());
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        super.setSingleLine(true);
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        getPaint().setColor(i);
    }
}
