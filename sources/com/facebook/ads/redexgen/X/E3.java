package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class E3 {
    public final GZ A00;
    public final InterfaceC0390Gb A01;
    public final InterfaceC0390Gb A02;
    public final H2 A03;
    public final C0424Hl A04;

    public E3(H2 h2, InterfaceC0390Gb interfaceC0390Gb) {
        this(h2, interfaceC0390Gb, null, null, null);
    }

    public E3(H2 h2, InterfaceC0390Gb interfaceC0390Gb, InterfaceC0390Gb interfaceC0390Gb2, GZ gz, C0424Hl c0424Hl) {
        HI.A01(interfaceC0390Gb);
        this.A03 = h2;
        this.A02 = interfaceC0390Gb;
        this.A01 = interfaceC0390Gb2;
        this.A00 = gz;
        this.A04 = c0424Hl;
    }

    public final H2 A00() {
        return this.A03;
    }

    public final V0 A01(boolean z) {
        InterfaceC0391Gc vd;
        V1 v1;
        InterfaceC0390Gb interfaceC0390Gb = this.A01;
        if (interfaceC0390Gb != null) {
            vd = interfaceC0390Gb.A4U();
        } else {
            vd = new VD();
        }
        if (z) {
            return new V0(this.A03, VE.A02, vd, null, 1, null);
        }
        GZ gz = this.A00;
        if (gz != null) {
            v1 = gz.createDataSink();
        } else {
            v1 = new V1(this.A03, 2097152L);
        }
        InterfaceC0391Gc A4U = this.A02.A4U();
        C0424Hl c0424Hl = this.A04;
        if (c0424Hl != null) {
            A4U = new V5(A4U, c0424Hl, -1000);
        }
        InterfaceC0391Gc upstream = vd;
        return new V0(this.A03, A4U, upstream, v1, 1, null);
    }

    public final C0424Hl A02() {
        C0424Hl c0424Hl = this.A04;
        return c0424Hl != null ? c0424Hl : new C0424Hl();
    }
}
