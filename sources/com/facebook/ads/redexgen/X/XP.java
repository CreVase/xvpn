package com.facebook.ads.redexgen.X;

import android.view.Surface;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.analytics.AnalyticsCollector;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: assets/audience_network.dex */
public final class XP implements InterfaceC02359i, DH, AR, IL, InterfaceC0349Em, GW, B8 {
    public static String[] A05 = {"3ui7943oJKQ0earBMheCpqpPzXrDt0u1", "Y87VavrouiKi9z", "P6cMiRGLac5hfjC0tRGIGRLUUUjxE7XX", "Gp12Iojej9PCs1Iei8EmhswJ2d7MPPra", "iPLJe15l61uvnh9YTjVALhylcUuC36cq", "JkCpp1uc3ZLfv8H0X3nexU5u26UQU15j", "bG94g9DZx4SnKjROolD8g6Osz0P9GRGH", "l5hRkIxgm3MuCDpPoC4K2VrrhVSesDup"};
    public InterfaceC02409n A00;
    public final HL A03;
    public final CopyOnWriteArraySet<A4> A04 = new CopyOnWriteArraySet<>();
    public final A1 A02 = new A1();
    public final C02509y A01 = new C02509y();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private final A3 A04(int i, EW ew) {
        HI.A01(this.A00);
        long A5O = this.A03.A5O();
        AbstractC02519z A6Z = this.A00.A6Z();
        return new A3(A5O, A6Z, i, ew, i == this.A00.A6a() ? (ew == null || !ew.A01()) ? this.A00.A6S() : (this.A00.A6U() == ew.A00 && this.A00.A6V() == ew.A01) ? this.A00.A6X() : 0L : (i >= A6Z.A01() || (ew != null && ew.A01())) ? 0L : A6Z.A0B(i, this.A01).A00(), this.A00.A6X(), this.A00.A67() - this.A00.A6S());
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.GW
    public final void AAh(int i, long j, long j2) {
        A01();
        Iterator<A4> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public XP(InterfaceC02409n interfaceC02409n, HL hl) {
        this.A00 = interfaceC02409n;
        this.A03 = (HL) HI.A01(hl);
    }

    private A3 A00() {
        return A05(this.A02.A03());
    }

    private A3 A01() {
        return A05(this.A02.A04());
    }

    private A3 A02() {
        return A05(this.A02.A05());
    }

    private A3 A03() {
        return A05(this.A02.A06());
    }

    private A3 A05(A2 a2) {
        if (a2 == null) {
            Object A01 = HI.A01(this.A00);
            String[] strArr = A05;
            if (strArr[5].charAt(24) != strArr[3].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[4] = "It2FvVQ6GuD0QkNXfVFrE8OCooaDSMpJ";
            strArr2[2] = "a2HOGJm5UwCLA4g7R7QNf278R1ClTDAB";
            int A6a = ((InterfaceC02409n) A01).A6a();
            return A04(A6a, this.A02.A07(A6a));
        }
        return A04(a2.A00, a2.A01);
    }

    public final void A06() {
        if (!this.A02.A0F()) {
            A3 A02 = A02();
            A1 a1 = this.A02;
            if (A05[7].charAt(15) == 'w') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[4] = "qsPEDs7YPcMFbl4XVvGjNAFSUVJ30e5d";
            strArr[2] = "wNEtz3pAWSMGqURdz3XYnwNQJEjBbTAW";
            a1.A09();
            Iterator<A4> it = this.A04.iterator();
            while (it.hasNext()) {
                it.next().onSeekStarted(A02);
            }
        }
    }

    public final void A07() {
        ArrayList arrayList;
        arrayList = this.A02.A05;
        List<AnalyticsCollector.WindowAndMediaPeriodId> activeMediaPeriods = new ArrayList<>(arrayList);
        Iterator<AnalyticsCollector.WindowAndMediaPeriodId> it = activeMediaPeriods.iterator();
        while (it.hasNext()) {
            A2 a2 = (A2) it.next();
            AC5(a2.A00, a2.A01);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AR
    public final void AAZ(String str, long j, long j2) {
        A3 A03 = A03();
        Iterator<A4> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInitialized(A03, 1, str, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AR
    public final void AAa(C0272Au c0272Au) {
        A3 A00 = A00();
        Iterator<A4> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderDisabled(A00, 1, c0272Au);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AR
    public final void AAb(C0272Au c0272Au) {
        A3 A02 = A02();
        Iterator<A4> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderEnabled(A02, 1, c0272Au);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AR
    public final void AAc(Format format) {
        A3 A03 = A03();
        Iterator<A4> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInputFormatChanged(A03, 1, format);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AR
    public final void AAd(int i) {
        A3 A03 = A03();
        Iterator<A4> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onAudioSessionId(A03, i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AR
    public final void AAe(int i, long j, long j2) {
        A3 A03 = A03();
        Iterator<A4> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onAudioUnderrun(A03, i, j, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0349Em
    public final void AB8(int i, EW ew, C0348El c0348El) {
        A3 A04 = A04(i, ew);
        Iterator<A4> it = this.A04.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A05[7].charAt(15) == 'w') {
                throw new RuntimeException();
            }
            A05[7] = "A4QXCUmAUOBVX64TvaZ46B5z8oAUnNZh";
            if (hasNext) {
                it.next().onDownstreamFormatChanged(A04, c0348El);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.B8
    public final void AB9() {
        A3 A03 = A03();
        Iterator<A4> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDrmKeysLoaded(A03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.B8
    public final void ABA() {
        A3 A03 = A03();
        Iterator<A4> it = this.A04.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A05[7].charAt(15) == 'w') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[4] = "H8nHlV26gM4XBGJAm7WOVvtwu96ZUK2X";
            strArr[2] = "PAYN32B5Yp2dRtm6BiBsWpdjvopWw5ut";
            if (hasNext) {
                it.next().onDrmKeysRemoved(A03);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.B8
    public final void ABB() {
        A3 A03 = A03();
        Iterator<A4> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDrmKeysRestored(A03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.B8
    public final void ABC(Exception exc) {
        A3 A03 = A03();
        Iterator<A4> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDrmSessionManagerError(A03, exc);
        }
    }

    @Override // com.facebook.ads.redexgen.X.IL
    public final void ABD(int i, long j) {
        A3 A00 = A00();
        Iterator<A4> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDroppedVideoFrames(A00, i, j);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0349Em
    public final void ABo(int i, EW ew, C0347Ek c0347Ek, C0348El c0348El) {
        A04(i, ew);
        Iterator<A4> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0349Em
    public final void ABq(int i, EW ew, C0347Ek c0347Ek, C0348El c0348El) {
        A04(i, ew);
        Iterator<A4> it = this.A04.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A05[7].charAt(15) == 'w') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[0] = "U0y5Da5mII5YR5LLA1Yw3vUoz2XQzjRa";
            strArr[6] = "AsACfu1w80VTJMOzwO3g8Y2nz7gc0iIE";
            if (!hasNext) {
                return;
            } else {
                it.next();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0349Em
    public final void ABt(int i, EW ew, C0347Ek c0347Ek, C0348El c0348El, IOException iOException, boolean z) {
        A3 A04 = A04(i, ew);
        Iterator<A4> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onLoadError(A04, c0347Ek, c0348El, iOException, z);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0349Em
    public final void ABv(int i, EW ew, C0347Ek c0347Ek, C0348El c0348El) {
        A04(i, ew);
        Iterator<A4> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02359i
    public final void ABx(boolean z) {
        A3 A02 = A02();
        Iterator<A4> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onLoadingChanged(A02, z);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0349Em
    public final void AC4(int i, EW ew) {
        this.A02.A0B(i, ew);
        A3 A04 = A04(i, ew);
        Iterator<A4> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onMediaPeriodCreated(A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0349Em
    public final void AC5(int i, EW ew) {
        this.A02.A0C(i, ew);
        A3 A04 = A04(i, ew);
        Iterator<A4> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onMediaPeriodReleased(A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.DH
    public final void AC8(Metadata metadata) {
        A3 A02 = A02();
        Iterator<A4> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onMetadata(A02, metadata);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02359i
    public final void ACO(C02329f c02329f) {
        A3 A02 = A02();
        Iterator<A4> it = this.A04.iterator();
        while (it.hasNext()) {
            A4 next = it.next();
            if (A05[7].charAt(15) == 'w') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[5] = "tyr0dpEvlbVKV2bQNXg9NMaK2xy6BoSW";
            strArr[3] = "0QT1knH3BDrt7WSXrhNoOdrd2qYVbD8e";
            next.onPlaybackParametersChanged(A02, c02329f);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02359i
    public final void ACQ(C9K c9k) {
        A3 A02 = A02();
        Iterator<A4> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onPlayerError(A02, c9k);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02359i
    public final void ACS(boolean z, int i) {
        A3 A02 = A02();
        Iterator<A4> it = this.A04.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A05;
            if (strArr[0].charAt(24) != strArr[6].charAt(24)) {
                throw new RuntimeException();
            }
            A05[1] = "LXJ0q";
            if (!hasNext) {
                return;
            }
            A4 next = it.next();
            String[] strArr2 = A05;
            if (strArr2[4].charAt(29) != strArr2[2].charAt(29)) {
                String[] strArr3 = A05;
                strArr3[5] = "X7wD26nry5cKRUDoaHEW6GIg2BkBQsxF";
                strArr3[3] = "mBKm4QAdZAalWFRu5fZgU4pH2nbenvRU";
                next.onPlayerStateChanged(A02, z, i);
            } else {
                String[] strArr4 = A05;
                strArr4[5] = "Z6EwV7KsnuzYN7ajnraaFM2k28xO4kcl";
                strArr4[3] = "L2gfOX15V0Xhx6fkmzEhPGDX2RpQhPed";
                next.onPlayerStateChanged(A02, z, i);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02359i
    public final void ACU(int i) {
        this.A02.A0A(i);
        A3 A02 = A02();
        Iterator<A4> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onPositionDiscontinuity(A02, i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0349Em
    public final void ACe(int i, EW ew) {
        this.A02.A0D(i, ew);
        A3 A04 = A04(i, ew);
        Iterator<A4> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onReadingStarted(A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.IL
    public final void ACi(Surface surface) {
        A3 A03 = A03();
        Iterator<A4> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onRenderedFirstFrame(A03, surface);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02359i
    public final void ACt() {
        if (this.A02.A0F()) {
            this.A02.A08();
            A3 A02 = A02();
            Iterator<A4> it = this.A04.iterator();
            while (it.hasNext()) {
                it.next().onSeekProcessed(A02);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02359i
    public final void AD9(AbstractC02519z abstractC02519z, Object obj, int i) {
        this.A02.A0E(abstractC02519z);
        A3 A02 = A02();
        Iterator<A4> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onTimelineChanged(A02, i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02359i
    public final void ADC(TrackGroupArray trackGroupArray, GP gp) {
        A3 A02 = A02();
        Iterator<A4> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onTracksChanged(A02, trackGroupArray, gp);
        }
    }

    @Override // com.facebook.ads.redexgen.X.IL
    public final void ADK(String str, long j, long j2) {
        A3 A03 = A03();
        Iterator<A4> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInitialized(A03, 2, str, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.IL
    public final void ADL(C0272Au c0272Au) {
        A3 A00 = A00();
        Iterator<A4> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderDisabled(A00, 2, c0272Au);
        }
    }

    @Override // com.facebook.ads.redexgen.X.IL
    public final void ADM(C0272Au c0272Au) {
        A3 A02 = A02();
        Iterator<A4> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderEnabled(A02, 2, c0272Au);
        }
    }

    @Override // com.facebook.ads.redexgen.X.IL
    public final void ADQ(Format format) {
        A3 A03 = A03();
        Iterator<A4> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInputFormatChanged(A03, 2, format);
        }
    }

    @Override // com.facebook.ads.redexgen.X.IL
    public final void ADV(int i, int i2, int i3, float f) {
        A3 A03 = A03();
        Iterator<A4> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onVideoSizeChanged(A03, i, i2, i3, f);
        }
    }
}
