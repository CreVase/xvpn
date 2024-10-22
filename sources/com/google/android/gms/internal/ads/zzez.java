package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class zzez {
    private static zzez zza;
    private final Handler zzb = new Handler(Looper.getMainLooper());
    private final CopyOnWriteArrayList zzc = new CopyOnWriteArrayList();
    private final Object zzd = new Object();
    private int zze = 0;

    private zzez(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new zzey(this, null), intentFilter);
    }

    public static synchronized zzez zzb(Context context) {
        zzez zzezVar;
        synchronized (zzez.class) {
            if (zza == null) {
                zza = new zzez(context);
            }
            zzezVar = zza;
        }
        return zzezVar;
    }

    public static /* synthetic */ void zzc(zzez zzezVar, int i) {
        synchronized (zzezVar.zzd) {
            if (zzezVar.zze == i) {
                return;
            }
            zzezVar.zze = i;
            Iterator it = zzezVar.zzc.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                zzya zzyaVar = (zzya) weakReference.get();
                if (zzyaVar != null) {
                    zzyaVar.zza.zzk(i);
                } else {
                    zzezVar.zzc.remove(weakReference);
                }
            }
        }
    }

    public final int zza() {
        int i;
        synchronized (this.zzd) {
            i = this.zze;
        }
        return i;
    }

    public final void zzd(final zzya zzyaVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                this.zzc.remove(weakReference);
            }
        }
        this.zzc.add(new WeakReference(zzyaVar));
        this.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzev
            @Override // java.lang.Runnable
            public final void run() {
                zzyaVar.zza.zzk(zzez.this.zza());
            }
        });
    }
}
