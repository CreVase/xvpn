package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Yt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0865Yt implements InterfaceC0531Lt {
    public static String[] A01 = {"JdxG2e87fiw1QxhKtyp6wy4hCZ34K54h", "5l6PiVFmWkFi4LSRmzN6ZIbVVY4PyA16", "qh41B7qjlQhNnOsbjTqj3JtjZfsrgLHf", "L6JKyztUTZrhaC2oSi2AGhNMneOalgfU", "mLvzPn8zSeH", "6Oneq6t5dYPlbDhRy7qxaYTJsizasisX", "J8", "lXMgpjBtmdYXVX4s4nwhe"};
    public final WeakReference<C5J> A00;

    public C0865Yt(C5J c5j) {
        this.A00 = new WeakReference<>(c5j);
    }

    public /* synthetic */ C0865Yt(C5J c5j, C5F c5f) {
        this(c5j);
    }

    private void A00(C5J c5j) {
        PK pk;
        RelativeLayout relativeLayout;
        pk = c5j.A0B;
        if (pk != null) {
            relativeLayout = c5j.A06;
            relativeLayout.bringChildToFront(pk);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0531Lt
    public final void A3P(View view, int i, RelativeLayout.LayoutParams layoutParams) {
        RelativeLayout relativeLayout;
        C5J c5j = this.A00.get();
        if (c5j != null) {
            relativeLayout = c5j.A06;
            relativeLayout.addView(view, i, layoutParams);
            A00(c5j);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0531Lt
    public final void A3Q(View view, RelativeLayout.LayoutParams layoutParams) {
        RelativeLayout relativeLayout;
        C5J c5j = this.A00.get();
        if (c5j != null) {
            relativeLayout = c5j.A06;
            relativeLayout.addView(view, layoutParams);
            A00(c5j);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0531Lt
    public void A3z(String str) {
        if (this.A00.get() != null) {
            this.A00.get().A0F(str);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0531Lt
    public void A40(String str, C8Y c8y) {
        if (this.A00.get() != null) {
            this.A00.get().A0H(str, c8y);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0531Lt
    public final void A98(String str, C1X c1x) {
        if (this.A00.get() != null) {
            C5J c5j = this.A00.get();
            String[] strArr = A01;
            if (strArr[0].charAt(19) != strArr[1].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[0] = "LaehfLm13EgRqqa58La6JsJDVjNkKsjm";
            strArr2[1] = "U7opStToMRhy5hKGwjx6Oh4Ofub1lgfJ";
            c5j.A0G(str, c1x);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0531Lt
    public final void AAl(int i) {
        C5J activityApi = this.A00.get();
        if (activityApi != null) {
            activityApi.finish(i);
        }
    }
}
