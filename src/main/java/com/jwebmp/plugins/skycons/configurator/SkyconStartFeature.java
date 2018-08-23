package com.jwebmp.plugins.skycons.configurator;

import com.jwebmp.core.Feature;

import javax.validation.constraints.NotNull;

public class SkyconStartFeature
		extends Feature
{
	public SkyconStartFeature()
	{
		super("StartSkycons");
		setSortOrder(Integer.MIN_VALUE);
	}

	@Override
	public @NotNull Integer getSortOrder()
	{
		return Integer.MAX_VALUE;
	}

	@Override
	protected void assignFunctionsToComponent()
	{
		addQuery("skycons.play();");
	}
}
