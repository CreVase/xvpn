package com.facebook.ads.redexgen.X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.internal.api.AdNativeComponentView;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public class UN extends AbstractC0642Qa {
    public static String[] A04 = {"oSoBkaWeyKsp", "KBeBF", "kSDces9j50gwfjS4QfNYnWgLw2iPkymV", "EJmszBWYtRUz1Vdq", "qn5qycmxyPd80aqzWiKeSrAoNfum3VnE", "21Cce2q6wYIDkABj", "e4Lw2G3U", "jRNkDTlKn5mABl6KQSYrYYCrXHx6B19g"};
    public final /* synthetic */ View A00;
    public final /* synthetic */ C0939ah A01;
    public final /* synthetic */ UJ A02;
    public final /* synthetic */ boolean A03;

    public UN(UJ uj, View view, boolean z, C0939ah c0939ah) {
        this.A02 = uj;
        this.A00 = view;
        this.A03 = z;
        this.A01 = c0939ah;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0642Qa
    public final void A00() {
        JE je;
        je = this.A02.A0e;
        je.A06();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0642Qa
    public final void A02() {
        JE je;
        je = this.A02.A0e;
        je.A0A();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0642Qa
    public final void A03() {
        JE je;
        JE je2;
        YA ya;
        C0643Qb c0643Qb;
        WeakReference weakReference;
        LN ln;
        JE je3;
        C0929aX c0929aX;
        View view;
        View view2;
        C0929aX c0929aX2;
        View view3;
        C0929aX c0929aX3;
        View view4;
        C0929aX c0929aX4;
        J7 j7;
        C0929aX c0929aX5;
        boolean z;
        C0929aX c0929aX6;
        boolean z2;
        C0929aX c0929aX7;
        boolean z3;
        C0929aX c0929aX8;
        boolean A0p;
        C0929aX c0929aX9;
        AnonymousClass10 anonymousClass10;
        C0929aX c0929aX10;
        boolean z4;
        C0929aX c0929aX11;
        NativeAdLayout nativeAdLayout;
        C0929aX c0929aX12;
        String str;
        C0929aX c0929aX13;
        C0929aX c0929aX14;
        WeakReference weakReference2;
        WeakReference weakReference3;
        C0643Qb c0643Qb2;
        Drawable drawable;
        C0643Qb c0643Qb3;
        JE je4;
        C0643Qb c0643Qb4;
        JE je5;
        je = this.A02.A0e;
        je.A0B();
        if (IP.A1k(this.A02.A11())) {
            View view5 = this.A00;
            if (view5 instanceof AdNativeComponentView) {
                View adContentsView = ((AdNativeComponentView) view5).getAdContentsView();
                if ((adContentsView instanceof C0622Pg) && !((C0622Pg) adContentsView).A02()) {
                    c0643Qb4 = this.A02.A0R;
                    c0643Qb4.A0T();
                    je5 = this.A02.A0e;
                    je5.A08();
                    return;
                }
            }
        }
        if (this.A03) {
            ImageView imageView = (ImageView) this.A00;
            if (A04[6].length() != 8) {
                throw new RuntimeException();
            }
            A04[4] = "kV1RqodiW8kqR1rQOQ4NCiAB35VpASKe";
            drawable = this.A02.A01;
            if (drawable == null) {
                c0643Qb3 = this.A02.A0R;
                c0643Qb3.A0T();
                je4 = this.A02.A0e;
                je4.A07();
                return;
            }
            UJ.A0e(drawable, imageView);
        }
        je2 = this.A02.A0e;
        ya = this.A02.A0c;
        je2.A0C(ya, this.A01.A0G());
        c0643Qb = this.A02.A0R;
        if (c0643Qb != null) {
            c0643Qb2 = this.A02.A0R;
            c0643Qb2.A0V();
        }
        weakReference = this.A02.A0V;
        if (weakReference != null) {
            weakReference2 = this.A02.A0V;
            if (weakReference2.get() != null) {
                weakReference3 = this.A02.A0V;
                ((AbstractC0642Qa) weakReference3.get()).A03();
            }
        }
        ln = this.A02.A0f;
        if (ln.A07()) {
            je3 = this.A02.A0e;
            je3.A04();
            return;
        }
        this.A02.A0b();
        c0929aX = this.A02.A09;
        if (c0929aX != null) {
            view = this.A02.A04;
            if (view != null) {
                view2 = this.A02.A06;
                if (view2 != null) {
                    c0929aX2 = this.A02.A09;
                    view3 = this.A02.A04;
                    c0929aX2.A08(view3);
                    c0929aX3 = this.A02.A09;
                    view4 = this.A02.A06;
                    c0929aX3.A07(view4);
                    c0929aX4 = this.A02.A09;
                    j7 = this.A02.A0I;
                    c0929aX4.A0B(j7);
                    c0929aX5 = this.A02.A09;
                    z = this.A02.A0W;
                    c0929aX5.A0E(z);
                    c0929aX6 = this.A02.A09;
                    z2 = this.A02.A0Z;
                    c0929aX6.A0I(z2);
                    c0929aX7 = this.A02.A09;
                    z3 = this.A02.A0Y;
                    c0929aX7.A0H(z3);
                    c0929aX8 = this.A02.A09;
                    A0p = this.A02.A0p();
                    c0929aX8.A0F(A0p);
                    c0929aX9 = this.A02.A09;
                    anonymousClass10 = this.A02.A08;
                    c0929aX9.A09(anonymousClass10);
                    c0929aX10 = this.A02.A09;
                    z4 = this.A02.A0X;
                    c0929aX10.A0G(z4);
                    c0929aX11 = this.A02.A09;
                    nativeAdLayout = this.A02.A07;
                    c0929aX11.A0A(MS.A00(nativeAdLayout));
                    c0929aX12 = this.A02.A09;
                    str = this.A02.A0S;
                    c0929aX12.A0C(str);
                    c0929aX13 = this.A02.A09;
                    c0929aX13.A0J(this.A03);
                    c0929aX14 = this.A02.A09;
                    c0929aX14.A02();
                }
            }
        }
    }
}
