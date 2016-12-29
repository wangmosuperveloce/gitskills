/**
 * This class is generated by jOOQ
 */
package jooq.model.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TInsuranceChangeRecordRecord extends org.jooq.impl.UpdatableRecordImpl<jooq.model.tables.records.TInsuranceChangeRecordRecord> implements org.jooq.Record5<org.jooq.types.ULong, java.lang.Long, java.lang.Long, java.lang.String, java.sql.Timestamp> {

	private static final long serialVersionUID = 1555580385;

	/**
	 * Setter for <code>oa_salary.t_insurance_change_record.id</code>.
	 */
	public void setId(org.jooq.types.ULong value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>oa_salary.t_insurance_change_record.id</code>.
	 */
	public org.jooq.types.ULong getId() {
		return (org.jooq.types.ULong) getValue(0);
	}

	/**
	 * Setter for <code>oa_salary.t_insurance_change_record.tenant_id</code>.
	 */
	public void setTenantId(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>oa_salary.t_insurance_change_record.tenant_id</code>.
	 */
	public java.lang.Long getTenantId() {
		return (java.lang.Long) getValue(1);
	}

	/**
	 * Setter for <code>oa_salary.t_insurance_change_record.user_id</code>.
	 */
	public void setUserId(java.lang.Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>oa_salary.t_insurance_change_record.user_id</code>.
	 */
	public java.lang.Long getUserId() {
		return (java.lang.Long) getValue(2);
	}

	/**
	 * Setter for <code>oa_salary.t_insurance_change_record.describ</code>.
	 */
	public void setDescrib(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>oa_salary.t_insurance_change_record.describ</code>.
	 */
	public java.lang.String getDescrib() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>oa_salary.t_insurance_change_record.create_time</code>.
	 */
	public void setCreateTime(java.sql.Timestamp value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>oa_salary.t_insurance_change_record.create_time</code>.
	 */
	public java.sql.Timestamp getCreateTime() {
		return (java.sql.Timestamp) getValue(4);
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
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<org.jooq.types.ULong, java.lang.Long, java.lang.Long, java.lang.String, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<org.jooq.types.ULong, java.lang.Long, java.lang.Long, java.lang.String, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field1() {
		return jooq.model.tables.TInsuranceChangeRecord.T_INSURANCE_CHANGE_RECORD.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return jooq.model.tables.TInsuranceChangeRecord.T_INSURANCE_CHANGE_RECORD.TENANT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field3() {
		return jooq.model.tables.TInsuranceChangeRecord.T_INSURANCE_CHANGE_RECORD.USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return jooq.model.tables.TInsuranceChangeRecord.T_INSURANCE_CHANGE_RECORD.DESCRIB;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field5() {
		return jooq.model.tables.TInsuranceChangeRecord.T_INSURANCE_CHANGE_RECORD.CREATE_TIME;
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
	public java.lang.String value4() {
		return getDescrib();
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
	public TInsuranceChangeRecordRecord value1(org.jooq.types.ULong value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TInsuranceChangeRecordRecord value2(java.lang.Long value) {
		setTenantId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TInsuranceChangeRecordRecord value3(java.lang.Long value) {
		setUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TInsuranceChangeRecordRecord value4(java.lang.String value) {
		setDescrib(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TInsuranceChangeRecordRecord value5(java.sql.Timestamp value) {
		setCreateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TInsuranceChangeRecordRecord values(org.jooq.types.ULong value1, java.lang.Long value2, java.lang.Long value3, java.lang.String value4, java.sql.Timestamp value5) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TInsuranceChangeRecordRecord
	 */
	public TInsuranceChangeRecordRecord() {
		super(jooq.model.tables.TInsuranceChangeRecord.T_INSURANCE_CHANGE_RECORD);
	}

	/**
	 * Create a detached, initialised TInsuranceChangeRecordRecord
	 */
	public TInsuranceChangeRecordRecord(org.jooq.types.ULong id, java.lang.Long tenantId, java.lang.Long userId, java.lang.String describ, java.sql.Timestamp createTime) {
		super(jooq.model.tables.TInsuranceChangeRecord.T_INSURANCE_CHANGE_RECORD);

		setValue(0, id);
		setValue(1, tenantId);
		setValue(2, userId);
		setValue(3, describ);
		setValue(4, createTime);
	}
}