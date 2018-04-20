/**
 * TGAGLViewerActivity.java
 * 
 * Copyright (c) 2014 Kenji Sasaki
 * Released under the MIT license.
 * https://github.com/npedotnet/TGAReader/blob/master/LICENSE
 * 
 * English document
 * https://github.com/npedotnet/TGAReader/blob/master/README.md
 * 
 * Japanese document
 * http://3dtech.jp/wiki/index.php?TGAReader
 * 
 */

package activity;

import android.app.Activity;
import android.os.Bundle;

import surfaceView.TGAGLSurfaceView;

public final class TGAGLViewerActivity extends Activity {
	
	@Override
	public final void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.view = new TGAGLSurfaceView(this);
		this.setContentView(view);
	}
	
	@Override
	public final void onResume() {
		super.onResume();
		view.onResume();
	}
	
	@Override
	public final void onPause() {
		super.onPause();
		this.view.onPause();
	}
	
	private TGAGLSurfaceView view;
}