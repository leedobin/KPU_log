package my.android.lesson13;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.SurfaceHolder;

class CameraPreview extends CameraPreviewBase {

   	public CameraPreview(Context context) {
		super(context);
	}
	
    public CameraPreview(Context context, AttributeSet attrs) {
		super(context, attrs);
	}    

    @Override
    public void surfaceChanged(SurfaceHolder _holder, int format, int width, int height) {
        super.surfaceChanged(_holder, format, width, height);
    }
}