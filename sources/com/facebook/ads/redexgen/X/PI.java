package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.widget.ImageView;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class PI extends ImageView {
    public static byte[] A03;
    public static final int A04;
    public final Paint A00;
    public final PG A01;
    public final PH A02;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 78);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{11, 47, 33, 40, 29, -40, 36, 29, 30, 44, 14, 50, 36, 43, 32, -37, 45, 36, 34, 35, 47};
    }

    static {
        A03();
        A04 = (int) (C0506Ku.A02 * 4.0f);
    }

    public PI(YA ya, PG pg, PH ph) {
        super(ya);
        this.A01 = pg;
        this.A02 = ph;
        Paint paint = new Paint();
        this.A00 = paint;
        paint.setColor(-1728053248);
        setColorFilter(-1);
        int i = A04;
        setPadding(i, i, i, i);
        boolean z = pg == PG.A03;
        setContentDescription(z ? A02(0, 10, 106) : A02(10, 11, 109));
        Bitmap arrowIcon = C0516Le.A01(EnumC0515Ld.TO_RIGHT_ARROW);
        if (z) {
            Matrix matrix = new Matrix();
            matrix.postRotate(180.0f);
            arrowIcon = Bitmap.createBitmap(arrowIcon, 0, 0, arrowIcon.getWidth(), arrowIcon.getHeight(), matrix, true);
        }
        setImageBitmap(arrowIcon);
        setOnClickListener(new PF(this));
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        int y = getWidth() / 2;
        int x = getHeight() / 2;
        canvas.drawCircle(y, x, Math.min(y, x), this.A00);
        super.onDraw(canvas);
    }
}
