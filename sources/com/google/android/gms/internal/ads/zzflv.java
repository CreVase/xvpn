package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class zzflv {
    private final HashMap zza = new HashMap();
    private final HashMap zzb = new HashMap();
    private final HashMap zzc = new HashMap();
    private final HashSet zzd = new HashSet();
    private final HashSet zze = new HashSet();
    private final HashSet zzf = new HashSet();
    private final HashMap zzg = new HashMap();
    private final Map zzh = new WeakHashMap();
    private boolean zzi;

    public final View zza(String str) {
        return (View) this.zzc.get(str);
    }

    public final zzflu zzb(View view) {
        zzflu zzfluVar = (zzflu) this.zzb.get(view);
        if (zzfluVar != null) {
            this.zzb.remove(view);
        }
        return zzfluVar;
    }

    public final String zzc(String str) {
        return (String) this.zzg.get(str);
    }

    public final String zzd(View view) {
        if (this.zza.size() == 0) {
            return null;
        }
        String str = (String) this.zza.get(view);
        if (str != null) {
            this.zza.remove(view);
        }
        return str;
    }

    public final HashSet zze() {
        return this.zzf;
    }

    public final HashSet zzf() {
        return this.zze;
    }

    public final void zzg() {
        this.zza.clear();
        this.zzb.clear();
        this.zzc.clear();
        this.zzd.clear();
        this.zze.clear();
        this.zzf.clear();
        this.zzg.clear();
        this.zzi = false;
    }

    public final void zzh() {
        this.zzi = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzi() {
        Boolean bool;
        String str;
        zzfku zza = zzfku.zza();
        if (zza != null) {
            for (zzfkg zzfkgVar : zza.zzb()) {
                View zzf = zzfkgVar.zzf();
                if (zzfkgVar.zzj()) {
                    String zzh = zzfkgVar.zzh();
                    if (zzf != null) {
                        if (!zzf.isAttachedToWindow()) {
                            str = "notAttached";
                        } else {
                            if (zzf.hasWindowFocus()) {
                                this.zzh.remove(zzf);
                                bool = Boolean.FALSE;
                            } else if (this.zzh.containsKey(zzf)) {
                                bool = (Boolean) this.zzh.get(zzf);
                            } else {
                                Map map = this.zzh;
                                Boolean bool2 = Boolean.FALSE;
                                map.put(zzf, bool2);
                                bool = bool2;
                            }
                            if (bool.booleanValue()) {
                                str = "noWindowFocus";
                            } else {
                                HashSet hashSet = new HashSet();
                                View view = zzf;
                                while (true) {
                                    if (view != null) {
                                        String zzb = zzflt.zzb(view);
                                        if (zzb != null) {
                                            str = zzb;
                                            break;
                                        }
                                        hashSet.add(view);
                                        Object parent = view.getParent();
                                        if (parent instanceof View) {
                                            view = (View) parent;
                                        } else {
                                            view = null;
                                        }
                                    } else {
                                        this.zzd.addAll(hashSet);
                                        str = null;
                                        break;
                                    }
                                }
                            }
                        }
                        if (str == null) {
                            this.zze.add(zzh);
                            this.zza.put(zzf, zzh);
                            for (zzfkx zzfkxVar : zzfkgVar.zzi()) {
                                View view2 = (View) zzfkxVar.zzb().get();
                                if (view2 != null) {
                                    zzflu zzfluVar = (zzflu) this.zzb.get(view2);
                                    if (zzfluVar != null) {
                                        zzfluVar.zzc(zzfkgVar.zzh());
                                    } else {
                                        this.zzb.put(view2, new zzflu(zzfkxVar, zzfkgVar.zzh()));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.zzf.add(zzh);
                            this.zzc.put(zzh, zzf);
                            this.zzg.put(zzh, str);
                        }
                    } else {
                        this.zzf.add(zzh);
                        this.zzg.put(zzh, "noAdView");
                    }
                }
            }
        }
    }

    public final boolean zzj(View view) {
        if (this.zzh.containsKey(view)) {
            this.zzh.put(view, Boolean.TRUE);
            return false;
        }
        return true;
    }

    public final int zzk(View view) {
        if (this.zzd.contains(view)) {
            return 1;
        }
        if (this.zzi) {
            return 2;
        }
        return 3;
    }
}
