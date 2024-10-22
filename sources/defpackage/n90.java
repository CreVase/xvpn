package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class n90 {
    public static final HashMap e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final File f3415a;

    /* renamed from: b, reason: collision with root package name */
    public final Lock f3416b;
    public final boolean c;
    public FileChannel d;

    public n90(String str, File file, boolean z) {
        Lock lock;
        File file2 = new File(file, p71.l(str, ".lck"));
        this.f3415a = file2;
        String absolutePath = file2.getAbsolutePath();
        HashMap hashMap = e;
        synchronized (hashMap) {
            lock = (Lock) hashMap.get(absolutePath);
            if (lock == null) {
                lock = new ReentrantLock();
                hashMap.put(absolutePath, lock);
            }
        }
        this.f3416b = lock;
        this.c = z;
    }

    public final void a() {
        FileChannel fileChannel = this.d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f3416b.unlock();
    }
}
