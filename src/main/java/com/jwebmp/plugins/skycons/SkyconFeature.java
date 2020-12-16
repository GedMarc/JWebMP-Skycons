package com.jwebmp.plugins.skycons;

import com.jwebmp.core.Feature;

/**
 * The actual feature for the given component
 */
public class SkyconFeature
		extends Feature<SkyconFeature, SkyconOptions<?>, SkyconFeature>
{

	public SkyconFeature(Skycon<?> component)
	{
		super("SkyconFeature", component);
		setSortOrder(Integer.MAX_VALUE - 100);
	}

	@Override
	protected void assignFunctionsToComponent()
	{
		addQuery("skycons.add(\"" + getComponent().asBase().getID() + "\", '" + getComponent().getIcon() + "');");
	}

	@Override
	public Skycon<?> getComponent()
	{
		return (Skycon<?>) super.getComponent();
	}

	public SkyconFeature setComponent(Skycon<?> component)
	{
		return super.setComponent(component);
	}
}
