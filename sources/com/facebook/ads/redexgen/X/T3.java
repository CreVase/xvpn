package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class T3 extends C0564Na implements View.OnClickListener {
    public static byte[] A0D;
    public static String[] A0E = {"idQnrwKrPQs0c3zYYHT6WTvW1aXoRMqQ", "Gekt1WHQiHnIJqxdwB9j8FzDtIJy1cfJ", "sF2V", "CdtBVDHmuEaNC9R8", "jtmNaJ8NDkAfiILRFeCM3WK", "aXO2Ks7stxeTyHMnCxwSATKtkmhK3bmt", "xmLEl9t0StR", ""};
    public static final int A0F;
    public int A00;
    public int A01;
    public Bitmap A02;
    public Paint A03;
    public Rect A04;
    public YA A05;
    public C0501Kn A06;
    public T5 A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public final NW A0B;
    public final Map<String, String> A0C;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] ^ i3;
            if (A0E[2].length() != 4) {
                throw new RuntimeException();
            }
            A0E[3] = "DG";
            copyOfRange[i4] = (byte) (i5 ^ 83);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0D = new byte[]{3, 12, 9, 3, 11, 63, 19, 15, 21, 18, 3, 5, 8, 12, 67, 3, 11, 29, 29, 11, 0, 9, 11, 28, Byte.MAX_VALUE, 121, 111, 120, 105, 102, 99, 105, 97};
    }

    static {
        A07();
        A0F = (int) (C0506Ku.A02 * 24.0f);
    }

    public T3(YA ya, String str, C1M c1m, InterfaceC0444If interfaceC0444If, InterfaceC0531Lt interfaceC0531Lt, C0643Qb c0643Qb, LN ln, C1R c1r) {
        this(ya, str, c1m, false, interfaceC0444If, interfaceC0531Lt, c0643Qb, ln, c1r);
    }

    public T3(YA ya, String str, C1M c1m, boolean z, InterfaceC0444If interfaceC0444If, InterfaceC0531Lt interfaceC0531Lt, C0643Qb c0643Qb, LN ln, C1R c1r) {
        super(ya, c1m);
        this.A0C = new HashMap();
        this.A05 = ya;
        this.A0A = z;
        this.A0B = new NW(ya, str, c0643Qb, ln, interfaceC0444If, c1r, interfaceC0531Lt);
        setOnClickListener(this);
        LV.A0G(1001, this);
    }

    public static Bitmap A03(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    private void A05() {
        String str;
        if (this.A0A && (str = this.A09) != null) {
            this.A02 = A03(C0516Le.A03(this.A05, str.contains(A04(12, 12, 61)) ? EnumC0515Ld.MESSENGER : EnumC0515Ld.WHATSAPP));
            this.A03 = new Paint();
            int i = A0F;
            setPadding(i, 0, i, 0);
        }
    }

    private void A06() {
        C0501Kn c0501Kn = this.A06;
        if (c0501Kn != null) {
            c0501Kn.A07();
        }
        T5 t5 = this.A07;
        if (t5 != null) {
            t5.A04();
        }
    }

    public static boolean A08(AbstractC0924aS abstractC0924aS) {
        return ((long) abstractC0924aS.A0s()) > 0 && abstractC0924aS.A0q() >= 0;
    }

    public final void A09(String str) {
        if (TextUtils.isEmpty(this.A08) || TextUtils.isEmpty(this.A09)) {
            return;
        }
        A06();
        this.A0C.put(A04(0, 12, 51), str);
        this.A0B.A08(this.A08, this.A09, this.A0C);
    }

    public final boolean A0A(AbstractC0924aS abstractC0924aS, AbstractC0530Ls abstractC0530Ls) {
        if (this.A06 != null || !A08(abstractC0924aS) || abstractC0924aS.A10().A01() == null || abstractC0924aS.A10().A00() == null) {
            return false;
        }
        this.A07 = new T5(abstractC0924aS.A0q(), abstractC0924aS.A0s(), abstractC0924aS.A0r(), abstractC0924aS.A10().A01(), abstractC0924aS.A10().A00(), abstractC0530Ls, this);
        C0501Kn c0501Kn = new C0501Kn(abstractC0924aS.A0s(), this.A07);
        this.A06 = c0501Kn;
        c0501Kn.A08();
        return true;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A09(A04(24, 9, 89));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A06();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.A02 != null) {
            this.A04 = new Rect(0, 0, this.A02.getWidth(), this.A02.getHeight());
            int width = this.A02.getWidth();
            this.A01 = width;
            this.A00 = 12;
            int shift = (width + 12) / 2;
            canvas.save();
            canvas.translate(shift, 0.0f);
        }
        super.onDraw(canvas);
        if (this.A02 != null) {
            float width2 = (getWidth() / 2.0f) - ((getPaint().measureText((String) getText()) + 10.0f) / 2.0f);
            float textWidth = this.A01;
            float f = width2 - textWidth;
            float textWidth2 = this.A00;
            int i = (int) (f - textWidth2);
            int top = (getHeight() / 2) - (this.A01 / 2);
            int left = this.A01;
            Rect destRect = new Rect(i, top, i + left, left + top);
            canvas.drawBitmap(this.A02, this.A04, destRect, this.A03);
            canvas.restore();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            A06();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (!z) {
            A06();
        }
    }

    public void setCta(C1N c1n, String str, Map<String, String> extraData) {
        setCta(c1n, str, extraData, null);
    }

    public void setCta(C1N c1n, String str, Map<String, String> extraData, NV nv) {
        this.A08 = str;
        this.A09 = c1n.A05();
        this.A0C.putAll(extraData);
        this.A0B.A07(nv);
        String A04 = c1n.A04();
        if (!TextUtils.isEmpty(A04)) {
            String buttonText = this.A09;
            if (!TextUtils.isEmpty(buttonText)) {
                setText(A04);
                A05();
                return;
            }
        }
        setVisibility(8);
    }

    public void setIsInAppBrowser(boolean z) {
        this.A0B.A09(z);
    }
}
