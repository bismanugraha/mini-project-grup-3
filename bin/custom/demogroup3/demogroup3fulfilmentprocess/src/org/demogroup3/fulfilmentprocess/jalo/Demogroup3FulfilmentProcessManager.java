/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.demogroup3.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.demogroup3.fulfilmentprocess.constants.Demogroup3FulfilmentProcessConstants;

public class Demogroup3FulfilmentProcessManager extends GeneratedDemogroup3FulfilmentProcessManager
{
	public static final Demogroup3FulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (Demogroup3FulfilmentProcessManager) em.getExtension(Demogroup3FulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
