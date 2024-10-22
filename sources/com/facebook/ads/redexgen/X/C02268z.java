package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.8z, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C02268z extends AbstractC0577Nn {
    public static byte[] A01;
    public final /* synthetic */ OZ A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 17);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-78, -65, -65, -68, -65};
    }

    public C02268z(OZ oz) {
        this.A00 = oz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC02028a
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(OK ok) {
        OY oy;
        JSONObject A03;
        new Handler(Looper.getMainLooper()).post(new OX(this));
        oy = this.A00.A0B;
        A03 = this.A00.A03();
        oy.ADO(A00(0, 5, 60), A03);
    }
}
