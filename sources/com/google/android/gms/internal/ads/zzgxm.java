package com.google.android.gms.internal.ads;

import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes.dex */
final class zzgxm implements zzgud {
    static final zzgud zza = new zzgxm();

    private zzgxm() {
    }

    @Override // com.google.android.gms.internal.ads.zzgud
    public final boolean zza(int i) {
        if (i != 0 && i != 1 && i != 2 && i != 1999) {
            switch (i) {
                case 1000:
                case 1001:
                case 1002:
                case 1003:
                case 1004:
                case WebSocketProtocol.CLOSE_NO_STATUS_CODE /* 1005 */:
                case 1006:
                case 1007:
                case 1008:
                case 1009:
                case 1010:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
