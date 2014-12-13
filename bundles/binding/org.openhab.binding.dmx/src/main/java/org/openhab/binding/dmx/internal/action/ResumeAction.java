/**
 * Copyright (c) 2010-2014, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.dmx.internal.action;

import org.openhab.binding.dmx.internal.core.DmxChannel;

/**
 * Resume action. Restores previously suspended value or actions on an item.
 * 
 * @author Davy Vanherbergen
 * @since 1.2.0
 */
public class ResumeAction extends BaseAction {

	@Override
	protected int calculateNewValue(DmxChannel channel, long currentTime) {

		channel.resume();
		return channel.getNextValue(currentTime);
	}

}