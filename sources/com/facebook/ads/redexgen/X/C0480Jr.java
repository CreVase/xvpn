package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.ImageView;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Jr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0480Jr extends ImageView implements InterfaceC0626Pk {
    public static byte[] A05;
    public static String[] A06 = {"CZ6R6baQKTb1E5sAmpDqVkfMXF7zVnG4", "nQZGX73N3q5NRRZlZyP90gUTrDeeLYBu", "LfCM6PYFJNbwOvLH4thVDQon3h1Zk2zk", "bpUakkTElIOqaP65ISNG9oh", "gJtMODfbj2e7z8MJG7ZRKfD", "8rYwk9o7IGDDsMQbyUTj4ra1LUt9E6qX", "3WiLQHXTUUJ8WctEatoRQ", "Xo7nIXQ5hsw2R0tzDjIU8fyfjH4jtFIR"};
    public static final int A07;
    public RX A00;
    public final Paint A01;
    public final YA A02;
    public final C0452In A03;
    public final KK A04;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{101, 93, 92, 77, 8, 105, 76};
    }

    static {
        A06();
        A07 = (int) (C0506Ku.A02 * 4.0f);
    }

    public C0480Jr(YA ya, C0452In c0452In) {
        super(ya);
        this.A04 = new KK() { // from class: com.facebook.ads.redexgen.X.6k
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC02028a
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C0499Kl c0499Kl) {
                C0480Jr.this.A09();
            }
        };
        this.A03 = c0452In;
        this.A02 = ya;
        Paint paint = new Paint();
        this.A01 = paint;
        paint.setColor(-1728053248);
        setColorFilter(-1);
        int i = A07;
        setPadding(i, i, i, i);
        setContentDescription(A03(0, 7, 59));
        A05();
        setOnClickListener(new ViewOnClickListenerC0640Py(this));
    }

    private void A04() {
        setImageBitmap(C0516Le.A01(EnumC0515Ld.SOUND_OFF));
    }

    private void A05() {
        setImageBitmap(C0516Le.A01(EnumC0515Ld.SOUND_ON));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A07() {
        RX rx = this.A00;
        if (rx != null) {
            float volume = rx.getVolume();
            String[] strArr = A06;
            if (strArr[5].charAt(12) == strArr[1].charAt(12)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[3] = "7LwdJMyLjSlNEKSwxkcw7Q3";
            strArr2[6] = "d5nTRpYYugpReKnwSxkEX";
            if (volume == 0.0f) {
                return true;
            }
        }
        return false;
    }

    public final void A09() {
        if (this.A00 == null) {
            return;
        }
        if (A07()) {
            A04();
        } else {
            A05();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0626Pk
    public final void A9D(RX rx) {
        this.A00 = rx;
        if (rx != null) {
            rx.getEventBus().A05(this.A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0626Pk
    public final void AG0(RX rx) {
        RX rx2 = this.A00;
        if (rx2 != null) {
            rx2.getEventBus().A06(this.A04);
        }
        this.A00 = null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        int y = getWidth() / 2;
        int x = getHeight() / 2;
        canvas.drawCircle(y, x, Math.min(y, x), this.A01);
        super.onDraw(canvas);
    }
}
