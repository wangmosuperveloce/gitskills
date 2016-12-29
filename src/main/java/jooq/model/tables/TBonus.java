/**
 * This class is generated by jOOQ
 */
package jooq.model.tables;

/**
 * This class is generated by jOOQ.
 *
 * 薪酬模块 | 存储奖金数据表 | 邓刚&王默 | 2016-09-14 | 个人薪酬详情页面，用户界面操作，输入
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBonus extends org.jooq.impl.TableImpl<jooq.model.tables.records.TBonusRecord> {

	private static final long serialVersionUID = -348578053;

	/**
	 * The singleton instance of <code>oa_salary.t_bonus</code>
	 */
	public static final jooq.model.tables.TBonus T_BONUS = new jooq.model.tables.TBonus();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<jooq.model.tables.records.TBonusRecord> getRecordType() {
		return jooq.model.tables.records.TBonusRecord.class;
	}

	/**
	 * The column <code>oa_salary.t_bonus.id</code>.
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TBonusRecord, org.jooq.types.ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>oa_salary.t_bonus.tenant_id</code>. 公司ID | 邓刚&王默 | 2016-09-14 | 账号模块
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TBonusRecord, java.lang.Long> TENANT_ID = createField("tenant_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "公司ID | 邓刚&王默 | 2016-09-14 | 账号模块");

	/**
	 * The column <code>oa_salary.t_bonus.user_id</code>. 用户ID | 邓刚&王默 | 2016-09-14 | 账号模块
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TBonusRecord, java.lang.Long> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "用户ID | 邓刚&王默 | 2016-09-14 | 账号模块");

	/**
	 * The column <code>oa_salary.t_bonus.bonus_type_id</code>. 奖金类型ID | 邓刚&王默 | 2016-09-14 | t_bonus_type.id
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TBonusRecord, org.jooq.types.UInteger> BONUS_TYPE_ID = createField("bonus_type_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "奖金类型ID | 邓刚&王默 | 2016-09-14 | t_bonus_type.id");

	/**
	 * The column <code>oa_salary.t_bonus.how_much</code>. 奖金数额 | 邓刚&王默 | 2016-09-14 | 用户界面操作，输入
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TBonusRecord, java.lang.Long> HOW_MUCH = createField("how_much", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "奖金数额 | 邓刚&王默 | 2016-09-14 | 用户界面操作，输入");

	/**
	 * The column <code>oa_salary.t_bonus.create_time</code>.
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TBonusRecord, java.sql.Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>oa_salary.t_bonus.update_time</code>.
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TBonusRecord, java.sql.Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>oa_salary.t_bonus</code> table reference
	 */
	public TBonus() {
		this("t_bonus", null);
	}

	/**
	 * Create an aliased <code>oa_salary.t_bonus</code> table reference
	 */
	public TBonus(java.lang.String alias) {
		this(alias, jooq.model.tables.TBonus.T_BONUS);
	}

	private TBonus(java.lang.String alias, org.jooq.Table<jooq.model.tables.records.TBonusRecord> aliased) {
		this(alias, aliased, null);
	}

	private TBonus(java.lang.String alias, org.jooq.Table<jooq.model.tables.records.TBonusRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, jooq.model.OaSalary.OA_SALARY, aliased, parameters, "薪酬模块 | 存储奖金数据表 | 邓刚&王默 | 2016-09-14 | 个人薪酬详情页面，用户界面操作，输入");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<jooq.model.tables.records.TBonusRecord, org.jooq.types.ULong> getIdentity() {
		return jooq.model.Keys.IDENTITY_T_BONUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<jooq.model.tables.records.TBonusRecord> getPrimaryKey() {
		return jooq.model.Keys.KEY_T_BONUS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<jooq.model.tables.records.TBonusRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<jooq.model.tables.records.TBonusRecord>>asList(jooq.model.Keys.KEY_T_BONUS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public jooq.model.tables.TBonus as(java.lang.String alias) {
		return new jooq.model.tables.TBonus(alias, this);
	}

	/**
	 * Rename this table
	 */
	public jooq.model.tables.TBonus rename(java.lang.String name) {
		return new jooq.model.tables.TBonus(name, null);
	}
}
