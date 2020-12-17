package com.jwebmp.plugins.skycons;

import com.jwebmp.core.Page;
import com.jwebmp.core.base.html.DivSimple;
import org.junit.jupiter.api.Test;

class SkyconTest
{
	@Test
	void testMe()
	{
		Skycon<?> icon = new Skycon<>("icon1", 60, SkyIcon.Partly_Cloudy_Day);
		System.out.println(icon.toString(0));
		System.out.println(icon.renderJavascript());
	}

	@Test
	void testPage()
	{
		Page<?> p = new Page();
		p.getOptions()
		 .setDynamicRender(false);
		Skycon<?> icon = new Skycon<>("icon1", 60, SkyIcon.Partly_Cloudy_Day);
		p.add(new DivSimple<>().add(icon));

		System.out.println(p.toString(0));
	}
}
