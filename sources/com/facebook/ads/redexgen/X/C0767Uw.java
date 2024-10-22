package com.facebook.ads.redexgen.X;

import android.os.ConditionVariable;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

/* renamed from: com.facebook.ads.redexgen.X.Uw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0767Uw implements H2 {
    public static boolean A06;
    public static byte[] A07;
    public static String[] A08 = {"PZs3vIZtp1syVhF", "iN5G7Jyo65HiG11v5U3JAI3rcjEJu9Fh", "jWadhCo9gqYR1xuZ5eOebDdRLwIuwzoe", "5aVgPmkb9WO9SFxkSTOlcah0CKuDVehn", "Qok3N", "7mg38N8lomez8u4EtBpwlNJo", "Crj8XVI7aaG6XCZYe", "vguL8XPuWTEOQDWRTomV5"};
    public static final HashSet<File> A09;
    public long A00;
    public boolean A01;
    public final InterfaceC0769Uy A02;
    public final HA A03;
    public final File A04;
    public final HashMap<String, ArrayList<H1>> A05;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 90);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        String[] strArr = A08;
        if (strArr[1].charAt(16) != strArr[2].charAt(16)) {
            throw new RuntimeException();
        }
        A08[3] = "N0vjWbyGqBS98Run3kOI6tTmnpu8bGoB";
        A07 = new byte[]{67, 108, 109, 118, 106, 103, 112, 34, 81, 107, 111, 114, 110, 103, 65, 99, 97, 106, 103, 34, 107, 108, 113, 118, 99, 108, 97, 103, 34, 119, 113, 103, 113, 34, 118, 106, 103, 34, 100, 109, 110, 102, 103, 112, 56, 34, 48, 10, 14, 19, 15, 6, 32, 2, 0, 11, 6, 121, 67, 71, 90, 70, 79, 105, 75, 73, 66, 79, 4, 67, 68, 67, 94, 67, 75, 70, 67, 80, 79, 2, 3, 96, 71, 92, 65, 90, 93, 84, 19, 90, 93, 87, 86, 75, 19, 85, 90, 95, 86, 19, 85, 82, 90, 95, 86, 87, 20, 22, 20, 31, 18, 19, 40, 20, 24, 25, 3, 18, 25, 3, 40, 30, 25, 19, 18, 15, 89, 18, 15, 30};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.H2
    public final synchronized void A4K(File file) throws H0 {
        HI.A04(!this.A01);
        C0766Uv A00 = C0766Uv.A00(file, this.A03);
        HI.A04(A00 != null);
        H9 A092 = this.A03.A09(A00.A04);
        HI.A01(A092);
        HI.A04(A092.A0D());
        if (file.exists()) {
            if (file.length() == 0) {
                file.delete();
                return;
            }
            long A002 = HD.A00(A092.A05());
            if (A002 != -1) {
                HI.A04(A00.A02 + A00.A01 <= A002);
            }
            A0A(A00);
            this.A03.A0G();
            notifyAll();
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.H2
    public final synchronized NavigableSet<H6> A6C(String str) {
        H9 A092;
        HI.A04(!this.A01);
        A092 = this.A03.A09(str);
        return (A092 == null || A092.A0C()) ? new TreeSet() : new TreeSet((Collection) A092.A08());
    }

    static {
        A06();
        A09 = new HashSet<>();
    }

    public C0767Uw(File file, InterfaceC0769Uy interfaceC0769Uy) {
        this(file, interfaceC0769Uy, null, false);
    }

    public C0767Uw(File file, InterfaceC0769Uy interfaceC0769Uy, HA ha) {
        if (A0D(file)) {
            this.A04 = file;
            this.A02 = interfaceC0769Uy;
            this.A03 = ha;
            this.A05 = new HashMap<>();
            ConditionVariable conditionVariable = new ConditionVariable();
            new HF(this, A03(57, 24, 112), conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException(A03(0, 46, 88) + file);
    }

    public C0767Uw(File file, InterfaceC0769Uy interfaceC0769Uy, byte[] bArr, boolean z) {
        this(file, interfaceC0769Uy, new HA(file, bArr, z));
    }

    private C0766Uv A00(String str, long j) throws H0 {
        C0766Uv span;
        H9 A092 = this.A03.A09(str);
        if (A092 == null) {
            C0766Uv A02 = C0766Uv.A02(str, j);
            if (A08[7].length() == 15) {
                throw new RuntimeException();
            }
            A08[3] = "R7TEvDOiyk4OKBf9PsOT39P5pIR22NMD";
            return A02;
        }
        while (true) {
            span = A092.A06(j);
            if (!span.A05 || span.A03.exists()) {
                break;
            }
            A05();
        }
        return span;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.H2
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final synchronized C0766Uv AFk(String str, long j) throws InterruptedException, H0 {
        C0766Uv span;
        while (true) {
            span = AFl(str, j);
            if (span == null) {
                wait();
            }
        }
        return span;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.H2
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final synchronized C0766Uv AFl(String str, long j) throws H0 {
        HI.A04(!this.A01);
        C0766Uv A00 = A00(str, j);
        if (A00.A05) {
            C0766Uv cacheSpan = this.A03.A09(str).A07(A00);
            A0C(A00, cacheSpan);
            return cacheSpan;
        }
        H9 A0A = this.A03.A0A(str);
        if (A0A.A0D()) {
            return null;
        }
        A0A.A0B(true);
        return A00;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        if (!this.A04.exists()) {
            this.A04.mkdirs();
            return;
        }
        this.A03.A0E();
        File[] listFiles = this.A04.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            if (!file.getName().equals(A03(106, 24, 45))) {
                C0766Uv A00 = file.length() > 0 ? C0766Uv.A00(file, this.A03) : null;
                if (A00 != null) {
                    A0A(A00);
                } else {
                    file.delete();
                }
            }
        }
        this.A03.A0F();
        try {
            this.A03.A0G();
        } catch (H0 e) {
            Log.e(A03(46, 11, 57), A03(81, 25, 105), e);
        }
    }

    private void A05() throws H0 {
        ArrayList arrayList = new ArrayList();
        Iterator<H9> it = this.A03.A0D().iterator();
        while (it.hasNext()) {
            Iterator<C0766Uv> it2 = it.next().A08().iterator();
            while (it2.hasNext()) {
                C0766Uv next = it2.next();
                if (!next.A03.exists()) {
                    arrayList.add(next);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            A08((H6) arrayList.get(i), false);
        }
        this.A03.A0F();
        this.A03.A0G();
    }

    private void A07(H6 h6) {
        ArrayList<H1> arrayList = this.A05.get(h6.A04);
        if (arrayList != null) {
            for (int i = arrayList.size() - 1; i >= 0; i--) {
                arrayList.get(i).AD1(this, h6);
            }
        }
        this.A02.AD1(this, h6);
    }

    private void A08(H6 h6, boolean z) throws H0 {
        H9 A092 = this.A03.A09(h6.A04);
        if (A092 == null || !A092.A0E(h6)) {
            return;
        }
        this.A00 -= h6.A01;
        if (z) {
            try {
                this.A03.A0H(A092.A03);
                this.A03.A0G();
            } finally {
                A07(h6);
            }
        }
    }

    private void A0A(C0766Uv c0766Uv) {
        this.A03.A0A(c0766Uv.A04).A09(c0766Uv);
        this.A00 += c0766Uv.A01;
        A0B(c0766Uv);
    }

    private void A0B(C0766Uv c0766Uv) {
        ArrayList<H1> arrayList = this.A05.get(c0766Uv.A04);
        if (arrayList != null) {
            for (int i = arrayList.size() - 1; i >= 0; i--) {
                arrayList.get(i).AD0(this, c0766Uv);
            }
        }
        this.A02.AD0(this, c0766Uv);
    }

    private void A0C(C0766Uv c0766Uv, H6 h6) {
        ArrayList<H1> arrayList = this.A05.get(c0766Uv.A04);
        if (arrayList != null) {
            int size = arrayList.size();
            String[] strArr = A08;
            if (strArr[1].charAt(16) != strArr[2].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[0] = "YjLi8Ea68WiaTq3";
            strArr2[4] = "ACi8R";
            for (int i = size - 1; i >= 0; i--) {
                arrayList.get(i).AD2(this, c0766Uv, h6);
            }
        }
        this.A02.AD2(this, c0766Uv, h6);
    }

    public static synchronized boolean A0D(File file) {
        synchronized (C0767Uw.class) {
            if (A06) {
                return true;
            }
            return A09.add(file.getAbsoluteFile());
        }
    }

    @Override // com.facebook.ads.redexgen.X.H2
    public final synchronized void A3W(String str, HE he) throws H0 {
        HI.A04(!this.A01);
        this.A03.A0I(str, he);
        this.A03.A0G();
    }

    @Override // com.facebook.ads.redexgen.X.H2
    public final synchronized long A6A() {
        HI.A04(!this.A01);
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.H2
    public final synchronized long A6B(String str, long j, long j2) {
        H9 cachedContent;
        HI.A04(!this.A01);
        cachedContent = this.A03.A09(str);
        return cachedContent != null ? cachedContent.A04(j, j2) : -j2;
    }

    @Override // com.facebook.ads.redexgen.X.H2
    public final synchronized long A6Q(String str) {
        return HD.A00(A6R(str));
    }

    @Override // com.facebook.ads.redexgen.X.H2
    public final synchronized HC A6R(String str) {
        HI.A04(!this.A01);
        return this.A03.A0B(str);
    }

    @Override // com.facebook.ads.redexgen.X.H2
    public final synchronized void AES(H6 h6) {
        HI.A04(!this.A01);
        H9 A092 = this.A03.A09(h6.A04);
        HI.A01(A092);
        HI.A04(A092.A0D());
        A092.A0B(false);
        this.A03.A0H(A092.A03);
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.X.H2
    public final synchronized void AEZ(H6 h6) throws H0 {
        HI.A04(!this.A01);
        A08(h6, true);
    }

    @Override // com.facebook.ads.redexgen.X.H2
    public final synchronized void AFD(String str, long j) throws H0 {
        HE mutations = new HE();
        HD.A05(mutations, j);
        A3W(str, mutations);
    }

    @Override // com.facebook.ads.redexgen.X.H2
    public final synchronized File AFi(String str, long j, long j2) throws H0 {
        H9 A092;
        HI.A04(!this.A01);
        A092 = this.A03.A09(str);
        HI.A01(A092);
        HI.A04(A092.A0D());
        if (!this.A04.exists()) {
            this.A04.mkdirs();
            A05();
        }
        this.A02.AD3(this, str, j, j2);
        return C0766Uv.A04(this.A04, A092.A02, j, System.currentTimeMillis());
    }
}
