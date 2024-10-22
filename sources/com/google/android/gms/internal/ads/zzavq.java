package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

/* loaded from: classes.dex */
public final class zzavq {
    private final Object zza = new Object();
    private zzavo zzb = null;
    private boolean zzc = false;

    public final Activity zza() {
        synchronized (this.zza) {
            zzavo zzavoVar = this.zzb;
            if (zzavoVar != null) {
                return zzavoVar.zza();
            }
            return null;
        }
    }

    public final Context zzb() {
        synchronized (this.zza) {
            zzavo zzavoVar = this.zzb;
            if (zzavoVar != null) {
                return zzavoVar.zzb();
            }
            return null;
        }
    }

    public final void zzc(zzavp zzavpVar) {
        synchronized (this.zza) {
            if (this.zzb == null) {
                this.zzb = new zzavo();
            }
            this.zzb.zzf(zzavpVar);
        }
    }

    public final void zzd(Context context) {
        Application application;
        synchronized (this.zza) {
            if (!this.zzc) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                } else {
                    application = null;
                }
                if (application == null) {
                    zzcat.zzj("Can not cast Context to Application");
                    return;
                }
                if (this.zzb == null) {
                    this.zzb = new zzavo();
                }
                this.zzb.zzg(application, context);
                this.zzc = true;
            }
        }
    }

    public final void zze(zzavp zzavpVar) {
        synchronized (this.zza) {
            zzavo zzavoVar = this.zzb;
            if (zzavoVar == null) {
                return;
            }
            zzavoVar.zzh(zzavpVar);
        }
    }
}
