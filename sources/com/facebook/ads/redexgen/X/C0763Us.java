package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.facebook.ads.redexgen.X.Us, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0763Us implements HV {
    public final Handler A00;

    public C0763Us(Handler handler) {
        this.A00 = handler;
    }

    @Override // com.facebook.ads.redexgen.X.HV
    public final Looper A7D() {
        return this.A00.getLooper();
    }

    @Override // com.facebook.ads.redexgen.X.HV
    public final Message AAF(int i, int i2, int i3) {
        return this.A00.obtainMessage(i, i2, i3);
    }

    @Override // com.facebook.ads.redexgen.X.HV
    public final Message AAG(int i, int i2, int i3, Object obj) {
        return this.A00.obtainMessage(i, i2, i3, obj);
    }

    @Override // com.facebook.ads.redexgen.X.HV
    public final Message AAH(int i, Object obj) {
        return this.A00.obtainMessage(i, obj);
    }

    @Override // com.facebook.ads.redexgen.X.HV
    public final void AEY(int i) {
        this.A00.removeMessages(i);
    }

    @Override // com.facebook.ads.redexgen.X.HV
    public final boolean AF2(int i) {
        return this.A00.sendEmptyMessage(i);
    }

    @Override // com.facebook.ads.redexgen.X.HV
    public final boolean AF3(int i, long j) {
        return this.A00.sendEmptyMessageAtTime(i, j);
    }
}
