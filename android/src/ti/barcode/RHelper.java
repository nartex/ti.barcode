/**
 * Ti.Barcode Module
 * Copyright (c) 2010-2013 by Appcelerator, Inc. All Rights Reserved.
 * Please see the LICENSE included with this distribution for details.
 */

package ti.barcode;

import org.appcelerator.titanium.util.TiRHelper;
import org.appcelerator.titanium.util.TiRHelper.ResourceNotFoundException;

public class RHelper {

	public static int getString(String str) {
		try {
			return TiRHelper.getApplicationResource("string." + str);
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public static int getLayout(String str) {
		try {
			return TiRHelper.getApplicationResource("layout." + str);
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public static int getId(String str) {
		try {
			return TiRHelper.getApplicationResource("id." + str);
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public static int getDrawable(String str) {
		try {
			return TiRHelper.getApplicationResource("drawable." + str);
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public static int getColor(String str) {
		try {
			return TiRHelper.getApplicationResource("color." + str);
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public static int getRaw(String str) {
		try {
			return TiRHelper.getApplicationResource("raw." + str);
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public static int getXML(String str) {
		try {
			return TiRHelper.getApplicationResource("xml." + str);
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	public static int getMenu(String str) {
		try {
			return TiRHelper.getApplicationResource("menu." + str);
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	public static int getAndroidString(String str) {
		try {
			return TiRHelper.getAndroidResource("string." + str);
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public static int getAndroidLayout(String str) {
		try {
			return TiRHelper.getAndroidResource("layout." + str);
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public static int getAndroidId(String str) {
		try {
			return TiRHelper.getAndroidResource("id." + str);
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public static int getAndroidDrawable(String str) {
		try {
			return TiRHelper.getAndroidResource("drawable." + str);
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public static int getAndroidColor(String str) {
		try {
			return TiRHelper.getAndroidResource("color." + str);
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public static int getAndroidRaw(String str) {
		try {
			return TiRHelper.getAndroidResource("raw." + str);
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public static int getAndroidXML(String str) {
		try {
			return TiRHelper.getAndroidResource("xml." + str);
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	public static int getAndroidMenu(String str) {
		try {
			return TiRHelper.getAndroidResource("menu." + str);
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
			return 0;
		}
	}
}
