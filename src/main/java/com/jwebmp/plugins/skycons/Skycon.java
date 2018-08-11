package com.jwebmp.plugins.skycons;

import com.jwebmp.core.base.html.Canvas;

import javax.validation.constraints.NotNull;

public class Skycon<J extends Skycon<J>>
		extends Canvas<J>
{
	private SkyIcon icon;
	private SkyconFeature feature;

	public Skycon(@NotNull String id, int widthHeight, SkyIcon skycon)
	{
		setID(id);
		addAttribute("width", Integer.toString(widthHeight));
		addAttribute("height", Integer.toString(widthHeight));
		this.icon = skycon;
		addFeature(feature = new SkyconFeature(this));
	}

	public SkyIcon getIcon()
	{
		return icon;
	}

	@Override
	public SkyconOptions getOptions()
	{
		return feature.getOptions();
	}

	@SuppressWarnings("unchecked")
	@NotNull
	public J setIcon(SkyIcon icon)
	{
		this.icon = icon;
		return (J) this;
	}
}
