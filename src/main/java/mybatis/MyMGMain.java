package mybatis;

import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.name.Names;
import org.mybatis.guice.MyBatisModule;
import org.mybatis.guice.datasource.builtin.PooledDataSourceProvider;
import org.mybatis.guice.datasource.helper.JdbcHelper;

import java.util.Properties;

/**
 * Created by wangmo on 2016/12/29.
 */
public class MyMGMain {

    public static void main(String[] args) {
        Properties myBatisProperties = new Properties();
        myBatisProperties.setProperty("mybatis.environment.id", "test");
        myBatisProperties.setProperty("JDBC.schema", "oa_pay");
        myBatisProperties.setProperty("derby.create", "true");
        myBatisProperties.setProperty("JDBC.username", "root");
        myBatisProperties.setProperty("JDBC.password", "");
        myBatisProperties.setProperty("JDBC.autoCommit", "false");

        Injector injector = Guice.createInjector(
                new MyBatisModule() {

                    @Override
                    protected void initialize() {
                        install(JdbcHelper.HSQLDB_Embedded);

                        bindDataSourceProviderType(PooledDataSourceProvider.class);
//                        bindTransactionFactoryType(JdbcTransactionFactory.class);
//                        addMapperClass(UserMapper.class);

//                        Names.bindProperties(binder, createTestProperties());
//                        bind(FooService.class).to(FooServiceMapperImpl.class);
                    }

                }
        );
    }

}
