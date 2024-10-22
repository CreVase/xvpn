package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.a9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0905a9 implements Ji {
    public static byte[] A0D;
    public static String[] A0E = {"4yJhIog9RzpC9w4XHjq79o6hmz2pMXrt", "bLneqHgNlbzxjE", "P7gevZ65hMGDm5VmgpkLcWEi46YxYduR", "Pajg2XTKXpS0pN0AoGLcPnQoa2IWF6Z7", "YyJRdl3XxpBTstTmsw", "OvgbPt0JG7dlaj99kqPbJKVmb9CPKTVr", "21VbiQWRKHmC0d4xB3zoTsbqXtN2ZOxw", "Q3Y9mBD7X4l0uaedlY7FP5X0xCsXbtIX"};
    public static final Handler A0F;
    public static final C00270t A0G = null;
    public static final C0472Jj A0H = null;
    public static final String A0I;
    public InterfaceC00220o A00;
    public InterfaceC00220o A01;
    public C8F A04;
    public C0470Jg A05;
    public AbstractC00230p A06;
    public final C00511r A07;
    public final InterfaceC0444If A08;
    public final C00270t A09;
    public final C0472Jj A0A;
    public final YA A0B;
    public volatile boolean A0C;
    public long A03 = -1;
    public String A02 = null;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 8);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0D = new byte[]{75, 110, 107, 122, 126, 111, 120, 42, 110, 101, 111, 121, 42, 100, 101, 126, 42, 111, 114, 99, 121, 126, 78, 107, 110, Byte.MAX_VALUE, 123, 106, 125, 47, 102, 124, 47, 97, 122, 99, 99, 47, 39, 108, 103, 110, 102, 97, 47, 97, 96, 123, 47, 99, 96, 110, 107, 106, 107, 38, 57, 28, 25, 8, 12, 29, 10, 88, 17, 11, 88, 22, 13, 20, 20, 88, 80, 27, 16, 25, 17, 22, 29, 28, 81, 45, 8, 13, 28, 24, 9, 30, 76, 5, 31, 76, 2, 25, 0, 0, 76, 68, 2, 3, 76, 15, 4, 13, 5, 2, 69, 78, 107, 110, Byte.MAX_VALUE, 123, 106, 125, 47, 102, 124, 47, 97, 122, 99, 99, 47, 96, 97, 47, 124, 123, 110, 125, 123, 78, 107, 5, 36, 107, 38, 36, 57, 46, 107, 42, 47, 107, 40, 42, 37, 47, 34, 47, 42, 63, 46, 56, 101, 122, 95, 66, 67, 74, 13, 76, 73, 76, 93, 89, 72, 95, 13, 89, 84, 93, 72, 3, 46, 43, 111, 46, 35, 61, 42, 46, 43, 54, 111, 60, 59, 46, 61, 59, 42, 43, 94, 91, 76, 52, 37, 60, 26, 17, 24, 16, 23, 38, 9, 24, 11, 24, 20, 10, 76, 91, 74, 79, 90, 79, 97, 76, 68, 75, 77, 90, 14, 71, 93, 14, 64, 91, 66, 66, 38, 45, 32, 49, 58, 51, 55, 38, 39, 28, 42, 39, 122, 113, 105, 118, 109, 112, 113, 114, 122, 113, 107, 63, 118, 108, 63, 122, 114, 111, 107, 102, 38, 50, 37, 49, 53, 37, 46, 35, 57, 31, 35, 33, 48, 48, 41, 46, 39, 28, 27, 3, 20, 25, 28, 17, 85, 5, 25, 20, 22, 16, 24, 16, 27, 1, 85, 28, 27, 85, 7, 16, 6, 5, 26, 27, 6, 16, 10, 9, 7, 2, 57, 18, 15, 11, 3, 57, 11, 21, 44, 59, 47, 43, 59, 45, 42, 1, 55, 58};
    }

    public abstract void A0L();

    public abstract void A0N(InterfaceC00220o interfaceC00220o, C8F c8f, C8D c8d, C00521s c00521s);

    static {
        A07();
        LX.A02();
        A0I = AbstractC0905a9.class.getSimpleName();
        A0F = new Handler(Looper.getMainLooper());
    }

    public AbstractC0905a9(YA ya, C00511r c00511r) {
        this.A0B = ya;
        this.A07 = c00511r;
        C0472Jj c0472Jj = A0H;
        if (c0472Jj != null) {
            this.A0A = c0472Jj;
        } else {
            this.A0A = new C0472Jj(ya);
        }
        this.A0A.A0P(this);
        C00270t c00270t = A0G;
        if (c00270t != null) {
            this.A09 = c00270t;
        } else {
            this.A09 = new C00270t();
        }
        DynamicLoaderFactory.makeLoader(ya).getInitApi().onAdLoadInvoked(ya);
        this.A08 = ya.A09();
        ya.A0E().A4n();
    }

    private void A08(U6 u6) {
        C8F placement = u6.A00();
        if (placement == null || placement.A05() == null) {
            String A06 = A06(279, 29, 125);
            JG error = new JG(AdErrorType.NO_AD_PLACEMENT, A06);
            this.A0B.A0E().A4p(error.A03().getErrorCode(), A06);
            AbstractC00230p abstractC00230p = this.A06;
            if (abstractC00230p != null) {
                abstractC00230p.A0G(error);
                return;
            }
            return;
        }
        this.A04 = placement;
        this.A00 = null;
        C8F c8f = this.A04;
        JSONObject A0A = c8f.A0A();
        String A062 = A06(195, 3, 93);
        if (A0A == null) {
            C8D A04 = c8f.A04();
            if (!A0C(c8f, A04)) {
                return;
            }
            if (this.A00 == null) {
                this.A0B.A07().A9M(A062, C01997x.A0a, new C02007y(A06(81, 26, 100), A04.A02()));
                ABH(JG.A00(AdErrorType.INTERNAL_ERROR));
                return;
            }
            C00521s loadConfig = new C00521s(A04.A04(), c8f.A05(), this.A07.A09, c8f.A05().A0C());
            A0N(this.A00, c8f, A04, loadConfig);
        } else {
            ArrayList arrayList = new ArrayList();
            C8D A042 = c8f.A04();
            do {
                if (arrayList.isEmpty()) {
                    if (A0C(c8f, A042)) {
                        arrayList.add(A042);
                    } else {
                        return;
                    }
                } else if (A0B(A042)) {
                    arrayList.add(A042);
                }
                A042 = c8f.A04();
            } while (A042 != null);
            if (this.A00 == null) {
                this.A0B.A07().A9M(A062, C01997x.A0a, new C02007y(A06(56, 25, 112), ((C8D) arrayList.get(0)).A02()));
                ABH(JG.A00(AdErrorType.INTERNAL_ERROR));
                return;
            }
            boolean z = false;
            try {
                if (arrayList.size() > 1 && this.A00.AFs()) {
                    JSONObject jSONObject = new JSONObject();
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(((C8D) it.next()).A04());
                    }
                    jSONObject.put(A06(192, 3, 55), jSONArray);
                    jSONObject.put(A06(198, 12, 113), c8f.A0A());
                    C00521s loadConfig2 = new C00521s(jSONObject, c8f.A05(), this.A07.A09, c8f.A05().A0C());
                    A0N(this.A00, c8f, A042, loadConfig2);
                    z = true;
                }
            } catch (Exception unused) {
                z = false;
            }
            if (!z) {
                if (arrayList.isEmpty()) {
                    JG A01 = JG.A01(AdErrorType.NO_FILL, A06(0, 0, 73));
                    this.A0B.A0E().A4p(A01.A03().getErrorCode(), A06(133, 22, 67));
                    AbstractC00230p abstractC00230p2 = this.A06;
                    if (abstractC00230p2 != null) {
                        abstractC00230p2.A0G(A01);
                        return;
                    }
                    return;
                }
                InterfaceC00220o interfaceC00220o = this.A00;
                String[] strArr = A0E;
                if (strArr[4].length() == strArr[1].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0E;
                strArr2[0] = "F2ixlBYVHNYJB4bAHADqJrSynawwg1yM";
                strArr2[5] = "djkwyiiWLTaQwWMcVWQWfq0o8Ww2Jgo9";
                if (interfaceC00220o == null) {
                    this.A0B.A07().A9M(A062, C01997x.A0a, new C02007y(A06(22, 34, 7), ((C8D) arrayList.get(0)).A02()));
                    ABH(JG.A00(AdErrorType.INTERNAL_ERROR));
                    return;
                }
                C8D c8d = (C8D) arrayList.get(0);
                A0N(this.A00, c8f, c8d, new C00521s(c8d.A04(), c8f.A05(), this.A07.A09, c8f.A05().A0C()));
            }
        }
        C00531t.A08(this.A0B.A01(), c8f);
    }

    private final void A09(String str, AdExperienceType adExperienceType) {
        this.A0B.A0E().A4q(str != null);
        this.A03 = System.currentTimeMillis();
        if (Build.VERSION.SDK_INT < 17) {
            ABH(new JG(AdErrorType.API_NOT_SUPPORTED, A06(0, 0, 73)));
            return;
        }
        try {
            C0470Jg A01 = this.A07.A01(this.A0B, new JQ(this.A0B, str, this.A07.A09, this.A07.A08), adExperienceType);
            this.A05 = A01;
            if (A0E[6].charAt(21) == '6') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[4] = "3q2wB1pMY3UXfOrLgu";
            strArr[1] = "CsXqAZILgfX2KA";
            this.A0A.A0O(A01);
        } catch (JH e) {
            ABH(JG.A02(e));
        }
    }

    private void A0A(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.A02 = jSONObject.optString(A06(230, 12, 75));
            C00290v.A01(this.A0B).A0O(jSONObject);
        }
    }

    private boolean A0B(C8D c8d) {
        return (c8d == null || c8d.A04() == null) ? false : true;
    }

    private boolean A0C(C8F c8f, C8D c8d) {
        String A06 = A06(0, 0, 73);
        if (c8d == null) {
            JG A01 = JG.A01(AdErrorType.NO_FILL, A06);
            this.A0B.A0E().A4p(A01.A03().getErrorCode(), A06(133, 22, 67));
            AbstractC00230p abstractC00230p = this.A06;
            if (abstractC00230p != null) {
                abstractC00230p.A0G(A01);
            }
            return false;
        }
        String A02 = c8d.A02();
        InterfaceC00220o A00 = this.A09.A00(this.A0B, c8f.A05().A0D());
        if (A00 == null) {
            this.A0B.A07().A9M(A06(195, 3, 93), C01997x.A0a, new C02007y(A06(0, 22, 2), A02));
            ABH(JG.A00(AdErrorType.INTERNAL_ERROR));
            return false;
        }
        if (this.A07.A00() != A00.A7W()) {
            JG A012 = JG.A01(AdErrorType.INTERNAL_ERROR, A06);
            this.A0B.A0E().A4p(A012.A03().getErrorCode(), A06(155, 19, 37));
            AbstractC00230p abstractC00230p2 = this.A06;
            if (abstractC00230p2 != null) {
                abstractC00230p2.A0G(A012);
            }
            return false;
        }
        this.A00 = A00;
        String[] strArr = A0E;
        if (strArr[4].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[0] = "MKxF4EMWgzzLH5X7HNcHVA2i4zdAiZz9";
        strArr2[5] = "4tfdEW2uI31voJBW941pIR5b1aNGKiQe";
        JSONObject A04 = c8d.A04();
        if (A04 != null) {
            String optString = A04.optString(A06(320, 10, 86));
            this.A0B.A0E().AFS(optString);
            this.A0B.A0C(optString);
            Y9 A002 = C7R.A00();
            if (A002 != null) {
                A002.A0C(optString);
            }
            JSONObject dataObject = A04.optJSONObject(A06(262, 17, 72));
            A0A(dataObject);
            if (this.A05 == null) {
                String A062 = A06(242, 20, 23);
                JG A013 = JG.A01(AdErrorType.UNKNOWN_ERROR, A062);
                this.A0B.A0E().A4p(A013.A03().getErrorCode(), A062);
                AbstractC00230p abstractC00230p3 = this.A06;
                if (abstractC00230p3 != null) {
                    abstractC00230p3.A0G(A013);
                }
                return false;
            }
            return true;
        }
        String A063 = A06(212, 18, 38);
        JG A014 = JG.A01(AdErrorType.UNKNOWN_ERROR, A063);
        this.A0B.A0E().A4p(A014.A03().getErrorCode(), A063);
        AbstractC00230p abstractC00230p4 = this.A06;
        if (abstractC00230p4 != null) {
            abstractC00230p4.A0G(A014);
        }
        return false;
    }

    public final long A0D() {
        C8F c8f = this.A04;
        if (c8f != null) {
            return c8f.A03();
        }
        return -1L;
    }

    public final Handler A0E() {
        return A0F;
    }

    public C1C A0F() {
        return ((AbstractC0928aW) this.A01).A0H();
    }

    public final C8G A0G() {
        C8F c8f = this.A04;
        if (c8f == null) {
            return null;
        }
        return c8f.A05();
    }

    public final void A0H() {
        String A6N;
        this.A0B.A0E().A2m(LM.A01(this.A03));
        InterfaceC00220o interfaceC00220o = this.A01;
        if (interfaceC00220o == null || (A6N = interfaceC00220o.A6N()) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        String A04 = LM.A04(this.A03);
        String clientToken = A06(308, 12, 110);
        hashMap.put(clientToken, A04);
        new C0452In(A6N, this.A08).A04(EnumC0451Im.A08, hashMap);
    }

    public final void A0I() {
        InterfaceC00220o interfaceC00220o = this.A01;
        String A06 = A06(195, 3, 93);
        if (interfaceC00220o == null) {
            String A062 = A06(107, 26, 7);
            this.A0B.A07().A9M(A06, C01997x.A0Q, new C02007y(A062));
            AdErrorType adErrorType = AdErrorType.INTERNAL_ERROR;
            this.A0B.A0E().A4p(adErrorType.getErrorCode(), A062);
            AbstractC00230p abstractC00230p = this.A06;
            if (abstractC00230p != null) {
                String errorMessage = adErrorType.getDefaultErrorMessage();
                abstractC00230p.A0G(JG.A01(adErrorType, errorMessage));
            }
            this.A0B.A0E().A4s();
            return;
        }
        if (this.A0C) {
            String A063 = A06(174, 18, 71);
            this.A0B.A07().A9M(A06, C01997x.A0M, new C02007y(A063));
            AdErrorType adErrorType2 = AdErrorType.AD_ALREADY_STARTED;
            this.A0B.A0E().A4p(adErrorType2.getErrorCode(), A063);
            AbstractC00230p abstractC00230p2 = this.A06;
            if (abstractC00230p2 != null) {
                String errorMessage2 = adErrorType2.getDefaultErrorMessage();
                abstractC00230p2.A0G(JG.A01(adErrorType2, errorMessage2));
            }
            this.A0B.A0E().A4r();
            return;
        }
        if (!TextUtils.isEmpty(this.A01.A6N())) {
            this.A08.A9h(this.A01.A6N());
        }
        this.A0B.A0E().A4t();
        this.A0C = true;
        A0L();
    }

    public final void A0J() {
        A0T(false);
    }

    public final void A0K() {
        if (this.A02 != null) {
            C00290v.A01(this.A0B).A0N(this.A02);
        }
    }

    public final void A0M(InterfaceC00220o interfaceC00220o) {
        if (interfaceC00220o != null) {
            interfaceC00220o.onDestroy();
        }
    }

    public final void A0O(AbstractC00230p abstractC00230p) {
        this.A06 = abstractC00230p;
    }

    public final void A0P(C00521s c00521s) {
        this.A0B.A0E().A4m();
        String clientToken = c00521s.A03().optString(A06(210, 2, 39));
        if (!TextUtils.isEmpty(clientToken)) {
            C0452In funnelLoggingHandler = new C0452In(clientToken, this.A08);
            funnelLoggingHandler.A04(EnumC0451Im.A04, null);
        }
    }

    public void A0Q(String str) {
        A09(str, null);
    }

    public final void A0R(String str) {
        A0Q(str);
    }

    public final void A0S(String str, AdExperienceType adExperienceType) {
        A09(str, adExperienceType);
    }

    public void A0T(boolean z) {
        if (!z && !this.A0C) {
            return;
        }
        this.A0B.A0E().A4u();
        A0M(this.A01);
        this.A0C = false;
    }

    public final boolean A0U() {
        C8F c8f = this.A04;
        return c8f == null || c8f.A0D();
    }

    @Override // com.facebook.ads.redexgen.X.Ji
    public final synchronized void ABH(JG jg) {
        A0E().post(new C0906aA(this, jg));
    }

    @Override // com.facebook.ads.redexgen.X.Ji
    public final synchronized void AD5(U6 u6) {
        try {
            A08(u6);
        } catch (Exception e) {
            this.A0B.A07().A9M(A06(195, 3, 93), C01997x.A0T, new C02007y(e));
        }
    }
}
