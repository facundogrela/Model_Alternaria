/**
 * Project			:	AlternariaModel
 * Organization			:	NIBIO, Ås
 * Department			:	VIPS
 * 
 * Author			:	bhabesh & Tor-Einar Skog
 *
 * 
 * File Name			:	DataMatrix.java
 * Package Name			:	no.nibio.vips.model.alternariamodel
 * Date of creation		:	3 Mar. 2020 8:24:53 am
 * Date of modification :	
 * 
 * Summary			:	
 *
 */
/*
 * 
 * 
 * Copyright (c) 2020-2024 NIBIO <http://www.nibio.no/>. 
 *             
 * This file is part of AlternariaModel.  
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.

 */

package no.nibio.vips.model.alternariamodel;

import no.nibio.vips.util.DateMap;

/**
 *
 * @author bhabesh
 * @author Tor-Einar Skog <tor-einar.skog@nibio.no>
 */
public class DataMatrix extends DateMap{
    public final static String  WET_HOUR                        =   "WH";           //  Leaf wetness 2 m, minutes per hour
    public final static String  LEAF_WETNESS_DURATION           =   "BT";           //  Leaf wetness 2 m, minutes per hour
    public final static String  TEMPERATURE_MEAN                =   "TM";           //  Mean Temperature
    public final static String  DAILY_DISEASE_SEVERITY_VALUE    =   "DSV";          //  Daily Disease Severity Value
    public final static String  DAILY_DISEASE_SEVERITY_VALUE_SUM=   "DSV_SUM";      //  Daily Disease Severity Value
    public final static String  SPRAYING_DATES                  =   "sprayingDates";//  Spraying dates
    public final static String  SPRAYING_DATE                   =   "sprayingDate"; //   Spray Date
    
    public final static String  THRESHOLD_DSV_BASE              =   "THRESHOLD_DSV_BASE"; //   THRESHOLD_DSV_BASE
    public final static String  THRESHOLD_DSV_MAX               =   "thresholdDSVMax"; //   THRESHOLD_DSV_MAX
    public final static String THRESHOLD_DSV_TEMP_MIN           =   "thresholdDSVTempMin";
    
    
    
}
