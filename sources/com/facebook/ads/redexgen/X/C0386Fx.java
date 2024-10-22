package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: com.facebook.ads.redexgen.X.Fx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0386Fx implements InterfaceC0988bb {
    public final /* synthetic */ C0987ba A00;

    public C0386Fx(C0987ba c0987ba) {
        this.A00 = c0987ba;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0988bb
    public final void ACr() {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        InterfaceC0988bb interfaceC0988bb;
        InterfaceC0988bb interfaceC0988bb2;
        linkedHashMap = this.A00.A06;
        synchronized (linkedHashMap) {
            linkedHashMap2 = this.A00.A06;
            arrayList = new ArrayList(linkedHashMap2.size());
            linkedHashMap3 = this.A00.A06;
            for (Runnable runnable : linkedHashMap3.values()) {
                if (runnable != null) {
                    arrayList.add(runnable);
                }
            }
            linkedHashMap4 = this.A00.A06;
            linkedHashMap4.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        interfaceC0988bb = this.A00.A01;
        if (interfaceC0988bb == null) {
            return;
        }
        interfaceC0988bb2 = this.A00.A01;
        interfaceC0988bb2.ACr();
    }
}
