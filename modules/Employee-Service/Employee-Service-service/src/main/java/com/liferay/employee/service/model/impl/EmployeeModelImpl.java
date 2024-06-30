/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.employee.service.model.impl;

import com.liferay.employee.service.model.Employee;
import com.liferay.employee.service.model.EmployeeModel;
import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.sql.Blob;
import java.sql.Types;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the Employee service. Represents a row in the &quot;Company_Employee&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>EmployeeModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EmployeeImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeImpl
 * @generated
 */
@JSON(strict = true)
public class EmployeeModelImpl
	extends BaseModelImpl<Employee> implements EmployeeModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a employee model instance should use the <code>Employee</code> interface instead.
	 */
	public static final String TABLE_NAME = "Company_Employee";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"companyEmpId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"empFirstName", Types.VARCHAR}, {"empLastName", Types.VARCHAR},
		{"email", Types.VARCHAR}, {"phone", Types.VARCHAR},
		{"companyName", Types.VARCHAR}, {"profImageId", Types.BIGINT},
		{"createDate", Types.TIMESTAMP}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("companyEmpId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("empFirstName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("empLastName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("email", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("phone", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("companyName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("profImageId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE =
		"create table Company_Employee (uuid_ VARCHAR(75) null,companyEmpId LONG not null primary key,groupId LONG,companyId LONG,empFirstName VARCHAR(75) null,empLastName VARCHAR(75) null,email VARCHAR(75) null,phone VARCHAR(75) null,companyName VARCHAR(75) null,profImageId LONG,createDate DATE null)";

	public static final String TABLE_SQL_DROP = "drop table Company_Employee";

	public static final String ORDER_BY_JPQL =
		" ORDER BY employee.empLastName ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY Company_Employee.empLastName ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long COMPANYEMPID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long COMPANYID_COLUMN_BITMASK = 2L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long COMPANYNAME_COLUMN_BITMASK = 4L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long EMPLASTNAME_COLUMN_BITMASK = 8L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long GROUPID_COLUMN_BITMASK = 16L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long UUID_COLUMN_BITMASK = 32L;

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
	}

	public EmployeeModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _companyEmpId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCompanyEmpId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _companyEmpId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Employee.class;
	}

	@Override
	public String getModelClassName() {
		return Employee.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Employee, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Employee, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Employee, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Employee)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Employee, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Employee, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(Employee)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Employee, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Employee, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map<String, Function<Employee, Object>>
			_attributeGetterFunctions;

		static {
			Map<String, Function<Employee, Object>> attributeGetterFunctions =
				new LinkedHashMap<String, Function<Employee, Object>>();

			attributeGetterFunctions.put("uuid", Employee::getUuid);
			attributeGetterFunctions.put(
				"companyEmpId", Employee::getCompanyEmpId);
			attributeGetterFunctions.put("groupId", Employee::getGroupId);
			attributeGetterFunctions.put("companyId", Employee::getCompanyId);
			attributeGetterFunctions.put(
				"empFirstName", Employee::getEmpFirstName);
			attributeGetterFunctions.put(
				"empLastName", Employee::getEmpLastName);
			attributeGetterFunctions.put("email", Employee::getEmail);
			attributeGetterFunctions.put("phone", Employee::getPhone);
			attributeGetterFunctions.put(
				"companyName", Employee::getCompanyName);
			attributeGetterFunctions.put(
				"profImageId", Employee::getProfImageId);
			attributeGetterFunctions.put("createDate", Employee::getCreateDate);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map<String, BiConsumer<Employee, Object>>
			_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<Employee, ?>> attributeSetterBiConsumers =
				new LinkedHashMap<String, BiConsumer<Employee, ?>>();

			attributeSetterBiConsumers.put(
				"uuid", (BiConsumer<Employee, String>)Employee::setUuid);
			attributeSetterBiConsumers.put(
				"companyEmpId",
				(BiConsumer<Employee, Long>)Employee::setCompanyEmpId);
			attributeSetterBiConsumers.put(
				"groupId", (BiConsumer<Employee, Long>)Employee::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<Employee, Long>)Employee::setCompanyId);
			attributeSetterBiConsumers.put(
				"empFirstName",
				(BiConsumer<Employee, String>)Employee::setEmpFirstName);
			attributeSetterBiConsumers.put(
				"empLastName",
				(BiConsumer<Employee, String>)Employee::setEmpLastName);
			attributeSetterBiConsumers.put(
				"email", (BiConsumer<Employee, String>)Employee::setEmail);
			attributeSetterBiConsumers.put(
				"phone", (BiConsumer<Employee, String>)Employee::setPhone);
			attributeSetterBiConsumers.put(
				"companyName",
				(BiConsumer<Employee, String>)Employee::setCompanyName);
			attributeSetterBiConsumers.put(
				"profImageId",
				(BiConsumer<Employee, Long>)Employee::setProfImageId);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<Employee, Date>)Employee::setCreateDate);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_uuid = uuid;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalUuid() {
		return getColumnOriginalValue("uuid_");
	}

	@JSON
	@Override
	public long getCompanyEmpId() {
		return _companyEmpId;
	}

	@Override
	public void setCompanyEmpId(long companyEmpId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_companyEmpId = companyEmpId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalCompanyEmpId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("companyEmpId"));
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_groupId = groupId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalGroupId() {
		return GetterUtil.getLong(this.<Long>getColumnOriginalValue("groupId"));
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_companyId = companyId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalCompanyId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("companyId"));
	}

	@JSON
	@Override
	public String getEmpFirstName() {
		if (_empFirstName == null) {
			return "";
		}
		else {
			return _empFirstName;
		}
	}

	@Override
	public void setEmpFirstName(String empFirstName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_empFirstName = empFirstName;
	}

	@JSON
	@Override
	public String getEmpLastName() {
		if (_empLastName == null) {
			return "";
		}
		else {
			return _empLastName;
		}
	}

	@Override
	public void setEmpLastName(String empLastName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_empLastName = empLastName;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalEmpLastName() {
		return getColumnOriginalValue("empLastName");
	}

	@JSON
	@Override
	public String getEmail() {
		if (_email == null) {
			return "";
		}
		else {
			return _email;
		}
	}

	@Override
	public void setEmail(String email) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_email = email;
	}

	@JSON
	@Override
	public String getPhone() {
		if (_phone == null) {
			return "";
		}
		else {
			return _phone;
		}
	}

	@Override
	public void setPhone(String phone) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_phone = phone;
	}

	@JSON
	@Override
	public String getCompanyName() {
		if (_companyName == null) {
			return "";
		}
		else {
			return _companyName;
		}
	}

	@Override
	public void setCompanyName(String companyName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_companyName = companyName;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalCompanyName() {
		return getColumnOriginalValue("companyName");
	}

	@JSON
	@Override
	public long getProfImageId() {
		return _profImageId;
	}

	@Override
	public void setProfImageId(long profImageId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_profImageId = profImageId;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_createDate = createDate;
	}

	public long getColumnBitmask() {
		if (_columnBitmask > 0) {
			return _columnBitmask;
		}

		if ((_columnOriginalValues == null) ||
			(_columnOriginalValues == Collections.EMPTY_MAP)) {

			return 0;
		}

		for (Map.Entry<String, Object> entry :
				_columnOriginalValues.entrySet()) {

			if (!Objects.equals(
					entry.getValue(), getColumnValue(entry.getKey()))) {

				_columnBitmask |= _columnBitmasks.get(entry.getKey());
			}
		}

		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), Employee.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Employee toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Employee>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		EmployeeImpl employeeImpl = new EmployeeImpl();

		employeeImpl.setUuid(getUuid());
		employeeImpl.setCompanyEmpId(getCompanyEmpId());
		employeeImpl.setGroupId(getGroupId());
		employeeImpl.setCompanyId(getCompanyId());
		employeeImpl.setEmpFirstName(getEmpFirstName());
		employeeImpl.setEmpLastName(getEmpLastName());
		employeeImpl.setEmail(getEmail());
		employeeImpl.setPhone(getPhone());
		employeeImpl.setCompanyName(getCompanyName());
		employeeImpl.setProfImageId(getProfImageId());
		employeeImpl.setCreateDate(getCreateDate());

		employeeImpl.resetOriginalValues();

		return employeeImpl;
	}

	@Override
	public Employee cloneWithOriginalValues() {
		EmployeeImpl employeeImpl = new EmployeeImpl();

		employeeImpl.setUuid(this.<String>getColumnOriginalValue("uuid_"));
		employeeImpl.setCompanyEmpId(
			this.<Long>getColumnOriginalValue("companyEmpId"));
		employeeImpl.setGroupId(this.<Long>getColumnOriginalValue("groupId"));
		employeeImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		employeeImpl.setEmpFirstName(
			this.<String>getColumnOriginalValue("empFirstName"));
		employeeImpl.setEmpLastName(
			this.<String>getColumnOriginalValue("empLastName"));
		employeeImpl.setEmail(this.<String>getColumnOriginalValue("email"));
		employeeImpl.setPhone(this.<String>getColumnOriginalValue("phone"));
		employeeImpl.setCompanyName(
			this.<String>getColumnOriginalValue("companyName"));
		employeeImpl.setProfImageId(
			this.<Long>getColumnOriginalValue("profImageId"));
		employeeImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));

		return employeeImpl;
	}

	@Override
	public int compareTo(Employee employee) {
		int value = 0;

		value = getEmpLastName().compareTo(employee.getEmpLastName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Employee)) {
			return false;
		}

		Employee employee = (Employee)object;

		long primaryKey = employee.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isEntityCacheEnabled() {
		return true;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isFinderCacheEnabled() {
		return true;
	}

	@Override
	public void resetOriginalValues() {
		_columnOriginalValues = Collections.emptyMap();

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<Employee> toCacheModel() {
		EmployeeCacheModel employeeCacheModel = new EmployeeCacheModel();

		employeeCacheModel.uuid = getUuid();

		String uuid = employeeCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			employeeCacheModel.uuid = null;
		}

		employeeCacheModel.companyEmpId = getCompanyEmpId();

		employeeCacheModel.groupId = getGroupId();

		employeeCacheModel.companyId = getCompanyId();

		employeeCacheModel.empFirstName = getEmpFirstName();

		String empFirstName = employeeCacheModel.empFirstName;

		if ((empFirstName != null) && (empFirstName.length() == 0)) {
			employeeCacheModel.empFirstName = null;
		}

		employeeCacheModel.empLastName = getEmpLastName();

		String empLastName = employeeCacheModel.empLastName;

		if ((empLastName != null) && (empLastName.length() == 0)) {
			employeeCacheModel.empLastName = null;
		}

		employeeCacheModel.email = getEmail();

		String email = employeeCacheModel.email;

		if ((email != null) && (email.length() == 0)) {
			employeeCacheModel.email = null;
		}

		employeeCacheModel.phone = getPhone();

		String phone = employeeCacheModel.phone;

		if ((phone != null) && (phone.length() == 0)) {
			employeeCacheModel.phone = null;
		}

		employeeCacheModel.companyName = getCompanyName();

		String companyName = employeeCacheModel.companyName;

		if ((companyName != null) && (companyName.length() == 0)) {
			employeeCacheModel.companyName = null;
		}

		employeeCacheModel.profImageId = getProfImageId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			employeeCacheModel.createDate = createDate.getTime();
		}
		else {
			employeeCacheModel.createDate = Long.MIN_VALUE;
		}

		return employeeCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Employee, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Employee, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Employee, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((Employee)this);

			if (value == null) {
				sb.append("null");
			}
			else if (value instanceof Blob || value instanceof Date ||
					 value instanceof Map || value instanceof String) {

				sb.append(
					"\"" + StringUtil.replace(value.toString(), "\"", "'") +
						"\"");
			}
			else {
				sb.append(value);
			}

			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, Employee>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					Employee.class, ModelWrapper.class);

	}

	private String _uuid;
	private long _companyEmpId;
	private long _groupId;
	private long _companyId;
	private String _empFirstName;
	private String _empLastName;
	private String _email;
	private String _phone;
	private String _companyName;
	private long _profImageId;
	private Date _createDate;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<Employee, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((Employee)this);
	}

	public <T> T getColumnOriginalValue(String columnName) {
		if (_columnOriginalValues == null) {
			return null;
		}

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		return (T)_columnOriginalValues.get(columnName);
	}

	private void _setColumnOriginalValues() {
		_columnOriginalValues = new HashMap<String, Object>();

		_columnOriginalValues.put("uuid_", _uuid);
		_columnOriginalValues.put("companyEmpId", _companyEmpId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("empFirstName", _empFirstName);
		_columnOriginalValues.put("empLastName", _empLastName);
		_columnOriginalValues.put("email", _email);
		_columnOriginalValues.put("phone", _phone);
		_columnOriginalValues.put("companyName", _companyName);
		_columnOriginalValues.put("profImageId", _profImageId);
		_columnOriginalValues.put("createDate", _createDate);
	}

	private static final Map<String, String> _attributeNames;

	static {
		Map<String, String> attributeNames = new HashMap<>();

		attributeNames.put("uuid_", "uuid");

		_attributeNames = Collections.unmodifiableMap(attributeNames);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("uuid_", 1L);

		columnBitmasks.put("companyEmpId", 2L);

		columnBitmasks.put("groupId", 4L);

		columnBitmasks.put("companyId", 8L);

		columnBitmasks.put("empFirstName", 16L);

		columnBitmasks.put("empLastName", 32L);

		columnBitmasks.put("email", 64L);

		columnBitmasks.put("phone", 128L);

		columnBitmasks.put("companyName", 256L);

		columnBitmasks.put("profImageId", 512L);

		columnBitmasks.put("createDate", 1024L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private Employee _escapedModel;

}