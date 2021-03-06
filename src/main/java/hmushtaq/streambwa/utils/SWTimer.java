/*
 * Copyright (C) 2017 TU Delft, The Netherlands
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Authors: Hamid Mushtaq
 *
 */
package hmushtaq.streambwa.utils;

public class SWTimer 
{
	private long st;
	private long et;
	private long elapsed = 0;

	public void start() 
	{ 
		st = System.nanoTime();
	}
	
	public void stop() 
	{ 
		et = System.nanoTime();
		elapsed += (et - st);
	}
	
	public void reset()				{elapsed = 0;}
	public long getMicroSecs() 		{return elapsed / (long)1e3;}
	public long getMilliSecs() 		{return elapsed / (long)1e6;}
	public long getSecs() 			{return elapsed / (long)1e9;}
	public float getMilliSecsF()	{return elapsed / (float)1e6;}
	public float getSecsF() 		{return elapsed / (float)1e9;}
}
