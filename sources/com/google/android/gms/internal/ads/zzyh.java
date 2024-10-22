package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"HandlerLeak"})
/* loaded from: classes.dex */
public final class zzyh extends Handler implements Runnable {
    final /* synthetic */ zzym zza;
    private final zzyi zzb;
    private final long zzc;
    private zzye zzd;
    private IOException zze;
    private int zzf;
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzyh(zzym zzymVar, Looper looper, zzyi zzyiVar, zzye zzyeVar, int i, long j) {
        super(looper);
        this.zza = zzymVar;
        this.zzb = zzyiVar;
        this.zzd = zzyeVar;
        this.zzc = j;
    }

    private final void zzd() {
        ExecutorService executorService;
        zzyh zzyhVar;
        this.zze = null;
        zzym zzymVar = this.zza;
        executorService = zzymVar.zze;
        zzyhVar = zzymVar.zzf;
        zzyhVar.getClass();
        executorService.execute(zzyhVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i;
        int i2;
        int i3;
        long j;
        long min;
        if (this.zzi) {
            return;
        }
        int i4 = message.what;
        if (i4 == 0) {
            zzd();
            return;
        }
        if (i4 != 3) {
            this.zza.zzf = null;
            long j2 = this.zzc;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = elapsedRealtime - j2;
            zzye zzyeVar = this.zzd;
            zzyeVar.getClass();
            if (this.zzh) {
                zzyeVar.zzJ(this.zzb, elapsedRealtime, j3, false);
                return;
            }
            int i5 = message.what;
            if (i5 != 1) {
                if (i5 == 2) {
                    IOException iOException = (IOException) message.obj;
                    this.zze = iOException;
                    int i6 = this.zzf + 1;
                    this.zzf = i6;
                    zzyg zzu = zzyeVar.zzu(this.zzb, elapsedRealtime, j3, iOException, i6);
                    i = zzu.zza;
                    if (i == 3) {
                        this.zza.zzg = this.zze;
                        return;
                    }
                    i2 = zzu.zza;
                    if (i2 != 2) {
                        i3 = zzu.zza;
                        if (i3 == 1) {
                            this.zzf = 1;
                        }
                        j = zzu.zzb;
                        if (j != -9223372036854775807L) {
                            min = zzu.zzb;
                        } else {
                            min = Math.min((this.zzf - 1) * 1000, 5000);
                        }
                        zzc(min);
                        return;
                    }
                    return;
                }
                return;
            }
            try {
                zzyeVar.zzK(this.zzb, elapsedRealtime, j3);
                return;
            } catch (RuntimeException e) {
                zzer.zzd("LoadTask", "Unexpected exception handling load completed", e);
                this.zza.zzg = new zzyl(e);
                return;
            }
        }
        throw ((Error) message.obj);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = !this.zzh;
                this.zzg = Thread.currentThread();
            }
            if (z) {
                String concat = "load:".concat(this.zzb.getClass().getSimpleName());
                int i = zzfk.zza;
                Trace.beginSection(concat);
                try {
                    this.zzb.zzh();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.zzg = null;
                Thread.interrupted();
            }
            if (!this.zzi) {
                sendEmptyMessage(1);
            }
        } catch (IOException e) {
            if (!this.zzi) {
                obtainMessage(2, e).sendToTarget();
            }
        } catch (OutOfMemoryError e2) {
            if (!this.zzi) {
                zzer.zzd("LoadTask", "OutOfMemory error loading stream", e2);
                obtainMessage(2, new zzyl(e2)).sendToTarget();
            }
        } catch (Error e3) {
            if (!this.zzi) {
                zzer.zzd("LoadTask", "Unexpected error loading stream", e3);
                obtainMessage(3, e3).sendToTarget();
            }
            throw e3;
        } catch (Exception e4) {
            if (!this.zzi) {
                zzer.zzd("LoadTask", "Unexpected exception loading stream", e4);
                obtainMessage(2, new zzyl(e4)).sendToTarget();
            }
        }
    }

    public final void zza(boolean z) {
        this.zzi = z;
        this.zze = null;
        if (hasMessages(0)) {
            this.zzh = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.zzh = true;
                this.zzb.zzg();
                Thread thread = this.zzg;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            this.zza.zzf = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            zzye zzyeVar = this.zzd;
            zzyeVar.getClass();
            zzyeVar.zzJ(this.zzb, elapsedRealtime, elapsedRealtime - this.zzc, true);
            this.zzd = null;
        }
    }

    public final void zzb(int i) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null && this.zzf > i) {
            throw iOException;
        }
    }

    public final void zzc(long j) {
        zzyh zzyhVar;
        boolean z;
        zzyhVar = this.zza.zzf;
        if (zzyhVar == null) {
            z = true;
        } else {
            z = false;
        }
        zzdx.zzf(z);
        this.zza.zzf = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            zzd();
        }
    }
}
