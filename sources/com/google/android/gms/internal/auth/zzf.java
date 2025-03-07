package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

/* loaded from: classes.dex */
public interface zzf extends IInterface {
    Bundle zzd(String str, Bundle bundle) throws RemoteException;

    Bundle zze(Account account, String str, Bundle bundle) throws RemoteException;

    Bundle zzf(Account account) throws RemoteException;

    Bundle zzg(String str) throws RemoteException;

    AccountChangeEventsResponse zzh(AccountChangeEventsRequest accountChangeEventsRequest) throws RemoteException;
}
