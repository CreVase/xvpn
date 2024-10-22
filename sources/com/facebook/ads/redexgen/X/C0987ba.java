package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.ba, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0987ba {
    public InterfaceC0990bd A00;
    public InterfaceC0988bb A01;
    public C0975bO A02;
    public final InterfaceC0997bk A04;
    public final InterfaceC0989bc A05;
    public final LinkedHashMap<Integer, Runnable> A06 = new LinkedHashMap<>();
    public final InterfaceC0988bb A03 = new C0386Fx(this);

    public C0987ba(InterfaceC0997bk interfaceC0997bk, InterfaceC0989bc interfaceC0989bc) {
        this.A04 = interfaceC0997bk;
        this.A05 = interfaceC0989bc;
    }

    public static C0987ba A01() {
        return new C0987ba(new G1(), null);
    }

    private void A03(AbstractC0991be abstractC0991be, InterfaceC0995bi interfaceC0995bi, InterfaceC0385Fw interfaceC0385Fw) {
        C0975bO A00 = C0975bO.A00(abstractC0991be, interfaceC0995bi, interfaceC0385Fw);
        this.A02 = A00;
        InterfaceC0990bd interfaceC0990bd = this.A00;
        if (interfaceC0990bd != null) {
            A00.A03(interfaceC0990bd);
        }
        this.A02.A04(this.A03);
    }

    public final void A04(View view) {
        C0975bO c0975bO = this.A02;
        if (c0975bO != null && view != null) {
            c0975bO.A01(view);
        }
    }

    public final void A05(View view, C0993bg c0993bg) {
        C0975bO c0975bO = this.A02;
        if (c0975bO != null && view != null && c0993bg != null) {
            c0975bO.A02(view, c0993bg);
        }
    }

    public final void A06(AbstractC0991be abstractC0991be, View view) {
        if (abstractC0991be != null && view != null) {
            C0387Fy c0387Fy = new C0387Fy(view, this.A04);
            final InterfaceC0989bc interfaceC0989bc = this.A05;
            A03(abstractC0991be, c0387Fy, new InterfaceC0385Fw(interfaceC0989bc) { // from class: com.facebook.ads.redexgen.X.3f
                public static byte[] A09;
                public static String[] A0A = {"okBgSYhQGmV0QyU32992deBLR6XrdaZQ", "E", "ZDdZ5rthnspWTI3gzSJHBR7aYCyAxUsq", "EsXM2pc2I6J3hYC1V9OQRTCtALa8wmqB", "DKA0ex9266tXplnV6PUb8C0vdYHWYjG4", "tBgdKBpc94v7LWesC8aTGIaQqZdJYwjy", "iZindrm9v6DBRttH7DMzAa7", "d9237vu9oQoOcpvZwewcjFUDz74P7MIA"};
                public static final String A0B;
                public long A00;
                public InterfaceC0990bd A01;
                public final InterfaceC0989bc A02;
                public final Map<String, C0979bS> A06 = new HashMap();
                public final C0980bT A04 = new C0980bT();
                public final C0980bT A03 = new C0980bT();
                public final List<Rect> A05 = new ArrayList(1);
                public final boolean A08 = false;
                public final boolean A07 = false;

                public static String A02(int i, int i2, int i3) {
                    byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
                    for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                        copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 91);
                    }
                    return new String(copyOfRange);
                }

                public static void A03() {
                    A09 = new byte[]{41, 21, 20, 14, 93, 11, 20, 24, 10, 13, 18, 20, 19, 9, 93, 21, 28, 14, 93, 19, 18, 9, 93, 31, 24, 24, 19, 93, 16, 24, 28, 14, 8, 15, 24, 25, 93, 18, 15, 93, 20, 14, 93, 28, 93, 26, 15, 18, 8, 13, 93, 10, 21, 20, 30, 21, 93, 10, 20, 17, 17, 93, 19, 24, 11, 24, 15, 93, 15, 24, 9, 8, 15, 19, 93, 28, 93, 16, 24, 28, 14, 8, 15, 24, 16, 24, 19, 9, 93, 14, 20, 19, 30, 24, 93, 20, 9, 90, 14, 93, 16, 28, 25, 24, 93, 8, 13, 93, 18, 27, 93, 14, 8, 31, 11, 20, 24, 10, 14, 93, 9, 21, 28, 9, 93, 30, 18, 8, 17, 25, 93, 31, 24, 93, 18, 27, 27, 14, 30, 15, 24, 24, 19, 118, 125, 111, 75, 123, 121, 118, 63, 36, 61, 61, 113, 39, 56, 52, 38, 113, 33, 35, 62, 33, 52, 35, 37, 40, 113, 55, 62, 35, 113, 35, 52, 60, 62, 39, 52, 53, 113, 56, 37, 52, 60, 113, 125, 97, 104, 122, 92, 107, 126, 97, 124, 122};
                }

                static {
                    A03();
                    A0B = C00903f.class.getSimpleName();
                }

                {
                    this.A02 = interfaceC0989bc;
                }

                public static Rect A00(C0979bS c0979bS) {
                    Rect rect;
                    Rect rect2;
                    Rect rect3;
                    Rect rect4;
                    Rect rect5;
                    if (c0979bS != null) {
                        rect = c0979bS.A02;
                        if (rect.top != Integer.MIN_VALUE) {
                            rect2 = c0979bS.A02;
                            if (rect2.left != Integer.MIN_VALUE) {
                                rect3 = c0979bS.A02;
                                String[] strArr = A0A;
                                if (strArr[1].length() == strArr[6].length()) {
                                    throw new RuntimeException();
                                }
                                String[] strArr2 = A0A;
                                strArr2[1] = "p";
                                strArr2[6] = "Kr6mbDoiLKwWSgNyXDF2oJW";
                                if (rect3.right != Integer.MIN_VALUE) {
                                    rect4 = c0979bS.A02;
                                    if (rect4.bottom != Integer.MIN_VALUE) {
                                        rect5 = c0979bS.A02;
                                        return rect5;
                                    }
                                }
                            }
                        }
                    }
                    throw new IllegalStateException(A02(0, 143, 38));
                }

                private C0979bS A01(C0993bg c0993bg, Rect rect, Rect rect2) {
                    boolean A06;
                    Rect rect3;
                    List list;
                    C0979bS c0979bS = this.A06.get(c0993bg.A04);
                    A06 = this.A04.A06(c0993bg);
                    if (A06) {
                        if (c0979bS != null) {
                            c0979bS.A01 = EnumC0983bW.A04;
                        } else {
                            c0979bS = C0979bS.A03(this.A00);
                            this.A06.put(c0993bg.A04, c0979bS);
                        }
                    }
                    rect3 = c0979bS.A02;
                    rect3.set(rect2);
                    list = c0979bS.A03;
                    list.add(new Rect(rect));
                    return c0979bS;
                }

                private void A04(C0980bT c0980bT) {
                    Collection<C0993bg> A01;
                    List list;
                    A01 = c0980bT.A01();
                    for (C0993bg c0993bg : A01) {
                        C0979bS c0979bS = this.A06.get(c0993bg.A04);
                        if (c0979bS == null) {
                            if (this.A02 != null) {
                                String str = A02(150, 36, 10) + c0993bg.A04;
                                throw new NullPointerException(A02(186, 10, 85));
                            }
                        } else {
                            c0979bS.A01 = EnumC0983bW.A03;
                            list = c0979bS.A03;
                            list.clear();
                            c0993bg.A03(this);
                            if (this.A08) {
                                Map<String, C0979bS> map = this.A06;
                                String[] strArr = A0A;
                                if (strArr[0].charAt(8) == strArr[2].charAt(8)) {
                                    throw new RuntimeException();
                                }
                                String[] strArr2 = A0A;
                                strArr2[0] = "dCpYPRypiVOHB4OlkAqBqk8EySqTLE1k";
                                strArr2[2] = "r3sjB169HJX8vOmMpko73ANLsggTEmi2";
                                map.remove(c0979bS);
                            } else {
                                continue;
                            }
                        }
                    }
                }

                private void A05(C0980bT c0980bT) {
                    Collection A00;
                    A00 = c0980bT.A00();
                    Iterator it = A00.iterator();
                    while (it.hasNext()) {
                        ((C0993bg) it.next()).A03(this);
                    }
                }

                @Override // com.facebook.ads.redexgen.X.InterfaceC0385Fw
                public final void A3R(C0993bg c0993bg, Rect rect, Rect rect2) {
                    boolean A06;
                    List list;
                    Rect rect3;
                    List list2;
                    A01(c0993bg, rect, rect2);
                    C0993bg c0993bg2 = c0993bg.A01;
                    C0993bg parentViewpointData = C0993bg.A08;
                    if (c0993bg2 == parentViewpointData) {
                        return;
                    }
                    A06 = this.A03.A06(c0993bg2);
                    C0979bS parentViewProperties = this.A06.get(c0993bg2.A04);
                    if (A06) {
                        if (parentViewProperties == null) {
                            parentViewProperties = C0979bS.A03(this.A00);
                            rect3 = parentViewProperties.A02;
                            rect3.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
                            this.A06.put(c0993bg2.A04, parentViewProperties);
                        } else {
                            list2 = parentViewProperties.A03;
                            list2.clear();
                            if (!this.A07 || c0993bg2.A04()) {
                                parentViewProperties.A01 = EnumC0983bW.A04;
                            }
                        }
                    }
                    list = parentViewProperties.A03;
                    list.add(new Rect(rect));
                }

                @Override // com.facebook.ads.redexgen.X.InterfaceC0385Fw
                public final void A3x(long j, List<Rect> viewportRects) {
                    Collection A01;
                    Collection A012;
                    List list;
                    this.A00 = j;
                    this.A05.clear();
                    Iterator<Rect> it = viewportRects.iterator();
                    while (it.hasNext()) {
                        this.A05.add(new Rect(it.next()));
                    }
                    A01 = this.A04.A01();
                    Iterator it2 = A01.iterator();
                    while (it2.hasNext()) {
                        this.A06.remove(((C0993bg) it2.next()).A04);
                    }
                    A012 = this.A03.A01();
                    Iterator it3 = A012.iterator();
                    while (it3.hasNext()) {
                        this.A06.remove(((C0993bg) it3.next()).A04);
                    }
                    Iterator<C0979bS> it4 = this.A06.values().iterator();
                    while (it4.hasNext()) {
                        list = it4.next().A03;
                        list.clear();
                    }
                    this.A04.A04();
                    this.A03.A04();
                }

                @Override // com.facebook.ads.redexgen.X.InterfaceC0385Fw
                public final void A5U() {
                    Collection A00;
                    Collection A002;
                    A05(this.A04);
                    A04(this.A04);
                    A05(this.A03);
                    A04(this.A03);
                    if (this.A01 != null) {
                        String obj = toString();
                        List<Rect> list = this.A05;
                        A00 = this.A04.A00();
                        A002 = this.A03.A00();
                        new C0978bR(obj, this, list, A00, A002);
                        throw new NullPointerException(A02(143, 7, 67));
                    }
                }

                @Override // com.facebook.ads.redexgen.X.InterfaceC0982bV
                public final void A71(C0993bg c0993bg, Rect rect) {
                    List list;
                    rect.setEmpty();
                    list = this.A06.get(c0993bg.A04).A03;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        rect.union((Rect) it.next());
                    }
                }

                @Override // com.facebook.ads.redexgen.X.InterfaceC0982bV
                public final EnumC0983bW A8A(C0993bg c0993bg) {
                    EnumC0983bW enumC0983bW;
                    enumC0983bW = this.A06.get(c0993bg.A04).A01;
                    return enumC0983bW;
                }

                @Override // com.facebook.ads.redexgen.X.InterfaceC0982bV
                public final void A8C(Rect rect) {
                    rect.setEmpty();
                    Iterator<Rect> it = this.A05.iterator();
                    while (it.hasNext()) {
                        rect.union(it.next());
                    }
                }

                @Override // com.facebook.ads.redexgen.X.InterfaceC0982bV
                public final float A8D(C0993bg c0993bg) {
                    List<Rect> list;
                    C0979bS c0979bS = this.A06.get(c0993bg.A04);
                    if (c0979bS != null) {
                        Rect A00 = A00(c0979bS);
                        int height = A00.height() * A00.width();
                        int totalVisibleArea = 0;
                        list = c0979bS.A03;
                        for (Rect rect : list) {
                            totalVisibleArea += rect.height() * rect.width();
                        }
                        return totalVisibleArea / height;
                    }
                    return 0.0f;
                }

                @Override // com.facebook.ads.redexgen.X.InterfaceC0385Fw
                public final void AFW(InterfaceC0990bd interfaceC0990bd) {
                    this.A01 = interfaceC0990bd;
                }
            });
        }
    }
}
