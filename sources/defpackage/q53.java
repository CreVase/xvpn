package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.browser.TabIndexFragment$onViewCreated$2$layoutManager$1;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class q53 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3959a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3960b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q53(int i, Object obj, Object obj2, Object obj3) {
        this.f3959a = i;
        this.f3960b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ImageView imageView;
        int i = this.f3959a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.f3960b;
        switch (i) {
            case 0:
                o11 o11Var = (o11) obj3;
                o11Var.d.setLayoutManager((TabIndexFragment$onViewCreated$2$layoutManager$1) obj2);
                RecyclerView recyclerView = o11Var.d;
                if (recyclerView.getViewTreeObserver().isAlive()) {
                    recyclerView.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                s53 s53Var = (s53) obj;
                if (!s53Var.g.isEmpty()) {
                    s53Var.D(s53Var.i);
                    return false;
                }
                return false;
            default:
                String str = (String) obj3;
                u53 u53Var = (u53) obj2;
                boolean L = m20.L(str, u53Var.f281a.getTag());
                ImageView imageView2 = u53Var.A;
                if (L) {
                    View view = u53Var.f281a;
                    Context context = view.getContext();
                    ExecutorService executorService = ta1.f4474a;
                    int width = imageView2.getWidth();
                    int height = imageView2.getHeight();
                    z91 z91Var = (z91) obj;
                    ta1.a(context.getApplicationContext());
                    ConcurrentHashMap concurrentHashMap = ta1.f4475b;
                    WeakReference weakReference = (WeakReference) concurrentHashMap.get(str);
                    if (weakReference != null) {
                        imageView = (ImageView) weakReference.get();
                    } else {
                        imageView = null;
                    }
                    if (!m20.L(imageView, imageView2)) {
                        imageView2.setTag(str);
                        zj2 zj2Var = d5.e;
                        if (zj2Var == null) {
                            zj2Var = null;
                        }
                        Bitmap bitmap = (Bitmap) zj2Var.get(str);
                        if (bitmap == null) {
                            concurrentHashMap.put(str, new WeakReference(imageView2));
                            zf3.T(y51.f5272a, null, new sa1(context, str, z91Var, width, height, str, imageView2, null), 3);
                        } else {
                            imageView2.setImageBitmap(bitmap);
                        }
                    }
                    view.setTag(R.id.vTab, str);
                }
                imageView2.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
        }
    }
}
