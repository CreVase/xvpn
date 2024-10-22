package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.Ty, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0743Ty implements LB {
    public final Collection<String> A00;

    public C0743Ty() {
        this.A00 = new ArrayList();
    }

    @Override // com.facebook.ads.redexgen.X.LB
    public final void ADy(String str) {
        this.A00.add(str);
    }

    @Override // com.facebook.ads.redexgen.X.LB
    public final void flush() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.A00.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append('\n');
        }
        return sb.toString();
    }
}
