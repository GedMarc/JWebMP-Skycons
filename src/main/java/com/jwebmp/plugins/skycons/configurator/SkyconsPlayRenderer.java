package com.jwebmp.plugins.skycons.configurator;

import com.jwebmp.core.Page;
import com.jwebmp.core.base.html.Script;
import com.jwebmp.core.services.RenderAfterDynamicScripts;

import static com.jwebmp.core.utilities.StaticStrings.*;

public class SkyconsPlayRenderer
		implements RenderAfterDynamicScripts
{
	@Override
	public StringBuilder render(Page<?> p)
	{
		if (!p.isConfigured())
		{
			Script s = new Script();
			s.setText("skycons.play();");
			return new StringBuilder(STRING_TAB + s.toString(0));
		}
		else
		{
			return new StringBuilder();
		}
	}
}
