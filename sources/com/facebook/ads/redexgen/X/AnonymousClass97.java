package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.97, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class AnonymousClass97 extends AbstractC0704Sk {
    public RelativeLayout A00;
    public MC A01;
    public ON A02;
    public S0 A03;
    public PE A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Paint A08;
    public final Path A09;
    public final RectF A0A;
    public final YA A0B;
    public final AbstractC0591Ob A0C;
    public final MU A0D;
    public final MI A0E;
    public final MA A0F;
    public final KK A0G;
    public final String A0H;
    public static String[] A0I = {"ZJd3r9AhG0a", "i1M", "myOt", "scTs", "x2qjzjwt5KjNEBlbZiSy7b60v5gMv07i", "l9mbaUlHikXHnlqbzXlarwn", "RgzjkxP8tSu3AToRYAuzqOa1HsgYA", "48ukShptsWaLS3SUfEjE876"};
    public static final int A0K = (int) (C0506Ku.A02 * 1.0f);
    public static final int A0L = (int) (C0506Ku.A02 * 4.0f);
    public static final int A0J = (int) (C0506Ku.A02 * 6.0f);

    public abstract void A18(YA ya);

    public AnonymousClass97(C0589Nz c0589Nz, boolean z, String str, S0 s0) {
        super(c0589Nz, z);
        this.A09 = new Path();
        this.A0A = new RectF();
        this.A0G = new KK() { // from class: com.facebook.ads.redexgen.X.9C
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC02028a
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C0499Kl c0499Kl) {
                S0 s02;
                s02 = AnonymousClass97.this.A03;
                s02.A0P().setVolume(AnonymousClass97.this.getVideoView().getVolume());
            }
        };
        this.A0C = new AbstractC0591Ob() { // from class: com.facebook.ads.redexgen.X.9B
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC02028a
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass75 anonymousClass75) {
                S0 s02;
                s02 = AnonymousClass97.this.A03;
                s02.A0N().ADJ(((Integer) AnonymousClass97.this.getTag(-1593835536)).intValue());
            }
        };
        this.A0E = new MI() { // from class: com.facebook.ads.redexgen.X.9A
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC02028a
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(MJ mj) {
                S0 s02;
                s02 = AnonymousClass97.this.A03;
                s02.A0O().ADT(AnonymousClass97.this);
            }
        };
        this.A0D = new MU() { // from class: com.facebook.ads.redexgen.X.99
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC02028a
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass72 anonymousClass72) {
                S0 s02;
                s02 = AnonymousClass97.this.A03;
                s02.A0O().ADR(AnonymousClass97.this);
            }
        };
        this.A0F = new MA() { // from class: com.facebook.ads.redexgen.X.98
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC02028a
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(MD md) {
                AnonymousClass97.this.A07 = true;
                AnonymousClass97.this.A03();
            }
        };
        this.A03 = s0;
        this.A0H = str;
        YA A05 = c0589Nz.A05();
        this.A0B = A05;
        setGravity(17);
        int i = A0K;
        setPadding(i, 0, i, i);
        LV.A0M(this, 0);
        setUpView(A05);
        Paint paint = new Paint();
        this.A08 = paint;
        paint.setColor(-16777216);
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(16);
        paint.setAntiAlias(true);
        if (Build.VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        if (this.A02 == null) {
            return;
        }
        if ((A17() && this.A07) || (!A17() && this.A06)) {
            this.A02.AAY();
        }
    }

    private void A04(View view) {
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        LV.A0K(view);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0585Nv
    public boolean A0D() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0585Nv
    public final boolean A10() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0704Sk
    public final void A13() {
        if (A17()) {
            this.A04.A01();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0704Sk
    public final void A14() {
        if (A17()) {
            A15();
            this.A04.A05(EnumC0625Pj.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0704Sk
    public final void A15() {
        float volume = this.A03.A0P().getVolume();
        if (A17()) {
            float newVolume = this.A04.getVolume();
            if (volume != newVolume) {
                this.A04.setVolume(volume);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0704Sk
    public final boolean A16() {
        return A17() && this.A04.A06();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0704Sk
    public final boolean A17() {
        return this.A05;
    }

    public final void A19(Map<String, String> extraParams) {
        this.A04.A02();
        if (A17()) {
            this.A04.A04(getAdEventManager(), this.A0H, extraParams);
        }
    }

    public final RelativeLayout getMediaContainer() {
        return this.A00;
    }

    public final PE getVideoView() {
        return this.A04;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.A09.reset();
        this.A0A.set(0.0f, 0.0f, getWidth(), getHeight());
        Path path = this.A09;
        RectF rectF = this.A0A;
        int i = A0J;
        path.addRoundRect(rectF, i, i, Path.Direction.CW);
        canvas.drawPath(this.A09, this.A08);
        this.A0A.set(A0K, 0.0f, getWidth() - r3, getHeight() - r3);
        Path path2 = this.A09;
        RectF rectF2 = this.A0A;
        int i2 = A0L;
        path2.addRoundRect(rectF2, i2, i2, Path.Direction.CW);
        canvas.clipPath(this.A09);
        super.onDraw(canvas);
    }

    public void setAdTitleAndDescription(String str, String str2) {
        getTitleDescContainer().A03(str, str2, null, true, false);
    }

    public void setCTAInfo(C1N c1n, Map<String, String> extraData) {
        getCtaButton().setCta(c1n, this.A0H, extraData);
    }

    public void setImageUrl(String str) {
        this.A01.setVisibility(0);
        this.A04.setVisibility(8);
        new T8(this.A01, this.A0B).A04().A06(new C0703Sj(this)).A07(str);
    }

    public void setIsVideo(boolean z) {
        this.A05 = z;
    }

    public void setOnAssetsLoadedListener(ON on) {
        this.A02 = on;
    }

    public void setUpImageView(YA ya) {
        this.A01 = new MC(ya);
        if (IP.A17(ya)) {
            NO.A00(this.A01, IP.A18(ya), new OR(this));
        }
        A04(this.A01);
    }

    public void setUpMediaContainer(YA ya) {
        RelativeLayout relativeLayout = new RelativeLayout(ya);
        this.A00 = relativeLayout;
        A04(relativeLayout);
    }

    public void setUpVideoView(YA ya) {
        this.A04 = new PE(ya, new C0452In(this.A0H, getAdEventManager()));
        if (IP.A19(ya)) {
            NO.A00(this.A04, IP.A1A(ya), new OS(this));
        }
        A04(this.A04);
        String[] strArr = A0I;
        if (strArr[5].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A0I[4] = "V2iAUpZbaEbKk91ZDPvMgym9lCZNc3yl";
    }

    private void setUpView(YA ya) {
        setUpImageView(ya);
        setUpVideoView(ya);
        setUpMediaContainer(ya);
        this.A00.addView(this.A01);
        this.A00.addView(this.A04);
        A18(ya);
    }

    public void setVideoPlaceholderUrl(String str) {
        this.A04.setPlaceholderUrl(str);
    }

    public void setVideoUrl(String str) {
        this.A01.setVisibility(8);
        this.A04.setVisibility(0);
        this.A04.setVideoURI(str);
        this.A04.A03(this.A0G);
        this.A04.A03(this.A0C);
        this.A04.A03(this.A0E);
        this.A04.A03(this.A0D);
        this.A04.A03(this.A0F);
    }
}
