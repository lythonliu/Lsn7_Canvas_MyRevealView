package com.dongnao.lsn7_canvas_myrevealview;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends com.lythonliu.LinkActivity {
	@Override
	public String getAppName(){
		return BuildConfig.APP_NAME;
	}

	private ImageView iv;
	private int[] mImgIds = new int[] { //7个
			R.drawable.avft,
			R.drawable.box_stack,
			R.drawable.bubble_frame,
			R.drawable.bubbles,
			R.drawable.bullseye,
			R.drawable.circle_filled,
			R.drawable.circle_outline,
			
			R.drawable.avft,
			R.drawable.box_stack,
			R.drawable.bubble_frame,
			R.drawable.bubbles,
			R.drawable.bullseye,
			R.drawable.circle_filled,
			R.drawable.circle_outline
			};
	private int[] mImgIds_active = new int[] {
			R.drawable.avft_active, R.drawable.box_stack_active, R.drawable.bubble_frame_active,
			R.drawable.bubbles_active, R.drawable.bullseye_active, R.drawable.circle_filled_active, 
			R.drawable.circle_outline_active,
			R.drawable.avft_active, R.drawable.box_stack_active, R.drawable.bubble_frame_active,
			R.drawable.bubbles_active, R.drawable.bullseye_active, R.drawable.circle_filled_active, 
			R.drawable.circle_outline_active
			};

	public Drawable[] revealDrawables;
	protected int level = 5000;
	private GalleryHorizontalScrollView galleryHorizontalScrollView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initData();
		initView();
		
//		iv = (ImageView)findViewById(R.id.iv);
//		iv.setImageDrawable(revealDrawables[0]);
//		iv.setImageLevel(level);
//		iv.setOnClickListener(new OnClickListener() {
//			@Override
//			public void onClick(View v) {
//				level -= 1000;
//				iv.getDrawable().setLevel(level );
//			}
//		});
		
	}
	

	private void initData(){
		revealDrawables = new Drawable[mImgIds.length];
	}

	private void initView()
	{
		for (int i = 0; i < mImgIds.length; i++)
		{
			RevealDrawable revealDrawable = new RevealDrawable(
					getResources().getDrawable(mImgIds[i]),
					getResources().getDrawable(mImgIds_active[i]), 
					RevealDrawable.HORIZONTAL);
			revealDrawables[i] = revealDrawable;
		}
		galleryHorizontalScrollView = (GalleryHorizontalScrollView)findViewById(R.id.hsv);
		galleryHorizontalScrollView.addImageViews(revealDrawables);
	}
	
}
