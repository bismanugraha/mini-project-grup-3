/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.demogroup3.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.demogroup3.core.constants.Demogroup3CoreConstants;
import org.demogroup3.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class Demogroup3CoreManager extends GeneratedDemogroup3CoreManager
{
	public static final Demogroup3CoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (Demogroup3CoreManager) em.getExtension(Demogroup3CoreConstants.EXTENSIONNAME);
	}
}
