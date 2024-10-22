package com.google.android.exoplayer2.drm;

import android.media.MediaDrmException;
import defpackage.dc0;
import defpackage.ht0;
import defpackage.it0;
import defpackage.v51;
import defpackage.z52;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class d implements e {
    @Override // com.google.android.exoplayer2.drm.e
    public final Map a(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final it0 b() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final dc0 c(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final byte[] d() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final void e(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final void f(byte[] bArr) {
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final byte[] g(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final void h(v51 v51Var) {
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final void i(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final ht0 j(byte[] bArr, List list, int i, HashMap hashMap) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final int k() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final /* synthetic */ void l(byte[] bArr, z52 z52Var) {
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final boolean m(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final void release() {
    }
}
