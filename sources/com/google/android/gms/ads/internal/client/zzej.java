package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzblg;
import com.google.android.gms.internal.ads.zzblo;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzboq;
import com.google.android.gms.internal.ads.zzbou;
import com.google.android.gms.internal.ads.zzcai;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzftl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzej {
    private static zzej zza;
    private zzco zzg;
    private final Object zzb = new Object();
    private boolean zzd = false;
    private boolean zze = false;
    private final Object zzf = new Object();
    private OnAdInspectorClosedListener zzh = null;
    private RequestConfiguration zzi = new RequestConfiguration.Builder().build();
    private final ArrayList zzc = new ArrayList();

    private zzej() {
    }

    private final void zzA(Context context) {
        if (this.zzg == null) {
            this.zzg = (zzco) new zzaq(zzay.zza(), context).zzd(context, false);
        }
    }

    private final void zzB(RequestConfiguration requestConfiguration) {
        try {
            this.zzg.zzu(new zzff(requestConfiguration));
        } catch (RemoteException e) {
            zzcat.zzh("Unable to set request configuration parcel.", e);
        }
    }

    public static zzej zzf() {
        zzej zzejVar;
        synchronized (zzej.class) {
            if (zza == null) {
                zza = new zzej();
            }
            zzejVar = zza;
        }
        return zzejVar;
    }

    public static InitializationStatus zzy(List list) {
        AdapterStatus.State state;
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzblg zzblgVar = (zzblg) it.next();
            String str = zzblgVar.zza;
            if (zzblgVar.zzb) {
                state = AdapterStatus.State.READY;
            } else {
                state = AdapterStatus.State.NOT_READY;
            }
            hashMap.put(str, new zzblo(state, zzblgVar.zzd, zzblgVar.zzc));
        }
        return new zzblp(hashMap);
    }

    private final void zzz(Context context, String str) {
        try {
            zzboq.zza().zzb(context, null);
            this.zzg.zzk();
            this.zzg.zzl(null, ObjectWrapper.wrap(null));
        } catch (RemoteException e) {
            zzcat.zzk("MobileAdsSettingManager initialization failed", e);
        }
    }

    public final float zza() {
        synchronized (this.zzf) {
            zzco zzcoVar = this.zzg;
            float f = 1.0f;
            if (zzcoVar == null) {
                return 1.0f;
            }
            try {
                f = zzcoVar.zze();
            } catch (RemoteException e) {
                zzcat.zzh("Unable to get app volume.", e);
            }
            return f;
        }
    }

    public final RequestConfiguration zzc() {
        return this.zzi;
    }

    public final InitializationStatus zze() {
        boolean z;
        InitializationStatus zzy;
        synchronized (this.zzf) {
            if (this.zzg != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "MobileAds.initialize() must be called prior to getting initialization status.");
            try {
                zzy = zzy(this.zzg.zzg());
            } catch (RemoteException unused) {
                zzcat.zzg("Unable to get Initialization status.");
                return new InitializationStatus() { // from class: com.google.android.gms.ads.internal.client.zzeb
                    @Override // com.google.android.gms.ads.initialization.InitializationStatus
                    public final Map getAdapterStatusMap() {
                        HashMap hashMap = new HashMap();
                        hashMap.put("com.google.android.gms.ads.MobileAds", new zzee(zzej.this));
                        return hashMap;
                    }
                };
            }
        }
        return zzy;
    }

    public final String zzh() {
        boolean z;
        String zzc;
        synchronized (this.zzf) {
            if (this.zzg != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "MobileAds.initialize() must be called prior to getting version string.");
            try {
                zzc = zzftl.zzc(this.zzg.zzf());
            } catch (RemoteException e) {
                zzcat.zzh("Unable to get internal version.", e);
                return "";
            }
        }
        return zzc;
    }

    public final void zzl(Context context) {
        synchronized (this.zzf) {
            zzA(context);
            try {
                this.zzg.zzi();
            } catch (RemoteException unused) {
                zzcat.zzg("Unable to disable mediation adapter initialization.");
            }
        }
    }

    public final void zzm(boolean z) {
        boolean z2;
        String str;
        synchronized (this.zzf) {
            if (this.zzg != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            Preconditions.checkState(z2, "MobileAds.initialize() must be called prior to enable/disable Same App Key.");
            try {
                this.zzg.zzj(z);
            } catch (RemoteException e) {
                if (z) {
                    str = "enable";
                } else {
                    str = "disable";
                }
                zzcat.zzh("Unable to " + str + " Same App Key.", e);
                if (e.getMessage() != null && e.getMessage().toLowerCase(Locale.ROOT).contains("paid")) {
                    throw new IllegalStateException(e);
                }
            }
        }
    }

    public final void zzn(Context context, String str, OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (this.zzb) {
            if (this.zzd) {
                if (onInitializationCompleteListener != null) {
                    this.zzc.add(onInitializationCompleteListener);
                }
                return;
            }
            if (this.zze) {
                if (onInitializationCompleteListener != null) {
                    onInitializationCompleteListener.onInitializationComplete(zze());
                }
                return;
            }
            this.zzd = true;
            if (onInitializationCompleteListener != null) {
                this.zzc.add(onInitializationCompleteListener);
            }
            if (context != null) {
                synchronized (this.zzf) {
                    String str2 = null;
                    try {
                        zzA(context);
                        this.zzg.zzs(new zzei(this, null));
                        this.zzg.zzo(new zzbou());
                        if (this.zzi.getTagForChildDirectedTreatment() != -1 || this.zzi.getTagForUnderAgeOfConsent() != -1) {
                            zzB(this.zzi);
                        }
                    } catch (RemoteException e) {
                        zzcat.zzk("MobileAdsSettingManager initialization failed", e);
                    }
                    zzbci.zza(context);
                    if (((Boolean) zzbdz.zza.zze()).booleanValue()) {
                        if (((Boolean) zzba.zzc().zzb(zzbci.zzkl)).booleanValue()) {
                            zzcat.zze("Initializing on bg thread");
                            zzcai.zza.execute(new Runnable(context, str2) { // from class: com.google.android.gms.ads.internal.client.zzec
                                public final /* synthetic */ Context zzb;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzej.this.zzo(this.zzb, null);
                                }
                            });
                        }
                    }
                    if (((Boolean) zzbdz.zzb.zze()).booleanValue()) {
                        if (((Boolean) zzba.zzc().zzb(zzbci.zzkl)).booleanValue()) {
                            zzcai.zzb.execute(new Runnable(context, str2) { // from class: com.google.android.gms.ads.internal.client.zzed
                                public final /* synthetic */ Context zzb;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzej.this.zzp(this.zzb, null);
                                }
                            });
                        }
                    }
                    zzcat.zze("Initializing on calling thread");
                    zzz(context, null);
                }
                return;
            }
            throw new IllegalArgumentException("Context cannot be null.");
        }
    }

    public final /* synthetic */ void zzo(Context context, String str) {
        synchronized (this.zzf) {
            zzz(context, null);
        }
    }

    public final /* synthetic */ void zzp(Context context, String str) {
        synchronized (this.zzf) {
            zzz(context, null);
        }
    }

    public final void zzq(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        synchronized (this.zzf) {
            zzA(context);
            this.zzh = onAdInspectorClosedListener;
            try {
                this.zzg.zzm(new zzeg(null));
            } catch (RemoteException unused) {
                zzcat.zzg("Unable to open the ad inspector.");
                if (onAdInspectorClosedListener != null) {
                    onAdInspectorClosedListener.onAdInspectorClosed(new AdInspectorError(0, "Ad inspector had an internal error.", MobileAds.ERROR_DOMAIN));
                }
            }
        }
    }

    public final void zzr(Context context, String str) {
        boolean z;
        synchronized (this.zzf) {
            if (this.zzg != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.zzg.zzn(ObjectWrapper.wrap(context), str);
            } catch (RemoteException e) {
                zzcat.zzh("Unable to open debug menu.", e);
            }
        }
    }

    public final void zzs(Class cls) {
        synchronized (this.zzf) {
            try {
                this.zzg.zzh(cls.getCanonicalName());
            } catch (RemoteException e) {
                zzcat.zzh("Unable to register RtbAdapter", e);
            }
        }
    }

    public final void zzt(boolean z) {
        boolean z2;
        synchronized (this.zzf) {
            if (this.zzg != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            Preconditions.checkState(z2, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.zzg.zzp(z);
            } catch (RemoteException e) {
                zzcat.zzh("Unable to set app mute state.", e);
            }
        }
    }

    public final void zzu(float f) {
        boolean z;
        boolean z2 = true;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.zzf) {
            if (this.zzg == null) {
                z2 = false;
            }
            Preconditions.checkState(z2, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.zzg.zzq(f);
            } catch (RemoteException e) {
                zzcat.zzh("Unable to set app volume.", e);
            }
        }
    }

    public final void zzv(String str) {
        boolean z;
        synchronized (this.zzf) {
            if (this.zzg != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "MobileAds.initialize() must be called prior to setting the plugin.");
            try {
                this.zzg.zzt(str);
            } catch (RemoteException e) {
                zzcat.zzh("Unable to set plugin.", e);
            }
        }
    }

    public final void zzw(RequestConfiguration requestConfiguration) {
        boolean z;
        if (requestConfiguration != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Null passed to setRequestConfiguration.");
        synchronized (this.zzf) {
            RequestConfiguration requestConfiguration2 = this.zzi;
            this.zzi = requestConfiguration;
            if (this.zzg == null) {
                return;
            }
            if (requestConfiguration2.getTagForChildDirectedTreatment() != requestConfiguration.getTagForChildDirectedTreatment() || requestConfiguration2.getTagForUnderAgeOfConsent() != requestConfiguration.getTagForUnderAgeOfConsent()) {
                zzB(requestConfiguration);
            }
        }
    }

    public final boolean zzx() {
        synchronized (this.zzf) {
            zzco zzcoVar = this.zzg;
            boolean z = false;
            if (zzcoVar == null) {
                return false;
            }
            try {
                z = zzcoVar.zzv();
            } catch (RemoteException e) {
                zzcat.zzh("Unable to get app mute state.", e);
            }
            return z;
        }
    }
}
