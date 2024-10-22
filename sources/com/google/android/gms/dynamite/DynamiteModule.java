package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

@KeepForSdk
/* loaded from: classes.dex */
public final class DynamiteModule {

    @KeepForSdk
    public static final int LOCAL = -1;

    @KeepForSdk
    public static final int NONE = 0;

    @KeepForSdk
    public static final int NO_SELECTION = 0;

    @KeepForSdk
    public static final int REMOTE = 1;
    private static Boolean zzb = null;
    private static String zzc = null;
    private static boolean zzd = false;
    private static int zze = -1;
    private static Boolean zzf;
    private static zzq zzk;
    private static zzr zzl;
    private final Context zzj;
    private static final ThreadLocal zzg = new ThreadLocal();
    private static final ThreadLocal zzh = new zzd();
    private static final VersionPolicy.IVersions zzi = new zze();

    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE = new zzf();

    @KeepForSdk
    public static final VersionPolicy PREFER_LOCAL = new zzg();

    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new zzh();

    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzi();

    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zzj();

    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzk();
    public static final VersionPolicy zza = new zzl();

    @DynamiteApi
    /* loaded from: classes.dex */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    @KeepForSdk
    /* loaded from: classes.dex */
    public static class LoadingException extends Exception {
        public /* synthetic */ LoadingException(String str, zzp zzpVar) {
            super(str);
        }

        public /* synthetic */ LoadingException(String str, Throwable th, zzp zzpVar) {
            super(str, th);
        }
    }

    /* loaded from: classes.dex */
    public interface VersionPolicy {

        @KeepForSdk
        /* loaded from: classes.dex */
        public interface IVersions {
            int zza(Context context, String str);

            int zzb(Context context, String str, boolean z) throws LoadingException;
        }

        @KeepForSdk
        /* loaded from: classes.dex */
        public static class SelectionResult {

            @KeepForSdk
            public int localVersion = 0;

            @KeepForSdk
            public int remoteVersion = 0;

            @KeepForSdk
            public int selection = 0;
        }

        @KeepForSdk
        SelectionResult selectModule(Context context, String str, IVersions iVersions) throws LoadingException;
    }

