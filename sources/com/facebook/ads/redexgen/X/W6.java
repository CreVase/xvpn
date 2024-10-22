package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.facebook.ads.internal.exoplayer2.thirdparty.extractor.ts.TsPayloadReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public class W6 implements InterfaceC0305Co {
    public static String[] A05 = {"ZoOhGYHP8SNfCMTpI8hB8esJvCxQNk4a", "iCY0vtQk2BMTn8YKksXnllwhxYcEMWPa", "FRJmrfeKqiG8dvU06WzW6", "wyGcQq4l", "", "l2", "ODNaIWitniiqKmZchEPotBtPtmPon6SS", "r1S7VBlY5d2QYAsiLWImTDUS2fBhu4wR"};
    public final int A00;
    public final /* synthetic */ W5 A04;
    public final C0419Hg A03 = new C0419Hg(new byte[5]);
    public final SparseArray<InterfaceC0311Cv> A01 = new SparseArray<>();
    public final SparseIntArray A02 = new SparseIntArray();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015c A[SYNTHETIC] */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0305Co
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A4O(com.facebook.ads.redexgen.X.C0420Hh r14) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.W6.A4O(com.facebook.ads.redexgen.X.Hh):void");
    }

    public W6(W5 w5, int i) {
        this.A04 = w5;
        this.A00 = i;
    }

    private C0308Cs A00(C0420Hh c0420Hh, int i) {
        long j;
        long j2;
        long j3;
        int A06 = c0420Hh.A06();
        int i2 = A06 + i;
        int descriptorLength = -1;
        String str = null;
        List<TsPayloadReader.DvbSubtitleInfo> dvbSubtitleInfos = null;
        while (c0420Hh.A06() < i2) {
            int descriptorsStartPosition = c0420Hh.A0E();
            int A062 = c0420Hh.A06() + c0420Hh.A0E();
            if (descriptorsStartPosition == 5) {
                long A0M = c0420Hh.A0M();
                j = W5.A0F;
                if (A0M != j) {
                    j2 = W5.A0G;
                    if (A05[0].charAt(13) == 108) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A05;
                    strArr[5] = "OX";
                    strArr[4] = "";
                    if (A0M != j2) {
                        j3 = W5.A0H;
                        if (A0M == j3) {
                            descriptorLength = 36;
                        }
                    } else {
                        descriptorLength = 135;
                    }
                } else {
                    descriptorLength = 129;
                }
            } else if (descriptorsStartPosition == 106) {
                descriptorLength = 129;
            } else if (descriptorsStartPosition == 122) {
                descriptorLength = 135;
            } else if (descriptorsStartPosition == 123) {
                descriptorLength = 138;
            } else if (descriptorsStartPosition == 10) {
                str = c0420Hh.A0S(3).trim();
            } else if (descriptorsStartPosition == 89) {
                descriptorLength = 89;
                dvbSubtitleInfos = new ArrayList<>();
                while (c0420Hh.A06() < A062) {
                    String language = c0420Hh.A0S(3).trim();
                    int streamType = c0420Hh.A0E();
                    byte[] bArr = new byte[4];
                    c0420Hh.A0c(bArr, 0, 4);
                    dvbSubtitleInfos.add(new C0307Cr(language, streamType, bArr));
                }
            }
            c0420Hh.A0Z(A062 - c0420Hh.A06());
        }
        c0420Hh.A0Y(i2);
        return new C0308Cs(descriptorLength, str, dvbSubtitleInfos, Arrays.copyOfRange(c0420Hh.A00, A06, i2));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0305Co
    public final void A8g(C0432Ht c0432Ht, InterfaceC0280Bc interfaceC0280Bc, C0310Cu c0310Cu) {
    }
}
