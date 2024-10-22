package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdlk implements zzdjr {
    private final zzbpm zza;
    private final zzcyd zzb;
    private final zzcxj zzc;
    private final zzdfb zzd;
    private final Context zze;
    private final zzfcr zzf;
    private final zzcaz zzg;
    private final zzfdn zzh;
    private boolean zzi = false;
    private boolean zzj = false;
    private boolean zzk = true;
    private final zzbpi zzl;
    private final zzbpj zzm;

    public zzdlk(zzbpi zzbpiVar, zzbpj zzbpjVar, zzbpm zzbpmVar, zzcyd zzcydVar, zzcxj zzcxjVar, zzdfb zzdfbVar, Context context, zzfcr zzfcrVar, zzcaz zzcazVar, zzfdn zzfdnVar) {
        this.zzl = zzbpiVar;
        this.zzm = zzbpjVar;
        this.zza = zzbpmVar;
        this.zzb = zzcydVar;
        this.zzc = zzcxjVar;
        this.zzd = zzdfbVar;
        this.zze = context;
        this.zzf = zzfcrVar;
        this.zzg = zzcazVar;
        this.zzh = zzfdnVar;
    }

    private final void zzb(View view) {
        try {
            zzbpm zzbpmVar = this.zza;
            if (zzbpmVar != null && !zzbpmVar.zzA()) {
                this.zza.zzw(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzjU)).booleanValue()) {
                    this.zzd.zzbK();
                    return;
                }
                return;
            }
            zzbpi zzbpiVar = this.zzl;
            if (zzbpiVar != null && !zzbpiVar.zzx()) {
                this.zzl.zzs(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzjU)).booleanValue()) {
                    this.zzd.zzbK();
                    return;
                }
                return;
            }
            zzbpj zzbpjVar = this.zzm;
            if (zzbpjVar != null && !zzbpjVar.zzv()) {
                this.zzm.zzq(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzjU)).booleanValue()) {
                    this.zzd.zzbK();
                }
            }
        } catch (RemoteException e) {
            zzcat.zzk("Failed to call handleClick", e);
        }
    }

    private static final HashMap zzc(Map map) {
        HashMap hashMap = new HashMap();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            for (Map.Entry entry : map.entrySet()) {
                View view = (View) ((WeakReference) entry.getValue()).get();
                if (view != null) {
                    hashMap.put((String) entry.getKey(), view);
                }
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final boolean zzA() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final boolean zzB() {
        return this.zzf.zzN;
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final boolean zzC(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final JSONObject zze(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final JSONObject zzf(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzg() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzj(com.google.android.gms.ads.internal.client.zzcw zzcwVar) {
        zzcat.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzk(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) {
        if (this.zzj && this.zzf.zzN) {
            return;
        }
        zzb(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzl(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzm(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzo(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i) {
        if (!this.zzj) {
            zzcat.zzj("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (!this.zzf.zzN) {
            zzcat.zzj("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        } else {
            zzb(view2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzp() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzq(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.zzi) {
                this.zzi = com.google.android.gms.ads.internal.zzt.zzs().zzn(this.zze, this.zzg.zza, this.zzf.zzE.toString(), this.zzh.zzf);
            }
            if (!this.zzk) {
                return;
            }
            zzbpm zzbpmVar = this.zza;
            if (zzbpmVar != null && !zzbpmVar.zzB()) {
                this.zza.zzx();
                this.zzb.zza();
                return;
            }
            zzbpi zzbpiVar = this.zzl;
            if (zzbpiVar != null && !zzbpiVar.zzy()) {
                this.zzl.zzt();
                this.zzb.zza();
                return;
            }
            zzbpj zzbpjVar = this.zzm;
            if (zzbpjVar != null && !zzbpjVar.zzw()) {
                this.zzm.zzr();
                this.zzb.zza();
            }
        } catch (RemoteException e) {
            zzcat.zzk("Failed to call recordImpression", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzr() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzs(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzt(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzu(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzv() {
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzw(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        zzcat.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzx(zzbhi zzbhiVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzy(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Map map3;
        Map map4;
        Object obj;
        IObjectWrapper zzn;
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            JSONObject jSONObject = this.zzf.zzal;
            boolean z = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbv)).booleanValue() && jSONObject.length() != 0) {
                if (map == null) {
                    map3 = new HashMap();
                } else {
                    map3 = map;
                }
                if (map2 == null) {
                    map4 = new HashMap();
                } else {
                    map4 = map2;
                }
                HashMap hashMap = new HashMap();
                hashMap.putAll(map3);
                hashMap.putAll(map4);
                Iterator<String> keys = jSONObject.keys();
                loop0: while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray optJSONArray = jSONObject.optJSONArray(next);
                    if (optJSONArray != null) {
                        WeakReference weakReference = (WeakReference) hashMap.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbw)).booleanValue() && next.equals("3010")) {
                                zzbpm zzbpmVar = this.zza;
                                Object obj2 = null;
                                if (zzbpmVar != null) {
                                    try {
                                        zzn = zzbpmVar.zzn();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    zzbpi zzbpiVar = this.zzl;
                                    if (zzbpiVar != null) {
                                        zzn = zzbpiVar.zzk();
                                    } else {
                                        zzbpj zzbpjVar = this.zzm;
                                        if (zzbpjVar != null) {
                                            zzn = zzbpjVar.zzj();
                                        } else {
                                            zzn = null;
                                        }
                                    }
                                }
                                if (zzn != null) {
                                    obj2 = ObjectWrapper.unwrap(zzn);
                                }
                                if (obj2 != null) {
                                    cls = obj2.getClass();
                                }
                            }
                            try {
                                ArrayList arrayList = new ArrayList();
                                com.google.android.gms.ads.internal.util.zzbw.zzc(optJSONArray, arrayList);
                                com.google.android.gms.ads.internal.zzt.zzp();
                                ClassLoader classLoader = this.zze.getClassLoader();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    if (Class.forName((String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                        break;
                                    }
                                }
                            } catch (JSONException unused2) {
                                continue;
                            }
                        }
                        z = false;
                        break;
                    }
                }
            }
            this.zzk = z;
            HashMap zzc = zzc(map);
            HashMap zzc2 = zzc(map2);
            zzbpm zzbpmVar2 = this.zza;
            if (zzbpmVar2 != null) {
                zzbpmVar2.zzy(wrap, ObjectWrapper.wrap(zzc), ObjectWrapper.wrap(zzc2));
                return;
            }
            zzbpi zzbpiVar2 = this.zzl;
            if (zzbpiVar2 != null) {
                zzbpiVar2.zzv(wrap, ObjectWrapper.wrap(zzc), ObjectWrapper.wrap(zzc2));
                this.zzl.zzu(wrap);
                return;
            }
            zzbpj zzbpjVar2 = this.zzm;
            if (zzbpjVar2 != null) {
                zzbpjVar2.zzt(wrap, ObjectWrapper.wrap(zzc), ObjectWrapper.wrap(zzc2));
                this.zzm.zzs(wrap);
            }
        } catch (RemoteException e) {
            zzcat.zzk("Failed to call trackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzz(View view, Map map) {
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            zzbpm zzbpmVar = this.zza;
            if (zzbpmVar != null) {
                zzbpmVar.zzz(wrap);
                return;
            }
            zzbpi zzbpiVar = this.zzl;
            if (zzbpiVar != null) {
                zzbpiVar.zzw(wrap);
                return;
            }
            zzbpj zzbpjVar = this.zzm;
            if (zzbpjVar != null) {
                zzbpjVar.zzu(wrap);
            }
        } catch (RemoteException e) {
            zzcat.zzk("Failed to call untrackView", e);
        }
    }
}
