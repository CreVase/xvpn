package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public final class Y3 implements C7j {
    public static byte[] A04;
    public static String[] A05 = {"D3PJ2GNcgNGI4MtKfCaHjqEOfdHoPcVQ", "EJL0aGmI3i0Imoz4UWgpTxwTxGm9WRxT", "tfWCUNw0WGkvc5ldnWfg2BDK3aY0ceq2", "VYnzwe", "FWw4Dif8pFGferaZg4Cc6MDYh6zRU5", "BYQArfMrHiqwTG3fAjpcYjBOCFZN2nO4", "ZJiZak5asVL", "k4pPkd4ODWsyAa7ylPFb6IMORyuDH4"};
    public Context A00;
    public final InterfaceC01867i A02;
    public final AtomicBoolean A03 = new AtomicBoolean(false);
    public C01847g A01 = A00();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{107, Byte.MAX_VALUE, 96, 112, 124, 106, 123, 123, 102, 97, 104, 124, 112, 100, 106, 118};
    }

    static {
        A03();
    }

    public Y3(Context context, InterfaceC01867i interfaceC01867i) {
        this.A00 = context;
        this.A02 = interfaceC01867i;
    }

    private C01847g A00() {
        return C01847g.A00(C0481Jt.A00(this.A00).getString(A01(0, 16, 81), null));
    }

    private void A02() {
        this.A02.AA6(new Y4(this));
    }

    public final void A04(String[] strArr, Integer num, Integer num2) {
        C01847g c01847g = new C01847g(strArr, num, num2);
        C01847g newSettings = this.A01;
        if (c01847g.equals(newSettings)) {
            return;
        }
        this.A01 = c01847g;
        this.A03.set(true);
        SharedPreferences A00 = C0481Jt.A00(this.A00);
        if (A05[2].charAt(16) != 'n') {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[7] = "txsFPtaRD11LyA3dzoyK5U0Vbdrctz";
        strArr2[4] = "NLpqiEYsaOJ6LGl2A1qehjxsg53G43";
        SharedPreferences.Editor edit = A00.edit();
        C01847g newSettings2 = this.A01;
        edit.putString(A01(0, 16, 81), newSettings2.A07()).apply();
    }

    @Override // com.facebook.ads.redexgen.X.C7j
    public final C01847g A6c() {
        A02();
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.C7j
    public final boolean A92() {
        A02();
        if (this.A01 == null) {
            return false;
        }
        Set<String> A0Z = IP.A0Z(this.A00);
        String identifier = this.A01.A07();
        Iterator<String> it = A0Z.iterator();
        while (it.hasNext()) {
            if (identifier.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.C7j
    public final boolean AFY() {
        A02();
        return this.A03.getAndSet(false);
    }
}
