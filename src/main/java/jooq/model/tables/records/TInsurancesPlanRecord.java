/**
 * This class is generated by jOOQ
 */
package jooq.model.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * 薪酬模块 | 社保方案 | 邓刚&王默 | 2016-10-11 | 社保方案配置页
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TInsurancesPlanRecord extends org.jooq.impl.UpdatableRecordImpl<jooq.model.tables.records.TInsurancesPlanRecord> implements org.jooq.Record11<org.jooq.types.ULong, org.jooq.types.ULong, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.sql.Timestamp, java.sql.Timestamp> {

	private static final long serialVersionUID = -1813426468;

	/**
	 * Setter for <code>oa_salary.t_insurances_plan.id</code>.
	 */
	public void setId(org.jooq.types.ULong value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>oa_salary.t_insurances_plan.id</code>.
	 */
	public org.jooq.types.ULong getId() {
		return (org.jooq.types.ULong) getValue(0);
	}

	/**
	 * Setter for <code>oa_salary.t_insurances_plan.tenant_id</code>.
	 */
	public void setTenantId(org.jooq.types.ULong value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>oa_salary.t_insurances_plan.tenant_id</code>.
	 */
	public org.jooq.types.ULong getTenantId() {
		return (org.jooq.types.ULong) getValue(1);
	}

	/**
	 * Setter for <code>oa_salary.t_insurances_plan.name</code>. 社保方案的名字 | 邓刚&王默 | 2016-10-11 | 用户界面操作-输入
	 */
	public void setName(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>oa_salary.t_insurances_plan.name</code>. 社保方案的名字 | 邓刚&王默 | 2016-10-11 | 用户界面操作-输入
	 */
	public java.lang.String getName() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>oa_salary.t_insurances_plan.prov_code</code>. 方案对应地区在redis中的key | 邓刚&王默 | 2016-10-11 | 生成
	 */
	public void setProvCode(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>oa_salary.t_insurances_plan.prov_code</code>. 方案对应地区在redis中的key | 邓刚&王默 | 2016-10-11 | 生成
	 */
	public java.lang.String getProvCode() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>oa_salary.t_insurances_plan.city_code</code>.
	 */
	public void setCityCode(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>oa_salary.t_insurances_plan.city_code</code>.
	 */
	public java.lang.String getCityCode() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>oa_salary.t_insurances_plan.region_name</code>. 区域名字  | 邓刚&王默 | 2016-09-14 | 
	 */
	public void setRegionName(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>oa_salary.t_insurances_plan.region_name</code>. 区域名字  | 邓刚&王默 | 2016-09-14 | 
	 */
	public java.lang.String getRegionName() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>oa_salary.t_insurances_plan.province_name</code>. 省份名字 | 邓刚&王默 | 2016-09-14 | 
	 */
	public void setProvinceName(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>oa_salary.t_insurances_plan.province_name</code>. 省份名字 | 邓刚&王默 | 2016-09-14 | 
	 */
	public java.lang.String getProvinceName() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>oa_salary.t_insurances_plan.city_name</code>. 城市名字 | 邓刚&王默 | 2016-09-14 | 
	 */
	public void setCityName(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>oa_salary.t_insurances_plan.city_name</code>. 城市名字 | 邓刚&王默 | 2016-09-14 | 
	 */
	public java.lang.String getCityName() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>oa_salary.t_insurances_plan.insurance_basefee</code>. 该方案对应的社保基数 | 邓刚&王默 | 2016-10-11 | 用户界面操作-输入
	 */
	public void setInsuranceBasefee(java.lang.Long value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>oa_salary.t_insurances_plan.insurance_basefee</code>. 该方案对应的社保基数 | 邓刚&王默 | 2016-10-11 | 用户界面操作-输入
	 */
	public java.lang.Long getInsuranceBasefee() {
		return (java.lang.Long) getValue(8);
	}

	/**
	 * Setter for <code>oa_salary.t_insurances_plan.create_time</code>.
	 */
	public void setCreateTime(java.sql.Timestamp value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>oa_salary.t_insurances_plan.create_time</code>.
	 */
	public java.sql.Timestamp getCreateTime() {
		return (java.sql.Timestamp) getValue(9);
	}

	/**
	 * Setter for <code>oa_salary.t_insurances_plan.update_time</code>.
	 */
	public void setUpdateTime(java.sql.Timestamp value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>oa_salary.t_insurances_plan.update_time</code>.
	 */
	public java.sql.Timestamp getUpdateTime() {
		return (java.sql.Timestamp) getValue(10);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<org.jooq.types.ULong> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record11 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row11<org.jooq.types.ULong, org.jooq.types.ULong, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.sql.Timestamp, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row11) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row11<org.jooq.types.ULong, org.jooq.types.ULong, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.sql.Timestamp, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row11) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field1() {
		return jooq.model.tables.TInsurancesPlan.T_INSURANCES_PLAN.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field2() {
		return jooq.model.tables.TInsurancesPlan.T_INSURANCES_PLAN.TENANT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return jooq.model.tables.TInsurancesPlan.T_INSURANCES_PLAN.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return jooq.model.tables.TInsurancesPlan.T_INSURANCES_PLAN.PROV_CODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return jooq.model.tables.TInsurancesPlan.T_INSURANCES_PLAN.CITY_CODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return jooq.model.tables.TInsurancesPlan.T_INSURANCES_PLAN.REGION_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return jooq.model.tables.TInsurancesPlan.T_INSURANCES_PLAN.PROVINCE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return jooq.model.tables.TInsurancesPlan.T_INSURANCES_PLAN.CITY_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field9() {
		return jooq.model.tables.TInsurancesPlan.T_INSURANCES_PLAN.INSURANCE_BASEFEE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field10() {
		return jooq.model.tables.TInsurancesPlan.T_INSURANCES_PLAN.CREATE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field11() {
		return jooq.model.tables.TInsurancesPlan.T_INSURANCES_PLAN.UPDATE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value2() {
		return getTenantId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getProvCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getCityCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getRegionName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getProvinceName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getCityName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value9() {
		return getInsuranceBasefee();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value10() {
		return getCreateTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value11() {
		return getUpdateTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TInsurancesPlanRecord value1(org.jooq.types.ULong value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TInsurancesPlanRecord value2(org.jooq.types.ULong value) {
		setTenantId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TInsurancesPlanRecord value3(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TInsurancesPlanRecord value4(java.lang.String value) {
		setProvCode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TInsurancesPlanRecord value5(java.lang.String value) {
		setCityCode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TInsurancesPlanRecord value6(java.lang.String value) {
		setRegionName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TInsurancesPlanRecord value7(java.lang.String value) {
		setProvinceName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TInsurancesPlanRecord value8(java.lang.String value) {
		setCityName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TInsurancesPlanRecord value9(java.lang.Long value) {
		setInsuranceBasefee(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TInsurancesPlanRecord value10(java.sql.Timestamp value) {
		setCreateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TInsurancesPlanRecord value11(java.sql.Timestamp value) {
		setUpdateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TInsurancesPlanRecord values(org.jooq.types.ULong value1, org.jooq.types.ULong value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.lang.String value6, java.lang.String value7, java.lang.String value8, java.lang.Long value9, java.sql.Timestamp value10, java.sql.Timestamp value11) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TInsurancesPlanRecord
	 */
	public TInsurancesPlanRecord() {
		super(jooq.model.tables.TInsurancesPlan.T_INSURANCES_PLAN);
	}

	/**
	 * Create a detached, initialised TInsurancesPlanRecord
	 */
	public TInsurancesPlanRecord(org.jooq.types.ULong id, org.jooq.types.ULong tenantId, java.lang.String name, java.lang.String provCode, java.lang.String cityCode, java.lang.String regionName, java.lang.String provinceName, java.lang.String cityName, java.lang.Long insuranceBasefee, java.sql.Timestamp createTime, java.sql.Timestamp updateTime) {
		super(jooq.model.tables.TInsurancesPlan.T_INSURANCES_PLAN);

		setValue(0, id);
		setValue(1, tenantId);
		setValue(2, name);
		setValue(3, provCode);
		setValue(4, cityCode);
		setValue(5, regionName);
		setValue(6, provinceName);
		setValue(7, cityName);
		setValue(8, insuranceBasefee);
		setValue(9, createTime);
		setValue(10, updateTime);
	}
}
