import com.jwebmp.plugins.skycons.implementations.SkyconInclusionModule;

module com.jwebmp.plugins.skycons {
	exports com.jwebmp.plugins.skycons;
	exports com.jwebmp.plugins.skycons.configurator;

	requires com.jwebmp.core;
	requires jakarta.validation;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.skycons.configurator.SkyconPageConfigurator;

	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.skycons.implementations.SkyconsExclusionsModule;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with SkyconInclusionModule;
	
	opens com.jwebmp.plugins.skycons.configurator;
	opens com.jwebmp.plugins.skycons to com.jwebmp.core;
}
