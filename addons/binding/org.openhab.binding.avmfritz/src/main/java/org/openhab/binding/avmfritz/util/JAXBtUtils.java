/**
 * Copyright (c) 2010-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.avmfritz.util;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.openhab.binding.avmfritz.internal.ahamodel.DevicelistModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implementation for a static use of JAXBContext as singleton instance.
 * 
 * @author Christoph Weitkamp
 * 
 */
public class JAXBtUtils {

    private static final Logger logger = LoggerFactory.getLogger(JAXBtUtils.class);

    public static final JAXBContext JAXBCONTEXT = initJAXBContext();

    private static JAXBContext initJAXBContext() {
        JAXBContext jaxbContext = null;
        try {
            jaxbContext = JAXBContext.newInstance(DevicelistModel.class);
        } catch (JAXBException e) {
            logger.error("Exception creating JAXBContext: {}", e.getMessage(), e);
            jaxbContext = null;
        }
        return jaxbContext;
    }
}
