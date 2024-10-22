package okhttp3.internal.cache;

import defpackage.ch3;
import defpackage.ji1;
import defpackage.x31;
import java.io.IOException;
import okhttp3.internal.Util;

/* loaded from: classes2.dex */
public final class DiskLruCache$newJournalWriter$faultHidingSink$1 extends ji1 implements x31 {
    final /* synthetic */ DiskLruCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$newJournalWriter$faultHidingSink$1(DiskLruCache diskLruCache) {
        super(1);
        this.this$0 = diskLruCache;
    }

    @Override // defpackage.x31
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((IOException) obj);
        return ch3.f636a;
    }

    public final void invoke(IOException iOException) {
        DiskLruCache diskLruCache = this.this$0;
        if (!Util.assertionsEnabled || Thread.holdsLock(diskLruCache)) {
            this.this$0.hasJournalErrors = true;
            return;
        }
        throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + diskLruCache);
    }
}
