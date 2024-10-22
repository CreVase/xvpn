package defpackage;

import android.media.MediaDataSource;
import java.io.IOException;

/* loaded from: classes.dex */
public final class ys0 extends MediaDataSource {

    /* renamed from: a, reason: collision with root package name */
    public long f5379a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dt0 f5380b;

    public ys0(dt0 dt0Var) {
        this.f5380b = dt0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j2 = this.f5379a;
            if (j2 != j) {
                if (j2 >= 0 && j >= j2 + this.f5380b.available()) {
                    return -1;
                }
                this.f5380b.c(j);
                this.f5379a = j;
            }
            if (i2 > this.f5380b.available()) {
                i2 = this.f5380b.available();
            }
            int read = this.f5380b.read(bArr, i, i2);
            if (read >= 0) {
                this.f5379a += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f5379a = -1L;
        return -1;
    }
}
