/**************************************************************************
 *
 * [2017] Fir3will, All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of "Fir3will" and its suppliers,
 * if any. The intellectual and technical concepts contained
 * herein are proprietary to "Fir3will" and its suppliers
 * and may be covered by U.S. and Foreign Patents, patents
 * in process, and are protected by trade secret or copyright law
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from "Fir3will".
 **************************************************************************/
package com.hk.json;

import java.util.Objects;

public class JsonString extends JsonPrimitive
{
	private String value;

	public JsonString(String value)
	{
		this(value, true);
	}

	public JsonString(boolean mutable)
	{
		this("", mutable);
	}

	public JsonString(String value, boolean mutable)
	{
		super(mutable);
		this.value = value;
	}

	public String getValue()
	{
		return value;
	}

	public JsonString setValue(String value)
	{
		if (!isMutable()) throw isntMutable();
		this.value = value;
		return this;
	}

	@Override
	public String toString(boolean format)
	{
		return "\"" + value + "\"";
	}

	@Override
	public boolean equals(Object o)
	{
		return o instanceof JsonString && value == ((JsonString) o).value;
	}

	@Override
	public int hashCode()
	{
		return Objects.hashCode(value);
	}
}
