package defpackage;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.vungle.ads.VungleError;

/* loaded from: classes.dex */
public class vd {
    public static final int[] c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a, reason: collision with root package name */
    public final ProgressBar f4818a;

    /* renamed from: b, reason: collision with root package name */
    public Bitmap f4819b;

    public vd(ProgressBar progressBar) {
        this.f4818a = progressBar;
    }

    public void a(AttributeSet attributeSet, int i) {
        ProgressBar progressBar = this.f4818a;
        go2 m = go2.m(progressBar.getContext(), attributeSet, c, i);
        Drawable f = m.f(0);
        if (f != null) {
            if (f instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) f;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable b2 = b(animationDrawable.getFrame(i2), true);
                    b2.setLevel(VungleError.DEFAULT);
                    animationDrawable2.addFrame(b2, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(VungleError.DEFAULT);
                f = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(f);
        }
        Drawable f2 = m.f(1);
        if (f2 != null) {
            progressBar.setProgressDrawable(b(f2, false));
        }
        m.o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Drawable b(Drawable drawable, boolean z) {
        boolean z2;
        if (drawable instanceof ct3) {
            dt3 dt3Var = (dt3) ((ct3) drawable);
            Drawable drawable2 = dt3Var.f;
            if (drawable2 != null) {
                dt3Var.b(b(drawable2, z));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    Drawable drawable3 = layerDrawable.getDrawable(i);
                    if (id != 16908301 && id != 16908303) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    drawableArr[i] = b(drawable3, z2);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                    if (Build.VERSION.SDK_INT >= 23) {
                        ud.a(layerDrawable, layerDrawable2, i2);
                    }
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f4819b == null) {
                    this.f4819b = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                if (z) {
                    return new ClipDrawable(shapeDrawable, 3, 1);
                }
                return shapeDrawable;
            }
        }
        return drawable;
    }
}
