/**
 * This class is generated by jOOQ
 */
package jooq.model.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * 薪酬模块 | 存储上传的考勤数据 | 王默 | 2016-09-14 | excel上传
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TAttendanceDataRecord extends org.jooq.impl.UpdatableRecordImpl<jooq.model.tables.records.TAttendanceDataRecord> implements org.jooq.Record15<org.jooq.types.ULong, java.lang.Long, java.lang.Long, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.sql.Timestamp, java.sql.Timestamp> {

	private static final long serialVersionUID = 2087587186;

	/**
	 * Setter for <code>oa_salary.t_attendance_data.id</code>.
	 */
	public void setId(org.jooq.types.ULong value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>oa_salary.t_attendance_data.id</code>.
	 */
	public org.jooq.types.ULong getId() {
		return (org.jooq.types.ULong) getValue(0);
	}

	/**
	 * Setter for <code>oa_salary.t_attendance_data.tenant_id</code>. 公司ID | 王默 | 2016-09-14 | 账号模块
	 */
	public void setTenantId(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>oa_salary.t_attendance_data.tenant_id</code>. 公司ID | 王默 | 2016-09-14 | 账号模块
	 */
	public java.lang.Long getTenantId() {
		return (java.lang.Long) getValue(1);
	}

	/**
	 * Setter for <code>oa_salary.t_attendance_data.user_id</code>. 用户ID | 王默 | 2016-09-14 | 账号模块
	 */
	public void setUserId(java.lang.Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>oa_salary.t_attendance_data.user_id</code>. 用户ID | 王默 | 2016-09-14 | 账号模块
	 */
	public java.lang.Long getUserId() {
		return (java.lang.Long) getValue(2);
	}

	/**
	 * Setter for <code>oa_salary.t_attendance_data.attendance_days</code>. 实际出勤天数 | 王默 | 2016-09-14 | excel上传
	 */
	public void setAttendanceDays(java.lang.Double value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>oa_salary.t_attendance_data.attendance_days</code>. 实际出勤天数 | 王默 | 2016-09-14 | excel上传
	 */
	public java.lang.Double getAttendanceDays() {
		return (java.lang.Double) getValue(3);
	}

	/**
	 * Setter for <code>oa_salary.t_attendance_data.absenteeism_days</code>. 旷工天数 | 王默 | 2016-09-14 | excel上传
	 */
	public void setAbsenteeismDays(java.lang.Double value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>oa_salary.t_attendance_data.absenteeism_days</code>. 旷工天数 | 王默 | 2016-09-14 | excel上传
	 */
	public java.lang.Double getAbsenteeismDays() {
		return (java.lang.Double) getValue(4);
	}

	/**
	 * Setter for <code>oa_salary.t_attendance_data.annual_leave_days</code>. 年假天数 | 王默 | 2016-09-14 | excel上传
	 */
	public void setAnnualLeaveDays(java.lang.Double value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>oa_salary.t_attendance_data.annual_leave_days</code>. 年假天数 | 王默 | 2016-09-14 | excel上传
	 */
	public java.lang.Double getAnnualLeaveDays() {
		return (java.lang.Double) getValue(5);
	}

	/**
	 * Setter for <code>oa_salary.t_attendance_data.sick_leave_days</code>. 病假天数 | 王默 | 2016-09-14 | excel上传
	 */
	public void setSickLeaveDays(java.lang.Double value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>oa_salary.t_attendance_data.sick_leave_days</code>. 病假天数 | 王默 | 2016-09-14 | excel上传
	 */
	public java.lang.Double getSickLeaveDays() {
		return (java.lang.Double) getValue(6);
	}

	/**
	 * Setter for <code>oa_salary.t_attendance_data.off_leave_days</code>. 调休天数 | 王默 | 2016-09-14 | excel上传
	 */
	public void setOffLeaveDays(java.lang.Double value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>oa_salary.t_attendance_data.off_leave_days</code>. 调休天数 | 王默 | 2016-09-14 | excel上传
	 */
	public java.lang.Double getOffLeaveDays() {
		return (java.lang.Double) getValue(7);
	}

	/**
	 * Setter for <code>oa_salary.t_attendance_data.affair_leave_days</code>. 事假天数 | 王默 | 2016-09-14 | excel上传
	 */
	public void setAffairLeaveDays(java.lang.Double value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>oa_salary.t_attendance_data.affair_leave_days</code>. 事假天数 | 王默 | 2016-09-14 | excel上传
	 */
	public java.lang.Double getAffairLeaveDays() {
		return (java.lang.Double) getValue(8);
	}

	/**
	 * Setter for <code>oa_salary.t_attendance_data.funeral_leave_days</code>. 丧假天数 | 王默 | 2016-09-14 | excel上传
	 */
	public void setFuneralLeaveDays(java.lang.Double value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>oa_salary.t_attendance_data.funeral_leave_days</code>. 丧假天数 | 王默 | 2016-09-14 | excel上传
	 */
	public java.lang.Double getFuneralLeaveDays() {
		return (java.lang.Double) getValue(9);
	}

	/**
	 * Setter for <code>oa_salary.t_attendance_data.marriage_leave_days</code>. 婚假天数 | 王默 | 2016-09-14 | excel上传
	 */
	public void setMarriageLeaveDays(java.lang.Double value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>oa_salary.t_attendance_data.marriage_leave_days</code>. 婚假天数 | 王默 | 2016-09-14 | excel上传
	 */
	public java.lang.Double getMarriageLeaveDays() {
		return (java.lang.Double) getValue(10);
	}

	/**
	 * Setter for <code>oa_salary.t_attendance_data.maternity_leave_days</code>. 产假天数 | 王默 | 2016-09-14 | excel上传
	 */
	public void setMaternityLeaveDays(java.lang.Double value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>oa_salary.t_attendance_data.maternity_leave_days</code>. 产假天数 | 王默 | 2016-09-14 | excel上传
	 */
	public java.lang.Double getMaternityLeaveDays() {
		return (java.lang.Double) getValue(11);
	}

	/**
	 * Setter for <code>oa_salary.t_attendance_data.paternity_leave_days</code>. 陪产假天数 | 王默 | 2016-09-14 | excel上传
	 */
	public void setPaternityLeaveDays(java.lang.Double value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>oa_salary.t_attendance_data.paternity_leave_days</code>. 陪产假天数 | 王默 | 2016-09-14 | excel上传
	 */
	public java.lang.Double getPaternityLeaveDays() {
		return (java.lang.Double) getValue(12);
	}

	/**
	 * Setter for <code>oa_salary.t_attendance_data.create_time</code>.
	 */
	public void setCreateTime(java.sql.Timestamp value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>oa_salary.t_attendance_data.create_time</code>.
	 */
	public java.sql.Timestamp getCreateTime() {
		return (java.sql.Timestamp) getValue(13);
	}

	/**
	 * Setter for <code>oa_salary.t_attendance_data.update_time</code>.
	 */
	public void setUpdateTime(java.sql.Timestamp value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>oa_salary.t_attendance_data.update_time</code>.
	 */
	public java.sql.Timestamp getUpdateTime() {
		return (java.sql.Timestamp) getValue(14);
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
	// Record15 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row15<org.jooq.types.ULong, java.lang.Long, java.lang.Long, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.sql.Timestamp, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row15) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row15<org.jooq.types.ULong, java.lang.Long, java.lang.Long, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.sql.Timestamp, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row15) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field1() {
		return jooq.model.tables.TAttendanceData.T_ATTENDANCE_DATA.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return jooq.model.tables.TAttendanceData.T_ATTENDANCE_DATA.TENANT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field3() {
		return jooq.model.tables.TAttendanceData.T_ATTENDANCE_DATA.USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field4() {
		return jooq.model.tables.TAttendanceData.T_ATTENDANCE_DATA.ATTENDANCE_DAYS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field5() {
		return jooq.model.tables.TAttendanceData.T_ATTENDANCE_DATA.ABSENTEEISM_DAYS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field6() {
		return jooq.model.tables.TAttendanceData.T_ATTENDANCE_DATA.ANNUAL_LEAVE_DAYS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field7() {
		return jooq.model.tables.TAttendanceData.T_ATTENDANCE_DATA.SICK_LEAVE_DAYS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field8() {
		return jooq.model.tables.TAttendanceData.T_ATTENDANCE_DATA.OFF_LEAVE_DAYS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field9() {
		return jooq.model.tables.TAttendanceData.T_ATTENDANCE_DATA.AFFAIR_LEAVE_DAYS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field10() {
		return jooq.model.tables.TAttendanceData.T_ATTENDANCE_DATA.FUNERAL_LEAVE_DAYS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field11() {
		return jooq.model.tables.TAttendanceData.T_ATTENDANCE_DATA.MARRIAGE_LEAVE_DAYS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field12() {
		return jooq.model.tables.TAttendanceData.T_ATTENDANCE_DATA.MATERNITY_LEAVE_DAYS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field13() {
		return jooq.model.tables.TAttendanceData.T_ATTENDANCE_DATA.PATERNITY_LEAVE_DAYS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field14() {
		return jooq.model.tables.TAttendanceData.T_ATTENDANCE_DATA.CREATE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field15() {
		return jooq.model.tables.TAttendanceData.T_ATTENDANCE_DATA.UPDATE_TIME;
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
	public java.lang.Double value4() {
		return getAttendanceDays();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value5() {
		return getAbsenteeismDays();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value6() {
		return getAnnualLeaveDays();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value7() {
		return getSickLeaveDays();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value8() {
		return getOffLeaveDays();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value9() {
		return getAffairLeaveDays();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value10() {
		return getFuneralLeaveDays();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value11() {
		return getMarriageLeaveDays();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value12() {
		return getMaternityLeaveDays();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value13() {
		return getPaternityLeaveDays();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value14() {
		return getCreateTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value15() {
		return getUpdateTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TAttendanceDataRecord value1(org.jooq.types.ULong value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TAttendanceDataRecord value2(java.lang.Long value) {
		setTenantId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TAttendanceDataRecord value3(java.lang.Long value) {
		setUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TAttendanceDataRecord value4(java.lang.Double value) {
		setAttendanceDays(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TAttendanceDataRecord value5(java.lang.Double value) {
		setAbsenteeismDays(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TAttendanceDataRecord value6(java.lang.Double value) {
		setAnnualLeaveDays(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TAttendanceDataRecord value7(java.lang.Double value) {
		setSickLeaveDays(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TAttendanceDataRecord value8(java.lang.Double value) {
		setOffLeaveDays(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TAttendanceDataRecord value9(java.lang.Double value) {
		setAffairLeaveDays(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TAttendanceDataRecord value10(java.lang.Double value) {
		setFuneralLeaveDays(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TAttendanceDataRecord value11(java.lang.Double value) {
		setMarriageLeaveDays(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TAttendanceDataRecord value12(java.lang.Double value) {
		setMaternityLeaveDays(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TAttendanceDataRecord value13(java.lang.Double value) {
		setPaternityLeaveDays(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TAttendanceDataRecord value14(java.sql.Timestamp value) {
		setCreateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TAttendanceDataRecord value15(java.sql.Timestamp value) {
		setUpdateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TAttendanceDataRecord values(org.jooq.types.ULong value1, java.lang.Long value2, java.lang.Long value3, java.lang.Double value4, java.lang.Double value5, java.lang.Double value6, java.lang.Double value7, java.lang.Double value8, java.lang.Double value9, java.lang.Double value10, java.lang.Double value11, java.lang.Double value12, java.lang.Double value13, java.sql.Timestamp value14, java.sql.Timestamp value15) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TAttendanceDataRecord
	 */
	public TAttendanceDataRecord() {
		super(jooq.model.tables.TAttendanceData.T_ATTENDANCE_DATA);
	}

	/**
	 * Create a detached, initialised TAttendanceDataRecord
	 */
	public TAttendanceDataRecord(org.jooq.types.ULong id, java.lang.Long tenantId, java.lang.Long userId, java.lang.Double attendanceDays, java.lang.Double absenteeismDays, java.lang.Double annualLeaveDays, java.lang.Double sickLeaveDays, java.lang.Double offLeaveDays, java.lang.Double affairLeaveDays, java.lang.Double funeralLeaveDays, java.lang.Double marriageLeaveDays, java.lang.Double maternityLeaveDays, java.lang.Double paternityLeaveDays, java.sql.Timestamp createTime, java.sql.Timestamp updateTime) {
		super(jooq.model.tables.TAttendanceData.T_ATTENDANCE_DATA);

		setValue(0, id);
		setValue(1, tenantId);
		setValue(2, userId);
		setValue(3, attendanceDays);
		setValue(4, absenteeismDays);
		setValue(5, annualLeaveDays);
		setValue(6, sickLeaveDays);
		setValue(7, offLeaveDays);
		setValue(8, affairLeaveDays);
		setValue(9, funeralLeaveDays);
		setValue(10, marriageLeaveDays);
		setValue(11, maternityLeaveDays);
		setValue(12, paternityLeaveDays);
		setValue(13, createTime);
		setValue(14, updateTime);
	}
}
