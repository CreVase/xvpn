package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhc extends Thread {
    private final Object zza;
    private final BlockingQueue<zzhd<?>> zzb;
    private boolean zzc = false;
    private final /* synthetic */ zzgy zzd;

    public zzhc(zzgy zzgyVar, String str, BlockingQueue<zzhd<?>> blockingQueue) {
        this.zzd = zzgyVar;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(blockingQueue);
        this.zza = new Object();
        this.zzb = blockingQueue;
        setName(str);
    }

    private final void zza(InterruptedException interruptedException) {
        this.zzd.zzj().zzu().zza(getName() + " was interrupted", interruptedException);
    }

    private final void zzb() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        zzhc zzhcVar;
        zzhc zzhcVar2;
        obj = this.zzd.zzh;
        synchronized (obj) {
            if (!this.zzc) {
                semaphore = this.zzd.zzi;
                semaphore.release();
                obj2 = this.zzd.zzh;
                obj2.notifyAll();
                zzhcVar = this.zzd.zzb;
                if (this != zzhcVar) {
                    zzhcVar2 = this.zzd.zzc;
                    if (this == zzhcVar2) {
                        this.zzd.zzc = null;
                    } else {
                        this.zzd.zzj().zzg().zza("Current scheduler thread is neither worker nor network");
                    }
                } else {
                    this.zzd.zzb = null;
                }
                this.zzc = true;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Semaphore semaphore;
        int i;
        Object obj;
        boolean z;
        boolean z2 = false;
        while (!z2) {
            try {
                semaphore = this.zzd.zzi;
                semaphore.acquire();
                z2 = true;
            } catch (InterruptedException e) {
                zza(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                zzhd<?> poll = this.zzb.poll();
                if (poll != null) {
                    if (poll.zza) {
                        i = threadPriority;
                    } else {
                        i = 10;
                    }
                    Process.setThreadPriority(i);
                    poll.run();
                } else {
                    synchronized (this.zza) {
                        if (this.zzb.peek() == null) {
                            z = this.zzd.zzj;
                            if (!z) {
                                try {
                                    this.zza.wait(30000L);
                                } catch (InterruptedException e2) {
                                    zza(e2);
                                }
                            }
                        }
                    }
                    obj = this.zzd.zzh;
                    synchronized (obj) {
                        if (this.zzb.peek() == null) {
                            zzb();
                            return;
                        }
                    }
                }
            }
        } finally {
            zzb();
        }
    }

    public final void zza() {
        synchronized (this.zza) {
            this.zza.notifyAll();
        }
    }
}
