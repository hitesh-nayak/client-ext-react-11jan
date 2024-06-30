/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.custom.object.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the StateObject service. Represents a row in the &quot;customObjService_StateObject&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.liferay.custom.object.service.model.impl.StateObjectModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.liferay.custom.object.service.model.impl.StateObjectImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StateObject
 * @generated
 */
@ProviderType
public interface StateObjectModel extends BaseModel<StateObject> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a state object model instance should use the {@link StateObject} interface instead.
	 */

	/**
	 * Returns the primary key of this state object.
	 *
	 * @return the primary key of this state object
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this state object.
	 *
	 * @param primaryKey the primary key of this state object
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this state object.
	 *
	 * @return the uuid of this state object
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this state object.
	 *
	 * @param uuid the uuid of this state object
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the state ID of this state object.
	 *
	 * @return the state ID of this state object
	 */
	public long getStateId();

	/**
	 * Sets the state ID of this state object.
	 *
	 * @param stateId the state ID of this state object
	 */
	public void setStateId(long stateId);

	/**
	 * Returns the state object def ID of this state object.
	 *
	 * @return the state object def ID of this state object
	 */
	public long getStateObjectDefId();

	/**
	 * Sets the state object def ID of this state object.
	 *
	 * @param stateObjectDefId the state object def ID of this state object
	 */
	public void setStateObjectDefId(long stateObjectDefId);

	/**
	 * Returns the name of this state object.
	 *
	 * @return the name of this state object
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this state object.
	 *
	 * @param name the name of this state object
	 */
	public void setName(String name);

	/**
	 * Returns the pin code of this state object.
	 *
	 * @return the pin code of this state object
	 */
	public long getPinCode();

	/**
	 * Sets the pin code of this state object.
	 *
	 * @param pinCode the pin code of this state object
	 */
	public void setPinCode(long pinCode);

	/**
	 * Returns the ext ref ID of this state object.
	 *
	 * @return the ext ref ID of this state object
	 */
	@AutoEscape
	public String getExtRefId();

	/**
	 * Sets the ext ref ID of this state object.
	 *
	 * @param extRefId the ext ref ID of this state object
	 */
	public void setExtRefId(String extRefId);

	@Override
	public StateObject cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}