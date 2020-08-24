package com.jwebmp.plugins.skycons;

import static com.guicedee.guicedinjection.json.StaticStrings.CHAR_DASH;
import static com.guicedee.guicedinjection.json.StaticStrings.CHAR_UNDERSCORE;
import static com.jwebmp.core.utilities.StaticStrings.*;

/**
 * The actual icon to display
 */
public enum SkyIcon
{
	Clear_Day,
	Clear_Night,
	Rain,
	Snow,
	Sleet,
	Wind,
	Fog,
	Cloudy,
	Partly_Cloudy_Day,
	Partly_Cloudy_Night,
	;

	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replace(CHAR_UNDERSCORE, CHAR_DASH);
	}
}
