package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import defpackage.mo1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgv extends mo1 {
    private final /* synthetic */ zzgp zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgv(zzgp zzgpVar, int i) {
        super(20);
        this.zza = zzgpVar;
    }

    @Override // defpackage.mo1
    public final /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        Preconditions.checkNotEmpty(str);
        return zzgp.zza(this.zza, str);
    }
}
