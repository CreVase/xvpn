package com.google.android.gms.oss.licenses;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzp implements OnCompleteListener {
    final /* synthetic */ OssLicensesMenuActivity zza;

    public zzp(OssLicensesMenuActivity ossLicensesMenuActivity) {
        this.zza = ossLicensesMenuActivity;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        zzc zzcVar;
        zzc zzcVar2;
        ListView listView;
        ArrayAdapter arrayAdapter;
        ListView listView2;
        String packageName = this.zza.getPackageName();
        if (this.zza.isDestroyed() || this.zza.isFinishing()) {
            return;
        }
        if (task.isSuccessful()) {
            packageName = (String) task.getResult();
        }
        OssLicensesMenuActivity ossLicensesMenuActivity = this.zza;
        ossLicensesMenuActivity.zze = zzd.zza(ossLicensesMenuActivity, packageName);
        OssLicensesMenuActivity ossLicensesMenuActivity2 = this.zza;
        LayoutInflater layoutInflater = ossLicensesMenuActivity2.getLayoutInflater();
        zzcVar = this.zza.zze;
        Resources resources = zzcVar.zza;
        ossLicensesMenuActivity2.setContentView(layoutInflater.inflate((XmlPullParser) resources.getXml(resources.getIdentifier("libraries_social_licenses_license_menu_activity", "layout", zzcVar.zzb)), (ViewGroup) null, false));
        OssLicensesMenuActivity ossLicensesMenuActivity3 = this.zza;
        zzcVar2 = ossLicensesMenuActivity3.zze;
        ossLicensesMenuActivity3.zzb = (ListView) ossLicensesMenuActivity3.findViewById(zzcVar2.zza.getIdentifier("license_list", FacebookMediationAdapter.KEY_ID, zzcVar2.zzb));
        OssLicensesMenuActivity ossLicensesMenuActivity4 = this.zza;
        OssLicensesMenuActivity ossLicensesMenuActivity5 = this.zza;
        ossLicensesMenuActivity4.zzc = new zzq(ossLicensesMenuActivity5, ossLicensesMenuActivity5);
        OssLicensesMenuActivity ossLicensesMenuActivity6 = this.zza;
        listView = ossLicensesMenuActivity6.zzb;
        arrayAdapter = ossLicensesMenuActivity6.zzc;
        listView.setAdapter((ListAdapter) arrayAdapter);
        listView2 = this.zza.zzb;
        listView2.setOnItemClickListener(new zzo(this));
    }
}
