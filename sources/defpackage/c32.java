package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* loaded from: classes2.dex */
public final class c32 implements Lock {

    /* renamed from: a, reason: collision with root package name */
    public boolean f575a = false;

    @Override // java.util.concurrent.locks.Lock
    public final void lock() {
    }

    @Override // java.util.concurrent.locks.Lock
    public final void lockInterruptibly() {
    }

    @Override // java.util.concurrent.locks.Lock
    public final Condition newCondition() {
        return null;
    }

    @Override // java.util.concurrent.locks.Lock
    public final boolean tryLock(long j, TimeUnit timeUnit) {
        return false;
    }

    @Override // java.util.concurrent.locks.Lock
    public final void unlock() {
        synchronized (this) {
            this.f575a = false;
        }
    }

    @Override // java.util.concurrent.locks.Lock
    public final boolean tryLock() {
        synchronized (this) {
            if (this.f575a) {
                return false;
            }
            this.f575a = true;
            return true;
        }
    }
}
