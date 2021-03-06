/*******************************************************************************
 * Copyright (c) 2015 Liviu Ionescu.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Liviu Ionescu - initial version
 *     Espressif Systems Ltd — ESP32 support
 *******************************************************************************/

package com.espressif.esp32.debug.gdbjtag.preferences;

import com.espressif.esp32.debug.gdbjtag.PeripheralsColorFactory;
import com.espressif.esp32.debug.gdbjtag.PersistentPreferences;
import com.espressif.esp32.debug.gdbjtag.render.peripheral.PeripheralColumnLabelProvider;

public class ColorWriteOnlyFactory extends PeripheralsColorFactory {

	public ColorWriteOnlyFactory() {
		super(PeripheralColumnLabelProvider.COLOR_WRITEONLY, PersistentPreferences.PERIPHERALS_COLOR_WRITEONLY);
	}
}
