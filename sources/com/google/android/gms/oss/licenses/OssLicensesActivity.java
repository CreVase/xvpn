package com.google.android.gms.oss.licenses;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import defpackage.ic;
import java.util.ArrayList;

@KeepForSdk
/* loaded from: classes2.dex */
public final class OssLicensesActivity extends ic {
    zzc zza;
    private com.google.android.gms.internal.oss_licenses.zze zzb;
    private String zzc = "";
    private ScrollView zzd = null;
    private TextView zze = null;
    private int zzf = 0;
    private Task zzg;
    private Task zzh;
    private zzd zzi;

    @Override // androidx.fragment.app.l, androidx.activity.ComponentActivity, defpackage.r30, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.libraries_social_licenses_license_loading);
        this.zzi = zzd.zzb(this);
        this.zzb = (com.google.android.gms.internal.oss_licenses.zze) getIntent().getParcelableExtra("license");
        if (getSupportActionBar() != null) {
            getSupportActionBar().q(this.zzb.zzd());
            getSupportActionBar().n();
            getSupportActionBar().m(true);
            getSupportActionBar().o();
        }
        ArrayList arrayList = new ArrayList();
        zzl zzc = this.zzi.zzc();
        Task doRead = zzc.doRead(new zzj(zzc, this.zzb));
        this.zzg = doRead;
        arrayList.add(doRead);
        zzl zzc2 = this.zzi.zzc();
        Task doRead2 = zzc2.doRead(new zzh(zzc2, getPackageName()));
        this.zzh = doRead2;
        arrayList.add(doRead2);
        Tasks.whenAll(arrayList).addOnCompleteListener(new zzf(this));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.zzf = bundle.getInt("scroll_pos");
    }

    @Override // androidx.activity.ComponentActivity, defpackage.r30, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        TextView textView = this.zze;
        if (textView != null && this.zzd != null) {
            bundle.putInt("scroll_pos", this.zze.getLayout().getLineStart(textView.getLayout().getLineForVertical(this.zzd.getScrollY())));
        }
    }
}
