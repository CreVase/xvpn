package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.PrivateCommand;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.SpliceInsertCommand;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.SpliceNullCommand;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.SpliceScheduleCommand;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.TimeSignalCommand;
import java.nio.ByteBuffer;

/* renamed from: com.facebook.ads.redexgen.X.Vr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0788Vr implements DE {
    public C0432Ht A00;
    public final C0420Hh A02 = new C0420Hh();
    public final C0419Hg A01 = new C0419Hg();

    @Override // com.facebook.ads.redexgen.X.DE
    public final Metadata A4x(D1 d1) throws DF {
        if (this.A00 == null || d1.A00 != this.A00.A05()) {
            C0432Ht c0432Ht = new C0432Ht(((XE) d1).A00);
            this.A00 = c0432Ht;
            c0432Ht.A06(((XE) d1).A00 - d1.A00);
        }
        ByteBuffer buffer = d1.A01;
        byte[] array = buffer.array();
        int limit = buffer.limit();
        this.A02.A0b(array, limit);
        this.A01.A0C(array, limit);
        this.A01.A08(39);
        long A04 = (this.A01.A04(1) << 32) | this.A01.A04(32);
        this.A01.A08(20);
        int spliceCommandType = this.A01.A04(12);
        long ptsAdjustment = this.A01.A04(8);
        Metadata.Entry entry = null;
        this.A02.A0Z(14);
        switch (ptsAdjustment) {
            case 0:
                entry = new SpliceNullCommand();
                break;
            case 4:
                entry = SpliceScheduleCommand.A00(this.A02);
                break;
            case 5:
                entry = SpliceInsertCommand.A00(this.A02, A04, this.A00);
                break;
            case 6:
                entry = TimeSignalCommand.A01(this.A02, A04, this.A00);
                break;
            case 255:
                entry = PrivateCommand.A00(this.A02, spliceCommandType, A04);
                break;
        }
        return entry == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(entry);
    }
}
