package defpackage;

import com.google.android.exoplayer2.offline.DownloadRequest;

/* loaded from: classes.dex */
public final class jm0 {

    /* renamed from: a, reason: collision with root package name */
    public final DownloadRequest f2790a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2791b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final int g;
    public final tm0 h;

    public jm0(DownloadRequest downloadRequest, int i, long j, long j2, int i2) {
        this(downloadRequest, i, j, j2, -1L, i2, 0, new tm0());
    }

    public jm0(DownloadRequest downloadRequest, int i, long j, long j2, long j3, int i2, int i3, tm0 tm0Var) {
        tm0Var.getClass();
        cp3.e((i3 == 0) == (i != 4));
        if (i2 != 0) {
            cp3.e((i == 2 || i == 0) ? false : true);
        }
        this.f2790a = downloadRequest;
        this.f2791b = i;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = i2;
        this.g = i3;
        this.h = tm0Var;
    }
}
