package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import defpackage.ml1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzenn implements zzetw {
    private final zzgad zza;
    private final zzgad zzb;
    private final Context zzc;
    private final zzfdn zzd;
    private final View zze;

    public zzenn(zzgad zzgadVar, zzgad zzgadVar2, Context context, zzfdn zzfdnVar, ViewGroup viewGroup) {
        this.zza = zzgadVar;
        this.zzb = zzgadVar2;
        this.zzc = context;
        this.zzd = zzfdnVar;
        this.zze = viewGroup;
    }

    private final List zze() {
        int i;
        ArrayList arrayList = new ArrayList();
        View view = this.zze;
        while (view != null) {
            Object parent = view.getParent();
            if (parent == null) {
                break;
            }
            if (parent instanceof ViewGroup) {
                i = ((ViewGroup) parent).indexOfChild(view);
            } else {
                i = -1;
            }
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", i);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return 3;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final ml1 zzb() {
        zzbci.zza(this.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzkg)).booleanValue()) {
            return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzenl
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzenn.this.zzc();
                }
            });
        }
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzenm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzenn.this.zzd();
            }
        });
    }

    public final /* synthetic */ zzeno zzc() throws Exception {
        return new zzeno(this.zzc, this.zzd.zze, zze());
    }

    public final /* synthetic */ zzeno zzd() throws Exception {
        return new zzeno(this.zzc, this.zzd.zze, zze());
    }
}
