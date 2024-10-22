package defpackage;

import android.media.AudioTrack;

/* loaded from: classes.dex */
public final class gg0 extends AudioTrack.StreamEventCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hg0 f2248a;

    public gg0(hg0 hg0Var) {
        this.f2248a = hg0Var;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i) {
        ig0 ig0Var;
        ja1 ja1Var;
        cu0 cu0Var;
        if (audioTrack.equals(this.f2248a.c.u) && (ja1Var = (ig0Var = this.f2248a.c).r) != null && ig0Var.U && (cu0Var = ((wr1) ja1Var.f2735b).Z0) != null) {
            cu0Var.f1676a.h.d(2);
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        ig0 ig0Var;
        ja1 ja1Var;
        cu0 cu0Var;
        if (audioTrack.equals(this.f2248a.c.u) && (ja1Var = (ig0Var = this.f2248a.c).r) != null && ig0Var.U && (cu0Var = ((wr1) ja1Var.f2735b).Z0) != null) {
            cu0Var.f1676a.h.d(2);
        }
    }
}
