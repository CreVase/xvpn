package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0550Mm implements View.OnClickListener {
    public static String[] A02 = {"TIunxDtIhaUNWzp4pt", "P9jotymXcalp6QY0mceKgA2PKmpL9MmY", "D7hcdAR4gL6eiDwh3neEemk2oNa5HBXr", "yvexzu4B1k7dNWe8D7Or2RByN379E6p0", "Pqli68R1jGGut3mXcbdL9aII4ZRM", "ATTETBfRTuy9XX9zcQNEfkNPOGv1roB9", "U61xFgZvYwebvbfIgBzckGL9tuihnAsk", "Y5vLZmHyGlb7iKoGDQtiStGzi5AFA8c4"};
    public final /* synthetic */ MV A00;
    public final /* synthetic */ TM A01;

    public ViewOnClickListenerC0550Mm(TM tm, MV mv) {
        this.A01 = tm;
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
            K0.A00(th, this);
            String[] strArr = A02;
            if (strArr[3].charAt(16) != strArr[7].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[5] = "30YalsquWEYpd1gcKbt6iXjPGudeG4qT";
            strArr2[1] = "9GHMqcINuHB0R6Mj0oiZfCiPilEGiYS9";
        }
    }
}
