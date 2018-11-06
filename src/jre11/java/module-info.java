import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.skycons.configurator.SkyconPageConfigurator;
import com.jwebmp.plugins.skycons.implementations.SkyconsExclusionsModule;

module com.jwebmp.plugins.skycons {
	exports com.jwebmp.plugins.skycons;
	exports com.jwebmp.plugins.skycons.configurator;

	requires com.jwebmp.core;
	requires java.validation;
	requires com.jwebmp.interception;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with SkyconPageConfigurator;

	provides IGuiceScanModuleExclusions with SkyconsExclusionsModule;
	provides IGuiceScanJarExclusions with SkyconsExclusionsModule;

	opens com.jwebmp.plugins.skycons.configurator;
	opens com.jwebmp.plugins.skycons to com.jwebmp.core;
}
