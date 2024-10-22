package com.google.android.gms.cloudmessaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzm implements ServiceConnection {
    zzn zzc;
    final /* synthetic */ zzs zzf;
    int zza = 0;
    final Messenger zzb = new Messenger(new com.google.android.gms.internal.cloudmessaging.zzf(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.gms.cloudmessaging.zzf
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            zzm zzmVar = zzm.this;
            int i = message.arg1;
            synchronized (zzmVar) {
                zzp<?> zzpVar = zzmVar.zze.get(i);
                if (zzpVar != null) {
                    zzmVar.zze.remove(i);
                    zzmVar.zzf();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        zzpVar.zzc(new zzq(4, "Not supported by GmsCore", null));
                        return true;
                    }
                    zzpVar.zza(data);
                    return true;
                }
                return true;
            }
        }
    }));
    final Queue<zzp<?>> zzd = new ArrayDeque();
    final SparseArray<zzp<?>> zze = new SparseArray<>();

    public /* synthetic */ zzm(zzs zzsVar, zzl zzlVar) {
        this.zzf = zzsVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        zzs.zze(this.zzf).execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzj
            @Override // java.lang.Runnable
            public final void run() {
                zzm zzmVar = zzm.this;
                IBinder iBinder2 = iBinder;
                synchronized (zzmVar) {
                    try {
                        if (iBinder2 == null) {
                            zzmVar.zza(0, "Null service connection");
                            return;
                        }
                        try {
                            zzmVar.zzc = new zzn(iBinder2);
                            zzmVar.zza = 2;
                            zzmVar.zzc();
                        } catch (RemoteException e) {
                            zzmVar.zza(0, e.getMessage());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzs.zze(this.zzf).execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzg
            @Override // java.lang.Runnable
            public final void run() {
                zzm.this.zza(2, "Service disconnected");
            }
        });
    }

    public final synchronized void zza(int i, String str) {
        zzb(i, str, null);
    }

    public final synchronized void zzb(int i, String str, Throwable th) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Disconnected: ".concat(valueOf);
            }
        }
        int i2 = this.zza;
        if (i2 != 0) {
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.zza = 4;
                return;
            }
            Log.isLoggable("MessengerIpcClient", 2);
            this.zza = 4;
            ConnectionTracker.getInstance().unbindService(zzs.zza(this.zzf), this);
            zzq zzqVar = new zzq(i, str, th);
            Iterator<zzp<?>> it = this.zzd.iterator();
            while (it.hasNext()) {
                it.next().zzc(zzqVar);
            }
            this.zzd.clear();
            for (int i3 = 0; i3 < this.zze.size(); i3++) {
                this.zze.valueAt(i3).zzc(zzqVar);
            }
            this.zze.clear();
            return;
        }
        throw new IllegalStateException();
    }

    public final void zzc() {
        zzs.zze(this.zzf).execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzh
            @Override // java.lang.Runnable
            public final void run() {
                final zzp<?> poll;
                final zzm zzmVar = zzm.this;
                while (true) {
                    synchronized (zzmVar) {
                        if (zzmVar.zza != 2) {
                            return;
                        }
                        if (zzmVar.zzd.isEmpty()) {
                            zzmVar.zzf();
                            return;
                        } else {
                            poll = zzmVar.zzd.poll();
                            zzmVar.zze.put(poll.zza, poll);
                            zzs.zze(zzmVar.zzf).schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzk
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzm.this.zze(poll.zza);
                                }
                            }, 30L, TimeUnit.SECONDS);
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        new StringBuilder(String.valueOf(poll).length() + 8);
                    }
                    Context zza = zzs.zza(zzmVar.zzf);
                    Messenger messenger = zzmVar.zzb;
                    Message obtain = Message.obtain();
                    obtain.what = poll.zzc;
                    obtain.arg1 = poll.zza;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", poll.zzb());
                    bundle.putString("pkg", zza.getPackageName());
                    bundle.putBundle("data", poll.zzd);
                    obtain.setData(bundle);
                    try {
                        zzmVar.zzc.zza(obtain);
                    } catch (RemoteException e) {
                        zzmVar.zza(2, e.getMessage());
                    }
                }
            }
        });
    }

    public final synchronized void zzd() {
        if (this.zza == 1) {
            zza(1, "Timed out while binding");
        }
    }

    public final synchronized void zze(int i) {
        zzp<?> zzpVar = this.zze.get(i);
        if (zzpVar != null) {
            this.zze.remove(i);
            zzpVar.zzc(new zzq(3, "Timed out waiting for response", null));
            zzf();
        }
    }

    public final synchronized void zzf() {
        if (this.zza == 2 && this.zzd.isEmpty() && this.zze.size() == 0) {
            Log.isLoggable("MessengerIpcClient", 2);
            this.zza = 3;
            ConnectionTracker.getInstance().unbindService(zzs.zza(this.zzf), this);
        }
    }

    public final synchronized boolean zzg(zzp<?> zzpVar) {
        boolean z;
        int i = this.zza;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                this.zzd.add(zzpVar);
                zzc();
                return true;
            }
            this.zzd.add(zzpVar);
            return true;
        }
        this.zzd.add(zzpVar);
        if (this.zza == 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        Log.isLoggable("MessengerIpcClient", 2);
        this.zza = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (!ConnectionTracker.getInstance().bindService(zzs.zza(this.zzf), intent, this, 1)) {
                zza(0, "Unable to bind to service");
            } else {
                zzs.zze(this.zzf).schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzi
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzm.this.zzd();
                    }
                }, 30L, TimeUnit.SECONDS);
            }
        } catch (SecurityException e) {
            zzb(0, "Unable to bind to service", e);
        }
        return true;
    }
}
