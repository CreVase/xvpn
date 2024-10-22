package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Zf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0877Zf implements LE<Bundle> {
    public static byte[] A03;
    public final C2F A00;
    public final InterfaceC0623Ph A01;
    public final List<C0876Ze> A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 49);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{126, 121, 108, 121, 100, 126, 121, 100, 110, 126, 106, 123, 109, 106, 109};
    }

    public C0877Zf(List<C2D> list, Bundle bundle, InterfaceC0623Ph interfaceC0623Ph) {
        this.A02 = new ArrayList(list.size());
        this.A01 = interfaceC0623Ph;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(A00(10, 5, 15));
        for (int i = 0; i < list.size(); i++) {
            this.A02.add(new C0876Ze(list.get(i), (Bundle) parcelableArrayList.get(i)));
        }
        this.A00 = (C2F) L8.A00(bundle.getByteArray(A00(0, 10, 28)));
    }

    public C0877Zf(List<C2D> list, InterfaceC0623Ph interfaceC0623Ph) {
        this.A02 = new ArrayList(list.size());
        this.A01 = interfaceC0623Ph;
        Iterator<C2D> it = list.iterator();
        while (it.hasNext()) {
            this.A02.add(new C0876Ze(it.next()));
        }
        this.A00 = new C2F();
    }

    public final Bundle A02() {
        Bundle bundle = new Bundle();
        bundle.putByteArray(A00(0, 10, 28), L8.A01(this.A00));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.A02.size());
        Iterator<C0876Ze> it = this.A02.iterator();
        while (it.hasNext()) {
            Bundle bundle2 = it.next().A05();
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList(A00(10, 5, 15), arrayList);
        return bundle;
    }

    public final C2F A03() {
        return this.A00;
    }

    public final void A04() {
        this.A00.A03();
        Iterator<C0876Ze> it = this.A02.iterator();
        while (it.hasNext()) {
            it.next().A06();
        }
    }

    public final void A05() {
        this.A00.A02();
    }

    public final void A06(double d, double d2) {
        if (d2 >= 0.0d) {
            this.A00.A05(d, d2);
        }
        double A8B = this.A01.A8B();
        this.A00.A04(d, A8B);
        Iterator<C0876Ze> it = this.A02.iterator();
        while (it.hasNext()) {
            it.next().A07(d, A8B);
        }
    }
}
