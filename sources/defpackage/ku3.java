package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.FeatureInfo;
import android.content.pm.InstrumentationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.pm.PermissionGroupInfo;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.UserHandle;
import java.util.List;

/* loaded from: classes.dex */
public final class ku3 extends PackageManager {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3016a;

    /* renamed from: b, reason: collision with root package name */
    public final PackageManager f3017b;

    public ku3(Context context) {
        this.f3016a = context;
        this.f3017b = context.getPackageManager();
    }

    @Override // android.content.pm.PackageManager
    public final void addPackageToPreferred(String str) {
        this.f3017b.addPackageToPreferred(str);
    }

    @Override // android.content.pm.PackageManager
    public final boolean addPermission(PermissionInfo permissionInfo) {
        return this.f3017b.addPermission(permissionInfo);
    }

    @Override // android.content.pm.PackageManager
    public final boolean addPermissionAsync(PermissionInfo permissionInfo) {
        return this.f3017b.addPermissionAsync(permissionInfo);
    }

    @Override // android.content.pm.PackageManager
    public final void addPreferredActivity(IntentFilter intentFilter, int i, ComponentName[] componentNameArr, ComponentName componentName) {
        this.f3017b.addPreferredActivity(intentFilter, i, componentNameArr, componentName);
    }

    @Override // android.content.pm.PackageManager
    public final String[] canonicalToCurrentPackageNames(String[] strArr) {
        return this.f3017b.canonicalToCurrentPackageNames(strArr);
    }

    @Override // android.content.pm.PackageManager
    public final int checkPermission(String str, String str2) {
        return this.f3017b.checkPermission(str, str2);
    }

    @Override // android.content.pm.PackageManager
    public final int checkSignatures(int i, int i2) {
        return this.f3017b.checkSignatures(i, i2);
    }

    @Override // android.content.pm.PackageManager
    public final void clearPackagePreferredActivities(String str) {
        this.f3017b.clearPackagePreferredActivities(str);
    }

    @Override // android.content.pm.PackageManager
    public final String[] currentToCanonicalPackageNames(String[] strArr) {
        return this.f3017b.currentToCanonicalPackageNames(strArr);
    }

