package defpackage;

import android.graphics.drawable.Icon;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.quickconn.QuickConnTileService;

/* loaded from: classes2.dex */
public final class be2 extends ji1 implements v31 {
    public final /* synthetic */ QuickConnTileService f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ be2(QuickConnTileService quickConnTileService) {
        super(0);
        this.f = quickConnTileService;
    }

    @Override // defpackage.v31
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Icon invoke() {
        Icon createWithResource;
        createWithResource = Icon.createWithResource(this.f, R.drawable.ic_quick_setting_tile_connected);
        return createWithResource;
    }
}
