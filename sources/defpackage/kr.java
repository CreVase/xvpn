package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class kr extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3000a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sr f3001b;

    public /* synthetic */ kr(sr srVar, int i) {
        this.f3000a = i;
        this.f3001b = srVar;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    @Override // java.io.InputStream
    public final int available() {
        long min;
        int i = this.f3000a;
        sr srVar = this.f3001b;
        switch (i) {
            case 0:
                min = Math.min(((lr) srVar).f3176b, Integer.MAX_VALUE);
                return (int) min;
            default:
                xg2 xg2Var = (xg2) srVar;
                if (!xg2Var.c) {
                    min = Math.min(xg2Var.f5155b.f3176b, Integer.MAX_VALUE);
                    return (int) min;
                }
                throw new IOException("closed");
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f3000a) {
            case 0:
                return;
            default:
                ((xg2) this.f3001b).close();
                return;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        int i = this.f3000a;
        sr srVar = this.f3001b;
        switch (i) {
            case 0:
                lr lrVar = (lr) srVar;
                if (lrVar.f3176b > 0) {
                    return lrVar.readByte() & 255;
                }
                return -1;
            default:
                xg2 xg2Var = (xg2) srVar;
                if (!xg2Var.c) {
                    lr lrVar2 = xg2Var.f5155b;
                    if (lrVar2.f3176b == 0 && xg2Var.f5154a.read(lrVar2, 8192L) == -1) {
                        return -1;
                    }
                    return lrVar2.readByte() & 255;
                }
                throw new IOException("closed");
        }
    }

    public final String toString() {
        int i = this.f3000a;
        sr srVar = this.f3001b;
        switch (i) {
            case 0:
                return ((lr) srVar) + ".inputStream()";
            default:
                return ((xg2) srVar) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.f3000a;
        sr srVar = this.f3001b;
        switch (i3) {
            case 0:
                return ((lr) srVar).read(bArr, i, i2);
            default:
                xg2 xg2Var = (xg2) srVar;
                if (!xg2Var.c) {
                    t9.u(bArr.length, i, i2);
                    lr lrVar = xg2Var.f5155b;
                    if (lrVar.f3176b == 0 && xg2Var.f5154a.read(lrVar, 8192L) == -1) {
                        return -1;
                    }
                    return lrVar.read(bArr, i, i2);
                }
                throw new IOException("closed");
        }
    }
}
