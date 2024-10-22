package okhttp3.internal.cache2;

import defpackage.lr;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes2.dex */
public final class FileOperator {
    private final FileChannel fileChannel;

    public FileOperator(FileChannel fileChannel) {
        this.fileChannel = fileChannel;
    }

    public final void read(long j, lr lrVar, long j2) {
        if (j2 >= 0) {
            while (j2 > 0) {
                long transferTo = this.fileChannel.transferTo(j, j2, lrVar);
                j += transferTo;
                j2 -= transferTo;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public final void write(long j, lr lrVar, long j2) throws IOException {
        if (j2 >= 0 && j2 <= lrVar.f3176b) {
            long j3 = j;
            long j4 = j2;
            while (j4 > 0) {
                long transferFrom = this.fileChannel.transferFrom(lrVar, j3, j4);
                j3 += transferFrom;
                j4 -= transferFrom;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
