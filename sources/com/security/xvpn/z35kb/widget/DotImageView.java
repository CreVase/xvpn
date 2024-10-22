package com.security.xvpn.z35kb.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.bx3;
import defpackage.sf2;

/* loaded from: classes2.dex */
public class DotImageView extends AppCompatImageView {
    public final int d;
    public final boolean e;
    public final int f;
    public boolean g;
    public final Paint h;

    public DotImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sf2.DotImageView);
        int color = obtainStyledAttributes.getColor(0, Color.parseColor("#F84B30"));
        this.d = color;
        this.e = obtainStyledAttributes.getBoolean(2, true);
        this.f = obtainStyledAttributes.getDimensionPixelSize(1, (int) (bx3.z(context) * 3));
        this.g = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.h = paint;
        paint.setAntiAlias(true);
        paint.setColor(color);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth((int) (bx3.z(context) * 1));
        setLayerType(1, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.g) {
            int width = getWidth();
            Paint paint = this.h;
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(this.d);
            int i = this.f;
            canvas.drawCircle(width - i, i, i, paint);
            if (this.e) {
                paint.setStyle(Paint.Style.STROKE);
                paint.setColor(-1);
                canvas.drawCircle(width - (i + 1), i + 1, i + 1, paint);
            }
        }
    }
}
