package com.google.android.gms.oss.licenses;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzm extends GmsClient {
    public zzm(Context context, Looper looper, ClientSettings clientSettings, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 185, clientSettings, (ConnectionCallbacks) connectionCallbacks, (OnConnectionFailedListener) onConnectionFailedListener);
    }

    private final zza zzt() {
        try {
            return (zza) super.getService();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.oss.licenses.IOSSLicenseService");
        if (queryLocalInterface instanceof zza) {
            return (zza) queryLocalInterface;
        }
        return new zza(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean enableLocalFallback() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12600000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.oss.licenses.IOSSLicenseService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.oss.licenses.service.START";
    }

    public final synchronized String zzp(com.google.android.gms.internal.oss_licenses.zze zzeVar) throws RemoteException {
        zza zzt;
        zzt = zzt();
        if (zzt != null) {
        } else {
            throw new RemoteException("no service for getLicenseDetail call");
        }
        return zzt.zzc(zzeVar.zzd());
    }

    public final synchronized String zzq(String str) throws RemoteException {
        zza zzt;
        zzt = zzt();
        if (zzt != null) {
        } else {
            throw new RemoteException("no service for getLicenseDetail call");
        }
        return zzt.zzd(str);
    }

    public final synchronized String zzr(String str) throws RemoteException {
        zza zzt;
        zzt = zzt();
        if (zzt != null) {
        } else {
            throw new RemoteException("no service for getLicenseDetail call");
        }
        return zzt.zze(str);
    }

    public final synchronized List zzs(List list) throws RemoteException {
        zza zzt;
        zzt = zzt();
        if (zzt != null) {
        } else {
            throw new RemoteException("no service for getLicenseDetail call");
        }
        return zzt.zzf(list);
    }
}
