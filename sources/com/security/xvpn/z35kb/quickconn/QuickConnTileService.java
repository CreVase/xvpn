package com.security.xvpn.z35kb.quickconn;

import a.du;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.service.quicksettings.Tile;
import android.service.quicksettings.TileService;
import com.security.xvpn.z35kb.R;
import defpackage.ae2;
import defpackage.be2;
import defpackage.ew3;
import defpackage.k43;
import defpackage.pd0;
import defpackage.pt3;
import defpackage.rt3;
import defpackage.vf0;

/* loaded from: classes2.dex */
public final class QuickConnTileService extends TileService implements pt3 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f1610b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final k43 f1611a = new k43(new be2(this));

    @Override // defpackage.pt3
    public final void C(String str) {
    }

    public final Icon a() {
        return vf0.d(this.f1611a.getValue());
    }

    public final void b() {
        if (rt3.e().f4214b == 65286) {
            du.d(620, null);
        }
        try {
            try {
                Intent intent = new Intent(this, (Class<?>) QuickConnectService.class);
                intent.putExtra("x-vpn:quick_conn", "x-vpn:quick_conn:tile");
                startService(intent);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            Intent intent2 = new Intent(this, (Class<?>) QuickToggleShortcut.class);
            intent2.putExtra("x-vpn:quick_conn", "x-vpn:quick_conn:tile");
            intent2.addFlags(268435456);
            startActivity(intent2);
        }
    }

    @Override // defpackage.pt3
    public final void c(int i) {
        Tile qsTile;
        qsTile = getQsTile();
        if (qsTile != null) {
            switch (i) {
                case 65281:
                    qsTile.setState(2);
                    qsTile.setLabel(pd0.y(R.string.StatusConnecting));
                    qsTile.setIcon(a());
                    break;
                case 65282:
                case 65284:
                    qsTile.setState(2);
                    qsTile.setLabel(pd0.y(R.string.StatusConnected));
                    qsTile.setIcon(a());
                    break;
                case 65283:
                    qsTile.setState(2);
                    qsTile.setLabel(pd0.y(R.string.StatusReconnecting));
                    qsTile.setIcon(a());
                    break;
                case 65285:
                    qsTile.setState(1);
                    qsTile.setLabel(pd0.y(R.string.StatusDisconnecting));
                    qsTile.setIcon(a());
                    break;
                case 65286:
                    qsTile.setState(1);
                    qsTile.setLabel("X-VPN");
                    qsTile.setIcon(a());
                    break;
            }
            try {
                qsTile.updateTile();
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.service.quicksettings.TileService
    public final void onClick() {
        boolean isLocked;
        isLocked = isLocked();
        if (isLocked) {
            unlockAndRun(new ae2(this, 1));
        } else {
            b();
        }
    }

    @Override // android.service.quicksettings.TileService
    public final void onStartListening() {
        super.onStartListening();
        rt3.e().a(this);
        Tile qsTile = getQsTile();
        int i = 0;
        if (qsTile != null) {
            qsTile.setLabel("Initializing");
            qsTile.setState(0);
            qsTile.updateTile();
        }
        ew3.b0(new ae2(this, i));
    }

    @Override // android.service.quicksettings.TileService
    public final void onStopListening() {
        rt3.e().j(this);
        super.onStopListening();
    }
}
