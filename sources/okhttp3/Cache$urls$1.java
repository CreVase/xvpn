package okhttp3;

import defpackage.qh1;
import defpackage.tf3;
import defpackage.xg2;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import okhttp3.internal.cache.DiskLruCache;

/* loaded from: classes2.dex */
public final class Cache$urls$1 implements Iterator<String>, qh1 {
    private boolean canRemove;
    private final Iterator<DiskLruCache.Snapshot> delegate;
    private String nextUrl;
    final /* synthetic */ Cache this$0;

    public Cache$urls$1(Cache cache) {
        this.this$0 = cache;
        this.delegate = cache.getCache$okhttp().snapshots();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.nextUrl != null) {
            return true;
        }
        this.canRemove = false;
        while (this.delegate.hasNext()) {
            try {
                DiskLruCache.Snapshot next = this.delegate.next();
                try {
                    continue;
                    this.nextUrl = new xg2(next.getSource(0)).y();
                    tf3.y(next, null);
                    return true;
                } finally {
                    try {
                        continue;
                        break;
                    } catch (Throwable th) {
                    }
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (this.canRemove) {
            this.delegate.remove();
            return;
        }
        throw new IllegalStateException("remove() before next()".toString());
    }

    @Override // java.util.Iterator
    public String next() {
        if (hasNext()) {
            String str = this.nextUrl;
            this.nextUrl = null;
            this.canRemove = true;
            return str;
        }
        throw new NoSuchElementException();
    }
}
