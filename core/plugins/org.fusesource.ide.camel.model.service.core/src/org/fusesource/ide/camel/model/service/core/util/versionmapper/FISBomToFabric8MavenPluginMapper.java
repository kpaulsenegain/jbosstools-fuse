/*******************************************************************************
 * Copyright (c) 2018 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package org.fusesource.ide.camel.model.service.core.util.versionmapper;

import java.util.Collections;
import java.util.Map;

import org.fusesource.ide.foundation.core.util.OnlineVersionMapper;

public class FISBomToFabric8MavenPluginMapper extends OnlineVersionMapper {
	
	private static final String FISBOM_TOFABRIC8MAVENPLUGIN_MAPPING_FUSE_7_PROPERTY = "org.jboss.tools.fuse.fisbom2fabric8MavenVersion.fuse7.url";
	private static final String FISBOM_TOFABRIC8MAVENPLUGIN_MAPPING_FUSE_7_DEFAULT_URL = BASE_REPO_CONFIG_URI+"fisBomToFabric8MavenPlugin.fuse7.properties";
	
	
	public FISBomToFabric8MavenPluginMapper() {
		super(FISBOM_TOFABRIC8MAVENPLUGIN_MAPPING_FUSE_7_PROPERTY, FISBOM_TOFABRIC8MAVENPLUGIN_MAPPING_FUSE_7_DEFAULT_URL);
	}

	@Override
	protected Map<String, String> createFallbackMapping() {
		return Collections.singletonMap("2.3.7.fuse-000036-redhat-2", "3.5.32.fuse-000040-redhat-2");
	}

}
