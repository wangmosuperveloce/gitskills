/**
 * This class is generated by jOOQ
 */
package jooq.model.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * 薪酬模块 | 存储奖金数据表 | 王默 | 2016-09-14 | 个人薪酬详情页面，用户界面操作，输入
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBonusRecord extends org.jooq.impl.UpdatableRecordImpl<jooq.model.tables.records.TBonusRecord> implements org.jooq.Record7<org.jooq.types.ULong, java.lang.Long, java.lang.Long, org.jooq.types.UInteger, java.lang.Integer, java.sql.Timestamp, java.sql.Timestamp> {

	private static final long serialVersionUID = 344305024;

	/**
	 * Setter for <code>oa_salary.t_bonus.id</code>.
	 */
	public void setId(org.jooq.types.ULong value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>oa_salary.t_bonus.id</code>.
	 */
	public org.jooq.types.ULong getId() {
		return (org.jooq.types.ULong) getValue(0);
	}

	/**
	 * Setter for <code>oa_salary.t_bonus.tenant_id</code>. 公司ID | 王默 | 2016-09-14 | 账号模块
	 */
	public void setTenantId(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>oa_salary.t_bonus.tenant_id</code>. 公司ID | 王默 | 2016-09-14 | 账号模块
	 */
	public java.lang.Long getTenantId() {
		return (java.lang.Long) getValue(1);
	}

	/**
	 * Setter for <code>oa_salary.t_bonus.user_id</code>. 用户ID | 王默 | 2016-09-14 | 账号模块
	 */
	public void setUserId(java.lang.Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>oa_salary.t_bonus.user_id</code>. 用户ID | 王默 | 2016-09-14 | 账号模块
	 */
	public java.lang.Long getUserId() {
		return (java.lang.Long) getValue(2);
	}

	/**
	 * Setter for <code>oa_salary.t_bonus.bonus_type_id</code>. 奖金类型ID | 王默 | 2016-09-14 | t_bonus_type.id
	 */
	public void setBonusTypeId(org.jooq.types.UInteger value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>oa_salary.t_bonus.bonus_type_id</code>. 奖金类型ID | 王默 | 2016-09-14 | t_bonus_type.id
	 */
	public org.jooq.types.UInteger getBonusTypeId() {
		return (org.jooq.types.UInteger) getValue(3);
	}

	/**
	 * Setter for <code>oa_salary.t_bonus.how_much</code>. 奖金数额 | 王默 | 2016-09-14 | 用户界面操作，输入
	 */
	public void setHowMuch(java.lang.Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>oa_salary.t_bonus.how_much</code>. 奖金数额 | 王默 | 2016-09-14 | 用户界面操作，输入
	 */
	public java.lang.Integer getHowMuch() {
		return (java.lang.Integer) getValue(4);
	}

	/**
	 * Setter for <code>oa_salary.t_bonus.create_time</code>.
	 */
	public void setCreateTime(java.sql.Timestamp value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>oa_salary.t_bonus.create_time</code>.
	 */
	public java.sql.Timestamp getCreateTime() {
		return (java.sql.Timestamp) getValue(5);
	}

	/**
	 * Setter for <code>oa_salary.t_bonus.update_time</code>.
	 */
	public void setUpdateTime(java.sql.Timestamp value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>oa_salary.t_bonus.update_time</code>.
	 */
	public java.sql.Timestamp getUpdateTime() {
		return (java.sql.Timestamp) getValue(6);
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
	public org.jooq.Row7<org.jooq.types.ULong, java.lang.Long, java.lang.Long, org.jooq.types.UInteger, java.lang.Integer, java.sql.Timestamp, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<org.jooq.types.ULong, java.lang.Long, java.lang.Long, org.jooq.types.UInteger, java.lang.Integer, java.sql.Timestamp, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field1() {
		return jooq.model.tables.TBonus.T_BONUS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return jooq.model.tables.TBonus.T_BONUS.TENANT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field3() {
		return jooq.model.tables.TBonus.T_BONUS.USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.UInteger> field4() {
		return jooq.model.tables.TBonus.T_BONUS.BONUS_TYPE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return jooq.model.tables.TBonus.T_BONUS.HOW_MUCH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field6() {
		return jooq.model.tables.TBonus.T_BONUS.CREATE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field7() {
		return jooq.model.tables.TBonus.T_BONUS.UPDATE_TIME;
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
	public java.lang.Long value2() {
		return getTenantId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value3() {
		return getUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.UInteger value4() {
		return getBonusTypeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getHowMuch();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value6() {
		return getCreateTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value7() {
		return getUpdateTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBonusRecord value1(org.jooq.types.ULong value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBonusRecord value2(java.lang.Long value) {
		setTenantId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBonusRecord value3(java.lang.Long value) {
		setUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBonusRecord value4(org.jooq.types.UInteger value) {
		setBonusTypeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBonusRecord value5(java.lang.Integer value) {
		setHowMuch(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBonusRecord value6(java.sql.Timestamp value) {
		setCreateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBonusRecord value7(java.sql.Timestamp value) {
		setUpdateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBonusRecord values(org.jooq.types.ULong value1, java.lang.Long value2, java.lang.Long value3, org.jooq.types.UInteger value4, java.lang.Integer value5, java.sql.Timestamp value6, java.sql.Timestamp value7) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TBonusRecord
	 */
	public TBonusRecord() {
		super(jooq.model.tables.TBonus.T_BONUS);
	}

	/**
	 * Create a detached, initialised TBonusRecord
	 */
	public TBonusRecord(org.jooq.types.ULong id, java.lang.Long tenantId, java.lang.Long userId, org.jooq.types.UInteger bonusTypeId, java.lang.Integer howMuch, java.sql.Timestamp createTime, java.sql.Timestamp updateTime) {
		super(jooq.model.tables.TBonus.T_BONUS);

		setValue(0, id);
		setValue(1, tenantId);
		setValue(2, userId);
		setValue(3, bonusTypeId);
		setValue(4, howMuch);
		setValue(5, createTime);
		setValue(6, updateTime);
	}
}