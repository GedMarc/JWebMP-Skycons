package com.jwebmp.plugins.skycons.configurator;

import com.jwebmp.core.Page;
import com.jwebmp.core.base.references.JavascriptReference;
import com.jwebmp.core.services.IPageConfigurator;

import javax.validation.constraints.NotNull;

/**
 * Class SkyconPageConfigurator
 * <p>
 * Implementation for Angular-Skycons
 *
 * @author GedMarc
 * @since 2018/08/10
 */
@SuppressWarnings("unused")
public class SkyconPageConfigurator
		implements IPageConfigurator<SkyconPageConfigurator>
{
	/**
	 * Field SkyconJavascriptReference
	 */
	private static final JavascriptReference SkyconJavascriptReference = new JavascriptReference("SkyconBase", 2.02, "bower_components/skycons/skycons.min.js");
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;
	/**
	 * Field colour
	 */
	private static String colour = "black";

	public SkyconPageConfigurator()
	{
		//No Config Required
	}

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return SkyconPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		SkyconPageConfigurator.enabled = mustEnable;
	}

	/**
	 * Method getColour returns the colour of this SkyconPageConfigurator object.
	 *
	 * @return the colour (type String) of this SkyconPageConfigurator object.
	 */
	public static String getColour()
	{
		return SkyconPageConfigurator.colour;
	}

	/**
	 * Method setColour sets the colour of this SkyconPageConfigurator object.
	 *
	 * @param colour
	 * 		the colour of this SkyconPageConfigurator object.
	 */
	public static void setColour(String colour)
	{
		SkyconPageConfigurator.colour = colour;
	}

	/**
	 * Method getSkyconJavascriptReference returns the skyconJavascriptReference of this SkyconPageConfigurator object.
	 *
	 * @return the skyconJavascriptReference (type JavascriptReference) of this SkyconPageConfigurator object.
	 */
	public static JavascriptReference getSkyconJavascriptReference()
	{
		return SkyconPageConfigurator.SkyconJavascriptReference;
	}

	/**
	 * Configures the given page for the parameters
	 *
	 * @param page
	 * 		The page incoming
	 *
	 * @return The original page incoming or a new page, never null
	 */
	@Override
	public @NotNull Page<?> configure(Page<?> page)
	{
		if (!page.isConfigured() && enabled())
		{
			page.addJavaScriptReference(SkyconPageConfigurator.SkyconJavascriptReference);
			page.addVariable("skycons");
			page.addFeature(new SkyconSetupFeature());
		}

		return page;
	}

	@Override
	public boolean enabled()
	{
		return SkyconPageConfigurator.enabled;
	}
}
