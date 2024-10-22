package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import androidx.fragment.app.l;
import com.security.xvpn.z35kb.AdvancedFeaturesActivity;

/* loaded from: classes.dex */
public final class le implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3107a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3108b;
    public final /* synthetic */ KeyEvent.Callback c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public le(l lVar, Bundle bundle) {
        this.f3107a = 1;
        this.c = lVar;
        this.d = AdvancedFeaturesActivity.class;
        this.e = bundle;
        this.f3108b = 9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3107a;
        int i2 = this.f3108b;
        Object obj = this.d;
        KeyEvent.Callback callback = this.c;
        switch (i) {
            case 0:
                ((TextView) callback).setTypeface((Typeface) obj, i2);
                return;
            default:
                Activity activity = (Activity) callback;
                Intent intent = new Intent(activity, (Class<?>) obj);
                intent.putExtras((Bundle) this.e);
                activity.startActivityForResult(intent, i2);
                return;
        }
    }

    public le(re reVar, TextView textView, Typeface typeface, int i) {
        this.f3107a = 0;
        this.e = reVar;
        this.c = textView;
        this.d = typeface;
        this.f3108b = i;
    }
}
