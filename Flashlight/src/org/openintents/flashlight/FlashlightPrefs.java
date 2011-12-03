package org.openintents.flashlight;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class FlashlightPrefs extends PreferenceActivity {

	public static final String PREFKEY_SHOULD_SAVE_COLOR = "should_save_color";
	public static final String PREFKEY_SAVED_COLOR = "saved_color";

	public static final String PREFKEY_USE_CAMERA_FLASH = "use_camera_flash";

	public static final boolean DEFAULT_SHOULD_SAVE_COLOR = true;
	public static final boolean DEFAULT_USE_CAMERA_FLASH = false;

	
	// ========================================================================
	@Override
	protected void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		addPreferencesFromResource(R.xml.settings);
	}
	
}