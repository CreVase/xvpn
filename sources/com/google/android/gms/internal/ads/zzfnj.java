package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzfnj {
    private final Context zza;
    private final Executor zzb;
    private final zzfmq zzc;
    private final zzfms zzd;
    private final zzfni zze;
    private final zzfni zzf;
    private Task zzg;
    private Task zzh;

    public zzfnj(Context context, Executor executor, zzfmq zzfmqVar, zzfms zzfmsVar, zzfng zzfngVar, zzfnh zzfnhVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzfmqVar;
        this.zzd = zzfmsVar;
        this.zze = zzfngVar;
        this.zzf = zzfnhVar;
    }

    public static zzfnj zze(Context context, Executor executor, zzfmq zzfmqVar, zzfms zzfmsVar) {
        final zzfnj zzfnjVar = new zzfnj(context, executor, zzfmqVar, zzfmsVar, new zzfng(), new zzfnh());
        if (zzfnjVar.zzd.zzd()) {
            zzfnjVar.zzg = zzfnjVar.zzh(new Callable() { // from class: com.google.android.gms.internal.ads.zzfnd
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzfnj.this.zzc();
                }
            });
        } else {
            zzfnjVar.zzg = Tasks.forResult(zzfnjVar.zze.zza());
        }
        zzfnjVar.zzh = zzfnjVar.zzh(new Callable() { // from class: com.google.android.gms.internal.ads.zzfne
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzfnj.this.zzd();
            }
        });
        return zzfnjVar;
    }

    private static zzapj zzg(Task task, zzapj zzapjVar) {
        if (!task.isSuccessful()) {
            return zzapjVar;
        }
        return (zzapj) task.getResult();
    }

    private final Task zzh(Callable callable) {
        return Tasks.call(this.zzb, callable).addOnFailureListener(this.zzb, new OnFailureListener() { // from class: com.google.android.gms.internal.ads.zzfnf
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzfnj.this.zzf(exc);
            }
        });
    }

    public final zzapj zza() {
        return zzg(this.zzg, this.zze.zza());
    }

    public final zzapj zzb() {
        return zzg(this.zzh, this.zzf.zza());
    }

    public final /* synthetic */ zzapj zzc() throws Exception {
        zzaom zza = zzapj.zza();
        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.zza);
        String id = advertisingIdInfo.getId();
        if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID fromString = UUID.fromString(id);
            byte[] bArr = new byte[16];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.putLong(fromString.getMostSignificantBits());
            wrap.putLong(fromString.getLeastSignificantBits());
            id = Base64.encodeToString(bArr, 11);
        }
        if (id != null) {
            zza.zzs(id);
            zza.zzr(advertisingIdInfo.isLimitAdTrackingEnabled());
            zza.zzab(6);
        }
        return (zzapj) zza.zzal();
    }

    public final /* synthetic */ zzapj zzd() throws Exception {
        Context context = this.zza;
        return zzfmy.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    public final /* synthetic */ void zzf(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.zzc.zzc(2025, -1L, exc);
    }
}
