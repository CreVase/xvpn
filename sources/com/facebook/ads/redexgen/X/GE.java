package com.facebook.ads.redexgen.X;

import android.text.TextUtils;

/* loaded from: assets/audience_network.dex */
public final class GE {
    public final int A00;
    public final int A01;
    public final String A02;

    public GE(int i, int i2, String str) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GE ge = (GE) obj;
        if (this.A00 == ge.A00 && this.A01 == ge.A01 && TextUtils.equals(this.A02, ge.A02)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A00;
        int i = result * 31;
        int result2 = this.A01;
        int result3 = (i + result2) * 31;
        String str = this.A02;
        int result4 = str != null ? str.hashCode() : 0;
        return result3 + result4;
    }
}
