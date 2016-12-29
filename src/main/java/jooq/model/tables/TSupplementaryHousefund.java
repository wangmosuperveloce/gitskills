/**
 * This class is generated by jOOQ
 */
package jooq.model.tables;

/**
 * This class is generated by jOOQ.
 *
 * 薪酬模块 | 公积金补缴表 | 邓刚&王默 | 2016-09-14 | 社保详情页面，用户界面操作
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TSupplementaryHousefund extends org.jooq.impl.TableImpl<jooq.model.tables.records.TSupplementaryHousefundRecord> {

	private static final long serialVersionUID = -1392049337;

	/**
	 * The singleton instance of <code>oa_salary.t_supplementary_housefund</code>
	 */
	public static final jooq.model.tables.TSupplementaryHousefund T_SUPPLEMENTARY_HOUSEFUND = new jooq.model.tables.TSupplementaryHousefund();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<jooq.model.tables.records.TSupplementaryHousefundRecord> getRecordType() {
		return jooq.model.tables.records.TSupplementaryHousefundRecord.class;
	}

	/**
	 * The column <code>oa_salary.t_supplementary_housefund.id</code>.
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TSupplementaryHousefundRecord, org.jooq.types.ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>oa_salary.t_supplementary_housefund.tenant_id</code>. 公司ID | 邓刚&王默 | 2016-09-14 | 账号模块
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TSupplementaryHousefundRecord, java.lang.Long> TENANT_ID = createField("tenant_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "公司ID | 邓刚&王默 | 2016-09-14 | 账号模块");

	/**
	 * The column <code>oa_salary.t_supplementary_housefund.user_id</code>. 用户ID | 邓刚&王默 | 2016-09-14 | 账号模块
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TSupplementaryHousefundRecord, java.lang.Long> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "用户ID | 邓刚&王默 | 2016-09-14 | 账号模块");

	/**
	 * The column <code>oa_salary.t_supplementary_housefund.is_enabled</code>. 是否开启补缴 | 邓刚&王默 | @1-开启 @2-不开启 | 2016-10-20 | 用户界面操作，输入
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TSupplementaryHousefundRecord, java.lang.Byte> IS_ENABLED = createField("is_enabled", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "是否开启补缴 | 邓刚&王默 | @1-开启 @2-不开启 | 2016-10-20 | 用户界面操作，输入");

	/**
	 * The column <code>oa_salary.t_supplementary_housefund.company_housefund</code>. 公司公积金补缴金额 | 邓刚&王默 | 2016-09-14 | 用户界面操作，输入
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TSupplementaryHousefundRecord, java.lang.Long> COMPANY_HOUSEFUND = createField("company_housefund", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "公司公积金补缴金额 | 邓刚&王默 | 2016-09-14 | 用户界面操作，输入");

	/**
	 * The column <code>oa_salary.t_supplementary_housefund.employee_housefund</code>. 个人公积金补缴金额 | 邓刚&王默 | 2016-09-14 | 用户界面操作，输入
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TSupplementaryHousefundRecord, java.lang.Long> EMPLOYEE_HOUSEFUND = createField("employee_housefund", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "个人公积金补缴金额 | 邓刚&王默 | 2016-09-14 | 用户界面操作，输入");

	/**
	 * The column <code>oa_salary.t_supplementary_housefund.describ</code>.
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TSupplementaryHousefundRecord, java.lang.String> DESCRIB = createField("describ", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

	/**
	 * The column <code>oa_salary.t_supplementary_housefund.create_time</code>.
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TSupplementaryHousefundRecord, java.sql.Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>oa_salary.t_supplementary_housefund.update_time</code>.
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TSupplementaryHousefundRecord, java.sql.Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>oa_salary.t_supplementary_housefund</code> table reference
	 */
	public TSupplementaryHousefund() {
		this("t_supplementary_housefund", null);
	}

	/**
	 * Create an aliased <code>oa_salary.t_supplementary_housefund</code> table reference
	 */
	public TSupplementaryHousefund(java.lang.String alias) {
		this(alias, jooq.model.tables.TSupplementaryHousefund.T_SUPPLEMENTARY_HOUSEFUND);
	}

	private TSupplementaryHousefund(java.lang.String alias, org.jooq.Table<jooq.model.tables.records.TSupplementaryHousefundRecord> aliased) {
		this(alias, aliased, null);
	}

	private TSupplementaryHousefund(java.lang.String alias, org.jooq.Table<jooq.model.tables.records.TSupplementaryHousefundRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, jooq.model.OaSalary.OA_SALARY, aliased, parameters, "薪酬模块 | 公积金补缴表 | 邓刚&王默 | 2016-09-14 | 社保详情页面，用户界面操作");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<jooq.model.tables.records.TSupplementaryHousefundRecord, org.jooq.types.ULong> getIdentity() {
		return jooq.model.Keys.IDENTITY_T_SUPPLEMENTARY_HOUSEFUND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<jooq.model.tables.records.TSupplementaryHousefundRecord> getPrimaryKey() {
		return jooq.model.Keys.KEY_T_SUPPLEMENTARY_HOUSEFUND_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<jooq.model.tables.records.TSupplementaryHousefundRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<jooq.model.tables.records.TSupplementaryHousefundRecord>>asList(jooq.model.Keys.KEY_T_SUPPLEMENTARY_HOUSEFUND_PRIMARY, jooq.model.Keys.KEY_T_SUPPLEMENTARY_HOUSEFUND_IDX_PERSON);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public jooq.model.tables.TSupplementaryHousefund as(java.lang.String alias) {
		return new jooq.model.tables.TSupplementaryHousefund(alias, this);
	}

	/**
	 * Rename this table
	 */
	public jooq.model.tables.TSupplementaryHousefund rename(java.lang.String name) {
		return new jooq.model.tables.TSupplementaryHousefund(name, null);
	}
}
