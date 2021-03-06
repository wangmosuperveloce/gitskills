/**
 * This class is generated by jOOQ
 */
package jooq.model;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OaSalary extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = 1186711727;

	/**
	 * The singleton instance of <code>oa_salary</code>
	 */
	public static final OaSalary OA_SALARY = new OaSalary();

	/**
	 * No further instances allowed
	 */
	private OaSalary() {
		super("oa_salary");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final java.util.List<org.jooq.Table<?>> getTables0() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			jooq.model.tables.TAllowanceAdapted.T_ALLOWANCE_ADAPTED,
			jooq.model.tables.TAllowancePlan.T_ALLOWANCE_PLAN,
			jooq.model.tables.TAttendanceData.T_ATTENDANCE_DATA,
			jooq.model.tables.TBasicSalary.T_BASIC_SALARY,
			jooq.model.tables.TBasicSalaryAdjustment.T_BASIC_SALARY_ADJUSTMENT,
			jooq.model.tables.TBasicSalaryType.T_BASIC_SALARY_TYPE,
			jooq.model.tables.TBonus.T_BONUS,
			jooq.model.tables.TBonusType.T_BONUS_TYPE,
			jooq.model.tables.TCurrentSalary.T_CURRENT_SALARY,
			jooq.model.tables.THousefundPlan.T_HOUSEFUND_PLAN,
			jooq.model.tables.TInsurancesHousefundConfig.T_INSURANCES_HOUSEFUND_CONFIG,
			jooq.model.tables.TInsurancesPlan.T_INSURANCES_PLAN,
			jooq.model.tables.TInsuranceChangeRecord.T_INSURANCE_CHANGE_RECORD,
			jooq.model.tables.TInsuranceFilingHistory.T_INSURANCE_FILING_HISTORY,
			jooq.model.tables.TLocation.T_LOCATION,
			jooq.model.tables.TSalaryCalculationConfig.T_SALARY_CALCULATION_CONFIG,
			jooq.model.tables.TSalaryConfig.T_SALARY_CONFIG,
			jooq.model.tables.TSupplementaryHousefund.T_SUPPLEMENTARY_HOUSEFUND,
			jooq.model.tables.TSupplementaryInsurances.T_SUPPLEMENTARY_INSURANCES);
	}
}
