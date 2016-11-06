/**
 * This class is generated by jOOQ
 */
package jooq.model.tables;

/**
 * This class is generated by jOOQ.
 *
 * 薪酬模块 | 记录分摊计税使用 | 王默 | 2016-09-14 | 奖金设置页面，用户界面操作
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBonusApportioned extends org.jooq.impl.TableImpl<jooq.model.tables.records.TBonusApportionedRecord> {

	private static final long serialVersionUID = 410812516;

	/**
	 * The singleton instance of <code>oa_salary.t_bonus_apportioned</code>
	 */
	public static final jooq.model.tables.TBonusApportioned T_BONUS_APPORTIONED = new jooq.model.tables.TBonusApportioned();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<jooq.model.tables.records.TBonusApportionedRecord> getRecordType() {
		return jooq.model.tables.records.TBonusApportionedRecord.class;
	}

	/**
	 * The column <code>oa_salary.t_bonus_apportioned.id</code>.
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TBonusApportionedRecord, org.jooq.types.UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>oa_salary.t_bonus_apportioned.tenant_id</code>. 公司ID | 王默 | 2016-09-14 | 账号模块
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TBonusApportionedRecord, java.lang.Long> TENANT_ID = createField("tenant_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "公司ID | 王默 | 2016-09-14 | 账号模块");

	/**
	 * The column <code>oa_salary.t_bonus_apportioned.year</code>. 年份(每年，每个公司，只能有一种奖金) 王默 | 2016-09-14 | 后台逻辑生成
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TBonusApportionedRecord, java.lang.Short> YEAR = createField("year", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "年份(每年，每个公司，只能有一种奖金) 王默 | 2016-09-14 | 后台逻辑生成");

	/**
	 * The column <code>oa_salary.t_bonus_apportioned.bonus_type_id</code>. 存储分摊计税应用到了哪个奖金类型上 | 王默 | 2016-09-14 | t_bonus_type.id
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TBonusApportionedRecord, org.jooq.types.UInteger> BONUS_TYPE_ID = createField("bonus_type_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "存储分摊计税应用到了哪个奖金类型上 | 王默 | 2016-09-14 | t_bonus_type.id");

	/**
	 * The column <code>oa_salary.t_bonus_apportioned.is_used</code>. 该年份分摊计税是否已经被使用了 | 王默 | 2016-09-14 | @1:未用 @2:已用 | 用户界面操作，checkbox
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TBonusApportionedRecord, org.jooq.types.UByte> IS_USED = createField("is_used", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false).defaulted(true), this, "该年份分摊计税是否已经被使用了 | 王默 | 2016-09-14 | @1:未用 @2:已用 | 用户界面操作，checkbox");

	/**
	 * The column <code>oa_salary.t_bonus_apportioned.used_month</code>. 哪个月使用的(默认值表示未被使用) | 王默 | 2016-09-14 | 后台逻辑生成
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TBonusApportionedRecord, org.jooq.types.UByte> USED_MONTH = createField("used_month", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false).defaulted(true), this, "哪个月使用的(默认值表示未被使用) | 王默 | 2016-09-14 | 后台逻辑生成");

	/**
	 * The column <code>oa_salary.t_bonus_apportioned.create_time</code>.
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TBonusApportionedRecord, java.sql.Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>oa_salary.t_bonus_apportioned.update_time</code>.
	 */
	public final org.jooq.TableField<jooq.model.tables.records.TBonusApportionedRecord, java.sql.Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>oa_salary.t_bonus_apportioned</code> table reference
	 */
	public TBonusApportioned() {
		this("t_bonus_apportioned", null);
	}

	/**
	 * Create an aliased <code>oa_salary.t_bonus_apportioned</code> table reference
	 */
	public TBonusApportioned(java.lang.String alias) {
		this(alias, jooq.model.tables.TBonusApportioned.T_BONUS_APPORTIONED);
	}

	private TBonusApportioned(java.lang.String alias, org.jooq.Table<jooq.model.tables.records.TBonusApportionedRecord> aliased) {
		this(alias, aliased, null);
	}

	private TBonusApportioned(java.lang.String alias, org.jooq.Table<jooq.model.tables.records.TBonusApportionedRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, jooq.model.OaSalary.OA_SALARY, aliased, parameters, "薪酬模块 | 记录分摊计税使用 | 王默 | 2016-09-14 | 奖金设置页面，用户界面操作");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<jooq.model.tables.records.TBonusApportionedRecord, org.jooq.types.UInteger> getIdentity() {
		return jooq.model.Keys.IDENTITY_T_BONUS_APPORTIONED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<jooq.model.tables.records.TBonusApportionedRecord> getPrimaryKey() {
		return jooq.model.Keys.KEY_T_BONUS_APPORTIONED_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<jooq.model.tables.records.TBonusApportionedRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<jooq.model.tables.records.TBonusApportionedRecord>>asList(jooq.model.Keys.KEY_T_BONUS_APPORTIONED_PRIMARY, jooq.model.Keys.KEY_T_BONUS_APPORTIONED_UIND_TENANT_YEAR);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public jooq.model.tables.TBonusApportioned as(java.lang.String alias) {
		return new jooq.model.tables.TBonusApportioned(alias, this);
	}

	/**
	 * Rename this table
	 */
	public jooq.model.tables.TBonusApportioned rename(java.lang.String name) {
		return new jooq.model.tables.TBonusApportioned(name, null);
	}
}