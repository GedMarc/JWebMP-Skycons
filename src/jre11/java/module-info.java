module com.jwebmp.plugins.skycons {
	exports com.jwebmp.plugins.skycons;
	exports com.jwebmp.plugins.skycons.configurator;

	requires com.jwebmp.core;
	requires java.validation;
	requires com.jwebmp.interception;
	requires com.jwebmp.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.skycons.configurator.SkyconPageConfigurator;

	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.skycons.implementations.SkyconsExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.skycons.implementations.SkyconsExclusionsModule;

	opens com.jwebmp.plugins.skycons.configurator;
	opens com.jwebmp.plugins.skycons to com.jwebmp.core;
}