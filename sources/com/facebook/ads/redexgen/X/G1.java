package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public class G1 implements InterfaceC0997bk {
    public final List<InterfaceC0998bl> A00 = new ArrayList();

    @Override // com.facebook.ads.redexgen.X.InterfaceC0997bk
    public final InterfaceC0998bl A5m(int i) {
        return this.A00.get(i);
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC0998bl> iterator() {
        return this.A00.iterator();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0997bk
    public final int size() {
        return this.A00.size();
    }
}
