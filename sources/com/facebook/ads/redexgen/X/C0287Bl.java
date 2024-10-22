package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Bl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0287Bl {
    public static String[] A04 = {"h73SRN04xx9GKM0Q116IBzLVfoAHdt6S", "61WNQ6jcFYZeo4haiLT", "EyZhmJMsuDDThnYHJcpUVdPGrs5jP", "TnJHvhzl2eIFPCvspzGh2UrXG1fvsdQe", "l4BIQ9QQurpAuznw483RtfLanfJA913P", "gUiFEUth", "CESv2iJEZOXF88qxXwTFJw16ZR0ZYHcV", "lPNbV4orIJCU5KxXMzdOHz5Kw4N4woU7"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final byte[] A03;

    public C0287Bl(int i, byte[] bArr, int i2, int i3) {
        this.A01 = i;
        this.A03 = bArr;
        this.A02 = i2;
        this.A00 = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            Class<?> cls = getClass();
            if (A04[5].length() == 24) {
                throw new RuntimeException();
            }
            A04[5] = "ISIjD6Kq";
            if (cls == obj.getClass()) {
                C0287Bl c0287Bl = (C0287Bl) obj;
                if (this.A01 == c0287Bl.A01 && this.A02 == c0287Bl.A02 && this.A00 == c0287Bl.A00 && Arrays.equals(this.A03, c0287Bl.A03)) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A01;
        int i = result * 31;
        int result2 = Arrays.hashCode(this.A03);
        int result3 = (((i + result2) * 31) + this.A02) * 31;
        int result4 = this.A00;
        return result3 + result4;
    }
}
