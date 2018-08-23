import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.skycons.configurator.SkyconPageConfigurator;

module com.jwebmp.plugins.skycons {
	exports com.jwebmp.plugins.skycons;
	exports com.jwebmp.plugins.skycons.configurator;

	requires com.jwebmp.core;
	requires java.validation;
	requires com.jwebmp.interception;

	provides IPageConfigurator with SkyconPageConfigurator;

	opens com.jwebmp.plugins.skycons.configurator;
	opens com.jwebmp.plugins.skycons to com.jwebmp.core;
}
