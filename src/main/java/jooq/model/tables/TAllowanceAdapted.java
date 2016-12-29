/**
 * This class is generated by jOOQ
 */
package jooq.model.tables;

/**
 * This class is generated by jOOQ.
 *
 * 薪酬模块 | 存储津贴适用的用户或部分 | 邓刚&王默 | 2016-09-14 | 津贴设置页面，用户界面操作
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TAllowanceAdapted extends org.jooq.impl.TableImpl<jooq.model.tables.records.TAllowanceAdaptedRecord> {

	private static final long serialVersionUID = -2051029446;

	/**
	 * The singleton instance of <code>oa_salary.t_allowance_adapted</code>
	 */
	public static final jooq.model.tables.TAllowanceAdapted T_ALLOWANCE_ADAPTED = new jooq.model.tables.TAllowanceAdapted();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<jooq.model.tables.records.TAllowanceAdaptedRecord> getRecordType() {
		return jooq.model.tables.records.TAllowanceAdaptedRecord.class;
	}

	/**
	 * The column <code>oa_salary.t_allowance_adapted.id</code>.
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TAllowanceAdaptedRecord, org.jooq.types.UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>oa_salary.t_allowance_adapted.tenant_id</code>.
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TAllowanceAdaptedRecord, java.lang.Long> TENANT_ID = createField("tenant_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>oa_salary.t_allowance_adapted.allowance_plan_id</code>. 津贴方案id | 邓刚&王默 | 2016-09-14 | 用户存储津贴设置时候，将其所选部门或员工（多个）存入数据库，t_allowance_plan.id
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TAllowanceAdaptedRecord, org.jooq.types.UInteger> ALLOWANCE_PLAN_ID = createField("allowance_plan_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "津贴方案id | 邓刚&王默 | 2016-09-14 | 用户存储津贴设置时候，将其所选部门或员工（多个）存入数据库，t_allowance_plan.id");

	/**
	 * The column <code>oa_salary.t_allowance_adapted.is_adapt_to_user</code>. 存储的department_or_user_id 是departmentid还是userid | 邓刚&王默 | 2016-09-14 | @1:适用与单个用户 @2:适用于整个部门 | 用户存储津贴设置时候，将其所选部门或员工（多个）存入数据库，此字段来自于后台程序
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TAllowanceAdaptedRecord, org.jooq.types.UByte> IS_ADAPT_TO_USER = createField("is_adapt_to_user", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "存储的department_or_user_id 是departmentid还是userid | 邓刚&王默 | 2016-09-14 | @1:适用与单个用户 @2:适用于整个部门 | 用户存储津贴设置时候，将其所选部门或员工（多个）存入数据库，此字段来自于后台程序");

	/**
	 * The column <code>oa_salary.t_allowance_adapted.department_or_user_id</code>. 部门ID或用户ID | 邓刚&王默 | 2016-09-14 | 用户存储津贴设置时候，将其所选部门或员工（多个）存入数据库，此字段来自于前台用户操作，选择的津贴适用部分
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TAllowanceAdaptedRecord, java.lang.Long> DEPARTMENT_OR_USER_ID = createField("department_or_user_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "部门ID或用户ID | 邓刚&王默 | 2016-09-14 | 用户存储津贴设置时候，将其所选部门或员工（多个）存入数据库，此字段来自于前台用户操作，选择的津贴适用部分");

	/**
	 * The column <code>oa_salary.t_allowance_adapted.create_time</code>.
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TAllowanceAdaptedRecord, java.sql.Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>oa_salary.t_allowance_adapted.update_time</code>.
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TAllowanceAdaptedRecord, java.sql.Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>oa_salary.t_allowance_adapted</code> table reference
	 */
	public TAllowanceAdapted() {
		this("t_allowance_adapted", null);
	}

	/**
	 * Create an aliased <code>oa_salary.t_allowance_adapted</code> table reference
	 */
	public TAllowanceAdapted(java.lang.String alias) {
		this(alias, jooq.model.tables.TAllowanceAdapted.T_ALLOWANCE_ADAPTED);
	}

	private TAllowanceAdapted(java.lang.String alias, org.jooq.Table<jooq.model.tables.records.TAllowanceAdaptedRecord> aliased) {
		this(alias, aliased, null);
	}

	private TAllowanceAdapted(java.lang.String alias, org.jooq.Table<jooq.model.tables.records.TAllowanceAdaptedRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, jooq.model.OaSalary.OA_SALARY, aliased, parameters, "薪酬模块 | 存储津贴适用的用户或部分 | 邓刚&王默 | 2016-09-14 | 津贴设置页面，用户界面操作");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<jooq.model.tables.records.TAllowanceAdaptedRecord, org.jooq.types.UInteger> getIdentity() {
		return jooq.model.Keys.IDENTITY_T_ALLOWANCE_ADAPTED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<jooq.model.tables.records.TAllowanceAdaptedRecord> getPrimaryKey() {
		return jooq.model.Keys.KEY_T_ALLOWANCE_ADAPTED_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<jooq.model.tables.records.TAllowanceAdaptedRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<jooq.model.tables.records.TAllowanceAdaptedRecord>>asList(jooq.model.Keys.KEY_T_ALLOWANCE_ADAPTED_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public jooq.model.tables.TAllowanceAdapted as(java.lang.String alias) {
		return new jooq.model.tables.TAllowanceAdapted(alias, this);
	}

	/**
	 * Rename this table
	 */
	public jooq.model.tables.TAllowanceAdapted rename(java.lang.String name) {
		return new jooq.model.tables.TAllowanceAdapted(name, null);
	}
}
