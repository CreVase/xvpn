package com.google.android.gms.internal.p000authapi;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public interface zby extends IInterface {
    void zbb(Status status, BeginSignInResult beginSignInResult) throws RemoteException;
}
