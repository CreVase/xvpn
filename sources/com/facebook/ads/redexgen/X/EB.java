package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class EB extends C0865Yt {
    public static String[] A00 = {"ebBTtcDfrXbt7XUNv2xXXzukgR", "AfSrg72OINfokWlk8lEehE43rER54C5K", "DLWRAT6zkYb5ZQ4lVerhsjeXnJdmq546", "HcA6UXt4lgXnqoCqWVxSHZRcl", "xLJGdEWbtHtgosfXVcR1IwW", "KlZdBiYd7CYsgOQcQxjIKqODuE8wujbn", "gwTEk6Fa0GjLNEZ2sqovA8E7SRT86ppt", "mobLesdsIst7Z6gfBQK3QOgi9WAmLStS"};

    public EB(C5J c5j) {
        super(c5j, null);
    }

    public /* synthetic */ EB(C5J c5j, C5F c5f) {
        this(c5j);
    }

    @Override // com.facebook.ads.redexgen.X.C0865Yt, com.facebook.ads.redexgen.X.InterfaceC0531Lt
    public final void A3z(String str) {
        if (this.A00.get() == null) {
            return;
        }
        C5J c5j = this.A00.get();
        if (A00[1].charAt(12) != 'k') {
            throw new RuntimeException();
        }
        A00[0] = "wcnlDkVPCotGmNFV8gEH10X6";
        c5j.A0F(str);
        String A02 = EnumC0628Pm.A08.A02();
        String rewardedVideoError = EnumC0628Pm.A09.A02();
        if (str.equals(A02)) {
            this.A00.get().finish(11);
        } else if (str.equals(rewardedVideoError)) {
            this.A00.get().finish(12);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0865Yt, com.facebook.ads.redexgen.X.InterfaceC0531Lt
    public final void A40(String str, C8Y c8y) {
        super.A40(str, c8y);
    }
}
