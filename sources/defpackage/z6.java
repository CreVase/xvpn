package defpackage;

import android.content.Intent;
import androidx.activity.result.ActivityResult;

/* loaded from: classes.dex */
public final class z6 extends x6 {
    @Override // defpackage.x6
    public final Intent a(Object obj) {
        return (Intent) obj;
    }

    @Override // defpackage.x6
    public final Object c(int i, Intent intent) {
        return new ActivityResult(i, intent);
    }
}
