/**
 * This class is generated by jOOQ
 */
package jooq.model.tables;

/**
 * This class is generated by jOOQ.
 *
 * 薪酬模块 | 存储各个公司自己配置的基本工资项 | 邓刚&王默 | 2016-09-14 | 工资设置页面，用户界面操作
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBasicSalaryType extends org.jooq.impl.TableImpl<jooq.model.tables.records.TBasicSalaryTypeRecord> {

	private static final long serialVersionUID = -1150806735;

	/**
	 * The singleton instance of <code>oa_salary.t_basic_salary_type</code>
	 */
	public static final jooq.model.tables.TBasicSalaryType T_BASIC_SALARY_TYPE = new jooq.model.tables.TBasicSalaryType();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<jooq.model.tables.records.TBasicSalaryTypeRecord> getRecordType() {
		return jooq.model.tables.records.TBasicSalaryTypeRecord.class;
	}

	/**
	 * The column <code>oa_salary.t_basic_salary_type.id</code>.
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TBasicSalaryTypeRecord, org.jooq.types.ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>oa_salary.t_basic_salary_type.tenant_id</code>. 公司ID | 邓刚&王默 | 2016-09-14 | 账号模块
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TBasicSalaryTypeRecord, java.lang.Long> TENANT_ID = createField("tenant_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "公司ID | 邓刚&王默 | 2016-09-14 | 账号模块");

	/**
	 * The column <code>oa_salary.t_basic_salary_type.salary_name</code>. 该基本工资项的名称 | 邓刚&王默 | 2016-09-14 | 用户界面操作，输入
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TBasicSalaryTypeRecord, java.lang.String> SALARY_NAME = createField("salary_name", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this, "该基本工资项的名称 | 邓刚&王默 | 2016-09-14 | 用户界面操作，输入");

	/**
	 * The column <code>oa_salary.t_basic_salary_type.is_participate_overtime</code>. 是否参与计算加班工资 | 邓刚&王默 | 2016-09-14 | @1:参与 @2:不参与 | 用户界面操作，switch按钮
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TBasicSalaryTypeRecord, java.lang.Byte> IS_PARTICIPATE_OVERTIME = createField("is_participate_overtime", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaulted(true), this, "是否参与计算加班工资 | 邓刚&王默 | 2016-09-14 | @1:参与 @2:不参与 | 用户界面操作，switch按钮");

	/**
	 * The column <code>oa_salary.t_basic_salary_type.is_participate_attendance</code>. 是否参与计算缺勤扣款 | 邓刚&王默 | 2016-09-14 | @1：参与 @2：不参与 | 用户界面操作，switch按钮
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TBasicSalaryTypeRecord, java.lang.Byte> IS_PARTICIPATE_ATTENDANCE = createField("is_participate_attendance", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaulted(true), this, "是否参与计算缺勤扣款 | 邓刚&王默 | 2016-09-14 | @1：参与 @2：不参与 | 用户界面操作，switch按钮");

	/**
	 * The column <code>oa_salary.t_basic_salary_type.salary_description</code>. 这项工资的描述 | 邓刚&王默 | 2016-09-14 | 用户界面操作，输入
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TBasicSalaryTypeRecord, java.lang.String> SALARY_DESCRIPTION = createField("salary_description", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false).defaulted(true), this, "这项工资的描述 | 邓刚&王默 | 2016-09-14 | 用户界面操作，输入");

	/**
	 * The column <code>oa_salary.t_basic_salary_type.create_time</code>.
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TBasicSalaryTypeRecord, java.sql.Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>oa_salary.t_basic_salary_type.update_time</code>.
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TBasicSalaryTypeRecord, java.sql.Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>oa_salary.t_basic_salary_type</code> table reference
	 */
	public TBasicSalaryType() {
		this("t_basic_salary_type", null);
	}

	/**
	 * Create an aliased <code>oa_salary.t_basic_salary_type</code> table reference
	 */
	public TBasicSalaryType(java.lang.String alias) {
		this(alias, jooq.model.tables.TBasicSalaryType.T_BASIC_SALARY_TYPE);
	}

	private TBasicSalaryType(java.lang.String alias, org.jooq.Table<jooq.model.tables.records.TBasicSalaryTypeRecord> aliased) {
		this(alias, aliased, null);
	}

	private TBasicSalaryType(java.lang.String alias, org.jooq.Table<jooq.model.tables.records.TBasicSalaryTypeRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, jooq.model.OaSalary.OA_SALARY, aliased, parameters, "薪酬模块 | 存储各个公司自己配置的基本工资项 | 邓刚&王默 | 2016-09-14 | 工资设置页面，用户界面操作");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<jooq.model.tables.records.TBasicSalaryTypeRecord, org.jooq.types.ULong> getIdentity() {
		return jooq.model.Keys.IDENTITY_T_BASIC_SALARY_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<jooq.model.tables.records.TBasicSalaryTypeRecord> getPrimaryKey() {
		return jooq.model.Keys.KEY_T_BASIC_SALARY_TYPE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<jooq.model.tables.records.TBasicSalaryTypeRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<jooq.model.tables.records.TBasicSalaryTypeRecord>>asList(jooq.model.Keys.KEY_T_BASIC_SALARY_TYPE_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public jooq.model.tables.TBasicSalaryType as(java.lang.String alias) {
		return new jooq.model.tables.TBasicSalaryType(alias, this);
	}

	/**
	 * Rename this table
	 */
	public jooq.model.tables.TBasicSalaryType rename(java.lang.String name) {
		return new jooq.model.tables.TBasicSalaryType(name, null);
	}
}
