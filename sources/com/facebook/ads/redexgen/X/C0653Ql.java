package com.facebook.ads.redexgen.X;

import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.Ql, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0653Ql {
    public C0657Qp A00;
    public Set<String> A01;
    public Set<String> A02;
    public boolean A03;
    public boolean A04 = true;

    public final C0653Ql A00(C0657Qp c0657Qp) {
        this.A00 = c0657Qp;
        return this;
    }

    public final C0653Ql A01(Set<String> pinnedCertificates) {
        this.A01 = pinnedCertificates;
        return this;
    }

    public final C0653Ql A02(Set<String> pinnedPublicKeys) {
        this.A02 = pinnedPublicKeys;
        return this;
    }

    public final C0653Ql A03(boolean z) {
        this.A04 = z;
        return this;
    }

    public final C0653Ql A04(boolean z) {
        this.A03 = z;
        return this;
    }

    public final C0654Qm A05() {
        return new C0654Qm(this.A00, this.A04, this.A02, this.A01, this.A03);
    }
}
