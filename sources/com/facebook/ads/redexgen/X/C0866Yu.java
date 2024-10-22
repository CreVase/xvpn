package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.internal.api.AdComponentViewApi;
import com.facebook.ads.internal.api.AdOptionsViewApi;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Yu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0866Yu extends C5O implements AdOptionsViewApi {
    public static byte[] A03;
    public static final int A04;
    public static final int A05;
    public final ImageView A00;
    public final ImageView A01;
    public final AdOptionsView A02;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 125);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{91, 108, 121, 102, 123, 125, 41, 72, 109};
    }

    static {
        A02();
        A04 = (int) (C0506Ku.A02 * 23.0f);
        A05 = (int) (C0506Ku.A02 * 4.0f);
    }

    public C0866Yu(final Context context, NativeAdBase nativeAdBase, NativeAdLayout nativeAdLayout, AdOptionsView.Orientation orientation, int i, AdOptionsView adOptionsView) {
        int i2;
        this.A02 = adOptionsView;
        final LinearLayout linearLayout = new LinearLayout(context);
        adOptionsView.addView(linearLayout);
        if (orientation == AdOptionsView.Orientation.HORIZONTAL) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        linearLayout.setOrientation(i2);
        ImageView A00 = A00(EnumC0515Ld.DEFAULT_INFO_ICON);
        this.A01 = A00;
        ImageView A002 = A00(EnumC0515Ld.AD_CHOICES_ICON);
        this.A00 = A002;
        A002.setContentDescription(A01(0, 9, 116));
        linearLayout.addView(A00);
        linearLayout.addView(A002);
        setIconSizeDp(i);
        setIconColor(-10459280);
        final UJ A0L = UJ.A0L(nativeAdBase.getInternalNativeAd());
        A0L.A1S(nativeAdLayout);
        A0L.A1U(this);
        C0939ah A0y = A0L.A0y();
        if (A0y != null && A0y.A0T() && !A0y.A0R()) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.5B
                public static String[] A04 = {"KRKQmCMMKryGk4zgpNIytFvS3TD6bAeJ", "Xc6miAmzcu08Y", "37gtSV6CsPxBYDJYgwQ03wIm04Bn1UoS", "vc4nNQQkh46pzBlyEmkoOi4CgZODKTHg", "arJKEayC0J1tSfFqlaoS22WOKdh4xl60", "Efttk19GyNCXlxxyYR0mavkkkhSaw2Qp", "IGlWio493rL8eTjetjpBhFYcUhZqKyAr", ""};

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (K0.A02(this)) {
                        return;
                    }
                    try {
                        A0L.A1I();
                        if (Build.VERSION.SDK_INT >= 16 && IP.A1z(context)) {
                            linearLayout.performAccessibilityAction(128, null);
                        }
                    } catch (Throwable th) {
                        if (A04[5].charAt(5) == 'z') {
                            throw new RuntimeException();
                        }
                        A04[6] = "upfEaDqgYzKFHRA83M0GBorRIFZJY191";
                        K0.A00(th, this);
                    }
                }
            });
            EnumC0511Kz.A04(adOptionsView, EnumC0511Kz.A0B);
        }
    }

    public C0866Yu(Context context, NativeAdBase nativeAdBase, NativeAdLayout nativeAdLayout, AdOptionsView adOptionsView) {
        this(context, nativeAdBase, nativeAdLayout, AdOptionsView.Orientation.HORIZONTAL, 23, adOptionsView);
    }

    private ImageView A00(EnumC0515Ld enumC0515Ld) {
        ImageView imageView = new ImageView(this.A02.getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int i = A05;
        imageView.setPadding(i, i, i, i);
        imageView.setImageBitmap(C0516Le.A01(enumC0515Ld));
        return imageView;
    }

    public final void A03(EnumC0515Ld enumC0515Ld) {
        this.A01.setImageBitmap(C0516Le.A01(enumC0515Ld));
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final AdComponentViewApi getAdComponentViewApi() {
        return this;
    }

    @Override // com.facebook.ads.internal.api.AdOptionsViewApi
    public final void setIconColor(int i) {
        this.A01.setColorFilter(i);
        this.A00.setColorFilter(i);
    }

    @Override // com.facebook.ads.internal.api.AdOptionsViewApi
    public final void setIconSizeDp(int i) {
        int iconSize = Math.max(A04, (int) (C0506Ku.A02 * i));
        LinearLayout.LayoutParams iconParams = new LinearLayout.LayoutParams(iconSize, iconSize);
        this.A01.setLayoutParams(iconParams);
        this.A00.setLayoutParams(iconParams);
    }

    @Override // com.facebook.ads.redexgen.X.C5O, com.facebook.ads.internal.api.AdComponentView
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        layoutParams.width = -2;
        layoutParams.height = -2;
        super.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.internal.api.AdOptionsViewApi
    public final void setSingleIcon(boolean z) {
        LV.A0N(this.A01, z ? 8 : 0);
    }
}
