/**_____________________________________________________________________________
 *
 *                                 OATS - INAF
 *  Osservatorio Astronomico di Tireste - Istituto Nazionale di Astrofisica
 *  Astronomical Observatory of Trieste - National Institute for Astrophysics
 * ____________________________________________________________________________
 *
 * Copyright (C) 20016  Istituto Nazionale di Astrofisica
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software Foundation, Inc., 
 * 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 * _____________________________________________________________________________
 **/

package it.inaf.oats.vospacebackend.utils;

import it.inaf.oats.vospacebackend.exceptions.VOSpaceBackendException;

/**
 *
 * @author bertocco
 */
public class VOSpaceBackendTransferAbortedException extends VOSpaceBackendException {
 
     VOSpaceBackendTransferAbortedException ( String str ) {
	super(str);
    } 
     

    public VOSpaceBackendTransferAbortedException(Throwable cause) {
        super(cause);
    }

    public VOSpaceBackendTransferAbortedException(String message, Throwable cause) {
        super(message, cause);        
    }
     
}
