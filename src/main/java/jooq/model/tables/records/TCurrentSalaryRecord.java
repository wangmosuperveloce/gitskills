/**
 * This class is generated by jOOQ
 */
package jooq.model.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * 薪酬模块 | 记录当前最早未归档薪酬 | 邓刚&王默 | 2016-09-26 | 后台逻辑生成
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TCurrentSalaryRecord extends org.jooq.impl.UpdatableRecordImpl<jooq.model.tables.records.TCurrentSalaryRecord> implements org.jooq.Record7<org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.ULong, java.lang.Long, java.lang.String, java.lang.Long> {

	private static final long serialVersionUID = 620420199;

	/**
	 * Setter for <code>oa_salary.t_current_salary.id</code>.
	 */
	public void setId(org.jooq.types.ULong value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>oa_salary.t_current_salary.id</code>.
	 */
	public org.jooq.types.ULong getId() {
		return (org.jooq.types.ULong) getValue(0);
	}

	/**
	 * Setter for <code>oa_salary.t_current_salary.tenant_id</code>. 公司ID | 邓刚&王默 | 2016-09-26 | 账号模块
	 */
	public void setTenantId(org.jooq.types.ULong value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>oa_salary.t_current_salary.tenant_id</code>. 公司ID | 邓刚&王默 | 2016-09-26 | 账号模块
	 */
	public org.jooq.types.ULong getTenantId() {
		return (org.jooq.types.ULong) getValue(1);
	}

	/**
	 * Setter for <code>oa_salary.t_current_salary.user_id</code>. 用户ID | 邓刚&王默 | 2016-09-26 | 账号模块
	 */
	public void setUserId(org.jooq.types.ULong value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>oa_salary.t_current_salary.user_id</code>. 用户ID | 邓刚&王默 | 2016-09-26 | 账号模块
	 */
	public org.jooq.types.ULong getUserId() {
		return (org.jooq.types.ULong) getValue(2);
	}

	/**
	 * Setter for <code>oa_salary.t_current_salary.basic_salary_adjustment_id</code>. 调薪ID | 邓刚&王默 | 2016-09-26 | 薪酬模块调薪表
	 */
	public void setBasicSalaryAdjustmentId(org.jooq.types.ULong value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>oa_salary.t_current_salary.basic_salary_adjustment_id</code>. 调薪ID | 邓刚&王默 | 2016-09-26 | 薪酬模块调薪表
	 */
	public org.jooq.types.ULong getBasicSalaryAdjustmentId() {
		return (org.jooq.types.ULong) getValue(3);
	}

	/**
	 * Setter for <code>oa_salary.t_current_salary.basic_salary_type_id</code>. 基本工资类型ID | 邓刚&王默 | 2016-09-26 | 薪酬模块基本工资类型表
	 */
	public void setBasicSalaryTypeId(java.lang.Long value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>oa_salary.t_current_salary.basic_salary_type_id</code>. 基本工资类型ID | 邓刚&王默 | 2016-09-26 | 薪酬模块基本工资类型表
	 */
	public java.lang.Long getBasicSalaryTypeId() {
		return (java.lang.Long) getValue(4);
	}

	/**
	 * Setter for <code>oa_salary.t_current_salary.basic_salary_type_name</code>. 基本工资名称 | 邓刚&王默 | 2016-09-26 | 薪酬模块基本工资表
	 */
	public void setBasicSalaryTypeName(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>oa_salary.t_current_salary.basic_salary_type_name</code>. 基本工资名称 | 邓刚&王默 | 2016-09-26 | 薪酬模块基本工资表
	 */
	public java.lang.String getBasicSalaryTypeName() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>oa_salary.t_current_salary.how_much</code>. 未归档最早时间 | 邓刚&王默 | 2016-09-26 | 基本工资表
	 */
	public void setHowMuch(java.lang.Long value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>oa_salary.t_current_salary.how_much</code>. 未归档最早时间 | 邓刚&王默 | 2016-09-26 | 基本工资表
	 */
	public java.lang.Long getHowMuch() {
		return (java.lang.Long) getValue(6);
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
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.ULong, java.lang.Long, java.lang.String, java.lang.Long> fieldsRow() {
		return (org.jooq.Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.ULong, java.lang.Long, java.lang.String, java.lang.Long> valuesRow() {
		return (org.jooq.Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field1() {
		return jooq.model.tables.TCurrentSalary.T_CURRENT_SALARY.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field2() {
		return jooq.model.tables.TCurrentSalary.T_CURRENT_SALARY.TENANT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field3() {
		return jooq.model.tables.TCurrentSalary.T_CURRENT_SALARY.USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field4() {
		return jooq.model.tables.TCurrentSalary.T_CURRENT_SALARY.BASIC_SALARY_ADJUSTMENT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field5() {
		return jooq.model.tables.TCurrentSalary.T_CURRENT_SALARY.BASIC_SALARY_TYPE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return jooq.model.tables.TCurrentSalary.T_CURRENT_SALARY.BASIC_SALARY_TYPE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field7() {
		return jooq.model.tables.TCurrentSalary.T_CURRENT_SALARY.HOW_MUCH;
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
	public org.jooq.types.ULong value3() {
		return getUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value4() {
		return getBasicSalaryAdjustmentId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value5() {
		return getBasicSalaryTypeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getBasicSalaryTypeName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value7() {
		return getHowMuch();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TCurrentSalaryRecord value1(org.jooq.types.ULong value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TCurrentSalaryRecord value2(org.jooq.types.ULong value) {
		setTenantId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TCurrentSalaryRecord value3(org.jooq.types.ULong value) {
		setUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TCurrentSalaryRecord value4(org.jooq.types.ULong value) {
		setBasicSalaryAdjustmentId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TCurrentSalaryRecord value5(java.lang.Long value) {
		setBasicSalaryTypeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TCurrentSalaryRecord value6(java.lang.String value) {
		setBasicSalaryTypeName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TCurrentSalaryRecord value7(java.lang.Long value) {
		setHowMuch(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TCurrentSalaryRecord values(org.jooq.types.ULong value1, org.jooq.types.ULong value2, org.jooq.types.ULong value3, org.jooq.types.ULong value4, java.lang.Long value5, java.lang.String value6, java.lang.Long value7) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TCurrentSalaryRecord
	 */
	public TCurrentSalaryRecord() {
		super(jooq.model.tables.TCurrentSalary.T_CURRENT_SALARY);
	}

	/**
	 * Create a detached, initialised TCurrentSalaryRecord
	 */
	public TCurrentSalaryRecord(org.jooq.types.ULong id, org.jooq.types.ULong tenantId, org.jooq.types.ULong userId, org.jooq.types.ULong basicSalaryAdjustmentId, java.lang.Long basicSalaryTypeId, java.lang.String basicSalaryTypeName, java.lang.Long howMuch) {
		super(jooq.model.tables.TCurrentSalary.T_CURRENT_SALARY);

		setValue(0, id);
		setValue(1, tenantId);
		setValue(2, userId);
		setValue(3, basicSalaryAdjustmentId);
		setValue(4, basicSalaryTypeId);
		setValue(5, basicSalaryTypeName);
		setValue(6, howMuch);
	}
}
