package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: com.facebook.ads.redexgen.X.Zw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0892Zw implements C2A {
    public static byte[] A05;
    public final InterfaceC00581y A00;
    public final YA A01;
    public final String A02 = UUID.randomUUID().toString();
    public final Handler A03;
    public final AnonymousClass25 A04;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 36);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{-65, -46, -53, -63, -55, -62, -36, -62, -43, -47, -49, -66, -48, -36, -56, -62, -42, -46, -41, -35, -24, -50, -37, -37, -40, -37, -24, -52, -40, -51, -50, -24, -44, -50, -30, -83, -82, -84, -71, -101, -98, -71, -93, -98, -71, -91, -97, -77, -24, -23, -25, -12, -38, -25, -25, -28, -25, -12, -30, -38, -24, -24, -42, -36, -38, -12, -32, -38, -18};
    }

    public abstract void A05();

    public AbstractC0892Zw(YA ya, AnonymousClass26 anonymousClass26) {
        this.A01 = ya;
        DynamicLoaderFactory.makeLoader(ya).getInitApi().onAdLoadInvoked(ya);
        C0895Zz c0895Zz = new C0895Zz(ya, this);
        this.A00 = c0895Zz;
        this.A03 = new Handler(Looper.getMainLooper());
        this.A04 = anonymousClass26.A4c(c0895Zz, this);
    }

    public final void A04() {
        if (!IP.A0q(this.A01)) {
            return;
        }
        LP.A00(new C0893Zx(this));
    }

    public final void A06(int i, AdErrorType adErrorType, String str) {
        Bundle bundle = new Bundle();
        String A02 = A02(48, 21, 113);
        if (str != null) {
            bundle.putString(A02, str);
        } else {
            bundle.putString(A02, adErrorType.getDefaultErrorMessage());
        }
        bundle.putInt(A02(17, 18, 101), adErrorType.getErrorCode());
        AC7(i, this.A02, bundle);
    }

    @Override // com.facebook.ads.redexgen.X.C2A
    public final void AC7(int i, String str, Bundle bundle) {
        Message obtain = Message.obtain((Handler) null, i);
        obtain.getData().putString(A02(35, 13, 54), str);
        if (bundle != null) {
            obtain.getData().putBundle(A02(0, 17, 89), bundle);
        }
        Runnable callbackApiRunnable = new C0894Zy(this, obtain);
        this.A03.post(callbackApiRunnable);
    }
}
