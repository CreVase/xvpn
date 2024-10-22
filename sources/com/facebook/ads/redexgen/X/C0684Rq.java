package com.facebook.ads.redexgen.X;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Rq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0684Rq extends C4Q<C0677Rj> {
    public static String[] A0H = {"U2dBX20JaeRgS8KUkn4U", "4wbYdEjd6EY1wYpAHERmBQ5UbLFk3rIE", "poCzv8x7tLJqIV5ZIWq", "9iyDRDGf0xWQ70I4mtfqA0IQycZfZ47C", "v2glKkwlOEfR0MfsI3TqmdNecXONmhZ3", "6XdF3RdtkhprEZiVEVCq65KOMzsBziM7", "2OiOSmaAlP7OTnmHwLOjTjXlL7jeDPuL", "nkMLdycTxYcJ5galJfvG8bjM9rVBse8i"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AbstractC0530Ls A04;
    public InterfaceC0531Lt A05;
    public String A06;
    public List<PC> A07;
    public boolean A08;
    public final SparseBooleanArray A09 = new SparseBooleanArray();
    public final AbstractC0924aS A0A;
    public final C6Q A0B;
    public final YA A0C;
    public final InterfaceC0444If A0D;
    public final LN A0E;
    public final S0 A0F;
    public final C0643Qb A0G;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public C0684Rq(YA ya, List<PC> list, AbstractC0924aS abstractC0924aS, InterfaceC0444If interfaceC0444If, C6Q c6q, C0643Qb c0643Qb, LN ln, InterfaceC0531Lt interfaceC0531Lt, String str, int i, int i2, int i3, int i4, S0 s0, AbstractC0530Ls abstractC0530Ls) {
        this.A0C = ya;
        this.A0D = interfaceC0444If;
        this.A0B = c6q;
        this.A0G = c0643Qb;
        this.A0E = ln;
        this.A05 = interfaceC0531Lt;
        this.A0A = abstractC0924aS;
        this.A07 = list;
        this.A00 = i;
        this.A03 = i4;
        this.A06 = str;
        this.A01 = i3;
        this.A02 = i2;
        this.A0F = s0;
        this.A04 = abstractC0530Ls;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4Q
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C0677Rj A0C(ViewGroup viewGroup, int i) {
        return new C0677Rj(OT.A00(new C0588Ny(this.A0C, this.A0D, this.A05, this.A0A, null, this.A0G, this.A0E).A0H(this.A04).A0K(), this.A03, this.A06, this.A0F), this.A09, this.A0G, this.A00, this.A01, this.A02, this.A07.size(), this.A0C, this.A0A.A0x());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4Q
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A0E(C0677Rj c0677Rj, int i) {
        c0677Rj.A0l(this.A07.get(i), this.A0D, this.A0B, this.A0E, this.A06);
        if (!this.A08 && i == 0) {
            c0677Rj.AF7();
            String[] strArr = A0H;
            if (strArr[3].charAt(29) == strArr[6].charAt(29)) {
                throw new RuntimeException();
            }
            A0H[1] = "f5MkbcX2dFxcVTBDK6f4VKhLC7wzzoeI";
            this.A08 = true;
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4Q
    public final int A0D() {
        return this.A07.size();
    }
}
