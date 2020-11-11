package com.jwebmp.plugins.skycons;

import com.jwebmp.core.base.html.Canvas;
import com.jwebmp.plugins.skycons.configurator.SkyconStartFeature;

import jakarta.validation.constraints.NotNull;

public class Skycon<J extends Skycon<J>>
		extends Canvas<J>
{
	private SkyIcon icon;
	private SkyconFeature feature;
	private SkyconStartFeature startFeature;

	public Skycon(@NotNull String id, int widthHeight, SkyIcon skycon)
	{
		setID(id);
		addAttribute("width", Integer.toString(widthHeight));
		addAttribute("height", Integer.toString(widthHeight));
		this.icon = skycon;
		addFeature(feature = new SkyconFeature(this));
		addFeature(startFeature = new SkyconStartFeature());
	}

	public SkyIcon getIcon()
	{
		return icon;
	}

	@SuppressWarnings("unchecked")
	@NotNull
	public J setIcon(SkyIcon icon)
	{
		this.icon = icon;
		return (J) this;
	}

	@Override
	public SkyconOptions getOptions()
	{
		return feature.getOptions();
	}
}
