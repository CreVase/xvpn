package defpackage;

import android.graphics.drawable.LayerDrawable;

/* loaded from: classes.dex */
public abstract class ud {
    public static void a(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i) {
        layerDrawable2.setLayerGravity(i, layerDrawable.getLayerGravity(i));
        layerDrawable2.setLayerWidth(i, layerDrawable.getLayerWidth(i));
        layerDrawable2.setLayerHeight(i, layerDrawable.getLayerHeight(i));
        layerDrawable2.setLayerInsetLeft(i, layerDrawable.getLayerInsetLeft(i));
        layerDrawable2.setLayerInsetRight(i, layerDrawable.getLayerInsetRight(i));
        layerDrawable2.setLayerInsetTop(i, layerDrawable.getLayerInsetTop(i));
        layerDrawable2.setLayerInsetBottom(i, layerDrawable.getLayerInsetBottom(i));
        layerDrawable2.setLayerInsetStart(i, layerDrawable.getLayerInsetStart(i));
        layerDrawable2.setLayerInsetEnd(i, layerDrawable.getLayerInsetEnd(i));
    }
}
