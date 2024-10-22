package com.facebook.ads.redexgen.X;

import android.view.View;
import com.google.android.gms.stats.CodePackage;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Nc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0566Nc implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {"eK2iG9BFnR5LMlE7G3m8", "2ToUjM2zwZ75WerTaDOi0LZSzIqlBfkc", "7dSK8vzOrDGLLmFObH3b", "garB0MzcdmAd1iXvvKCbdmDeJ8TMxCEG", "k0fVZwzOfWxa", CodePackage.OTA, "EVmJiz3R0TMllDo4HJAPWmaYp66nl7Ex", "xkv8Ynv3GUGlmRL7DeQJBLAGHPyG9ojQ"};
    public final /* synthetic */ C9G A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[4].length() != 12) {
                throw new RuntimeException();
            }
            A02[5] = "7dr";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 58);
            i4++;
        }
    }

    public static void A01() {
        byte[] bArr = {9, -4, -9, -8, 2};
        if (A02[5].length() != 3) {
            throw new RuntimeException();
        }
        A02[4] = "UQKYIP1cQ1d2";
        A01 = bArr;
    }

    static {
        A01();
    }

    public ViewOnClickListenerC0566Nc(C9G c9g) {
        this.A00 = c9g;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        T3 ctaButton;
        if (K0.A02(this)) {
            return;
        }
        try {
            ctaButton = this.A00.getCtaButton();
            ctaButton.A09(A00(0, 5, 89));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
