package my.android.lesson13;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;

public class AndroidOpenGL extends Activity {
	
	CustomGLSurfaceView mGLView = null;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        mGLView = new CustomGLSurfaceView(this);
        //setContentView(mGLView);
        //addContentView(new CameraPreview(this), new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
        //setContentView(R.layout.main);
        setContentView(new CameraPreview(this), new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
        addContentView(new CustomGLSurfaceView(this), new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
        addContentView(new Button(this), new LayoutParams(50, LayoutParams.WRAP_CONTENT));
        
        //mGLView.requestFocus();
        //mGLView.setFocusableInTouchMode(true);

    }

	@Override
	protected void onResume() {
		super.onResume();
		mGLView.onResume();
	}

	@Override
	protected void onPause() {
		super.onPause();
		mGLView.onPause();
	}
}