    private DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.zzj = context;
    }

    @KeepForSdk
    public static int getLocalVersion(Context context, String str) {
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!Objects.equal(declaredField.get(null), str)) {
                Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            return 0;
        } catch (Exception e) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage())));
            return 0;
        }
    }

    @KeepForSdk
    public static int getRemoteVersion(Context context, String str) {
        return zza(context, str, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0, types: [com.google.android.gms.dynamite.DynamiteModule$VersionPolicy] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.content.Context] */
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public static DynamiteModule load(Context context, VersionPolicy versionPolicy, String str) throws LoadingException {
        int i;
        Boolean bool;
        IObjectWrapper zzh2;
        DynamiteModule dynamiteModule;
        zzr zzrVar;
        boolean z;
        Boolean valueOf;
        IObjectWrapper zze2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            ThreadLocal threadLocal = zzg;
            zzn zznVar = (zzn) threadLocal.get();
            zzn zznVar2 = new zzn(null);
            threadLocal.set(zznVar2);
            ThreadLocal threadLocal2 = zzh;
            long longValue = ((Long) threadLocal2.get()).longValue();
            try {
                threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
                VersionPolicy.SelectionResult selectModule = versionPolicy.selectModule(context, str, zzi);
                Log.i("DynamiteModule", "Considering local module " + str + ":" + selectModule.localVersion + " and remote module " + str + ":" + selectModule.remoteVersion);
                int i2 = selectModule.selection;
                if (i2 != 0) {
                    ?? r2 = -1;
                    if (i2 == -1) {
                        if (selectModule.localVersion != 0) {
                            i2 = -1;
                        }
                    }
                    if (i2 != 1 || selectModule.remoteVersion != 0) {
                        if (i2 == -1) {
                            DynamiteModule zzc2 = zzc(applicationContext, str);
                            if (longValue == 0) {
                                threadLocal2.remove();
                            } else {
                                threadLocal2.set(Long.valueOf(longValue));
                            }
                            Cursor cursor = zznVar2.zza;
                            if (cursor != null) {
                                cursor.close();
                            }
                            threadLocal.set(zznVar);
                            return zzc2;
                        }
                        if (i2 == 1) {
                            try {
                                try {
                                    int i3 = selectModule.remoteVersion;
                                    try {
                                        synchronized (DynamiteModule.class) {
                                            if (zzf(context)) {
                                                bool = zzb;
                                            } else {
                                                throw new LoadingException("Remote loading disabled", null);
                                            }
                                        }
                                        if (bool != null) {
                                            if (bool.booleanValue()) {
                                                Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i3);
                                                synchronized (DynamiteModule.class) {
                                                    zzrVar = zzl;
                                                }
                                                if (zzrVar != null) {
                                                    zzn zznVar3 = (zzn) threadLocal.get();
                                                    if (zznVar3 != null && zznVar3.zza != null) {
                                                        Context applicationContext2 = context.getApplicationContext();
                                                        Cursor cursor2 = zznVar3.zza;
                                                        ObjectWrapper.wrap(null);
                                                        synchronized (DynamiteModule.class) {
                                                            if (zze >= 2) {
                                                                z = true;
                                                            } else {
                                                                z = false;
                                                            }
                                                            valueOf = Boolean.valueOf(z);
                                                        }
                                                        if (valueOf.booleanValue()) {
                                                            zze2 = zzrVar.zzf(ObjectWrapper.wrap(applicationContext2), str, i3, ObjectWrapper.wrap(cursor2));
                                                        } else {
                                                            zze2 = zzrVar.zze(ObjectWrapper.wrap(applicationContext2), str, i3, ObjectWrapper.wrap(cursor2));
                                                        }
                                                        Context context2 = (Context) ObjectWrapper.unwrap(zze2);
                                                        if (context2 != null) {
                                                            dynamiteModule = new DynamiteModule(context2);
                                                        } else {
                                                            throw new LoadingException("Failed to get module context", null);
                                                        }
                                                    } else {
                                                        throw new LoadingException("No result cursor", null);
                                                    }
                                                } else {
                                                    throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                                }
                                            } else {
                                                Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i3);
                                                zzq zzg2 = zzg(context);
                                                if (zzg2 != null) {
                                                    int zze3 = zzg2.zze();
                                                    if (zze3 >= 3) {
                                                        zzn zznVar4 = (zzn) threadLocal.get();
                                                        if (zznVar4 != null) {
                                                            zzh2 = zzg2.zzi(ObjectWrapper.wrap(context), str, i3, ObjectWrapper.wrap(zznVar4.zza));
                                                        } else {
                                                            throw new LoadingException("No cached result cursor holder", null);
                                                        }
                                                    } else if (zze3 == 2) {
                                                        zzh2 = zzg2.zzj(ObjectWrapper.wrap(context), str, i3);
                                                    } else {
                                                        zzh2 = zzg2.zzh(ObjectWrapper.wrap(context), str, i3);
                                                    }
                                                    Object unwrap = ObjectWrapper.unwrap(zzh2);
                                                    if (unwrap != null) {
                                                        dynamiteModule = new DynamiteModule((Context) unwrap);
                                                    } else {
                                                        throw new LoadingException("Failed to load remote module.", null);
                                                    }
                                                } else {
                                                    throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                                }
                                            }
                                            if (longValue == 0) {
                                                threadLocal2.remove();
                                            } else {
                                                threadLocal2.set(Long.valueOf(longValue));
                                            }
                                            Cursor cursor3 = zznVar2.zza;
                                            if (cursor3 != null) {
                                                cursor3.close();
                                            }
                                            threadLocal.set(zznVar);
                                            return dynamiteModule;
                                        }
                                        throw new LoadingException("Failed to determine which loading route to use.", null);
                                    } catch (RemoteException e) {
                                        throw new LoadingException("Failed to load remote module.", e, null);
                                    } catch (LoadingException e2) {
                                        throw e2;
                                    } catch (Throwable th) {
                                        CrashUtils.addDynamiteErrorToDropBox(context, th);
                                        throw new LoadingException("Failed to load remote module.", th, null);
                                    }
                                } catch (LoadingException e3) {
                                    e = e3;
                                    e.getMessage();
                                    i = selectModule.localVersion;
                                    if (i == 0) {
                                    }
                                    throw new LoadingException("Remote load failed. No local fallback found.", e, null);
                                }
                            } catch (LoadingException e4) {
                                e = e4;
                                r2 = context;
                                e.getMessage();
                                i = selectModule.localVersion;
                                if (i == 0 && versionPolicy.selectModule(r2, str, new zzo(i, 0)).selection == -1) {
                                    return zzc(applicationContext, str);
                                }
                                throw new LoadingException("Remote load failed. No local fallback found.", e, null);
                            }
                        }
                        throw new LoadingException("VersionPolicy returned invalid code:" + i2, null);
                    }
                }
                throw new LoadingException("No acceptable module " + str + " found. Local version is " + selectModule.localVersion + " and remote version is " + selectModule.remoteVersion + ".", null);
            } finally {
                if (longValue == 0) {
                    zzh.remove();
                } else {
                    zzh.set(Long.valueOf(longValue));
                }
                Cursor cursor4 = zznVar2.zza;
                if (cursor4 != null) {
                    cursor4.close();
                }
                zzg.set(zznVar);
            }
        }
        throw new LoadingException("null application Context", null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0126, code lost:            if (zze(r11) != false) goto L89;     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0163 A[Catch: all -> 0x016a, TryCatch #4 {all -> 0x016a, blocks: (B:3:0x0002, B:9:0x00c4, B:64:0x00ca, B:11:0x00d4, B:38:0x012c, B:28:0x0139, B:51:0x0163, B:52:0x0166, B:47:0x015c, B:68:0x00d0, B:127:0x0169, B:5:0x0003, B:71:0x0009, B:72:0x0025, B:79:0x00c1, B:84:0x0046, B:102:0x009a, B:110:0x009d, B:121:0x00b6, B:8:0x00c3, B:124:0x00bc), top: B:2:0x0002, inners: #3, #11 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zza(android.content.Context r10, java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zza(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x009f, code lost:            r10.close();     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d5  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int zzb(android.content.Context r10, java.lang.String r11, boolean r12, boolean r13) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zzb(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static DynamiteModule zzc(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }

    private static void zzd(ClassLoader classLoader) throws LoadingException {
        zzr zzrVar;
        zzp zzpVar = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzrVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof zzr) {
                    zzrVar = (zzr) queryLocalInterface;
                } else {
                    zzrVar = new zzr(iBinder);
                }
            }
            zzl = zzrVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new LoadingException("Failed to instantiate dynamite loader", e, zzpVar);
        }
    }

    private static boolean zze(Cursor cursor) {
        zzn zznVar = (zzn) zzg.get();
        if (zznVar != null && zznVar.zza == null) {
            zznVar.zza = cursor;
            return true;
        }
        return false;
    }

    private static boolean zzf(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(zzf)) {
            return true;
        }
        boolean z = false;
        if (zzf == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            zzf = valueOf;
            z = valueOf.booleanValue();
            if (z && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                zzd = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    private static zzq zzg(Context context) {
        zzq zzqVar;
        synchronized (DynamiteModule.class) {
            zzq zzqVar2 = zzk;
            if (zzqVar2 != null) {
                return zzqVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzqVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof zzq) {
                        zzqVar = (zzq) queryLocalInterface;
                    } else {
                        zzqVar = new zzq(iBinder);
                    }
                }
                if (zzqVar != null) {
                    zzk = zzqVar;
                    return zzqVar;
                }
            } catch (Exception e) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e.getMessage());
            }
            return null;
        }
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public Context getModuleContext() {
        return this.zzj;
    }

    @KeepForSdk
    public IBinder instantiate(String str) throws LoadingException {
        try {
            return (IBinder) this.zzj.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e, null);
        }
    }
}
