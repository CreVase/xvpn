package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.ah, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0939ah implements InterfaceC00180j, InterfaceC00220o {
    public static byte[] A0A;
    public static String[] A0B = {"OTBhn", "woE0GsYsDC", "jJJsRhZ6eh", "RbmDZKGZyk", "MbYnCV2deeCvNEpfUSPgn7RvJuamywdV", "va4Mi1JJiq4w08mNkhVxy34L1bzftr4W", "QQZqW8pW387BdDH3gcXSwYVoWAeaIxNz", "E72k8"};
    public static final String A0C;
    public int A00;
    public AnonymousClass12 A01;
    public AnonymousClass13 A02;
    public J3 A03;
    public List<UJ> A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final YA A09;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 106);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0A = new byte[]{124, 89, 92, 77, 73, 88, 79, 29, 92, 81, 79, 88, 92, 89, 68, 29, 81, 82, 92, 89, 88, 89, 29, 89, 92, 73, 92, 93, 114, 119, 125, 117, 62, 118, Byte.MAX_VALUE, 110, 110, 123, 112, 123, 122, 62, 113, 112, 62, 114, 113, 125, 117, 109, 125, 108, 123, 123, 112, 62, Byte.MAX_VALUE, 122, 104, 71, 66, 72, 64, 11, 71, 68, 76, 76, 78, 79, 45, 26, 26, 7, 26, 72, 13, 16, 13, 11, 29, 28, 1, 6, 15, 72, 9, 11, 28, 1, 7, 6, 64, 66, 81, 71, 64, 77, 87, 54, 52, 39, 49, 60, 59, 49, 92, 75, 48, 45, 34, 51, 48, 43, 44, 55, 66, 93, 81, 67};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private void A06(Map<String, String> map, Map<String, String> map2) {
        try {
            new Handler().postDelayed(new C0940ai(this, map2, A03(map)), this.A01.A07() * 1000);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final void A0M(Map<String, String> map) {
        if (A0T()) {
            if (IP.A1c(this.A09) && LW.A03(map)) {
                String str = A0C;
                if (A0B[4].charAt(15) != 'f') {
                    throw new RuntimeException();
                }
                A0B[6] = "D3JUlaax70Z19DqZX7Vx94n8SobUQcIP";
                Log.e(str, A02(27, 31, 116));
                return;
            }
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            C0496Ki.A02(this.A09, A02(58, 12, 65));
            AnonymousClass13 anonymousClass13 = this.A02;
            if (anonymousClass13 != null) {
                anonymousClass13.ACA(this);
            }
            if (this.A01.A0h()) {
                hashMap.put(A02(99, 7, 63), String.valueOf(A0E().A04()));
                hashMap.put(A02(92, 7, 73), String.valueOf(A0E().A03()));
            }
            YA ya = this.A09;
            AbstractC00150g A00 = C00160h.A00(ya, ya.A09(), this.A01.A0Y(), this.A01.A0B(), hashMap, null);
            if (A00 != null) {
                try {
                    A00.A0C();
                } catch (Exception e) {
                    Log.e(A0C, A02(70, 22, 2), e);
                }
            }
        }
    }

    static {
        A04();
        A0C = C0939ah.class.getSimpleName();
    }

    public C0939ah(YA ya) {
        this(ya, new AnonymousClass12());
    }

    public C0939ah(YA ya, AnonymousClass12 anonymousClass12) {
        this.A00 = 200;
        this.A01 = anonymousClass12;
        this.A09 = ya;
    }

    private Map<String, String> A03(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        String A02 = A02(116, 4, 94);
        if (map.containsKey(A02)) {
            hashMap.put(A02, map.get(A02));
        }
        String A022 = A02(108, 8, 41);
        if (map.containsKey(A022)) {
            hashMap.put(A022, map.get(A022));
        }
        return hashMap;
    }

    private void A05(AnonymousClass12 anonymousClass12) {
        if (!this.A05) {
            this.A01 = anonymousClass12;
            List<AnonymousClass12> A0f = anonymousClass12.A0f();
            if (A0f != null && A0f.size() > 0) {
                int size = A0f.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    C0939ah adapter = new C0939ah(this.A09);
                    adapter.A05(A0f.get(i));
                    arrayList.add(new UJ(this.A09, adapter, (C8G) null, this.A03));
                }
                this.A04 = arrayList;
            }
            this.A05 = true;
            this.A06 = A07();
            return;
        }
        throw new IllegalStateException(A02(0, 27, 87));
    }

    private boolean A07() {
        if (((!this.A01.A0h() && !TextUtils.isEmpty(this.A01.A0W())) || (!TextUtils.isEmpty(this.A01.A0T()) && this.A01.A0h())) && (this.A01.A0G() != null || this.A01.A0h())) {
            J4 A0F = this.A01.A0F();
            if (A0B[2].length() != 10) {
                throw new RuntimeException();
            }
            A0B[6] = "coz4LHwVNN2LSDndRSBnj9WvwXuRM5HO";
            if (A0F != null || A7W() == AdPlacementType.NATIVE_BANNER) {
                return true;
            }
        }
        return false;
    }

    public final int A08() {
        return this.A01.A02();
    }

    public final int A09() {
        return this.A01.A05();
    }

    public final int A0A() {
        int A06 = this.A01.A06();
        if (A06 < 0 || A06 > 100) {
            return 0;
        }
        return A06;
    }

    public final int A0B() {
        return this.A00;
    }

    public final int A0C() {
        return this.A01.A08();
    }

    public final int A0D() {
        return this.A01.A09();
    }

    public final AnonymousClass12 A0E() {
        return this.A01;
    }

    public final AnonymousClass13 A0F() {
        return this.A02;
    }

    public final String A0G() {
        return this.A01.A0a();
    }

    public final List<UJ> A0H() {
        if (!A0T()) {
            return null;
        }
        return this.A04;
    }

    public final void A0I() {
        if (!this.A08) {
            String A0b = A0E().A0b();
            if (A0B[2].length() != 10) {
                throw new RuntimeException();
            }
            A0B[5] = "8ArINtb0xmmgo9NmELWQk3NiIhKYvaDc";
            if (A0b != null) {
                this.A09.A09().ADr(A0b);
            }
            this.A08 = true;
        }
    }

    public final void A0J() {
        Iterator<UJ> it;
        List<UJ> list = this.A04;
        if (list == null) {
            return;
        }
        boolean isEmpty = list.isEmpty();
        if (A0B[6].charAt(13) != 'D') {
            throw new RuntimeException();
        }
        A0B[6] = "kj4WnsmCok25qDrlf1kxSYggARLvW33C";
        if (!isEmpty) {
            List<UJ> list2 = this.A04;
            if (A0B[2].length() != 10) {
                it = list2.iterator();
            } else {
                A0B[2] = "wGXHpE1nya";
                it = list2.iterator();
            }
            while (true) {
                boolean hasNext = it.hasNext();
                if (A0B[2].length() != 10) {
                    A0B[6] = "0lb5BUzW8n1EJDWyWAqaA7d0lZJNpkzV";
                    if (!hasNext) {
                        return;
                    }
                } else {
                    A0B[5] = "QJQdkpg5cmGOeaue26HVF3aLtsB2qwfM";
                    if (!hasNext) {
                        return;
                    }
                }
                it.next().unregisterView();
            }
        }
    }

    public final void A0K(AnonymousClass13 anonymousClass13) {
        this.A02 = anonymousClass13;
    }

    public final void A0L(YA ya, AnonymousClass13 anonymousClass13, InterfaceC0444If interfaceC0444If, C00521s c00521s, J3 j3) {
        int i;
        this.A02 = anonymousClass13;
        this.A03 = j3;
        JSONObject A03 = c00521s.A03();
        C8G A01 = c00521s.A01();
        if (A01 != null) {
            i = A01.A06();
        } else {
            i = 200;
        }
        this.A00 = i;
        A05(AnonymousClass14.A00(ya, A03, L0.A02(A03, A02(106, 2, 85))));
        if (C00190k.A06(ya, this, interfaceC0444If)) {
            ya.A0E().A4H();
            anonymousClass13.ACE(this, JG.A00(AdErrorType.NO_FILL));
        } else if (anonymousClass13 != null) {
            anonymousClass13.ACB(this);
        }
    }

    public final void A0N(Map<String, String> extraData) {
        this.A09.A09().A9I(this.A01.A0Y(), extraData);
    }

    public final void A0O(Map<String, String> map) {
        if (A0T() && !this.A07) {
            AnonymousClass13 anonymousClass13 = this.A02;
            if (anonymousClass13 != null) {
                anonymousClass13.ACC(this);
            }
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            if (this.A01.A0h()) {
                hashMap.put(A02(99, 7, 63), String.valueOf(A0E().A04()));
                hashMap.put(A02(92, 7, 73), String.valueOf(A0E().A03()));
            }
            if (!TextUtils.isEmpty(A6N())) {
                if (!this.A01.A0h()) {
                    this.A09.A0E().A2g();
                    C2C.A00(this.A01.A0Z());
                }
                this.A09.A09().A9S(A6N(), hashMap);
            }
            if (A0V() || A0W()) {
                A06(map, hashMap);
            }
            this.A07 = true;
        }
    }

    public final void A0P(Map<String, String> extraData) {
        this.A09.A09().A9n(this.A01.A0Y(), extraData);
    }

    public final void A0Q(Map<String, String> extraData) {
        this.A09.A09().A9o(this.A01.A0Y(), extraData);
    }

    public final boolean A0R() {
        return true;
    }

    public final boolean A0S() {
        return A0T() && this.A01.A0B() != null;
    }

    public final boolean A0T() {
        return this.A05 && this.A06;
    }

    public final boolean A0U() {
        return this.A01.A0g();
    }

    public final boolean A0V() {
        if (IP.A1C(this.A09) && A0T()) {
            boolean A0i = this.A01.A0i();
            if (A0B[4].charAt(15) != 'f') {
                throw new RuntimeException();
            }
            A0B[6] = "hsrOxssvGH6abDOIeI9T6FJFSNjQSl4a";
            if (A0i) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0W() {
        if (IP.A1C(this.A09) && A0T()) {
            boolean A0j = this.A01.A0j();
            String[] strArr = A0B;
            if (strArr[0].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A0B[2] = "qputmJyOXU";
            if (A0j) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00180j
    public final String A6N() {
        return this.A01.A0Y();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00180j
    public final Collection<String> A6g() {
        return A0E().A0e();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00180j
    public final EnumC00170i A77() {
        return A0E().A0C();
    }

    public AdPlacementType A7W() {
        return AdPlacementType.NATIVE;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00220o
    public final boolean AFs() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00220o
    public final void onDestroy() {
    }
}
