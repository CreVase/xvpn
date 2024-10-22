package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0540Mc implements View.OnClickListener {
    public static String[] A02 = {"Oq", "EvGClE7if1wWI664DgGuGJMVxIj5MmF8", "WEj5b", "ZnP49bXAxkKFgNqp8", "Y2wBPaH57L9Gttlp", "AMrJJ9So27w7KiYttAq3AFMsZzT3RVfH", "8te6O8WI5P7ERWBX", "5xXH0hCktOzz8vKUWRcLVJoUpm5lTBxe"};
    public final /* synthetic */ MV A00;
    public final /* synthetic */ TN A01;

    public ViewOnClickListenerC0540Mc(TN tn, MV mv) {
        this.A01 = tn;
        this.A00 = mv;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (K0.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0B.AC6(C2I.A05);
        } catch (Throwable th) {
            if (A02[5].charAt(20) == 'D') {
                throw new RuntimeException();
            }
            A02[2] = "snOHg";
            K0.A00(th, this);
        }
    }
}