    @Override // android.content.pm.PackageManager
    public final void extendVerificationTimeout(int i, int i2, long j) {
        this.f3017b.extendVerificationTimeout(i, i2, j);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getActivityBanner(Intent intent) {
        return this.f3017b.getActivityBanner(intent);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getActivityIcon(Intent intent) {
        return this.f3017b.getActivityIcon(intent);
    }

    @Override // android.content.pm.PackageManager
    public final ActivityInfo getActivityInfo(ComponentName componentName, int i) {
        return this.f3017b.getActivityInfo(componentName, i);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getActivityLogo(Intent intent) {
        return this.f3017b.getActivityLogo(intent);
    }

    @Override // android.content.pm.PackageManager
    public final List getAllPermissionGroups(int i) {
        return this.f3017b.getAllPermissionGroups(i);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getApplicationBanner(ApplicationInfo applicationInfo) {
        return this.f3017b.getApplicationBanner(applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    public final int getApplicationEnabledSetting(String str) {
        return this.f3017b.getApplicationEnabledSetting(str);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getApplicationIcon(String str) {
        return this.f3017b.getApplicationIcon(str);
    }

    @Override // android.content.pm.PackageManager
    public final ApplicationInfo getApplicationInfo(String str, int i) {
        ApplicationInfo applicationInfo = this.f3017b.getApplicationInfo(str, i);
        if (str.equals(this.f3016a.getPackageName()) && (i & 128) == 128) {
            if (applicationInfo.metaData == null) {
                applicationInfo.metaData = new Bundle();
            }
            applicationInfo.metaData.putInt("com.google.android.gms.version", 4323000);
        }
        return applicationInfo;
    }

    @Override // android.content.pm.PackageManager
    public final CharSequence getApplicationLabel(ApplicationInfo applicationInfo) {
        return this.f3017b.getApplicationLabel(applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getApplicationLogo(String str) {
        return this.f3017b.getApplicationLogo(str);
    }

    @Override // android.content.pm.PackageManager
    public final int getComponentEnabledSetting(ComponentName componentName) {
        return this.f3017b.getComponentEnabledSetting(componentName);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getDefaultActivityIcon() {
        return this.f3017b.getDefaultActivityIcon();
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getDrawable(String str, int i, ApplicationInfo applicationInfo) {
        return this.f3017b.getDrawable(str, i, applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    public final List getInstalledApplications(int i) {
        return this.f3017b.getInstalledApplications(i);
    }

    @Override // android.content.pm.PackageManager
    public final List getInstalledPackages(int i) {
        return this.f3017b.getInstalledPackages(i);
    }

    @Override // android.content.pm.PackageManager
    public final String getInstallerPackageName(String str) {
        return this.f3017b.getInstallerPackageName(str);
    }

    @Override // android.content.pm.PackageManager
    public final InstrumentationInfo getInstrumentationInfo(ComponentName componentName, int i) {
        return this.f3017b.getInstrumentationInfo(componentName, i);
    }

    @Override // android.content.pm.PackageManager
    public final Intent getLaunchIntentForPackage(String str) {
        return this.f3017b.getLaunchIntentForPackage(str);
    }

    @Override // android.content.pm.PackageManager
    public final Intent getLeanbackLaunchIntentForPackage(String str) {
        return this.f3017b.getLeanbackLaunchIntentForPackage(str);
    }

    @Override // android.content.pm.PackageManager
    public final String getNameForUid(int i) {
        return this.f3017b.getNameForUid(i);
    }

    @Override // android.content.pm.PackageManager
    public final int[] getPackageGids(String str) {
        return this.f3017b.getPackageGids(str);
    }

    @Override // android.content.pm.PackageManager
    public final PackageInfo getPackageInfo(String str, int i) {
        return this.f3017b.getPackageInfo(str, i);
    }

    @Override // android.content.pm.PackageManager
    public final PackageInstaller getPackageInstaller() {
        return this.f3017b.getPackageInstaller();
    }

    @Override // android.content.pm.PackageManager
    public final String[] getPackagesForUid(int i) {
        return this.f3017b.getPackagesForUid(i);
    }

    @Override // android.content.pm.PackageManager
    public final List getPackagesHoldingPermissions(String[] strArr, int i) {
        return this.f3017b.getPackagesHoldingPermissions(strArr, i);
    }

    @Override // android.content.pm.PackageManager
    public final PermissionGroupInfo getPermissionGroupInfo(String str, int i) {
        return this.f3017b.getPermissionGroupInfo(str, i);
    }

    @Override // android.content.pm.PackageManager
    public final PermissionInfo getPermissionInfo(String str, int i) {
        return this.f3017b.getPermissionInfo(str, i);
    }

    @Override // android.content.pm.PackageManager
    public final int getPreferredActivities(List list, List list2, String str) {
        return this.f3017b.getPreferredActivities(list, list2, str);
    }

    @Override // android.content.pm.PackageManager
    public final List getPreferredPackages(int i) {
        return this.f3017b.getPreferredPackages(i);
    }

    @Override // android.content.pm.PackageManager
    public final ProviderInfo getProviderInfo(ComponentName componentName, int i) {
        return this.f3017b.getProviderInfo(componentName, i);
    }

    @Override // android.content.pm.PackageManager
    public final ActivityInfo getReceiverInfo(ComponentName componentName, int i) {
        return this.f3017b.getReceiverInfo(componentName, i);
    }

    @Override // android.content.pm.PackageManager
    public final Resources getResourcesForActivity(ComponentName componentName) {
        return this.f3017b.getResourcesForActivity(componentName);
    }

    @Override // android.content.pm.PackageManager
    public final Resources getResourcesForApplication(String str) {
        return this.f3017b.getResourcesForApplication(str);
    }

    @Override // android.content.pm.PackageManager
    public final ServiceInfo getServiceInfo(ComponentName componentName, int i) {
        return this.f3017b.getServiceInfo(componentName, i);
    }

    @Override // android.content.pm.PackageManager
    public final FeatureInfo[] getSystemAvailableFeatures() {
        return this.f3017b.getSystemAvailableFeatures();
    }

    @Override // android.content.pm.PackageManager
    public final String[] getSystemSharedLibraryNames() {
        return this.f3017b.getSystemSharedLibraryNames();
    }

    @Override // android.content.pm.PackageManager
    public final CharSequence getText(String str, int i, ApplicationInfo applicationInfo) {
        return this.f3017b.getText(str, i, applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getUserBadgedDrawableForDensity(Drawable drawable, UserHandle userHandle, Rect rect, int i) {
        return this.f3017b.getUserBadgedDrawableForDensity(drawable, userHandle, rect, i);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getUserBadgedIcon(Drawable drawable, UserHandle userHandle) {
        return this.f3017b.getUserBadgedIcon(drawable, userHandle);
    }

    @Override // android.content.pm.PackageManager
    public final CharSequence getUserBadgedLabel(CharSequence charSequence, UserHandle userHandle) {
        return this.f3017b.getUserBadgedLabel(charSequence, userHandle);
    }

    @Override // android.content.pm.PackageManager
    public final XmlResourceParser getXml(String str, int i, ApplicationInfo applicationInfo) {
        return this.f3017b.getXml(str, i, applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    public final boolean hasSystemFeature(String str) {
        return this.f3017b.hasSystemFeature(str);
    }

    @Override // android.content.pm.PackageManager
    public final boolean isSafeMode() {
        return this.f3017b.isSafeMode();
    }

    @Override // android.content.pm.PackageManager
    public final List queryBroadcastReceivers(Intent intent, int i) {
        return this.f3017b.queryBroadcastReceivers(intent, i);
    }

    @Override // android.content.pm.PackageManager
    public final List queryContentProviders(String str, int i, int i2) {
        return this.f3017b.queryContentProviders(str, i, i2);
    }

    @Override // android.content.pm.PackageManager
    public final List queryInstrumentation(String str, int i) {
        return this.f3017b.queryInstrumentation(str, i);
    }

    @Override // android.content.pm.PackageManager
    public final List queryIntentActivities(Intent intent, int i) {
        return this.f3017b.queryIntentActivities(intent, i);
    }

    @Override // android.content.pm.PackageManager
    public final List queryIntentActivityOptions(ComponentName componentName, Intent[] intentArr, Intent intent, int i) {
        return this.f3017b.queryIntentActivityOptions(componentName, intentArr, intent, i);
    }

    @Override // android.content.pm.PackageManager
    public final List queryIntentContentProviders(Intent intent, int i) {
        return this.f3017b.queryIntentContentProviders(intent, i);
    }

    @Override // android.content.pm.PackageManager
    public final List queryIntentServices(Intent intent, int i) {
        return this.f3017b.queryIntentServices(intent, i);
    }

    @Override // android.content.pm.PackageManager
    public final List queryPermissionsByGroup(String str, int i) {
        return this.f3017b.queryPermissionsByGroup(str, i);
    }

    @Override // android.content.pm.PackageManager
    public final void removePackageFromPreferred(String str) {
        this.f3017b.removePackageFromPreferred(str);
    }

    @Override // android.content.pm.PackageManager
    public final void removePermission(String str) {
        this.f3017b.removePermission(str);
    }

    @Override // android.content.pm.PackageManager
    public final ResolveInfo resolveActivity(Intent intent, int i) {
        return this.f3017b.resolveActivity(intent, i);
    }

    @Override // android.content.pm.PackageManager
    public final ProviderInfo resolveContentProvider(String str, int i) {
        return this.f3017b.resolveContentProvider(str, i);
    }

    @Override // android.content.pm.PackageManager
    public final ResolveInfo resolveService(Intent intent, int i) {
        return this.f3017b.resolveService(intent, i);
    }

    @Override // android.content.pm.PackageManager
    public final void setApplicationEnabledSetting(String str, int i, int i2) {
        this.f3017b.setApplicationEnabledSetting(str, i, i2);
    }

    @Override // android.content.pm.PackageManager
    public final void setComponentEnabledSetting(ComponentName componentName, int i, int i2) {
        this.f3017b.setComponentEnabledSetting(componentName, i, i2);
    }

    @Override // android.content.pm.PackageManager
    public final void setInstallerPackageName(String str, String str2) {
        this.f3017b.setInstallerPackageName(str, str2);
    }

    @Override // android.content.pm.PackageManager
    public final void verifyPendingInstall(int i, int i2) {
        this.f3017b.verifyPendingInstall(i, i2);
    }

    @Override // android.content.pm.PackageManager
    public final int checkSignatures(String str, String str2) {
        return this.f3017b.checkSignatures(str, str2);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getActivityBanner(ComponentName componentName) {
        return this.f3017b.getActivityBanner(componentName);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getActivityIcon(ComponentName componentName) {
        return this.f3017b.getActivityIcon(componentName);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getActivityLogo(ComponentName componentName) {
        return this.f3017b.getActivityLogo(componentName);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getApplicationBanner(String str) {
        return this.f3017b.getApplicationBanner(str);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getApplicationIcon(ApplicationInfo applicationInfo) {
        return this.f3017b.getApplicationIcon(applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getApplicationLogo(ApplicationInfo applicationInfo) {
        return this.f3017b.getApplicationLogo(applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    public final Resources getResourcesForApplication(ApplicationInfo applicationInfo) {
        return this.f3017b.getResourcesForApplication(applicationInfo);
    }
}
