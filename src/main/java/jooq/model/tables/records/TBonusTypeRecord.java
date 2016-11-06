/**
 * This class is generated by jOOQ
 */
package jooq.model.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * 薪酬模块 | 存储各公司自定义的奖金类型 | 王默 | 2016-09-14 | 奖金设置页面，用户界面操作
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBonusTypeRecord extends org.jooq.impl.UpdatableRecordImpl<jooq.model.tables.records.TBonusTypeRecord> implements org.jooq.Record6<org.jooq.types.UInteger, java.lang.Long, java.lang.String, org.jooq.types.UByte, java.sql.Timestamp, java.sql.Timestamp> {

	private static final long serialVersionUID = 660611133;

	/**
	 * Setter for <code>oa_salary.t_bonus_type.id</code>.
	 */
	public void setId(org.jooq.types.UInteger value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>oa_salary.t_bonus_type.id</code>.
	 */
	public org.jooq.types.UInteger getId() {
		return (org.jooq.types.UInteger) getValue(0);
	}

	/**
	 * Setter for <code>oa_salary.t_bonus_type.tenant_id</code>. 公司ID | 王默 | 2016-09-14 | 账号模块
	 */
	public void setTenantId(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>oa_salary.t_bonus_type.tenant_id</code>. 公司ID | 王默 | 2016-09-14 | 账号模块
	 */
	public java.lang.Long getTenantId() {
		return (java.lang.Long) getValue(1);
	}

	/**
	 * Setter for <code>oa_salary.t_bonus_type.bonus_name</code>. 奖金名称 | 王默 | 2016-09-14 | 用户界面操作，输入
	 */
	public void setBonusName(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>oa_salary.t_bonus_type.bonus_name</code>. 奖金名称 | 王默 | 2016-09-14 | 用户界面操作，输入
	 */
	public java.lang.String getBonusName() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>oa_salary.t_bonus_type.cycle</code>. 奖金发放周期 | 王默 | 2016-09-14 | @1:月 @2:季度 @3:年 @4:非周期性发放 | 用户界面操作，select
	 */
	public void setCycle(org.jooq.types.UByte value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>oa_salary.t_bonus_type.cycle</code>. 奖金发放周期 | 王默 | 2016-09-14 | @1:月 @2:季度 @3:年 @4:非周期性发放 | 用户界面操作，select
	 */
	public org.jooq.types.UByte getCycle() {
		return (org.jooq.types.UByte) getValue(3);
	}

	/**
	 * Setter for <code>oa_salary.t_bonus_type.create_time</code>.
	 */
	public void setCreateTime(java.sql.Timestamp value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>oa_salary.t_bonus_type.create_time</code>.
	 */
	public java.sql.Timestamp getCreateTime() {
		return (java.sql.Timestamp) getValue(4);
	}

	/**
	 * Setter for <code>oa_salary.t_bonus_type.update_time</code>.
	 */
	public void setUpdateTime(java.sql.Timestamp value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>oa_salary.t_bonus_type.update_time</code>.
	 */
	public java.sql.Timestamp getUpdateTime() {
		return (java.sql.Timestamp) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<org.jooq.types.UInteger> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<org.jooq.types.UInteger, java.lang.Long, java.lang.String, org.jooq.types.UByte, java.sql.Timestamp, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<org.jooq.types.UInteger, java.lang.Long, java.lang.String, org.jooq.types.UByte, java.sql.Timestamp, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.UInteger> field1() {
		return jooq.model.tables.TBonusType.T_BONUS_TYPE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return jooq.model.tables.TBonusType.T_BONUS_TYPE.TENANT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return jooq.model.tables.TBonusType.T_BONUS_TYPE.BONUS_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.UByte> field4() {
		return jooq.model.tables.TBonusType.T_BONUS_TYPE.CYCLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field5() {
		return jooq.model.tables.TBonusType.T_BONUS_TYPE.CREATE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field6() {
		return jooq.model.tables.TBonusType.T_BONUS_TYPE.UPDATE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.UInteger value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value2() {
		return getTenantId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getBonusName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.UByte value4() {
		return getCycle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value5() {
		return getCreateTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value6() {
		return getUpdateTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBonusTypeRecord value1(org.jooq.types.UInteger value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBonusTypeRecord value2(java.lang.Long value) {
		setTenantId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBonusTypeRecord value3(java.lang.String value) {
		setBonusName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBonusTypeRecord value4(org.jooq.types.UByte value) {
		setCycle(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBonusTypeRecord value5(java.sql.Timestamp value) {
		setCreateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBonusTypeRecord value6(java.sql.Timestamp value) {
		setUpdateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBonusTypeRecord values(org.jooq.types.UInteger value1, java.lang.Long value2, java.lang.String value3, org.jooq.types.UByte value4, java.sql.Timestamp value5, java.sql.Timestamp value6) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TBonusTypeRecord
	 */
	public TBonusTypeRecord() {
		super(jooq.model.tables.TBonusType.T_BONUS_TYPE);
	}

	/**
	 * Create a detached, initialised TBonusTypeRecord
	 */
	public TBonusTypeRecord(org.jooq.types.UInteger id, java.lang.Long tenantId, java.lang.String bonusName, org.jooq.types.UByte cycle, java.sql.Timestamp createTime, java.sql.Timestamp updateTime) {
		super(jooq.model.tables.TBonusType.T_BONUS_TYPE);

		setValue(0, id);
		setValue(1, tenantId);
		setValue(2, bonusName);
		setValue(3, cycle);
		setValue(4, createTime);
		setValue(5, updateTime);
	}
}