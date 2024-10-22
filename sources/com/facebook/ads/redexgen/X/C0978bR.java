package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.bR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0978bR {
    public final InterfaceC0982bV A00;
    public final String A01;
    public final Collection<C0993bg> A02;
    public final Collection<C0993bg> A03;
    public final List<Rect> A04;

    public C0978bR(String str, InterfaceC0982bV interfaceC0982bV, List<Rect> rects, Collection<C0993bg> collection, Collection<C0993bg> collection2) {
        this.A01 = str;
        this.A00 = interfaceC0982bV;
        this.A04 = new ArrayList(rects);
        this.A02 = collection;
        this.A03 = collection2;
    }
}
