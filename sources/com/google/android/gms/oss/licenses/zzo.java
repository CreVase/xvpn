package com.google.android.gms.oss.licenses;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes2.dex */
final class zzo implements AdapterView.OnItemClickListener {
    final /* synthetic */ zzp zza;

    public zzo(zzp zzpVar) {
        this.zza = zzpVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        com.google.android.gms.internal.oss_licenses.zze zzeVar = (com.google.android.gms.internal.oss_licenses.zze) adapterView.getItemAtPosition(i);
        Intent intent = new Intent(this.zza.zza, (Class<?>) OssLicensesActivity.class);
        intent.putExtra("license", zzeVar);
        this.zza.zza.startActivity(intent);
    }
}
