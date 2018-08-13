import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.core.services.RenderAfterDynamicScripts;
import com.jwebmp.plugins.skycons.configurator.SkyconPageConfigurator;
import com.jwebmp.plugins.skycons.configurator.SkyconsPlayRenderer;

module com.jwebmp.plugins.skycons {
	exports com.jwebmp.plugins.skycons;
	exports com.jwebmp.plugins.skycons.configurator;

	requires com.jwebmp.core;
	requires java.validation;
	requires com.jwebmp.interception;

	provides IPageConfigurator with SkyconPageConfigurator;
	provides RenderAfterDynamicScripts with SkyconsPlayRenderer;

	opens com.jwebmp.plugins.skycons.configurator;
	opens com.jwebmp.plugins.skycons to com.jwebmp.core;
}
