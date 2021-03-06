/**
 * This class is generated by jOOQ
 */
package jooq.model.tables;

/**
 * This class is generated by jOOQ.
 *
 * 薪酬模块 | 存储调薪记录 | 邓刚&王默 | 2016-09-14 | 调薪页面，用户界面操作
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBasicSalaryAdjustment extends org.jooq.impl.TableImpl<jooq.model.tables.records.TBasicSalaryAdjustmentRecord> {

	private static final long serialVersionUID = 386729498;

	/**
	 * The singleton instance of <code>oa_salary.t_basic_salary_adjustment</code>
	 */
	public static final jooq.model.tables.TBasicSalaryAdjustment T_BASIC_SALARY_ADJUSTMENT = new jooq.model.tables.TBasicSalaryAdjustment();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<jooq.model.tables.records.TBasicSalaryAdjustmentRecord> getRecordType() {
		return jooq.model.tables.records.TBasicSalaryAdjustmentRecord.class;
	}

	/**
	 * The column <code>oa_salary.t_basic_salary_adjustment.id</code>.
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TBasicSalaryAdjustmentRecord, org.jooq.types.ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>oa_salary.t_basic_salary_adjustment.tenant_id</code>. 公司ID | 邓刚&王默 | 2016-09-14 | 账号模块
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TBasicSalaryAdjustmentRecord, java.lang.Long> TENANT_ID = createField("tenant_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "公司ID | 邓刚&王默 | 2016-09-14 | 账号模块");

	/**
	 * The column <code>oa_salary.t_basic_salary_adjustment.user_id</code>. 用户ID | 邓刚&王默 | 2016-09-14 | 账号模块
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TBasicSalaryAdjustmentRecord, java.lang.Long> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "用户ID | 邓刚&王默 | 2016-09-14 | 账号模块");

	/**
	 * The column <code>oa_salary.t_basic_salary_adjustment.taking_effect_time</code>. 调薪生效时间 (default 0 -立即生效) | 邓刚&王默 | 2016-09-14 | 用户界面操作，时间选择控件
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TBasicSalaryAdjustmentRecord, java.lang.Integer> TAKING_EFFECT_TIME = createField("taking_effect_time", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "调薪生效时间 (default 0 -立即生效) | 邓刚&王默 | 2016-09-14 | 用户界面操作，时间选择控件");

	/**
	 * The column <code>oa_salary.t_basic_salary_adjustment.salary_adjustment_reason</code>. 调薪原因 | 邓刚&王默 | 2016-09-14 | 用户界面操作，输入
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TBasicSalaryAdjustmentRecord, java.lang.String> SALARY_ADJUSTMENT_REASON = createField("salary_adjustment_reason", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false).defaulted(true), this, "调薪原因 | 邓刚&王默 | 2016-09-14 | 用户界面操作，输入");

	/**
	 * The column <code>oa_salary.t_basic_salary_adjustment.create_time</code>.
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TBasicSalaryAdjustmentRecord, java.sql.Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>oa_salary.t_basic_salary_adjustment</code> table reference
	 */
	public TBasicSalaryAdjustment() {
		this("t_basic_salary_adjustment", null);
	}

	/**
	 * Create an aliased <code>oa_salary.t_basic_salary_adjustment</code> table reference
	 */
	public TBasicSalaryAdjustment(java.lang.String alias) {
		this(alias, jooq.model.tables.TBasicSalaryAdjustment.T_BASIC_SALARY_ADJUSTMENT);
	}

	private TBasicSalaryAdjustment(java.lang.String alias, org.jooq.Table<jooq.model.tables.records.TBasicSalaryAdjustmentRecord> aliased) {
		this(alias, aliased, null);
	}

	private TBasicSalaryAdjustment(java.lang.String alias, org.jooq.Table<jooq.model.tables.records.TBasicSalaryAdjustmentRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, jooq.model.OaSalary.OA_SALARY, aliased, parameters, "薪酬模块 | 存储调薪记录 | 邓刚&王默 | 2016-09-14 | 调薪页面，用户界面操作");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<jooq.model.tables.records.TBasicSalaryAdjustmentRecord, org.jooq.types.ULong> getIdentity() {
		return jooq.model.Keys.IDENTITY_T_BASIC_SALARY_ADJUSTMENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<jooq.model.tables.records.TBasicSalaryAdjustmentRecord> getPrimaryKey() {
		return jooq.model.Keys.KEY_T_BASIC_SALARY_ADJUSTMENT_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<jooq.model.tables.records.TBasicSalaryAdjustmentRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<jooq.model.tables.records.TBasicSalaryAdjustmentRecord>>asList(jooq.model.Keys.KEY_T_BASIC_SALARY_ADJUSTMENT_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public jooq.model.tables.TBasicSalaryAdjustment as(java.lang.String alias) {
		return new jooq.model.tables.TBasicSalaryAdjustment(alias, this);
	}

	/**
	 * Rename this table
	 */
	public jooq.model.tables.TBasicSalaryAdjustment rename(java.lang.String name) {
		return new jooq.model.tables.TBasicSalaryAdjustment(name, null);
	}
}
