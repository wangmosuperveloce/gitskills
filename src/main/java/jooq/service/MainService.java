package jooq.service;

import jooq.model.tables.TAllowancePlan;
import org.jooq.*;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import static jooq.model.Tables.T_ALLOWANCE_PLAN;

/**
 * Created by wangmo on 16/9/22.
 */
public class MainService {
    public static void main(String[] args) {
        String userName = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/oa_salary";

        try(Connection conn = DriverManager.getConnection(url, userName, password)) {
            DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
//            Result<Record> result = create.select().from(T_BASIC_SALARY).fetch();
            List<TAllowancePlan> list = new ArrayList<>();
//            for (int i=0; i<20; i++) {
//                create.insertInto(T_ALLOWANCE_PLAN,
//                          T_ALLOWANCE_PLAN.TENANT_ID, T_ALLOWANCE_PLAN.ALLOWANCE_NAME)
//                        .values(12345698765L, ("津贴"+i))
//                        .execute();
//            }
//            if(result.isEmpty()){
//                System.out.println("fetched nothing...");
//            }

            create.delete(T_ALLOWANCE_PLAN).where().execute();


            Result<Record1<String>> result = create.select(T_ALLOWANCE_PLAN.ALLOWANCE_NAME).from(T_ALLOWANCE_PLAN).fetch();
            result.sortAsc((s1,s2)->s1.value1().compareTo(s2.value1()));
            for (Record1 r : result) {
                System.out.println(r.value1());
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
