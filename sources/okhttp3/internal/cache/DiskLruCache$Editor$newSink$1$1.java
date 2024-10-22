package okhttp3.internal.cache;

import defpackage.ch3;
import defpackage.ji1;
import defpackage.x31;
import java.io.IOException;
import okhttp3.internal.cache.DiskLruCache;

/* loaded from: classes2.dex */
public final class DiskLruCache$Editor$newSink$1$1 extends ji1 implements x31 {
    final /* synthetic */ DiskLruCache this$0;
    final /* synthetic */ DiskLruCache.Editor this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$Editor$newSink$1$1(DiskLruCache diskLruCache, DiskLruCache.Editor editor) {
        super(1);
        this.this$0 = diskLruCache;
        this.this$1 = editor;
    }

    @Override // defpackage.x31
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((IOException) obj);
        return ch3.f636a;
    }

    public final void invoke(IOException iOException) {
        DiskLruCache diskLruCache = this.this$0;
        DiskLruCache.Editor editor = this.this$1;
        synchronized (diskLruCache) {
            editor.detach$okhttp();
        }
    }
}
