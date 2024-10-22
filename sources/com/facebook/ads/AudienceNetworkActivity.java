package com.facebook.ads;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.annotation.Keep;
import com.facebook.ads.internal.api.AudienceNetworkActivityApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import defpackage.ja1;
import java.io.FileDescriptor;
import java.io.PrintWriter;

@Keep
@SuppressLint({"MissingSuperCall"})
/* loaded from: classes.dex */
public class AudienceNetworkActivity extends Activity {
    private AudienceNetworkActivityApi mAudienceNetworkActivityApi;
    private final AudienceNetworkActivityApi mAudienceNetworkActivityParentApi = new ja1(this, 16);

    public static /* synthetic */ void access$001(AudienceNetworkActivity audienceNetworkActivity, Bundle bundle) {
        super.onCreate(bundle);
    }

    public static /* synthetic */ boolean access$1001(AudienceNetworkActivity audienceNetworkActivity, MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public static /* synthetic */ void access$101(AudienceNetworkActivity audienceNetworkActivity) {
        super.onStart();
    }

    public static /* synthetic */ void access$1101(AudienceNetworkActivity audienceNetworkActivity, int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public static /* synthetic */ void access$1201(AudienceNetworkActivity audienceNetworkActivity, String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
    }

    public static /* synthetic */ void access$201(AudienceNetworkActivity audienceNetworkActivity) {
        super.onPause();
    }

    public static /* synthetic */ void access$301(AudienceNetworkActivity audienceNetworkActivity) {
        super.onResume();
    }

    public static /* synthetic */ void access$401(AudienceNetworkActivity audienceNetworkActivity) {
        super.onStop();
    }

    public static /* synthetic */ void access$501(AudienceNetworkActivity audienceNetworkActivity, Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    public static /* synthetic */ void access$601(AudienceNetworkActivity audienceNetworkActivity) {
        super.finish();
    }

    public static /* synthetic */ void access$701(AudienceNetworkActivity audienceNetworkActivity) {
        super.onDestroy();
    }

    public static /* synthetic */ void access$801(AudienceNetworkActivity audienceNetworkActivity) {
        super.onBackPressed();
    }

    public static /* synthetic */ void access$901(AudienceNetworkActivity audienceNetworkActivity, Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.mAudienceNetworkActivityApi.dump(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public void finish() {
        this.mAudienceNetworkActivityApi.finish(0);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.mAudienceNetworkActivityApi.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.mAudienceNetworkActivityApi.onBackPressed();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mAudienceNetworkActivityApi.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        AudienceNetworkActivityApi createAudienceNetworkActivity = DynamicLoaderFactory.makeLoader(this).createAudienceNetworkActivity(this, this.mAudienceNetworkActivityParentApi);
        this.mAudienceNetworkActivityApi = createAudienceNetworkActivity;
        createAudienceNetworkActivity.onCreate(bundle);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        this.mAudienceNetworkActivityApi.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        this.mAudienceNetworkActivityApi.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mAudienceNetworkActivityApi.onResume();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.mAudienceNetworkActivityApi.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mAudienceNetworkActivityApi.onStart();
    }

    @Override // android.app.Activity
    public void onStop() {
        this.mAudienceNetworkActivityApi.onStop();
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.mAudienceNetworkActivityApi.onTouchEvent(motionEvent);
    }
}
