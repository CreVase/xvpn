package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class zzfrw {
    private static final Map zza = new HashMap();
    private final Context zzb;
    private final zzfrl zzc;
    private boolean zzh;
    private final Intent zzi;
    private ServiceConnection zzm;
    private IInterface zzn;
    private final zzfqt zzo;
    private final List zze = new ArrayList();
    private final Set zzf = new HashSet();
    private final Object zzg = new Object();
    private final IBinder.DeathRecipient zzk = new IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.zzfrn
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            zzfrw.zzj(zzfrw.this);
        }
    };
    private final AtomicInteger zzl = new AtomicInteger(0);
    private final String zzd = "OverlayDisplayService";
    private final WeakReference zzj = new WeakReference(null);

    public zzfrw(Context context, zzfrl zzfrlVar, String str, Intent intent, zzfqt zzfqtVar, zzfrr zzfrrVar) {
        this.zzb = context;
        this.zzc = zzfrlVar;
        this.zzi = intent;
        this.zzo = zzfqtVar;
    }

    public static /* synthetic */ void zzj(zzfrw zzfrwVar) {
        zzfrwVar.zzc.zzc("reportBinderDeath", new Object[0]);
        zzfrr zzfrrVar = (zzfrr) zzfrwVar.zzj.get();
        if (zzfrrVar != null) {
            zzfrwVar.zzc.zzc("calling onBinderDied", new Object[0]);
            zzfrrVar.zza();
        } else {
            zzfrwVar.zzc.zzc("%s : Binder has died.", zzfrwVar.zzd);
            Iterator it = zzfrwVar.zze.iterator();
            while (it.hasNext()) {
                ((zzfrm) it.next()).zzc(zzfrwVar.zzv());
            }
            zzfrwVar.zze.clear();
        }
        synchronized (zzfrwVar.zzg) {
            zzfrwVar.zzw();
        }
    }

    public static /* bridge */ /* synthetic */ void zzn(zzfrw zzfrwVar, final TaskCompletionSource taskCompletionSource) {
        zzfrwVar.zzf.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.internal.ads.zzfro
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                zzfrw.this.zzt(taskCompletionSource, task);
            }
        });
    }

    public static /* bridge */ /* synthetic */ void zzp(zzfrw zzfrwVar, zzfrm zzfrmVar) {
        if (zzfrwVar.zzn == null && !zzfrwVar.zzh) {
            zzfrwVar.zzc.zzc("Initiate binding to the service.", new Object[0]);
            zzfrwVar.zze.add(zzfrmVar);
            zzfrv zzfrvVar = new zzfrv(zzfrwVar, null);
            zzfrwVar.zzm = zzfrvVar;
            zzfrwVar.zzh = true;
            if (!zzfrwVar.zzb.bindService(zzfrwVar.zzi, zzfrvVar, 1)) {
                zzfrwVar.zzc.zzc("Failed to bind to the service.", new Object[0]);
                zzfrwVar.zzh = false;
                Iterator it = zzfrwVar.zze.iterator();
                while (it.hasNext()) {
                    ((zzfrm) it.next()).zzc(new zzfrx());
                }
                zzfrwVar.zze.clear();
                return;
            }
            return;
        }
        if (zzfrwVar.zzh) {
            zzfrwVar.zzc.zzc("Waiting to bind to the service.", new Object[0]);
            zzfrwVar.zze.add(zzfrmVar);
        } else {
            zzfrmVar.run();
        }
    }

    public static /* bridge */ /* synthetic */ void zzq(zzfrw zzfrwVar) {
        zzfrwVar.zzc.zzc("linkToDeath", new Object[0]);
        try {
            zzfrwVar.zzn.asBinder().linkToDeath(zzfrwVar.zzk, 0);
        } catch (RemoteException e) {
            zzfrwVar.zzc.zzb(e, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void zzr(zzfrw zzfrwVar) {
        zzfrwVar.zzc.zzc("unlinkToDeath", new Object[0]);
        zzfrwVar.zzn.asBinder().unlinkToDeath(zzfrwVar.zzk, 0);
    }

    private final RemoteException zzv() {
        return new RemoteException(String.valueOf(this.zzd).concat(" : Binder has died."));
    }

    public final void zzw() {
        Iterator it = this.zzf.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(zzv());
        }
        this.zzf.clear();
    }

    public final Handler zzc() {
        Handler handler;
        Map map = zza;
        synchronized (map) {
            if (!map.containsKey(this.zzd)) {
                HandlerThread handlerThread = new HandlerThread(this.zzd, 10);
                handlerThread.start();
                map.put(this.zzd, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.zzd);
        }
        return handler;
    }

    public final IInterface zze() {
        return this.zzn;
    }

    public final void zzs(zzfrm zzfrmVar, TaskCompletionSource taskCompletionSource) {
        zzc().post(new zzfrp(this, zzfrmVar.zzb(), taskCompletionSource, zzfrmVar));
    }

    public final /* synthetic */ void zzt(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.zzg) {
            this.zzf.remove(taskCompletionSource);
        }
    }

    public final void zzu() {
        zzc().post(new zzfrq(this));
    }
}
