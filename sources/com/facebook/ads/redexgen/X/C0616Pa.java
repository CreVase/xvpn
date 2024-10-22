package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Pa, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0616Pa {
    public static byte[] A09;
    public static String[] A0A = {"gG8B5BBzXX0tXn8mAXm3GrlCsmKREgEL", "fszKDaGs6AGUXXOQg2WnNIBtS95Yz1Wh", "pnaE4meNhzrzHKSDh8PgaIlwU76aGgw8", "2ARCPk0NRRRG", "SMbVAXo8eG5PUWUAvoNRrVLTO99Zprm", "yA01QlsAfT3JJVyfy2ZKp77MLzjsBWHz", "Xgpz8alFBhAPNTQJpcXFzk4NTQQyuYWJ", "Svb9BuXOcdwLltO0M440Yd8RGfHrN1wk"};
    public final YA A00;
    public final InterfaceC0444If A01;
    public final RX A02;
    public final AbstractC0591Ob A03;
    public final AbstractC0576Nm A04;
    public final MU A05;
    public final C0688Ru A06;
    public final String A07;
    public final Map<String, String> A08;

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 96);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A09 = new byte[]{62, 42, 57, 53, 61, 43};
    }

    static {
        A08();
    }

    public C0616Pa(YA ya, InterfaceC0444If interfaceC0444If, RX rx, String str, Map<String, String> extraParams) {
        AbstractC0576Nm abstractC0576Nm = new AbstractC0576Nm() { // from class: com.facebook.ads.redexgen.X.7F
            public static String[] A01 = {"m3H5fDZT", "tfUidThth72U8se7Apa4PT2ZGwk9ZGOU", "C7sqCneijRx2oiAJ7jgCjnbvSplD6Hvu", "CUEN1UWJGCJ8qOG4MMTMPK9Ub", "uwIe", "I7QxkSDWYBotgEGySbiUy5NvkBUV0QEh", "dizwBFytggLGpocgnk6CXcKxg", "vsUFvcPPfrfWhSaT8AiBmEZ9b5CjjyAT"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC02028a
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass73 anonymousClass73) {
                String str2;
                C0688Ru c0688Ru;
                str2 = C0616Pa.this.A07;
                C0689Rv c0689Rv = new C0689Rv(str2, anonymousClass73.A03(), anonymousClass73.A01(), anonymousClass73.A02());
                if (anonymousClass73.A00() >= 0.05d) {
                    c0689Rv.A06(anonymousClass73.A01());
                }
                c0688Ru = C0616Pa.this.A06;
                c0688Ru.A0C(c0689Rv);
                String[] strArr = A01;
                if (strArr[6].length() == strArr[0].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[2] = "q64iGrGvaw5ijPmr6ZKPys7vT4QnDerr";
                strArr2[5] = "OAtIhinrRl4iSEKbz1e7g3lvuawk4XhB";
            }
        };
        this.A04 = abstractC0576Nm;
        MU mu = new MU() { // from class: com.facebook.ads.redexgen.X.7D
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC02028a
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass72 anonymousClass72) {
                C0616Pa.this.A09();
            }
        };
        this.A05 = mu;
        AbstractC0591Ob abstractC0591Ob = new AbstractC0591Ob() { // from class: com.facebook.ads.redexgen.X.7C
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC02028a
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass75 anonymousClass75) {
                C0616Pa.this.A09();
            }
        };
        this.A03 = abstractC0591Ob;
        this.A00 = ya;
        this.A01 = interfaceC0444If;
        this.A07 = str;
        this.A08 = extraParams;
        this.A02 = rx;
        this.A06 = new C0688Ru(str);
        rx.getEventBus().A03(abstractC0576Nm, mu, abstractC0591Ob);
    }

    private Map<String, String> A07(String str) {
        HashMap hashMap = new HashMap();
        Map<String, String> map = this.A08;
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put(A05(0, 6, 56), str);
        return hashMap;
    }

    public final void A09() {
        String A04 = C0688Ru.A04(this.A06.A0B());
        if (A04 != null) {
            InterfaceC0444If interfaceC0444If = this.A01;
            if (A0A[4].length() == 13) {
                throw new RuntimeException();
            }
            A0A[3] = "qc6G14080U";
            String encodedFrameData = this.A07;
            interfaceC0444If.A9f(encodedFrameData, A07(A04));
        }
    }

    public final void A0A() {
        C0670Rc c0670Rc = new C0670Rc(this);
        if (this.A02.A0l()) {
            LP.A00(c0670Rc);
        } else {
            this.A02.getStateHandler().post(c0670Rc);
        }
    }
}
