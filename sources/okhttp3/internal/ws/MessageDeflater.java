package okhttp3.internal.ws;

import defpackage.at;
import defpackage.jr;
import defpackage.lr;
import defpackage.t9;
import defpackage.tf3;
import defpackage.uj0;
import defpackage.wg2;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;

/* loaded from: classes2.dex */
public final class MessageDeflater implements Closeable {
    private final lr deflatedBytes;
    private final Deflater deflater;
    private final uj0 deflaterSink;
    private final boolean noContextTakeover;

    public MessageDeflater(boolean z) {
        this.noContextTakeover = z;
        lr lrVar = new lr();
        this.deflatedBytes = lrVar;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new uj0(new wg2(lrVar), deflater);
    }

    private final boolean endsWith(lr lrVar, at atVar) {
        return lrVar.A(lrVar.f3176b - atVar.c(), atVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.deflaterSink.close();
    }

    public final void deflate(lr lrVar) throws IOException {
        boolean z;
        at atVar;
        if (this.deflatedBytes.f3176b == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.noContextTakeover) {
                this.deflater.reset();
            }
            this.deflaterSink.write(lrVar, lrVar.f3176b);
            this.deflaterSink.flush();
            lr lrVar2 = this.deflatedBytes;
            atVar = MessageDeflaterKt.EMPTY_DEFLATE_BLOCK;
            if (endsWith(lrVar2, atVar)) {
                lr lrVar3 = this.deflatedBytes;
                long j = lrVar3.f3176b - 4;
                jr M = lrVar3.M(t9.v);
                try {
                    M.a(j);
                    tf3.y(M, null);
                } finally {
                }
            } else {
                this.deflatedBytes.V(0);
            }
            lr lrVar4 = this.deflatedBytes;
            lrVar.write(lrVar4, lrVar4.f3176b);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
