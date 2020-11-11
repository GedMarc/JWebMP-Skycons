package com.jwebmp.plugins.skycons.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import jakarta.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class SkyconsExclusionsModule
		implements IGuiceScanModuleExclusions<SkyconsExclusionsModule>
{

	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.skycons");
		return strings;
	}
}
