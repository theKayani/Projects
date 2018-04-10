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

public abstract class JsonPrimitive extends JsonValue
{
	protected JsonPrimitive()
	{}

	protected JsonPrimitive(boolean mutable)
	{
		super(mutable);
	}

	public final boolean isLong()
	{
		return this instanceof JsonLong;
	}

	public final JsonLong getLong()
	{
		return isLong() ? (JsonLong) this : null;
	}

	public final boolean isDouble()
	{
		return this instanceof JsonDouble;
	}

	public final JsonDouble getDouble()
	{
		return isDouble() ? (JsonDouble) this : null;
	}

	public final boolean isString()
	{
		return this instanceof JsonString;
	}

	public final JsonString getString()
	{
		return isString() ? (JsonString) this : null;
	}

	public final boolean isBoolean()
	{
		return this instanceof JsonBoolean;
	}

	public final JsonBoolean getBoolean()
	{
		return isBoolean() ? (JsonBoolean) this : null;
	}
}
