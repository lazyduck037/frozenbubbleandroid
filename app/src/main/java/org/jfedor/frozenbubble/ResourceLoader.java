package org.jfedor.frozenbubble;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class ResourceLoader {
    public static Bitmap bubble_font(Resources res, BitmapFactory.Options opts){
        return BitmapFactory.decodeResource(res, R.drawable.bubble_font, opts);
    }
}
