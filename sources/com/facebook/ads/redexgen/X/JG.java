package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;

/* loaded from: assets/audience_network.dex */
public final class JG {
    public final AdErrorType A00;
    public final String A01;

    public JG(int i, String str) {
        this(AdErrorType.adErrorTypeFromCode(i), str);
    }

    public JG(AdErrorType adErrorType, String str) {
        str = TextUtils.isEmpty(str) ? adErrorType.getDefaultErrorMessage() : str;
        this.A00 = adErrorType;
        this.A01 = str;
    }

    public static JG A00(AdErrorType adErrorType) {
        return new JG(adErrorType, (String) null);
    }

    public static JG A01(AdErrorType adErrorType, String str) {
        return new JG(adErrorType, str);
    }

    public static JG A02(JH jh) {
        return new JG(jh.A00(), jh.A01());
    }

    public final AdErrorType A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }
}
