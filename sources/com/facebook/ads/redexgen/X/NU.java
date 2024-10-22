package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class NU implements DialogInterface.OnClickListener {
    public final /* synthetic */ NW A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ Map A02;

    public NU(NW nw, String str, Map map) {
        this.A00 = nw;
        this.A01 = str;
        this.A02 = map;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        InterfaceC0444If interfaceC0444If;
        interfaceC0444If = this.A00.A05;
        interfaceC0444If.A9n(this.A01, this.A02);
    }
}
